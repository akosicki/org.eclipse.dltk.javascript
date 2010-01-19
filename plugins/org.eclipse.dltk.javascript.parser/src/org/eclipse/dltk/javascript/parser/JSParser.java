// $ANTLR 3.0.1 JS.g 2010-01-19 21:10:01

package org.eclipse.dltk.javascript.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class JSParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NULL", "TRUE", "FALSE", "BREAK", "CASE", "CATCH", "CONTINUE", "DEFAULT", "DELETE", "DO", "ELSE", "FINALLY", "FOR", "EACH", "FUNCTION", "IF", "IN", "INSTANCEOF", "NEW", "RETURN", "SWITCH", "THIS", "THROW", "TRY", "TYPEOF", "VAR", "VOID", "WHILE", "WITH", "GET", "SET", "YIELD", "CDATA", "WXML", "NAMESPACE", "ABSTRACT", "BOOLEAN", "BYTE", "CHAR", "CLASS", "CONST", "DEBUGGER", "DOUBLE", "ENUM", "EXPORT", "EXTENDS", "FINAL", "FLOAT", "GOTO", "IMPLEMENTS", "IMPORT", "INT", "INTERFACE", "LONG", "NATIVE", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "SHORT", "STATIC", "SUPER", "SYNCHRONIZED", "THROWS", "TRANSIENT", "VOLATILE", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "DOT", "SEMIC", "COMMA", "LT", "GT", "LTE", "GTE", "EQ", "NEQ", "SAME", "NSAME", "ADD", "SUB", "MUL", "MOD", "INC", "DEC", "SHL", "SHR", "SHU", "AND", "OR", "XOR", "NOT", "INV", "LAND", "LOR", "QUE", "COLON", "ASSIGN", "ADDASS", "SUBASS", "MULASS", "MODASS", "SHLASS", "SHRASS", "SHUASS", "ANDASS", "ORASS", "XORASS", "DIV", "DIVASS", "XCOPEN", "XCCLOSE", "XLCLOSE", "XRCLOSE", "CDATAOPEN", "XHOPEN", "XHCLOSE", "AT", "DOTDOT", "COLONCOLON", "ARGS", "ARRAY", "BLOCK", "BYFIELD", "BYINDEX", "ALLCHILDREN", "LOCALNAME", "CALL", "CEXPR", "EXPR", "FORITER", "FORSTEP", "FOREACH", "GETTER", "SETTER", "DEFAULT_XML_NAMESPACE", "ITEM", "LABELLED", "NAMEDVALUE", "NEG", "OBJECT", "PAREXPR", "PDEC", "PINC", "POS", "XMLLiteral", "BSLASH", "DQUOTE", "SQUOTE", "TAB", "VT", "FF", "SP", "NBSP", "USP", "WhiteSpace", "LF", "CR", "LS", "PS", "LineTerminatorChar", "LineTerminator", "EOL", "MultiLineComment", "SingleLineComment", "StringLiteral", "XmlAttribute", "HexDigit", "IdentifierStartASCII", "DecimalDigit", "IdentifierPart", "IdentifierNameASCIIStart", "Identifier", "PropertyIdentifierSymbols", "RegularExpressionLiteral", "OctalDigit", "ExponentPart", "DecimalIntegerLiteral", "DecimalLiteral", "OctalIntegerLiteral", "HexIntegerLiteral", "CharacterEscapeSequence", "ZeroToThree", "OctalEscapeSequence", "HexEscapeSequence", "UnicodeEscapeSequence", "EscapeSequence", "BackslashSequence", "RegularExpressionFirstChar", "RegularExpressionChar"
    };
    public static final int PACKAGE=59;
    public static final int FUNCTION=18;
    public static final int SHR=94;
    public static final int VT=158;
    public static final int RegularExpressionChar=197;
    public static final int CDATA=36;
    public static final int XRCLOSE=121;
    public static final int LOCALNAME=134;
    public static final int MOD=90;
    public static final int SHL=93;
    public static final int CONST=44;
    public static final int XHOPEN=123;
    public static final int DO=13;
    public static final int DQUOTE=155;
    public static final int LineTerminatorChar=168;
    public static final int NOT=99;
    public static final int EOF=-1;
    public static final int CEXPR=136;
    public static final int DIVASS=117;
    public static final int BYINDEX=132;
    public static final int INC=91;
    public static final int RPAREN=73;
    public static final int FINAL=50;
    public static final int FORSTEP=139;
    public static final int IMPORT=54;
    public static final int EOL=170;
    public static final int XLCLOSE=120;
    public static final int PropertyIdentifierSymbols=181;
    public static final int OctalDigit=183;
    public static final int RETURN=23;
    public static final int THIS=25;
    public static final int ARGS=128;
    public static final int GET=33;
    public static final int WhiteSpace=163;
    public static final int EXPORT=48;
    public static final int EQ=83;
    public static final int GOTO=52;
    public static final int XORASS=115;
    public static final int SHU=95;
    public static final int RBRACK=75;
    public static final int RBRACE=71;
    public static final int STATIC=64;
    public static final int INV=100;
    public static final int ELSE=14;
    public static final int NATIVE=58;
    public static final int INT=55;
    public static final int DEFAULT_XML_NAMESPACE=143;
    public static final int FF=159;
    public static final int OctalEscapeSequence=191;
    public static final int RegularExpressionFirstChar=196;
    public static final int TYPEOF=28;
    public static final int GT=80;
    public static final int CALL=135;
    public static final int CharacterEscapeSequence=189;
    public static final int LAND=101;
    public static final int PINC=151;
    public static final int PROTECTED=61;
    public static final int LBRACK=74;
    public static final int LBRACE=70;
    public static final int SUB=88;
    public static final int RegularExpressionLiteral=182;
    public static final int FLOAT=51;
    public static final int DecimalIntegerLiteral=185;
    public static final int HexDigit=175;
    public static final int LPAREN=72;
    public static final int AT=125;
    public static final int IMPLEMENTS=53;
    public static final int CDATAOPEN=122;
    public static final int YIELD=35;
    public static final int XCCLOSE=119;
    public static final int SHRASS=111;
    public static final int PS=167;
    public static final int MultiLineComment=171;
    public static final int ADD=87;
    public static final int ZeroToThree=190;
    public static final int ITEM=144;
    public static final int XMLLiteral=153;
    public static final int UnicodeEscapeSequence=193;
    public static final int SHUASS=112;
    public static final int SHORT=63;
    public static final int SET=34;
    public static final int INSTANCEOF=21;
    public static final int SQUOTE=156;
    public static final int SAME=85;
    public static final int XHCLOSE=124;
    public static final int COLON=104;
    public static final int StringLiteral=173;
    public static final int PAREXPR=149;
    public static final int ENUM=47;
    public static final int HexIntegerLiteral=188;
    public static final int NBSP=161;
    public static final int SP=160;
    public static final int BLOCK=130;
    public static final int LineTerminator=169;
    public static final int INTERFACE=56;
    public static final int DIV=116;
    public static final int LONG=57;
    public static final int CR=165;
    public static final int PUBLIC=62;
    public static final int LOR=102;
    public static final int LT=79;
    public static final int WHILE=31;
    public static final int BackslashSequence=195;
    public static final int LS=166;
    public static final int CASE=8;
    public static final int NEW=22;
    public static final int CHAR=42;
    public static final int DecimalDigit=177;
    public static final int BYFIELD=131;
    public static final int BREAK=7;
    public static final int Identifier=180;
    public static final int WXML=37;
    public static final int POS=152;
    public static final int DOUBLE=46;
    public static final int ExponentPart=184;
    public static final int VAR=29;
    public static final int VOID=30;
    public static final int SUPER=65;
    public static final int EACH=17;
    public static final int LABELLED=145;
    public static final int ADDASS=106;
    public static final int ARRAY=129;
    public static final int PRIVATE=60;
    public static final int SWITCH=24;
    public static final int NULL=4;
    public static final int THROWS=67;
    public static final int DELETE=12;
    public static final int XCOPEN=118;
    public static final int MUL=89;
    public static final int IdentifierStartASCII=176;
    public static final int TRY=27;
    public static final int NAMESPACE=38;
    public static final int SHLASS=110;
    public static final int COLONCOLON=127;
    public static final int USP=162;
    public static final int ANDASS=113;
    public static final int IdentifierNameASCIIStart=179;
    public static final int QUE=103;
    public static final int OR=97;
    public static final int SETTER=142;
    public static final int DEBUGGER=45;
    public static final int FOREACH=140;
    public static final int PDEC=150;
    public static final int CATCH=9;
    public static final int FALSE=6;
    public static final int EscapeSequence=194;
    public static final int THROW=26;
    public static final int MULASS=108;
    public static final int XmlAttribute=174;
    public static final int DEC=92;
    public static final int OctalIntegerLiteral=187;
    public static final int CLASS=43;
    public static final int HexEscapeSequence=192;
    public static final int ORASS=114;
    public static final int NAMEDVALUE=146;
    public static final int SingleLineComment=172;
    public static final int GTE=82;
    public static final int FOR=16;
    public static final int DOTDOT=126;
    public static final int ABSTRACT=39;
    public static final int AND=96;
    public static final int LTE=81;
    public static final int IF=19;
    public static final int SUBASS=107;
    public static final int SYNCHRONIZED=66;
    public static final int BOOLEAN=40;
    public static final int EXPR=137;
    public static final int IN=20;
    public static final int CONTINUE=10;
    public static final int OBJECT=148;
    public static final int COMMA=78;
    public static final int TRANSIENT=68;
    public static final int FORITER=138;
    public static final int MODASS=109;
    public static final int DOT=76;
    public static final int IdentifierPart=178;
    public static final int WITH=32;
    public static final int BYTE=41;
    public static final int XOR=98;
    public static final int VOLATILE=69;
    public static final int GETTER=141;
    public static final int NSAME=86;
    public static final int DEFAULT=11;
    public static final int ALLCHILDREN=133;
    public static final int TAB=157;
    public static final int DecimalLiteral=186;
    public static final int TRUE=5;
    public static final int NEQ=84;
    public static final int FINALLY=15;
    public static final int NEG=147;
    public static final int ASSIGN=105;
    public static final int SEMIC=77;
    public static final int EXTENDS=49;
    public static final int BSLASH=154;
    public static final int LF=164;

        public JSParser(TokenStream input) {
            super(input);
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "JS.g"; }


    private final boolean isLeftHandSideAssign(RuleReturnScope lhs, Object[] cached)
    {
    	if (cached[0] != null)
    	{
    		return ((Boolean)cached[0]).booleanValue();
    	}
    	
    	boolean result;
    	if (isLeftHandSideExpression(lhs))
    	{
    		switch (input.LA(1))
    		{
    			case ASSIGN:
    			case MULASS:
    			case DIVASS:
    			case MODASS:
    			case ADDASS:
    			case SUBASS:
    			case SHLASS:
    			case SHRASS:
    			case SHUASS:
    			case ANDASS:
    			case XORASS:
    			case ORASS:
    				result = true;
    				break;
    			default:
    				result = false;
    				break;
    		}
    	}
    	else
    	{
    		result = false;
    	}
    	
    	cached[0] = new Boolean(result);
    	return result;
    }

    private final static boolean isLeftHandSideExpression(RuleReturnScope lhs)
    {
    	if (lhs.getTree() == null) // e.g. during backtracking
    	{
    		return true;
    	}
    	else
    	{
      		if (JSLexer.isIdentifierKeyword(((Tree)lhs.getTree()).getType())) {
    			return true;
    		}
    		switch (((Tree)lhs.getTree()).getType())
    		{
    		// primaryExpression
    			case THIS:
    			case Identifier:
    			case XmlAttribute:
    			case NULL:
    			case TRUE:
    			case FALSE:
    			case DecimalLiteral:
    			case OctalIntegerLiteral:
    			case HexIntegerLiteral:
    			case StringLiteral:
    			case RegularExpressionLiteral:
    			case XMLLiteral:
    			case ARRAY:
    			case OBJECT:
    			case PAREXPR:
    		// functionExpression
    			case FUNCTION:
    		// newExpression
    			case NEW:
    		// leftHandSideExpression
    			case CALL:
    			case BYFIELD:
    			case BYINDEX:
    				return true;
    			
    			default:
    				return false;
    		}
    	}
    }
    	
    private final boolean isLeftHandSideIn(RuleReturnScope lhs, Object[] cached)
    {
    	if (cached[0] != null)
    	{
    		return ((Boolean)cached[0]).booleanValue();
    	}
    	
    	boolean result = isLeftHandSideExpression(lhs) && (input.LA(1) == IN);
    	cached[0] = new Boolean(result);
    	return result;
    }

    private final void promoteEOL(ParserRuleReturnScope rule)
    {
    	// Get current token and its type (the possibly offending token).
    	Token lt = input.LT(1);
    	int la = lt.getType();
    	
    	// We only need to promote an EOL when the current token is offending (not a SEMIC, EOF, RBRACE, EOL or MultiLineComment).
    	// EOL and MultiLineComment are not offending as they're already promoted in a previous call to this method.
    	// Promoting an EOL means switching it from off channel to on channel.
    	// A MultiLineComment gets promoted when it contains an EOL.
    	if (!(la == SEMIC || la == EOF || la == RBRACE || la == EOL || la == MultiLineComment))
    	{
    		// Start on the possition before the current token and scan backwards off channel tokens until the previous on channel token.
    		for (int ix = lt.getTokenIndex() - 1; ix > 0; ix--)
    		{
    			lt = input.get(ix);
    			if (lt.getChannel() == Token.DEFAULT_CHANNEL)
    			{
    				// On channel token found: stop scanning.
    				break;
    			}
    			else if (lt.getType() == EOL || (lt.getType() == MultiLineComment && lt.getText().matches("/.*\r\n|\r|\n")))
    			{
    				// We found our EOL: promote the token to on channel, position the input on it and reset the rule start.
    				lt.setChannel(Token.DEFAULT_CHANNEL);
    				input.seek(lt.getTokenIndex());
    				if (rule != null)
    				{
    					rule.start = lt;
    				}
    				break;
    			}
    		}
    	}
    }	


    public static class token_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start token
    // JS.g:614:1: token : ( reservedWord | identifier | punctuator | numericLiteral | StringLiteral | XmlAttribute );
    public final token_return token() throws RecognitionException {
        token_return retval = new token_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token StringLiteral5=null;
        Token XmlAttribute6=null;
        reservedWord_return reservedWord1 = null;

        identifier_return identifier2 = null;

        punctuator_return punctuator3 = null;

        numericLiteral_return numericLiteral4 = null;


        Object StringLiteral5_tree=null;
        Object XmlAttribute6_tree=null;

        try {
            // JS.g:615:2: ( reservedWord | identifier | punctuator | numericLiteral | StringLiteral | XmlAttribute )
            int alt1=6;
            switch ( input.LA(1) ) {
            case NULL:
            case TRUE:
            case FALSE:
            case BREAK:
            case CASE:
            case CATCH:
            case CONTINUE:
            case DEFAULT:
            case DELETE:
            case DO:
            case ELSE:
            case FINALLY:
            case FOR:
            case EACH:
            case FUNCTION:
            case IF:
            case IN:
            case INSTANCEOF:
            case NEW:
            case RETURN:
            case SWITCH:
            case THIS:
            case THROW:
            case TRY:
            case TYPEOF:
            case VAR:
            case VOID:
            case WHILE:
            case WITH:
            case GET:
            case SET:
            case YIELD:
            case WXML:
            case NAMESPACE:
            case ABSTRACT:
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case CLASS:
            case CONST:
            case DEBUGGER:
            case DOUBLE:
            case ENUM:
            case EXPORT:
            case EXTENDS:
            case FINAL:
            case FLOAT:
            case GOTO:
            case IMPLEMENTS:
            case IMPORT:
            case INT:
            case INTERFACE:
            case LONG:
            case NATIVE:
            case PACKAGE:
            case PRIVATE:
            case PROTECTED:
            case PUBLIC:
            case SHORT:
            case STATIC:
            case SUPER:
            case SYNCHRONIZED:
            case THROWS:
            case TRANSIENT:
            case VOLATILE:
                {
                alt1=1;
                }
                break;
            case Identifier:
                {
                alt1=2;
                }
                break;
            case LBRACE:
            case RBRACE:
            case LPAREN:
            case RPAREN:
            case LBRACK:
            case RBRACK:
            case DOT:
            case SEMIC:
            case COMMA:
            case LT:
            case GT:
            case LTE:
            case GTE:
            case EQ:
            case NEQ:
            case SAME:
            case NSAME:
            case ADD:
            case SUB:
            case MUL:
            case MOD:
            case INC:
            case DEC:
            case SHL:
            case SHR:
            case SHU:
            case AND:
            case OR:
            case XOR:
            case NOT:
            case INV:
            case LAND:
            case LOR:
            case QUE:
            case COLON:
            case ASSIGN:
            case ADDASS:
            case SUBASS:
            case MULASS:
            case MODASS:
            case SHLASS:
            case SHRASS:
            case SHUASS:
            case ANDASS:
            case ORASS:
            case XORASS:
            case DIV:
            case DIVASS:
            case DOTDOT:
            case COLONCOLON:
                {
                alt1=3;
                }
                break;
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt1=4;
                }
                break;
            case StringLiteral:
                {
                alt1=5;
                }
                break;
            case XmlAttribute:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("614:1: token : ( reservedWord | identifier | punctuator | numericLiteral | StringLiteral | XmlAttribute );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // JS.g:615:4: reservedWord
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_reservedWord_in_token1997);
                    reservedWord1=reservedWord();
                    _fsp--;

                    adaptor.addChild(root_0, reservedWord1.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:616:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_token2002);
                    identifier2=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier2.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:617:4: punctuator
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_punctuator_in_token2007);
                    punctuator3=punctuator();
                    _fsp--;

                    adaptor.addChild(root_0, punctuator3.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:618:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_token2012);
                    numericLiteral4=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral4.getTree());

                    }
                    break;
                case 5 :
                    // JS.g:619:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral5=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_token2017); 
                    StringLiteral5_tree = (Object)adaptor.create(StringLiteral5);
                    adaptor.addChild(root_0, StringLiteral5_tree);


                    }
                    break;
                case 6 :
                    // JS.g:620:4: XmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    XmlAttribute6=(Token)input.LT(1);
                    match(input,XmlAttribute,FOLLOW_XmlAttribute_in_token2022); 
                    XmlAttribute6_tree = (Object)adaptor.create(XmlAttribute6);
                    adaptor.addChild(root_0, XmlAttribute6_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end token

    public static class reservedWord_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start reservedWord
    // JS.g:626:1: reservedWord : ( keyword | futureReservedWord | NULL | booleanLiteral );
    public final reservedWord_return reservedWord() throws RecognitionException {
        reservedWord_return retval = new reservedWord_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NULL9=null;
        keyword_return keyword7 = null;

        futureReservedWord_return futureReservedWord8 = null;

        booleanLiteral_return booleanLiteral10 = null;


        Object NULL9_tree=null;

        try {
            // JS.g:627:2: ( keyword | futureReservedWord | NULL | booleanLiteral )
            int alt2=4;
            switch ( input.LA(1) ) {
            case BREAK:
            case CASE:
            case CATCH:
            case CONTINUE:
            case DEFAULT:
            case DELETE:
            case DO:
            case ELSE:
            case FINALLY:
            case FOR:
            case EACH:
            case FUNCTION:
            case IF:
            case IN:
            case INSTANCEOF:
            case NEW:
            case RETURN:
            case SWITCH:
            case THIS:
            case THROW:
            case TRY:
            case TYPEOF:
            case VAR:
            case VOID:
            case WHILE:
            case WITH:
            case GET:
            case SET:
            case YIELD:
            case WXML:
            case NAMESPACE:
                {
                alt2=1;
                }
                break;
            case ABSTRACT:
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case CLASS:
            case CONST:
            case DEBUGGER:
            case DOUBLE:
            case ENUM:
            case EXPORT:
            case EXTENDS:
            case FINAL:
            case FLOAT:
            case GOTO:
            case IMPLEMENTS:
            case IMPORT:
            case INT:
            case INTERFACE:
            case LONG:
            case NATIVE:
            case PACKAGE:
            case PRIVATE:
            case PROTECTED:
            case PUBLIC:
            case SHORT:
            case STATIC:
            case SUPER:
            case SYNCHRONIZED:
            case THROWS:
            case TRANSIENT:
            case VOLATILE:
                {
                alt2=2;
                }
                break;
            case NULL:
                {
                alt2=3;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("626:1: reservedWord : ( keyword | futureReservedWord | NULL | booleanLiteral );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // JS.g:627:4: keyword
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_reservedWord2037);
                    keyword7=keyword();
                    _fsp--;

                    adaptor.addChild(root_0, keyword7.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:628:4: futureReservedWord
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_futureReservedWord_in_reservedWord2042);
                    futureReservedWord8=futureReservedWord();
                    _fsp--;

                    adaptor.addChild(root_0, futureReservedWord8.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:629:4: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL9=(Token)input.LT(1);
                    match(input,NULL,FOLLOW_NULL_in_reservedWord2047); 
                    NULL9_tree = (Object)adaptor.create(NULL9);
                    adaptor.addChild(root_0, NULL9_tree);


                    }
                    break;
                case 4 :
                    // JS.g:630:4: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_reservedWord2052);
                    booleanLiteral10=booleanLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, booleanLiteral10.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end reservedWord

    public static class keyword_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start keyword
    // JS.g:637:1: keyword : ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | EACH | FUNCTION | GET | SET | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH | NAMESPACE | WXML | YIELD );
    public final keyword_return keyword() throws RecognitionException {
        keyword_return retval = new keyword_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set11=null;

        Object set11_tree=null;

        try {
            // JS.g:638:2: ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | EACH | FUNCTION | GET | SET | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH | NAMESPACE | WXML | YIELD )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set11=(Token)input.LT(1);
            if ( (input.LA(1)>=BREAK && input.LA(1)<=YIELD)||(input.LA(1)>=WXML && input.LA(1)<=NAMESPACE) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set11));
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_keyword0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end keyword

    public static class futureReservedWord_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start futureReservedWord
    // JS.g:675:1: futureReservedWord : ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE );
    public final futureReservedWord_return futureReservedWord() throws RecognitionException {
        futureReservedWord_return retval = new futureReservedWord_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set12=null;

        Object set12_tree=null;

        try {
            // JS.g:676:2: ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set12=(Token)input.LT(1);
            if ( (input.LA(1)>=ABSTRACT && input.LA(1)<=VOLATILE) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set12));
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_futureReservedWord0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end futureReservedWord

    public static class identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start identifier
    // JS.g:749:1: identifier : ( WXML | GET | SET | EACH | NAMESPACE | Identifier );
    public final identifier_return identifier() throws RecognitionException {
        identifier_return retval = new identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set13=null;

        Object set13_tree=null;

        try {
            // JS.g:750:3: ( WXML | GET | SET | EACH | NAMESPACE | Identifier )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set13=(Token)input.LT(1);
            if ( input.LA(1)==EACH||(input.LA(1)>=GET && input.LA(1)<=SET)||(input.LA(1)>=WXML && input.LA(1)<=NAMESPACE)||input.LA(1)==Identifier ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set13));
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_identifier0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end identifier

    public static class punctuator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start punctuator
    // JS.g:770:1: punctuator : ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | DOTDOT | COLONCOLON );
    public final punctuator_return punctuator() throws RecognitionException {
        punctuator_return retval = new punctuator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set14=null;

        Object set14_tree=null;

        try {
            // JS.g:771:2: ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | DOTDOT | COLONCOLON )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set14=(Token)input.LT(1);
            if ( (input.LA(1)>=LBRACE && input.LA(1)<=DIVASS)||(input.LA(1)>=DOTDOT && input.LA(1)<=COLONCOLON) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set14));
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_punctuator0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end punctuator

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start literal
    // JS.g:828:1: literal : ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NULL15=null;
        Token StringLiteral18=null;
        Token RegularExpressionLiteral19=null;
        booleanLiteral_return booleanLiteral16 = null;

        numericLiteral_return numericLiteral17 = null;


        Object NULL15_tree=null;
        Object StringLiteral18_tree=null;
        Object RegularExpressionLiteral19_tree=null;

        try {
            // JS.g:829:2: ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral )
            int alt3=5;
            switch ( input.LA(1) ) {
            case NULL:
                {
                alt3=1;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt3=2;
                }
                break;
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt3=3;
                }
                break;
            case StringLiteral:
                {
                alt3=4;
                }
                break;
            case RegularExpressionLiteral:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("828:1: literal : ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // JS.g:829:4: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL15=(Token)input.LT(1);
                    match(input,NULL,FOLLOW_NULL_in_literal2847); 
                    NULL15_tree = (Object)adaptor.create(NULL15);
                    adaptor.addChild(root_0, NULL15_tree);


                    }
                    break;
                case 2 :
                    // JS.g:830:4: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_literal2852);
                    booleanLiteral16=booleanLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, booleanLiteral16.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:831:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_literal2857);
                    numericLiteral17=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral17.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:832:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral18=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_literal2862); 
                    StringLiteral18_tree = (Object)adaptor.create(StringLiteral18);
                    adaptor.addChild(root_0, StringLiteral18_tree);


                    }
                    break;
                case 5 :
                    // JS.g:833:4: RegularExpressionLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    RegularExpressionLiteral19=(Token)input.LT(1);
                    match(input,RegularExpressionLiteral,FOLLOW_RegularExpressionLiteral_in_literal2867); 
                    RegularExpressionLiteral19_tree = (Object)adaptor.create(RegularExpressionLiteral19);
                    adaptor.addChild(root_0, RegularExpressionLiteral19_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end literal

    public static class booleanLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start booleanLiteral
    // JS.g:836:1: booleanLiteral : ( TRUE | FALSE );
    public final booleanLiteral_return booleanLiteral() throws RecognitionException {
        booleanLiteral_return retval = new booleanLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set20=null;

        Object set20_tree=null;

        try {
            // JS.g:837:2: ( TRUE | FALSE )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set20=(Token)input.LT(1);
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set20));
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_booleanLiteral0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end booleanLiteral

    public static class numericLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start numericLiteral
    // JS.g:883:1: numericLiteral : ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral );
    public final numericLiteral_return numericLiteral() throws RecognitionException {
        numericLiteral_return retval = new numericLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set21=null;

        Object set21_tree=null;

        try {
            // JS.g:884:2: ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set21=(Token)input.LT(1);
            if ( (input.LA(1)>=DecimalLiteral && input.LA(1)<=HexIntegerLiteral) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set21));
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_numericLiteral0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end numericLiteral

    public static class primaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start primaryExpression
    // JS.g:979:1: primaryExpression : ( THIS | identifier | XmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression );
    public final primaryExpression_return primaryExpression() throws RecognitionException {
        primaryExpression_return retval = new primaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS22=null;
        Token XmlAttribute24=null;
        identifier_return identifier23 = null;

        literal_return literal25 = null;

        arrayLiteral_return arrayLiteral26 = null;

        objectLiteral_return objectLiteral27 = null;

        parenExpression_return parenExpression28 = null;


        Object THIS22_tree=null;
        Object XmlAttribute24_tree=null;

        try {
            // JS.g:980:2: ( THIS | identifier | XmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression )
            int alt4=7;
            switch ( input.LA(1) ) {
            case THIS:
                {
                alt4=1;
                }
                break;
            case EACH:
            case GET:
            case SET:
            case WXML:
            case NAMESPACE:
            case Identifier:
                {
                alt4=2;
                }
                break;
            case XmlAttribute:
                {
                alt4=3;
                }
                break;
            case NULL:
            case TRUE:
            case FALSE:
            case StringLiteral:
            case RegularExpressionLiteral:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt4=4;
                }
                break;
            case LBRACK:
                {
                alt4=5;
                }
                break;
            case LBRACE:
                {
                alt4=6;
                }
                break;
            case LPAREN:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("979:1: primaryExpression : ( THIS | identifier | XmlAttribute | literal | arrayLiteral | objectLiteral | parenExpression );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // JS.g:980:4: THIS
                    {
                    root_0 = (Object)adaptor.nil();

                    THIS22=(Token)input.LT(1);
                    match(input,THIS,FOLLOW_THIS_in_primaryExpression3496); 
                    THIS22_tree = (Object)adaptor.create(THIS22);
                    adaptor.addChild(root_0, THIS22_tree);


                    }
                    break;
                case 2 :
                    // JS.g:981:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_primaryExpression3501);
                    identifier23=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier23.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:982:4: XmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    XmlAttribute24=(Token)input.LT(1);
                    match(input,XmlAttribute,FOLLOW_XmlAttribute_in_primaryExpression3506); 
                    XmlAttribute24_tree = (Object)adaptor.create(XmlAttribute24);
                    adaptor.addChild(root_0, XmlAttribute24_tree);


                    }
                    break;
                case 4 :
                    // JS.g:983:4: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primaryExpression3511);
                    literal25=literal();
                    _fsp--;

                    adaptor.addChild(root_0, literal25.getTree());

                    }
                    break;
                case 5 :
                    // JS.g:984:4: arrayLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayLiteral_in_primaryExpression3516);
                    arrayLiteral26=arrayLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, arrayLiteral26.getTree());

                    }
                    break;
                case 6 :
                    // JS.g:985:4: objectLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_primaryExpression3521);
                    objectLiteral27=objectLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, objectLiteral27.getTree());

                    }
                    break;
                case 7 :
                    // JS.g:986:4: parenExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_primaryExpression3526);
                    parenExpression28=parenExpression();
                    _fsp--;

                    adaptor.addChild(root_0, parenExpression28.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end primaryExpression

    public static class parenExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start parenExpression
    // JS.g:989:1: parenExpression : lpar= LPAREN expression RPAREN -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression ) ;
    public final parenExpression_return parenExpression() throws RecognitionException {
        parenExpression_return retval = new parenExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lpar=null;
        Token RPAREN30=null;
        expression_return expression29 = null;


        Object lpar_tree=null;
        Object RPAREN30_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // JS.g:990:3: (lpar= LPAREN expression RPAREN -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression ) )
            // JS.g:990:5: lpar= LPAREN expression RPAREN
            {
            lpar=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_parenExpression3542); 
            stream_LPAREN.add(lpar);

            pushFollow(FOLLOW_expression_in_parenExpression3544);
            expression29=expression();
            _fsp--;

            stream_expression.add(expression29.getTree());
            RPAREN30=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_parenExpression3546); 
            stream_RPAREN.add(RPAREN30);


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 990:37: -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression )
            {
                // JS.g:990:40: ^( PAREXPR[$lpar, \"PAREXPR\"] expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(PAREXPR, lpar,  "PAREXPR"), root_1);

                adaptor.addChild(root_1, stream_expression.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end parenExpression

    public static class arrayLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start arrayLiteral
    // JS.g:993:1: arrayLiteral : lb= LBRACK ( arrayItem ( COMMA ( arrayItem )? )* )? RBRACK -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* ) ;
    public final arrayLiteral_return arrayLiteral() throws RecognitionException {
        arrayLiteral_return retval = new arrayLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token COMMA32=null;
        Token RBRACK34=null;
        arrayItem_return arrayItem31 = null;

        arrayItem_return arrayItem33 = null;


        Object lb_tree=null;
        Object COMMA32_tree=null;
        Object RBRACK34_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_arrayItem=new RewriteRuleSubtreeStream(adaptor,"rule arrayItem");
        try {
            // JS.g:994:2: (lb= LBRACK ( arrayItem ( COMMA ( arrayItem )? )* )? RBRACK -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* ) )
            // JS.g:994:4: lb= LBRACK ( arrayItem ( COMMA ( arrayItem )? )* )? RBRACK
            {
            lb=(Token)input.LT(1);
            match(input,LBRACK,FOLLOW_LBRACK_in_arrayLiteral3571); 
            stream_LBRACK.add(lb);

            // JS.g:994:14: ( arrayItem ( COMMA ( arrayItem )? )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=NULL && LA7_0<=FALSE)||LA7_0==DELETE||(LA7_0>=EACH && LA7_0<=FUNCTION)||LA7_0==NEW||LA7_0==THIS||LA7_0==TYPEOF||LA7_0==VOID||(LA7_0>=GET && LA7_0<=YIELD)||(LA7_0>=WXML && LA7_0<=NAMESPACE)||LA7_0==LBRACE||LA7_0==LPAREN||LA7_0==LBRACK||LA7_0==COMMA||(LA7_0>=ADD && LA7_0<=SUB)||(LA7_0>=INC && LA7_0<=DEC)||(LA7_0>=NOT && LA7_0<=INV)||LA7_0==XMLLiteral||(LA7_0>=StringLiteral && LA7_0<=XmlAttribute)||LA7_0==Identifier||LA7_0==RegularExpressionLiteral||(LA7_0>=DecimalLiteral && LA7_0<=HexIntegerLiteral)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RBRACK) ) {
                int LA7_2 = input.LA(2);

                if ( ( input.LA(1) == COMMA ) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // JS.g:994:16: arrayItem ( COMMA ( arrayItem )? )*
                    {
                    pushFollow(FOLLOW_arrayItem_in_arrayLiteral3575);
                    arrayItem31=arrayItem();
                    _fsp--;

                    stream_arrayItem.add(arrayItem31.getTree());
                    // JS.g:994:26: ( COMMA ( arrayItem )? )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==COMMA) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // JS.g:994:28: COMMA ( arrayItem )?
                    	    {
                    	    COMMA32=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_arrayLiteral3579); 
                    	    stream_COMMA.add(COMMA32);

                    	    // JS.g:994:34: ( arrayItem )?
                    	    int alt5=2;
                    	    switch ( input.LA(1) ) {
                    	        case NULL:
                    	        case TRUE:
                    	        case FALSE:
                    	        case DELETE:
                    	        case EACH:
                    	        case FUNCTION:
                    	        case NEW:
                    	        case THIS:
                    	        case TYPEOF:
                    	        case VOID:
                    	        case GET:
                    	        case SET:
                    	        case YIELD:
                    	        case WXML:
                    	        case NAMESPACE:
                    	        case LBRACE:
                    	        case LPAREN:
                    	        case LBRACK:
                    	        case ADD:
                    	        case SUB:
                    	        case INC:
                    	        case DEC:
                    	        case NOT:
                    	        case INV:
                    	        case XMLLiteral:
                    	        case StringLiteral:
                    	        case XmlAttribute:
                    	        case Identifier:
                    	        case RegularExpressionLiteral:
                    	        case DecimalLiteral:
                    	        case OctalIntegerLiteral:
                    	        case HexIntegerLiteral:
                    	            {
                    	            alt5=1;
                    	            }
                    	            break;
                    	        case RBRACK:
                    	            {
                    	            int LA5_2 = input.LA(2);

                    	            if ( ( input.LA(1) == COMMA ) ) {
                    	                alt5=1;
                    	            }
                    	            }
                    	            break;
                    	        case COMMA:
                    	            {
                    	            int LA5_3 = input.LA(2);

                    	            if ( ( input.LA(1) == COMMA ) ) {
                    	                alt5=1;
                    	            }
                    	            }
                    	            break;
                    	    }

                    	    switch (alt5) {
                    	        case 1 :
                    	            // JS.g:994:34: arrayItem
                    	            {
                    	            pushFollow(FOLLOW_arrayItem_in_arrayLiteral3581);
                    	            arrayItem33=arrayItem();
                    	            _fsp--;

                    	            stream_arrayItem.add(arrayItem33.getTree());

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            RBRACK34=(Token)input.LT(1);
            match(input,RBRACK,FOLLOW_RBRACK_in_arrayLiteral3590); 
            stream_RBRACK.add(RBRACK34);


            // AST REWRITE
            // elements: arrayItem
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 995:2: -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* )
            {
                // JS.g:995:5: ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARRAY, lb,  "ARRAY"), root_1);

                // JS.g:995:28: ( arrayItem )*
                while ( stream_arrayItem.hasNext() ) {
                    adaptor.addChild(root_1, stream_arrayItem.next());

                }
                stream_arrayItem.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end arrayLiteral

    public static class arrayItem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start arrayItem
    // JS.g:998:1: arrayItem : (expr= assignmentExpression | {...}?) -> ^( ITEM ( $expr)? ) ;
    public final arrayItem_return arrayItem() throws RecognitionException {
        arrayItem_return retval = new arrayItem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        assignmentExpression_return expr = null;


        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:999:2: ( (expr= assignmentExpression | {...}?) -> ^( ITEM ( $expr)? ) )
            // JS.g:999:4: (expr= assignmentExpression | {...}?)
            {
            // JS.g:999:4: (expr= assignmentExpression | {...}?)
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=NULL && LA8_0<=FALSE)||LA8_0==DELETE||(LA8_0>=EACH && LA8_0<=FUNCTION)||LA8_0==NEW||LA8_0==THIS||LA8_0==TYPEOF||LA8_0==VOID||(LA8_0>=GET && LA8_0<=YIELD)||(LA8_0>=WXML && LA8_0<=NAMESPACE)||LA8_0==LBRACE||LA8_0==LPAREN||LA8_0==LBRACK||(LA8_0>=ADD && LA8_0<=SUB)||(LA8_0>=INC && LA8_0<=DEC)||(LA8_0>=NOT && LA8_0<=INV)||LA8_0==XMLLiteral||(LA8_0>=StringLiteral && LA8_0<=XmlAttribute)||LA8_0==Identifier||LA8_0==RegularExpressionLiteral||(LA8_0>=DecimalLiteral && LA8_0<=HexIntegerLiteral)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RBRACK||LA8_0==COMMA) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("999:4: (expr= assignmentExpression | {...}?)", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // JS.g:999:6: expr= assignmentExpression
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arrayItem3618);
                    expr=assignmentExpression();
                    _fsp--;

                    stream_assignmentExpression.add(expr.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:999:34: {...}?
                    {
                    if ( !( input.LA(1) == COMMA ) ) {
                        throw new FailedPredicateException(input, "arrayItem", " input.LA(1) == COMMA ");
                    }

                    }
                    break;

            }


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval, expr
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"token expr",expr!=null?expr.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1000:2: -> ^( ITEM ( $expr)? )
            {
                // JS.g:1000:5: ^( ITEM ( $expr)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ITEM, "ITEM"), root_1);

                // JS.g:1000:13: ( $expr)?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.next());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end arrayItem

    public static class objectLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start objectLiteral
    // JS.g:1003:1: objectLiteral : lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* )? RBRACE -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* ) ;
    public final objectLiteral_return objectLiteral() throws RecognitionException {
        objectLiteral_return retval = new objectLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token COMMA36=null;
        Token RBRACE38=null;
        objectPropertyInitializer_return objectPropertyInitializer35 = null;

        objectPropertyInitializer_return objectPropertyInitializer37 = null;


        Object lb_tree=null;
        Object COMMA36_tree=null;
        Object RBRACE38_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_objectPropertyInitializer=new RewriteRuleSubtreeStream(adaptor,"rule objectPropertyInitializer");
        try {
            // JS.g:1004:2: (lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* )? RBRACE -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* ) )
            // JS.g:1004:4: lb= LBRACE ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* )? RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_objectLiteral3650); 
            stream_LBRACE.add(lb);

            // JS.g:1004:14: ( objectPropertyInitializer ( COMMA objectPropertyInitializer )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==EACH||(LA10_0>=GET && LA10_0<=SET)||(LA10_0>=WXML && LA10_0<=NAMESPACE)||(LA10_0>=StringLiteral && LA10_0<=XmlAttribute)||LA10_0==Identifier||(LA10_0>=DecimalLiteral && LA10_0<=HexIntegerLiteral)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // JS.g:1004:16: objectPropertyInitializer ( COMMA objectPropertyInitializer )*
                    {
                    pushFollow(FOLLOW_objectPropertyInitializer_in_objectLiteral3654);
                    objectPropertyInitializer35=objectPropertyInitializer();
                    _fsp--;

                    stream_objectPropertyInitializer.add(objectPropertyInitializer35.getTree());
                    // JS.g:1004:42: ( COMMA objectPropertyInitializer )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==COMMA) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // JS.g:1004:44: COMMA objectPropertyInitializer
                    	    {
                    	    COMMA36=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_objectLiteral3658); 
                    	    stream_COMMA.add(COMMA36);

                    	    pushFollow(FOLLOW_objectPropertyInitializer_in_objectLiteral3660);
                    	    objectPropertyInitializer37=objectPropertyInitializer();
                    	    _fsp--;

                    	    stream_objectPropertyInitializer.add(objectPropertyInitializer37.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            RBRACE38=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_objectLiteral3668); 
            stream_RBRACE.add(RBRACE38);


            // AST REWRITE
            // elements: objectPropertyInitializer
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1005:2: -> ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* )
            {
                // JS.g:1005:5: ^( OBJECT[$lb, \"OBJECT\"] ( objectPropertyInitializer )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(OBJECT, lb,  "OBJECT"), root_1);

                // JS.g:1005:30: ( objectPropertyInitializer )*
                while ( stream_objectPropertyInitializer.hasNext() ) {
                    adaptor.addChild(root_1, stream_objectPropertyInitializer.next());

                }
                stream_objectPropertyInitializer.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end objectLiteral

    public static class objectPropertyInitializer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start objectPropertyInitializer
    // JS.g:1008:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );
    public final objectPropertyInitializer_return objectPropertyInitializer() throws RecognitionException {
        objectPropertyInitializer_return retval = new objectPropertyInitializer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        nameValuePair_return nameValuePair39 = null;

        getMethodDeclaration_return getMethodDeclaration40 = null;

        setMethodDeclaration_return setMethodDeclaration41 = null;



        try {
            // JS.g:1009:3: ( nameValuePair | getMethodDeclaration | setMethodDeclaration )
            int alt11=3;
            switch ( input.LA(1) ) {
            case GET:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==EACH||(LA11_1>=GET && LA11_1<=SET)||(LA11_1>=WXML && LA11_1<=NAMESPACE)||LA11_1==Identifier) ) {
                    alt11=2;
                }
                else if ( (LA11_1==COLON) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1008:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case EACH:
            case WXML:
            case NAMESPACE:
            case StringLiteral:
            case XmlAttribute:
            case Identifier:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt11=1;
                }
                break;
            case SET:
                {
                int LA11_3 = input.LA(2);

                if ( (LA11_3==EACH||(LA11_3>=GET && LA11_3<=SET)||(LA11_3>=WXML && LA11_3<=NAMESPACE)||LA11_3==Identifier) ) {
                    alt11=3;
                }
                else if ( (LA11_3==COLON) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1008:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1008:1: objectPropertyInitializer : ( nameValuePair | getMethodDeclaration | setMethodDeclaration );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // JS.g:1009:5: nameValuePair
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nameValuePair_in_objectPropertyInitializer3693);
                    nameValuePair39=nameValuePair();
                    _fsp--;

                    adaptor.addChild(root_0, nameValuePair39.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1010:5: getMethodDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_getMethodDeclaration_in_objectPropertyInitializer3700);
                    getMethodDeclaration40=getMethodDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, getMethodDeclaration40.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1011:5: setMethodDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_setMethodDeclaration_in_objectPropertyInitializer3706);
                    setMethodDeclaration41=setMethodDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, setMethodDeclaration41.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end objectPropertyInitializer

    public static class nameValuePair_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start nameValuePair
    // JS.g:1014:1: nameValuePair : propertyName COLON assignmentExpression -> ^( NAMEDVALUE propertyName assignmentExpression ) ;
    public final nameValuePair_return nameValuePair() throws RecognitionException {
        nameValuePair_return retval = new nameValuePair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON43=null;
        propertyName_return propertyName42 = null;

        assignmentExpression_return assignmentExpression44 = null;


        Object COLON43_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_propertyName=new RewriteRuleSubtreeStream(adaptor,"rule propertyName");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1015:2: ( propertyName COLON assignmentExpression -> ^( NAMEDVALUE propertyName assignmentExpression ) )
            // JS.g:1015:4: propertyName COLON assignmentExpression
            {
            pushFollow(FOLLOW_propertyName_in_nameValuePair3719);
            propertyName42=propertyName();
            _fsp--;

            stream_propertyName.add(propertyName42.getTree());
            COLON43=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_nameValuePair3721); 
            stream_COLON.add(COLON43);

            pushFollow(FOLLOW_assignmentExpression_in_nameValuePair3723);
            assignmentExpression44=assignmentExpression();
            _fsp--;

            stream_assignmentExpression.add(assignmentExpression44.getTree());

            // AST REWRITE
            // elements: propertyName, assignmentExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1016:2: -> ^( NAMEDVALUE propertyName assignmentExpression )
            {
                // JS.g:1016:5: ^( NAMEDVALUE propertyName assignmentExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(NAMEDVALUE, "NAMEDVALUE"), root_1);

                adaptor.addChild(root_1, stream_propertyName.next());
                adaptor.addChild(root_1, stream_assignmentExpression.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end nameValuePair

    public static class propertyName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start propertyName
    // JS.g:1019:1: propertyName : ( identifier | StringLiteral | numericLiteral | XmlAttribute );
    public final propertyName_return propertyName() throws RecognitionException {
        propertyName_return retval = new propertyName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token StringLiteral46=null;
        Token XmlAttribute48=null;
        identifier_return identifier45 = null;

        numericLiteral_return numericLiteral47 = null;


        Object StringLiteral46_tree=null;
        Object XmlAttribute48_tree=null;

        try {
            // JS.g:1020:2: ( identifier | StringLiteral | numericLiteral | XmlAttribute )
            int alt12=4;
            switch ( input.LA(1) ) {
            case EACH:
            case GET:
            case SET:
            case WXML:
            case NAMESPACE:
            case Identifier:
                {
                alt12=1;
                }
                break;
            case StringLiteral:
                {
                alt12=2;
                }
                break;
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt12=3;
                }
                break;
            case XmlAttribute:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1019:1: propertyName : ( identifier | StringLiteral | numericLiteral | XmlAttribute );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // JS.g:1020:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_propertyName3747);
                    identifier45=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier45.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1021:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral46=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_propertyName3752); 
                    StringLiteral46_tree = (Object)adaptor.create(StringLiteral46);
                    adaptor.addChild(root_0, StringLiteral46_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1022:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_propertyName3757);
                    numericLiteral47=numericLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, numericLiteral47.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1023:4: XmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    XmlAttribute48=(Token)input.LT(1);
                    match(input,XmlAttribute,FOLLOW_XmlAttribute_in_propertyName3762); 
                    XmlAttribute48_tree = (Object)adaptor.create(XmlAttribute48);
                    adaptor.addChild(root_0, XmlAttribute48_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end propertyName

    public static class memberExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start memberExpression
    // JS.g:1035:1: memberExpression : ( primaryExpression | functionExpression | newExpression );
    public final memberExpression_return memberExpression() throws RecognitionException {
        memberExpression_return retval = new memberExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        primaryExpression_return primaryExpression49 = null;

        functionExpression_return functionExpression50 = null;

        newExpression_return newExpression51 = null;



        try {
            // JS.g:1036:2: ( primaryExpression | functionExpression | newExpression )
            int alt13=3;
            switch ( input.LA(1) ) {
            case NULL:
            case TRUE:
            case FALSE:
            case EACH:
            case THIS:
            case GET:
            case SET:
            case WXML:
            case NAMESPACE:
            case LBRACE:
            case LPAREN:
            case LBRACK:
            case StringLiteral:
            case XmlAttribute:
            case Identifier:
            case RegularExpressionLiteral:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt13=1;
                }
                break;
            case FUNCTION:
                {
                alt13=2;
                }
                break;
            case NEW:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1035:1: memberExpression : ( primaryExpression | functionExpression | newExpression );", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // JS.g:1036:4: primaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primaryExpression_in_memberExpression3780);
                    primaryExpression49=primaryExpression();
                    _fsp--;

                    adaptor.addChild(root_0, primaryExpression49.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1037:4: functionExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionExpression_in_memberExpression3785);
                    functionExpression50=functionExpression();
                    _fsp--;

                    adaptor.addChild(root_0, functionExpression50.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1038:4: newExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_newExpression_in_memberExpression3790);
                    newExpression51=newExpression();
                    _fsp--;

                    adaptor.addChild(root_0, newExpression51.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end memberExpression

    public static class newExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start newExpression
    // JS.g:1041:1: newExpression : NEW memberExpression ;
    public final newExpression_return newExpression() throws RecognitionException {
        newExpression_return retval = new newExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEW52=null;
        memberExpression_return memberExpression53 = null;


        Object NEW52_tree=null;

        try {
            // JS.g:1042:2: ( NEW memberExpression )
            // JS.g:1042:4: NEW memberExpression
            {
            root_0 = (Object)adaptor.nil();

            NEW52=(Token)input.LT(1);
            match(input,NEW,FOLLOW_NEW_in_newExpression3801); 
            NEW52_tree = (Object)adaptor.create(NEW52);
            root_0 = (Object)adaptor.becomeRoot(NEW52_tree, root_0);

            pushFollow(FOLLOW_memberExpression_in_newExpression3804);
            memberExpression53=memberExpression();
            _fsp--;

            adaptor.addChild(root_0, memberExpression53.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end newExpression

    public static class arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start arguments
    // JS.g:1046:1: arguments : LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN -> ^( ARGS ( assignmentExpression )* ) ;
    public final arguments_return arguments() throws RecognitionException {
        arguments_return retval = new arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN54=null;
        Token COMMA56=null;
        Token RPAREN58=null;
        assignmentExpression_return assignmentExpression55 = null;

        assignmentExpression_return assignmentExpression57 = null;


        Object LPAREN54_tree=null;
        Object COMMA56_tree=null;
        Object RPAREN58_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1047:2: ( LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN -> ^( ARGS ( assignmentExpression )* ) )
            // JS.g:1047:4: LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN
            {
            LPAREN54=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_arguments3817); 
            stream_LPAREN.add(LPAREN54);

            // JS.g:1047:11: ( assignmentExpression ( COMMA assignmentExpression )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=NULL && LA15_0<=FALSE)||LA15_0==DELETE||(LA15_0>=EACH && LA15_0<=FUNCTION)||LA15_0==NEW||LA15_0==THIS||LA15_0==TYPEOF||LA15_0==VOID||(LA15_0>=GET && LA15_0<=YIELD)||(LA15_0>=WXML && LA15_0<=NAMESPACE)||LA15_0==LBRACE||LA15_0==LPAREN||LA15_0==LBRACK||(LA15_0>=ADD && LA15_0<=SUB)||(LA15_0>=INC && LA15_0<=DEC)||(LA15_0>=NOT && LA15_0<=INV)||LA15_0==XMLLiteral||(LA15_0>=StringLiteral && LA15_0<=XmlAttribute)||LA15_0==Identifier||LA15_0==RegularExpressionLiteral||(LA15_0>=DecimalLiteral && LA15_0<=HexIntegerLiteral)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // JS.g:1047:13: assignmentExpression ( COMMA assignmentExpression )*
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arguments3821);
                    assignmentExpression55=assignmentExpression();
                    _fsp--;

                    stream_assignmentExpression.add(assignmentExpression55.getTree());
                    // JS.g:1047:34: ( COMMA assignmentExpression )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==COMMA) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // JS.g:1047:36: COMMA assignmentExpression
                    	    {
                    	    COMMA56=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_arguments3825); 
                    	    stream_COMMA.add(COMMA56);

                    	    pushFollow(FOLLOW_assignmentExpression_in_arguments3827);
                    	    assignmentExpression57=assignmentExpression();
                    	    _fsp--;

                    	    stream_assignmentExpression.add(assignmentExpression57.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN58=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_arguments3835); 
            stream_RPAREN.add(RPAREN58);


            // AST REWRITE
            // elements: assignmentExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1048:2: -> ^( ARGS ( assignmentExpression )* )
            {
                // JS.g:1048:5: ^( ARGS ( assignmentExpression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARGS, "ARGS"), root_1);

                // JS.g:1048:13: ( assignmentExpression )*
                while ( stream_assignmentExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_assignmentExpression.next());

                }
                stream_assignmentExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end arguments

    public static class leftHandSideExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start leftHandSideExpression
    // JS.g:1051:1: leftHandSideExpression : ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression rightHandSideExpression ) | DOTDOT expression -> ^( ALLCHILDREN $leftHandSideExpression expression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )* ;
    public final leftHandSideExpression_return leftHandSideExpression() throws RecognitionException {
        leftHandSideExpression_return retval = new leftHandSideExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LBRACK61=null;
        Token RBRACK63=null;
        Token DOT64=null;
        Token DOTDOT66=null;
        Token COLONCOLON68=null;
        memberExpression_return memberExpression59 = null;

        arguments_return arguments60 = null;

        expression_return expression62 = null;

        rightHandSideExpression_return rightHandSideExpression65 = null;

        expression_return expression67 = null;

        expression_return expression69 = null;


        Object LBRACK61_tree=null;
        Object RBRACK63_tree=null;
        Object DOT64_tree=null;
        Object DOTDOT66_tree=null;
        Object COLONCOLON68_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_COLONCOLON=new RewriteRuleTokenStream(adaptor,"token COLONCOLON");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_DOTDOT=new RewriteRuleTokenStream(adaptor,"token DOTDOT");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_memberExpression=new RewriteRuleSubtreeStream(adaptor,"rule memberExpression");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        RewriteRuleSubtreeStream stream_rightHandSideExpression=new RewriteRuleSubtreeStream(adaptor,"rule rightHandSideExpression");
        try {
            // JS.g:1052:3: ( ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression rightHandSideExpression ) | DOTDOT expression -> ^( ALLCHILDREN $leftHandSideExpression expression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )* )
            // JS.g:1053:3: ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression rightHandSideExpression ) | DOTDOT expression -> ^( ALLCHILDREN $leftHandSideExpression expression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )*
            {
            // JS.g:1053:3: ( memberExpression -> memberExpression )
            // JS.g:1054:5: memberExpression
            {
            pushFollow(FOLLOW_memberExpression_in_leftHandSideExpression3868);
            memberExpression59=memberExpression();
            _fsp--;

            stream_memberExpression.add(memberExpression59.getTree());

            // AST REWRITE
            // elements: memberExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1054:25: -> memberExpression
            {
                adaptor.addChild(root_0, stream_memberExpression.next());

            }



            }

            // JS.g:1056:3: ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT rightHandSideExpression -> ^( BYFIELD $leftHandSideExpression rightHandSideExpression ) | DOTDOT expression -> ^( ALLCHILDREN $leftHandSideExpression expression ) | COLONCOLON expression -> ^( LOCALNAME $leftHandSideExpression expression ) )*
            loop16:
            do {
                int alt16=6;
                switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    alt16=1;
                    }
                    break;
                case LBRACK:
                    {
                    alt16=2;
                    }
                    break;
                case DOT:
                    {
                    alt16=3;
                    }
                    break;
                case DOTDOT:
                    {
                    alt16=4;
                    }
                    break;
                case COLONCOLON:
                    {
                    alt16=5;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // JS.g:1057:5: arguments
            	    {
            	    pushFollow(FOLLOW_arguments_in_leftHandSideExpression3889);
            	    arguments60=arguments();
            	    _fsp--;

            	    stream_arguments.add(arguments60.getTree());

            	    // AST REWRITE
            	    // elements: leftHandSideExpression, arguments
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1057:19: -> ^( CALL $leftHandSideExpression arguments )
            	    {
            	        // JS.g:1057:22: ^( CALL $leftHandSideExpression arguments )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(CALL, "CALL"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_arguments.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;
            	case 2 :
            	    // JS.g:1058:7: LBRACK expression RBRACK
            	    {
            	    LBRACK61=(Token)input.LT(1);
            	    match(input,LBRACK,FOLLOW_LBRACK_in_leftHandSideExpression3914); 
            	    stream_LBRACK.add(LBRACK61);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression3916);
            	    expression62=expression();
            	    _fsp--;

            	    stream_expression.add(expression62.getTree());
            	    RBRACK63=(Token)input.LT(1);
            	    match(input,RBRACK,FOLLOW_RBRACK_in_leftHandSideExpression3918); 
            	    stream_RBRACK.add(RBRACK63);


            	    // AST REWRITE
            	    // elements: leftHandSideExpression, expression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1058:33: -> ^( BYINDEX $leftHandSideExpression expression )
            	    {
            	        // JS.g:1058:36: ^( BYINDEX $leftHandSideExpression expression )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(BYINDEX, "BYINDEX"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_expression.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;
            	case 3 :
            	    // JS.g:1059:7: DOT rightHandSideExpression
            	    {
            	    DOT64=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_leftHandSideExpression3940); 
            	    stream_DOT.add(DOT64);

            	    pushFollow(FOLLOW_rightHandSideExpression_in_leftHandSideExpression3942);
            	    rightHandSideExpression65=rightHandSideExpression();
            	    _fsp--;

            	    stream_rightHandSideExpression.add(rightHandSideExpression65.getTree());

            	    // AST REWRITE
            	    // elements: leftHandSideExpression, rightHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1059:35: -> ^( BYFIELD $leftHandSideExpression rightHandSideExpression )
            	    {
            	        // JS.g:1059:38: ^( BYFIELD $leftHandSideExpression rightHandSideExpression )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(BYFIELD, "BYFIELD"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_rightHandSideExpression.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;
            	case 4 :
            	    // JS.g:1060:7: DOTDOT expression
            	    {
            	    DOTDOT66=(Token)input.LT(1);
            	    match(input,DOTDOT,FOLLOW_DOTDOT_in_leftHandSideExpression3963); 
            	    stream_DOTDOT.add(DOTDOT66);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression3965);
            	    expression67=expression();
            	    _fsp--;

            	    stream_expression.add(expression67.getTree());

            	    // AST REWRITE
            	    // elements: expression, leftHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1060:25: -> ^( ALLCHILDREN $leftHandSideExpression expression )
            	    {
            	        // JS.g:1060:28: ^( ALLCHILDREN $leftHandSideExpression expression )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(ALLCHILDREN, "ALLCHILDREN"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_expression.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;
            	case 5 :
            	    // JS.g:1061:7: COLONCOLON expression
            	    {
            	    COLONCOLON68=(Token)input.LT(1);
            	    match(input,COLONCOLON,FOLLOW_COLONCOLON_in_leftHandSideExpression3984); 
            	    stream_COLONCOLON.add(COLONCOLON68);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression3986);
            	    expression69=expression();
            	    _fsp--;

            	    stream_expression.add(expression69.getTree());

            	    // AST REWRITE
            	    // elements: expression, leftHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1061:29: -> ^( LOCALNAME $leftHandSideExpression expression )
            	    {
            	        // JS.g:1061:32: ^( LOCALNAME $leftHandSideExpression expression )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(LOCALNAME, "LOCALNAME"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_expression.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }



            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end leftHandSideExpression

    public static class rightHandSideExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start rightHandSideExpression
    // JS.g:1065:1: rightHandSideExpression : ( parenExpression | identifier | XmlAttribute | MUL );
    public final rightHandSideExpression_return rightHandSideExpression() throws RecognitionException {
        rightHandSideExpression_return retval = new rightHandSideExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XmlAttribute72=null;
        Token MUL73=null;
        parenExpression_return parenExpression70 = null;

        identifier_return identifier71 = null;


        Object XmlAttribute72_tree=null;
        Object MUL73_tree=null;

        try {
            // JS.g:1066:3: ( parenExpression | identifier | XmlAttribute | MUL )
            int alt17=4;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt17=1;
                }
                break;
            case EACH:
            case GET:
            case SET:
            case WXML:
            case NAMESPACE:
            case Identifier:
                {
                alt17=2;
                }
                break;
            case XmlAttribute:
                {
                alt17=3;
                }
                break;
            case MUL:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1065:1: rightHandSideExpression : ( parenExpression | identifier | XmlAttribute | MUL );", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // JS.g:1066:5: parenExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_rightHandSideExpression4015);
                    parenExpression70=parenExpression();
                    _fsp--;

                    adaptor.addChild(root_0, parenExpression70.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1067:5: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_rightHandSideExpression4022);
                    identifier71=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier71.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1068:5: XmlAttribute
                    {
                    root_0 = (Object)adaptor.nil();

                    XmlAttribute72=(Token)input.LT(1);
                    match(input,XmlAttribute,FOLLOW_XmlAttribute_in_rightHandSideExpression4028); 
                    XmlAttribute72_tree = (Object)adaptor.create(XmlAttribute72);
                    adaptor.addChild(root_0, XmlAttribute72_tree);


                    }
                    break;
                case 4 :
                    // JS.g:1069:5: MUL
                    {
                    root_0 = (Object)adaptor.nil();

                    MUL73=(Token)input.LT(1);
                    match(input,MUL,FOLLOW_MUL_in_rightHandSideExpression4034); 
                    MUL73_tree = (Object)adaptor.create(MUL73);
                    adaptor.addChild(root_0, MUL73_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end rightHandSideExpression

    public static class postfixExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start postfixExpression
    // JS.g:1102:1: postfixExpression : leftHandSideExpression ( postfixOperator )? ;
    public final postfixExpression_return postfixExpression() throws RecognitionException {
        postfixExpression_return retval = new postfixExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        leftHandSideExpression_return leftHandSideExpression74 = null;

        postfixOperator_return postfixOperator75 = null;



        try {
            // JS.g:1103:2: ( leftHandSideExpression ( postfixOperator )? )
            // JS.g:1103:4: leftHandSideExpression ( postfixOperator )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_leftHandSideExpression_in_postfixExpression4072);
            leftHandSideExpression74=leftHandSideExpression();
            _fsp--;

            adaptor.addChild(root_0, leftHandSideExpression74.getTree());
             if (input.LA(1) == INC || input.LA(1) == DEC) promoteEOL(null); 
            // JS.g:1103:95: ( postfixOperator )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==INC) ) {
                alt18=1;
            }
            else if ( (LA18_0==DEC) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // JS.g:1103:97: postfixOperator
                    {
                    pushFollow(FOLLOW_postfixOperator_in_postfixExpression4078);
                    postfixOperator75=postfixOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(postfixOperator75.getTree(), root_0);

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end postfixExpression

    public static class postfixOperator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start postfixOperator
    // JS.g:1106:1: postfixOperator : (op= INC | op= DEC );
    public final postfixOperator_return postfixOperator() throws RecognitionException {
        postfixOperator_return retval = new postfixOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;

        Object op_tree=null;

        try {
            // JS.g:1107:2: (op= INC | op= DEC )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==INC) ) {
                alt19=1;
            }
            else if ( (LA19_0==DEC) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1106:1: postfixOperator : (op= INC | op= DEC );", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // JS.g:1107:4: op= INC
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,INC,FOLLOW_INC_in_postfixOperator4096); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(PINC); 

                    }
                    break;
                case 2 :
                    // JS.g:1108:4: op= DEC
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,DEC,FOLLOW_DEC_in_postfixOperator4105); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(PDEC); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end postfixOperator

    public static class unaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start unaryExpression
    // JS.g:1115:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression | XMLLiteral );
    public final unaryExpression_return unaryExpression() throws RecognitionException {
        unaryExpression_return retval = new unaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XMLLiteral79=null;
        postfixExpression_return postfixExpression76 = null;

        unaryOperator_return unaryOperator77 = null;

        unaryExpression_return unaryExpression78 = null;


        Object XMLLiteral79_tree=null;

        try {
            // JS.g:1116:2: ( postfixExpression | unaryOperator unaryExpression | XMLLiteral )
            int alt20=3;
            switch ( input.LA(1) ) {
            case NULL:
            case TRUE:
            case FALSE:
            case EACH:
            case FUNCTION:
            case NEW:
            case THIS:
            case GET:
            case SET:
            case WXML:
            case NAMESPACE:
            case LBRACE:
            case LPAREN:
            case LBRACK:
            case StringLiteral:
            case XmlAttribute:
            case Identifier:
            case RegularExpressionLiteral:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt20=1;
                }
                break;
            case DELETE:
            case TYPEOF:
            case VOID:
            case YIELD:
            case ADD:
            case SUB:
            case INC:
            case DEC:
            case NOT:
            case INV:
                {
                alt20=2;
                }
                break;
            case XMLLiteral:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1115:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression | XMLLiteral );", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // JS.g:1116:4: postfixExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression4122);
                    postfixExpression76=postfixExpression();
                    _fsp--;

                    adaptor.addChild(root_0, postfixExpression76.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1117:4: unaryOperator unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryOperator_in_unaryExpression4127);
                    unaryOperator77=unaryOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(unaryOperator77.getTree(), root_0);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression4130);
                    unaryExpression78=unaryExpression();
                    _fsp--;

                    adaptor.addChild(root_0, unaryExpression78.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1118:4: XMLLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    XMLLiteral79=(Token)input.LT(1);
                    match(input,XMLLiteral,FOLLOW_XMLLiteral_in_unaryExpression4135); 
                    XMLLiteral79_tree = (Object)adaptor.create(XMLLiteral79);
                    adaptor.addChild(root_0, XMLLiteral79_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end unaryExpression

    public static class unaryOperator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start unaryOperator
    // JS.g:1121:1: unaryOperator : ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD );
    public final unaryOperator_return unaryOperator() throws RecognitionException {
        unaryOperator_return retval = new unaryOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        Token DELETE80=null;
        Token VOID81=null;
        Token TYPEOF82=null;
        Token INC83=null;
        Token DEC84=null;
        Token INV85=null;
        Token NOT86=null;
        Token YIELD87=null;

        Object op_tree=null;
        Object DELETE80_tree=null;
        Object VOID81_tree=null;
        Object TYPEOF82_tree=null;
        Object INC83_tree=null;
        Object DEC84_tree=null;
        Object INV85_tree=null;
        Object NOT86_tree=null;
        Object YIELD87_tree=null;

        try {
            // JS.g:1122:2: ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD )
            int alt21=10;
            switch ( input.LA(1) ) {
            case DELETE:
                {
                alt21=1;
                }
                break;
            case VOID:
                {
                alt21=2;
                }
                break;
            case TYPEOF:
                {
                alt21=3;
                }
                break;
            case INC:
                {
                alt21=4;
                }
                break;
            case DEC:
                {
                alt21=5;
                }
                break;
            case ADD:
                {
                alt21=6;
                }
                break;
            case SUB:
                {
                alt21=7;
                }
                break;
            case INV:
                {
                alt21=8;
                }
                break;
            case NOT:
                {
                alt21=9;
                }
                break;
            case YIELD:
                {
                alt21=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1121:1: unaryOperator : ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT | YIELD );", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // JS.g:1122:4: DELETE
                    {
                    root_0 = (Object)adaptor.nil();

                    DELETE80=(Token)input.LT(1);
                    match(input,DELETE,FOLLOW_DELETE_in_unaryOperator4147); 
                    DELETE80_tree = (Object)adaptor.create(DELETE80);
                    adaptor.addChild(root_0, DELETE80_tree);


                    }
                    break;
                case 2 :
                    // JS.g:1123:4: VOID
                    {
                    root_0 = (Object)adaptor.nil();

                    VOID81=(Token)input.LT(1);
                    match(input,VOID,FOLLOW_VOID_in_unaryOperator4152); 
                    VOID81_tree = (Object)adaptor.create(VOID81);
                    adaptor.addChild(root_0, VOID81_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1124:4: TYPEOF
                    {
                    root_0 = (Object)adaptor.nil();

                    TYPEOF82=(Token)input.LT(1);
                    match(input,TYPEOF,FOLLOW_TYPEOF_in_unaryOperator4157); 
                    TYPEOF82_tree = (Object)adaptor.create(TYPEOF82);
                    adaptor.addChild(root_0, TYPEOF82_tree);


                    }
                    break;
                case 4 :
                    // JS.g:1125:4: INC
                    {
                    root_0 = (Object)adaptor.nil();

                    INC83=(Token)input.LT(1);
                    match(input,INC,FOLLOW_INC_in_unaryOperator4162); 
                    INC83_tree = (Object)adaptor.create(INC83);
                    adaptor.addChild(root_0, INC83_tree);


                    }
                    break;
                case 5 :
                    // JS.g:1126:4: DEC
                    {
                    root_0 = (Object)adaptor.nil();

                    DEC84=(Token)input.LT(1);
                    match(input,DEC,FOLLOW_DEC_in_unaryOperator4167); 
                    DEC84_tree = (Object)adaptor.create(DEC84);
                    adaptor.addChild(root_0, DEC84_tree);


                    }
                    break;
                case 6 :
                    // JS.g:1127:4: op= ADD
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,ADD,FOLLOW_ADD_in_unaryOperator4174); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(POS); 

                    }
                    break;
                case 7 :
                    // JS.g:1128:4: op= SUB
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)input.LT(1);
                    match(input,SUB,FOLLOW_SUB_in_unaryOperator4183); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(NEG); 

                    }
                    break;
                case 8 :
                    // JS.g:1129:4: INV
                    {
                    root_0 = (Object)adaptor.nil();

                    INV85=(Token)input.LT(1);
                    match(input,INV,FOLLOW_INV_in_unaryOperator4190); 
                    INV85_tree = (Object)adaptor.create(INV85);
                    adaptor.addChild(root_0, INV85_tree);


                    }
                    break;
                case 9 :
                    // JS.g:1130:4: NOT
                    {
                    root_0 = (Object)adaptor.nil();

                    NOT86=(Token)input.LT(1);
                    match(input,NOT,FOLLOW_NOT_in_unaryOperator4195); 
                    NOT86_tree = (Object)adaptor.create(NOT86);
                    adaptor.addChild(root_0, NOT86_tree);


                    }
                    break;
                case 10 :
                    // JS.g:1131:4: YIELD
                    {
                    root_0 = (Object)adaptor.nil();

                    YIELD87=(Token)input.LT(1);
                    match(input,YIELD,FOLLOW_YIELD_in_unaryOperator4200); 
                    YIELD87_tree = (Object)adaptor.create(YIELD87);
                    adaptor.addChild(root_0, YIELD87_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end unaryOperator

    public static class namespaceStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start namespaceStatement
    // JS.g:1158:1: namespaceStatement : DEFAULT WXML NAMESPACE ASSIGN StringLiteral semic -> ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN StringLiteral ) ;
    public final namespaceStatement_return namespaceStatement() throws RecognitionException {
        namespaceStatement_return retval = new namespaceStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT88=null;
        Token WXML89=null;
        Token NAMESPACE90=null;
        Token ASSIGN91=null;
        Token StringLiteral92=null;
        semic_return semic93 = null;


        Object DEFAULT88_tree=null;
        Object WXML89_tree=null;
        Object NAMESPACE90_tree=null;
        Object ASSIGN91_tree=null;
        Object StringLiteral92_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_WXML=new RewriteRuleTokenStream(adaptor,"token WXML");
        RewriteRuleTokenStream stream_NAMESPACE=new RewriteRuleTokenStream(adaptor,"token NAMESPACE");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1159:3: ( DEFAULT WXML NAMESPACE ASSIGN StringLiteral semic -> ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN StringLiteral ) )
            // JS.g:1159:5: DEFAULT WXML NAMESPACE ASSIGN StringLiteral semic
            {
            DEFAULT88=(Token)input.LT(1);
            match(input,DEFAULT,FOLLOW_DEFAULT_in_namespaceStatement4236); 
            stream_DEFAULT.add(DEFAULT88);

            WXML89=(Token)input.LT(1);
            match(input,WXML,FOLLOW_WXML_in_namespaceStatement4238); 
            stream_WXML.add(WXML89);

            NAMESPACE90=(Token)input.LT(1);
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespaceStatement4240); 
            stream_NAMESPACE.add(NAMESPACE90);

            ASSIGN91=(Token)input.LT(1);
            match(input,ASSIGN,FOLLOW_ASSIGN_in_namespaceStatement4242); 
            stream_ASSIGN.add(ASSIGN91);

            StringLiteral92=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_namespaceStatement4244); 
            stream_StringLiteral.add(StringLiteral92);

            pushFollow(FOLLOW_semic_in_namespaceStatement4246);
            semic93=semic();
            _fsp--;

            stream_semic.add(semic93.getTree());

            // AST REWRITE
            // elements: ASSIGN, WXML, DEFAULT, StringLiteral
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1160:5: -> ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN StringLiteral )
            {
                // JS.g:1160:8: ^( DEFAULT_XML_NAMESPACE DEFAULT WXML ASSIGN StringLiteral )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(DEFAULT_XML_NAMESPACE, "DEFAULT_XML_NAMESPACE"), root_1);

                adaptor.addChild(root_1, stream_DEFAULT.next());
                adaptor.addChild(root_1, stream_WXML.next());
                adaptor.addChild(root_1, stream_ASSIGN.next());
                adaptor.addChild(root_1, stream_StringLiteral.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end namespaceStatement

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start multiplicativeExpression
    // JS.g:1165:1: multiplicativeExpression : unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* ;
    public final multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        multiplicativeExpression_return retval = new multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set95=null;
        unaryExpression_return unaryExpression94 = null;

        unaryExpression_return unaryExpression96 = null;


        Object set95_tree=null;

        try {
            // JS.g:1166:2: ( unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* )
            // JS.g:1166:4: unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4278);
            unaryExpression94=unaryExpression();
            _fsp--;

            adaptor.addChild(root_0, unaryExpression94.getTree());
            // JS.g:1166:20: ( ( MUL | DIV | MOD ) unaryExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=MUL && LA22_0<=MOD)||LA22_0==DIV) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // JS.g:1166:22: ( MUL | DIV | MOD ) unaryExpression
            	    {
            	    set95=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MUL && input.LA(1)<=MOD)||input.LA(1)==DIV ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set95), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_multiplicativeExpression4282);    throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4297);
            	    unaryExpression96=unaryExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, unaryExpression96.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end multiplicativeExpression

    public static class additiveExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start additiveExpression
    // JS.g:1173:1: additiveExpression : multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* ;
    public final additiveExpression_return additiveExpression() throws RecognitionException {
        additiveExpression_return retval = new additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set98=null;
        multiplicativeExpression_return multiplicativeExpression97 = null;

        multiplicativeExpression_return multiplicativeExpression99 = null;


        Object set98_tree=null;

        try {
            // JS.g:1174:2: ( multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* )
            // JS.g:1174:4: multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4315);
            multiplicativeExpression97=multiplicativeExpression();
            _fsp--;

            adaptor.addChild(root_0, multiplicativeExpression97.getTree());
            // JS.g:1174:29: ( ( ADD | SUB ) multiplicativeExpression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=ADD && LA23_0<=SUB)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // JS.g:1174:31: ( ADD | SUB ) multiplicativeExpression
            	    {
            	    set98=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ADD && input.LA(1)<=SUB) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set98), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_additiveExpression4319);    throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4330);
            	    multiplicativeExpression99=multiplicativeExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, multiplicativeExpression99.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end additiveExpression

    public static class shiftExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start shiftExpression
    // JS.g:1181:1: shiftExpression : additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* ;
    public final shiftExpression_return shiftExpression() throws RecognitionException {
        shiftExpression_return retval = new shiftExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set101=null;
        additiveExpression_return additiveExpression100 = null;

        additiveExpression_return additiveExpression102 = null;


        Object set101_tree=null;

        try {
            // JS.g:1182:2: ( additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* )
            // JS.g:1182:4: additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression4349);
            additiveExpression100=additiveExpression();
            _fsp--;

            adaptor.addChild(root_0, additiveExpression100.getTree());
            // JS.g:1182:23: ( ( SHL | SHR | SHU ) additiveExpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=SHL && LA24_0<=SHU)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // JS.g:1182:25: ( SHL | SHR | SHU ) additiveExpression
            	    {
            	    set101=(Token)input.LT(1);
            	    if ( (input.LA(1)>=SHL && input.LA(1)<=SHU) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set101), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_shiftExpression4353);    throw mse;
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression4368);
            	    additiveExpression102=additiveExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, additiveExpression102.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end shiftExpression

    public static class relationalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start relationalExpression
    // JS.g:1189:1: relationalExpression : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* ;
    public final relationalExpression_return relationalExpression() throws RecognitionException {
        relationalExpression_return retval = new relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set104=null;
        shiftExpression_return shiftExpression103 = null;

        shiftExpression_return shiftExpression105 = null;


        Object set104_tree=null;

        try {
            // JS.g:1190:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* )
            // JS.g:1190:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpression4387);
            shiftExpression103=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression103.getTree());
            // JS.g:1190:20: ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==INSTANCEOF||(LA25_0>=LT && LA25_0<=GTE)) ) {
                    alt25=1;
                }
                else if ( (LA25_0==IN) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // JS.g:1190:22: ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression
            	    {
            	    set104=(Token)input.LT(1);
            	    if ( (input.LA(1)>=IN && input.LA(1)<=INSTANCEOF)||(input.LA(1)>=LT && input.LA(1)<=GTE) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set104), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpression4391);    throw mse;
            	    }

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpression4418);
            	    shiftExpression105=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression105.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end relationalExpression

    public static class relationalExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start relationalExpressionNoIn
    // JS.g:1193:1: relationalExpressionNoIn : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* ;
    public final relationalExpressionNoIn_return relationalExpressionNoIn() throws RecognitionException {
        relationalExpressionNoIn_return retval = new relationalExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set107=null;
        shiftExpression_return shiftExpression106 = null;

        shiftExpression_return shiftExpression108 = null;


        Object set107_tree=null;

        try {
            // JS.g:1194:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* )
            // JS.g:1194:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn4432);
            shiftExpression106=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression106.getTree());
            // JS.g:1194:20: ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==INSTANCEOF||(LA26_0>=LT && LA26_0<=GTE)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // JS.g:1194:22: ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression
            	    {
            	    set107=(Token)input.LT(1);
            	    if ( input.LA(1)==INSTANCEOF||(input.LA(1)>=LT && input.LA(1)<=GTE) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set107), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpressionNoIn4436);    throw mse;
            	    }

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn4459);
            	    shiftExpression108=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression108.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end relationalExpressionNoIn

    public static class equalityExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start equalityExpression
    // JS.g:1201:1: equalityExpression : relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* ;
    public final equalityExpression_return equalityExpression() throws RecognitionException {
        equalityExpression_return retval = new equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set110=null;
        relationalExpression_return relationalExpression109 = null;

        relationalExpression_return relationalExpression111 = null;


        Object set110_tree=null;

        try {
            // JS.g:1202:2: ( relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* )
            // JS.g:1202:4: relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression4478);
            relationalExpression109=relationalExpression();
            _fsp--;

            adaptor.addChild(root_0, relationalExpression109.getTree());
            // JS.g:1202:25: ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=EQ && LA27_0<=NSAME)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // JS.g:1202:27: ( EQ | NEQ | SAME | NSAME ) relationalExpression
            	    {
            	    set110=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NSAME) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set110), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equalityExpression4482);    throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression4501);
            	    relationalExpression111=relationalExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpression111.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end equalityExpression

    public static class equalityExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start equalityExpressionNoIn
    // JS.g:1205:1: equalityExpressionNoIn : relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* ;
    public final equalityExpressionNoIn_return equalityExpressionNoIn() throws RecognitionException {
        equalityExpressionNoIn_return retval = new equalityExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set113=null;
        relationalExpressionNoIn_return relationalExpressionNoIn112 = null;

        relationalExpressionNoIn_return relationalExpressionNoIn114 = null;


        Object set113_tree=null;

        try {
            // JS.g:1206:2: ( relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* )
            // JS.g:1206:4: relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4515);
            relationalExpressionNoIn112=relationalExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, relationalExpressionNoIn112.getTree());
            // JS.g:1206:29: ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=EQ && LA28_0<=NSAME)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // JS.g:1206:31: ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn
            	    {
            	    set113=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NSAME) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set113), root_0);
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equalityExpressionNoIn4519);    throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4538);
            	    relationalExpressionNoIn114=relationalExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpressionNoIn114.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end equalityExpressionNoIn

    public static class bitwiseANDExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseANDExpression
    // JS.g:1213:1: bitwiseANDExpression : equalityExpression ( AND equalityExpression )* ;
    public final bitwiseANDExpression_return bitwiseANDExpression() throws RecognitionException {
        bitwiseANDExpression_return retval = new bitwiseANDExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND116=null;
        equalityExpression_return equalityExpression115 = null;

        equalityExpression_return equalityExpression117 = null;


        Object AND116_tree=null;

        try {
            // JS.g:1214:2: ( equalityExpression ( AND equalityExpression )* )
            // JS.g:1214:4: equalityExpression ( AND equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression4558);
            equalityExpression115=equalityExpression();
            _fsp--;

            adaptor.addChild(root_0, equalityExpression115.getTree());
            // JS.g:1214:23: ( AND equalityExpression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==AND) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // JS.g:1214:25: AND equalityExpression
            	    {
            	    AND116=(Token)input.LT(1);
            	    match(input,AND,FOLLOW_AND_in_bitwiseANDExpression4562); 
            	    AND116_tree = (Object)adaptor.create(AND116);
            	    root_0 = (Object)adaptor.becomeRoot(AND116_tree, root_0);

            	    pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression4565);
            	    equalityExpression117=equalityExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpression117.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end bitwiseANDExpression

    public static class bitwiseANDExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseANDExpressionNoIn
    // JS.g:1217:1: bitwiseANDExpressionNoIn : equalityExpressionNoIn ( AND equalityExpressionNoIn )* ;
    public final bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn() throws RecognitionException {
        bitwiseANDExpressionNoIn_return retval = new bitwiseANDExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND119=null;
        equalityExpressionNoIn_return equalityExpressionNoIn118 = null;

        equalityExpressionNoIn_return equalityExpressionNoIn120 = null;


        Object AND119_tree=null;

        try {
            // JS.g:1218:2: ( equalityExpressionNoIn ( AND equalityExpressionNoIn )* )
            // JS.g:1218:4: equalityExpressionNoIn ( AND equalityExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4579);
            equalityExpressionNoIn118=equalityExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, equalityExpressionNoIn118.getTree());
            // JS.g:1218:27: ( AND equalityExpressionNoIn )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==AND) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // JS.g:1218:29: AND equalityExpressionNoIn
            	    {
            	    AND119=(Token)input.LT(1);
            	    match(input,AND,FOLLOW_AND_in_bitwiseANDExpressionNoIn4583); 
            	    AND119_tree = (Object)adaptor.create(AND119);
            	    root_0 = (Object)adaptor.becomeRoot(AND119_tree, root_0);

            	    pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4586);
            	    equalityExpressionNoIn120=equalityExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpressionNoIn120.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end bitwiseANDExpressionNoIn

    public static class bitwiseXORExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseXORExpression
    // JS.g:1221:1: bitwiseXORExpression : bitwiseANDExpression ( XOR bitwiseANDExpression )* ;
    public final bitwiseXORExpression_return bitwiseXORExpression() throws RecognitionException {
        bitwiseXORExpression_return retval = new bitwiseXORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XOR122=null;
        bitwiseANDExpression_return bitwiseANDExpression121 = null;

        bitwiseANDExpression_return bitwiseANDExpression123 = null;


        Object XOR122_tree=null;

        try {
            // JS.g:1222:2: ( bitwiseANDExpression ( XOR bitwiseANDExpression )* )
            // JS.g:1222:4: bitwiseANDExpression ( XOR bitwiseANDExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4602);
            bitwiseANDExpression121=bitwiseANDExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseANDExpression121.getTree());
            // JS.g:1222:25: ( XOR bitwiseANDExpression )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==XOR) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // JS.g:1222:27: XOR bitwiseANDExpression
            	    {
            	    XOR122=(Token)input.LT(1);
            	    match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpression4606); 
            	    XOR122_tree = (Object)adaptor.create(XOR122);
            	    root_0 = (Object)adaptor.becomeRoot(XOR122_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4609);
            	    bitwiseANDExpression123=bitwiseANDExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseANDExpression123.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end bitwiseXORExpression

    public static class bitwiseXORExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseXORExpressionNoIn
    // JS.g:1225:1: bitwiseXORExpressionNoIn : bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* ;
    public final bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn() throws RecognitionException {
        bitwiseXORExpressionNoIn_return retval = new bitwiseXORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XOR125=null;
        bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn124 = null;

        bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn126 = null;


        Object XOR125_tree=null;

        try {
            // JS.g:1226:2: ( bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* )
            // JS.g:1226:4: bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4625);
            bitwiseANDExpressionNoIn124=bitwiseANDExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseANDExpressionNoIn124.getTree());
            // JS.g:1226:29: ( XOR bitwiseANDExpressionNoIn )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==XOR) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // JS.g:1226:31: XOR bitwiseANDExpressionNoIn
            	    {
            	    XOR125=(Token)input.LT(1);
            	    match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpressionNoIn4629); 
            	    XOR125_tree = (Object)adaptor.create(XOR125);
            	    root_0 = (Object)adaptor.becomeRoot(XOR125_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4632);
            	    bitwiseANDExpressionNoIn126=bitwiseANDExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseANDExpressionNoIn126.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end bitwiseXORExpressionNoIn

    public static class bitwiseORExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseORExpression
    // JS.g:1229:1: bitwiseORExpression : bitwiseXORExpression ( OR bitwiseXORExpression )* ;
    public final bitwiseORExpression_return bitwiseORExpression() throws RecognitionException {
        bitwiseORExpression_return retval = new bitwiseORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR128=null;
        bitwiseXORExpression_return bitwiseXORExpression127 = null;

        bitwiseXORExpression_return bitwiseXORExpression129 = null;


        Object OR128_tree=null;

        try {
            // JS.g:1230:2: ( bitwiseXORExpression ( OR bitwiseXORExpression )* )
            // JS.g:1230:4: bitwiseXORExpression ( OR bitwiseXORExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4647);
            bitwiseXORExpression127=bitwiseXORExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseXORExpression127.getTree());
            // JS.g:1230:25: ( OR bitwiseXORExpression )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==OR) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // JS.g:1230:27: OR bitwiseXORExpression
            	    {
            	    OR128=(Token)input.LT(1);
            	    match(input,OR,FOLLOW_OR_in_bitwiseORExpression4651); 
            	    OR128_tree = (Object)adaptor.create(OR128);
            	    root_0 = (Object)adaptor.becomeRoot(OR128_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4654);
            	    bitwiseXORExpression129=bitwiseXORExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseXORExpression129.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end bitwiseORExpression

    public static class bitwiseORExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseORExpressionNoIn
    // JS.g:1233:1: bitwiseORExpressionNoIn : bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* ;
    public final bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn() throws RecognitionException {
        bitwiseORExpressionNoIn_return retval = new bitwiseORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR131=null;
        bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn130 = null;

        bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn132 = null;


        Object OR131_tree=null;

        try {
            // JS.g:1234:2: ( bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* )
            // JS.g:1234:4: bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4669);
            bitwiseXORExpressionNoIn130=bitwiseXORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseXORExpressionNoIn130.getTree());
            // JS.g:1234:29: ( OR bitwiseXORExpressionNoIn )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==OR) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // JS.g:1234:31: OR bitwiseXORExpressionNoIn
            	    {
            	    OR131=(Token)input.LT(1);
            	    match(input,OR,FOLLOW_OR_in_bitwiseORExpressionNoIn4673); 
            	    OR131_tree = (Object)adaptor.create(OR131);
            	    root_0 = (Object)adaptor.becomeRoot(OR131_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4676);
            	    bitwiseXORExpressionNoIn132=bitwiseXORExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseXORExpressionNoIn132.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end bitwiseORExpressionNoIn

    public static class logicalANDExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalANDExpression
    // JS.g:1241:1: logicalANDExpression : bitwiseORExpression ( LAND bitwiseORExpression )* ;
    public final logicalANDExpression_return logicalANDExpression() throws RecognitionException {
        logicalANDExpression_return retval = new logicalANDExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAND134=null;
        bitwiseORExpression_return bitwiseORExpression133 = null;

        bitwiseORExpression_return bitwiseORExpression135 = null;


        Object LAND134_tree=null;

        try {
            // JS.g:1242:2: ( bitwiseORExpression ( LAND bitwiseORExpression )* )
            // JS.g:1242:4: bitwiseORExpression ( LAND bitwiseORExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression4695);
            bitwiseORExpression133=bitwiseORExpression();
            _fsp--;

            adaptor.addChild(root_0, bitwiseORExpression133.getTree());
            // JS.g:1242:24: ( LAND bitwiseORExpression )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==LAND) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // JS.g:1242:26: LAND bitwiseORExpression
            	    {
            	    LAND134=(Token)input.LT(1);
            	    match(input,LAND,FOLLOW_LAND_in_logicalANDExpression4699); 
            	    LAND134_tree = (Object)adaptor.create(LAND134);
            	    root_0 = (Object)adaptor.becomeRoot(LAND134_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression4702);
            	    bitwiseORExpression135=bitwiseORExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseORExpression135.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end logicalANDExpression

    public static class logicalANDExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalANDExpressionNoIn
    // JS.g:1245:1: logicalANDExpressionNoIn : bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* ;
    public final logicalANDExpressionNoIn_return logicalANDExpressionNoIn() throws RecognitionException {
        logicalANDExpressionNoIn_return retval = new logicalANDExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAND137=null;
        bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn136 = null;

        bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn138 = null;


        Object LAND137_tree=null;

        try {
            // JS.g:1246:2: ( bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* )
            // JS.g:1246:4: bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4716);
            bitwiseORExpressionNoIn136=bitwiseORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, bitwiseORExpressionNoIn136.getTree());
            // JS.g:1246:28: ( LAND bitwiseORExpressionNoIn )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==LAND) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // JS.g:1246:30: LAND bitwiseORExpressionNoIn
            	    {
            	    LAND137=(Token)input.LT(1);
            	    match(input,LAND,FOLLOW_LAND_in_logicalANDExpressionNoIn4720); 
            	    LAND137_tree = (Object)adaptor.create(LAND137);
            	    root_0 = (Object)adaptor.becomeRoot(LAND137_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4723);
            	    bitwiseORExpressionNoIn138=bitwiseORExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseORExpressionNoIn138.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end logicalANDExpressionNoIn

    public static class logicalORExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalORExpression
    // JS.g:1249:1: logicalORExpression : logicalANDExpression ( LOR logicalANDExpression )* ;
    public final logicalORExpression_return logicalORExpression() throws RecognitionException {
        logicalORExpression_return retval = new logicalORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOR140=null;
        logicalANDExpression_return logicalANDExpression139 = null;

        logicalANDExpression_return logicalANDExpression141 = null;


        Object LOR140_tree=null;

        try {
            // JS.g:1250:2: ( logicalANDExpression ( LOR logicalANDExpression )* )
            // JS.g:1250:4: logicalANDExpression ( LOR logicalANDExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression4738);
            logicalANDExpression139=logicalANDExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalANDExpression139.getTree());
            // JS.g:1250:25: ( LOR logicalANDExpression )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==LOR) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // JS.g:1250:27: LOR logicalANDExpression
            	    {
            	    LOR140=(Token)input.LT(1);
            	    match(input,LOR,FOLLOW_LOR_in_logicalORExpression4742); 
            	    LOR140_tree = (Object)adaptor.create(LOR140);
            	    root_0 = (Object)adaptor.becomeRoot(LOR140_tree, root_0);

            	    pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression4745);
            	    logicalANDExpression141=logicalANDExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalANDExpression141.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end logicalORExpression

    public static class logicalORExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalORExpressionNoIn
    // JS.g:1253:1: logicalORExpressionNoIn : logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* ;
    public final logicalORExpressionNoIn_return logicalORExpressionNoIn() throws RecognitionException {
        logicalORExpressionNoIn_return retval = new logicalORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOR143=null;
        logicalANDExpressionNoIn_return logicalANDExpressionNoIn142 = null;

        logicalANDExpressionNoIn_return logicalANDExpressionNoIn144 = null;


        Object LOR143_tree=null;

        try {
            // JS.g:1254:2: ( logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* )
            // JS.g:1254:4: logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4760);
            logicalANDExpressionNoIn142=logicalANDExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, logicalANDExpressionNoIn142.getTree());
            // JS.g:1254:29: ( LOR logicalANDExpressionNoIn )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==LOR) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // JS.g:1254:31: LOR logicalANDExpressionNoIn
            	    {
            	    LOR143=(Token)input.LT(1);
            	    match(input,LOR,FOLLOW_LOR_in_logicalORExpressionNoIn4764); 
            	    LOR143_tree = (Object)adaptor.create(LOR143);
            	    root_0 = (Object)adaptor.becomeRoot(LOR143_tree, root_0);

            	    pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4767);
            	    logicalANDExpressionNoIn144=logicalANDExpressionNoIn();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalANDExpressionNoIn144.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end logicalORExpressionNoIn

    public static class conditionalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start conditionalExpression
    // JS.g:1261:1: conditionalExpression : logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? ;
    public final conditionalExpression_return conditionalExpression() throws RecognitionException {
        conditionalExpression_return retval = new conditionalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUE146=null;
        Token COLON148=null;
        logicalORExpression_return logicalORExpression145 = null;

        assignmentExpression_return assignmentExpression147 = null;

        assignmentExpression_return assignmentExpression149 = null;


        Object QUE146_tree=null;
        Object COLON148_tree=null;

        try {
            // JS.g:1262:2: ( logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? )
            // JS.g:1262:4: logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpression_in_conditionalExpression4786);
            logicalORExpression145=logicalORExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalORExpression145.getTree());
            // JS.g:1262:24: ( QUE assignmentExpression COLON assignmentExpression )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==QUE) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // JS.g:1262:26: QUE assignmentExpression COLON assignmentExpression
                    {
                    QUE146=(Token)input.LT(1);
                    match(input,QUE,FOLLOW_QUE_in_conditionalExpression4790); 
                    QUE146_tree = (Object)adaptor.create(QUE146);
                    root_0 = (Object)adaptor.becomeRoot(QUE146_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression4793);
                    assignmentExpression147=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression147.getTree());
                    COLON148=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_conditionalExpression4795); 
                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression4798);
                    assignmentExpression149=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression149.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end conditionalExpression

    public static class conditionalExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start conditionalExpressionNoIn
    // JS.g:1265:1: conditionalExpressionNoIn : logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? ;
    public final conditionalExpressionNoIn_return conditionalExpressionNoIn() throws RecognitionException {
        conditionalExpressionNoIn_return retval = new conditionalExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUE151=null;
        Token COLON153=null;
        logicalORExpressionNoIn_return logicalORExpressionNoIn150 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn152 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn154 = null;


        Object QUE151_tree=null;
        Object COLON153_tree=null;

        try {
            // JS.g:1266:2: ( logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? )
            // JS.g:1266:4: logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn4812);
            logicalORExpressionNoIn150=logicalORExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, logicalORExpressionNoIn150.getTree());
            // JS.g:1266:28: ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==QUE) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // JS.g:1266:30: QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn
                    {
                    QUE151=(Token)input.LT(1);
                    match(input,QUE,FOLLOW_QUE_in_conditionalExpressionNoIn4816); 
                    QUE151_tree = (Object)adaptor.create(QUE151);
                    root_0 = (Object)adaptor.becomeRoot(QUE151_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4819);
                    assignmentExpressionNoIn152=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn152.getTree());
                    COLON153=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_conditionalExpressionNoIn4821); 
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4824);
                    assignmentExpressionNoIn154=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn154.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end conditionalExpressionNoIn

    public static class assignmentExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start assignmentExpression
    // JS.g:1295:1: assignmentExpression : lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? ;
    public final assignmentExpression_return assignmentExpression() throws RecognitionException {
        assignmentExpression_return retval = new assignmentExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        conditionalExpression_return lhs = null;

        assignmentOperator_return assignmentOperator155 = null;

        assignmentExpression_return assignmentExpression156 = null;




        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1300:2: (lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? )
            // JS.g:1300:4: lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpression_in_assignmentExpression4852);
            lhs=conditionalExpression();
            _fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // JS.g:1301:2: ({...}? assignmentOperator assignmentExpression )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=ASSIGN && LA41_0<=XORASS)||LA41_0==DIVASS) ) {
                int LA41_1 = input.LA(2);

                if ( ( isLeftHandSideAssign(lhs, isLhs) ) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // JS.g:1301:4: {...}? assignmentOperator assignmentExpression
                    {
                    if ( !( isLeftHandSideAssign(lhs, isLhs) ) ) {
                        throw new FailedPredicateException(input, "assignmentExpression", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpression4859);
                    assignmentOperator155=assignmentOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(assignmentOperator155.getTree(), root_0);
                    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression4862);
                    assignmentExpression156=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression156.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end assignmentExpression

    public static class assignmentOperator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start assignmentOperator
    // JS.g:1304:1: assignmentOperator : ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS );
    public final assignmentOperator_return assignmentOperator() throws RecognitionException {
        assignmentOperator_return retval = new assignmentOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set157=null;

        Object set157_tree=null;

        try {
            // JS.g:1305:3: ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS )
            // JS.g:
            {
            root_0 = (Object)adaptor.nil();

            set157=(Token)input.LT(1);
            if ( (input.LA(1)>=ASSIGN && input.LA(1)<=XORASS)||input.LA(1)==DIVASS ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set157));
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assignmentOperator0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end assignmentOperator

    public static class assignmentExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start assignmentExpressionNoIn
    // JS.g:1308:1: assignmentExpressionNoIn : lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? ;
    public final assignmentExpressionNoIn_return assignmentExpressionNoIn() throws RecognitionException {
        assignmentExpressionNoIn_return retval = new assignmentExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        conditionalExpressionNoIn_return lhs = null;

        assignmentOperator_return assignmentOperator158 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn159 = null;




        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1313:2: (lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? )
            // JS.g:1313:4: lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn4940);
            lhs=conditionalExpressionNoIn();
            _fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // JS.g:1314:2: ({...}? assignmentOperator assignmentExpressionNoIn )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=ASSIGN && LA42_0<=XORASS)||LA42_0==DIVASS) ) {
                int LA42_1 = input.LA(2);

                if ( ( isLeftHandSideAssign(lhs, isLhs) ) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // JS.g:1314:4: {...}? assignmentOperator assignmentExpressionNoIn
                    {
                    if ( !( isLeftHandSideAssign(lhs, isLhs) ) ) {
                        throw new FailedPredicateException(input, "assignmentExpressionNoIn", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpressionNoIn4947);
                    assignmentOperator158=assignmentOperator();
                    _fsp--;

                    root_0 = (Object)adaptor.becomeRoot(assignmentOperator158.getTree(), root_0);
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn4950);
                    assignmentExpressionNoIn159=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn159.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end assignmentExpressionNoIn

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start expression
    // JS.g:1321:1: expression : exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs;
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA160=null;
        List list_exprs=null;
        RuleReturnScope exprs = null;
        Object COMMA160_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // JS.g:1322:2: (exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs)
            // JS.g:1322:4: exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )*
            {
            pushFollow(FOLLOW_assignmentExpression_in_expression4972);
            exprs=assignmentExpression();
            _fsp--;

            stream_assignmentExpression.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs);

            // JS.g:1322:32: ( COMMA exprs+= assignmentExpression )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==COMMA) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // JS.g:1322:34: COMMA exprs+= assignmentExpression
            	    {
            	    COMMA160=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_expression4976); 
            	    stream_COMMA.add(COMMA160);

            	    pushFollow(FOLLOW_assignmentExpression_in_expression4980);
            	    exprs=assignmentExpression();
            	    _fsp--;

            	    stream_assignmentExpression.add(exprs.getTree());
            	    if (list_exprs==null) list_exprs=new ArrayList();
            	    list_exprs.add(exprs);


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            // AST REWRITE
            // elements: exprs, exprs
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: exprs
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"token exprs",list_exprs);
            root_0 = (Object)adaptor.nil();
            // 1323:2: -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
            if ( list_exprs.size() > 1 ) {
                // JS.g:1323:28: ^( CEXPR ( $exprs)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(CEXPR, "CEXPR"), root_1);

                if ( !(stream_exprs.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_exprs.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_exprs.next()).getTree());

                }
                stream_exprs.reset();

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 1324:2: -> $exprs
            {
                adaptor.addChild(root_0, ((ParserRuleReturnScope)stream_exprs.next()).getTree());

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end expression

    public static class expressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start expressionNoIn
    // JS.g:1327:1: expressionNoIn : exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs;
    public final expressionNoIn_return expressionNoIn() throws RecognitionException {
        expressionNoIn_return retval = new expressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA161=null;
        List list_exprs=null;
        RuleReturnScope exprs = null;
        Object COMMA161_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_assignmentExpressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpressionNoIn");
        try {
            // JS.g:1328:2: (exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs)
            // JS.g:1328:4: exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )*
            {
            pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5017);
            exprs=assignmentExpressionNoIn();
            _fsp--;

            stream_assignmentExpressionNoIn.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs);

            // JS.g:1328:36: ( COMMA exprs+= assignmentExpressionNoIn )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==COMMA) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // JS.g:1328:38: COMMA exprs+= assignmentExpressionNoIn
            	    {
            	    COMMA161=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_expressionNoIn5021); 
            	    stream_COMMA.add(COMMA161);

            	    pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5025);
            	    exprs=assignmentExpressionNoIn();
            	    _fsp--;

            	    stream_assignmentExpressionNoIn.add(exprs.getTree());
            	    if (list_exprs==null) list_exprs=new ArrayList();
            	    list_exprs.add(exprs);


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            // AST REWRITE
            // elements: exprs, exprs
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: exprs
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"token exprs",list_exprs);
            root_0 = (Object)adaptor.nil();
            // 1329:2: -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
            if ( list_exprs.size() > 1 ) {
                // JS.g:1329:28: ^( CEXPR ( $exprs)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(CEXPR, "CEXPR"), root_1);

                if ( !(stream_exprs.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_exprs.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_exprs.next()).getTree());

                }
                stream_exprs.reset();

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 1330:2: -> $exprs
            {
                adaptor.addChild(root_0, ((ParserRuleReturnScope)stream_exprs.next()).getTree());

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end expressionNoIn

    public static class semic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start semic
    // JS.g:1355:1: semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );
    public final semic_return semic() throws RecognitionException {
        semic_return retval = new semic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC162=null;
        Token EOF163=null;
        Token RBRACE164=null;
        Token EOL165=null;
        Token MultiLineComment166=null;

        Object SEMIC162_tree=null;
        Object EOF163_tree=null;
        Object RBRACE164_tree=null;
        Object EOL165_tree=null;
        Object MultiLineComment166_tree=null;


        	// Mark current position so we can unconsume a RBRACE.
        	int marker = input.mark();
        	// Promote EOL if appropriate	
        	promoteEOL(retval);

        try {
            // JS.g:1363:2: ( SEMIC | EOF | RBRACE | EOL | MultiLineComment )
            int alt45=5;
            switch ( input.LA(1) ) {
            case SEMIC:
                {
                alt45=1;
                }
                break;
            case EOF:
                {
                alt45=2;
                }
                break;
            case RBRACE:
                {
                alt45=3;
                }
                break;
            case EOL:
                {
                alt45=4;
                }
                break;
            case MultiLineComment:
                {
                alt45=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1355:1: semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // JS.g:1363:4: SEMIC
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMIC162=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_semic5076); 
                    SEMIC162_tree = (Object)adaptor.create(SEMIC162);
                    adaptor.addChild(root_0, SEMIC162_tree);


                    }
                    break;
                case 2 :
                    // JS.g:1364:4: EOF
                    {
                    root_0 = (Object)adaptor.nil();

                    EOF163=(Token)input.LT(1);
                    match(input,EOF,FOLLOW_EOF_in_semic5081); 
                    EOF163_tree = (Object)adaptor.create(EOF163);
                    adaptor.addChild(root_0, EOF163_tree);


                    }
                    break;
                case 3 :
                    // JS.g:1365:4: RBRACE
                    {
                    root_0 = (Object)adaptor.nil();

                    RBRACE164=(Token)input.LT(1);
                    match(input,RBRACE,FOLLOW_RBRACE_in_semic5086); 
                    RBRACE164_tree = (Object)adaptor.create(RBRACE164);
                    adaptor.addChild(root_0, RBRACE164_tree);

                     input.rewind(marker); 

                    }
                    break;
                case 4 :
                    // JS.g:1366:4: EOL
                    {
                    root_0 = (Object)adaptor.nil();

                    EOL165=(Token)input.LT(1);
                    match(input,EOL,FOLLOW_EOL_in_semic5093); 
                    EOL165_tree = (Object)adaptor.create(EOL165);
                    adaptor.addChild(root_0, EOL165_tree);


                    }
                    break;
                case 5 :
                    // JS.g:1366:10: MultiLineComment
                    {
                    root_0 = (Object)adaptor.nil();

                    MultiLineComment166=(Token)input.LT(1);
                    match(input,MultiLineComment,FOLLOW_MultiLineComment_in_semic5097); 
                    MultiLineComment166_tree = (Object)adaptor.create(MultiLineComment166);
                    adaptor.addChild(root_0, MultiLineComment166_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end semic

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start statement
    // JS.g:1374:1: statement options {k=1; } : ({...}? block | statementTail );
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        block_return block167 = null;

        statementTail_return statementTail168 = null;



        try {
            // JS.g:1379:2: ({...}? block | statementTail )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==LBRACE) ) {
                int LA46_1 = input.LA(2);

                if ( ( input.LA(1) == LBRACE ) ) {
                    alt46=1;
                }
                else if ( (true) ) {
                    alt46=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1374:1: statement options {k=1; } : ({...}? block | statementTail );", 46, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA46_0>=NULL && LA46_0<=BREAK)||(LA46_0>=CONTINUE && LA46_0<=DO)||(LA46_0>=FOR && LA46_0<=IF)||(LA46_0>=NEW && LA46_0<=YIELD)||(LA46_0>=WXML && LA46_0<=NAMESPACE)||LA46_0==CONST||LA46_0==LPAREN||LA46_0==LBRACK||LA46_0==SEMIC||(LA46_0>=ADD && LA46_0<=SUB)||(LA46_0>=INC && LA46_0<=DEC)||(LA46_0>=NOT && LA46_0<=INV)||LA46_0==XMLLiteral||(LA46_0>=StringLiteral && LA46_0<=XmlAttribute)||LA46_0==Identifier||LA46_0==RegularExpressionLiteral||(LA46_0>=DecimalLiteral && LA46_0<=HexIntegerLiteral)) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1374:1: statement options {k=1; } : ({...}? block | statementTail );", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // JS.g:1379:4: {...}? block
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( input.LA(1) == LBRACE ) ) {
                        throw new FailedPredicateException(input, "statement", " input.LA(1) == LBRACE ");
                    }
                    pushFollow(FOLLOW_block_in_statement5126);
                    block167=block();
                    _fsp--;

                    adaptor.addChild(root_0, block167.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1380:4: statementTail
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statementTail_in_statement5131);
                    statementTail168=statementTail();
                    _fsp--;

                    adaptor.addChild(root_0, statementTail168.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end statement

    public static class statementTail_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start statementTail
    // JS.g:1383:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );
    public final statementTail_return statementTail() throws RecognitionException {
        statementTail_return retval = new statementTail_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        variableStatement_return variableStatement169 = null;

        emptyStatement_return emptyStatement170 = null;

        expressionStatement_return expressionStatement171 = null;

        ifStatement_return ifStatement172 = null;

        iterationStatement_return iterationStatement173 = null;

        continueStatement_return continueStatement174 = null;

        breakStatement_return breakStatement175 = null;

        returnStatement_return returnStatement176 = null;

        withStatement_return withStatement177 = null;

        labelledStatement_return labelledStatement178 = null;

        switchStatement_return switchStatement179 = null;

        throwStatement_return throwStatement180 = null;

        tryStatement_return tryStatement181 = null;

        constStatement_return constStatement182 = null;

        namespaceStatement_return namespaceStatement183 = null;



        try {
            // JS.g:1384:2: ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement )
            int alt47=15;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt47=1;
                }
                break;
            case SEMIC:
                {
                alt47=2;
                }
                break;
            case NULL:
            case TRUE:
            case FALSE:
            case DELETE:
            case FUNCTION:
            case NEW:
            case THIS:
            case TYPEOF:
            case VOID:
            case YIELD:
            case LBRACE:
            case LPAREN:
            case LBRACK:
            case ADD:
            case SUB:
            case INC:
            case DEC:
            case NOT:
            case INV:
            case XMLLiteral:
            case StringLiteral:
            case XmlAttribute:
            case RegularExpressionLiteral:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt47=3;
                }
                break;
            case EACH:
            case GET:
            case SET:
            case WXML:
            case NAMESPACE:
            case Identifier:
                {
                int LA47_4 = input.LA(2);

                if ( (LA47_4==EOF||(LA47_4>=IN && LA47_4<=INSTANCEOF)||(LA47_4>=RBRACE && LA47_4<=LPAREN)||LA47_4==LBRACK||(LA47_4>=DOT && LA47_4<=XOR)||(LA47_4>=LAND && LA47_4<=QUE)||(LA47_4>=ASSIGN && LA47_4<=DIVASS)||(LA47_4>=DOTDOT && LA47_4<=COLONCOLON)||(LA47_4>=EOL && LA47_4<=MultiLineComment)) ) {
                    alt47=3;
                }
                else if ( (LA47_4==COLON) ) {
                    alt47=10;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1383:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 47, 4, input);

                    throw nvae;
                }
                }
                break;
            case IF:
                {
                alt47=4;
                }
                break;
            case DO:
            case FOR:
            case WHILE:
                {
                alt47=5;
                }
                break;
            case CONTINUE:
                {
                alt47=6;
                }
                break;
            case BREAK:
                {
                alt47=7;
                }
                break;
            case RETURN:
                {
                alt47=8;
                }
                break;
            case WITH:
                {
                alt47=9;
                }
                break;
            case SWITCH:
                {
                alt47=11;
                }
                break;
            case THROW:
                {
                alt47=12;
                }
                break;
            case TRY:
                {
                alt47=13;
                }
                break;
            case CONST:
                {
                alt47=14;
                }
                break;
            case DEFAULT:
                {
                alt47=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1383:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement | constStatement | namespaceStatement );", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // JS.g:1384:4: variableStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableStatement_in_statementTail5143);
                    variableStatement169=variableStatement();
                    _fsp--;

                    adaptor.addChild(root_0, variableStatement169.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1385:4: emptyStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_emptyStatement_in_statementTail5148);
                    emptyStatement170=emptyStatement();
                    _fsp--;

                    adaptor.addChild(root_0, emptyStatement170.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1386:4: expressionStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expressionStatement_in_statementTail5153);
                    expressionStatement171=expressionStatement();
                    _fsp--;

                    adaptor.addChild(root_0, expressionStatement171.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1387:4: ifStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statementTail5158);
                    ifStatement172=ifStatement();
                    _fsp--;

                    adaptor.addChild(root_0, ifStatement172.getTree());

                    }
                    break;
                case 5 :
                    // JS.g:1388:4: iterationStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iterationStatement_in_statementTail5163);
                    iterationStatement173=iterationStatement();
                    _fsp--;

                    adaptor.addChild(root_0, iterationStatement173.getTree());

                    }
                    break;
                case 6 :
                    // JS.g:1389:4: continueStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_continueStatement_in_statementTail5168);
                    continueStatement174=continueStatement();
                    _fsp--;

                    adaptor.addChild(root_0, continueStatement174.getTree());

                    }
                    break;
                case 7 :
                    // JS.g:1390:4: breakStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_breakStatement_in_statementTail5173);
                    breakStatement175=breakStatement();
                    _fsp--;

                    adaptor.addChild(root_0, breakStatement175.getTree());

                    }
                    break;
                case 8 :
                    // JS.g:1391:4: returnStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_returnStatement_in_statementTail5178);
                    returnStatement176=returnStatement();
                    _fsp--;

                    adaptor.addChild(root_0, returnStatement176.getTree());

                    }
                    break;
                case 9 :
                    // JS.g:1392:4: withStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_withStatement_in_statementTail5183);
                    withStatement177=withStatement();
                    _fsp--;

                    adaptor.addChild(root_0, withStatement177.getTree());

                    }
                    break;
                case 10 :
                    // JS.g:1393:4: labelledStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_labelledStatement_in_statementTail5188);
                    labelledStatement178=labelledStatement();
                    _fsp--;

                    adaptor.addChild(root_0, labelledStatement178.getTree());

                    }
                    break;
                case 11 :
                    // JS.g:1394:4: switchStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_switchStatement_in_statementTail5193);
                    switchStatement179=switchStatement();
                    _fsp--;

                    adaptor.addChild(root_0, switchStatement179.getTree());

                    }
                    break;
                case 12 :
                    // JS.g:1395:4: throwStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_throwStatement_in_statementTail5198);
                    throwStatement180=throwStatement();
                    _fsp--;

                    adaptor.addChild(root_0, throwStatement180.getTree());

                    }
                    break;
                case 13 :
                    // JS.g:1396:4: tryStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tryStatement_in_statementTail5203);
                    tryStatement181=tryStatement();
                    _fsp--;

                    adaptor.addChild(root_0, tryStatement181.getTree());

                    }
                    break;
                case 14 :
                    // JS.g:1397:4: constStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constStatement_in_statementTail5208);
                    constStatement182=constStatement();
                    _fsp--;

                    adaptor.addChild(root_0, constStatement182.getTree());

                    }
                    break;
                case 15 :
                    // JS.g:1398:4: namespaceStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namespaceStatement_in_statementTail5213);
                    namespaceStatement183=namespaceStatement();
                    _fsp--;

                    adaptor.addChild(root_0, namespaceStatement183.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end statementTail

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start block
    // JS.g:1403:1: block : lb= LBRACE ( statement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* ) ;
    public final block_return block() throws RecognitionException {
        block_return retval = new block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token RBRACE185=null;
        statement_return statement184 = null;


        Object lb_tree=null;
        Object RBRACE185_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // JS.g:1404:2: (lb= LBRACE ( statement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* ) )
            // JS.g:1404:4: lb= LBRACE ( statement )* RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_block5228); 
            stream_LBRACE.add(lb);

            // JS.g:1404:14: ( statement )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=NULL && LA48_0<=BREAK)||(LA48_0>=CONTINUE && LA48_0<=DO)||(LA48_0>=FOR && LA48_0<=IF)||(LA48_0>=NEW && LA48_0<=YIELD)||(LA48_0>=WXML && LA48_0<=NAMESPACE)||LA48_0==CONST||LA48_0==LBRACE||LA48_0==LPAREN||LA48_0==LBRACK||LA48_0==SEMIC||(LA48_0>=ADD && LA48_0<=SUB)||(LA48_0>=INC && LA48_0<=DEC)||(LA48_0>=NOT && LA48_0<=INV)||LA48_0==XMLLiteral||(LA48_0>=StringLiteral && LA48_0<=XmlAttribute)||LA48_0==Identifier||LA48_0==RegularExpressionLiteral||(LA48_0>=DecimalLiteral && LA48_0<=HexIntegerLiteral)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // JS.g:1404:14: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block5230);
            	    statement184=statement();
            	    _fsp--;

            	    stream_statement.add(statement184.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            RBRACE185=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_block5233); 
            stream_RBRACE.add(RBRACE185);


            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1405:2: -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* )
            {
                // JS.g:1405:5: ^( BLOCK[$lb, \"BLOCK\"] ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK, lb,  "BLOCK"), root_1);

                // JS.g:1405:28: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.next());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end block

    public static class variableStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start variableStatement
    // JS.g:1412:1: variableStatement : VAR variableDeclaration ( COMMA variableDeclaration )* semic -> ^( VAR ( variableDeclaration )+ ) ;
    public final variableStatement_return variableStatement() throws RecognitionException {
        variableStatement_return retval = new variableStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR186=null;
        Token COMMA188=null;
        variableDeclaration_return variableDeclaration187 = null;

        variableDeclaration_return variableDeclaration189 = null;

        semic_return semic190 = null;


        Object VAR186_tree=null;
        Object COMMA188_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1413:2: ( VAR variableDeclaration ( COMMA variableDeclaration )* semic -> ^( VAR ( variableDeclaration )+ ) )
            // JS.g:1413:4: VAR variableDeclaration ( COMMA variableDeclaration )* semic
            {
            VAR186=(Token)input.LT(1);
            match(input,VAR,FOLLOW_VAR_in_variableStatement5262); 
            stream_VAR.add(VAR186);

            pushFollow(FOLLOW_variableDeclaration_in_variableStatement5264);
            variableDeclaration187=variableDeclaration();
            _fsp--;

            stream_variableDeclaration.add(variableDeclaration187.getTree());
            // JS.g:1413:28: ( COMMA variableDeclaration )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==COMMA) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // JS.g:1413:30: COMMA variableDeclaration
            	    {
            	    COMMA188=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_variableStatement5268); 
            	    stream_COMMA.add(COMMA188);

            	    pushFollow(FOLLOW_variableDeclaration_in_variableStatement5270);
            	    variableDeclaration189=variableDeclaration();
            	    _fsp--;

            	    stream_variableDeclaration.add(variableDeclaration189.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            pushFollow(FOLLOW_semic_in_variableStatement5275);
            semic190=semic();
            _fsp--;

            stream_semic.add(semic190.getTree());

            // AST REWRITE
            // elements: variableDeclaration, VAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1414:2: -> ^( VAR ( variableDeclaration )+ )
            {
                // JS.g:1414:5: ^( VAR ( variableDeclaration )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_VAR.next(), root_1);

                if ( !(stream_variableDeclaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_variableDeclaration.next());

                }
                stream_variableDeclaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end variableStatement

    public static class variableDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start variableDeclaration
    // JS.g:1417:1: variableDeclaration : identifier ( ASSIGN assignmentExpression )? ;
    public final variableDeclaration_return variableDeclaration() throws RecognitionException {
        variableDeclaration_return retval = new variableDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASSIGN192=null;
        identifier_return identifier191 = null;

        assignmentExpression_return assignmentExpression193 = null;


        Object ASSIGN192_tree=null;

        try {
            // JS.g:1418:2: ( identifier ( ASSIGN assignmentExpression )? )
            // JS.g:1418:4: identifier ( ASSIGN assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_variableDeclaration5298);
            identifier191=identifier();
            _fsp--;

            adaptor.addChild(root_0, identifier191.getTree());
            // JS.g:1418:15: ( ASSIGN assignmentExpression )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==ASSIGN) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // JS.g:1418:17: ASSIGN assignmentExpression
                    {
                    ASSIGN192=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration5302); 
                    ASSIGN192_tree = (Object)adaptor.create(ASSIGN192);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGN192_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpression_in_variableDeclaration5305);
                    assignmentExpression193=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression193.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end variableDeclaration

    public static class variableDeclarationNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start variableDeclarationNoIn
    // JS.g:1421:1: variableDeclarationNoIn : identifier ( ASSIGN assignmentExpressionNoIn )? ;
    public final variableDeclarationNoIn_return variableDeclarationNoIn() throws RecognitionException {
        variableDeclarationNoIn_return retval = new variableDeclarationNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASSIGN195=null;
        identifier_return identifier194 = null;

        assignmentExpressionNoIn_return assignmentExpressionNoIn196 = null;


        Object ASSIGN195_tree=null;

        try {
            // JS.g:1422:2: ( identifier ( ASSIGN assignmentExpressionNoIn )? )
            // JS.g:1422:4: identifier ( ASSIGN assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_variableDeclarationNoIn5320);
            identifier194=identifier();
            _fsp--;

            adaptor.addChild(root_0, identifier194.getTree());
            // JS.g:1422:15: ( ASSIGN assignmentExpressionNoIn )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==ASSIGN) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // JS.g:1422:17: ASSIGN assignmentExpressionNoIn
                    {
                    ASSIGN195=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclarationNoIn5324); 
                    ASSIGN195_tree = (Object)adaptor.create(ASSIGN195);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGN195_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn5327);
                    assignmentExpressionNoIn196=assignmentExpressionNoIn();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn196.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end variableDeclarationNoIn

    public static class constStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start constStatement
    // JS.g:1425:1: constStatement : CONST variableDeclaration ( COMMA variableDeclaration )* semic -> ^( CONST ( variableDeclaration )+ ) ;
    public final constStatement_return constStatement() throws RecognitionException {
        constStatement_return retval = new constStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONST197=null;
        Token COMMA199=null;
        variableDeclaration_return variableDeclaration198 = null;

        variableDeclaration_return variableDeclaration200 = null;

        semic_return semic201 = null;


        Object CONST197_tree=null;
        Object COMMA199_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1426:3: ( CONST variableDeclaration ( COMMA variableDeclaration )* semic -> ^( CONST ( variableDeclaration )+ ) )
            // JS.g:1426:5: CONST variableDeclaration ( COMMA variableDeclaration )* semic
            {
            CONST197=(Token)input.LT(1);
            match(input,CONST,FOLLOW_CONST_in_constStatement5342); 
            stream_CONST.add(CONST197);

            pushFollow(FOLLOW_variableDeclaration_in_constStatement5344);
            variableDeclaration198=variableDeclaration();
            _fsp--;

            stream_variableDeclaration.add(variableDeclaration198.getTree());
            // JS.g:1426:31: ( COMMA variableDeclaration )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==COMMA) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // JS.g:1426:33: COMMA variableDeclaration
            	    {
            	    COMMA199=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_constStatement5348); 
            	    stream_COMMA.add(COMMA199);

            	    pushFollow(FOLLOW_variableDeclaration_in_constStatement5350);
            	    variableDeclaration200=variableDeclaration();
            	    _fsp--;

            	    stream_variableDeclaration.add(variableDeclaration200.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            pushFollow(FOLLOW_semic_in_constStatement5355);
            semic201=semic();
            _fsp--;

            stream_semic.add(semic201.getTree());

            // AST REWRITE
            // elements: variableDeclaration, CONST
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1427:3: -> ^( CONST ( variableDeclaration )+ )
            {
                // JS.g:1427:6: ^( CONST ( variableDeclaration )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_CONST.next(), root_1);

                if ( !(stream_variableDeclaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_variableDeclaration.next());

                }
                stream_variableDeclaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end constStatement

    public static class emptyStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start emptyStatement
    // JS.g:1434:1: emptyStatement : SEMIC ;
    public final emptyStatement_return emptyStatement() throws RecognitionException {
        emptyStatement_return retval = new emptyStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC202=null;

        Object SEMIC202_tree=null;

        try {
            // JS.g:1435:2: ( SEMIC )
            // JS.g:1435:4: SEMIC
            {
            root_0 = (Object)adaptor.nil();

            SEMIC202=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_emptyStatement5385); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end emptyStatement

    public static class expressionStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start expressionStatement
    // JS.g:1448:1: expressionStatement : expression semic ;
    public final expressionStatement_return expressionStatement() throws RecognitionException {
        expressionStatement_return retval = new expressionStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression203 = null;

        semic_return semic204 = null;



        try {
            // JS.g:1449:2: ( expression semic )
            // JS.g:1449:4: expression semic
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_expressionStatement5404);
            expression203=expression();
            _fsp--;

            adaptor.addChild(root_0, expression203.getTree());
            pushFollow(FOLLOW_semic_in_expressionStatement5406);
            semic204=semic();
            _fsp--;


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end expressionStatement

    public static class ifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ifStatement
    // JS.g:1456:1: ifStatement : IF LPAREN expression RPAREN statement ({...}? ELSE statement )? -> ^( IF expression ( statement )+ ) ;
    public final ifStatement_return ifStatement() throws RecognitionException {
        ifStatement_return retval = new ifStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF205=null;
        Token LPAREN206=null;
        Token RPAREN208=null;
        Token ELSE210=null;
        expression_return expression207 = null;

        statement_return statement209 = null;

        statement_return statement211 = null;


        Object IF205_tree=null;
        Object LPAREN206_tree=null;
        Object RPAREN208_tree=null;
        Object ELSE210_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // JS.g:1458:2: ( IF LPAREN expression RPAREN statement ({...}? ELSE statement )? -> ^( IF expression ( statement )+ ) )
            // JS.g:1458:4: IF LPAREN expression RPAREN statement ({...}? ELSE statement )?
            {
            IF205=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_ifStatement5424); 
            stream_IF.add(IF205);

            LPAREN206=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_ifStatement5426); 
            stream_LPAREN.add(LPAREN206);

            pushFollow(FOLLOW_expression_in_ifStatement5428);
            expression207=expression();
            _fsp--;

            stream_expression.add(expression207.getTree());
            RPAREN208=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_ifStatement5430); 
            stream_RPAREN.add(RPAREN208);

            pushFollow(FOLLOW_statement_in_ifStatement5432);
            statement209=statement();
            _fsp--;

            stream_statement.add(statement209.getTree());
            // JS.g:1458:42: ({...}? ELSE statement )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==ELSE) ) {
                int LA53_1 = input.LA(2);

                if ( ( input.LA(1) == ELSE ) ) {
                    alt53=1;
                }
            }
            switch (alt53) {
                case 1 :
                    // JS.g:1458:44: {...}? ELSE statement
                    {
                    if ( !( input.LA(1) == ELSE ) ) {
                        throw new FailedPredicateException(input, "ifStatement", " input.LA(1) == ELSE ");
                    }
                    ELSE210=(Token)input.LT(1);
                    match(input,ELSE,FOLLOW_ELSE_in_ifStatement5438); 
                    stream_ELSE.add(ELSE210);

                    pushFollow(FOLLOW_statement_in_ifStatement5440);
                    statement211=statement();
                    _fsp--;

                    stream_statement.add(statement211.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: IF, statement, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1459:2: -> ^( IF expression ( statement )+ )
            {
                // JS.g:1459:5: ^( IF expression ( statement )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_IF.next(), root_1);

                adaptor.addChild(root_1, stream_expression.next());
                if ( !(stream_statement.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.next());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end ifStatement

    public static class iterationStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start iterationStatement
    // JS.g:1466:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );
    public final iterationStatement_return iterationStatement() throws RecognitionException {
        iterationStatement_return retval = new iterationStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        doStatement_return doStatement212 = null;

        whileStatement_return whileStatement213 = null;

        forEachStatement_return forEachStatement214 = null;

        forStatement_return forStatement215 = null;



        try {
            // JS.g:1467:2: ( doStatement | whileStatement | forEachStatement | forStatement )
            int alt54=4;
            switch ( input.LA(1) ) {
            case DO:
                {
                alt54=1;
                }
                break;
            case WHILE:
                {
                alt54=2;
                }
                break;
            case FOR:
                {
                int LA54_3 = input.LA(2);

                if ( (LA54_3==EACH) ) {
                    alt54=3;
                }
                else if ( (LA54_3==LPAREN) ) {
                    alt54=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1466:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );", 54, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1466:1: iterationStatement : ( doStatement | whileStatement | forEachStatement | forStatement );", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // JS.g:1467:4: doStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_doStatement_in_iterationStatement5473);
                    doStatement212=doStatement();
                    _fsp--;

                    adaptor.addChild(root_0, doStatement212.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1468:4: whileStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_iterationStatement5478);
                    whileStatement213=whileStatement();
                    _fsp--;

                    adaptor.addChild(root_0, whileStatement213.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1469:4: forEachStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forEachStatement_in_iterationStatement5483);
                    forEachStatement214=forEachStatement();
                    _fsp--;

                    adaptor.addChild(root_0, forEachStatement214.getTree());

                    }
                    break;
                case 4 :
                    // JS.g:1470:4: forStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forStatement_in_iterationStatement5488);
                    forStatement215=forStatement();
                    _fsp--;

                    adaptor.addChild(root_0, forStatement215.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end iterationStatement

    public static class doStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start doStatement
    // JS.g:1473:1: doStatement : DO statement WHILE LPAREN expression RPAREN semic -> ^( DO statement expression ) ;
    public final doStatement_return doStatement() throws RecognitionException {
        doStatement_return retval = new doStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DO216=null;
        Token WHILE218=null;
        Token LPAREN219=null;
        Token RPAREN221=null;
        statement_return statement217 = null;

        expression_return expression220 = null;

        semic_return semic222 = null;


        Object DO216_tree=null;
        Object WHILE218_tree=null;
        Object LPAREN219_tree=null;
        Object RPAREN221_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // JS.g:1474:2: ( DO statement WHILE LPAREN expression RPAREN semic -> ^( DO statement expression ) )
            // JS.g:1474:4: DO statement WHILE LPAREN expression RPAREN semic
            {
            DO216=(Token)input.LT(1);
            match(input,DO,FOLLOW_DO_in_doStatement5500); 
            stream_DO.add(DO216);

            pushFollow(FOLLOW_statement_in_doStatement5502);
            statement217=statement();
            _fsp--;

            stream_statement.add(statement217.getTree());
            WHILE218=(Token)input.LT(1);
            match(input,WHILE,FOLLOW_WHILE_in_doStatement5504); 
            stream_WHILE.add(WHILE218);

            LPAREN219=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_doStatement5506); 
            stream_LPAREN.add(LPAREN219);

            pushFollow(FOLLOW_expression_in_doStatement5508);
            expression220=expression();
            _fsp--;

            stream_expression.add(expression220.getTree());
            RPAREN221=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_doStatement5510); 
            stream_RPAREN.add(RPAREN221);

            pushFollow(FOLLOW_semic_in_doStatement5512);
            semic222=semic();
            _fsp--;

            stream_semic.add(semic222.getTree());

            // AST REWRITE
            // elements: DO, statement, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1475:2: -> ^( DO statement expression )
            {
                // JS.g:1475:5: ^( DO statement expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_DO.next(), root_1);

                adaptor.addChild(root_1, stream_statement.next());
                adaptor.addChild(root_1, stream_expression.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end doStatement

    public static class whileStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start whileStatement
    // JS.g:1478:1: whileStatement : WHILE LPAREN expression RPAREN statement ;
    public final whileStatement_return whileStatement() throws RecognitionException {
        whileStatement_return retval = new whileStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHILE223=null;
        Token LPAREN224=null;
        Token RPAREN226=null;
        expression_return expression225 = null;

        statement_return statement227 = null;


        Object WHILE223_tree=null;
        Object LPAREN224_tree=null;
        Object RPAREN226_tree=null;

        try {
            // JS.g:1479:2: ( WHILE LPAREN expression RPAREN statement )
            // JS.g:1479:4: WHILE LPAREN expression RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            WHILE223=(Token)input.LT(1);
            match(input,WHILE,FOLLOW_WHILE_in_whileStatement5537); 
            WHILE223_tree = (Object)adaptor.create(WHILE223);
            root_0 = (Object)adaptor.becomeRoot(WHILE223_tree, root_0);

            LPAREN224=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_whileStatement5540); 
            pushFollow(FOLLOW_expression_in_whileStatement5543);
            expression225=expression();
            _fsp--;

            adaptor.addChild(root_0, expression225.getTree());
            RPAREN226=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_whileStatement5545); 
            pushFollow(FOLLOW_statement_in_whileStatement5548);
            statement227=statement();
            _fsp--;

            adaptor.addChild(root_0, statement227.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end whileStatement

    public static class forEachStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start forEachStatement
    // JS.g:1524:1: forEachStatement : FOR EACH LPAREN forEachControl RPAREN statement -> ^( FOREACH forEachControl statement ) ;
    public final forEachStatement_return forEachStatement() throws RecognitionException {
        forEachStatement_return retval = new forEachStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOR228=null;
        Token EACH229=null;
        Token LPAREN230=null;
        Token RPAREN232=null;
        forEachControl_return forEachControl231 = null;

        statement_return statement233 = null;


        Object FOR228_tree=null;
        Object EACH229_tree=null;
        Object LPAREN230_tree=null;
        Object RPAREN232_tree=null;
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_EACH=new RewriteRuleTokenStream(adaptor,"token EACH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_forEachControl=new RewriteRuleSubtreeStream(adaptor,"rule forEachControl");
        try {
            // JS.g:1525:3: ( FOR EACH LPAREN forEachControl RPAREN statement -> ^( FOREACH forEachControl statement ) )
            // JS.g:1525:5: FOR EACH LPAREN forEachControl RPAREN statement
            {
            FOR228=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_forEachStatement5563); 
            stream_FOR.add(FOR228);

            EACH229=(Token)input.LT(1);
            match(input,EACH,FOLLOW_EACH_in_forEachStatement5565); 
            stream_EACH.add(EACH229);

            LPAREN230=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_forEachStatement5567); 
            stream_LPAREN.add(LPAREN230);

            pushFollow(FOLLOW_forEachControl_in_forEachStatement5569);
            forEachControl231=forEachControl();
            _fsp--;

            stream_forEachControl.add(forEachControl231.getTree());
            RPAREN232=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_forEachStatement5571); 
            stream_RPAREN.add(RPAREN232);

            pushFollow(FOLLOW_statement_in_forEachStatement5573);
            statement233=statement();
            _fsp--;

            stream_statement.add(statement233.getTree());

            // AST REWRITE
            // elements: statement, forEachControl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1526:4: -> ^( FOREACH forEachControl statement )
            {
                // JS.g:1526:7: ^( FOREACH forEachControl statement )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(FOREACH, "FOREACH"), root_1);

                adaptor.addChild(root_1, stream_forEachControl.next());
                adaptor.addChild(root_1, stream_statement.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end forEachStatement

    public static class forEachControl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start forEachControl
    // JS.g:1529:1: forEachControl : ( forControlVar | forControlExpression );
    public final forEachControl_return forEachControl() throws RecognitionException {
        forEachControl_return retval = new forEachControl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        forControlVar_return forControlVar234 = null;

        forControlExpression_return forControlExpression235 = null;



        try {
            // JS.g:1530:3: ( forControlVar | forControlExpression )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==VAR) ) {
                alt55=1;
            }
            else if ( ((LA55_0>=NULL && LA55_0<=FALSE)||LA55_0==DELETE||(LA55_0>=EACH && LA55_0<=FUNCTION)||LA55_0==NEW||LA55_0==THIS||LA55_0==TYPEOF||LA55_0==VOID||(LA55_0>=GET && LA55_0<=YIELD)||(LA55_0>=WXML && LA55_0<=NAMESPACE)||LA55_0==LBRACE||LA55_0==LPAREN||LA55_0==LBRACK||(LA55_0>=ADD && LA55_0<=SUB)||(LA55_0>=INC && LA55_0<=DEC)||(LA55_0>=NOT && LA55_0<=INV)||LA55_0==XMLLiteral||(LA55_0>=StringLiteral && LA55_0<=XmlAttribute)||LA55_0==Identifier||LA55_0==RegularExpressionLiteral||(LA55_0>=DecimalLiteral && LA55_0<=HexIntegerLiteral)) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1529:1: forEachControl : ( forControlVar | forControlExpression );", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // JS.g:1530:5: forControlVar
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlVar_in_forEachControl5600);
                    forControlVar234=forControlVar();
                    _fsp--;

                    adaptor.addChild(root_0, forControlVar234.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1531:5: forControlExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlExpression_in_forEachControl5606);
                    forControlExpression235=forControlExpression();
                    _fsp--;

                    adaptor.addChild(root_0, forControlExpression235.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end forEachControl

    public static class forStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start forStatement
    // JS.g:1534:1: forStatement : FOR LPAREN forControl RPAREN statement ;
    public final forStatement_return forStatement() throws RecognitionException {
        forStatement_return retval = new forStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOR236=null;
        Token LPAREN237=null;
        Token RPAREN239=null;
        forControl_return forControl238 = null;

        statement_return statement240 = null;


        Object FOR236_tree=null;
        Object LPAREN237_tree=null;
        Object RPAREN239_tree=null;

        try {
            // JS.g:1535:2: ( FOR LPAREN forControl RPAREN statement )
            // JS.g:1535:4: FOR LPAREN forControl RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            FOR236=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_forStatement5618); 
            FOR236_tree = (Object)adaptor.create(FOR236);
            root_0 = (Object)adaptor.becomeRoot(FOR236_tree, root_0);

            LPAREN237=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_forStatement5621); 
            pushFollow(FOLLOW_forControl_in_forStatement5624);
            forControl238=forControl();
            _fsp--;

            adaptor.addChild(root_0, forControl238.getTree());
            RPAREN239=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_forStatement5626); 
            pushFollow(FOLLOW_statement_in_forStatement5629);
            statement240=statement();
            _fsp--;

            adaptor.addChild(root_0, statement240.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end forStatement

    public static class forControl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start forControl
    // JS.g:1538:1: forControl : ( forControlVar | forControlExpression | forControlSemic );
    public final forControl_return forControl() throws RecognitionException {
        forControl_return retval = new forControl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        forControlVar_return forControlVar241 = null;

        forControlExpression_return forControlExpression242 = null;

        forControlSemic_return forControlSemic243 = null;



        try {
            // JS.g:1539:2: ( forControlVar | forControlExpression | forControlSemic )
            int alt56=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt56=1;
                }
                break;
            case NULL:
            case TRUE:
            case FALSE:
            case DELETE:
            case EACH:
            case FUNCTION:
            case NEW:
            case THIS:
            case TYPEOF:
            case VOID:
            case GET:
            case SET:
            case YIELD:
            case WXML:
            case NAMESPACE:
            case LBRACE:
            case LPAREN:
            case LBRACK:
            case ADD:
            case SUB:
            case INC:
            case DEC:
            case NOT:
            case INV:
            case XMLLiteral:
            case StringLiteral:
            case XmlAttribute:
            case Identifier:
            case RegularExpressionLiteral:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt56=2;
                }
                break;
            case SEMIC:
                {
                alt56=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1538:1: forControl : ( forControlVar | forControlExpression | forControlSemic );", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // JS.g:1539:4: forControlVar
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlVar_in_forControl5640);
                    forControlVar241=forControlVar();
                    _fsp--;

                    adaptor.addChild(root_0, forControlVar241.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1540:4: forControlExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlExpression_in_forControl5645);
                    forControlExpression242=forControlExpression();
                    _fsp--;

                    adaptor.addChild(root_0, forControlExpression242.getTree());

                    }
                    break;
                case 3 :
                    // JS.g:1541:4: forControlSemic
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlSemic_in_forControl5650);
                    forControlSemic243=forControlSemic();
                    _fsp--;

                    adaptor.addChild(root_0, forControlSemic243.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end forControl

    public static class forControlVar_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start forControlVar
    // JS.g:1544:1: forControlVar : VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) ) ;
    public final forControlVar_return forControlVar() throws RecognitionException {
        forControlVar_return retval = new forControlVar_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR244=null;
        Token IN246=null;
        Token COMMA248=null;
        Token SEMIC250=null;
        Token SEMIC251=null;
        expression_return ex1 = null;

        expression_return ex2 = null;

        variableDeclarationNoIn_return variableDeclarationNoIn245 = null;

        expression_return expression247 = null;

        variableDeclarationNoIn_return variableDeclarationNoIn249 = null;


        Object VAR244_tree=null;
        Object IN246_tree=null;
        Object COMMA248_tree=null;
        Object SEMIC250_tree=null;
        Object SEMIC251_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_variableDeclarationNoIn=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarationNoIn");
        try {
            // JS.g:1545:2: ( VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) ) )
            // JS.g:1545:4: VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )
            {
            VAR244=(Token)input.LT(1);
            match(input,VAR,FOLLOW_VAR_in_forControlVar5661); 
            stream_VAR.add(VAR244);

            pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar5663);
            variableDeclarationNoIn245=variableDeclarationNoIn();
            _fsp--;

            stream_variableDeclarationNoIn.add(variableDeclarationNoIn245.getTree());
            // JS.g:1546:2: ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==IN) ) {
                alt60=1;
            }
            else if ( ((LA60_0>=SEMIC && LA60_0<=COMMA)) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1546:2: ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // JS.g:1547:3: ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) )
                    {
                    // JS.g:1547:3: ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) )
                    // JS.g:1548:4: IN expression
                    {
                    IN246=(Token)input.LT(1);
                    match(input,IN,FOLLOW_IN_in_forControlVar5675); 
                    stream_IN.add(IN246);

                    pushFollow(FOLLOW_expression_in_forControlVar5677);
                    expression247=expression();
                    _fsp--;

                    stream_expression.add(expression247.getTree());

                    // AST REWRITE
                    // elements: expression, VAR, variableDeclarationNoIn
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1549:4: -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) )
                    {
                        // JS.g:1549:7: ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORITER, "FORITER"), root_1);

                        // JS.g:1549:18: ^( VAR variableDeclarationNoIn )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_VAR.next(), root_2);

                        adaptor.addChild(root_2, stream_variableDeclarationNoIn.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1549:51: ^( EXPR expression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_expression.next());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }


                    }
                    break;
                case 2 :
                    // JS.g:1552:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
                    {
                    // JS.g:1552:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
                    // JS.g:1553:4: ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )?
                    {
                    // JS.g:1553:4: ( COMMA variableDeclarationNoIn )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==COMMA) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // JS.g:1553:6: COMMA variableDeclarationNoIn
                    	    {
                    	    COMMA248=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_forControlVar5723); 
                    	    stream_COMMA.add(COMMA248);

                    	    pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar5725);
                    	    variableDeclarationNoIn249=variableDeclarationNoIn();
                    	    _fsp--;

                    	    stream_variableDeclarationNoIn.add(variableDeclarationNoIn249.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    SEMIC250=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar5730); 
                    stream_SEMIC.add(SEMIC250);

                    // JS.g:1553:48: (ex1= expression )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( ((LA58_0>=NULL && LA58_0<=FALSE)||LA58_0==DELETE||(LA58_0>=EACH && LA58_0<=FUNCTION)||LA58_0==NEW||LA58_0==THIS||LA58_0==TYPEOF||LA58_0==VOID||(LA58_0>=GET && LA58_0<=YIELD)||(LA58_0>=WXML && LA58_0<=NAMESPACE)||LA58_0==LBRACE||LA58_0==LPAREN||LA58_0==LBRACK||(LA58_0>=ADD && LA58_0<=SUB)||(LA58_0>=INC && LA58_0<=DEC)||(LA58_0>=NOT && LA58_0<=INV)||LA58_0==XMLLiteral||(LA58_0>=StringLiteral && LA58_0<=XmlAttribute)||LA58_0==Identifier||LA58_0==RegularExpressionLiteral||(LA58_0>=DecimalLiteral && LA58_0<=HexIntegerLiteral)) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // JS.g:1553:48: ex1= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar5734);
                            ex1=expression();
                            _fsp--;

                            stream_expression.add(ex1.getTree());

                            }
                            break;

                    }

                    SEMIC251=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar5737); 
                    stream_SEMIC.add(SEMIC251);

                    // JS.g:1553:70: (ex2= expression )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( ((LA59_0>=NULL && LA59_0<=FALSE)||LA59_0==DELETE||(LA59_0>=EACH && LA59_0<=FUNCTION)||LA59_0==NEW||LA59_0==THIS||LA59_0==TYPEOF||LA59_0==VOID||(LA59_0>=GET && LA59_0<=YIELD)||(LA59_0>=WXML && LA59_0<=NAMESPACE)||LA59_0==LBRACE||LA59_0==LPAREN||LA59_0==LBRACK||(LA59_0>=ADD && LA59_0<=SUB)||(LA59_0>=INC && LA59_0<=DEC)||(LA59_0>=NOT && LA59_0<=INV)||LA59_0==XMLLiteral||(LA59_0>=StringLiteral && LA59_0<=XmlAttribute)||LA59_0==Identifier||LA59_0==RegularExpressionLiteral||(LA59_0>=DecimalLiteral && LA59_0<=HexIntegerLiteral)) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // JS.g:1553:70: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar5741);
                            ex2=expression();
                            _fsp--;

                            stream_expression.add(ex2.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: variableDeclarationNoIn, VAR, ex2, ex1
                    // token labels: 
                    // rule labels: retval, ex2, ex1
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"token ex2",ex2!=null?ex2.tree:null);
                    RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"token ex1",ex1!=null?ex1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1554:4: -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                    {
                        // JS.g:1554:7: ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                        // JS.g:1554:18: ^( VAR ( variableDeclarationNoIn )+ )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_VAR.next(), root_2);

                        if ( !(stream_variableDeclarationNoIn.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_variableDeclarationNoIn.hasNext() ) {
                            adaptor.addChild(root_2, stream_variableDeclarationNoIn.next());

                        }
                        stream_variableDeclarationNoIn.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1554:52: ^( EXPR ( $ex1)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1554:60: ( $ex1)?
                        if ( stream_ex1.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex1.next());

                        }
                        stream_ex1.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1554:68: ^( EXPR ( $ex2)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1554:76: ( $ex2)?
                        if ( stream_ex2.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex2.next());

                        }
                        stream_ex2.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end forControlVar

    public static class forControlExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start forControlExpression
    // JS.g:1559:1: forControlExpression : ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) ) ;
    public final forControlExpression_return forControlExpression() throws RecognitionException {
        forControlExpression_return retval = new forControlExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IN252=null;
        Token SEMIC253=null;
        Token SEMIC254=null;
        expressionNoIn_return ex1 = null;

        expression_return ex2 = null;

        expression_return ex3 = null;


        Object IN252_tree=null;
        Object SEMIC253_tree=null;
        Object SEMIC254_tree=null;
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_expressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoIn");

        	Object[] isLhs = new Object[1];

        try {
            // JS.g:1564:2: (ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) ) )
            // JS.g:1564:4: ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )
            {
            pushFollow(FOLLOW_expressionNoIn_in_forControlExpression5807);
            ex1=expressionNoIn();
            _fsp--;

            stream_expressionNoIn.add(ex1.getTree());
            // JS.g:1565:2: ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==IN) ) {
                alt63=1;
            }
            else if ( (LA63_0==SEMIC) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1565:2: ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // JS.g:1566:3: {...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) )
                    {
                    if ( !( isLeftHandSideIn(ex1, isLhs) ) ) {
                        throw new FailedPredicateException(input, "forControlExpression", " isLeftHandSideIn(ex1, isLhs) ");
                    }
                    // JS.g:1566:37: ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) )
                    // JS.g:1567:4: IN ex2= expression
                    {
                    IN252=(Token)input.LT(1);
                    match(input,IN,FOLLOW_IN_in_forControlExpression5822); 
                    stream_IN.add(IN252);

                    pushFollow(FOLLOW_expression_in_forControlExpression5826);
                    ex2=expression();
                    _fsp--;

                    stream_expression.add(ex2.getTree());

                    // AST REWRITE
                    // elements: ex1, ex2
                    // token labels: 
                    // rule labels: retval, ex2, ex1
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"token ex2",ex2!=null?ex2.tree:null);
                    RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"token ex1",ex1!=null?ex1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1568:4: -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
                    {
                        // JS.g:1568:7: ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORITER, "FORITER"), root_1);

                        // JS.g:1568:18: ^( EXPR $ex1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex1.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1568:33: ^( EXPR $ex2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex2.next());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }


                    }
                    break;
                case 2 :
                    // JS.g:1571:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) )
                    {
                    // JS.g:1571:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) )
                    // JS.g:1572:4: SEMIC (ex2= expression )? SEMIC (ex3= expression )?
                    {
                    SEMIC253=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression5872); 
                    stream_SEMIC.add(SEMIC253);

                    // JS.g:1572:13: (ex2= expression )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( ((LA61_0>=NULL && LA61_0<=FALSE)||LA61_0==DELETE||(LA61_0>=EACH && LA61_0<=FUNCTION)||LA61_0==NEW||LA61_0==THIS||LA61_0==TYPEOF||LA61_0==VOID||(LA61_0>=GET && LA61_0<=YIELD)||(LA61_0>=WXML && LA61_0<=NAMESPACE)||LA61_0==LBRACE||LA61_0==LPAREN||LA61_0==LBRACK||(LA61_0>=ADD && LA61_0<=SUB)||(LA61_0>=INC && LA61_0<=DEC)||(LA61_0>=NOT && LA61_0<=INV)||LA61_0==XMLLiteral||(LA61_0>=StringLiteral && LA61_0<=XmlAttribute)||LA61_0==Identifier||LA61_0==RegularExpressionLiteral||(LA61_0>=DecimalLiteral && LA61_0<=HexIntegerLiteral)) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // JS.g:1572:13: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression5876);
                            ex2=expression();
                            _fsp--;

                            stream_expression.add(ex2.getTree());

                            }
                            break;

                    }

                    SEMIC254=(Token)input.LT(1);
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression5879); 
                    stream_SEMIC.add(SEMIC254);

                    // JS.g:1572:35: (ex3= expression )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( ((LA62_0>=NULL && LA62_0<=FALSE)||LA62_0==DELETE||(LA62_0>=EACH && LA62_0<=FUNCTION)||LA62_0==NEW||LA62_0==THIS||LA62_0==TYPEOF||LA62_0==VOID||(LA62_0>=GET && LA62_0<=YIELD)||(LA62_0>=WXML && LA62_0<=NAMESPACE)||LA62_0==LBRACE||LA62_0==LPAREN||LA62_0==LBRACK||(LA62_0>=ADD && LA62_0<=SUB)||(LA62_0>=INC && LA62_0<=DEC)||(LA62_0>=NOT && LA62_0<=INV)||LA62_0==XMLLiteral||(LA62_0>=StringLiteral && LA62_0<=XmlAttribute)||LA62_0==Identifier||LA62_0==RegularExpressionLiteral||(LA62_0>=DecimalLiteral && LA62_0<=HexIntegerLiteral)) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // JS.g:1572:35: ex3= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression5883);
                            ex3=expression();
                            _fsp--;

                            stream_expression.add(ex3.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ex2, ex1, ex3
                    // token labels: 
                    // rule labels: retval, ex3, ex2, ex1
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ex3=new RewriteRuleSubtreeStream(adaptor,"token ex3",ex3!=null?ex3.tree:null);
                    RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"token ex2",ex2!=null?ex2.tree:null);
                    RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"token ex1",ex1!=null?ex1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1573:4: -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) )
                    {
                        // JS.g:1573:7: ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                        // JS.g:1573:18: ^( EXPR $ex1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex1.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1573:33: ^( EXPR ( $ex2)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1573:41: ( $ex2)?
                        if ( stream_ex2.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex2.next());

                        }
                        stream_ex2.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // JS.g:1573:49: ^( EXPR ( $ex3)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                        // JS.g:1573:57: ( $ex3)?
                        if ( stream_ex3.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex3.next());

                        }
                        stream_ex3.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end forControlExpression

    public static class forControlSemic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start forControlSemic
    // JS.g:1578:1: forControlSemic : SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ;
    public final forControlSemic_return forControlSemic() throws RecognitionException {
        forControlSemic_return retval = new forControlSemic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC255=null;
        Token SEMIC256=null;
        expression_return ex1 = null;

        expression_return ex2 = null;


        Object SEMIC255_tree=null;
        Object SEMIC256_tree=null;
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // JS.g:1579:2: ( SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
            // JS.g:1579:4: SEMIC (ex1= expression )? SEMIC (ex2= expression )?
            {
            SEMIC255=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic5942); 
            stream_SEMIC.add(SEMIC255);

            // JS.g:1579:13: (ex1= expression )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=NULL && LA64_0<=FALSE)||LA64_0==DELETE||(LA64_0>=EACH && LA64_0<=FUNCTION)||LA64_0==NEW||LA64_0==THIS||LA64_0==TYPEOF||LA64_0==VOID||(LA64_0>=GET && LA64_0<=YIELD)||(LA64_0>=WXML && LA64_0<=NAMESPACE)||LA64_0==LBRACE||LA64_0==LPAREN||LA64_0==LBRACK||(LA64_0>=ADD && LA64_0<=SUB)||(LA64_0>=INC && LA64_0<=DEC)||(LA64_0>=NOT && LA64_0<=INV)||LA64_0==XMLLiteral||(LA64_0>=StringLiteral && LA64_0<=XmlAttribute)||LA64_0==Identifier||LA64_0==RegularExpressionLiteral||(LA64_0>=DecimalLiteral && LA64_0<=HexIntegerLiteral)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // JS.g:1579:13: ex1= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic5946);
                    ex1=expression();
                    _fsp--;

                    stream_expression.add(ex1.getTree());

                    }
                    break;

            }

            SEMIC256=(Token)input.LT(1);
            match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic5949); 
            stream_SEMIC.add(SEMIC256);

            // JS.g:1579:35: (ex2= expression )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=NULL && LA65_0<=FALSE)||LA65_0==DELETE||(LA65_0>=EACH && LA65_0<=FUNCTION)||LA65_0==NEW||LA65_0==THIS||LA65_0==TYPEOF||LA65_0==VOID||(LA65_0>=GET && LA65_0<=YIELD)||(LA65_0>=WXML && LA65_0<=NAMESPACE)||LA65_0==LBRACE||LA65_0==LPAREN||LA65_0==LBRACK||(LA65_0>=ADD && LA65_0<=SUB)||(LA65_0>=INC && LA65_0<=DEC)||(LA65_0>=NOT && LA65_0<=INV)||LA65_0==XMLLiteral||(LA65_0>=StringLiteral && LA65_0<=XmlAttribute)||LA65_0==Identifier||LA65_0==RegularExpressionLiteral||(LA65_0>=DecimalLiteral && LA65_0<=HexIntegerLiteral)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // JS.g:1579:35: ex2= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic5953);
                    ex2=expression();
                    _fsp--;

                    stream_expression.add(ex2.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: ex2, ex1
            // token labels: 
            // rule labels: retval, ex2, ex1
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"token ex2",ex2!=null?ex2.tree:null);
            RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"token ex1",ex1!=null?ex1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1580:2: -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
            {
                // JS.g:1580:5: ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(FORSTEP, "FORSTEP"), root_1);

                // JS.g:1580:16: ^( EXPR )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // JS.g:1580:26: ^( EXPR ( $ex1)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                // JS.g:1580:34: ( $ex1)?
                if ( stream_ex1.hasNext() ) {
                    adaptor.addChild(root_2, stream_ex1.next());

                }
                stream_ex1.reset();

                adaptor.addChild(root_1, root_2);
                }
                // JS.g:1580:42: ^( EXPR ( $ex2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_2);

                // JS.g:1580:50: ( $ex2)?
                if ( stream_ex2.hasNext() ) {
                    adaptor.addChild(root_2, stream_ex2.next());

                }
                stream_ex2.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end forControlSemic

    public static class continueStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start continueStatement
    // JS.g:1592:1: continueStatement : CONTINUE ( Identifier )? semic ;
    public final continueStatement_return continueStatement() throws RecognitionException {
        continueStatement_return retval = new continueStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONTINUE257=null;
        Token Identifier258=null;
        semic_return semic259 = null;


        Object CONTINUE257_tree=null;
        Object Identifier258_tree=null;

        try {
            // JS.g:1593:2: ( CONTINUE ( Identifier )? semic )
            // JS.g:1593:4: CONTINUE ( Identifier )? semic
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE257=(Token)input.LT(1);
            match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStatement6007); 
            CONTINUE257_tree = (Object)adaptor.create(CONTINUE257);
            root_0 = (Object)adaptor.becomeRoot(CONTINUE257_tree, root_0);

             if (input.LA(1) == Identifier) promoteEOL(null); 
            // JS.g:1593:67: ( Identifier )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==Identifier) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // JS.g:1593:67: Identifier
                    {
                    Identifier258=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_continueStatement6012); 
                    Identifier258_tree = (Object)adaptor.create(Identifier258);
                    adaptor.addChild(root_0, Identifier258_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_continueStatement6015);
            semic259=semic();
            _fsp--;


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end continueStatement

    public static class breakStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start breakStatement
    // JS.g:1605:1: breakStatement : BREAK ( Identifier )? semic ;
    public final breakStatement_return breakStatement() throws RecognitionException {
        breakStatement_return retval = new breakStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BREAK260=null;
        Token Identifier261=null;
        semic_return semic262 = null;


        Object BREAK260_tree=null;
        Object Identifier261_tree=null;

        try {
            // JS.g:1606:2: ( BREAK ( Identifier )? semic )
            // JS.g:1606:4: BREAK ( Identifier )? semic
            {
            root_0 = (Object)adaptor.nil();

            BREAK260=(Token)input.LT(1);
            match(input,BREAK,FOLLOW_BREAK_in_breakStatement6034); 
            BREAK260_tree = (Object)adaptor.create(BREAK260);
            root_0 = (Object)adaptor.becomeRoot(BREAK260_tree, root_0);

             if (input.LA(1) == Identifier) promoteEOL(null); 
            // JS.g:1606:64: ( Identifier )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==Identifier) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // JS.g:1606:64: Identifier
                    {
                    Identifier261=(Token)input.LT(1);
                    match(input,Identifier,FOLLOW_Identifier_in_breakStatement6039); 
                    Identifier261_tree = (Object)adaptor.create(Identifier261);
                    adaptor.addChild(root_0, Identifier261_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_breakStatement6042);
            semic262=semic();
            _fsp--;


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end breakStatement

    public static class returnStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start returnStatement
    // JS.g:1626:1: returnStatement : RETURN ( expression )? semic ;
    public final returnStatement_return returnStatement() throws RecognitionException {
        returnStatement_return retval = new returnStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RETURN263=null;
        expression_return expression264 = null;

        semic_return semic265 = null;


        Object RETURN263_tree=null;

        try {
            // JS.g:1627:2: ( RETURN ( expression )? semic )
            // JS.g:1627:4: RETURN ( expression )? semic
            {
            root_0 = (Object)adaptor.nil();

            RETURN263=(Token)input.LT(1);
            match(input,RETURN,FOLLOW_RETURN_in_returnStatement6061); 
            RETURN263_tree = (Object)adaptor.create(RETURN263);
            root_0 = (Object)adaptor.becomeRoot(RETURN263_tree, root_0);

             promoteEOL(null); 
            // JS.g:1627:34: ( expression )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=NULL && LA68_0<=FALSE)||LA68_0==DELETE||(LA68_0>=EACH && LA68_0<=FUNCTION)||LA68_0==NEW||LA68_0==THIS||LA68_0==TYPEOF||LA68_0==VOID||(LA68_0>=GET && LA68_0<=YIELD)||(LA68_0>=WXML && LA68_0<=NAMESPACE)||LA68_0==LBRACE||LA68_0==LPAREN||LA68_0==LBRACK||(LA68_0>=ADD && LA68_0<=SUB)||(LA68_0>=INC && LA68_0<=DEC)||(LA68_0>=NOT && LA68_0<=INV)||LA68_0==XMLLiteral||(LA68_0>=StringLiteral && LA68_0<=XmlAttribute)||LA68_0==Identifier||LA68_0==RegularExpressionLiteral||(LA68_0>=DecimalLiteral && LA68_0<=HexIntegerLiteral)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // JS.g:1627:34: expression
                    {
                    pushFollow(FOLLOW_expression_in_returnStatement6066);
                    expression264=expression();
                    _fsp--;

                    adaptor.addChild(root_0, expression264.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_returnStatement6069);
            semic265=semic();
            _fsp--;


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end returnStatement

    public static class withStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start withStatement
    // JS.g:1634:1: withStatement : WITH LPAREN expression RPAREN statement ;
    public final withStatement_return withStatement() throws RecognitionException {
        withStatement_return retval = new withStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WITH266=null;
        Token LPAREN267=null;
        Token RPAREN269=null;
        expression_return expression268 = null;

        statement_return statement270 = null;


        Object WITH266_tree=null;
        Object LPAREN267_tree=null;
        Object RPAREN269_tree=null;

        try {
            // JS.g:1635:2: ( WITH LPAREN expression RPAREN statement )
            // JS.g:1635:4: WITH LPAREN expression RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            WITH266=(Token)input.LT(1);
            match(input,WITH,FOLLOW_WITH_in_withStatement6086); 
            WITH266_tree = (Object)adaptor.create(WITH266);
            root_0 = (Object)adaptor.becomeRoot(WITH266_tree, root_0);

            LPAREN267=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_withStatement6089); 
            pushFollow(FOLLOW_expression_in_withStatement6092);
            expression268=expression();
            _fsp--;

            adaptor.addChild(root_0, expression268.getTree());
            RPAREN269=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_withStatement6094); 
            pushFollow(FOLLOW_statement_in_withStatement6097);
            statement270=statement();
            _fsp--;

            adaptor.addChild(root_0, statement270.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end withStatement

    public static class switchStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start switchStatement
    // JS.g:1642:1: switchStatement : SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )? ( caseClause )* ) ;
    public final switchStatement_return switchStatement() throws RecognitionException {
        switchStatement_return retval = new switchStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SWITCH271=null;
        Token LPAREN272=null;
        Token RPAREN274=null;
        Token LBRACE275=null;
        Token RBRACE278=null;
        expression_return expression273 = null;

        defaultClause_return defaultClause276 = null;

        caseClause_return caseClause277 = null;


        Object SWITCH271_tree=null;
        Object LPAREN272_tree=null;
        Object RPAREN274_tree=null;
        Object LBRACE275_tree=null;
        Object RBRACE278_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_caseClause=new RewriteRuleSubtreeStream(adaptor,"rule caseClause");
        RewriteRuleSubtreeStream stream_defaultClause=new RewriteRuleSubtreeStream(adaptor,"rule defaultClause");

        	int defaultClauseCount = 0;

        try {
            // JS.g:1647:2: ( SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )? ( caseClause )* ) )
            // JS.g:1647:4: SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE
            {
            SWITCH271=(Token)input.LT(1);
            match(input,SWITCH,FOLLOW_SWITCH_in_switchStatement6118); 
            stream_SWITCH.add(SWITCH271);

            LPAREN272=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_switchStatement6120); 
            stream_LPAREN.add(LPAREN272);

            pushFollow(FOLLOW_expression_in_switchStatement6122);
            expression273=expression();
            _fsp--;

            stream_expression.add(expression273.getTree());
            RPAREN274=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_switchStatement6124); 
            stream_RPAREN.add(RPAREN274);

            LBRACE275=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_switchStatement6126); 
            stream_LBRACE.add(LBRACE275);

            // JS.g:1647:43: ({...}? => defaultClause | caseClause )*
            loop69:
            do {
                int alt69=3;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==DEFAULT) && ( defaultClauseCount == 0 )) {
                    alt69=1;
                }
                else if ( (LA69_0==CASE) ) {
                    alt69=2;
                }


                switch (alt69) {
            	case 1 :
            	    // JS.g:1647:45: {...}? => defaultClause
            	    {
            	    if ( !( defaultClauseCount == 0 ) ) {
            	        throw new FailedPredicateException(input, "switchStatement", " defaultClauseCount == 0 ");
            	    }
            	    pushFollow(FOLLOW_defaultClause_in_switchStatement6133);
            	    defaultClause276=defaultClause();
            	    _fsp--;

            	    stream_defaultClause.add(defaultClause276.getTree());
            	     defaultClauseCount++; 

            	    }
            	    break;
            	case 2 :
            	    // JS.g:1647:118: caseClause
            	    {
            	    pushFollow(FOLLOW_caseClause_in_switchStatement6139);
            	    caseClause277=caseClause();
            	    _fsp--;

            	    stream_caseClause.add(caseClause277.getTree());

            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            RBRACE278=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_switchStatement6144); 
            stream_RBRACE.add(RBRACE278);


            // AST REWRITE
            // elements: caseClause, defaultClause, expression, SWITCH
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1648:2: -> ^( SWITCH expression ( defaultClause )? ( caseClause )* )
            {
                // JS.g:1648:5: ^( SWITCH expression ( defaultClause )? ( caseClause )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_SWITCH.next(), root_1);

                adaptor.addChild(root_1, stream_expression.next());
                // JS.g:1648:26: ( defaultClause )?
                if ( stream_defaultClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_defaultClause.next());

                }
                stream_defaultClause.reset();
                // JS.g:1648:41: ( caseClause )*
                while ( stream_caseClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_caseClause.next());

                }
                stream_caseClause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end switchStatement

    public static class caseClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start caseClause
    // JS.g:1651:1: caseClause : CASE expression COLON ( statement )* ;
    public final caseClause_return caseClause() throws RecognitionException {
        caseClause_return retval = new caseClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CASE279=null;
        Token COLON281=null;
        expression_return expression280 = null;

        statement_return statement282 = null;


        Object CASE279_tree=null;
        Object COLON281_tree=null;

        try {
            // JS.g:1652:2: ( CASE expression COLON ( statement )* )
            // JS.g:1652:4: CASE expression COLON ( statement )*
            {
            root_0 = (Object)adaptor.nil();

            CASE279=(Token)input.LT(1);
            match(input,CASE,FOLLOW_CASE_in_caseClause6172); 
            CASE279_tree = (Object)adaptor.create(CASE279);
            root_0 = (Object)adaptor.becomeRoot(CASE279_tree, root_0);

            pushFollow(FOLLOW_expression_in_caseClause6175);
            expression280=expression();
            _fsp--;

            adaptor.addChild(root_0, expression280.getTree());
            COLON281=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_caseClause6177); 
            // JS.g:1652:28: ( statement )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==DEFAULT) ) {
                    int LA70_2 = input.LA(2);

                    if ( (LA70_2==WXML) ) {
                        alt70=1;
                    }


                }
                else if ( ((LA70_0>=NULL && LA70_0<=BREAK)||LA70_0==CONTINUE||(LA70_0>=DELETE && LA70_0<=DO)||(LA70_0>=FOR && LA70_0<=IF)||(LA70_0>=NEW && LA70_0<=YIELD)||(LA70_0>=WXML && LA70_0<=NAMESPACE)||LA70_0==CONST||LA70_0==LBRACE||LA70_0==LPAREN||LA70_0==LBRACK||LA70_0==SEMIC||(LA70_0>=ADD && LA70_0<=SUB)||(LA70_0>=INC && LA70_0<=DEC)||(LA70_0>=NOT && LA70_0<=INV)||LA70_0==XMLLiteral||(LA70_0>=StringLiteral && LA70_0<=XmlAttribute)||LA70_0==Identifier||LA70_0==RegularExpressionLiteral||(LA70_0>=DecimalLiteral && LA70_0<=HexIntegerLiteral)) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // JS.g:1652:28: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_caseClause6180);
            	    statement282=statement();
            	    _fsp--;

            	    adaptor.addChild(root_0, statement282.getTree());

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end caseClause

    public static class defaultClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start defaultClause
    // JS.g:1655:1: defaultClause : DEFAULT COLON ( statement )* ;
    public final defaultClause_return defaultClause() throws RecognitionException {
        defaultClause_return retval = new defaultClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT283=null;
        Token COLON284=null;
        statement_return statement285 = null;


        Object DEFAULT283_tree=null;
        Object COLON284_tree=null;

        try {
            // JS.g:1656:2: ( DEFAULT COLON ( statement )* )
            // JS.g:1656:4: DEFAULT COLON ( statement )*
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT283=(Token)input.LT(1);
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultClause6193); 
            DEFAULT283_tree = (Object)adaptor.create(DEFAULT283);
            root_0 = (Object)adaptor.becomeRoot(DEFAULT283_tree, root_0);

            COLON284=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_defaultClause6196); 
            // JS.g:1656:20: ( statement )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==DEFAULT) ) {
                    int LA71_2 = input.LA(2);

                    if ( (LA71_2==WXML) ) {
                        alt71=1;
                    }


                }
                else if ( ((LA71_0>=NULL && LA71_0<=BREAK)||LA71_0==CONTINUE||(LA71_0>=DELETE && LA71_0<=DO)||(LA71_0>=FOR && LA71_0<=IF)||(LA71_0>=NEW && LA71_0<=YIELD)||(LA71_0>=WXML && LA71_0<=NAMESPACE)||LA71_0==CONST||LA71_0==LBRACE||LA71_0==LPAREN||LA71_0==LBRACK||LA71_0==SEMIC||(LA71_0>=ADD && LA71_0<=SUB)||(LA71_0>=INC && LA71_0<=DEC)||(LA71_0>=NOT && LA71_0<=INV)||LA71_0==XMLLiteral||(LA71_0>=StringLiteral && LA71_0<=XmlAttribute)||LA71_0==Identifier||LA71_0==RegularExpressionLiteral||(LA71_0>=DecimalLiteral && LA71_0<=HexIntegerLiteral)) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // JS.g:1656:20: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultClause6199);
            	    statement285=statement();
            	    _fsp--;

            	    adaptor.addChild(root_0, statement285.getTree());

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end defaultClause

    public static class labelledStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start labelledStatement
    // JS.g:1663:1: labelledStatement : identifier COLON statement -> ^( LABELLED identifier statement ) ;
    public final labelledStatement_return labelledStatement() throws RecognitionException {
        labelledStatement_return retval = new labelledStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON287=null;
        identifier_return identifier286 = null;

        statement_return statement288 = null;


        Object COLON287_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:1664:2: ( identifier COLON statement -> ^( LABELLED identifier statement ) )
            // JS.g:1664:4: identifier COLON statement
            {
            pushFollow(FOLLOW_identifier_in_labelledStatement6216);
            identifier286=identifier();
            _fsp--;

            stream_identifier.add(identifier286.getTree());
            COLON287=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_labelledStatement6218); 
            stream_COLON.add(COLON287);

            pushFollow(FOLLOW_statement_in_labelledStatement6220);
            statement288=statement();
            _fsp--;

            stream_statement.add(statement288.getTree());

            // AST REWRITE
            // elements: identifier, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1665:2: -> ^( LABELLED identifier statement )
            {
                // JS.g:1665:5: ^( LABELLED identifier statement )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(LABELLED, "LABELLED"), root_1);

                adaptor.addChild(root_1, stream_identifier.next());
                adaptor.addChild(root_1, stream_statement.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end labelledStatement

    public static class throwStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start throwStatement
    // JS.g:1687:1: throwStatement : THROW expression semic ;
    public final throwStatement_return throwStatement() throws RecognitionException {
        throwStatement_return retval = new throwStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THROW289=null;
        expression_return expression290 = null;

        semic_return semic291 = null;


        Object THROW289_tree=null;

        try {
            // JS.g:1688:2: ( THROW expression semic )
            // JS.g:1688:4: THROW expression semic
            {
            root_0 = (Object)adaptor.nil();

            THROW289=(Token)input.LT(1);
            match(input,THROW,FOLLOW_THROW_in_throwStatement6251); 
            THROW289_tree = (Object)adaptor.create(THROW289);
            root_0 = (Object)adaptor.becomeRoot(THROW289_tree, root_0);

             promoteEOL(null); 
            pushFollow(FOLLOW_expression_in_throwStatement6256);
            expression290=expression();
            _fsp--;

            adaptor.addChild(root_0, expression290.getTree());
            pushFollow(FOLLOW_semic_in_throwStatement6258);
            semic291=semic();
            _fsp--;


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end throwStatement

    public static class tryStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start tryStatement
    // JS.g:1695:1: tryStatement : TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause ) ;
    public final tryStatement_return tryStatement() throws RecognitionException {
        tryStatement_return retval = new tryStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TRY292=null;
        block_return block293 = null;

        catchClause_return catchClause294 = null;

        finallyClause_return finallyClause295 = null;

        finallyClause_return finallyClause296 = null;


        Object TRY292_tree=null;

        try {
            // JS.g:1696:2: ( TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause ) )
            // JS.g:1696:4: TRY block ( ( catchClause )+ ( finallyClause )? | finallyClause )
            {
            root_0 = (Object)adaptor.nil();

            TRY292=(Token)input.LT(1);
            match(input,TRY,FOLLOW_TRY_in_tryStatement6275); 
            TRY292_tree = (Object)adaptor.create(TRY292);
            root_0 = (Object)adaptor.becomeRoot(TRY292_tree, root_0);

            pushFollow(FOLLOW_block_in_tryStatement6278);
            block293=block();
            _fsp--;

            adaptor.addChild(root_0, block293.getTree());
            // JS.g:1696:15: ( ( catchClause )+ ( finallyClause )? | finallyClause )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==CATCH) ) {
                alt74=1;
            }
            else if ( (LA74_0==FINALLY) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1696:15: ( ( catchClause )+ ( finallyClause )? | finallyClause )", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // JS.g:1696:17: ( catchClause )+ ( finallyClause )?
                    {
                    // JS.g:1696:17: ( catchClause )+
                    int cnt72=0;
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==CATCH) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // JS.g:1696:17: catchClause
                    	    {
                    	    pushFollow(FOLLOW_catchClause_in_tryStatement6282);
                    	    catchClause294=catchClause();
                    	    _fsp--;

                    	    adaptor.addChild(root_0, catchClause294.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt72 >= 1 ) break loop72;
                                EarlyExitException eee =
                                    new EarlyExitException(72, input);
                                throw eee;
                        }
                        cnt72++;
                    } while (true);

                    // JS.g:1696:30: ( finallyClause )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==FINALLY) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // JS.g:1696:30: finallyClause
                            {
                            pushFollow(FOLLOW_finallyClause_in_tryStatement6285);
                            finallyClause295=finallyClause();
                            _fsp--;

                            adaptor.addChild(root_0, finallyClause295.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // JS.g:1696:47: finallyClause
                    {
                    pushFollow(FOLLOW_finallyClause_in_tryStatement6290);
                    finallyClause296=finallyClause();
                    _fsp--;

                    adaptor.addChild(root_0, finallyClause296.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end tryStatement

    public static class catchClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start catchClause
    // JS.g:1699:1: catchClause : CATCH LPAREN identifier ( catchFilter )? RPAREN block ;
    public final catchClause_return catchClause() throws RecognitionException {
        catchClause_return retval = new catchClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CATCH297=null;
        Token LPAREN298=null;
        Token RPAREN301=null;
        identifier_return identifier299 = null;

        catchFilter_return catchFilter300 = null;

        block_return block302 = null;


        Object CATCH297_tree=null;
        Object LPAREN298_tree=null;
        Object RPAREN301_tree=null;

        try {
            // JS.g:1700:2: ( CATCH LPAREN identifier ( catchFilter )? RPAREN block )
            // JS.g:1700:4: CATCH LPAREN identifier ( catchFilter )? RPAREN block
            {
            root_0 = (Object)adaptor.nil();

            CATCH297=(Token)input.LT(1);
            match(input,CATCH,FOLLOW_CATCH_in_catchClause6304); 
            CATCH297_tree = (Object)adaptor.create(CATCH297);
            root_0 = (Object)adaptor.becomeRoot(CATCH297_tree, root_0);

            LPAREN298=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_catchClause6307); 
            pushFollow(FOLLOW_identifier_in_catchClause6310);
            identifier299=identifier();
            _fsp--;

            adaptor.addChild(root_0, identifier299.getTree());
            // JS.g:1700:30: ( catchFilter )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==IF) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // JS.g:1700:30: catchFilter
                    {
                    pushFollow(FOLLOW_catchFilter_in_catchClause6312);
                    catchFilter300=catchFilter();
                    _fsp--;

                    adaptor.addChild(root_0, catchFilter300.getTree());

                    }
                    break;

            }

            RPAREN301=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_catchClause6315); 
            pushFollow(FOLLOW_block_in_catchClause6318);
            block302=block();
            _fsp--;

            adaptor.addChild(root_0, block302.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end catchClause

    public static class catchFilter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start catchFilter
    // JS.g:1703:1: catchFilter : IF instanceofExpression ;
    public final catchFilter_return catchFilter() throws RecognitionException {
        catchFilter_return retval = new catchFilter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF303=null;
        instanceofExpression_return instanceofExpression304 = null;


        Object IF303_tree=null;

        try {
            // JS.g:1704:3: ( IF instanceofExpression )
            // JS.g:1704:5: IF instanceofExpression
            {
            root_0 = (Object)adaptor.nil();

            IF303=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_catchFilter6331); 
            IF303_tree = (Object)adaptor.create(IF303);
            root_0 = (Object)adaptor.becomeRoot(IF303_tree, root_0);

            pushFollow(FOLLOW_instanceofExpression_in_catchFilter6334);
            instanceofExpression304=instanceofExpression();
            _fsp--;

            adaptor.addChild(root_0, instanceofExpression304.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end catchFilter

    public static class instanceofExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start instanceofExpression
    // JS.g:1707:1: instanceofExpression : identifier INSTANCEOF identifier ;
    public final instanceofExpression_return instanceofExpression() throws RecognitionException {
        instanceofExpression_return retval = new instanceofExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSTANCEOF306=null;
        identifier_return identifier305 = null;

        identifier_return identifier307 = null;


        Object INSTANCEOF306_tree=null;

        try {
            // JS.g:1708:3: ( identifier INSTANCEOF identifier )
            // JS.g:1708:5: identifier INSTANCEOF identifier
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_instanceofExpression6349);
            identifier305=identifier();
            _fsp--;

            adaptor.addChild(root_0, identifier305.getTree());
            INSTANCEOF306=(Token)input.LT(1);
            match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_instanceofExpression6351); 
            INSTANCEOF306_tree = (Object)adaptor.create(INSTANCEOF306);
            root_0 = (Object)adaptor.becomeRoot(INSTANCEOF306_tree, root_0);

            pushFollow(FOLLOW_identifier_in_instanceofExpression6354);
            identifier307=identifier();
            _fsp--;

            adaptor.addChild(root_0, identifier307.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end instanceofExpression

    public static class finallyClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start finallyClause
    // JS.g:1711:1: finallyClause : FINALLY block ;
    public final finallyClause_return finallyClause() throws RecognitionException {
        finallyClause_return retval = new finallyClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FINALLY308=null;
        block_return block309 = null;


        Object FINALLY308_tree=null;

        try {
            // JS.g:1712:2: ( FINALLY block )
            // JS.g:1712:4: FINALLY block
            {
            root_0 = (Object)adaptor.nil();

            FINALLY308=(Token)input.LT(1);
            match(input,FINALLY,FOLLOW_FINALLY_in_finallyClause6367); 
            FINALLY308_tree = (Object)adaptor.create(FINALLY308);
            root_0 = (Object)adaptor.becomeRoot(FINALLY308_tree, root_0);

            pushFollow(FOLLOW_block_in_finallyClause6370);
            block309=block();
            _fsp--;

            adaptor.addChild(root_0, block309.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end finallyClause

    public static class functionDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start functionDeclaration
    // JS.g:1725:1: functionDeclaration : FUNCTION name= identifier formalParameterList functionBody -> ^( FUNCTION ( $name)? formalParameterList ( functionBody )? ) ;
    public final functionDeclaration_return functionDeclaration() throws RecognitionException {
        functionDeclaration_return retval = new functionDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FUNCTION310=null;
        identifier_return name = null;

        formalParameterList_return formalParameterList311 = null;

        functionBody_return functionBody312 = null;


        Object FUNCTION310_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // JS.g:1726:2: ( FUNCTION name= identifier formalParameterList functionBody -> ^( FUNCTION ( $name)? formalParameterList ( functionBody )? ) )
            // JS.g:1726:4: FUNCTION name= identifier formalParameterList functionBody
            {
            FUNCTION310=(Token)input.LT(1);
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDeclaration6391); 
            stream_FUNCTION.add(FUNCTION310);

            pushFollow(FOLLOW_identifier_in_functionDeclaration6395);
            name=identifier();
            _fsp--;

            stream_identifier.add(name.getTree());
            pushFollow(FOLLOW_formalParameterList_in_functionDeclaration6397);
            formalParameterList311=formalParameterList();
            _fsp--;

            stream_formalParameterList.add(formalParameterList311.getTree());
            pushFollow(FOLLOW_functionBody_in_functionDeclaration6399);
            functionBody312=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody312.getTree());

            // AST REWRITE
            // elements: functionBody, name, FUNCTION, formalParameterList
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"token name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1727:2: -> ^( FUNCTION ( $name)? formalParameterList ( functionBody )? )
            {
                // JS.g:1727:5: ^( FUNCTION ( $name)? formalParameterList ( functionBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.next(), root_1);

                // JS.g:1727:17: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.next());

                }
                stream_name.reset();
                adaptor.addChild(root_1, stream_formalParameterList.next());
                // JS.g:1727:44: ( functionBody )?
                if ( stream_functionBody.hasNext() ) {
                    adaptor.addChild(root_1, stream_functionBody.next());

                }
                stream_functionBody.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end functionDeclaration

    public static class functionExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start functionExpression
    // JS.g:1730:1: functionExpression : FUNCTION (name= identifier )? formalParameterList functionBody -> ^( FUNCTION ( $name)? formalParameterList ( functionBody )? ) ;
    public final functionExpression_return functionExpression() throws RecognitionException {
        functionExpression_return retval = new functionExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FUNCTION313=null;
        identifier_return name = null;

        formalParameterList_return formalParameterList314 = null;

        functionBody_return functionBody315 = null;


        Object FUNCTION313_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // JS.g:1731:2: ( FUNCTION (name= identifier )? formalParameterList functionBody -> ^( FUNCTION ( $name)? formalParameterList ( functionBody )? ) )
            // JS.g:1731:4: FUNCTION (name= identifier )? formalParameterList functionBody
            {
            FUNCTION313=(Token)input.LT(1);
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionExpression6428); 
            stream_FUNCTION.add(FUNCTION313);

            // JS.g:1731:17: (name= identifier )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==EACH||(LA76_0>=GET && LA76_0<=SET)||(LA76_0>=WXML && LA76_0<=NAMESPACE)||LA76_0==Identifier) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // JS.g:1731:17: name= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_functionExpression6432);
                    name=identifier();
                    _fsp--;

                    stream_identifier.add(name.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_formalParameterList_in_functionExpression6435);
            formalParameterList314=formalParameterList();
            _fsp--;

            stream_formalParameterList.add(formalParameterList314.getTree());
            pushFollow(FOLLOW_functionBody_in_functionExpression6437);
            functionBody315=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody315.getTree());

            // AST REWRITE
            // elements: name, functionBody, formalParameterList, FUNCTION
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"token name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1732:2: -> ^( FUNCTION ( $name)? formalParameterList ( functionBody )? )
            {
                // JS.g:1732:5: ^( FUNCTION ( $name)? formalParameterList ( functionBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.next(), root_1);

                // JS.g:1732:17: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.next());

                }
                stream_name.reset();
                adaptor.addChild(root_1, stream_formalParameterList.next());
                // JS.g:1732:44: ( functionBody )?
                if ( stream_functionBody.hasNext() ) {
                    adaptor.addChild(root_1, stream_functionBody.next());

                }
                stream_functionBody.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end functionExpression

    public static class formalParameterList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start formalParameterList
    // JS.g:1735:1: formalParameterList : LPAREN (args+= identifier ( COMMA args+= identifier )* )? RPAREN -> ^( ARGS ( $args)* ) ;
    public final formalParameterList_return formalParameterList() throws RecognitionException {
        formalParameterList_return retval = new formalParameterList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN316=null;
        Token COMMA317=null;
        Token RPAREN318=null;
        List list_args=null;
        RuleReturnScope args = null;
        Object LPAREN316_tree=null;
        Object COMMA317_tree=null;
        Object RPAREN318_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:1736:2: ( LPAREN (args+= identifier ( COMMA args+= identifier )* )? RPAREN -> ^( ARGS ( $args)* ) )
            // JS.g:1736:4: LPAREN (args+= identifier ( COMMA args+= identifier )* )? RPAREN
            {
            LPAREN316=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_formalParameterList6466); 
            stream_LPAREN.add(LPAREN316);

            // JS.g:1736:11: (args+= identifier ( COMMA args+= identifier )* )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==EACH||(LA78_0>=GET && LA78_0<=SET)||(LA78_0>=WXML && LA78_0<=NAMESPACE)||LA78_0==Identifier) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // JS.g:1736:13: args+= identifier ( COMMA args+= identifier )*
                    {
                    pushFollow(FOLLOW_identifier_in_formalParameterList6472);
                    args=identifier();
                    _fsp--;

                    stream_identifier.add(args.getTree());
                    if (list_args==null) list_args=new ArrayList();
                    list_args.add(args);

                    // JS.g:1736:30: ( COMMA args+= identifier )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==COMMA) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // JS.g:1736:32: COMMA args+= identifier
                    	    {
                    	    COMMA317=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_formalParameterList6476); 
                    	    stream_COMMA.add(COMMA317);

                    	    pushFollow(FOLLOW_identifier_in_formalParameterList6480);
                    	    args=identifier();
                    	    _fsp--;

                    	    stream_identifier.add(args.getTree());
                    	    if (list_args==null) list_args=new ArrayList();
                    	    list_args.add(args);


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN318=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_formalParameterList6488); 
            stream_RPAREN.add(RPAREN318);


            // AST REWRITE
            // elements: args
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: args
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"token args",list_args);
            root_0 = (Object)adaptor.nil();
            // 1737:2: -> ^( ARGS ( $args)* )
            {
                // JS.g:1737:5: ^( ARGS ( $args)* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARGS, "ARGS"), root_1);

                // JS.g:1737:13: ( $args)*
                while ( stream_args.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_args.next()).getTree());

                }
                stream_args.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end formalParameterList

    public static class functionBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start functionBody
    // JS.g:1740:1: functionBody : lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* ) ;
    public final functionBody_return functionBody() throws RecognitionException {
        functionBody_return retval = new functionBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token RBRACE320=null;
        sourceElement_return sourceElement319 = null;


        Object lb_tree=null;
        Object RBRACE320_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_sourceElement=new RewriteRuleSubtreeStream(adaptor,"rule sourceElement");
        try {
            // JS.g:1741:2: (lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* ) )
            // JS.g:1741:4: lb= LBRACE ( sourceElement )* RBRACE
            {
            lb=(Token)input.LT(1);
            match(input,LBRACE,FOLLOW_LBRACE_in_functionBody6514); 
            stream_LBRACE.add(lb);

            // JS.g:1741:14: ( sourceElement )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( ((LA79_0>=NULL && LA79_0<=BREAK)||(LA79_0>=CONTINUE && LA79_0<=DO)||(LA79_0>=FOR && LA79_0<=IF)||(LA79_0>=NEW && LA79_0<=YIELD)||(LA79_0>=WXML && LA79_0<=NAMESPACE)||LA79_0==CONST||LA79_0==LBRACE||LA79_0==LPAREN||LA79_0==LBRACK||LA79_0==SEMIC||(LA79_0>=ADD && LA79_0<=SUB)||(LA79_0>=INC && LA79_0<=DEC)||(LA79_0>=NOT && LA79_0<=INV)||LA79_0==XMLLiteral||(LA79_0>=StringLiteral && LA79_0<=XmlAttribute)||LA79_0==Identifier||LA79_0==RegularExpressionLiteral||(LA79_0>=DecimalLiteral && LA79_0<=HexIntegerLiteral)) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // JS.g:1741:14: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_functionBody6516);
            	    sourceElement319=sourceElement();
            	    _fsp--;

            	    stream_sourceElement.add(sourceElement319.getTree());

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            RBRACE320=(Token)input.LT(1);
            match(input,RBRACE,FOLLOW_RBRACE_in_functionBody6519); 
            stream_RBRACE.add(RBRACE320);


            // AST REWRITE
            // elements: sourceElement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1742:2: -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
            {
                // JS.g:1742:5: ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK, lb,  "BLOCK"), root_1);

                // JS.g:1742:28: ( sourceElement )*
                while ( stream_sourceElement.hasNext() ) {
                    adaptor.addChild(root_1, stream_sourceElement.next());

                }
                stream_sourceElement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end functionBody

    public static class getMethodDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start getMethodDeclaration
    // JS.g:1750:1: getMethodDeclaration : GET name= identifier LPAREN RPAREN functionBody -> ^( GETTER identifier ( functionBody )? ) ;
    public final getMethodDeclaration_return getMethodDeclaration() throws RecognitionException {
        getMethodDeclaration_return retval = new getMethodDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token GET321=null;
        Token LPAREN322=null;
        Token RPAREN323=null;
        identifier_return name = null;

        functionBody_return functionBody324 = null;


        Object GET321_tree=null;
        Object LPAREN322_tree=null;
        Object RPAREN323_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_GET=new RewriteRuleTokenStream(adaptor,"token GET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:1751:3: ( GET name= identifier LPAREN RPAREN functionBody -> ^( GETTER identifier ( functionBody )? ) )
            // JS.g:1751:5: GET name= identifier LPAREN RPAREN functionBody
            {
            GET321=(Token)input.LT(1);
            match(input,GET,FOLLOW_GET_in_getMethodDeclaration6549); 
            stream_GET.add(GET321);

            pushFollow(FOLLOW_identifier_in_getMethodDeclaration6553);
            name=identifier();
            _fsp--;

            stream_identifier.add(name.getTree());
            LPAREN322=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_getMethodDeclaration6555); 
            stream_LPAREN.add(LPAREN322);

            RPAREN323=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_getMethodDeclaration6557); 
            stream_RPAREN.add(RPAREN323);

            pushFollow(FOLLOW_functionBody_in_getMethodDeclaration6559);
            functionBody324=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody324.getTree());

            // AST REWRITE
            // elements: identifier, functionBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1752:4: -> ^( GETTER identifier ( functionBody )? )
            {
                // JS.g:1752:7: ^( GETTER identifier ( functionBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(GETTER, "GETTER"), root_1);

                adaptor.addChild(root_1, stream_identifier.next());
                // JS.g:1752:27: ( functionBody )?
                if ( stream_functionBody.hasNext() ) {
                    adaptor.addChild(root_1, stream_functionBody.next());

                }
                stream_functionBody.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end getMethodDeclaration

    public static class setMethodDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start setMethodDeclaration
    // JS.g:1755:1: setMethodDeclaration : SET name= identifier LPAREN param= identifier RPAREN functionBody -> ^( SETTER $name $param ( functionBody )? ) ;
    public final setMethodDeclaration_return setMethodDeclaration() throws RecognitionException {
        setMethodDeclaration_return retval = new setMethodDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SET325=null;
        Token LPAREN326=null;
        Token RPAREN327=null;
        identifier_return name = null;

        identifier_return param = null;

        functionBody_return functionBody328 = null;


        Object SET325_tree=null;
        Object LPAREN326_tree=null;
        Object RPAREN327_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // JS.g:1756:3: ( SET name= identifier LPAREN param= identifier RPAREN functionBody -> ^( SETTER $name $param ( functionBody )? ) )
            // JS.g:1756:5: SET name= identifier LPAREN param= identifier RPAREN functionBody
            {
            SET325=(Token)input.LT(1);
            match(input,SET,FOLLOW_SET_in_setMethodDeclaration6588); 
            stream_SET.add(SET325);

            pushFollow(FOLLOW_identifier_in_setMethodDeclaration6592);
            name=identifier();
            _fsp--;

            stream_identifier.add(name.getTree());
            LPAREN326=(Token)input.LT(1);
            match(input,LPAREN,FOLLOW_LPAREN_in_setMethodDeclaration6594); 
            stream_LPAREN.add(LPAREN326);

            pushFollow(FOLLOW_identifier_in_setMethodDeclaration6598);
            param=identifier();
            _fsp--;

            stream_identifier.add(param.getTree());
            RPAREN327=(Token)input.LT(1);
            match(input,RPAREN,FOLLOW_RPAREN_in_setMethodDeclaration6600); 
            stream_RPAREN.add(RPAREN327);

            pushFollow(FOLLOW_functionBody_in_setMethodDeclaration6602);
            functionBody328=functionBody();
            _fsp--;

            stream_functionBody.add(functionBody328.getTree());

            // AST REWRITE
            // elements: name, functionBody, param
            // token labels: 
            // rule labels: retval, param, name
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"token param",param!=null?param.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"token name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1757:5: -> ^( SETTER $name $param ( functionBody )? )
            {
                // JS.g:1757:8: ^( SETTER $name $param ( functionBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(SETTER, "SETTER"), root_1);

                adaptor.addChild(root_1, stream_name.next());
                adaptor.addChild(root_1, stream_param.next());
                // JS.g:1757:30: ( functionBody )?
                if ( stream_functionBody.hasNext() ) {
                    adaptor.addChild(root_1, stream_functionBody.next());

                }
                stream_functionBody.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end setMethodDeclaration

    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start program
    // JS.g:1764:1: program : ( sourceElement )* EOF ;
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF330=null;
        sourceElement_return sourceElement329 = null;


        Object EOF330_tree=null;

        try {
            // JS.g:1765:2: ( ( sourceElement )* EOF )
            // JS.g:1765:4: ( sourceElement )* EOF
            {
            root_0 = (Object)adaptor.nil();

            // JS.g:1765:4: ( sourceElement )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( ((LA80_0>=NULL && LA80_0<=BREAK)||(LA80_0>=CONTINUE && LA80_0<=DO)||(LA80_0>=FOR && LA80_0<=IF)||(LA80_0>=NEW && LA80_0<=YIELD)||(LA80_0>=WXML && LA80_0<=NAMESPACE)||LA80_0==CONST||LA80_0==LBRACE||LA80_0==LPAREN||LA80_0==LBRACK||LA80_0==SEMIC||(LA80_0>=ADD && LA80_0<=SUB)||(LA80_0>=INC && LA80_0<=DEC)||(LA80_0>=NOT && LA80_0<=INV)||LA80_0==XMLLiteral||(LA80_0>=StringLiteral && LA80_0<=XmlAttribute)||LA80_0==Identifier||LA80_0==RegularExpressionLiteral||(LA80_0>=DecimalLiteral && LA80_0<=HexIntegerLiteral)) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // JS.g:1765:4: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_program6638);
            	    sourceElement329=sourceElement();
            	    _fsp--;

            	    adaptor.addChild(root_0, sourceElement329.getTree());

            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);

            EOF330=(Token)input.LT(1);
            match(input,EOF,FOLLOW_EOF_in_program6641); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end program

    public static class sourceElement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start sourceElement
    // JS.g:1773:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );
    public final sourceElement_return sourceElement() throws RecognitionException {
        sourceElement_return retval = new sourceElement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        functionDeclaration_return functionDeclaration331 = null;

        statement_return statement332 = null;



        try {
            // JS.g:1778:2: ({...}? functionDeclaration | statement )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==FUNCTION) ) {
                int LA81_1 = input.LA(2);

                if ( ( input.LA(1) == FUNCTION ) ) {
                    alt81=1;
                }
                else if ( (true) ) {
                    alt81=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1773:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );", 81, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA81_0>=NULL && LA81_0<=BREAK)||(LA81_0>=CONTINUE && LA81_0<=DO)||(LA81_0>=FOR && LA81_0<=EACH)||LA81_0==IF||(LA81_0>=NEW && LA81_0<=YIELD)||(LA81_0>=WXML && LA81_0<=NAMESPACE)||LA81_0==CONST||LA81_0==LBRACE||LA81_0==LPAREN||LA81_0==LBRACK||LA81_0==SEMIC||(LA81_0>=ADD && LA81_0<=SUB)||(LA81_0>=INC && LA81_0<=DEC)||(LA81_0>=NOT && LA81_0<=INV)||LA81_0==XMLLiteral||(LA81_0>=StringLiteral && LA81_0<=XmlAttribute)||LA81_0==Identifier||LA81_0==RegularExpressionLiteral||(LA81_0>=DecimalLiteral && LA81_0<=HexIntegerLiteral)) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1773:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // JS.g:1778:4: {...}? functionDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !( input.LA(1) == FUNCTION ) ) {
                        throw new FailedPredicateException(input, "sourceElement", " input.LA(1) == FUNCTION ");
                    }
                    pushFollow(FOLLOW_functionDeclaration_in_sourceElement6670);
                    functionDeclaration331=functionDeclaration();
                    _fsp--;

                    adaptor.addChild(root_0, functionDeclaration331.getTree());

                    }
                    break;
                case 2 :
                    // JS.g:1779:4: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_sourceElement6675);
                    statement332=statement();
                    _fsp--;

                    adaptor.addChild(root_0, statement332.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end sourceElement


 

    public static final BitSet FOLLOW_reservedWord_in_token1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_token2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_punctuator_in_token2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_token2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_token2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XmlAttribute_in_token2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_reservedWord2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_futureReservedWord_in_reservedWord2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_reservedWord2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_reservedWord2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_futureReservedWord0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_identifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_punctuator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RegularExpressionLiteral_in_literal2867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_primaryExpression3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XmlAttribute_in_primaryExpression3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLiteral_in_primaryExpression3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_primaryExpression3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpression_in_primaryExpression3526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parenExpression3542 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_expression_in_parenExpression3544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_parenExpression3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayLiteral3571 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819804D40L,0x1C50600002000000L});
    public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004800L});
    public static final BitSet FOLLOW_COMMA_in_arrayLiteral3579 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819804D40L,0x1C50600002000000L});
    public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004800L});
    public static final BitSet FOLLOW_RBRACK_in_arrayLiteral3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_arrayItem3618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_objectLiteral3650 = new BitSet(new long[]{0x0000006600020000L,0x0000000000000080L,0x1C10600000000000L});
    public static final BitSet FOLLOW_objectPropertyInitializer_in_objectLiteral3654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004080L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral3658 = new BitSet(new long[]{0x0000006600020000L,0x0000000000000000L,0x1C10600000000000L});
    public static final BitSet FOLLOW_objectPropertyInitializer_in_objectLiteral3660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004080L});
    public static final BitSet FOLLOW_RBRACE_in_objectLiteral3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameValuePair_in_objectPropertyInitializer3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getMethodDeclaration_in_objectPropertyInitializer3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setMethodDeclaration_in_objectPropertyInitializer3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyName_in_nameValuePair3719 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_nameValuePair3721 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_nameValuePair3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_propertyName3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_propertyName3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_propertyName3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XmlAttribute_in_propertyName3762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_memberExpression3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionExpression_in_memberExpression3785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_memberExpression3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpression3801 = new BitSet(new long[]{0x0000006602460070L,0x0000000000000540L,0x1C50600000000000L});
    public static final BitSet FOLLOW_memberExpression_in_newExpression3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_arguments3817 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800740L,0x1C50600002000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments3821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004200L});
    public static final BitSet FOLLOW_COMMA_in_arguments3825 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments3827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004200L});
    public static final BitSet FOLLOW_RPAREN_in_arguments3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberExpression_in_leftHandSideExpression3868 = new BitSet(new long[]{0x0000000000000002L,0xC000000000001500L});
    public static final BitSet FOLLOW_arguments_in_leftHandSideExpression3889 = new BitSet(new long[]{0x0000000000000002L,0xC000000000001500L});
    public static final BitSet FOLLOW_LBRACK_in_leftHandSideExpression3914 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression3916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_RBRACK_in_leftHandSideExpression3918 = new BitSet(new long[]{0x0000000000000002L,0xC000000000001500L});
    public static final BitSet FOLLOW_DOT_in_leftHandSideExpression3940 = new BitSet(new long[]{0x0000006600020000L,0x0000000002000100L,0x0010400000000000L});
    public static final BitSet FOLLOW_rightHandSideExpression_in_leftHandSideExpression3942 = new BitSet(new long[]{0x0000000000000002L,0xC000000000001500L});
    public static final BitSet FOLLOW_DOTDOT_in_leftHandSideExpression3963 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression3965 = new BitSet(new long[]{0x0000000000000002L,0xC000000000001500L});
    public static final BitSet FOLLOW_COLONCOLON_in_leftHandSideExpression3984 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression3986 = new BitSet(new long[]{0x0000000000000002L,0xC000000000001500L});
    public static final BitSet FOLLOW_parenExpression_in_rightHandSideExpression4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_rightHandSideExpression4022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XmlAttribute_in_rightHandSideExpression4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUL_in_rightHandSideExpression4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftHandSideExpression_in_postfixExpression4072 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_postfixOperator_in_postfixExpression4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_postfixOperator4096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_postfixOperator4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryOperator_in_unaryExpression4127 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XMLLiteral_in_unaryExpression4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_unaryOperator4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_unaryOperator4152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEOF_in_unaryOperator4157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_unaryOperator4162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_unaryOperator4167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_unaryOperator4174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_unaryOperator4183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INV_in_unaryOperator4190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryOperator4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YIELD_in_unaryOperator4200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_namespaceStatement4236 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_WXML_in_namespaceStatement4238 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespaceStatement4240 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_namespaceStatement4242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_namespaceStatement4244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002080L,0x00000C0000000000L});
    public static final BitSet FOLLOW_semic_in_namespaceStatement4246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4278 = new BitSet(new long[]{0x0000000000000002L,0x0010000006000000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression4282 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4297 = new BitSet(new long[]{0x0000000000000002L,0x0010000006000000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4315 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_set_in_additiveExpression4319 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4330 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4349 = new BitSet(new long[]{0x0000000000000002L,0x00000000E0000000L});
    public static final BitSet FOLLOW_set_in_shiftExpression4353 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4368 = new BitSet(new long[]{0x0000000000000002L,0x00000000E0000000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4387 = new BitSet(new long[]{0x0000000000300002L,0x0000000000078000L});
    public static final BitSet FOLLOW_set_in_relationalExpression4391 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4418 = new BitSet(new long[]{0x0000000000300002L,0x0000000000078000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn4432 = new BitSet(new long[]{0x0000000000200002L,0x0000000000078000L});
    public static final BitSet FOLLOW_set_in_relationalExpressionNoIn4436 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn4459 = new BitSet(new long[]{0x0000000000200002L,0x0000000000078000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4478 = new BitSet(new long[]{0x0000000000000002L,0x0000000000780000L});
    public static final BitSet FOLLOW_set_in_equalityExpression4482 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4501 = new BitSet(new long[]{0x0000000000000002L,0x0000000000780000L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4515 = new BitSet(new long[]{0x0000000000000002L,0x0000000000780000L});
    public static final BitSet FOLLOW_set_in_equalityExpressionNoIn4519 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4538 = new BitSet(new long[]{0x0000000000000002L,0x0000000000780000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression4558 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpression4562 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression4565 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4579 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpressionNoIn4583 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4586 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4602 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpression4606 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4609 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4625 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpressionNoIn4629 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4632 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4647 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpression4651 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4654 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4669 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpressionNoIn4673 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4676 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression4695 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpression4699 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression4702 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4716 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpressionNoIn4720 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4723 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression4738 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpression4742 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression4745 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4760 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpressionNoIn4764 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4767 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_conditionalExpression4786 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpression4790 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression4793 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression4795 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression4798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn4812 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpressionNoIn4816 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4819 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpressionNoIn4821 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignmentExpression4852 = new BitSet(new long[]{0x0000000000000002L,0x002FFE0000000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpression4859 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn4940 = new BitSet(new long[]{0x0000000000000002L,0x002FFE0000000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpressionNoIn4947 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression4972 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_COMMA_in_expression4976 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression4980 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5017 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_COMMA_in_expressionNoIn5021 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5025 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_SEMIC_in_semic5076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_semic5081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_semic5086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOL_in_semic5093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MultiLineComment_in_semic5097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement5126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementTail_in_statement5131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableStatement_in_statementTail5143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStatement_in_statementTail5148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStatement_in_statementTail5153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statementTail5158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterationStatement_in_statementTail5163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueStatement_in_statementTail5168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakStatement_in_statementTail5173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_statementTail5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withStatement_in_statementTail5183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelledStatement_in_statementTail5188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStatement_in_statementTail5193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throwStatement_in_statementTail5198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryStatement_in_statementTail5203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constStatement_in_statementTail5208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespaceStatement_in_statementTail5213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block5228 = new BitSet(new long[]{0x0000106FFFCF3CF0L,0x00000018198025C0L,0x1C50600002000000L});
    public static final BitSet FOLLOW_statement_in_block5230 = new BitSet(new long[]{0x0000106FFFCF3CF0L,0x00000018198025C0L,0x1C50600002000000L});
    public static final BitSet FOLLOW_RBRACE_in_block5233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variableStatement5262 = new BitSet(new long[]{0x0000006600020000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement5264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006080L,0x00000C0000000000L});
    public static final BitSet FOLLOW_COMMA_in_variableStatement5268 = new BitSet(new long[]{0x0000006600020000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement5270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006080L,0x00000C0000000000L});
    public static final BitSet FOLLOW_semic_in_variableStatement5275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclaration5298 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration5302 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_variableDeclaration5305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclarationNoIn5320 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclarationNoIn5324 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn5327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constStatement5342 = new BitSet(new long[]{0x0000006600020000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_constStatement5344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006080L,0x00000C0000000000L});
    public static final BitSet FOLLOW_COMMA_in_constStatement5348 = new BitSet(new long[]{0x0000006600020000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_constStatement5350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006080L,0x00000C0000000000L});
    public static final BitSet FOLLOW_semic_in_constStatement5355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_emptyStatement5385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionStatement5404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002080L,0x00000C0000000000L});
    public static final BitSet FOLLOW_semic_in_expressionStatement5406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement5424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_ifStatement5426 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_expression_in_ifStatement5428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_ifStatement5430 = new BitSet(new long[]{0x0000106FFFCF3CF0L,0x0000001819802540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_statement_in_ifStatement5432 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement5438 = new BitSet(new long[]{0x0000106FFFCF3CF0L,0x0000001819802540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_statement_in_ifStatement5440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doStatement_in_iterationStatement5473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_iterationStatement5478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forEachStatement_in_iterationStatement5483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_iterationStatement5488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_doStatement5500 = new BitSet(new long[]{0x0000106FFFCF3CF0L,0x0000001819802540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_statement_in_doStatement5502 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_WHILE_in_doStatement5504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_doStatement5506 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_expression_in_doStatement5508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_doStatement5510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002080L,0x00000C0000000000L});
    public static final BitSet FOLLOW_semic_in_doStatement5512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement5537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_whileStatement5540 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_expression_in_whileStatement5543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_whileStatement5545 = new BitSet(new long[]{0x0000106FFFCF3CF0L,0x0000001819802540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_statement_in_whileStatement5548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forEachStatement5563 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EACH_in_forEachStatement5565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_forEachStatement5567 = new BitSet(new long[]{0x0000006E72461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_forEachControl_in_forEachStatement5569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_forEachStatement5571 = new BitSet(new long[]{0x0000106FFFCF3CF0L,0x0000001819802540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_statement_in_forEachStatement5573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlVar_in_forEachControl5600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlExpression_in_forEachControl5606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStatement5618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_forStatement5621 = new BitSet(new long[]{0x0000006E72461070L,0x0000001819802540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_forControl_in_forStatement5624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_forStatement5626 = new BitSet(new long[]{0x0000106FFFCF3CF0L,0x0000001819802540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_statement_in_forStatement5629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlVar_in_forControl5640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlExpression_in_forControl5645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlSemic_in_forControl5650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_forControlVar5661 = new BitSet(new long[]{0x0000006600020000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar5663 = new BitSet(new long[]{0x0000000000100000L,0x0000000000006000L});
    public static final BitSet FOLLOW_IN_in_forControlVar5675 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_expression_in_forControlVar5677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_forControlVar5723 = new BitSet(new long[]{0x0000006600020000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar5725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar5730 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819802540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_expression_in_forControlVar5734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar5737 = new BitSet(new long[]{0x0000006E52461072L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_expression_in_forControlVar5741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoIn_in_forControlExpression5807 = new BitSet(new long[]{0x0000000000100000L,0x0000000000002000L});
    public static final BitSet FOLLOW_IN_in_forControlExpression5822 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression5826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression5872 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819802540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression5876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression5879 = new BitSet(new long[]{0x0000006E52461072L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression5883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic5942 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819802540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_expression_in_forControlSemic5946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic5949 = new BitSet(new long[]{0x0000006E52461072L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_expression_in_forControlSemic5953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStatement6007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002080L,0x00100C0000000000L});
    public static final BitSet FOLLOW_Identifier_in_continueStatement6012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002080L,0x00000C0000000000L});
    public static final BitSet FOLLOW_semic_in_continueStatement6015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStatement6034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002080L,0x00100C0000000000L});
    public static final BitSet FOLLOW_Identifier_in_breakStatement6039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002080L,0x00000C0000000000L});
    public static final BitSet FOLLOW_semic_in_breakStatement6042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnStatement6061 = new BitSet(new long[]{0x0000006E52461070L,0x00000018198025C0L,0x1C506C0002000000L});
    public static final BitSet FOLLOW_expression_in_returnStatement6066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002080L,0x00000C0000000000L});
    public static final BitSet FOLLOW_semic_in_returnStatement6069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_withStatement6086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_withStatement6089 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_expression_in_withStatement6092 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_withStatement6094 = new BitSet(new long[]{0x0000106FFFCF3CF0L,0x0000001819802540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_statement_in_withStatement6097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchStatement6118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_switchStatement6120 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_expression_in_switchStatement6122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_switchStatement6124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LBRACE_in_switchStatement6126 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000080L});
    public static final BitSet FOLLOW_defaultClause_in_switchStatement6133 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000080L});
    public static final BitSet FOLLOW_caseClause_in_switchStatement6139 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000080L});
    public static final BitSet FOLLOW_RBRACE_in_switchStatement6144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseClause6172 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_expression_in_caseClause6175 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_caseClause6177 = new BitSet(new long[]{0x0000106FFFCF3CF2L,0x0000001819802540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_statement_in_caseClause6180 = new BitSet(new long[]{0x0000106FFFCF3CF2L,0x0000001819802540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultClause6193 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_defaultClause6196 = new BitSet(new long[]{0x0000106FFFCF3CF2L,0x0000001819802540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_statement_in_defaultClause6199 = new BitSet(new long[]{0x0000106FFFCF3CF2L,0x0000001819802540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_identifier_in_labelledStatement6216 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_labelledStatement6218 = new BitSet(new long[]{0x0000106FFFCF3CF0L,0x0000001819802540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_statement_in_labelledStatement6220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_throwStatement6251 = new BitSet(new long[]{0x0000006E52461070L,0x0000001819800540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_expression_in_throwStatement6256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002080L,0x00000C0000000000L});
    public static final BitSet FOLLOW_semic_in_throwStatement6258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryStatement6275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_block_in_tryStatement6278 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_catchClause_in_tryStatement6282 = new BitSet(new long[]{0x0000000000008202L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement6285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement6290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchClause6304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_catchClause6307 = new BitSet(new long[]{0x0000006600020000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_identifier_in_catchClause6310 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000200L});
    public static final BitSet FOLLOW_catchFilter_in_catchClause6312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_catchClause6315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_block_in_catchClause6318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_catchFilter6331 = new BitSet(new long[]{0x0000006600020000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_instanceofExpression_in_catchFilter6334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_instanceofExpression6349 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_INSTANCEOF_in_instanceofExpression6351 = new BitSet(new long[]{0x0000006600020000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_identifier_in_instanceofExpression6354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINALLY_in_finallyClause6367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_block_in_finallyClause6370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDeclaration6391 = new BitSet(new long[]{0x0000006600020000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_identifier_in_functionDeclaration6395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_formalParameterList_in_functionDeclaration6397 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_functionBody_in_functionDeclaration6399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionExpression6428 = new BitSet(new long[]{0x0000006600020000L,0x0000000000000100L,0x0010000000000000L});
    public static final BitSet FOLLOW_identifier_in_functionExpression6432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_formalParameterList_in_functionExpression6435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_functionBody_in_functionExpression6437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_formalParameterList6466 = new BitSet(new long[]{0x0000006600020000L,0x0000000000000200L,0x0010000000000000L});
    public static final BitSet FOLLOW_identifier_in_formalParameterList6472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004200L});
    public static final BitSet FOLLOW_COMMA_in_formalParameterList6476 = new BitSet(new long[]{0x0000006600020000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_identifier_in_formalParameterList6480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004200L});
    public static final BitSet FOLLOW_RPAREN_in_formalParameterList6488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_functionBody6514 = new BitSet(new long[]{0x0000106FFFCF3CF0L,0x00000018198025C0L,0x1C50600002000000L});
    public static final BitSet FOLLOW_sourceElement_in_functionBody6516 = new BitSet(new long[]{0x0000106FFFCF3CF0L,0x00000018198025C0L,0x1C50600002000000L});
    public static final BitSet FOLLOW_RBRACE_in_functionBody6519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_getMethodDeclaration6549 = new BitSet(new long[]{0x0000006600020000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_identifier_in_getMethodDeclaration6553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_getMethodDeclaration6555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_getMethodDeclaration6557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_functionBody_in_getMethodDeclaration6559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_setMethodDeclaration6588 = new BitSet(new long[]{0x0000006600020000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_identifier_in_setMethodDeclaration6592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_setMethodDeclaration6594 = new BitSet(new long[]{0x0000006600020000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_identifier_in_setMethodDeclaration6598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_setMethodDeclaration6600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_functionBody_in_setMethodDeclaration6602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sourceElement_in_program6638 = new BitSet(new long[]{0x0000106FFFCF3CF0L,0x0000001819802540L,0x1C50600002000000L});
    public static final BitSet FOLLOW_EOF_in_program6641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_sourceElement6670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_sourceElement6675 = new BitSet(new long[]{0x0000000000000002L});

}