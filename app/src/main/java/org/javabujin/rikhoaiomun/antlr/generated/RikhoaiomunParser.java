// Generated from Rikhoaiomun.g4 by ANTLR 4.13.2
package org.javabujin.rikhoaiomun.antlr.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class RikhoaiomunParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, IDENTIFIER=13, MULTILINE_STRING_LITERAL=14, 
		NEWLINE=15, WS=16;
	public static final int
		RULE_specification = 0, RULE_systemDecl = 1, RULE_moduleDecl = 2, RULE_entityDecl = 3, 
		RULE_fieldDecl = 4, RULE_featureDecl = 5, RULE_inputsDecl = 6, RULE_outputsDecl = 7, 
		RULE_commentDecl = 8, RULE_qualifiedName = 9, RULE_type = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"specification", "systemDecl", "moduleDecl", "entityDecl", "fieldDecl", 
			"featureDecl", "inputsDecl", "outputsDecl", "commentDecl", "qualifiedName", 
			"type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@System'", "'@Module'", "'@Entity'", "':'", "'-'", "'@Feature'", 
			"'('", "')'", "'@Inputs:'", "'@Outputs:'", "'@Comment:'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "IDENTIFIER", "MULTILINE_STRING_LITERAL", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "Rikhoaiomun.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RikhoaiomunParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SpecificationContext extends ParserRuleContext {
		public SystemDeclContext systemDecl() {
			return getRuleContext(SystemDeclContext.class,0);
		}
		public ModuleDeclContext moduleDecl() {
			return getRuleContext(ModuleDeclContext.class,0);
		}
		public TerminalNode EOF() { return getToken(RikhoaiomunParser.EOF, 0); }
		public List<EntityDeclContext> entityDecl() {
			return getRuleContexts(EntityDeclContext.class);
		}
		public EntityDeclContext entityDecl(int i) {
			return getRuleContext(EntityDeclContext.class,i);
		}
		public List<FeatureDeclContext> featureDecl() {
			return getRuleContexts(FeatureDeclContext.class);
		}
		public FeatureDeclContext featureDecl(int i) {
			return getRuleContext(FeatureDeclContext.class,i);
		}
		public SpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RikhoaiomunVisitor ) return ((RikhoaiomunVisitor<? extends T>)visitor).visitSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecificationContext specification() throws RecognitionException {
		SpecificationContext _localctx = new SpecificationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			systemDecl();
			setState(23);
			moduleDecl();
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(24);
				entityDecl();
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(25);
					featureDecl();
					}
					}
					setState(30);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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
	public static class SystemDeclContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SystemDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RikhoaiomunVisitor ) return ((RikhoaiomunVisitor<? extends T>)visitor).visitSystemDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemDeclContext systemDecl() throws RecognitionException {
		SystemDeclContext _localctx = new SystemDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_systemDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__0);
			setState(39);
			qualifiedName();
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
	public static class ModuleDeclContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ModuleDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RikhoaiomunVisitor ) return ((RikhoaiomunVisitor<? extends T>)visitor).visitModuleDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleDeclContext moduleDecl() throws RecognitionException {
		ModuleDeclContext _localctx = new ModuleDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_moduleDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__1);
			setState(42);
			qualifiedName();
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
	public static class EntityDeclContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(RikhoaiomunParser.IDENTIFIER, 0); }
		public List<FieldDeclContext> fieldDecl() {
			return getRuleContexts(FieldDeclContext.class);
		}
		public FieldDeclContext fieldDecl(int i) {
			return getRuleContext(FieldDeclContext.class,i);
		}
		public EntityDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RikhoaiomunVisitor ) return ((RikhoaiomunVisitor<? extends T>)visitor).visitEntityDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityDeclContext entityDecl() throws RecognitionException {
		EntityDeclContext _localctx = new EntityDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_entityDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__2);
			setState(45);
			match(IDENTIFIER);
			setState(46);
			match(T__3);
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47);
				fieldDecl();
				}
				}
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
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
	public static class FieldDeclContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(RikhoaiomunParser.IDENTIFIER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RikhoaiomunVisitor ) return ((RikhoaiomunVisitor<? extends T>)visitor).visitFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__4);
			setState(53);
			match(IDENTIFIER);
			setState(54);
			match(T__3);
			setState(55);
			type();
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
	public static class FeatureDeclContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(RikhoaiomunParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(RikhoaiomunParser.IDENTIFIER, i);
		}
		public TerminalNode NEWLINE() { return getToken(RikhoaiomunParser.NEWLINE, 0); }
		public InputsDeclContext inputsDecl() {
			return getRuleContext(InputsDeclContext.class,0);
		}
		public OutputsDeclContext outputsDecl() {
			return getRuleContext(OutputsDeclContext.class,0);
		}
		public CommentDeclContext commentDecl() {
			return getRuleContext(CommentDeclContext.class,0);
		}
		public FeatureDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RikhoaiomunVisitor ) return ((RikhoaiomunVisitor<? extends T>)visitor).visitFeatureDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureDeclContext featureDecl() throws RecognitionException {
		FeatureDeclContext _localctx = new FeatureDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_featureDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__5);
			setState(58);
			match(T__6);
			setState(59);
			match(IDENTIFIER);
			setState(60);
			match(T__7);
			setState(61);
			match(T__3);
			setState(62);
			match(IDENTIFIER);
			setState(63);
			match(NEWLINE);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(64);
				inputsDecl();
				}
			}

			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(67);
				outputsDecl();
				}
			}

			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(70);
				commentDecl();
				}
			}

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
	public static class InputsDeclContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(RikhoaiomunParser.NEWLINE, 0); }
		public List<FieldDeclContext> fieldDecl() {
			return getRuleContexts(FieldDeclContext.class);
		}
		public FieldDeclContext fieldDecl(int i) {
			return getRuleContext(FieldDeclContext.class,i);
		}
		public InputsDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputsDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RikhoaiomunVisitor ) return ((RikhoaiomunVisitor<? extends T>)visitor).visitInputsDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputsDeclContext inputsDecl() throws RecognitionException {
		InputsDeclContext _localctx = new InputsDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inputsDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__8);
			setState(74);
			match(NEWLINE);
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75);
				fieldDecl();
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
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
	public static class OutputsDeclContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(RikhoaiomunParser.NEWLINE, 0); }
		public List<FieldDeclContext> fieldDecl() {
			return getRuleContexts(FieldDeclContext.class);
		}
		public FieldDeclContext fieldDecl(int i) {
			return getRuleContext(FieldDeclContext.class,i);
		}
		public OutputsDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputsDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RikhoaiomunVisitor ) return ((RikhoaiomunVisitor<? extends T>)visitor).visitOutputsDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputsDeclContext outputsDecl() throws RecognitionException {
		OutputsDeclContext _localctx = new OutputsDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_outputsDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__9);
			setState(81);
			match(NEWLINE);
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82);
				fieldDecl();
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
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
	public static class CommentDeclContext extends ParserRuleContext {
		public TerminalNode MULTILINE_STRING_LITERAL() { return getToken(RikhoaiomunParser.MULTILINE_STRING_LITERAL, 0); }
		public CommentDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RikhoaiomunVisitor ) return ((RikhoaiomunVisitor<? extends T>)visitor).visitCommentDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentDeclContext commentDecl() throws RecognitionException {
		CommentDeclContext _localctx = new CommentDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_commentDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__10);
			setState(88);
			match(MULTILINE_STRING_LITERAL);
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
	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(RikhoaiomunParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(RikhoaiomunParser.IDENTIFIER, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RikhoaiomunVisitor ) return ((RikhoaiomunVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(IDENTIFIER);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(91);
				match(T__11);
				setState(92);
				match(IDENTIFIER);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(RikhoaiomunParser.IDENTIFIER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RikhoaiomunVisitor ) return ((RikhoaiomunVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(IDENTIFIER);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0010e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\u001b\b\u0000\n\u0000\f\u0000\u001e\t\u0000"+
		"\u0005\u0000 \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u00031\b\u0003"+
		"\u000b\u0003\f\u00032\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005B\b\u0005\u0001\u0005"+
		"\u0003\u0005E\b\u0005\u0001\u0005\u0003\u0005H\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0004\u0006M\b\u0006\u000b\u0006\f\u0006N\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007T\b\u0007\u000b\u0007\f\u0007U\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t^\b\t\n\t\f\ta\t\t\u0001"+
		"\n\u0001\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0000\u0000b\u0000\u0016\u0001\u0000\u0000\u0000\u0002"+
		"&\u0001\u0000\u0000\u0000\u0004)\u0001\u0000\u0000\u0000\u0006,\u0001"+
		"\u0000\u0000\u0000\b4\u0001\u0000\u0000\u0000\n9\u0001\u0000\u0000\u0000"+
		"\fI\u0001\u0000\u0000\u0000\u000eP\u0001\u0000\u0000\u0000\u0010W\u0001"+
		"\u0000\u0000\u0000\u0012Z\u0001\u0000\u0000\u0000\u0014b\u0001\u0000\u0000"+
		"\u0000\u0016\u0017\u0003\u0002\u0001\u0000\u0017!\u0003\u0004\u0002\u0000"+
		"\u0018\u001c\u0003\u0006\u0003\u0000\u0019\u001b\u0003\n\u0005\u0000\u001a"+
		"\u0019\u0001\u0000\u0000\u0000\u001b\u001e\u0001\u0000\u0000\u0000\u001c"+
		"\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d"+
		" \u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001f\u0018"+
		"\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000"+
		"\u0000\u0000!\"\u0001\u0000\u0000\u0000\"$\u0001\u0000\u0000\u0000#!\u0001"+
		"\u0000\u0000\u0000$%\u0005\u0000\u0000\u0001%\u0001\u0001\u0000\u0000"+
		"\u0000&\'\u0005\u0001\u0000\u0000\'(\u0003\u0012\t\u0000(\u0003\u0001"+
		"\u0000\u0000\u0000)*\u0005\u0002\u0000\u0000*+\u0003\u0012\t\u0000+\u0005"+
		"\u0001\u0000\u0000\u0000,-\u0005\u0003\u0000\u0000-.\u0005\r\u0000\u0000"+
		".0\u0005\u0004\u0000\u0000/1\u0003\b\u0004\u00000/\u0001\u0000\u0000\u0000"+
		"12\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000"+
		"\u00003\u0007\u0001\u0000\u0000\u000045\u0005\u0005\u0000\u000056\u0005"+
		"\r\u0000\u000067\u0005\u0004\u0000\u000078\u0003\u0014\n\u00008\t\u0001"+
		"\u0000\u0000\u00009:\u0005\u0006\u0000\u0000:;\u0005\u0007\u0000\u0000"+
		";<\u0005\r\u0000\u0000<=\u0005\b\u0000\u0000=>\u0005\u0004\u0000\u0000"+
		">?\u0005\r\u0000\u0000?A\u0005\u000f\u0000\u0000@B\u0003\f\u0006\u0000"+
		"A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000"+
		"\u0000CE\u0003\u000e\u0007\u0000DC\u0001\u0000\u0000\u0000DE\u0001\u0000"+
		"\u0000\u0000EG\u0001\u0000\u0000\u0000FH\u0003\u0010\b\u0000GF\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000H\u000b\u0001\u0000\u0000\u0000"+
		"IJ\u0005\t\u0000\u0000JL\u0005\u000f\u0000\u0000KM\u0003\b\u0004\u0000"+
		"LK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000"+
		"\u0000NO\u0001\u0000\u0000\u0000O\r\u0001\u0000\u0000\u0000PQ\u0005\n"+
		"\u0000\u0000QS\u0005\u000f\u0000\u0000RT\u0003\b\u0004\u0000SR\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001"+
		"\u0000\u0000\u0000V\u000f\u0001\u0000\u0000\u0000WX\u0005\u000b\u0000"+
		"\u0000XY\u0005\u000e\u0000\u0000Y\u0011\u0001\u0000\u0000\u0000Z_\u0005"+
		"\r\u0000\u0000[\\\u0005\f\u0000\u0000\\^\u0005\r\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`\u0013\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000bc\u0005\r\u0000\u0000c\u0015\u0001\u0000\u0000\u0000\t\u001c!2"+
		"ADGNU_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}