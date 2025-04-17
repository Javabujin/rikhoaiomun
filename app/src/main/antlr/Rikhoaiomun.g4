grammar Rikhoaiomun;

specification: systemDecl moduleDecl entityDecl+ EOF;

systemDecl: '@System' qualifiedName;
moduleDecl: '@Module' qualifiedName;

entityDecl: '@Entity' name ':' fieldDecl+ '{' featureDecl* '}';

fieldDecl: '-' IDENTIFIER ':' type;

featureDecl:
    '@Feature' ':' name
    inputsDecl?
    outputsDecl?
    commentDecl?;

inputsDecl: '@Inputs:' fieldDecl+;
outputsDecl: '@Outputs:' fieldDecl+;

commentDecl: '@Comment:' MULTILINE_STRING_LITERAL;

qualifiedName: IDENTIFIER ('.' IDENTIFIER)*;

type: IDENTIFIER;

name: (IDENTIFIER WS?)+;

IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;

MULTILINE_STRING_LITERAL: '"""' .*? '"""';  // multi-line comments

NEWLINE: [\r\n]+ -> skip;
WS: [ \t]+ -> skip;
