// $ANTLR 3.4 /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g 2012-09-21 16:36:01
package org.apache.drill.parsers.impl.drqlantlr.autogen;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class DrqlAntlrLexer extends Lexer {
    public static final int EOF=-1;
    public static final int A=4;
    public static final int ADD=5;
    public static final int AS=6;
    public static final int ASC=7;
    public static final int B=8;
    public static final int BITWISE_AND=9;
    public static final int BITWISE_LEFT_SHIFT=10;
    public static final int BITWISE_NOT=11;
    public static final int BITWISE_OR=12;
    public static final int BITWISE_RIGHT_SHIFT=13;
    public static final int BITWISE_XOR=14;
    public static final int C=15;
    public static final int COLON=16;
    public static final int COMMA=17;
    public static final int COMMENT=18;
    public static final int CONTAINS=19;
    public static final int D=20;
    public static final int DESC=21;
    public static final int DIV=22;
    public static final int DOT=23;
    public static final int E=24;
    public static final int EQUAL=25;
    public static final int ESC_SEQ=26;
    public static final int EXPONENT=27;
    public static final int F=28;
    public static final int FLOAT=29;
    public static final int FROM=30;
    public static final int F_ID1=31;
    public static final int F_ID2=32;
    public static final int G=33;
    public static final int GREATER_THAN=34;
    public static final int GREATER_THAN_OR_EQUAL=35;
    public static final int GROUPBY=36;
    public static final int H=37;
    public static final int HAVING=38;
    public static final int HEX_DIGIT=39;
    public static final int I=40;
    public static final int ID=41;
    public static final int IN=42;
    public static final int INNER=43;
    public static final int INT=44;
    public static final int J=45;
    public static final int JOIN=46;
    public static final int K=47;
    public static final int L=48;
    public static final int LCURLY=49;
    public static final int LEFT=50;
    public static final int LESS_THAN=51;
    public static final int LESS_THAN_OR_EQUAL=52;
    public static final int LIMIT=53;
    public static final int LOGICAL_AND=54;
    public static final int LOGICAL_NOT=55;
    public static final int LOGICAL_OR=56;
    public static final int LPAREN=57;
    public static final int LSQUARE=58;
    public static final int M=59;
    public static final int N=60;
    public static final int NOT_EQUAL=61;
    public static final int N_ADD=62;
    public static final int N_ALIAS=63;
    public static final int N_ASC=64;
    public static final int N_BITWISE_AND=65;
    public static final int N_BITWISE_LEFT_SHIFT=66;
    public static final int N_BITWISE_NOT=67;
    public static final int N_BITWISE_OR=68;
    public static final int N_BITWISE_RIGHT_SHIFT=69;
    public static final int N_BITWISE_XOR=70;
    public static final int N_CALL=71;
    public static final int N_CALL_PARAMS=72;
    public static final int N_COLUMN=73;
    public static final int N_COLUMN_NAME=74;
    public static final int N_CONTAINS=75;
    public static final int N_DESC=76;
    public static final int N_DIVIDE=77;
    public static final int N_EQUAL=78;
    public static final int N_EXPRESSION=79;
    public static final int N_FLOAT=80;
    public static final int N_FROM=81;
    public static final int N_GREATER_THAN=82;
    public static final int N_GREATER_THAN_OR_EQUAL=83;
    public static final int N_GROUPBY=84;
    public static final int N_HAVING=85;
    public static final int N_ID=86;
    public static final int N_IN=87;
    public static final int N_INNER=88;
    public static final int N_INT=89;
    public static final int N_IN_PARAMS=90;
    public static final int N_JOIN=91;
    public static final int N_JOIN_ON=92;
    public static final int N_JOIN_ON_LIST=93;
    public static final int N_LEFTOUTER=94;
    public static final int N_LESS_THAN=95;
    public static final int N_LESS_THAN_OR_EQUAL=96;
    public static final int N_LIMIT=97;
    public static final int N_LOGICAL_AND=98;
    public static final int N_LOGICAL_NOT=99;
    public static final int N_LOGICAL_OR=100;
    public static final int N_MULTIPLY=101;
    public static final int N_NAME=102;
    public static final int N_NOT_EQUAL=103;
    public static final int N_OP=104;
    public static final int N_ORDERBY=105;
    public static final int N_REMAINDER=106;
    public static final int N_SELECT=107;
    public static final int N_SELECT_STATEMENT=108;
    public static final int N_STRING=109;
    public static final int N_SUBSTRUCT=110;
    public static final int N_TABLE=111;
    public static final int N_TABLE_NAME=112;
    public static final int N_WHERE=113;
    public static final int N_WITHIN=114;
    public static final int N_WITHIN_RECORD=115;
    public static final int O=116;
    public static final int OCTAL_ESC=117;
    public static final int ON=118;
    public static final int ORDERBY=119;
    public static final int OUTER=120;
    public static final int P=121;
    public static final int Q=122;
    public static final int R=123;
    public static final int RCURLY=124;
    public static final int RECORD=125;
    public static final int REMAINDER=126;
    public static final int RPAREN=127;
    public static final int RSQUARE=128;
    public static final int S=129;
    public static final int SELECT=130;
    public static final int SEMICOLON=131;
    public static final int SLASH=132;
    public static final int STAR=133;
    public static final int STRING=134;
    public static final int SUBSTRUCT=135;
    public static final int T=136;
    public static final int U=137;
    public static final int UNICODE_ESC=138;
    public static final int V=139;
    public static final int W=140;
    public static final int WHERE=141;
    public static final int WITHIN=142;
    public static final int WS=143;
    public static final int X=144;
    public static final int Y=145;
    public static final int Z=146;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public DrqlAntlrLexer() {} 
    public DrqlAntlrLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DrqlAntlrLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g"; }

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:157:9: ( S E L E C T )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:157:11: S E L E C T
            {
            mS(); 


            mE(); 


            mL(); 


            mE(); 


            mC(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "WITHIN"
    public final void mWITHIN() throws RecognitionException {
        try {
            int _type = WITHIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:158:9: ( W I T H I N )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:158:11: W I T H I N
            {
            mW(); 


            mI(); 


            mT(); 


            mH(); 


            mI(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WITHIN"

    // $ANTLR start "RECORD"
    public final void mRECORD() throws RecognitionException {
        try {
            int _type = RECORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:159:9: ( R E C O R D )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:159:11: R E C O R D
            {
            mR(); 


            mE(); 


            mC(); 


            mO(); 


            mR(); 


            mD(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RECORD"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:160:6: ( A S )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:160:7: A S
            {
            mA(); 


            mS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:161:7: ( F R O M )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:161:9: F R O M
            {
            mF(); 


            mR(); 


            mO(); 


            mM(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "INNER"
    public final void mINNER() throws RecognitionException {
        try {
            int _type = INNER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:162:8: ( I N N E R )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:162:10: I N N E R
            {
            mI(); 


            mN(); 


            mN(); 


            mE(); 


            mR(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INNER"

    // $ANTLR start "LEFT"
    public final void mLEFT() throws RecognitionException {
        try {
            int _type = LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:163:7: ( L E F T )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:163:9: L E F T
            {
            mL(); 


            mE(); 


            mF(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEFT"

    // $ANTLR start "OUTER"
    public final void mOUTER() throws RecognitionException {
        try {
            int _type = OUTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:164:8: ( O U T E R )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:164:10: O U T E R
            {
            mO(); 


            mU(); 


            mT(); 


            mE(); 


            mR(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OUTER"

    // $ANTLR start "JOIN"
    public final void mJOIN() throws RecognitionException {
        try {
            int _type = JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:165:7: ( J O I N )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:165:9: J O I N
            {
            mJ(); 


            mO(); 


            mI(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "JOIN"

    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:166:6: ( O N )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:166:8: O N
            {
            mO(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ON"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:167:8: ( W H E R E )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:167:10: W H E R E
            {
            mW(); 


            mH(); 


            mE(); 


            mR(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "GROUPBY"
    public final void mGROUPBY() throws RecognitionException {
        try {
            int _type = GROUPBY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:168:10: ( G R O U P WS B Y )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:168:12: G R O U P WS B Y
            {
            mG(); 


            mR(); 


            mO(); 


            mU(); 


            mP(); 


            mWS(); 


            mB(); 


            mY(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GROUPBY"

    // $ANTLR start "HAVING"
    public final void mHAVING() throws RecognitionException {
        try {
            int _type = HAVING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:169:9: ( H A V I N G )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:169:11: H A V I N G
            {
            mH(); 


            mA(); 


            mV(); 


            mI(); 


            mN(); 


            mG(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HAVING"

    // $ANTLR start "ORDERBY"
    public final void mORDERBY() throws RecognitionException {
        try {
            int _type = ORDERBY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:170:10: ( O R D E R WS B Y )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:170:12: O R D E R WS B Y
            {
            mO(); 


            mR(); 


            mD(); 


            mE(); 


            mR(); 


            mWS(); 


            mB(); 


            mY(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ORDERBY"

    // $ANTLR start "DESC"
    public final void mDESC() throws RecognitionException {
        try {
            int _type = DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:171:7: ( D E S C )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:171:9: D E S C
            {
            mD(); 


            mE(); 


            mS(); 


            mC(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DESC"

    // $ANTLR start "ASC"
    public final void mASC() throws RecognitionException {
        try {
            int _type = ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:172:7: ( A S C )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:172:9: A S C
            {
            mA(); 


            mS(); 


            mC(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASC"

    // $ANTLR start "LIMIT"
    public final void mLIMIT() throws RecognitionException {
        try {
            int _type = LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:173:8: ( L I M I T )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:173:10: L I M I T
            {
            mL(); 


            mI(); 


            mM(); 


            mI(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LIMIT"

    // $ANTLR start "LOGICAL_OR"
    public final void mLOGICAL_OR() throws RecognitionException {
        try {
            int _type = LOGICAL_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:174:13: ( O R )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:174:15: O R
            {
            mO(); 


            mR(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOGICAL_OR"

    // $ANTLR start "LOGICAL_AND"
    public final void mLOGICAL_AND() throws RecognitionException {
        try {
            int _type = LOGICAL_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:175:13: ( A N D )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:175:15: A N D
            {
            mA(); 


            mN(); 


            mD(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOGICAL_AND"

    // $ANTLR start "LOGICAL_NOT"
    public final void mLOGICAL_NOT() throws RecognitionException {
        try {
            int _type = LOGICAL_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:176:13: ( N O T )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:176:15: N O T
            {
            mN(); 


            mO(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOGICAL_NOT"

    // $ANTLR start "CONTAINS"
    public final void mCONTAINS() throws RecognitionException {
        try {
            int _type = CONTAINS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:177:11: ( C O N T A I N S )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:177:13: C O N T A I N S
            {
            mC(); 


            mO(); 


            mN(); 


            mT(); 


            mA(); 


            mI(); 


            mN(); 


            mS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONTAINS"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:178:5: ( I N )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:178:7: I N
            {
            mI(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "BITWISE_AND"
    public final void mBITWISE_AND() throws RecognitionException {
        try {
            int _type = BITWISE_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:181:13: ( '&' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:181:16: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BITWISE_AND"

    // $ANTLR start "BITWISE_NOT"
    public final void mBITWISE_NOT() throws RecognitionException {
        try {
            int _type = BITWISE_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:182:13: ( '~' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:182:16: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BITWISE_NOT"

    // $ANTLR start "BITWISE_OR"
    public final void mBITWISE_OR() throws RecognitionException {
        try {
            int _type = BITWISE_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:183:12: ( '|' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:183:15: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BITWISE_OR"

    // $ANTLR start "BITWISE_XOR"
    public final void mBITWISE_XOR() throws RecognitionException {
        try {
            int _type = BITWISE_XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:184:13: ( '^' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:184:16: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BITWISE_XOR"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:185:9: ( '=' | '==' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='=') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='=') ) {
                    alt1=2;
                }
                else {
                    alt1=1;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:185:12: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:185:18: '=='
                    {
                    match("=="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:186:12: ( '<>' | '!=' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='<') ) {
                alt2=1;
            }
            else if ( (LA2_0=='!') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:186:15: '<>'
                    {
                    match("<>"); 



                    }
                    break;
                case 2 :
                    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:186:22: '!='
                    {
                    match("!="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "LESS_THAN_OR_EQUAL"
    public final void mLESS_THAN_OR_EQUAL() throws RecognitionException {
        try {
            int _type = LESS_THAN_OR_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:187:19: ( '<=' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:187:21: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESS_THAN_OR_EQUAL"

    // $ANTLR start "LESS_THAN"
    public final void mLESS_THAN() throws RecognitionException {
        try {
            int _type = LESS_THAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:188:12: ( '<' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:188:15: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESS_THAN"

    // $ANTLR start "GREATER_THAN_OR_EQUAL"
    public final void mGREATER_THAN_OR_EQUAL() throws RecognitionException {
        try {
            int _type = GREATER_THAN_OR_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:189:22: ( '>=' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:189:25: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATER_THAN_OR_EQUAL"

    // $ANTLR start "GREATER_THAN"
    public final void mGREATER_THAN() throws RecognitionException {
        try {
            int _type = GREATER_THAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:190:13: ( '>' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:190:16: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATER_THAN"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:191:9: ( '/' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:191:12: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:192:7: ( ' D I V' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:192:9: ' D I V'
            {
            match(" D I V"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:193:7: ( '*' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:193:10: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:194:7: ( '+' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:194:10: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "SUBSTRUCT"
    public final void mSUBSTRUCT() throws RecognitionException {
        try {
            int _type = SUBSTRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:195:12: ( '-' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:195:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUBSTRUCT"

    // $ANTLR start "REMAINDER"
    public final void mREMAINDER() throws RecognitionException {
        try {
            int _type = REMAINDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:196:11: ( '%' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:196:14: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REMAINDER"

    // $ANTLR start "BITWISE_LEFT_SHIFT"
    public final void mBITWISE_LEFT_SHIFT() throws RecognitionException {
        try {
            int _type = BITWISE_LEFT_SHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:197:19: ( '<<' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:197:22: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BITWISE_LEFT_SHIFT"

    // $ANTLR start "BITWISE_RIGHT_SHIFT"
    public final void mBITWISE_RIGHT_SHIFT() throws RecognitionException {
        try {
            int _type = BITWISE_RIGHT_SHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:198:20: ( '>>' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:198:23: '>>'
            {
            match(">>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BITWISE_RIGHT_SHIFT"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:199:6: ( '.' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:199:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:200:8: ( ':' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:200:11: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:201:8: ( ',' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:201:11: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:202:11: ( ';' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:202:14: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:203:10: ( '(' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:203:13: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:204:10: ( ')' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:204:13: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LSQUARE"
    public final void mLSQUARE() throws RecognitionException {
        try {
            int _type = LSQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:205:10: ( '[' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:205:13: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LSQUARE"

    // $ANTLR start "RSQUARE"
    public final void mRSQUARE() throws RecognitionException {
        try {
            int _type = RSQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:206:10: ( ']' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:206:13: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RSQUARE"

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:207:10: ( '{' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:207:13: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LCURLY"

    // $ANTLR start "RCURLY"
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:208:10: ( '}' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:208:13: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RCURLY"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:211:3: ( F_ID1 | F_ID2 )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                alt3=1;
            }
            else if ( (LA3_0=='[') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:211:5: F_ID1
                    {
                    mF_ID1(); 


                    }
                    break;
                case 2 :
                    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:211:13: F_ID2
                    {
                    mF_ID2(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "F_ID1"
    public final void mF_ID1() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:212:15: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:212:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:212:41: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "F_ID1"

    // $ANTLR start "F_ID2"
    public final void mF_ID2() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:213:15: ( '[' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | ' ' | '\\\\' | '/' | '-' | '+' | '*' | '.' | ':' | '$' )* ']' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:213:17: '[' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | ' ' | '\\\\' | '/' | '-' | '+' | '*' | '.' | ':' | '$' )* ']'
            {
            match('['); 

            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:213:21: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | ' ' | '\\\\' | '/' | '-' | '+' | '*' | '.' | ':' | '$' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==' '||LA5_0=='$'||(LA5_0 >= '*' && LA5_0 <= '+')||(LA5_0 >= '-' && LA5_0 <= ':')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='\\'||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            	    {
            	    if ( input.LA(1)==' '||input.LA(1)=='$'||(input.LA(1) >= '*' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='\\'||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match(']'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "F_ID2"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:215:5: ( ( '0' .. '9' )+ )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:215:7: ( '0' .. '9' )+
            {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:215:7: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:219:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:219:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:219:9: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    match('.'); 

                    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:219:25: ( '0' .. '9' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:219:37: ( EXPONENT )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:219:37: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:220:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 

                    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:220:13: ( '0' .. '9' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:220:25: ( EXPONENT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='E'||LA11_0=='e') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:220:25: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:221:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:221:9: ( '0' .. '9' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    mEXPONENT(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:225:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:225:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 



            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:225:14: (~ ( '\\n' | '\\r' ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0 >= '\u0000' && LA14_0 <= '\t')||(LA14_0 >= '\u000B' && LA14_0 <= '\f')||(LA14_0 >= '\u000E' && LA14_0 <= '\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:225:28: ( '\\r' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:225:28: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:227:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:227:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:235:5: ( '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\'' )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:235:8: '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\''
            {
            match('\''); 

            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:235:13: ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )*
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='\\') ) {
                    alt16=1;
                }
                else if ( ((LA16_0 >= '\u0000' && LA16_0 <= '&')||(LA16_0 >= '(' && LA16_0 <= '[')||(LA16_0 >= ']' && LA16_0 <= '\uFFFF')) ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:235:15: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:235:25: ~ ( '\\\\' | '\\'' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:240:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:240:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:240:22: ( '+' | '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='+'||LA17_0=='-') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:240:33: ( '0' .. '9' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0 >= '0' && LA18_0 <= '9')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:243:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:247:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt19=1;
                    }
                    break;
                case 'u':
                    {
                    alt19=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt19=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:247:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:248:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:249:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:254:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\\') ) {
                int LA20_1 = input.LA(2);

                if ( ((LA20_1 >= '0' && LA20_1 <= '3')) ) {
                    int LA20_2 = input.LA(3);

                    if ( ((LA20_2 >= '0' && LA20_2 <= '7')) ) {
                        int LA20_4 = input.LA(4);

                        if ( ((LA20_4 >= '0' && LA20_4 <= '7')) ) {
                            alt20=1;
                        }
                        else {
                            alt20=2;
                        }
                    }
                    else {
                        alt20=3;
                    }
                }
                else if ( ((LA20_1 >= '4' && LA20_1 <= '7')) ) {
                    int LA20_3 = input.LA(3);

                    if ( ((LA20_3 >= '0' && LA20_3 <= '7')) ) {
                        alt20=2;
                    }
                    else {
                        alt20=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:254:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:255:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:256:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:261:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:261:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 

            match('u'); 

            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESC"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:264:11: ( ( 'a' | 'A' ) )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "B"
    public final void mB() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:265:11: ( ( 'b' | 'B' ) )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "B"

    // $ANTLR start "C"
    public final void mC() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:266:11: ( ( 'c' | 'C' ) )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "C"

    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:267:11: ( ( 'd' | 'D' ) )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:268:11: ( ( 'e' | 'E' ) )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:269:11: ( ( 'f' | 'F' ) )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "F"

    // $ANTLR start "G"
    public final void mG() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:270:11: ( ( 'g' | 'G' ) )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "G"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:271:11: ( ( 'h' | 'H' ) )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "H"

    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:272:11: ( ( 'i' | 'I' ) )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "I"

    // $ANTLR start "J"
    public final void mJ() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:273:11: ( ( 'j' | 'J' ) )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "J"

    // $ANTLR start "K"
    public final void mK() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:274:11: ( ( 'k' | 'K' ) )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            {
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K"

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:275:11: ( ( 'l' | 'L' ) )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:276:11: ( ( 'm' | 'M' ) )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "M"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:277:11: ( ( 'n' | 'N' ) )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:278:11: ( ( 'o' | 'O' ) )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "O"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:279:11: ( ( 'p' | 'P' ) )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "P"

    // $ANTLR start "Q"
    public final void mQ() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:280:11: ( ( 'q' | 'Q' ) )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            {
            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Q"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:281:11: ( ( 'r' | 'R' ) )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "R"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:282:11: ( ( 's' | 'S' ) )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "S"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:283:11: ( ( 't' | 'T' ) )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:284:11: ( ( 'u' | 'U' ) )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "U"

    // $ANTLR start "V"
    public final void mV() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:285:11: ( ( 'v' | 'V' ) )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "V"

    // $ANTLR start "W"
    public final void mW() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:286:11: ( ( 'w' | 'W' ) )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "W"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:287:11: ( ( 'x' | 'X' ) )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "X"

    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:288:11: ( ( 'y' | 'Y' ) )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Y"

    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:289:11: ( ( 'z' | 'Z' ) )
            // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            {
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Z"

    public void mTokens() throws RecognitionException {
        // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:8: ( SELECT | WITHIN | RECORD | AS | FROM | INNER | LEFT | OUTER | JOIN | ON | WHERE | GROUPBY | HAVING | ORDERBY | DESC | ASC | LIMIT | LOGICAL_OR | LOGICAL_AND | LOGICAL_NOT | CONTAINS | IN | BITWISE_AND | BITWISE_NOT | BITWISE_OR | BITWISE_XOR | EQUAL | NOT_EQUAL | LESS_THAN_OR_EQUAL | LESS_THAN | GREATER_THAN_OR_EQUAL | GREATER_THAN | SLASH | DIV | STAR | ADD | SUBSTRUCT | REMAINDER | BITWISE_LEFT_SHIFT | BITWISE_RIGHT_SHIFT | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | ID | INT | FLOAT | COMMENT | WS | STRING )
        int alt21=56;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:10: SELECT
                {
                mSELECT(); 


                }
                break;
            case 2 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:17: WITHIN
                {
                mWITHIN(); 


                }
                break;
            case 3 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:24: RECORD
                {
                mRECORD(); 


                }
                break;
            case 4 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:31: AS
                {
                mAS(); 


                }
                break;
            case 5 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:34: FROM
                {
                mFROM(); 


                }
                break;
            case 6 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:39: INNER
                {
                mINNER(); 


                }
                break;
            case 7 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:45: LEFT
                {
                mLEFT(); 


                }
                break;
            case 8 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:50: OUTER
                {
                mOUTER(); 


                }
                break;
            case 9 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:56: JOIN
                {
                mJOIN(); 


                }
                break;
            case 10 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:61: ON
                {
                mON(); 


                }
                break;
            case 11 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:64: WHERE
                {
                mWHERE(); 


                }
                break;
            case 12 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:70: GROUPBY
                {
                mGROUPBY(); 


                }
                break;
            case 13 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:78: HAVING
                {
                mHAVING(); 


                }
                break;
            case 14 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:85: ORDERBY
                {
                mORDERBY(); 


                }
                break;
            case 15 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:93: DESC
                {
                mDESC(); 


                }
                break;
            case 16 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:98: ASC
                {
                mASC(); 


                }
                break;
            case 17 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:102: LIMIT
                {
                mLIMIT(); 


                }
                break;
            case 18 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:108: LOGICAL_OR
                {
                mLOGICAL_OR(); 


                }
                break;
            case 19 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:119: LOGICAL_AND
                {
                mLOGICAL_AND(); 


                }
                break;
            case 20 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:131: LOGICAL_NOT
                {
                mLOGICAL_NOT(); 


                }
                break;
            case 21 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:143: CONTAINS
                {
                mCONTAINS(); 


                }
                break;
            case 22 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:152: IN
                {
                mIN(); 


                }
                break;
            case 23 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:155: BITWISE_AND
                {
                mBITWISE_AND(); 


                }
                break;
            case 24 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:167: BITWISE_NOT
                {
                mBITWISE_NOT(); 


                }
                break;
            case 25 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:179: BITWISE_OR
                {
                mBITWISE_OR(); 


                }
                break;
            case 26 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:190: BITWISE_XOR
                {
                mBITWISE_XOR(); 


                }
                break;
            case 27 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:202: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 28 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:208: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 29 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:218: LESS_THAN_OR_EQUAL
                {
                mLESS_THAN_OR_EQUAL(); 


                }
                break;
            case 30 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:237: LESS_THAN
                {
                mLESS_THAN(); 


                }
                break;
            case 31 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:247: GREATER_THAN_OR_EQUAL
                {
                mGREATER_THAN_OR_EQUAL(); 


                }
                break;
            case 32 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:269: GREATER_THAN
                {
                mGREATER_THAN(); 


                }
                break;
            case 33 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:282: SLASH
                {
                mSLASH(); 


                }
                break;
            case 34 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:288: DIV
                {
                mDIV(); 


                }
                break;
            case 35 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:292: STAR
                {
                mSTAR(); 


                }
                break;
            case 36 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:297: ADD
                {
                mADD(); 


                }
                break;
            case 37 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:301: SUBSTRUCT
                {
                mSUBSTRUCT(); 


                }
                break;
            case 38 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:311: REMAINDER
                {
                mREMAINDER(); 


                }
                break;
            case 39 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:321: BITWISE_LEFT_SHIFT
                {
                mBITWISE_LEFT_SHIFT(); 


                }
                break;
            case 40 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:340: BITWISE_RIGHT_SHIFT
                {
                mBITWISE_RIGHT_SHIFT(); 


                }
                break;
            case 41 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:360: DOT
                {
                mDOT(); 


                }
                break;
            case 42 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:364: COLON
                {
                mCOLON(); 


                }
                break;
            case 43 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:370: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 44 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:376: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;
            case 45 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:386: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 46 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:393: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 47 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:400: LSQUARE
                {
                mLSQUARE(); 


                }
                break;
            case 48 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:408: RSQUARE
                {
                mRSQUARE(); 


                }
                break;
            case 49 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:416: LCURLY
                {
                mLCURLY(); 


                }
                break;
            case 50 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:423: RCURLY
                {
                mRCURLY(); 


                }
                break;
            case 51 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:430: ID
                {
                mID(); 


                }
                break;
            case 52 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:433: INT
                {
                mINT(); 


                }
                break;
            case 53 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:437: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 54 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:443: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 55 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:451: WS
                {
                mWS(); 


                }
                break;
            case 56 :
                // /home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:1:454: STRING
                {
                mSTRING(); 


                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA13_eotS =
        "\5\uffff";
    static final String DFA13_eofS =
        "\5\uffff";
    static final String DFA13_minS =
        "\2\56\3\uffff";
    static final String DFA13_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA13_specialS =
        "\5\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "218:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA21_eotS =
        "\1\uffff\16\47\5\uffff\1\100\1\uffff\1\103\1\105\1\51\4\uffff\1"+
        "\107\5\uffff\1\111\4\uffff\1\112\2\uffff\4\47\1\117\2\47\1\123\3"+
        "\47\1\130\1\131\6\47\15\uffff\4\47\1\uffff\1\145\1\146\1\47\1\uffff"+
        "\4\47\2\uffff\5\47\1\161\5\47\2\uffff\1\167\1\47\1\171\3\47\1\175"+
        "\2\47\1\u0080\1\uffff\3\47\1\u0084\1\47\1\uffff\1\u0086\1\uffff"+
        "\1\u0087\1\u0088\1\47\1\uffff\2\47\1\uffff\1\47\1\u008d\1\u008e"+
        "\1\uffff\1\u008f\5\uffff\1\u0090\1\47\4\uffff\1\47\1\u0093\1\uffff";
    static final String DFA21_eofS =
        "\u0094\uffff";
    static final String DFA21_minS =
        "\1\11\1\105\1\110\1\105\1\116\1\122\1\116\1\105\1\116\1\117\1\122"+
        "\1\101\1\105\2\117\5\uffff\1\74\1\uffff\1\75\1\57\1\104\4\uffff"+
        "\1\60\5\uffff\1\40\4\uffff\1\56\2\uffff\1\114\1\124\1\105\1\103"+
        "\1\60\1\104\1\117\1\60\1\106\1\115\1\124\2\60\1\111\1\117\1\126"+
        "\1\123\1\124\1\116\15\uffff\1\105\1\110\1\122\1\117\1\uffff\2\60"+
        "\1\115\1\uffff\1\105\1\124\1\111\1\105\2\uffff\1\105\1\116\1\125"+
        "\1\111\1\103\1\60\1\124\1\103\1\111\1\105\1\122\2\uffff\1\60\1\122"+
        "\1\60\1\124\2\122\1\60\1\120\1\116\1\60\1\uffff\1\101\1\124\1\116"+
        "\1\60\1\104\1\uffff\1\60\1\uffff\2\60\1\11\1\uffff\1\11\1\107\1"+
        "\uffff\1\111\2\60\1\uffff\1\60\5\uffff\1\60\1\116\4\uffff\1\123"+
        "\1\60\1\uffff";
    static final String DFA21_maxS =
        "\1\176\1\145\1\151\1\145\1\163\1\162\1\156\1\151\1\165\1\157\1\162"+
        "\1\141\1\145\2\157\5\uffff\1\76\1\uffff\1\76\1\57\1\104\4\uffff"+
        "\1\71\5\uffff\1\172\4\uffff\1\145\2\uffff\1\154\1\164\1\145\1\143"+
        "\1\172\1\144\1\157\1\172\1\146\1\155\1\164\2\172\1\151\1\157\1\166"+
        "\1\163\1\164\1\156\15\uffff\1\145\1\150\1\162\1\157\1\uffff\2\172"+
        "\1\155\1\uffff\1\145\1\164\1\151\1\145\2\uffff\1\145\1\156\1\165"+
        "\1\151\1\143\1\172\1\164\1\143\1\151\1\145\1\162\2\uffff\1\172\1"+
        "\162\1\172\1\164\2\162\1\172\1\160\1\156\1\172\1\uffff\1\141\1\164"+
        "\1\156\1\172\1\144\1\uffff\1\172\1\uffff\2\172\1\40\1\uffff\1\40"+
        "\1\147\1\uffff\1\151\2\172\1\uffff\1\172\5\uffff\1\172\1\156\4\uffff"+
        "\1\163\1\172\1\uffff";
    static final String DFA21_acceptS =
        "\17\uffff\1\27\1\30\1\31\1\32\1\33\1\uffff\1\34\3\uffff\1\43\1\44"+
        "\1\45\1\46\1\uffff\1\52\1\53\1\54\1\55\1\56\1\uffff\1\60\1\61\1"+
        "\62\1\63\1\uffff\1\67\1\70\23\uffff\1\35\1\47\1\36\1\37\1\50\1\40"+
        "\1\66\1\41\1\42\1\51\1\65\1\57\1\64\4\uffff\1\4\3\uffff\1\26\4\uffff"+
        "\1\12\1\22\13\uffff\1\20\1\23\12\uffff\1\24\5\uffff\1\5\1\uffff"+
        "\1\7\3\uffff\1\11\2\uffff\1\17\3\uffff\1\13\1\uffff\1\6\1\21\1\10"+
        "\1\16\1\14\2\uffff\1\1\1\2\1\3\1\15\2\uffff\1\25";
    static final String DFA21_specialS =
        "\u0094\uffff}>";
    static final String[] DFA21_transitionS = {
            "\2\51\2\uffff\1\51\22\uffff\1\30\1\25\3\uffff\1\34\1\17\1\52"+
            "\1\41\1\42\1\31\1\32\1\37\1\33\1\35\1\27\12\50\1\36\1\40\1\24"+
            "\1\23\1\26\2\uffff\1\4\1\47\1\16\1\14\1\47\1\5\1\12\1\13\1\6"+
            "\1\11\1\47\1\7\1\47\1\15\1\10\2\47\1\3\1\1\3\47\1\2\3\47\1\43"+
            "\1\uffff\1\44\1\22\1\47\1\uffff\1\4\1\47\1\16\1\14\1\47\1\5"+
            "\1\12\1\13\1\6\1\11\1\47\1\7\1\47\1\15\1\10\2\47\1\3\1\1\3\47"+
            "\1\2\3\47\1\45\1\21\1\46\1\20",
            "\1\53\37\uffff\1\53",
            "\1\55\1\54\36\uffff\1\55\1\54",
            "\1\56\37\uffff\1\56",
            "\1\60\4\uffff\1\57\32\uffff\1\60\4\uffff\1\57",
            "\1\61\37\uffff\1\61",
            "\1\62\37\uffff\1\62",
            "\1\63\3\uffff\1\64\33\uffff\1\63\3\uffff\1\64",
            "\1\66\3\uffff\1\67\2\uffff\1\65\30\uffff\1\66\3\uffff\1\67"+
            "\2\uffff\1\65",
            "\1\70\37\uffff\1\70",
            "\1\71\37\uffff\1\71",
            "\1\72\37\uffff\1\72",
            "\1\73\37\uffff\1\73",
            "\1\74\37\uffff\1\74",
            "\1\75\37\uffff\1\75",
            "",
            "",
            "",
            "",
            "",
            "\1\77\1\76\1\25",
            "",
            "\1\101\1\102",
            "\1\104",
            "\1\106",
            "",
            "",
            "",
            "",
            "\12\110",
            "",
            "",
            "",
            "",
            "",
            "\1\47\3\uffff\1\47\5\uffff\2\47\1\uffff\16\47\6\uffff\32\47"+
            "\1\uffff\2\47\1\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "",
            "\1\110\1\uffff\12\50\13\uffff\1\110\37\uffff\1\110",
            "",
            "",
            "\1\113\37\uffff\1\113",
            "\1\114\37\uffff\1\114",
            "\1\115\37\uffff\1\115",
            "\1\116\37\uffff\1\116",
            "\12\47\7\uffff\2\47\1\120\27\47\4\uffff\1\47\1\uffff\2\47\1"+
            "\120\27\47",
            "\1\121\37\uffff\1\121",
            "\1\122\37\uffff\1\122",
            "\12\47\7\uffff\15\47\1\124\14\47\4\uffff\1\47\1\uffff\15\47"+
            "\1\124\14\47",
            "\1\125\37\uffff\1\125",
            "\1\126\37\uffff\1\126",
            "\1\127\37\uffff\1\127",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\3\47\1\132\26\47\4\uffff\1\47\1\uffff\3\47\1"+
            "\132\26\47",
            "\1\133\37\uffff\1\133",
            "\1\134\37\uffff\1\134",
            "\1\135\37\uffff\1\135",
            "\1\136\37\uffff\1\136",
            "\1\137\37\uffff\1\137",
            "\1\140\37\uffff\1\140",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\141\37\uffff\1\141",
            "\1\142\37\uffff\1\142",
            "\1\143\37\uffff\1\143",
            "\1\144\37\uffff\1\144",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\147\37\uffff\1\147",
            "",
            "\1\150\37\uffff\1\150",
            "\1\151\37\uffff\1\151",
            "\1\152\37\uffff\1\152",
            "\1\153\37\uffff\1\153",
            "",
            "",
            "\1\154\37\uffff\1\154",
            "\1\155\37\uffff\1\155",
            "\1\156\37\uffff\1\156",
            "\1\157\37\uffff\1\157",
            "\1\160\37\uffff\1\160",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\162\37\uffff\1\162",
            "\1\163\37\uffff\1\163",
            "\1\164\37\uffff\1\164",
            "\1\165\37\uffff\1\165",
            "\1\166\37\uffff\1\166",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\170\37\uffff\1\170",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\172\37\uffff\1\172",
            "\1\173\37\uffff\1\173",
            "\1\174\37\uffff\1\174",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\176\37\uffff\1\176",
            "\1\177\37\uffff\1\177",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u0081\37\uffff\1\u0081",
            "\1\u0082\37\uffff\1\u0082",
            "\1\u0083\37\uffff\1\u0083",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0085\37\uffff\1\u0085",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\2\u0089\2\uffff\1\u0089\22\uffff\1\u0089",
            "",
            "\2\u008a\2\uffff\1\u008a\22\uffff\1\u008a",
            "\1\u008b\37\uffff\1\u008b",
            "",
            "\1\u008c\37\uffff\1\u008c",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0091\37\uffff\1\u0091",
            "",
            "",
            "",
            "",
            "\1\u0092\37\uffff\1\u0092",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( SELECT | WITHIN | RECORD | AS | FROM | INNER | LEFT | OUTER | JOIN | ON | WHERE | GROUPBY | HAVING | ORDERBY | DESC | ASC | LIMIT | LOGICAL_OR | LOGICAL_AND | LOGICAL_NOT | CONTAINS | IN | BITWISE_AND | BITWISE_NOT | BITWISE_OR | BITWISE_XOR | EQUAL | NOT_EQUAL | LESS_THAN_OR_EQUAL | LESS_THAN | GREATER_THAN_OR_EQUAL | GREATER_THAN | SLASH | DIV | STAR | ADD | SUBSTRUCT | REMAINDER | BITWISE_LEFT_SHIFT | BITWISE_RIGHT_SHIFT | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | ID | INT | FLOAT | COMMENT | WS | STRING );";
        }
    }
 

}