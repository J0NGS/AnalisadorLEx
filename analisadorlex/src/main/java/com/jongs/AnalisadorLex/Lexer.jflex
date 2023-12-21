import java_cup.runtime.*;

%%
%{
    private Token print(String name, String value){
        return new Token(name, value, yyline, yycolumn);
    }
%}

%public
%class Lexer
%type Token
%line
%column

KEYWORD = ("some"|"all"|"value"|"min"|"max"|"exactly"|"that"|"not"|"and"|"or")|("Class"|"EquivalentTo"|"Individuals"|"SubClassOf"|"DisjointClasses")\s*:
CLASS_IDENTIFIERS = [A-Z][a-zA-Z]+(_[A-Z][a-zA-Z]+)*
INDIVIDUAL_NAME = [A-Z][a-zA-Z0-9]*\d+
PROPERTY_IDENTIFIERS = "has"[A-Za-z0-9]+|"is"[A-Za-z0-9]+"Of"|[a-z][A-Za-z0-9]*
DATA_TYPE = ("owl"|"rdfs"|"xsd"):[a-zA-Z]+
CARDINALITY = [0-9]+
COMMENT = \#.*
COMMA = ","
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
WHITESPACE = [ \t\r\n\f]
%%
{KEYWORD} { return print("Keyword", yytext()); }
{CLASS_IDENTIFIERS} { return print("Class identifier", yytext()); }
{INDIVIDUAL_NAME} { return print("Individual name", yytext()); }
{PROPERTY_IDENTIFIERS} { return print("Property indentifiers", yytext()); }
{DATA_TYPE} { return print("Data type", yytext()); }
{CARDINALITY} { return print("Cadinality", yytext()); }
{COMMENT} { return print("Comment", yytext()); }
{LEFT_BRACE} { return print("Open Brace", yytext()); }
{RIGHT_BRACE} { return print("Close Brace", yytext()); }
{LEFT_PAREN} { return print("Open Parenthesis", yytext()); }
{RIGHT_PAREN} { return print("Close Parenthesis", yytext()); }
{LEFT_BRACKET} { return print("Open Bracket", yytext()); }
{RIGHT_BRACKET} { return print("Close Bracket", yytext()); }
{GREATER_THAN} { return print("Greater Than", yytext()); }
{LESS_THAN} { return print("Less Than", yytext()); }
{EQUAL} { return print("Equal", yytext()); }
{EQUAL_LESS_THAN} { return print("Equal less than", yytext()); }
{EQUAL_GREATER_THAN} { return print("Equal greater than", yytext()); }
{COMMA} {return print("Comma", yytext()); }
{DOUBLE_QUOTE} { return print("Double Quote", yytext()); }
{WHITESPACE} {/**/} // Ignora espaços em branco

. { return print("Caractere inválido ", yytext()); }