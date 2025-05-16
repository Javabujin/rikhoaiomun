package org.javabujin.rikhoaiomun.antlr.generator;

import org.javabujin.rikhoaiomun.antlr.generated.RikhoaiomunParser;
import org.javabujin.rikhoaiomun.antlr.generated.RikhoaiomunParser.EntityDeclContext;
import org.javabujin.rikhoaiomun.antlr.generated.RikhoaiomunBaseVisitor;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

// CodeGeneratorVisitor traverses the parsed AST and generates Java code for entities, modules, and features.
// It outputs Java classes with fields, constructors, getters/setters, and feature methods based on the grammar.
public class CodeGeneratorVisitor extends RikhoaiomunBaseVisitor<Void> {
    // Output directory for generated files
    private final Path outputDir;
    // Current package path (e.g., app/core/auth/login)
    private String currentPackage;
    // Writer for the current output file
    private PrintWriter out;

    // Initialize with the output directory
    public CodeGeneratorVisitor(Path outputDir) {
        this.outputDir = outputDir;
    }

    // Visit system declaration and set the base package
    @Override
    public Void visitSystemDecl(RikhoaiomunParser.SystemDeclContext ctx) {
        // e.g. App.Core → app.core
        currentPackage = ctx.qualifiedName().getText()
                .toLowerCase().replace('.', '/');
        return null; // no actual file yet
    }

    // Visit module declaration and append to the package path
    @Override
    public Void visitModuleDecl(RikhoaiomunParser.ModuleDeclContext ctx) {
        // append module to the package path: Auth.Login → auth/login
        String modulePath = ctx.qualifiedName().getText()
                .toLowerCase().replace('.', '/');
        currentPackage += "/" + modulePath;
        return null;
    }

    // Visit entity declaration and generate a Java class for the entity
    @Override
    public Void visitEntityDecl(RikhoaiomunParser.EntityDeclContext ctx) {
        // 1) Normalize the entity name: "User Account" → "UserAccount"
        String raw = ctx.name().getText();
        String className = normalizeClassName(raw);

        // 2) Open a new file under outputDir/<currentPackage>/
        Path pkgDir = outputDir.resolve(currentPackage);
        try {
            Files.createDirectories(pkgDir);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path javaFile = pkgDir.resolve(className + ".java");
        try {
            out = new PrintWriter(Files.newBufferedWriter(javaFile));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 3) Emit package and class header
        out.printf("package %s;%n%n",
                currentPackage.replace('/', '.'));
        out.printf("public class %s {%n", className);

        // 4) Emit fields
        for (RikhoaiomunParser.FieldDeclContext fctx : ctx.fieldDecl()) {
            String fieldName = fctx.IDENTIFIER().getText();
            String type = fctx.type().getText();
            out.printf("    private %s %s;%n",
                    type, fieldName);
        }
        out.println();

        // 5) Let visitor dive into features inside this entity
        super.visitEntityDecl(ctx);

        // 6) Emit getters and setters
        genGettersAndSetters(ctx);

        // 7) Emit constructors
        genDefaultConstructor(ctx);
        genFullConstructor(ctx);

        // 8) Emit toString() method
        genToString(ctx);

        // 10) Close class
        out.println("}");
        out.close();
        return null;
    }

    // Generate a toString() method for the entity
    private void genToString(EntityDeclContext ctx) {
        out.println("    @Override");
        out.printf("    public String toString() {%n");
        out.printf("        return \"%s{\" +%n", ctx.name().getText());
        for (RikhoaiomunParser.FieldDeclContext fctx : ctx.fieldDecl()) {
            String fieldName = fctx.IDENTIFIER().getText();
            out.printf("                \"%s=\" + %s + \",\" +%n",
                    fieldName, fieldName);
        }
        out.println("                \"}\";");
        out.println("    }");
        out.println();
    }

    // Generate a constructor with all fields as parameters
    private void genFullConstructor(EntityDeclContext ctx) {
        out.printf("    public %s(", ctx.name().getText());
        String params = ctx.fieldDecl().stream()
                .map(fctx -> fctx.type().getText() + " " + fctx.IDENTIFIER())
                .collect(Collectors.joining(", "));
        out.printf("%s) {%n", params);
        for (RikhoaiomunParser.FieldDeclContext fctx : ctx.fieldDecl()) {
            String fieldName = fctx.IDENTIFIER().getText();
            out.printf("        this.%s = %s;%n", fieldName, fieldName);
        }
        out.println("    }");
        out.println();
    }

    // Generate a default constructor initializing fields to default values
    private void genDefaultConstructor(EntityDeclContext ctx) {
        out.println("    public " + ctx.name().getText() + "() {");
        for (RikhoaiomunParser.FieldDeclContext fctx : ctx.fieldDecl()) {
            String fieldName = fctx.IDENTIFIER().getText();
            String type = fctx.type().getText();
            if (type.equals("String")) {
                out.printf("        this.%s = \"\";%n", fieldName);
            } else if (type.equals("int")) {
                out.printf("        this.%s = 0;%n", fieldName);
            } else if (type.equals("boolean")) {
                out.printf("        this.%s = false;%n", fieldName);
            } else {
                out.printf("        this.%s = null;%n", fieldName);
            }
        }
        out.println("    }");
        out.println();
    }

    // Generate getters and setters for all fields
    private void genGettersAndSetters(EntityDeclContext ctx) {
        for (RikhoaiomunParser.FieldDeclContext fctx : ctx.fieldDecl()) {
            String fieldName = fctx.IDENTIFIER().getText();
            String type = fctx.type().getText();
            String methodName = normalizeMethodName(fieldName);

            // Getter
            out.printf("    public %s get%s() {%n",
                    type, Character.toUpperCase(methodName.charAt(0)) + methodName.substring(1));
            out.printf("        return this.%s;%n", fieldName);
            out.println("    }");

            // Setter
            out.printf("    public void set%s(%s %s) {%n",
                    Character.toUpperCase(methodName.charAt(0)) + methodName.substring(1),
                    type, fieldName);
            out.printf("        this.%s = %s;%n", fieldName, fieldName);
            out.println("    }");
        }
    }

    // Visit feature declaration and generate a method stub for the feature
    @Override
    public Void visitFeatureDecl(RikhoaiomunParser.FeatureDeclContext ctx) {
        // Normalize method name: "Reset Password" → "resetPassword"
        String raw = ctx.name().getText(); // second name() is the method name
        String methodName = normalizeMethodName(raw);

        // 1) Handle inputs
        List<String> params = new ArrayList<>();
        if (ctx.inputsDecl() != null) {
            for (var f : ctx.inputsDecl().fieldDecl()) {
                params.add(f.type().getText() + " " + f.IDENTIFIER());
            }
        }
        String paramList = String.join(", ", params);

        // 2) Determine return type (simple case: one output → that type; else void or
        // custom DTO)
        String returnType = "void";
        if (ctx.outputsDecl() != null) {
            var outs = ctx.outputsDecl().fieldDecl();
            if (outs.size() == 1) {
                returnType = outs.get(0).type().getText();
            } else if (outs.size() > 1) {
                // you could generate a nested static class or record here...
                returnType = normalizeClassName(methodName) + "Result";
                emitOutputDTO(outs, returnType);
            }
        }

        // 3) Emit Javadoc from @Comment, if any
        if (ctx.commentDecl() != null) {
            String comment = ctx.commentDecl().MULTILINE_STRING_LITERAL()
                    .getText()
                    .replaceAll("^\"\"\"|\"\"\"$", "");
            out.println("    /**");
            for (var line : comment.split("\\R")) {
                out.printf("     * %s%n", line.trim());
            }
            out.println("     */");
        }

        // 4) Emit method stub
        out.printf("    public %s %s(%s) {%n",
                returnType, methodName, paramList);
        out.println("        // TODO: implement");
        if (!returnType.equals("void")) {
            out.println("        return null;");
        }
        out.println("    }");
        out.println();
        return null;
    }

    // --- helper methods ---
    // Normalize a raw string to a class name (e.g., "User Account" → "UserAccount")
    private String normalizeClassName(String raw) {
        return Arrays.stream(raw.split("\\s+"))
                .map(w -> Character.toUpperCase(w.charAt(0)) + w.substring(1))
                .collect(Collectors.joining());
    }

    // Normalize a raw string to a method name (e.g., "Reset Password" → "resetPassword")
    private String normalizeMethodName(String raw) {
        return Arrays.stream(raw.split("\\s+"))
                .map(w -> Character.toLowerCase(w.charAt(0)) + w.substring(1))
                .collect(Collectors.joining());
    }

    // Emit a static output DTO class for feature methods with multiple outputs
    private void emitOutputDTO(List<RikhoaiomunParser.FieldDeclContext> outs,
            String dtoName) {
        out.printf("    public static class %s {%n", dtoName);
        for (var f : outs) {
            out.printf("        public %s %s;%n",
                    f.type().getText(), f.IDENTIFIER());
        }
        out.println("    }");
        out.println();
    }
}
