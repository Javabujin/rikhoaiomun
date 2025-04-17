grammar Rikhoaiomun;

specification: systemDecl moduleDecl entityAndFeatureDecl+ EOF;

systemDecl: '@System' qualifiedName;
moduleDecl: '@Module' qualifiedName;

entityAndFeatureDecl: entityDecl featureDecl*;

entityDecl: '@Entity' name ':' fieldDecl+;

fieldDecl: '-' IDENTIFIER ':' type;

featureDecl:
    '@Feature' '(' name ')' ':' name
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
