lexer grammar Java;
@members {
  protected boolean enumIsKeyword = true;
  protected boolean assertIsKeyword = true;
}

T__25 : '!' ;
T__26 : '!=' ;
T__27 : '%' ;
T__28 : '%=' ;
T__29 : '&&' ;
T__30 : '&' ;
T__31 : '&=' ;
T__32 : '(' ;
T__33 : ')' ;
T__34 : '*' ;
T__35 : '*=' ;
T__36 : '+' ;
T__37 : '++' ;
T__38 : '+=' ;
T__39 : ',' ;
T__40 : '-' ;
T__41 : '--' ;
T__42 : '-=' ;
T__43 : '.' ;
T__44 : '...' ;
T__45 : '/' ;
T__46 : '/=' ;
T__47 : ':' ;
T__48 : ';' ;
T__49 : '<' ;
T__50 : '=' ;
T__51 : '==' ;
T__52 : '>' ;
T__53 : '?' ;
T__54 : '@' ;
T__55 : '[' ;
T__56 : ']' ;
T__57 : '^' ;
T__58 : '^=' ;
T__59 : 'abstract' ;
T__60 : 'boolean' ;
T__61 : 'break' ;
T__62 : 'byte' ;
T__63 : 'case' ;
T__64 : 'catch' ;
T__65 : 'char' ;
T__66 : 'class' ;
T__67 : 'continue' ;
T__68 : 'default' ;
T__69 : 'do' ;
T__70 : 'double' ;
T__71 : 'else' ;
T__72 : 'extends' ;
T__73 : 'false' ;
T__74 : 'final' ;
T__75 : 'finally' ;
T__76 : 'float' ;
T__77 : 'for' ;
T__78 : 'if' ;
T__79 : 'implements' ;
T__80 : 'import' ;
T__81 : 'instanceof' ;
T__82 : 'int' ;
T__83 : 'interface' ;
T__84 : 'long' ;
T__85 : 'native' ;
T__86 : 'new' ;
T__87 : 'null' ;
T__88 : 'package' ;
T__89 : 'private' ;
T__90 : 'protected' ;
T__91 : 'public' ;
T__92 : 'return' ;
T__93 : 'short' ;
T__94 : 'static' ;
T__95 : 'strictfp' ;
T__96 : 'super' ;
T__97 : 'switch' ;
T__98 : 'synchronized' ;
T__99 : 'this' ;
T__100 : 'throw' ;
T__101 : 'throws' ;
T__102 : 'transient' ;
T__103 : 'true' ;
T__104 : 'try' ;
T__105 : 'void' ;
T__106 : 'volatile' ;
T__107 : 'while' ;
T__108 : '{' ;
T__109 : '|' ;
T__110 : '|=' ;
T__111 : '||' ;
T__112 : '}' ;
T__113 : '~' ;

// $ANTLR src "src/main/com/kitcode/Java.g" 911
HexLiteral : '0' ('x'|'X') HexDigit+ IntegerTypeSuffix? ;// $ANTLR src "src/main/com/kitcode/Java.g" 913
DecimalLiteral : ('0' | '1'..'9' '0'..'9'*) IntegerTypeSuffix? ;// $ANTLR src "src/main/com/kitcode/Java.g" 915
OctalLiteral : '0' ('0'..'7')+ IntegerTypeSuffix? ;// $ANTLR src "src/main/com/kitcode/Java.g" 918
fragment
HexDigit : ('0'..'9'|'a'..'f'|'A'..'F') ;// $ANTLR src "src/main/com/kitcode/Java.g" 921
fragment
IntegerTypeSuffix : ('l'|'L') ;// $ANTLR src "src/main/com/kitcode/Java.g" 923
FloatingPointLiteral
    :   ('0'..'9')+ '.' ('0'..'9')* Exponent? FloatTypeSuffix?
    |   '.' ('0'..'9')+ Exponent? FloatTypeSuffix?
    |   ('0'..'9')+ Exponent FloatTypeSuffix?
    |   ('0'..'9')+ FloatTypeSuffix
    ;// $ANTLR src "src/main/com/kitcode/Java.g" 931
fragment
Exponent : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;// $ANTLR src "src/main/com/kitcode/Java.g" 934
fragment
FloatTypeSuffix : ('f'|'F'|'d'|'D') ;// $ANTLR src "src/main/com/kitcode/Java.g" 936
CharacterLiteral
    :   '\'' ( EscapeSequence | ~('\''|'\\') ) '\''
    ;// $ANTLR src "src/main/com/kitcode/Java.g" 940
StringLiteral
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;// $ANTLR src "src/main/com/kitcode/Java.g" 945
fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UnicodeEscape
    |   OctalEscape
    ;// $ANTLR src "src/main/com/kitcode/Java.g" 952
fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;// $ANTLR src "src/main/com/kitcode/Java.g" 959
fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;// $ANTLR src "src/main/com/kitcode/Java.g" 963
ENUM:   'enum' {if (!enumIsKeyword) $type=Identifier;}
    ;// $ANTLR src "src/main/com/kitcode/Java.g" 966
ASSERT
    :   'assert' {if (!assertIsKeyword) $type=Identifier;}
    ;// $ANTLR src "src/main/com/kitcode/Java.g" 970
Identifier 
    :   Letter (Letter|JavaIDDigit)*
    ;// $ANTLR src "src/main/com/kitcode/Java.g" 978
/**I found this char range in JavaCC's grammar, but Letter and Digit overlap.
   Still works, but...
 */
fragment
Letter
    :  '\u0024' |
       '\u0041'..'\u005a' |
       '\u005f' |
       '\u0061'..'\u007a' |
       '\u00c0'..'\u00d6' |
       '\u00d8'..'\u00f6' |
       '\u00f8'..'\u00ff' |
       '\u0100'..'\u1fff' |
       '\u3040'..'\u318f' |
       '\u3300'..'\u337f' |
       '\u3400'..'\u3d2d' |
       '\u4e00'..'\u9fff' |
       '\uf900'..'\ufaff'
    ;// $ANTLR src "src/main/com/kitcode/Java.g" 995
fragment
JavaIDDigit
    :  '\u0030'..'\u0039' |
       '\u0660'..'\u0669' |
       '\u06f0'..'\u06f9' |
       '\u0966'..'\u096f' |
       '\u09e6'..'\u09ef' |
       '\u0a66'..'\u0a6f' |
       '\u0ae6'..'\u0aef' |
       '\u0b66'..'\u0b6f' |
       '\u0be7'..'\u0bef' |
       '\u0c66'..'\u0c6f' |
       '\u0ce6'..'\u0cef' |
       '\u0d66'..'\u0d6f' |
       '\u0e50'..'\u0e59' |
       '\u0ed0'..'\u0ed9' |
       '\u1040'..'\u1049'
   ;// $ANTLR src "src/main/com/kitcode/Java.g" 1013
WS  :  (' '|'\r'|'\t'|'\u000C'|'\n')+ {$channel=HIDDEN;}
    ;// $ANTLR src "src/main/com/kitcode/Java.g" 1016
COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;// $ANTLR src "src/main/com/kitcode/Java.g" 1020
LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;