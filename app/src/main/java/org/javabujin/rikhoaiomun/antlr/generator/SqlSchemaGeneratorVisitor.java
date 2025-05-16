package org.javabujin.rikhoaiomun.antlr.generator;

import org.javabujin.rikhoaiomun.antlr.generated.RikhoaiomunParser;
import org.javabujin.rikhoaiomun.antlr.generated.RikhoaiomunBaseVisitor;

import java.io.*;
import java.nio.file.*;
import java.util.*;

// SqlSchemaGeneratorVisitor traverses the parsed AST and generates SQL CREATE TABLE statements for each entity.
// It outputs .sql files with table definitions, mapping fields to SQL types and including comments.
public class SqlSchemaGeneratorVisitor extends RikhoaiomunBaseVisitor<Void> {
    // Output directory for generated SQL files
    private final Path outputDir;
    // Current package path (e.g., app/core/auth/login)
    private String currentPackage;

    // Initialize with the output directory
    public SqlSchemaGeneratorVisitor(Path outputDir) {
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

    // Visit entity declaration and generate a SQL CREATE TABLE statement for the
    // entity
    @Override
    public Void visitEntityDecl(RikhoaiomunParser.EntityDeclContext ctx) {
        String raw = ctx.name().getText();
        String tableName = normalizeTableName(raw);
        Path pkgDir = outputDir.resolve(currentPackage);
        try {
            Files.createDirectories(pkgDir);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path sqlFile = pkgDir.resolve(tableName + ".sql");
        try (PrintWriter out = new PrintWriter(Files.newBufferedWriter(sqlFile))) {
            // Table comment if available
            String tableComment = null;
            for (int i = 0; i < ctx.getChildCount(); i++) {
                if (ctx.getChild(i).getClass().getSimpleName().equals("CommentDeclContext")) {
                    // Found a comment node
                    Object commentNode = ctx.getChild(i);
                    try {
                        // Use reflection to get MULTILINE_STRING_LITERAL if available
                        java.lang.reflect.Method m = commentNode.getClass().getMethod("MULTILINE_STRING_LITERAL");
                        org.antlr.v4.runtime.tree.TerminalNode tn = (org.antlr.v4.runtime.tree.TerminalNode) m
                                .invoke(commentNode);
                        if (tn != null) {
                            tableComment = tn.getText().replaceAll("^\"\"\"|\"\"\"$", "");
                        }
                    } catch (Exception ignored) {
                    }
                    break;
                }
            }
            if (tableComment != null) {
                out.printf("-- %s\n", tableComment.trim());
            }
            out.printf("CREATE TABLE %s (\n", tableName);
            List<RikhoaiomunParser.FieldDeclContext> fields = ctx.fieldDecl();
            for (int i = 0; i < fields.size(); i++) {
                RikhoaiomunParser.FieldDeclContext fctx = fields.get(i);
                String fieldName = fctx.IDENTIFIER().getText();
                String type = mapTypeToSql(fctx.type().getText());
                // Field comment if available
                String fieldComment = "";
                // If your grammar supports comments for fields, replace 'getChild' and index
                // with the correct accessor.
                // Example: Parse the last child if it's a comment node.
                if (fctx.getChildCount() > 0
                        && fctx.getChild(fctx.getChildCount() - 1).getText().startsWith("\"\"\"")) {
                    String c = fctx.getChild(fctx.getChildCount() - 1).getText()
                            .replaceAll("^\"\"\"|\"\"\"$", "");
                    fieldComment = String.format(" -- %s", c.trim());
                }
                out.printf("    %s %s%s%s\n",
                        fieldName,
                        type,
                        (i < fields.size() - 1) ? "," : "",
                        fieldComment);
            }
            out.println(");");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Normalize a raw string to a table name (e.g., "User Account" →
    // "user_account")
    private String normalizeTableName(String raw) {
        return raw.trim().toLowerCase().replaceAll("\\s+", "_");
    }

    // Map a Java type to a SQL type
    private String mapTypeToSql(String type) {
        switch (type) {
            case "String":
                return "VARCHAR(255)";
            case "int":
                return "INTEGER";
            case "boolean":
                return "BOOLEAN";
            default:
                return "VARCHAR(255)";
        }
    }
}
