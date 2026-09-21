// Generated from FridayParser.g4 by ANTLR 4.13.2
package com.friday;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FridayParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FridayParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FridayParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(FridayParser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link FridayParser#topLevelStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelStatement(FridayParser.TopLevelStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FridayParser#namespaceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceStatement(FridayParser.NamespaceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FridayParser#usingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingStatement(FridayParser.UsingStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FreeFunctionStatement}
	 * labeled alternative in {@link FridayParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreeFunctionStatement(FridayParser.FreeFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NativeFunctionStatement}
	 * labeled alternative in {@link FridayParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNativeFunctionStatement(FridayParser.NativeFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FridayParser#structStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructStatement(FridayParser.StructStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link FridayParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(FridayParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link FridayParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(FridayParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionStatement}
	 * labeled alternative in {@link FridayParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(FridayParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link FridayParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(FridayParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link FridayParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(FridayParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link FridayParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(FridayParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclarationStatement}
	 * labeled alternative in {@link FridayParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(FridayParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeferStatement}
	 * labeled alternative in {@link FridayParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeferStatement(FridayParser.DeferStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ScopeStatement}
	 * labeled alternative in {@link FridayParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScopeStatement(FridayParser.ScopeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FridayParser#syntacticalScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntacticalScope(FridayParser.SyntacticalScopeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BasicBlock}
	 * labeled alternative in {@link FridayParser#functionScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicBlock(FridayParser.BasicBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrailingBlock}
	 * labeled alternative in {@link FridayParser#functionScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailingBlock(FridayParser.TrailingBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberAccessExpression}
	 * labeled alternative in {@link FridayParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccessExpression(FridayParser.MemberAccessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryPostfixExpression}
	 * labeled alternative in {@link FridayParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPostfixExpression(FridayParser.UnaryPostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatLiteralExpression}
	 * labeled alternative in {@link FridayParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteralExpression(FridayParser.FloatLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link FridayParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(FridayParser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link FridayParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralExpression(FridayParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExplicitCastExpression}
	 * labeled alternative in {@link FridayParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitCastExpression(FridayParser.ExplicitCastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLiteralExpression}
	 * labeled alternative in {@link FridayParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteralExpression(FridayParser.IntLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link FridayParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(FridayParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteralExpression}
	 * labeled alternative in {@link FridayParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralExpression(FridayParser.StringLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpression}
	 * labeled alternative in {@link FridayParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(FridayParser.BinaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link FridayParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(FridayParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GroupingExpression}
	 * labeled alternative in {@link FridayParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingExpression(FridayParser.GroupingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryPrefixExpression}
	 * labeled alternative in {@link FridayParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPrefixExpression(FridayParser.UnaryPrefixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubscriptExpression}
	 * labeled alternative in {@link FridayParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptExpression(FridayParser.SubscriptExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolLiteralExpression}
	 * labeled alternative in {@link FridayParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteralExpression(FridayParser.BoolLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharLiteralExpression}
	 * labeled alternative in {@link FridayParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLiteralExpression(FridayParser.CharLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallExpression}
	 * labeled alternative in {@link FridayParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpression(FridayParser.CallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NullLiteralExpression}
	 * labeled alternative in {@link FridayParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteralExpression(FridayParser.NullLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompTimeUnaryPrefixExpression}
	 * labeled alternative in {@link FridayParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompTimeUnaryPrefixExpression(FridayParser.CompTimeUnaryPrefixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleType}
	 * labeled alternative in {@link FridayParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(FridayParser.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PointerType}
	 * labeled alternative in {@link FridayParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerType(FridayParser.PointerTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link FridayParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(FridayParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionType}
	 * labeled alternative in {@link FridayParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(FridayParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FridayParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(FridayParser.TypeParametersContext ctx);
}