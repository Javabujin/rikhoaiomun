grammar Rikhoaiomun;

specification: systemDecl moduleDecl (entityDecl featureDecl*)* EOF;

systemDecl: '@System' qualifiedName;
moduleDecl: '@Module' qualifiedName;

entityDecl: '@Entity' IDENTIFIER ':' fieldDecl+;

fieldDecl: '-' IDENTIFIER ':' type;

featureDecl:
    '@Feature' '(' IDENTIFIER ')' ':' IDENTIFIER NEWLINE
    inputsDecl?
    outputsDecl?
    commentDecl?;

inputsDecl: '@Inputs:' NEWLINE fieldDecl+;
outputsDecl: '@Outputs:' NEWLINE fieldDecl+;

commentDecl: '@Comment:' MULTILINE_STRING_LITERAL;

qualifiedName: IDENTIFIER ('.' IDENTIFIER)*;

type: IDENTIFIER;

IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;

MULTILINE_STRING_LITERAL: '"""' .*? '"""';  // multi-line comments

NEWLINE: [\r\n]+ -> skip;
WS: [ \t]+ -> skip;
