
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\040\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\002\002\000\002\003\004\000\002\004\004" +
    "\000\002\005\004\000\002\005\002\000\002\006\003\000" +
    "\002\007\004\000\002\010\004\000\002\010\002\000\002" +
    "\011\004\000\002\011\002\000\002\012\003\000\002\013" +
    "\004\000\002\014\004\000\002\014\002\000\002\015\005" +
    "\000\002\016\004\000\002\017\003\000\002\020\005\000" +
    "\002\020\003\000\002\021\005\000\002\021\003\000\002" +
    "\022\003\000\002\022\003\000\002\023\003\000\002\023" +
    "\003\000\002\023\003\000\002\024\003\000\002\024\003" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\053\000\010\002\ufffe\003\006\017\007\001\002\000" +
    "\010\002\ufffe\003\006\017\007\001\002\000\004\002\054" +
    "\001\002\000\004\002\uffff\001\002\000\004\024\053\001" +
    "\002\000\004\022\013\001\002\000\014\002\ufffa\003\ufffa" +
    "\017\ufffa\021\ufffa\023\033\001\002\000\006\024\015\026" +
    "\017\001\002\000\006\024\uffed\026\uffed\001\002\000\016" +
    "\002\uffeb\003\uffeb\017\uffeb\021\uffeb\023\uffeb\047\030\001" +
    "\002\000\024\002\uffe9\003\uffe9\004\uffe7\014\uffe7\015\uffe7" +
    "\017\uffe9\021\uffe9\023\uffe9\047\uffe9\001\002\000\010\004" +
    "\023\014\022\015\024\001\002\000\010\004\uffe8\014\uffe8" +
    "\015\uffe8\001\002\000\014\002\uffee\003\uffee\017\uffee\021" +
    "\uffee\023\uffee\001\002\000\006\024\027\027\025\001\002" +
    "\000\006\024\uffe5\027\uffe5\001\002\000\006\024\uffe6\027" +
    "\uffe6\001\002\000\006\024\uffe4\027\uffe4\001\002\000\016" +
    "\002\uffe2\003\uffe2\017\uffe2\021\uffe2\023\uffe2\047\uffe2\001" +
    "\002\000\016\002\uffea\003\uffea\017\uffea\021\uffea\023\uffea" +
    "\047\uffea\001\002\000\016\002\uffe3\003\uffe3\017\uffe3\021" +
    "\uffe3\023\uffe3\047\uffe3\001\002\000\006\024\015\026\017" +
    "\001\002\000\014\002\uffec\003\uffec\017\uffec\021\uffec\023" +
    "\uffec\001\002\000\010\002\uffef\003\uffef\017\uffef\001\002" +
    "\000\004\024\ufff9\001\002\000\004\024\047\001\002\000" +
    "\012\002\ufff4\003\ufff4\017\ufff4\021\036\001\002\000\004" +
    "\025\ufff3\001\002\000\004\025\042\001\002\000\010\002" +
    "\ufffc\003\ufffc\017\ufffc\001\002\000\010\002\ufff5\003\ufff5" +
    "\017\ufff5\001\002\000\012\002\ufff0\003\ufff0\017\ufff0\047" +
    "\043\001\002\000\004\025\042\001\002\000\010\002\ufff2" +
    "\003\ufff2\017\ufff2\001\002\000\010\002\ufff1\003\ufff1\017" +
    "\ufff1\001\002\000\012\002\ufffb\003\ufffb\017\ufffb\021\ufffb" +
    "\001\002\000\014\002\ufff6\003\ufff6\017\ufff6\021\ufff6\047" +
    "\050\001\002\000\004\024\047\001\002\000\012\002\ufff8" +
    "\003\ufff8\017\ufff8\021\ufff8\001\002\000\012\002\ufff7\003" +
    "\ufff7\017\ufff7\021\ufff7\001\002\000\004\022\ufffd\001\002" +
    "\000\004\002\001\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\053\000\010\002\004\003\007\015\003\001\001\000" +
    "\010\002\054\003\007\015\003\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\016\010\017" +
    "\011\001\001\000\010\004\031\005\034\006\033\001\001" +
    "\000\010\020\017\021\013\022\015\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\023\020" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\024" +
    "\025\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\010\020\030\021\013\022\015\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\007" +
    "\045\001\001\000\006\011\037\012\036\001\001\000\002" +
    "\001\001\000\004\013\040\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\014\043\001\001\000\004\013\044" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\010\050\001\001\000\004\007\051\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



//----------------------------------Funções de erro----------------------------------
    public void report_error(String message, Object info)  {
        // Obtém o número da linha onde ocorreu o erro
        int line = ((Symbol) info).left;
        // Obtém o token que causou o erro
        Symbol tokenSymbol = (Symbol) info;
        String token = tokenSymbol.value.toString();
        
        // Especifica o tipo de erro e o contexto
        String errorMessage = "Syntax Error at line " + (line + 1 ) + " - Token: " + token +"      |"+ message;
        System.out.println(errorMessage);
    }

    public void report_fatal_error(String message, Object info)  {
        // Obtém o número da linha onde ocorreu o erro
        int line = ((Symbol) info).left;
        // Obtém o token que causou o erro
        Symbol tokenSymbol = (Symbol) info;
        String token = tokenSymbol.value.toString();
        
        // Especifica o tipo de erro e o contexto
        String errorMessage = "Syntax Error at line " + (line + 1) + " - Token: " + token +"      |"+ message;
        System.out.println(errorMessage);
        System.exit(-1);
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= Class EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // Class ::= PrimitiveClass Class 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Class",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Class ::= error 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Class",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Class ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Class",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // ClassHeader ::= CLASS_COLON CLASS_IDENTIFIERS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ClassHeader",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // DisjointAndIndividuals ::= DisjointClasses Individuals 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DisjointAndIndividuals",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // DisjointClasses ::= DisjointClassesHead DisjointClassesBody 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DisjointClasses",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // DisjointClasses ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DisjointClasses",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // DisjointClassesHead ::= DISJOINT_CLASSES_COLON 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DisjointClassesHead",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // DisjointClassesBody ::= CLASS_IDENTIFIERS DisjointClassesBodyComma 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DisjointClassesBody",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // DisjointClassesBodyComma ::= COMMA DisjointClassesBody 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DisjointClassesBodyComma",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // DisjointClassesBodyComma ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DisjointClassesBodyComma",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Individuals ::= IndividualsHead IndividualsBody 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Individuals",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Individuals ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Individuals",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // IndividualsHead ::= INDIVIDUALS_COLON 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("IndividualsHead",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // IndividualsBody ::= INDIVIDUAL_NAME IndividualNameComma 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("IndividualsBody",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // IndividualNameComma ::= COMMA IndividualsBody 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("IndividualNameComma",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // IndividualNameComma ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("IndividualNameComma",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // PrimitiveClass ::= ClassHeader PrimitiveClassBody DisjointAndIndividuals 
            {
              Object RESULT =null;
		System.out.println("Classe primitiva detectada\n" + $1);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("PrimitiveClass",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // PrimitiveClassBody ::= SubClassOfHead SubClassOfBody 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PrimitiveClassBody",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // SubClassOfHead ::= SUBCLASS_OF_COLON 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SubClassOfHead",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // SubClassOfBody ::= SubClassOfBodyIten COMMA SubClassOfBody 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SubClassOfBody",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // SubClassOfBody ::= SubClassOfBodyIten 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SubClassOfBody",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // SubClassOfBodyIten ::= PropertyIdentifier Connector SubClassOfBodyItenPair 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SubClassOfBodyIten",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // SubClassOfBodyIten ::= CLASS_IDENTIFIERS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SubClassOfBodyIten",15, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // PropertyIdentifier ::= PROPERTY_IDENTIFIERS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PropertyIdentifier",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // PropertyIdentifier ::= CLASS_IDENTIFIERS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PropertyIdentifier",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // Connector ::= SOME 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Connector",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // Connector ::= AND 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Connector",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // Connector ::= OR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Connector",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // SubClassOfBodyItenPair ::= CLASS_IDENTIFIERS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SubClassOfBodyItenPair",18, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // SubClassOfBodyItenPair ::= DATA_TYPE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SubClassOfBodyItenPair",18, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}