// Generated from FridayParser.g4 by ANTLR 4.13.2
package com.friday.frontend;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FridayParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INLINE_COMMENT=1, COMMENT=2, SPACE=3, PRIVATE=4, PUBLIC=5, STRUCT=6, RETURN=7, 
		PRINT=8, FN=9, FOR=10, WHILE=11, DEFER=12, NATIVE=13, NAMESPACE=14, USING=15, 
		CONST=16, LET=17, NEW=18, IF=19, ELIF=20, ELSE=21, AS=22, SIZEOF=23, ALIGNOF=24, 
		WHERE=25, BOOL_LIT=26, NULL_LIT=27, INT_LIT=28, FLOAT_LIT=29, STRING_LIT=30, 
		CHAR_LIT=31, LEFT_PAREN=32, LEFT_SQUARE=33, LEFT_CURLY=34, RIGHT_PAREN=35, 
		RIGHT_SQUARE=36, RIGHT_CURLY=37, SEMI=38, COL=39, COMMA=40, ARROW=41, 
		FAT_ARROW=42, INCREMENT=43, DECREMENT=44, PLUS=45, MINUS=46, STAR=47, 
		SLASH=48, MODULO=49, LSHIFT=50, RSHIFT=51, AMPERSAND=52, PIPELINE=53, 
		LESS=54, GREATER=55, LESS_EQ=56, GREATER_EQ=57, EQUALS=58, NOT_EQUALS=59, 
		ASSIGN=60, PLUS_ASSIGN=61, MINUS_ASSIGN=62, STAR_ASSIGN=63, SLASH_ASSIGN=64, 
		MODULO_ASSIGN=65, LSHIFT_ASSIGN=66, RSHIFT_ASSIGN=67, AMPERSAND_ASSIGN=68, 
		PIPELINE_ASSIGN=69, DOTDOT=70, DOTDOTEQ=71, TILDE=72, DOT=73, AND=74, 
		OR=75, NOT=76, OPERATOR_IDENTIFIER=77, IDENTIFIER=78;
	public static final int
		RULE_translationUnit = 0, RULE_topLevelStatement = 1, RULE_namespaceStatement = 2, 
		RULE_usingStatement = 3, RULE_functionStatement = 4, RULE_structStatement = 5, 
		RULE_statement = 6, RULE_syntacticalScope = 7, RULE_functionScope = 8, 
		RULE_expression = 9, RULE_type = 10, RULE_typeParameters = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"translationUnit", "topLevelStatement", "namespaceStatement", "usingStatement", 
			"functionStatement", "structStatement", "statement", "syntacticalScope", 
			"functionScope", "expression", "type", "typeParameters"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'private'", "'public'", "'struct'", "'return'", 
			"'print'", "'fn'", "'for'", "'while'", "'defer'", "'native'", "'namespace'", 
			"'using'", "'const'", "'let'", "'new'", "'if'", "'elif'", "'else'", "'as'", 
			"'sizeof'", "'alignof'", "'where'", null, "'null'", null, null, null, 
			null, "'('", "'['", "'{'", "')'", "']'", "'}'", "';'", "':'", "','", 
			"'->'", "'=>'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", "'<<'", 
			"'>>'", "'&'", "'|'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'='", 
			"'+='", "'-='", "'*='", "'/='", "'%='", "'<<='", "'>>='", "'&='", "'|='", 
			"'..'", "'..='", "'~'", "'.'", "'&&'", "'||'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INLINE_COMMENT", "COMMENT", "SPACE", "PRIVATE", "PUBLIC", "STRUCT", 
			"RETURN", "PRINT", "FN", "FOR", "WHILE", "DEFER", "NATIVE", "NAMESPACE", 
			"USING", "CONST", "LET", "NEW", "IF", "ELIF", "ELSE", "AS", "SIZEOF", 
			"ALIGNOF", "WHERE", "BOOL_LIT", "NULL_LIT", "INT_LIT", "FLOAT_LIT", "STRING_LIT", 
			"CHAR_LIT", "LEFT_PAREN", "LEFT_SQUARE", "LEFT_CURLY", "RIGHT_PAREN", 
			"RIGHT_SQUARE", "RIGHT_CURLY", "SEMI", "COL", "COMMA", "ARROW", "FAT_ARROW", 
			"INCREMENT", "DECREMENT", "PLUS", "MINUS", "STAR", "SLASH", "MODULO", 
			"LSHIFT", "RSHIFT", "AMPERSAND", "PIPELINE", "LESS", "GREATER", "LESS_EQ", 
			"GREATER_EQ", "EQUALS", "NOT_EQUALS", "ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", 
			"STAR_ASSIGN", "SLASH_ASSIGN", "MODULO_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
			"AMPERSAND_ASSIGN", "PIPELINE_ASSIGN", "DOTDOT", "DOTDOTEQ", "TILDE", 
			"DOT", "AND", "OR", "NOT", "OPERATOR_IDENTIFIER", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "FridayParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FridayParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TranslationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FridayParser.EOF, 0); }
		public List<TopLevelStatementContext> topLevelStatement() {
			return getRuleContexts(TopLevelStatementContext.class);
		}
		public TopLevelStatementContext topLevelStatement(int i) {
			return getRuleContext(TopLevelStatementContext.class,i);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 57968L) != 0)) {
				{
				{
				setState(24);
				topLevelStatement();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TopLevelStatementContext extends ParserRuleContext {
		public UsingStatementContext usingStatement() {
			return getRuleContext(UsingStatementContext.class,0);
		}
		public NamespaceStatementContext namespaceStatement() {
			return getRuleContext(NamespaceStatementContext.class,0);
		}
		public StructStatementContext structStatement() {
			return getRuleContext(StructStatementContext.class,0);
		}
		public FunctionStatementContext functionStatement() {
			return getRuleContext(FunctionStatementContext.class,0);
		}
		public TopLevelStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitTopLevelStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLevelStatementContext topLevelStatement() throws RecognitionException {
		TopLevelStatementContext _localctx = new TopLevelStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_topLevelStatement);
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				usingStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				namespaceStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				structStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				functionStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamespaceStatementContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public List<Token> names = new ArrayList<Token>();
		public TerminalNode NAMESPACE() { return getToken(FridayParser.NAMESPACE, 0); }
		public TerminalNode SEMI() { return getToken(FridayParser.SEMI, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(FridayParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FridayParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(FridayParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(FridayParser.DOT, i);
		}
		public NamespaceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitNamespaceStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceStatementContext namespaceStatement() throws RecognitionException {
		NamespaceStatementContext _localctx = new NamespaceStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_namespaceStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(NAMESPACE);
			setState(39);
			((NamespaceStatementContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			((NamespaceStatementContext)_localctx).names.add(((NamespaceStatementContext)_localctx).IDENTIFIER);
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(40);
					match(DOT);
					setState(41);
					((NamespaceStatementContext)_localctx).IDENTIFIER = match(IDENTIFIER);
					((NamespaceStatementContext)_localctx).names.add(((NamespaceStatementContext)_localctx).IDENTIFIER);
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(47);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UsingStatementContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public List<Token> names = new ArrayList<Token>();
		public TerminalNode USING() { return getToken(FridayParser.USING, 0); }
		public TerminalNode SEMI() { return getToken(FridayParser.SEMI, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FridayParser.IDENTIFIER, 0); }
		public UsingStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitUsingStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingStatementContext usingStatement() throws RecognitionException {
		UsingStatementContext _localctx = new UsingStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_usingStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(USING);
			setState(50);
			((UsingStatementContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			((UsingStatementContext)_localctx).names.add(((UsingStatementContext)_localctx).IDENTIFIER);
			setState(51);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionStatementContext extends ParserRuleContext {
		public FunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStatement; }
	 
		public FunctionStatementContext() { }
		public void copyFrom(FunctionStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NativeFunctionStatementContext extends FunctionStatementContext {
		public Token accessModifier;
		public Token name;
		public Token IDENTIFIER;
		public List<Token> paramsNames = new ArrayList<Token>();
		public TypeContext type;
		public List<TypeContext> paramsTypes = new ArrayList<TypeContext>();
		public TypeContext returnType;
		public TerminalNode NATIVE() { return getToken(FridayParser.NATIVE, 0); }
		public TerminalNode FN() { return getToken(FridayParser.FN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(FridayParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(FridayParser.RIGHT_PAREN, 0); }
		public TerminalNode ARROW() { return getToken(FridayParser.ARROW, 0); }
		public TerminalNode SEMI() { return getToken(FridayParser.SEMI, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(FridayParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FridayParser.IDENTIFIER, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COL() { return getTokens(FridayParser.COL); }
		public TerminalNode COL(int i) {
			return getToken(FridayParser.COL, i);
		}
		public TerminalNode PRIVATE() { return getToken(FridayParser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(FridayParser.PUBLIC, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FridayParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FridayParser.COMMA, i);
		}
		public NativeFunctionStatementContext(FunctionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitNativeFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FreeFunctionStatementContext extends FunctionStatementContext {
		public Token accessModifier;
		public Token name;
		public Token IDENTIFIER;
		public List<Token> paramsNames = new ArrayList<Token>();
		public TypeContext type;
		public List<TypeContext> paramsTypes = new ArrayList<TypeContext>();
		public TypeContext returnType;
		public FunctionScopeContext block;
		public TerminalNode FN() { return getToken(FridayParser.FN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(FridayParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(FridayParser.RIGHT_PAREN, 0); }
		public TerminalNode ARROW() { return getToken(FridayParser.ARROW, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public FunctionScopeContext functionScope() {
			return getRuleContext(FunctionScopeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(FridayParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FridayParser.IDENTIFIER, i);
		}
		public TerminalNode OPERATOR_IDENTIFIER() { return getToken(FridayParser.OPERATOR_IDENTIFIER, 0); }
		public List<TerminalNode> COL() { return getTokens(FridayParser.COL); }
		public TerminalNode COL(int i) {
			return getToken(FridayParser.COL, i);
		}
		public TerminalNode PRIVATE() { return getToken(FridayParser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(FridayParser.PUBLIC, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FridayParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FridayParser.COMMA, i);
		}
		public FreeFunctionStatementContext(FunctionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitFreeFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionStatementContext functionStatement() throws RecognitionException {
		FunctionStatementContext _localctx = new FunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionStatement);
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new FreeFunctionStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVATE || _la==PUBLIC) {
					{
					setState(53);
					((FreeFunctionStatementContext)_localctx).accessModifier = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PRIVATE || _la==PUBLIC) ) {
						((FreeFunctionStatementContext)_localctx).accessModifier = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(56);
				match(FN);
				setState(57);
				((FreeFunctionStatementContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OPERATOR_IDENTIFIER || _la==IDENTIFIER) ) {
					((FreeFunctionStatementContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(58);
				match(LEFT_PAREN);
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(59);
					((FreeFunctionStatementContext)_localctx).IDENTIFIER = match(IDENTIFIER);
					((FreeFunctionStatementContext)_localctx).paramsNames.add(((FreeFunctionStatementContext)_localctx).IDENTIFIER);
					setState(60);
					match(COL);
					setState(61);
					((FreeFunctionStatementContext)_localctx).type = type();
					((FreeFunctionStatementContext)_localctx).paramsTypes.add(((FreeFunctionStatementContext)_localctx).type);
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(62);
						match(COMMA);
						setState(63);
						((FreeFunctionStatementContext)_localctx).IDENTIFIER = match(IDENTIFIER);
						((FreeFunctionStatementContext)_localctx).paramsNames.add(((FreeFunctionStatementContext)_localctx).IDENTIFIER);
						setState(64);
						match(COL);
						setState(65);
						((FreeFunctionStatementContext)_localctx).type = type();
						((FreeFunctionStatementContext)_localctx).paramsTypes.add(((FreeFunctionStatementContext)_localctx).type);
						}
						}
						setState(70);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(73);
				match(RIGHT_PAREN);
				setState(74);
				match(ARROW);
				setState(75);
				((FreeFunctionStatementContext)_localctx).returnType = type();
				setState(76);
				((FreeFunctionStatementContext)_localctx).block = functionScope();
				}
				break;
			case 2:
				_localctx = new NativeFunctionStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVATE || _la==PUBLIC) {
					{
					setState(78);
					((NativeFunctionStatementContext)_localctx).accessModifier = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PRIVATE || _la==PUBLIC) ) {
						((NativeFunctionStatementContext)_localctx).accessModifier = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(81);
				match(NATIVE);
				setState(82);
				match(FN);
				setState(83);
				((NativeFunctionStatementContext)_localctx).name = match(IDENTIFIER);
				setState(84);
				match(LEFT_PAREN);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(85);
					((NativeFunctionStatementContext)_localctx).IDENTIFIER = match(IDENTIFIER);
					((NativeFunctionStatementContext)_localctx).paramsNames.add(((NativeFunctionStatementContext)_localctx).IDENTIFIER);
					setState(86);
					match(COL);
					setState(87);
					((NativeFunctionStatementContext)_localctx).type = type();
					((NativeFunctionStatementContext)_localctx).paramsTypes.add(((NativeFunctionStatementContext)_localctx).type);
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(88);
						match(COMMA);
						setState(89);
						((NativeFunctionStatementContext)_localctx).IDENTIFIER = match(IDENTIFIER);
						((NativeFunctionStatementContext)_localctx).paramsNames.add(((NativeFunctionStatementContext)_localctx).IDENTIFIER);
						setState(90);
						match(COL);
						setState(91);
						((NativeFunctionStatementContext)_localctx).type = type();
						((NativeFunctionStatementContext)_localctx).paramsTypes.add(((NativeFunctionStatementContext)_localctx).type);
						}
						}
						setState(96);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(99);
				match(RIGHT_PAREN);
				setState(100);
				match(ARROW);
				setState(101);
				((NativeFunctionStatementContext)_localctx).returnType = type();
				setState(102);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructStatementContext extends ParserRuleContext {
		public Token accessModifier;
		public Token structName;
		public Token IDENTIFIER;
		public List<Token> fieldsNames = new ArrayList<Token>();
		public TypeContext type;
		public List<TypeContext> fieldsTypes = new ArrayList<TypeContext>();
		public FunctionStatementContext functionStatement;
		public List<FunctionStatementContext> methods = new ArrayList<FunctionStatementContext>();
		public TerminalNode STRUCT() { return getToken(FridayParser.STRUCT, 0); }
		public TerminalNode LEFT_CURLY() { return getToken(FridayParser.LEFT_CURLY, 0); }
		public TerminalNode RIGHT_CURLY() { return getToken(FridayParser.RIGHT_CURLY, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(FridayParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FridayParser.IDENTIFIER, i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<FunctionStatementContext> functionStatement() {
			return getRuleContexts(FunctionStatementContext.class);
		}
		public FunctionStatementContext functionStatement(int i) {
			return getRuleContext(FunctionStatementContext.class,i);
		}
		public List<TerminalNode> PRIVATE() { return getTokens(FridayParser.PRIVATE); }
		public TerminalNode PRIVATE(int i) {
			return getToken(FridayParser.PRIVATE, i);
		}
		public List<TerminalNode> PUBLIC() { return getTokens(FridayParser.PUBLIC); }
		public TerminalNode PUBLIC(int i) {
			return getToken(FridayParser.PUBLIC, i);
		}
		public List<TerminalNode> COL() { return getTokens(FridayParser.COL); }
		public TerminalNode COL(int i) {
			return getToken(FridayParser.COL, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(FridayParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(FridayParser.SEMI, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public StructStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitStructStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructStatementContext structStatement() throws RecognitionException {
		StructStatementContext _localctx = new StructStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_structStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE || _la==PUBLIC) {
				{
				setState(106);
				((StructStatementContext)_localctx).accessModifier = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRIVATE || _la==PUBLIC) ) {
					((StructStatementContext)_localctx).accessModifier = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(109);
			match(STRUCT);
			setState(110);
			((StructStatementContext)_localctx).structName = match(IDENTIFIER);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS) {
				{
				setState(111);
				typeParameters();
				}
			}

			setState(114);
			match(LEFT_CURLY);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8752L) != 0) || _la==IDENTIFIER) {
				{
				setState(124);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					{
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PRIVATE || _la==PUBLIC) {
						{
						setState(115);
						((StructStatementContext)_localctx).accessModifier = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PRIVATE || _la==PUBLIC) ) {
							((StructStatementContext)_localctx).accessModifier = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(118);
					((StructStatementContext)_localctx).IDENTIFIER = match(IDENTIFIER);
					((StructStatementContext)_localctx).fieldsNames.add(((StructStatementContext)_localctx).IDENTIFIER);
					setState(119);
					match(COL);
					setState(120);
					((StructStatementContext)_localctx).type = type();
					((StructStatementContext)_localctx).fieldsTypes.add(((StructStatementContext)_localctx).type);
					setState(121);
					match(SEMI);
					}
					}
					break;
				case 2:
					{
					setState(123);
					((StructStatementContext)_localctx).functionStatement = functionStatement();
					((StructStatementContext)_localctx).methods.add(((StructStatementContext)_localctx).functionStatement);
					}
					break;
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(RIGHT_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScopeStatementContext extends StatementContext {
		public SyntacticalScopeContext syntacticalScope() {
			return getRuleContext(SyntacticalScopeContext.class,0);
		}
		public ScopeStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitScopeStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends StatementContext {
		public ExpressionContext expression;
		public List<ExpressionContext> conditions = new ArrayList<ExpressionContext>();
		public SyntacticalScopeContext syntacticalScope;
		public List<SyntacticalScopeContext> scopes = new ArrayList<SyntacticalScopeContext>();
		public StatementContext elseStatement;
		public TerminalNode IF() { return getToken(FridayParser.IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<SyntacticalScopeContext> syntacticalScope() {
			return getRuleContexts(SyntacticalScopeContext.class);
		}
		public SyntacticalScopeContext syntacticalScope(int i) {
			return getRuleContext(SyntacticalScopeContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(FridayParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(FridayParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(FridayParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeferStatementContext extends StatementContext {
		public TerminalNode DEFER() { return getToken(FridayParser.DEFER, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeferStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitDeferStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(FridayParser.SEMI, 0); }
		public ExpressionStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends StatementContext {
		public TerminalNode PRINT() { return getToken(FridayParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(FridayParser.SEMI, 0); }
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(FridayParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(FridayParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends StatementContext {
		public ExpressionContext condition;
		public SyntacticalScopeContext scope;
		public TerminalNode WHILE() { return getToken(FridayParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SyntacticalScopeContext syntacticalScope() {
			return getRuleContext(SyntacticalScopeContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends StatementContext {
		public Token varname;
		public ExpressionContext from;
		public Token rangeOp;
		public ExpressionContext to;
		public Token enumerator;
		public Token itername;
		public ExpressionContext slice;
		public ExpressionContext filterExpr;
		public SyntacticalScopeContext scope;
		public TerminalNode FOR() { return getToken(FridayParser.FOR, 0); }
		public SyntacticalScopeContext syntacticalScope() {
			return getRuleContext(SyntacticalScopeContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(FridayParser.WHERE, 0); }
		public TerminalNode COL() { return getToken(FridayParser.COL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(FridayParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FridayParser.IDENTIFIER, i);
		}
		public TerminalNode DOTDOT() { return getToken(FridayParser.DOTDOT, 0); }
		public TerminalNode DOTDOTEQ() { return getToken(FridayParser.DOTDOTEQ, 0); }
		public TerminalNode COMMA() { return getToken(FridayParser.COMMA, 0); }
		public ForStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationStatementContext extends StatementContext {
		public Token declarator;
		public Token id;
		public ExpressionContext initializer;
		public TerminalNode ASSIGN() { return getToken(FridayParser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(FridayParser.SEMI, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FridayParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LET() { return getToken(FridayParser.LET, 0); }
		public TerminalNode CONST() { return getToken(FridayParser.CONST, 0); }
		public TerminalNode COL() { return getToken(FridayParser.COL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclarationStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(PRINT);
				setState(132);
				expression(0);
				setState(133);
				match(SEMI);
				}
				break;
			case RETURN:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(RETURN);
				{
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & 1459166297387499361L) != 0)) {
					{
					setState(136);
					expression(0);
					}
				}

				}
				setState(139);
				match(SEMI);
				}
				break;
			case NEW:
			case SIZEOF:
			case ALIGNOF:
			case BOOL_LIT:
			case NULL_LIT:
			case INT_LIT:
			case FLOAT_LIT:
			case STRING_LIT:
			case CHAR_LIT:
			case LEFT_PAREN:
			case LEFT_SQUARE:
			case PLUS:
			case MINUS:
			case STAR:
			case AMPERSAND:
			case TILDE:
			case NOT:
			case IDENTIFIER:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				expression(0);
				setState(141);
				match(SEMI);
				}
				break;
			case IF:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				match(IF);
				setState(144);
				((IfStatementContext)_localctx).expression = expression(0);
				((IfStatementContext)_localctx).conditions.add(((IfStatementContext)_localctx).expression);
				setState(145);
				((IfStatementContext)_localctx).syntacticalScope = syntacticalScope();
				((IfStatementContext)_localctx).scopes.add(((IfStatementContext)_localctx).syntacticalScope);
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(146);
						match(ELIF);
						setState(147);
						((IfStatementContext)_localctx).expression = expression(0);
						((IfStatementContext)_localctx).conditions.add(((IfStatementContext)_localctx).expression);
						setState(148);
						((IfStatementContext)_localctx).syntacticalScope = syntacticalScope();
						((IfStatementContext)_localctx).scopes.add(((IfStatementContext)_localctx).syntacticalScope);
						}
						} 
					}
					setState(154);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(155);
					match(ELSE);
					setState(156);
					((IfStatementContext)_localctx).elseStatement = statement();
					}
				}

				}
				break;
			case FOR:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				match(FOR);
				setState(173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					{
					setState(160);
					((ForStatementContext)_localctx).varname = match(IDENTIFIER);
					setState(161);
					match(COL);
					setState(162);
					((ForStatementContext)_localctx).from = expression(0);
					setState(163);
					((ForStatementContext)_localctx).rangeOp = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==DOTDOT || _la==DOTDOTEQ) ) {
						((ForStatementContext)_localctx).rangeOp = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(164);
					((ForStatementContext)_localctx).to = expression(0);
					}
					}
					break;
				case 2:
					{
					{
					setState(168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(166);
						((ForStatementContext)_localctx).enumerator = match(IDENTIFIER);
						setState(167);
						match(COMMA);
						}
						break;
					}
					setState(170);
					((ForStatementContext)_localctx).itername = match(IDENTIFIER);
					setState(171);
					match(COL);
					setState(172);
					((ForStatementContext)_localctx).slice = expression(0);
					}
					}
					break;
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(175);
					match(WHERE);
					setState(176);
					((ForStatementContext)_localctx).filterExpr = expression(0);
					}
				}

				setState(179);
				((ForStatementContext)_localctx).scope = syntacticalScope();
				}
				break;
			case WHILE:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(181);
				match(WHILE);
				setState(182);
				((WhileStatementContext)_localctx).condition = expression(0);
				setState(183);
				((WhileStatementContext)_localctx).scope = syntacticalScope();
				}
				break;
			case CONST:
			case LET:
				_localctx = new DeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(185);
				((DeclarationStatementContext)_localctx).declarator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CONST || _la==LET) ) {
					((DeclarationStatementContext)_localctx).declarator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(186);
				((DeclarationStatementContext)_localctx).id = match(IDENTIFIER);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COL) {
					{
					setState(187);
					match(COL);
					setState(188);
					type();
					}
				}

				setState(191);
				match(ASSIGN);
				setState(192);
				((DeclarationStatementContext)_localctx).initializer = expression(0);
				setState(193);
				match(SEMI);
				}
				break;
			case DEFER:
				_localctx = new DeferStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(195);
				match(DEFER);
				setState(196);
				statement();
				}
				break;
			case LEFT_CURLY:
				_localctx = new ScopeStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(197);
				syntacticalScope();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SyntacticalScopeContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY() { return getToken(FridayParser.LEFT_CURLY, 0); }
		public TerminalNode RIGHT_CURLY() { return getToken(FridayParser.RIGHT_CURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SyntacticalScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntacticalScope; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitSyntacticalScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyntacticalScopeContext syntacticalScope() throws RecognitionException {
		SyntacticalScopeContext _localctx = new SyntacticalScopeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_syntacticalScope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(LEFT_CURLY);
			{
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4749924550778240L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 81L) != 0)) {
				{
				{
				setState(201);
				statement();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(207);
			match(RIGHT_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionScopeContext extends ParserRuleContext {
		public FunctionScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionScope; }
	 
		public FunctionScopeContext() { }
		public void copyFrom(FunctionScopeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrailingBlockContext extends FunctionScopeContext {
		public TerminalNode FAT_ARROW() { return getToken(FridayParser.FAT_ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(FridayParser.SEMI, 0); }
		public TrailingBlockContext(FunctionScopeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitTrailingBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BasicBlockContext extends FunctionScopeContext {
		public TerminalNode LEFT_CURLY() { return getToken(FridayParser.LEFT_CURLY, 0); }
		public TerminalNode RIGHT_CURLY() { return getToken(FridayParser.RIGHT_CURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BasicBlockContext(FunctionScopeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitBasicBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionScopeContext functionScope() throws RecognitionException {
		FunctionScopeContext _localctx = new FunctionScopeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionScope);
		int _la;
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_CURLY:
				_localctx = new BasicBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(LEFT_CURLY);
				{
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4749924550778240L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 81L) != 0)) {
					{
					{
					setState(210);
					statement();
					}
					}
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(216);
				match(RIGHT_CURLY);
				}
				break;
			case FAT_ARROW:
				_localctx = new TrailingBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(FAT_ARROW);
				setState(218);
				expression(0);
				setState(219);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberAccessExpressionContext extends ExpressionContext {
		public ExpressionContext object;
		public Token member;
		public TerminalNode DOT() { return getToken(FridayParser.DOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FridayParser.IDENTIFIER, 0); }
		public MemberAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitMemberAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryPostfixExpressionContext extends ExpressionContext {
		public ExpressionContext operand;
		public Token postfixOperator;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(FridayParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(FridayParser.DECREMENT, 0); }
		public UnaryPostfixExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitUnaryPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatLiteralExpressionContext extends ExpressionContext {
		public Token literal;
		public TerminalNode FLOAT_LIT() { return getToken(FridayParser.FLOAT_LIT, 0); }
		public FloatLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitFloatLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewExpressionContext extends ExpressionContext {
		public Token IDENTIFIER;
		public List<Token> fields = new ArrayList<Token>();
		public ExpressionContext expression;
		public List<ExpressionContext> initializers = new ArrayList<ExpressionContext>();
		public TerminalNode NEW() { return getToken(FridayParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LEFT_CURLY() { return getToken(FridayParser.LEFT_CURLY, 0); }
		public TerminalNode RIGHT_CURLY() { return getToken(FridayParser.RIGHT_CURLY, 0); }
		public List<TerminalNode> COL() { return getTokens(FridayParser.COL); }
		public TerminalNode COL(int i) {
			return getToken(FridayParser.COL, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(FridayParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FridayParser.IDENTIFIER, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FridayParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FridayParser.COMMA, i);
		}
		public NewExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralExpressionContext extends ExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> values = new ArrayList<ExpressionContext>();
		public TerminalNode LEFT_SQUARE() { return getToken(FridayParser.LEFT_SQUARE, 0); }
		public TerminalNode RIGHT_SQUARE() { return getToken(FridayParser.RIGHT_SQUARE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FridayParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FridayParser.COMMA, i);
		}
		public ArrayLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitArrayLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExplicitCastExpressionContext extends ExpressionContext {
		public ExpressionContext expr;
		public TypeContext target;
		public TerminalNode AS() { return getToken(FridayParser.AS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExplicitCastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitExplicitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntLiteralExpressionContext extends ExpressionContext {
		public Token literal;
		public TerminalNode INT_LIT() { return getToken(FridayParser.INT_LIT, 0); }
		public IntLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitIntLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExpressionContext extends ExpressionContext {
		public Token id;
		public TerminalNode IDENTIFIER() { return getToken(FridayParser.IDENTIFIER, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralExpressionContext extends ExpressionContext {
		public Token literal;
		public TerminalNode STRING_LIT() { return getToken(FridayParser.STRING_LIT, 0); }
		public StringLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitStringLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token binaryOperator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STAR() { return getToken(FridayParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(FridayParser.SLASH, 0); }
		public TerminalNode MODULO() { return getToken(FridayParser.MODULO, 0); }
		public TerminalNode PLUS() { return getToken(FridayParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FridayParser.MINUS, 0); }
		public TerminalNode LSHIFT() { return getToken(FridayParser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(FridayParser.RSHIFT, 0); }
		public TerminalNode LESS() { return getToken(FridayParser.LESS, 0); }
		public TerminalNode LESS_EQ() { return getToken(FridayParser.LESS_EQ, 0); }
		public TerminalNode GREATER() { return getToken(FridayParser.GREATER, 0); }
		public TerminalNode GREATER_EQ() { return getToken(FridayParser.GREATER_EQ, 0); }
		public TerminalNode EQUALS() { return getToken(FridayParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(FridayParser.NOT_EQUALS, 0); }
		public TerminalNode AMPERSAND() { return getToken(FridayParser.AMPERSAND, 0); }
		public TerminalNode PIPELINE() { return getToken(FridayParser.PIPELINE, 0); }
		public TerminalNode AND() { return getToken(FridayParser.AND, 0); }
		public TerminalNode OR() { return getToken(FridayParser.OR, 0); }
		public BinaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitBinaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token binaryOperator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(FridayParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(FridayParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(FridayParser.MINUS_ASSIGN, 0); }
		public TerminalNode STAR_ASSIGN() { return getToken(FridayParser.STAR_ASSIGN, 0); }
		public TerminalNode SLASH_ASSIGN() { return getToken(FridayParser.SLASH_ASSIGN, 0); }
		public TerminalNode MODULO_ASSIGN() { return getToken(FridayParser.MODULO_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(FridayParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(FridayParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode AMPERSAND_ASSIGN() { return getToken(FridayParser.AMPERSAND_ASSIGN, 0); }
		public TerminalNode PIPELINE_ASSIGN() { return getToken(FridayParser.PIPELINE_ASSIGN, 0); }
		public AssignmentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GroupingExpressionContext extends ExpressionContext {
		public TerminalNode LEFT_PAREN() { return getToken(FridayParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(FridayParser.RIGHT_PAREN, 0); }
		public GroupingExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitGroupingExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryPrefixExpressionContext extends ExpressionContext {
		public Token unaryOperator;
		public ExpressionContext operand;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(FridayParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FridayParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(FridayParser.NOT, 0); }
		public TerminalNode TILDE() { return getToken(FridayParser.TILDE, 0); }
		public TerminalNode STAR() { return getToken(FridayParser.STAR, 0); }
		public TerminalNode AMPERSAND() { return getToken(FridayParser.AMPERSAND, 0); }
		public UnaryPrefixExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitUnaryPrefixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubscriptExpressionContext extends ExpressionContext {
		public ExpressionContext array;
		public ExpressionContext index;
		public TerminalNode LEFT_SQUARE() { return getToken(FridayParser.LEFT_SQUARE, 0); }
		public TerminalNode RIGHT_SQUARE() { return getToken(FridayParser.RIGHT_SQUARE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SubscriptExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitSubscriptExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolLiteralExpressionContext extends ExpressionContext {
		public Token literal;
		public TerminalNode BOOL_LIT() { return getToken(FridayParser.BOOL_LIT, 0); }
		public BoolLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitBoolLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharLiteralExpressionContext extends ExpressionContext {
		public Token literal;
		public TerminalNode CHAR_LIT() { return getToken(FridayParser.CHAR_LIT, 0); }
		public CharLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitCharLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallExpressionContext extends ExpressionContext {
		public ExpressionContext func;
		public ExpressionContext expression;
		public List<ExpressionContext> args = new ArrayList<ExpressionContext>();
		public TerminalNode LEFT_PAREN() { return getToken(FridayParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(FridayParser.RIGHT_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FridayParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FridayParser.COMMA, i);
		}
		public CallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullLiteralExpressionContext extends ExpressionContext {
		public Token literal;
		public TerminalNode NULL_LIT() { return getToken(FridayParser.NULL_LIT, 0); }
		public NullLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitNullLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompTimeUnaryPrefixExpressionContext extends ExpressionContext {
		public Token unaryOperator;
		public TypeContext target;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SIZEOF() { return getToken(FridayParser.SIZEOF, 0); }
		public TerminalNode ALIGNOF() { return getToken(FridayParser.ALIGNOF, 0); }
		public CompTimeUnaryPrefixExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitCompTimeUnaryPrefixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(224);
				((IdentifierExpressionContext)_localctx).id = match(IDENTIFIER);
				}
				break;
			case INT_LIT:
				{
				_localctx = new IntLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				((IntLiteralExpressionContext)_localctx).literal = match(INT_LIT);
				}
				break;
			case CHAR_LIT:
				{
				_localctx = new CharLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				((CharLiteralExpressionContext)_localctx).literal = match(CHAR_LIT);
				}
				break;
			case STRING_LIT:
				{
				_localctx = new StringLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				((StringLiteralExpressionContext)_localctx).literal = match(STRING_LIT);
				}
				break;
			case FLOAT_LIT:
				{
				_localctx = new FloatLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228);
				((FloatLiteralExpressionContext)_localctx).literal = match(FLOAT_LIT);
				}
				break;
			case BOOL_LIT:
				{
				_localctx = new BoolLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				((BoolLiteralExpressionContext)_localctx).literal = match(BOOL_LIT);
				}
				break;
			case NULL_LIT:
				{
				_localctx = new NullLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(230);
				((NullLiteralExpressionContext)_localctx).literal = match(NULL_LIT);
				}
				break;
			case NEW:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231);
				match(NEW);
				setState(232);
				type();
				setState(233);
				match(LEFT_CURLY);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(234);
					((NewExpressionContext)_localctx).IDENTIFIER = match(IDENTIFIER);
					((NewExpressionContext)_localctx).fields.add(((NewExpressionContext)_localctx).IDENTIFIER);
					setState(235);
					match(COL);
					setState(236);
					((NewExpressionContext)_localctx).expression = expression(0);
					((NewExpressionContext)_localctx).initializers.add(((NewExpressionContext)_localctx).expression);
					setState(243);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(237);
							match(COMMA);
							setState(238);
							((NewExpressionContext)_localctx).IDENTIFIER = match(IDENTIFIER);
							((NewExpressionContext)_localctx).fields.add(((NewExpressionContext)_localctx).IDENTIFIER);
							setState(239);
							match(COL);
							setState(240);
							((NewExpressionContext)_localctx).expression = expression(0);
							((NewExpressionContext)_localctx).initializers.add(((NewExpressionContext)_localctx).expression);
							}
							} 
						}
						setState(245);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
					}
					}
				}

				setState(248);
				match(RIGHT_CURLY);
				}
				break;
			case LEFT_SQUARE:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250);
				match(LEFT_SQUARE);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & 1459166297387499361L) != 0)) {
					{
					setState(251);
					((ArrayLiteralExpressionContext)_localctx).expression = expression(0);
					((ArrayLiteralExpressionContext)_localctx).values.add(((ArrayLiteralExpressionContext)_localctx).expression);
					setState(256);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(252);
							match(COMMA);
							setState(253);
							((ArrayLiteralExpressionContext)_localctx).expression = expression(0);
							((ArrayLiteralExpressionContext)_localctx).values.add(((ArrayLiteralExpressionContext)_localctx).expression);
							}
							} 
						}
						setState(258);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
					}
					}
				}

				setState(261);
				match(RIGHT_SQUARE);
				}
				break;
			case PLUS:
			case MINUS:
			case STAR:
			case AMPERSAND:
			case TILDE:
			case NOT:
				{
				_localctx = new UnaryPrefixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262);
				((UnaryPrefixExpressionContext)_localctx).unaryOperator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & 2281701511L) != 0)) ) {
					((UnaryPrefixExpressionContext)_localctx).unaryOperator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(263);
				((UnaryPrefixExpressionContext)_localctx).operand = expression(14);
				}
				break;
			case SIZEOF:
			case ALIGNOF:
				{
				_localctx = new CompTimeUnaryPrefixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(264);
				((CompTimeUnaryPrefixExpressionContext)_localctx).unaryOperator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==SIZEOF || _la==ALIGNOF) ) {
					((CompTimeUnaryPrefixExpressionContext)_localctx).unaryOperator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(265);
				((CompTimeUnaryPrefixExpressionContext)_localctx).target = type();
				}
				break;
			case LEFT_PAREN:
				{
				_localctx = new GroupingExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266);
				match(LEFT_PAREN);
				setState(267);
				expression(0);
				setState(268);
				match(RIGHT_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(328);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(272);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(273);
						((BinaryExpressionContext)_localctx).binaryOperator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0)) ) {
							((BinaryExpressionContext)_localctx).binaryOperator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(274);
						((BinaryExpressionContext)_localctx).right = expression(12);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(275);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(276);
						((BinaryExpressionContext)_localctx).binaryOperator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((BinaryExpressionContext)_localctx).binaryOperator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(277);
						((BinaryExpressionContext)_localctx).right = expression(11);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(278);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(279);
						((BinaryExpressionContext)_localctx).binaryOperator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LSHIFT || _la==RSHIFT) ) {
							((BinaryExpressionContext)_localctx).binaryOperator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(280);
						((BinaryExpressionContext)_localctx).right = expression(10);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(281);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(282);
						((BinaryExpressionContext)_localctx).binaryOperator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 270215977642229760L) != 0)) ) {
							((BinaryExpressionContext)_localctx).binaryOperator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(283);
						((BinaryExpressionContext)_localctx).right = expression(9);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(284);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(285);
						((BinaryExpressionContext)_localctx).binaryOperator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUALS || _la==NOT_EQUALS) ) {
							((BinaryExpressionContext)_localctx).binaryOperator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(286);
						((BinaryExpressionContext)_localctx).right = expression(8);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(287);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(288);
						((BinaryExpressionContext)_localctx).binaryOperator = match(AMPERSAND);
						setState(289);
						((BinaryExpressionContext)_localctx).right = expression(7);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(290);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(291);
						((BinaryExpressionContext)_localctx).binaryOperator = match(PIPELINE);
						setState(292);
						((BinaryExpressionContext)_localctx).right = expression(6);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(293);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(294);
						((BinaryExpressionContext)_localctx).binaryOperator = match(AND);
						setState(295);
						((BinaryExpressionContext)_localctx).right = expression(5);
						}
						break;
					case 9:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(296);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(297);
						((BinaryExpressionContext)_localctx).binaryOperator = match(OR);
						setState(298);
						((BinaryExpressionContext)_localctx).right = expression(4);
						}
						break;
					case 10:
						{
						_localctx = new AssignmentExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AssignmentExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(299);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(300);
						((AssignmentExpressionContext)_localctx).binaryOperator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 1023L) != 0)) ) {
							((AssignmentExpressionContext)_localctx).binaryOperator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(301);
						((AssignmentExpressionContext)_localctx).right = expression(2);
						}
						break;
					case 11:
						{
						_localctx = new UnaryPostfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((UnaryPostfixExpressionContext)_localctx).operand = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(302);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(303);
						((UnaryPostfixExpressionContext)_localctx).postfixOperator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INCREMENT || _la==DECREMENT) ) {
							((UnaryPostfixExpressionContext)_localctx).postfixOperator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 12:
						{
						_localctx = new CallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((CallExpressionContext)_localctx).func = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(304);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(305);
						match(LEFT_PAREN);
						setState(314);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & 1459166297387499361L) != 0)) {
							{
							setState(306);
							((CallExpressionContext)_localctx).expression = expression(0);
							((CallExpressionContext)_localctx).args.add(((CallExpressionContext)_localctx).expression);
							setState(311);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(307);
								match(COMMA);
								setState(308);
								((CallExpressionContext)_localctx).expression = expression(0);
								((CallExpressionContext)_localctx).args.add(((CallExpressionContext)_localctx).expression);
								}
								}
								setState(313);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(316);
						match(RIGHT_PAREN);
						}
						break;
					case 13:
						{
						_localctx = new SubscriptExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((SubscriptExpressionContext)_localctx).array = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(317);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(318);
						match(LEFT_SQUARE);
						setState(319);
						((SubscriptExpressionContext)_localctx).index = expression(0);
						setState(320);
						match(RIGHT_SQUARE);
						}
						break;
					case 14:
						{
						_localctx = new MemberAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MemberAccessExpressionContext)_localctx).object = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(322);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(323);
						match(DOT);
						setState(324);
						((MemberAccessExpressionContext)_localctx).member = match(IDENTIFIER);
						}
						break;
					case 15:
						{
						_localctx = new ExplicitCastExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ExplicitCastExpressionContext)_localctx).expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(325);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(326);
						match(AS);
						setState(327);
						((ExplicitCastExpressionContext)_localctx).target = type();
						}
						break;
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeContext extends TypeContext {
		public TypeContext elementType;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LEFT_SQUARE() { return getToken(FridayParser.LEFT_SQUARE, 0); }
		public TerminalNode RIGHT_SQUARE() { return getToken(FridayParser.RIGHT_SQUARE, 0); }
		public ArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleTypeContext extends TypeContext {
		public Token IDENTIFIER;
		public List<Token> names = new ArrayList<Token>();
		public List<TerminalNode> IDENTIFIER() { return getTokens(FridayParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FridayParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(FridayParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(FridayParser.DOT, i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public SimpleTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitSimpleType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTypeContext extends TypeContext {
		public TypeContext type;
		public List<TypeContext> paramsTypes = new ArrayList<TypeContext>();
		public TypeContext returnType;
		public TerminalNode FN() { return getToken(FridayParser.FN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(FridayParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(FridayParser.RIGHT_PAREN, 0); }
		public TerminalNode ARROW() { return getToken(FridayParser.ARROW, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FridayParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FridayParser.COMMA, i);
		}
		public FunctionTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PointerTypeContext extends TypeContext {
		public TypeContext pointedType;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> STAR() { return getTokens(FridayParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(FridayParser.STAR, i);
		}
		public PointerTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitPointerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		int _la;
		try {
			int _alt;
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new SimpleTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				((SimpleTypeContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((SimpleTypeContext)_localctx).names.add(((SimpleTypeContext)_localctx).IDENTIFIER);
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(334);
						match(DOT);
						setState(335);
						((SimpleTypeContext)_localctx).IDENTIFIER = match(IDENTIFIER);
						((SimpleTypeContext)_localctx).names.add(((SimpleTypeContext)_localctx).IDENTIFIER);
						}
						} 
					}
					setState(340);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(342);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(341);
					typeParameters();
					}
					break;
				}
				}
				break;
			case STAR:
				_localctx = new PointerTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(345); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(344);
						match(STAR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(347); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(349);
				((PointerTypeContext)_localctx).pointedType = type();
				}
				break;
			case LEFT_SQUARE:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(350);
				match(LEFT_SQUARE);
				setState(351);
				match(RIGHT_SQUARE);
				}
				setState(353);
				((ArrayTypeContext)_localctx).elementType = type();
				}
				break;
			case FN:
				_localctx = new FunctionTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(354);
				match(FN);
				setState(355);
				match(LEFT_PAREN);
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140746078290432L) != 0) || _la==IDENTIFIER) {
					{
					setState(356);
					((FunctionTypeContext)_localctx).type = type();
					((FunctionTypeContext)_localctx).paramsTypes.add(((FunctionTypeContext)_localctx).type);
					setState(361);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(357);
						match(COMMA);
						setState(358);
						((FunctionTypeContext)_localctx).type = type();
						((FunctionTypeContext)_localctx).paramsTypes.add(((FunctionTypeContext)_localctx).type);
						}
						}
						setState(363);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(366);
				match(RIGHT_PAREN);
				setState(367);
				match(ARROW);
				setState(368);
				((FunctionTypeContext)_localctx).returnType = type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParametersContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public List<Token> typenames = new ArrayList<Token>();
		public TerminalNode LESS() { return getToken(FridayParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(FridayParser.GREATER, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(FridayParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FridayParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FridayParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FridayParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FridayParserVisitor ) return ((FridayParserVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeParameters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(LESS);
			setState(372);
			((TypeParametersContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			((TypeParametersContext)_localctx).typenames.add(((TypeParametersContext)_localctx).IDENTIFIER);
			setState(377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(373);
					match(COMMA);
					setState(374);
					((TypeParametersContext)_localctx).IDENTIFIER = match(IDENTIFIER);
					((TypeParametersContext)_localctx).typenames.add(((TypeParametersContext)_localctx).IDENTIFIER);
					}
					} 
				}
				setState(379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(380);
			match(GREATER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 18);
		case 11:
			return precpred(_ctx, 17);
		case 12:
			return precpred(_ctx, 16);
		case 13:
			return precpred(_ctx, 15);
		case 14:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001N\u017f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"%\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"+\b\u0002\n\u0002\f\u0002.\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0003\u00047\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004C\b\u0004"+
		"\n\u0004\f\u0004F\t\u0004\u0003\u0004H\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004P\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"]\b\u0004\n\u0004\f\u0004`\t\u0004\u0003\u0004b\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004i\b\u0004\u0001"+
		"\u0005\u0003\u0005l\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005q\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005u\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"}\b\u0005\n\u0005\f\u0005\u0080\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u008a\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u0097\b\u0006\n\u0006\f\u0006\u009a\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u009e\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00a9\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00ae\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00b2\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00be\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00c7\b\u0006\u0001\u0007\u0001\u0007\u0005\u0007\u00cb"+
		"\b\u0007\n\u0007\f\u0007\u00ce\t\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0005\b\u00d4\b\b\n\b\f\b\u00d7\t\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u00de\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u00f2\b\t\n\t\f\t\u00f5\t\t\u0003\t"+
		"\u00f7\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00ff"+
		"\b\t\n\t\f\t\u0102\t\t\u0003\t\u0104\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u010f\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u0136\b\t\n\t\f\t\u0139\t\t\u0003\t\u013b\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u0149\b\t\n\t\f\t\u014c\t\t\u0001\n\u0001\n\u0001\n\u0005\n"+
		"\u0151\b\n\n\n\f\n\u0154\t\n\u0001\n\u0003\n\u0157\b\n\u0001\n\u0004\n"+
		"\u015a\b\n\u000b\n\f\n\u015b\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0168\b\n\n\n\f\n\u016b\t\n"+
		"\u0003\n\u016d\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u0172\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0178\b\u000b\n\u000b"+
		"\f\u000b\u017b\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0006,\u0098"+
		"\u00f3\u0100\u0152\u0179\u0001\u0012\f\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0000\r\u0001\u0000\u0004\u0005\u0001\u0000M"+
		"N\u0001\u0000FG\u0001\u0000\u0010\u0011\u0004\u0000-/44HHLL\u0001\u0000"+
		"\u0017\u0018\u0001\u0000/1\u0001\u0000-.\u0001\u000023\u0001\u000069\u0001"+
		"\u0000:;\u0001\u0000<E\u0001\u0000+,\u01be\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0002$\u0001\u0000\u0000\u0000\u0004&\u0001\u0000\u0000\u0000\u0006"+
		"1\u0001\u0000\u0000\u0000\bh\u0001\u0000\u0000\u0000\nk\u0001\u0000\u0000"+
		"\u0000\f\u00c6\u0001\u0000\u0000\u0000\u000e\u00c8\u0001\u0000\u0000\u0000"+
		"\u0010\u00dd\u0001\u0000\u0000\u0000\u0012\u010e\u0001\u0000\u0000\u0000"+
		"\u0014\u0171\u0001\u0000\u0000\u0000\u0016\u0173\u0001\u0000\u0000\u0000"+
		"\u0018\u001a\u0003\u0002\u0001\u0000\u0019\u0018\u0001\u0000\u0000\u0000"+
		"\u001a\u001d\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001e\u0001\u0000\u0000\u0000"+
		"\u001d\u001b\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0000\u0000\u0001"+
		"\u001f\u0001\u0001\u0000\u0000\u0000 %\u0003\u0006\u0003\u0000!%\u0003"+
		"\u0004\u0002\u0000\"%\u0003\n\u0005\u0000#%\u0003\b\u0004\u0000$ \u0001"+
		"\u0000\u0000\u0000$!\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000"+
		"$#\u0001\u0000\u0000\u0000%\u0003\u0001\u0000\u0000\u0000&\'\u0005\u000e"+
		"\u0000\u0000\',\u0005N\u0000\u0000()\u0005I\u0000\u0000)+\u0005N\u0000"+
		"\u0000*(\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000,-\u0001\u0000"+
		"\u0000\u0000,*\u0001\u0000\u0000\u0000-/\u0001\u0000\u0000\u0000.,\u0001"+
		"\u0000\u0000\u0000/0\u0005&\u0000\u00000\u0005\u0001\u0000\u0000\u0000"+
		"12\u0005\u000f\u0000\u000023\u0005N\u0000\u000034\u0005&\u0000\u00004"+
		"\u0007\u0001\u0000\u0000\u000057\u0007\u0000\u0000\u000065\u0001\u0000"+
		"\u0000\u000067\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0005"+
		"\t\u0000\u00009:\u0007\u0001\u0000\u0000:G\u0005 \u0000\u0000;<\u0005"+
		"N\u0000\u0000<=\u0005\'\u0000\u0000=D\u0003\u0014\n\u0000>?\u0005(\u0000"+
		"\u0000?@\u0005N\u0000\u0000@A\u0005\'\u0000\u0000AC\u0003\u0014\n\u0000"+
		"B>\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000"+
		"\u0000DE\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000"+
		"\u0000\u0000G;\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IJ\u0005#\u0000\u0000JK\u0005)\u0000\u0000KL\u0003\u0014"+
		"\n\u0000LM\u0003\u0010\b\u0000Mi\u0001\u0000\u0000\u0000NP\u0007\u0000"+
		"\u0000\u0000ON\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000QR\u0005\r\u0000\u0000RS\u0005\t\u0000\u0000ST\u0005"+
		"N\u0000\u0000Ta\u0005 \u0000\u0000UV\u0005N\u0000\u0000VW\u0005\'\u0000"+
		"\u0000W^\u0003\u0014\n\u0000XY\u0005(\u0000\u0000YZ\u0005N\u0000\u0000"+
		"Z[\u0005\'\u0000\u0000[]\u0003\u0014\n\u0000\\X\u0001\u0000\u0000\u0000"+
		"]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000"+
		"\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000aU\u0001\u0000"+
		"\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0005"+
		"#\u0000\u0000de\u0005)\u0000\u0000ef\u0003\u0014\n\u0000fg\u0005&\u0000"+
		"\u0000gi\u0001\u0000\u0000\u0000h6\u0001\u0000\u0000\u0000hO\u0001\u0000"+
		"\u0000\u0000i\t\u0001\u0000\u0000\u0000jl\u0007\u0000\u0000\u0000kj\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000"+
		"mn\u0005\u0006\u0000\u0000np\u0005N\u0000\u0000oq\u0003\u0016\u000b\u0000"+
		"po\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000"+
		"\u0000r~\u0005\"\u0000\u0000su\u0007\u0000\u0000\u0000ts\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0005N\u0000"+
		"\u0000wx\u0005\'\u0000\u0000xy\u0003\u0014\n\u0000yz\u0005&\u0000\u0000"+
		"z}\u0001\u0000\u0000\u0000{}\u0003\b\u0004\u0000|t\u0001\u0000\u0000\u0000"+
		"|{\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0081\u0001\u0000\u0000"+
		"\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0082\u0005%\u0000\u0000\u0082"+
		"\u000b\u0001\u0000\u0000\u0000\u0083\u0084\u0005\b\u0000\u0000\u0084\u0085"+
		"\u0003\u0012\t\u0000\u0085\u0086\u0005&\u0000\u0000\u0086\u00c7\u0001"+
		"\u0000\u0000\u0000\u0087\u0089\u0005\u0007\u0000\u0000\u0088\u008a\u0003"+
		"\u0012\t\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u00c7\u0005&\u0000"+
		"\u0000\u008c\u008d\u0003\u0012\t\u0000\u008d\u008e\u0005&\u0000\u0000"+
		"\u008e\u00c7\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0013\u0000\u0000"+
		"\u0090\u0091\u0003\u0012\t\u0000\u0091\u0098\u0003\u000e\u0007\u0000\u0092"+
		"\u0093\u0005\u0014\u0000\u0000\u0093\u0094\u0003\u0012\t\u0000\u0094\u0095"+
		"\u0003\u000e\u0007\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0092"+
		"\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009d"+
		"\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0005\u0015\u0000\u0000\u009c\u009e\u0003\f\u0006\u0000\u009d\u009b\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00c7\u0001"+
		"\u0000\u0000\u0000\u009f\u00ad\u0005\n\u0000\u0000\u00a0\u00a1\u0005N"+
		"\u0000\u0000\u00a1\u00a2\u0005\'\u0000\u0000\u00a2\u00a3\u0003\u0012\t"+
		"\u0000\u00a3\u00a4\u0007\u0002\u0000\u0000\u00a4\u00a5\u0003\u0012\t\u0000"+
		"\u00a5\u00ae\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005N\u0000\u0000\u00a7"+
		"\u00a9\u0005(\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0005N\u0000\u0000\u00ab\u00ac\u0005\'\u0000\u0000\u00ac\u00ae\u0003"+
		"\u0012\t\u0000\u00ad\u00a0\u0001\u0000\u0000\u0000\u00ad\u00a8\u0001\u0000"+
		"\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0019"+
		"\u0000\u0000\u00b0\u00b2\u0003\u0012\t\u0000\u00b1\u00af\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0003\u000e\u0007\u0000\u00b4\u00c7\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0005\u000b\u0000\u0000\u00b6\u00b7\u0003\u0012\t\u0000"+
		"\u00b7\u00b8\u0003\u000e\u0007\u0000\u00b8\u00c7\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0007\u0003\u0000\u0000\u00ba\u00bd\u0005N\u0000\u0000\u00bb"+
		"\u00bc\u0005\'\u0000\u0000\u00bc\u00be\u0003\u0014\n\u0000\u00bd\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005<\u0000\u0000\u00c0\u00c1\u0003"+
		"\u0012\t\u0000\u00c1\u00c2\u0005&\u0000\u0000\u00c2\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0005\f\u0000\u0000\u00c4\u00c7\u0003\f\u0006"+
		"\u0000\u00c5\u00c7\u0003\u000e\u0007\u0000\u00c6\u0083\u0001\u0000\u0000"+
		"\u0000\u00c6\u0087\u0001\u0000\u0000\u0000\u00c6\u008c\u0001\u0000\u0000"+
		"\u0000\u00c6\u008f\u0001\u0000\u0000\u0000\u00c6\u009f\u0001\u0000\u0000"+
		"\u0000\u00c6\u00b5\u0001\u0000\u0000\u0000\u00c6\u00b9\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c7\r\u0001\u0000\u0000\u0000\u00c8\u00cc\u0005\"\u0000\u0000"+
		"\u00c9\u00cb\u0003\f\u0006\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb"+
		"\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005%\u0000\u0000\u00d0\u000f"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d5\u0005\"\u0000\u0000\u00d2\u00d4\u0003"+
		"\f\u0006\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d8\u00de\u0005%\u0000\u0000\u00d9\u00da\u0005*\u0000\u0000"+
		"\u00da\u00db\u0003\u0012\t\u0000\u00db\u00dc\u0005&\u0000\u0000\u00dc"+
		"\u00de\u0001\u0000\u0000\u0000\u00dd\u00d1\u0001\u0000\u0000\u0000\u00dd"+
		"\u00d9\u0001\u0000\u0000\u0000\u00de\u0011\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0006\t\uffff\uffff\u0000\u00e0\u010f\u0005N\u0000\u0000\u00e1"+
		"\u010f\u0005\u001c\u0000\u0000\u00e2\u010f\u0005\u001f\u0000\u0000\u00e3"+
		"\u010f\u0005\u001e\u0000\u0000\u00e4\u010f\u0005\u001d\u0000\u0000\u00e5"+
		"\u010f\u0005\u001a\u0000\u0000\u00e6\u010f\u0005\u001b\u0000\u0000\u00e7"+
		"\u00e8\u0005\u0012\u0000\u0000\u00e8\u00e9\u0003\u0014\n\u0000\u00e9\u00f6"+
		"\u0005\"\u0000\u0000\u00ea\u00eb\u0005N\u0000\u0000\u00eb\u00ec\u0005"+
		"\'\u0000\u0000\u00ec\u00f3\u0003\u0012\t\u0000\u00ed\u00ee\u0005(\u0000"+
		"\u0000\u00ee\u00ef\u0005N\u0000\u0000\u00ef\u00f0\u0005\'\u0000\u0000"+
		"\u00f0\u00f2\u0003\u0012\t\u0000\u00f1\u00ed\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f6\u00ea\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f9\u0005%\u0000\u0000\u00f9\u010f\u0001\u0000\u0000\u0000\u00fa\u0103"+
		"\u0005!\u0000\u0000\u00fb\u0100\u0003\u0012\t\u0000\u00fc\u00fd\u0005"+
		"(\u0000\u0000\u00fd\u00ff\u0003\u0012\t\u0000\u00fe\u00fc\u0001\u0000"+
		"\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000"+
		"\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u0104\u0001\u0000"+
		"\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u00fb\u0001\u0000"+
		"\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000"+
		"\u0000\u0000\u0105\u010f\u0005$\u0000\u0000\u0106\u0107\u0007\u0004\u0000"+
		"\u0000\u0107\u010f\u0003\u0012\t\u000e\u0108\u0109\u0007\u0005\u0000\u0000"+
		"\u0109\u010f\u0003\u0014\n\u0000\u010a\u010b\u0005 \u0000\u0000\u010b"+
		"\u010c\u0003\u0012\t\u0000\u010c\u010d\u0005#\u0000\u0000\u010d\u010f"+
		"\u0001\u0000\u0000\u0000\u010e\u00df\u0001\u0000\u0000\u0000\u010e\u00e1"+
		"\u0001\u0000\u0000\u0000\u010e\u00e2\u0001\u0000\u0000\u0000\u010e\u00e3"+
		"\u0001\u0000\u0000\u0000\u010e\u00e4\u0001\u0000\u0000\u0000\u010e\u00e5"+
		"\u0001\u0000\u0000\u0000\u010e\u00e6\u0001\u0000\u0000\u0000\u010e\u00e7"+
		"\u0001\u0000\u0000\u0000\u010e\u00fa\u0001\u0000\u0000\u0000\u010e\u0106"+
		"\u0001\u0000\u0000\u0000\u010e\u0108\u0001\u0000\u0000\u0000\u010e\u010a"+
		"\u0001\u0000\u0000\u0000\u010f\u014a\u0001\u0000\u0000\u0000\u0110\u0111"+
		"\n\u000b\u0000\u0000\u0111\u0112\u0007\u0006\u0000\u0000\u0112\u0149\u0003"+
		"\u0012\t\f\u0113\u0114\n\n\u0000\u0000\u0114\u0115\u0007\u0007\u0000\u0000"+
		"\u0115\u0149\u0003\u0012\t\u000b\u0116\u0117\n\t\u0000\u0000\u0117\u0118"+
		"\u0007\b\u0000\u0000\u0118\u0149\u0003\u0012\t\n\u0119\u011a\n\b\u0000"+
		"\u0000\u011a\u011b\u0007\t\u0000\u0000\u011b\u0149\u0003\u0012\t\t\u011c"+
		"\u011d\n\u0007\u0000\u0000\u011d\u011e\u0007\n\u0000\u0000\u011e\u0149"+
		"\u0003\u0012\t\b\u011f\u0120\n\u0006\u0000\u0000\u0120\u0121\u00054\u0000"+
		"\u0000\u0121\u0149\u0003\u0012\t\u0007\u0122\u0123\n\u0005\u0000\u0000"+
		"\u0123\u0124\u00055\u0000\u0000\u0124\u0149\u0003\u0012\t\u0006\u0125"+
		"\u0126\n\u0004\u0000\u0000\u0126\u0127\u0005J\u0000\u0000\u0127\u0149"+
		"\u0003\u0012\t\u0005\u0128\u0129\n\u0003\u0000\u0000\u0129\u012a\u0005"+
		"K\u0000\u0000\u012a\u0149\u0003\u0012\t\u0004\u012b\u012c\n\u0002\u0000"+
		"\u0000\u012c\u012d\u0007\u000b\u0000\u0000\u012d\u0149\u0003\u0012\t\u0002"+
		"\u012e\u012f\n\u0012\u0000\u0000\u012f\u0149\u0007\f\u0000\u0000\u0130"+
		"\u0131\n\u0011\u0000\u0000\u0131\u013a\u0005 \u0000\u0000\u0132\u0137"+
		"\u0003\u0012\t\u0000\u0133\u0134\u0005(\u0000\u0000\u0134\u0136\u0003"+
		"\u0012\t\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0136\u0139\u0001\u0000"+
		"\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000"+
		"\u0000\u0000\u0138\u013b\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000"+
		"\u0000\u0000\u013a\u0132\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u0149\u0005#\u0000"+
		"\u0000\u013d\u013e\n\u0010\u0000\u0000\u013e\u013f\u0005!\u0000\u0000"+
		"\u013f\u0140\u0003\u0012\t\u0000\u0140\u0141\u0005$\u0000\u0000\u0141"+
		"\u0149\u0001\u0000\u0000\u0000\u0142\u0143\n\u000f\u0000\u0000\u0143\u0144"+
		"\u0005I\u0000\u0000\u0144\u0149\u0005N\u0000\u0000\u0145\u0146\n\f\u0000"+
		"\u0000\u0146\u0147\u0005\u0016\u0000\u0000\u0147\u0149\u0003\u0014\n\u0000"+
		"\u0148\u0110\u0001\u0000\u0000\u0000\u0148\u0113\u0001\u0000\u0000\u0000"+
		"\u0148\u0116\u0001\u0000\u0000\u0000\u0148\u0119\u0001\u0000\u0000\u0000"+
		"\u0148\u011c\u0001\u0000\u0000\u0000\u0148\u011f\u0001\u0000\u0000\u0000"+
		"\u0148\u0122\u0001\u0000\u0000\u0000\u0148\u0125\u0001\u0000\u0000\u0000"+
		"\u0148\u0128\u0001\u0000\u0000\u0000\u0148\u012b\u0001\u0000\u0000\u0000"+
		"\u0148\u012e\u0001\u0000\u0000\u0000\u0148\u0130\u0001\u0000\u0000\u0000"+
		"\u0148\u013d\u0001\u0000\u0000\u0000\u0148\u0142\u0001\u0000\u0000\u0000"+
		"\u0148\u0145\u0001\u0000\u0000\u0000\u0149\u014c\u0001\u0000\u0000\u0000"+
		"\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000"+
		"\u014b\u0013\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000"+
		"\u014d\u0152\u0005N\u0000\u0000\u014e\u014f\u0005I\u0000\u0000\u014f\u0151"+
		"\u0005N\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151\u0154\u0001"+
		"\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0152\u0150\u0001"+
		"\u0000\u0000\u0000\u0153\u0156\u0001\u0000\u0000\u0000\u0154\u0152\u0001"+
		"\u0000\u0000\u0000\u0155\u0157\u0003\u0016\u000b\u0000\u0156\u0155\u0001"+
		"\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0172\u0001"+
		"\u0000\u0000\u0000\u0158\u015a\u0005/\u0000\u0000\u0159\u0158\u0001\u0000"+
		"\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000"+
		"\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000"+
		"\u0000\u0000\u015d\u0172\u0003\u0014\n\u0000\u015e\u015f\u0005!\u0000"+
		"\u0000\u015f\u0160\u0005$\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000"+
		"\u0161\u0172\u0003\u0014\n\u0000\u0162\u0163\u0005\t\u0000\u0000\u0163"+
		"\u016c\u0005 \u0000\u0000\u0164\u0169\u0003\u0014\n\u0000\u0165\u0166"+
		"\u0005(\u0000\u0000\u0166\u0168\u0003\u0014\n\u0000\u0167\u0165\u0001"+
		"\u0000\u0000\u0000\u0168\u016b\u0001\u0000\u0000\u0000\u0169\u0167\u0001"+
		"\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016d\u0001"+
		"\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016c\u0164\u0001"+
		"\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016e\u0001"+
		"\u0000\u0000\u0000\u016e\u016f\u0005#\u0000\u0000\u016f\u0170\u0005)\u0000"+
		"\u0000\u0170\u0172\u0003\u0014\n\u0000\u0171\u014d\u0001\u0000\u0000\u0000"+
		"\u0171\u0159\u0001\u0000\u0000\u0000\u0171\u015e\u0001\u0000\u0000\u0000"+
		"\u0171\u0162\u0001\u0000\u0000\u0000\u0172\u0015\u0001\u0000\u0000\u0000"+
		"\u0173\u0174\u00056\u0000\u0000\u0174\u0179\u0005N\u0000\u0000\u0175\u0176"+
		"\u0005(\u0000\u0000\u0176\u0178\u0005N\u0000\u0000\u0177\u0175\u0001\u0000"+
		"\u0000\u0000\u0178\u017b\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000"+
		"\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u017a\u017c\u0001\u0000"+
		"\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017c\u017d\u00057\u0000"+
		"\u0000\u017d\u0017\u0001\u0000\u0000\u0000*\u001b$,6DGO^ahkpt|~\u0089"+
		"\u0098\u009d\u00a8\u00ad\u00b1\u00bd\u00c6\u00cc\u00d5\u00dd\u00f3\u00f6"+
		"\u0100\u0103\u010e\u0137\u013a\u0148\u014a\u0152\u0156\u015b\u0169\u016c"+
		"\u0171\u0179";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}