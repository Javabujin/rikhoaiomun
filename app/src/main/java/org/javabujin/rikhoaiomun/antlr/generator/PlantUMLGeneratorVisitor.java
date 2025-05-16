package org.javabujin.rikhoaiomun.antlr.generator;

import org.javabujin.rikhoaiomun.antlr.generated.RikhoaiomunParser;
import org.javabujin.rikhoaiomun.antlr.generated.RikhoaiomunBaseVisitor;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

// PlantUMLGeneratorVisitor traverses the parsed AST and generates PlantUML diagrams for entities and their features.
// It outputs .puml files representing class diagrams, including fields and feature methods.
public class PlantUMLGeneratorVisitor extends RikhoaiomunBaseVisitor<Void> {
    // Output directory for generated PlantUML files
    private final Path outputDir;
    // Current package path (e.g., app/core/auth/login)
    private String currentPackage;
    // Writer for the current output file
    private PrintWriter out;
    // List of extra classes (e.g., DTOs) to be included in the diagram
    private List<String> extraClasses = new ArrayList<>();

    // Initialize with the output directory
    public PlantUMLGeneratorVisitor(Path outputDir) {
        this.outputDir = outputDir;
    }

    // Visit system declaration and set the base package
    @Override
    public Void visitSystemDecl(RikhoaiomunParser.SystemDeclContext ctx) {
        currentPackage = ctx.qualifiedName().getText()
                .toLowerCase().replace('.', '/');
        return null;
    }

    // Visit module declaration and append to the package path
    @Override
    public Void visitModuleDecl(RikhoaiomunParser.ModuleDeclContext ctx) {
        String modulePath = ctx.qualifiedName().getText()
                .toLowerCase().replace('.', '/');
        currentPackage += "/" + modulePath;
        return null;
    }

    // Visit entity declaration and generate a PlantUML class diagram for the entity
    @Override
    public Void visitEntityDecl(RikhoaiomunParser.EntityDeclContext ctx) {
        String raw = ctx.name().getText();
        String className = normalizeClassName(raw);
        Path pkgDir = outputDir.resolve(currentPackage);
        try {
            Files.createDirectories(pkgDir);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path pumlFile = pkgDir.resolve(className + ".puml");
        try {
            out = new PrintWriter(Files.newBufferedWriter(pumlFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.println("@startuml");
        out.printf("class %s {%n", className);
        // Fields
        for (RikhoaiomunParser.FieldDeclContext fctx : ctx.fieldDecl()) {
            String fieldName = fctx.IDENTIFIER().getText();
            String type = fctx.type().getText();
            out.printf("    %s %s%n", type, fieldName);
        }
        out.println();
        // Features (methods)
        super.visitEntityDecl(ctx);
        out.println("}");
        // Output DTOs if any
        for (String dto : extraClasses) {
            out.println(dto);
        }
        extraClasses.clear();
        out.println("@enduml");
        out.close();
        return null;
    }

    // Visit feature declaration and add a method to the class diagram
    @Override
    public Void visitFeatureDecl(RikhoaiomunParser.FeatureDeclContext ctx) {
        String raw = ctx.name().getText();
        String methodName = normalizeMethodName(raw);
        List<String> params = new ArrayList<>();
        if (ctx.inputsDecl() != null) {
            for (var f : ctx.inputsDecl().fieldDecl()) {
                params.add(f.type().getText() + " " + f.IDENTIFIER());
            }
        }
        String paramList = String.join(", ", params);
        String returnType = "void";
        if (ctx.outputsDecl() != null) {
            var outs = ctx.outputsDecl().fieldDecl();
            if (outs.size() == 1) {
                returnType = outs.get(0).type().getText();
            } else if (outs.size() > 1) {
                returnType = normalizeClassName(methodName) + "Result";
                emitOutputDTO(outs, returnType);
            }
        }
        out.printf("    %s %s(%s)%n", returnType, methodName, paramList);
        return null;
    }

    // Emit a DTO class for feature methods with multiple outputs
    private void emitOutputDTO(List<RikhoaiomunParser.FieldDeclContext> outs, String dtoName) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("class %s {%n", dtoName));
        for (var f : outs) {
            sb.append(String.format("    %s %s%n", f.type().getText(), f.IDENTIFIER()));
        }
        sb.append("}\n");
        extraClasses.add(sb.toString());
    }

    // Normalize a raw string to a class name (e.g., "User Account" → "UserAccount")
    private String normalizeClassName(String raw) {
        return Arrays.stream(raw.split("\\s+")).map(w -> Character.toUpperCase(w.charAt(0)) + w.substring(1)).collect(Collectors.joining());
    }

    // Normalize a raw string to a method name (e.g., "Reset Password" → "resetPassword")
    private String normalizeMethodName(String raw) {
        return Arrays.stream(raw.split("\\s+")).map(w -> Character.toLowerCase(w.charAt(0)) + w.substring(1)).collect(Collectors.joining());
    }
}
