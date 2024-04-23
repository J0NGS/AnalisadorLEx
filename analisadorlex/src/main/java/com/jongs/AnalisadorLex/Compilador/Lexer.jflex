import java_cup.runtime.*;

%%
%{
    StringBuffer string = new StringBuffer();

    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}


%cup
%public
%class Lexer
%function next_token
%type java_cup.runtime.Symbol
%line
%column


NAMESPACE_OWL = "owl"
NAMESPACE_RDFS = "rdfs"
NAMESPACE_XSD = "xsd"
INTEGER = "integer"
FLOAT = "float"
STRING = "string"
SOME = "some"
ALL = "all"
VALUE = "value"
MIN = "min"
MAX = "max"
EXACTLY = "exactly"
THAT = "that"
NOT = "not"
AND = "and"
OR = "or"
ONLY = "only"
CLASS_COLON = "Class:"
EQUIVALENT_TO_COLON = "EquivalentTo:"
INDIVIDUALS_COLON = "Individuals:"
SUBCLASS_OF_COLON = "SubClassOf:"
DISJOINT_CLASSES_COLON = "DisjointClasses:"
WHITESPACE = [\t\r\n\f]

CLASS_IDENTIFIERS = [A-Z][a-zA-Z]*(_[A-Z][a-zA-Z]*)*
INDIVIDUAL_NAME = [A-Z][a-zA-Z0-9]*//\d+
PROPERTY_IDENTIFIERS = [a-z]+([A-Z]+[a-zA-Z]*)*
CARDINALITY_INTEGER = [0-9]+
CARDINALITY_FLOAT = [0-9]+([.][0-9]+)*
COMMENT = \#.*
LEFT_BRACE = "{"
RIGHT_BRACE = "}"
LEFT_PAREN = "("
RIGHT_PAREN = ")"
LEFT_BRACKET = "["
RIGHT_BRACKET = "]"
GREATER_THAN = ">"
LESS_THAN = "<"
EQUAL = "="
EQUAL_LESS_THAN = "<="
EQUAL_GREATER_THAN = ">="
DOUBLE_QUOTE = "\""
BROKEN_LINE = [\r\n\f]+
WHITESPACE = [ \t\r\f]*
COMMA = ("," | "," {WHITESPACE})
COLON = ":"
SSN = "ssn"

%%
{COMMA} {return symbol (sym.COMMA, yytext()); }
{COLON} {return symbol (sym.COLON, yytext()); }
{DOUBLE_QUOTE} { return symbol (sym.DOUBLE_QUOTE, yytext()); }
{BROKEN_LINE} { /**/ }
{WHITESPACE} {/**/}
{NAMESPACE_OWL} { return symbol (sym.NAMESPACE_OWL, yytext()); }
{NAMESPACE_RDFS} { return symbol (sym.NAMESPACE_RDFS, yytext()); }
{NAMESPACE_XSD} { return symbol (sym.NAMESPACE_XSD, yytext()); }
{INTEGER} { return symbol (sym.INTEGER, yytext()); }
{FLOAT} { return symbol (sym.FLOAT, yytext()); }
{STRING} { return symbol (sym.STRING, yytext()); }
{SSN} { return symbol(sym.SSN, yytext()); }
{SOME} { return symbol(sym.SOME, yytext()); }
{ALL} { return symbol(sym.ALL, yytext()); }
{VALUE} { return symbol(sym.VALUE, yytext()); }
{MIN} { return symbol(sym.MIN, yytext()); }
{MAX} { return symbol (sym.MAX, yytext()); }
{EXACTLY} { return symbol (sym.EXACTLY, yytext()); }
{THAT} { return symbol (sym.THAT, yytext()); }
{NOT} { return symbol (sym.NOT, yytext()); }
{AND} { return symbol (sym.AND, yytext()); }
{OR} { return symbol (sym.OR, yytext()); }
{ONLY} { return symbol (sym.ONLY, yytext()); }
{CLASS_COLON} { return symbol (sym.CLASS_COLON, yytext()); }
{EQUIVALENT_TO_COLON} { return symbol (sym.EQUIVALENT_TO_COLON, yytext()); }
{INDIVIDUALS_COLON} { return symbol (sym.INDIVIDUALS_COLON, yytext()); }
{SUBCLASS_OF_COLON} { return symbol (sym.SUBCLASS_OF_COLON, yytext()); }
{DISJOINT_CLASSES_COLON} { return symbol (sym.DISJOINT_CLASSES_COLON, yytext()); }
{CLASS_IDENTIFIERS} { return symbol (sym.CLASS_IDENTIFIERS, yytext()); }
{INDIVIDUAL_NAME} { return symbol (sym.INDIVIDUAL_NAME, yytext()); }
{PROPERTY_IDENTIFIERS} { return symbol (sym.PROPERTY_IDENTIFIERS, yytext()); }
{CARDINALITY_INTEGER} { return symbol (sym.CARDINALITY_INTEGER, Integer.parseInt(yytext())); }
{CARDINALITY_FLOAT} { return symbol (sym.CARDINALITY_FLOAT, Float.parseFloat(yytext())); }
{COMMENT} { return symbol (sym.COMMENT, yytext()); }
{LEFT_BRACE} { return symbol (sym.LEFT_BRACE, yytext()); }
{RIGHT_BRACE} { return symbol (sym.RIGHT_BRACE, yytext()); }
{LEFT_PAREN} { return symbol (sym.LEFT_PAREN, yytext()); }
{RIGHT_PAREN} { return symbol (sym.RIGHT_PAREN, yytext()); }
{LEFT_BRACKET} { return symbol (sym.LEFT_BRACKET, yytext()); }
{RIGHT_BRACKET} { return symbol (sym.RIGHT_BRACKET, yytext()); }
{GREATER_THAN} { return symbol (sym.GREATER_THAN, yytext()); }
{LESS_THAN} { return symbol (sym.LESS_THAN, yytext()); }
{EQUAL} { return symbol (sym.EQUAL, yytext()); }
{EQUAL_LESS_THAN} { return symbol (sym.EQUAL_LESS_THAN, yytext()); }
{EQUAL_GREATER_THAN} { return symbol (sym.GREATER_THAN, yytext()); }

. { throw new Error("Caractere inválido <"+ yytext()+">\n na linha <"+ yyline + ">\n coluna < "+ yycolumn + ">"); }

<<EOF>>{ return symbol(sym.EOF, "EOF"); }
