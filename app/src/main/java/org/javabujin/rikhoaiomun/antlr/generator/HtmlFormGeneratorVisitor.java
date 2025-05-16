package org.javabujin.rikhoaiomun.antlr.generator;

import org.javabujin.rikhoaiomun.antlr.generated.RikhoaiomunParser;
import org.javabujin.rikhoaiomun.antlr.generated.RikhoaiomunParser.EntityDeclContext;
import org.javabujin.rikhoaiomun.antlr.generated.RikhoaiomunBaseVisitor;

import java.io.*;
import java.nio.file.*;
import java.util.*;

// HtmlFormGeneratorVisitor traverses the parsed AST and generates HTML forms for each entity.
// It outputs a simple HTML form for each entity, mapping fields to appropriate input types.
public class HtmlFormGeneratorVisitor extends RikhoaiomunBaseVisitor<Void> {
    // Output directory for generated HTML files
    private final Path outputDir;
    // Current package path (e.g., app/core/auth/login)
    private String currentPackage;

    // Initialize with the output directory
    public HtmlFormGeneratorVisitor(Path outputDir) {
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

    // Visit entity declaration and generate an HTML form for the entity
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
        Path htmlFile = pkgDir.resolve(className + ".html");
        try (PrintWriter out = new PrintWriter(Files.newBufferedWriter(htmlFile))) {
            out.printf("<!DOCTYPE html>%n<html lang=\"en\">%n<head>%n    <meta charset=\"UTF-8\">%n    <title>%s Form</title>%n</head>%n<body>%n", className);
            out.printf("    <h1>%s Submission Form</h1>%n", className);
            out.printf("    <form method=\"post\" action=\"#\">%n");
            for (RikhoaiomunParser.FieldDeclContext fctx : ctx.fieldDecl()) {
                String fieldName = fctx.IDENTIFIER().getText();
                String type = fctx.type().getText();
                String inputType = mapTypeToInput(type);
                out.printf("        <label for=\"%s\">%s:</label>\n", fieldName, fieldName);
                if (inputType.equals("checkbox")) {
                    out.printf("        <input type=\"checkbox\" id=\"%s\" name=\"%s\"><br>%n", fieldName, fieldName);
                } else {
                    out.printf("        <input type=\"%s\" id=\"%s\" name=\"%s\"><br>%n", inputType, fieldName, fieldName);
                }
            }
            out.printf("        <input type=\"submit\" value=\"Submit\">%n");
            out.printf("    </form>%n</body>%n</html>%n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Normalize a raw string to a class name (e.g., "User Account" → "UserAccount")
    private String normalizeClassName(String raw) {
        return Arrays.stream(raw.split("\\s+")).map(w -> Character.toUpperCase(w.charAt(0)) + w.substring(1)).collect(java.util.stream.Collectors.joining());
    }

    // Map a Java type to an HTML input type
    private String mapTypeToInput(String type) {
        switch (type) {
            case "String": return "text";
            case "int": return "number";
            case "boolean": return "checkbox";
            default: return "text";
        }
    }
}
