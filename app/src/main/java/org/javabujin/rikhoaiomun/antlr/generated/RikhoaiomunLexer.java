// Generated from Rikhoaiomun.g4 by ANTLR 4.13.2
package org.javabujin.rikhoaiomun.antlr.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class RikhoaiomunLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, IDENTIFIER=13, MULTILINE_STRING_LITERAL=14, 
		NEWLINE=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "IDENTIFIER", "MULTILINE_STRING_LITERAL", "NEWLINE", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@System'", "'@Module'", "'@Entity'", "':'", "'{'", "'}'", "'-'", 
			"'@Feature'", "'@Inputs:'", "'@Outputs:'", "'@Comment:'", "'.'"
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


	public RikhoaiomunLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Rikhoaiomun.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0010\u008c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0005"+
		"\fl\b\f\n\f\f\fo\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\rv"+
		"\b\r\n\r\f\ry\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0004\u000e"+
		"\u0080\b\u000e\u000b\u000e\f\u000e\u0081\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0004\u000f\u0087\b\u000f\u000b\u000f\f\u000f\u0088\u0001\u000f"+
		"\u0001\u000f\u0001w\u0000\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010\u0001\u0000\u0004"+
		"\u0003\u0000AZ__az\u0004\u000009AZ__az\u0002\u0000\n\n\r\r\u0002\u0000"+
		"\t\t  \u008f\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0001!\u0001\u0000\u0000\u0000\u0003)\u0001\u0000\u0000\u0000\u00051"+
		"\u0001\u0000\u0000\u0000\u00079\u0001\u0000\u0000\u0000\t;\u0001\u0000"+
		"\u0000\u0000\u000b=\u0001\u0000\u0000\u0000\r?\u0001\u0000\u0000\u0000"+
		"\u000fA\u0001\u0000\u0000\u0000\u0011J\u0001\u0000\u0000\u0000\u0013S"+
		"\u0001\u0000\u0000\u0000\u0015]\u0001\u0000\u0000\u0000\u0017g\u0001\u0000"+
		"\u0000\u0000\u0019i\u0001\u0000\u0000\u0000\u001bp\u0001\u0000\u0000\u0000"+
		"\u001d\u007f\u0001\u0000\u0000\u0000\u001f\u0086\u0001\u0000\u0000\u0000"+
		"!\"\u0005@\u0000\u0000\"#\u0005S\u0000\u0000#$\u0005y\u0000\u0000$%\u0005"+
		"s\u0000\u0000%&\u0005t\u0000\u0000&\'\u0005e\u0000\u0000\'(\u0005m\u0000"+
		"\u0000(\u0002\u0001\u0000\u0000\u0000)*\u0005@\u0000\u0000*+\u0005M\u0000"+
		"\u0000+,\u0005o\u0000\u0000,-\u0005d\u0000\u0000-.\u0005u\u0000\u0000"+
		"./\u0005l\u0000\u0000/0\u0005e\u0000\u00000\u0004\u0001\u0000\u0000\u0000"+
		"12\u0005@\u0000\u000023\u0005E\u0000\u000034\u0005n\u0000\u000045\u0005"+
		"t\u0000\u000056\u0005i\u0000\u000067\u0005t\u0000\u000078\u0005y\u0000"+
		"\u00008\u0006\u0001\u0000\u0000\u00009:\u0005:\u0000\u0000:\b\u0001\u0000"+
		"\u0000\u0000;<\u0005{\u0000\u0000<\n\u0001\u0000\u0000\u0000=>\u0005}"+
		"\u0000\u0000>\f\u0001\u0000\u0000\u0000?@\u0005-\u0000\u0000@\u000e\u0001"+
		"\u0000\u0000\u0000AB\u0005@\u0000\u0000BC\u0005F\u0000\u0000CD\u0005e"+
		"\u0000\u0000DE\u0005a\u0000\u0000EF\u0005t\u0000\u0000FG\u0005u\u0000"+
		"\u0000GH\u0005r\u0000\u0000HI\u0005e\u0000\u0000I\u0010\u0001\u0000\u0000"+
		"\u0000JK\u0005@\u0000\u0000KL\u0005I\u0000\u0000LM\u0005n\u0000\u0000"+
		"MN\u0005p\u0000\u0000NO\u0005u\u0000\u0000OP\u0005t\u0000\u0000PQ\u0005"+
		"s\u0000\u0000QR\u0005:\u0000\u0000R\u0012\u0001\u0000\u0000\u0000ST\u0005"+
		"@\u0000\u0000TU\u0005O\u0000\u0000UV\u0005u\u0000\u0000VW\u0005t\u0000"+
		"\u0000WX\u0005p\u0000\u0000XY\u0005u\u0000\u0000YZ\u0005t\u0000\u0000"+
		"Z[\u0005s\u0000\u0000[\\\u0005:\u0000\u0000\\\u0014\u0001\u0000\u0000"+
		"\u0000]^\u0005@\u0000\u0000^_\u0005C\u0000\u0000_`\u0005o\u0000\u0000"+
		"`a\u0005m\u0000\u0000ab\u0005m\u0000\u0000bc\u0005e\u0000\u0000cd\u0005"+
		"n\u0000\u0000de\u0005t\u0000\u0000ef\u0005:\u0000\u0000f\u0016\u0001\u0000"+
		"\u0000\u0000gh\u0005.\u0000\u0000h\u0018\u0001\u0000\u0000\u0000im\u0007"+
		"\u0000\u0000\u0000jl\u0007\u0001\u0000\u0000kj\u0001\u0000\u0000\u0000"+
		"lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000n\u001a\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0005"+
		"\"\u0000\u0000qr\u0005\"\u0000\u0000rs\u0005\"\u0000\u0000sw\u0001\u0000"+
		"\u0000\u0000tv\t\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xz\u0001"+
		"\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0005\"\u0000\u0000{|\u0005"+
		"\"\u0000\u0000|}\u0005\"\u0000\u0000}\u001c\u0001\u0000\u0000\u0000~\u0080"+
		"\u0007\u0002\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0081\u0001"+
		"\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0006"+
		"\u000e\u0000\u0000\u0084\u001e\u0001\u0000\u0000\u0000\u0085\u0087\u0007"+
		"\u0003\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001"+
		"\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0006"+
		"\u000f\u0000\u0000\u008b \u0001\u0000\u0000\u0000\u0005\u0000mw\u0081"+
		"\u0088\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}