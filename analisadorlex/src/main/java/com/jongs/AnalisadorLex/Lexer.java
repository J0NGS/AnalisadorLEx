package com.jongs.AnalisadorLex;

/* The following code was generated by JFlex 1.7.0 */

import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Lexer.jflex</tt>
 */
public class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\63\1\46\1\47\1\46\1\46\22\0\1\63\1\0\1\62"+
    "\1\45\4\0\1\53\1\54\2\0\1\50\3\0\12\42\1\36\1\0"+
    "\1\60\1\61\1\57\2\0\2\37\1\22\1\33\1\23\3\37\1\26"+
    "\5\37\1\31\3\37\1\27\1\25\6\37\1\55\1\0\1\56\1\0"+
    "\1\41\1\0\1\5\1\30\1\14\1\20\1\4\1\32\1\40\1\17"+
    "\1\11\1\34\1\40\1\6\1\3\1\12\1\2\1\40\1\24\1\21"+
    "\1\1\1\15\1\10\1\7\1\44\1\13\1\16\1\40\1\51\1\0"+
    "\1\52\7\0\1\47\32\0\1\35\u05bf\0\12\43\206\0\12\43\306\0"+
    "\12\43\u019c\0\12\43\166\0\12\43\166\0\12\43\166\0\12\43\166\0"+
    "\12\43\166\0\12\43\166\0\12\43\166\0\12\43\166\0\12\43\166\0"+
    "\12\43\140\0\12\43\166\0\12\43\106\0\12\43\u0116\0\12\43\106\0"+
    "\12\43\u05e6\0\1\35\u015f\0\12\43\46\0\12\43\u012c\0\12\43\200\0"+
    "\12\43\246\0\12\43\6\0\12\43\266\0\12\43\126\0\12\43\206\0"+
    "\12\43\6\0\12\43\u03a6\0\13\35\35\0\1\47\1\47\5\0\1\35"+
    "\57\0\1\35\u0fa0\0\1\35\u761f\0\12\43\u02a6\0\12\43\46\0\12\43"+
    "\306\0\12\43\26\0\12\43\126\0\12\43\u0196\0\12\43\u5316\0\12\43"+
    "\u0586\0\12\43\u0bbc\0\12\43\200\0\12\43\74\0\12\43\220\0\12\43"+
    "\u0116\0\12\43\u0156\0\12\43\166\0\12\43\u0176\0\12\43\146\0\12\43"+
    "\146\0\12\43\u01a6\0\12\43\u0366\0\12\43\u4e06\0\12\43\346\0\12\43"+
    "\u6c74\0\62\43\u1150\0\12\43\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u16b5\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\13\2\6\1\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\2\1\21\13\2\2\22\2\23\4\22"+
    "\1\24\1\25\5\2\1\0\1\22\1\0\4\22\1\0"+
    "\1\2\1\0\5\22\1\26\1\2\6\22\1\2\1\0"+
    "\1\21\26\22";

  private static int [] zzUnpackAction() {
    int [] result = new int[109];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\234\0\320\0\u0104\0\u0138\0\u016c"+
    "\0\u01a0\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4\0\u02d8\0\u030c"+
    "\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u0410\0\64\0\64\0\64"+
    "\0\64\0\64\0\64\0\64\0\64\0\u0444\0\u0478\0\64"+
    "\0\64\0\u04ac\0\u016c\0\u04e0\0\u0514\0\u0548\0\u057c\0\u05b0"+
    "\0\u05e4\0\u0618\0\u064c\0\u0680\0\u06b4\0\u06e8\0\u071c\0\u0750"+
    "\0\u0784\0\u07b8\0\u07ec\0\u0820\0\u0854\0\u0888\0\64\0\64"+
    "\0\u08bc\0\u08f0\0\u0924\0\u0958\0\u098c\0\u09c0\0\u09f4\0\u0784"+
    "\0\u0a28\0\u0a5c\0\u0a90\0\u0ac4\0\u0af8\0\u0b2c\0\u0b60\0\u0b94"+
    "\0\u0bc8\0\u0bfc\0\u0c30\0\u0c64\0\u0af8\0\u0c98\0\u0ccc\0\u0d00"+
    "\0\u0d34\0\u0d68\0\u0d9c\0\u0dd0\0\u0e04\0\u0e38\0\64\0\u0e6c"+
    "\0\u0ea0\0\u0ed4\0\u0f08\0\u0f3c\0\u0f70\0\u0fa4\0\u0fd8\0\u100c"+
    "\0\u1040\0\u1074\0\u10a8\0\u10dc\0\u1110\0\u1144\0\u1178\0\u11ac"+
    "\0\u11e0\0\u1214\0\u1248\0\u127c\0\u12b0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[109];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\2\10\1\12\1\13\1\10\1\14\3\10\1\15\1\16"+
    "\1\17\1\10\1\20\1\21\1\22\1\10\1\20\1\10"+
    "\1\23\1\10\2\2\1\20\1\10\1\2\1\24\1\2"+
    "\1\10\1\25\1\26\1\0\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\26"+
    "\65\0\1\10\1\42\32\10\2\0\2\10\1\0\1\10"+
    "\1\0\1\10\20\0\20\10\1\43\13\10\2\0\2\10"+
    "\1\0\1\10\1\0\1\44\20\0\4\10\1\45\3\10"+
    "\1\46\23\10\2\0\2\10\1\0\1\10\1\0\1\10"+
    "\20\0\12\10\1\47\21\10\2\0\2\10\1\0\1\10"+
    "\1\0\1\10\20\0\5\10\1\50\3\10\1\51\22\10"+
    "\2\0\2\10\1\0\1\10\1\0\1\10\20\0\34\10"+
    "\2\0\2\10\1\0\1\10\1\0\1\10\20\0\4\10"+
    "\1\52\27\10\2\0\2\10\1\0\1\10\1\0\1\10"+
    "\20\0\1\10\1\53\32\10\2\0\2\10\1\0\1\10"+
    "\1\0\1\10\20\0\1\54\33\10\2\0\2\10\1\0"+
    "\1\10\1\0\1\10\20\0\16\10\1\55\15\10\2\0"+
    "\2\10\1\0\1\10\1\0\1\10\20\0\17\10\1\56"+
    "\14\10\2\0\2\10\1\0\1\10\1\0\1\10\20\0"+
    "\5\57\1\60\26\57\2\0\2\57\1\0\1\61\1\62"+
    "\1\57\20\0\23\57\1\63\10\57\2\0\2\57\1\0"+
    "\1\61\1\62\1\57\20\0\34\57\2\0\2\57\1\0"+
    "\1\61\1\62\1\57\20\0\11\57\1\64\22\57\2\0"+
    "\2\57\1\0\1\61\1\62\1\57\20\0\7\57\1\65"+
    "\24\57\2\0\2\57\1\0\1\61\1\62\1\57\20\0"+
    "\10\57\1\66\23\57\2\0\2\57\1\0\1\61\1\62"+
    "\1\57\61\0\1\24\21\0\46\25\2\0\14\25\61\0"+
    "\1\67\63\0\1\70\3\0\2\10\1\71\31\10\2\0"+
    "\2\10\1\0\1\10\1\0\1\10\20\0\5\10\1\72"+
    "\26\10\2\0\2\10\1\0\1\10\1\0\1\10\20\0"+
    "\12\10\1\43\21\10\2\0\2\10\1\0\1\10\1\0"+
    "\1\10\20\0\11\10\1\43\22\10\2\0\2\10\1\0"+
    "\1\10\1\0\1\10\20\0\4\10\1\73\27\10\2\0"+
    "\2\10\1\0\1\10\1\0\1\10\20\0\5\10\1\43"+
    "\26\10\2\0\2\10\1\0\1\10\1\0\1\10\20\0"+
    "\17\10\1\43\14\10\2\0\2\10\1\0\1\10\1\0"+
    "\1\10\20\0\5\10\1\74\26\10\2\0\2\10\1\0"+
    "\1\10\1\0\1\10\20\0\14\10\1\43\17\10\2\0"+
    "\2\10\1\0\1\10\1\0\1\10\20\0\17\10\1\72"+
    "\14\10\2\0\2\10\1\0\1\10\1\0\1\10\20\0"+
    "\4\10\1\53\27\10\2\0\2\10\1\0\1\10\1\0"+
    "\1\10\20\0\31\10\1\75\2\10\2\0\2\10\1\0"+
    "\1\10\1\0\1\10\20\0\34\57\2\0\2\57\1\76"+
    "\1\61\1\62\1\57\20\0\4\57\1\77\27\57\2\0"+
    "\2\57\1\76\1\61\1\62\1\57\20\0\34\100\2\0"+
    "\2\100\1\0\1\61\1\62\1\100\61\0\2\62\21\0"+
    "\7\57\1\101\24\57\2\0\2\57\1\76\1\61\1\62"+
    "\1\57\20\0\17\57\1\102\14\57\2\0\2\57\1\76"+
    "\1\61\1\62\1\57\20\0\27\57\1\103\4\57\2\0"+
    "\2\57\1\76\1\61\1\62\1\57\20\0\1\104\33\57"+
    "\2\0\2\57\1\76\1\61\1\62\1\57\20\0\3\10"+
    "\1\43\30\10\2\0\2\10\1\0\1\10\1\0\1\10"+
    "\20\0\34\10\1\0\1\105\2\10\1\0\1\10\1\0"+
    "\1\10\20\0\13\10\1\106\20\10\2\0\2\10\1\0"+
    "\1\10\1\0\1\10\20\0\7\10\1\71\24\10\2\0"+
    "\2\10\1\0\1\10\1\0\1\10\20\0\1\72\33\10"+
    "\2\0\2\10\1\0\1\10\1\0\1\10\41\0\2\107"+
    "\1\0\3\107\1\0\1\107\1\0\1\107\3\0\1\107"+
    "\25\0\1\110\33\57\2\0\2\57\1\76\1\61\1\62"+
    "\1\57\20\0\10\57\1\111\23\57\2\0\2\57\1\76"+
    "\1\61\1\62\1\57\20\0\10\57\1\112\23\57\2\0"+
    "\2\57\1\76\1\61\1\62\1\57\20\0\21\57\1\113"+
    "\12\57\2\0\2\57\1\76\1\61\1\62\1\57\20\0"+
    "\33\57\1\114\2\0\2\57\1\76\1\61\1\62\1\57"+
    "\20\0\34\115\2\0\2\115\3\0\1\115\20\0\14\10"+
    "\1\116\17\10\2\0\2\10\1\0\1\10\1\0\1\10"+
    "\20\0\34\117\2\0\2\117\3\0\1\117\20\0\1\120"+
    "\33\57\2\0\2\57\1\76\1\61\1\62\1\57\20\0"+
    "\6\57\1\121\25\57\2\0\2\57\1\76\1\61\1\62"+
    "\1\57\20\0\6\57\1\122\25\57\2\0\2\57\1\76"+
    "\1\61\1\62\1\57\20\0\5\57\1\123\26\57\2\0"+
    "\2\57\1\76\1\61\1\62\1\57\20\0\1\57\1\124"+
    "\32\57\2\0\2\57\1\76\1\61\1\62\1\57\20\0"+
    "\5\10\1\125\26\10\2\0\2\10\1\0\1\10\1\0"+
    "\1\10\20\0\34\117\2\0\2\117\1\76\2\0\1\117"+
    "\20\0\34\57\1\126\1\127\2\57\1\76\1\61\1\62"+
    "\1\57\1\0\2\126\13\0\1\126\1\0\4\57\1\130"+
    "\27\57\2\0\2\57\1\76\1\61\1\62\1\57\20\0"+
    "\10\57\1\131\23\57\2\0\2\57\1\76\1\61\1\62"+
    "\1\57\20\0\4\57\1\132\27\57\2\0\2\57\1\76"+
    "\1\61\1\62\1\57\20\0\10\57\1\133\23\57\2\0"+
    "\2\57\1\76\1\61\1\62\1\57\20\0\15\10\1\43"+
    "\16\10\2\0\2\10\1\0\1\10\1\0\1\10\54\0"+
    "\1\126\1\127\7\0\2\126\13\0\1\126\1\0\5\57"+
    "\1\134\26\57\2\0\2\57\1\76\1\61\1\62\1\57"+
    "\20\0\17\57\1\135\14\57\2\0\2\57\1\76\1\61"+
    "\1\62\1\57\20\0\1\136\33\57\2\0\2\57\1\76"+
    "\1\61\1\62\1\57\20\0\11\57\1\137\22\57\2\0"+
    "\2\57\1\76\1\61\1\62\1\57\20\0\3\57\1\140"+
    "\30\57\2\0\2\57\1\76\1\61\1\62\1\57\20\0"+
    "\7\57\1\141\24\57\2\0\2\57\1\76\1\61\1\62"+
    "\1\57\20\0\1\142\33\57\2\0\2\57\1\76\1\61"+
    "\1\62\1\57\20\0\14\57\1\143\17\57\2\0\2\57"+
    "\1\76\1\61\1\62\1\57\20\0\11\57\1\144\22\57"+
    "\2\0\2\57\1\76\1\61\1\62\1\57\20\0\4\57"+
    "\1\145\27\57\2\0\2\57\1\76\1\61\1\62\1\57"+
    "\20\0\30\57\1\146\3\57\2\0\2\57\1\76\1\61"+
    "\1\62\1\57\20\0\21\57\1\147\12\57\2\0\2\57"+
    "\1\76\1\61\1\62\1\57\20\0\14\57\1\150\17\57"+
    "\2\0\2\57\1\76\1\61\1\62\1\57\20\0\5\57"+
    "\1\110\26\57\2\0\2\57\1\76\1\61\1\62\1\57"+
    "\20\0\31\57\1\120\2\57\2\0\2\57\1\76\1\61"+
    "\1\62\1\57\20\0\5\57\1\151\26\57\2\0\2\57"+
    "\1\76\1\61\1\62\1\57\20\0\24\57\1\152\7\57"+
    "\2\0\2\57\1\76\1\61\1\62\1\57\20\0\4\57"+
    "\1\153\27\57\2\0\2\57\1\76\1\61\1\62\1\57"+
    "\20\0\1\57\1\120\32\57\2\0\2\57\1\76\1\61"+
    "\1\62\1\57\20\0\1\154\33\57\2\0\2\57\1\76"+
    "\1\61\1\62\1\57\20\0\1\155\33\57\2\0\2\57"+
    "\1\76\1\61\1\62\1\57\20\0\3\57\1\110\30\57"+
    "\2\0\2\57\1\76\1\61\1\62\1\57\17\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4836];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\23\1\10\11\2\1\2\11\25\1\2\11"+
    "\5\1\1\0\1\1\1\0\4\1\1\0\1\1\1\0"+
    "\16\1\1\0\1\11\26\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[109];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    private Token print(String name, String value){
        return new Token(name, value, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 420) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return print("Caractere inválido ", yytext());
            } 
            // fall through
          case 23: break;
          case 2: 
            { return print("Property indentifiers", yytext());
            } 
            // fall through
          case 24: break;
          case 3: 
            { return print("Cadinality", yytext());
            } 
            // fall through
          case 25: break;
          case 4: 
            { return print("Comment", yytext());
            } 
            // fall through
          case 26: break;
          case 5: 
            { /**/
            } 
            // fall through
          case 27: break;
          case 6: 
            { return print("Comma", yytext());
            } 
            // fall through
          case 28: break;
          case 7: 
            { return print("Open Brace", yytext());
            } 
            // fall through
          case 29: break;
          case 8: 
            { return print("Close Brace", yytext());
            } 
            // fall through
          case 30: break;
          case 9: 
            { return print("Open Parenthesis", yytext());
            } 
            // fall through
          case 31: break;
          case 10: 
            { return print("Close Parenthesis", yytext());
            } 
            // fall through
          case 32: break;
          case 11: 
            { return print("Open Bracket", yytext());
            } 
            // fall through
          case 33: break;
          case 12: 
            { return print("Close Bracket", yytext());
            } 
            // fall through
          case 34: break;
          case 13: 
            { return print("Greater Than", yytext());
            } 
            // fall through
          case 35: break;
          case 14: 
            { return print("Less Than", yytext());
            } 
            // fall through
          case 36: break;
          case 15: 
            { return print("Equal", yytext());
            } 
            // fall through
          case 37: break;
          case 16: 
            { return print("Double Quote", yytext());
            } 
            // fall through
          case 38: break;
          case 17: 
            { return print("Keyword", yytext());
            } 
            // fall through
          case 39: break;
          case 18: 
            { return print("Class identifier", yytext());
            } 
            // fall through
          case 40: break;
          case 19: 
            { return print("Individual name", yytext());
            } 
            // fall through
          case 41: break;
          case 20: 
            { return print("Equal greater than", yytext());
            } 
            // fall through
          case 42: break;
          case 21: 
            { return print("Equal less than", yytext());
            } 
            // fall through
          case 43: break;
          case 22: 
            { return print("Data type", yytext());
            } 
            // fall through
          case 44: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
