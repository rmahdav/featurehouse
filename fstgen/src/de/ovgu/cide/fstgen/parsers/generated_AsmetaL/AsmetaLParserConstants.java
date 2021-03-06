/* Generated By:JavaCC: Do not edit this line. AsmetaLParserConstants.java */
package de.ovgu.cide.fstgen.parsers.generated_AsmetaL;

public interface AsmetaLParserConstants {

  int EOF = 0;
  int SINGLE_LINE_COMMENT = 9;
  int FORMAL_COMMENT = 10;
  int MULTI_LINE_COMMENT = 11;
  int ASM = 13;
  int MODULE = 14;
  int ORIGINAL = 15;
  int FINALRULE = 16;
  int FINALINVARIANT = 17;
  int CONJUNCT = 18;
  int ASYNCR = 19;
  int IMPORT = 20;
  int EXPORT = 21;
  int SIGNATURE = 22;
  int INIT = 23;
  int Default = 24;
  int AGENT = 25;
  int INVARIANT = 26;
  int OVER = 27;
  int DEFINITIONS = 28;
  int FUNCTION = 29;
  int STATIC = 30;
  int DYNAMIC = 31;
  int DERIVED = 32;
  int MONITORED = 33;
  int CONTROLLED = 34;
  int SHARED = 35;
  int OUT = 36;
  int DOMAIN = 37;
  int ANYDOMAIN = 38;
  int BASIC = 39;
  int ABSTRACT = 40;
  int ENUM = 41;
  int SUBSETOF = 42;
  int PROD = 43;
  int SEQ = 44;
  int POWERSET = 45;
  int BAG = 46;
  int MAP = 47;
  int RULEDOM = 48;
  int TRUE = 49;
  int FALSE = 50;
  int UNDEF = 51;
  int IM_PART = 52;
  int IF = 53;
  int THEN = 54;
  int ELSE = 55;
  int ENDIF = 56;
  int SWITCH = 57;
  int END_SWITCH = 58;
  int CASE = 59;
  int OTHERWISE = 60;
  int ENDCASE = 61;
  int LET = 62;
  int ENDLET = 63;
  int EXIST = 64;
  int UNIQUE = 65;
  int WITH = 66;
  int FORALL = 67;
  int Skip = 68;
  int RULE = 69;
  int MACRO = 70;
  int TURBO = 71;
  int MAIN = 72;
  int PAR = 73;
  int ENDPAR = 74;
  int CHOOSE = 75;
  int DO = 76;
  int IFNONE = 77;
  int EXTEND = 78;
  int seq = 79;
  int ENDSEQ = 80;
  int ITERATE = 81;
  int ENDITERATE = 82;
  int LOCAL = 83;
  int TRY = 84;
  int CATCH = 85;
  int WHILE = 86;
  int WHILEREC = 87;
  int IN = 88;
  int EQ = 89;
  int LT = 90;
  int LE = 91;
  int GT = 92;
  int GE = 93;
  int NEQ = 94;
  int PLUS = 95;
  int MINUS = 96;
  int MULT = 97;
  int DIV = 98;
  int PWR = 99;
  int AND = 100;
  int NOT = 101;
  int OR = 102;
  int XOR = 103;
  int IMPLIES = 104;
  int MOD = 105;
  int NOTIN = 106;
  int IFF = 107;
  int CTLSPEC = 108;
  int NUMBER = 109;
  int NATNUMBER = 110;
  int REAL_NUMBER = 111;
  int COMPLEX_NUMBER = 112;
  int ID_VARIABLE = 113;
  int ID_ENUM = 114;
  int ID_DOMAIN = 115;
  int ID_RULE = 116;
  int ID_INVARIANT = 117;
  int ID_FUNCTION = 118;
  int LETTER = 119;
  int DIGIT = 120;
  int CHAR_LITERAL = 121;
  int STRING_LITERAL = 122;
  int ID = 123;
  int MOD_ID = 124;

  int DEFAULT = 0;
  int GENERIC_ID = 1;
  int MODULE_ID = 2;
  int IN_SINGLE_LINE_COMMENT = 3;
  int IN_FORMAL_COMMENT = 4;
  int IN_MULTI_LINE_COMMENT = 5;

  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "\"//\"",
    "<token of kind 7>",
    "\"/*\"",
    "<SINGLE_LINE_COMMENT>",
    "\"*/\"",
    "\"*/\"",
    "<token of kind 12>",
    "\"asm\"",
    "\"module\"",
    "\"@original\"",
    "\"@final_rule\"",
    "\"@final_invariant\"",
    "\"@conjunct\"",
    "\"asyncr\"",
    "\"import\"",
    "\"export\"",
    "\"signature\"",
    "\"init\"",
    "\"default\"",
    "\"agent\"",
    "\"invariant\"",
    "\"over\"",
    "\"definitions\"",
    "\"function\"",
    "\"static\"",
    "\"dynamic\"",
    "\"derived\"",
    "\"monitored\"",
    "\"controlled\"",
    "\"shared\"",
    "\"out\"",
    "\"domain\"",
    "\"anydomain\"",
    "\"basic\"",
    "\"abstract\"",
    "\"enum\"",
    "\"subsetof\"",
    "\"Prod\"",
    "\"Seq\"",
    "\"Powerset\"",
    "\"Bag\"",
    "\"Map\"",
    "\"Rule\"",
    "\"true\"",
    "\"false\"",
    "\"undef\"",
    "\"i\"",
    "\"if\"",
    "\"then\"",
    "\"else\"",
    "\"endif\"",
    "\"switch\"",
    "\"endswitch\"",
    "\"case\"",
    "\"otherwise\"",
    "\"endcase\"",
    "\"let\"",
    "\"endlet\"",
    "\"exist\"",
    "\"unique\"",
    "\"with\"",
    "\"forall\"",
    "\"skip\"",
    "\"rule\"",
    "\"macro\"",
    "\"turbo\"",
    "\"main\"",
    "\"par\"",
    "\"endpar\"",
    "\"choose\"",
    "\"do\"",
    "\"ifnone\"",
    "\"extend\"",
    "\"seq\"",
    "\"endseq\"",
    "\"iterate\"",
    "\"enditerate\"",
    "\"local\"",
    "\"try\"",
    "\"catch\"",
    "\"while\"",
    "\"whilerec\"",
    "\"in\"",
    "\"=\"",
    "\"<\"",
    "\"<=\"",
    "\">\"",
    "\">=\"",
    "\"!=\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"^\"",
    "\"and\"",
    "\"not\"",
    "\"or\"",
    "\"xor\"",
    "\"implies\"",
    "\"mod\"",
    "\"notin\"",
    "\"iff\"",
    "\"CTLSPEC\"",
    "<NUMBER>",
    "<NATNUMBER>",
    "<REAL_NUMBER>",
    "<COMPLEX_NUMBER>",
    "<ID_VARIABLE>",
    "<ID_ENUM>",
    "<ID_DOMAIN>",
    "<ID_RULE>",
    "<ID_INVARIANT>",
    "<ID_FUNCTION>",
    "<LETTER>",
    "<DIGIT>",
    "<CHAR_LITERAL>",
    "<STRING_LITERAL>",
    "<ID>",
    "<MOD_ID>",
    "\"(\"",
    "\",\"",
    "\")\"",
    "\":\"",
    "\"()\"",
    "\"{\"",
    "\"|\"",
    "\"}\"",
    "\"->\"",
    "\".\"",
    "\"..\"",
    "\"[\"",
    "\"]\"",
    "\"<<\"",
    "\">>\"",
    "\"#\"",
    "\":=\"",
    "\"<-\"",
  };

}
