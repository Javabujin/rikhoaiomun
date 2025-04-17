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
		RULE_specification = 0, RULE_systemDecl = 1, RULE_moduleDecl = 2, RULE_entityAndFeatureDecl = 3, 
		RULE_entityDecl = 4, RULE_fieldDecl = 5, RULE_featureDecl = 6, RULE_inputsDecl = 7, 
		RULE_outputsDecl = 8, RULE_commentDecl = 9, RULE_qualifiedName = 10, RULE_type = 11, 
		RULE_name = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"specification", "systemDecl", "moduleDecl", "entityAndFeatureDecl", 
			"entityDecl", "fieldDecl", "featureDecl", "inputsDecl", "outputsDecl", 
			"commentDecl", "qualifiedName", "type", "name"
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
		public List<EntityAndFeatureDeclContext> entityAndFeatureDecl() {
			return getRuleContexts(EntityAndFeatureDeclContext.class);
		}
		public EntityAndFeatureDeclContext entityAndFeatureDecl(int i) {
			return getRuleContext(EntityAndFeatureDeclContext.class,i);
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
			setState(26);
			systemDecl();
			setState(27);
			moduleDecl();
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				entityAndFeatureDecl();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
			setState(33);
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
			setState(35);
			match(T__0);
			setState(36);
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
			setState(38);
			match(T__1);
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
	public static class EntityAndFeatureDeclContext extends ParserRuleContext {
		public EntityDeclContext entityDecl() {
			return getRuleContext(EntityDeclContext.class,0);
		}
		public List<FeatureDeclContext> featureDecl() {
			return getRuleContexts(FeatureDeclContext.class);
		}
		public FeatureDeclContext featureDecl(int i) {
			return getRuleContext(FeatureDeclContext.class,i);
		}
		public EntityAndFeatureDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityAndFeatureDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RikhoaiomunVisitor ) return ((RikhoaiomunVisitor<? extends T>)visitor).visitEntityAndFeatureDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityAndFeatureDeclContext entityAndFeatureDecl() throws RecognitionException {
		EntityAndFeatureDeclContext _localctx = new EntityAndFeatureDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_entityAndFeatureDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			entityDecl();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(42);
				featureDecl();
				}
				}
				setState(47);
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
	public static class EntityDeclContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_entityDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__2);
			setState(49);
			name();
			setState(50);
			match(T__3);
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51);
				fieldDecl();
				}
				}
				setState(54); 
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
		enterRule(_localctx, 10, RULE_fieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__4);
			setState(57);
			match(IDENTIFIER);
			setState(58);
			match(T__3);
			setState(59);
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
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
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
		enterRule(_localctx, 12, RULE_featureDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__5);
			setState(62);
			match(T__6);
			setState(63);
			name();
			setState(64);
			match(T__7);
			setState(65);
			match(T__3);
			setState(66);
			name();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(67);
				inputsDecl();
				}
			}

			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(70);
				outputsDecl();
				}
			}

			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(73);
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
		enterRule(_localctx, 14, RULE_inputsDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__8);
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77);
				fieldDecl();
				}
				}
				setState(80); 
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
		enterRule(_localctx, 16, RULE_outputsDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__9);
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				fieldDecl();
				}
				}
				setState(86); 
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
		enterRule(_localctx, 18, RULE_commentDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__10);
			setState(89);
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
		enterRule(_localctx, 20, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(IDENTIFIER);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(92);
				match(T__11);
				setState(93);
				match(IDENTIFIER);
				}
				}
				setState(98);
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
		enterRule(_localctx, 22, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(RikhoaiomunParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(RikhoaiomunParser.IDENTIFIER, i);
		}
		public List<TerminalNode> WS() { return getTokens(RikhoaiomunParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(RikhoaiomunParser.WS, i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RikhoaiomunVisitor ) return ((RikhoaiomunVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(101);
				match(IDENTIFIER);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(102);
					match(WS);
					}
				}

				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
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
		"\u0004\u0001\u0010n\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u001e\b\u0000"+
		"\u000b\u0000\f\u0000\u001f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0005\u0003,\b\u0003\n\u0003\f\u0003/\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0004\u00045\b\u0004\u000b\u0004\f\u00046\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006E\b\u0006\u0001\u0006\u0003\u0006H\b\u0006\u0001\u0006\u0003\u0006"+
		"K\b\u0006\u0001\u0007\u0001\u0007\u0004\u0007O\b\u0007\u000b\u0007\f\u0007"+
		"P\u0001\b\u0001\b\u0004\bU\b\b\u000b\b\f\bV\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0005\n_\b\n\n\n\f\nb\t\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0003\fh\b\f\u0004\fj\b\f\u000b\f\f\fk\u0001\f\u0000\u0000"+
		"\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000"+
		"\u0000k\u0000\u001a\u0001\u0000\u0000\u0000\u0002#\u0001\u0000\u0000\u0000"+
		"\u0004&\u0001\u0000\u0000\u0000\u0006)\u0001\u0000\u0000\u0000\b0\u0001"+
		"\u0000\u0000\u0000\n8\u0001\u0000\u0000\u0000\f=\u0001\u0000\u0000\u0000"+
		"\u000eL\u0001\u0000\u0000\u0000\u0010R\u0001\u0000\u0000\u0000\u0012X"+
		"\u0001\u0000\u0000\u0000\u0014[\u0001\u0000\u0000\u0000\u0016c\u0001\u0000"+
		"\u0000\u0000\u0018i\u0001\u0000\u0000\u0000\u001a\u001b\u0003\u0002\u0001"+
		"\u0000\u001b\u001d\u0003\u0004\u0002\u0000\u001c\u001e\u0003\u0006\u0003"+
		"\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000"+
		"\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000"+
		" !\u0001\u0000\u0000\u0000!\"\u0005\u0000\u0000\u0001\"\u0001\u0001\u0000"+
		"\u0000\u0000#$\u0005\u0001\u0000\u0000$%\u0003\u0014\n\u0000%\u0003\u0001"+
		"\u0000\u0000\u0000&\'\u0005\u0002\u0000\u0000\'(\u0003\u0014\n\u0000("+
		"\u0005\u0001\u0000\u0000\u0000)-\u0003\b\u0004\u0000*,\u0003\f\u0006\u0000"+
		"+*\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000"+
		"\u0000-.\u0001\u0000\u0000\u0000.\u0007\u0001\u0000\u0000\u0000/-\u0001"+
		"\u0000\u0000\u000001\u0005\u0003\u0000\u000012\u0003\u0018\f\u000024\u0005"+
		"\u0004\u0000\u000035\u0003\n\u0005\u000043\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"7\t\u0001\u0000\u0000\u000089\u0005\u0005\u0000\u00009:\u0005\r\u0000"+
		"\u0000:;\u0005\u0004\u0000\u0000;<\u0003\u0016\u000b\u0000<\u000b\u0001"+
		"\u0000\u0000\u0000=>\u0005\u0006\u0000\u0000>?\u0005\u0007\u0000\u0000"+
		"?@\u0003\u0018\f\u0000@A\u0005\b\u0000\u0000AB\u0005\u0004\u0000\u0000"+
		"BD\u0003\u0018\f\u0000CE\u0003\u000e\u0007\u0000DC\u0001\u0000\u0000\u0000"+
		"DE\u0001\u0000\u0000\u0000EG\u0001\u0000\u0000\u0000FH\u0003\u0010\b\u0000"+
		"GF\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000"+
		"\u0000IK\u0003\u0012\t\u0000JI\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000K\r\u0001\u0000\u0000\u0000LN\u0005\t\u0000\u0000MO\u0003\n\u0005"+
		"\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PN\u0001\u0000"+
		"\u0000\u0000PQ\u0001\u0000\u0000\u0000Q\u000f\u0001\u0000\u0000\u0000"+
		"RT\u0005\n\u0000\u0000SU\u0003\n\u0005\u0000TS\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000"+
		"\u0000W\u0011\u0001\u0000\u0000\u0000XY\u0005\u000b\u0000\u0000YZ\u0005"+
		"\u000e\u0000\u0000Z\u0013\u0001\u0000\u0000\u0000[`\u0005\r\u0000\u0000"+
		"\\]\u0005\f\u0000\u0000]_\u0005\r\u0000\u0000^\\\u0001\u0000\u0000\u0000"+
		"_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000a\u0015\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000cd\u0005"+
		"\r\u0000\u0000d\u0017\u0001\u0000\u0000\u0000eg\u0005\r\u0000\u0000fh"+
		"\u0005\u0010\u0000\u0000gf\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hj\u0001\u0000\u0000\u0000ie\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l\u0019"+
		"\u0001\u0000\u0000\u0000\u000b\u001f-6DGJPV`gk";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}