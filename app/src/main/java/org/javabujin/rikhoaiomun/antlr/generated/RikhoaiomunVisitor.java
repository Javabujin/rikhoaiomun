// Generated from Rikhoaiomun.g4 by ANTLR 4.13.2
package org.javabujin.rikhoaiomun.antlr.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RikhoaiomunParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RikhoaiomunVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RikhoaiomunParser#specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecification(RikhoaiomunParser.SpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RikhoaiomunParser#systemDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemDecl(RikhoaiomunParser.SystemDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link RikhoaiomunParser#moduleDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDecl(RikhoaiomunParser.ModuleDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link RikhoaiomunParser#entityDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityDecl(RikhoaiomunParser.EntityDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link RikhoaiomunParser#fieldDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDecl(RikhoaiomunParser.FieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link RikhoaiomunParser#featureDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureDecl(RikhoaiomunParser.FeatureDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link RikhoaiomunParser#inputsDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputsDecl(RikhoaiomunParser.InputsDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link RikhoaiomunParser#outputsDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputsDecl(RikhoaiomunParser.OutputsDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link RikhoaiomunParser#commentDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentDecl(RikhoaiomunParser.CommentDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link RikhoaiomunParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(RikhoaiomunParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link RikhoaiomunParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(RikhoaiomunParser.TypeContext ctx);
}