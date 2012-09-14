// $ANTLR 3.4 /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g 2012-09-14 11:52:52
package org.apache.drill.parsers.impl.drqlantlr.autogen;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


/**
 * Copyright 2010, BigDataCraft.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
@SuppressWarnings({"all", "warnings", "unchecked"})
public class DrqlAntlrParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ADD", "AS", "ASC", "B", "BITWISE_AND", "BITWISE_LEFT_SHIFT", "BITWISE_NOT", "BITWISE_OR", "BITWISE_RIGHT_SHIFT", "BITWISE_XOR", "C", "COLON", "COMMA", "COMMENT", "CONTAINS", "D", "DESC", "DIV", "DOT", "E", "EQUAL", "ESC_SEQ", "EXPONENT", "F", "FLOAT", "FROM", "F_ID1", "F_ID2", "G", "GREATER_THAN", "GREATER_THAN_OR_EQUAL", "GROUPBY", "H", "HAVING", "HEX_DIGIT", "I", "ID", "IN", "INNER", "INT", "J", "JOIN", "K", "L", "LCURLY", "LEFT", "LESS_THAN", "LESS_THAN_OR_EQUAL", "LIMIT", "LOGICAL_AND", "LOGICAL_NOT", "LOGICAL_OR", "LPAREN", "LSQUARE", "M", "N", "NOT_EQUAL", "N_ADD", "N_ALIAS", "N_ASC", "N_BITWISE_AND", "N_BITWISE_LEFT_SHIFT", "N_BITWISE_NOT", "N_BITWISE_OR", "N_BITWISE_RIGHT_SHIFT", "N_BITWISE_XOR", "N_CALL", "N_CALL_PARAMS", "N_COLUMN", "N_COLUMN_NAME", "N_CONTAINS", "N_DESC", "N_DIVIDE", "N_EQUAL", "N_EXPRESSION", "N_FLOAT", "N_FROM", "N_GREATER_THAN", "N_GREATER_THAN_OR_EQUAL", "N_GROUPBY", "N_HAVING", "N_ID", "N_IN", "N_INNER", "N_INT", "N_IN_PARAMS", "N_JOIN", "N_JOIN_ON", "N_JOIN_ON_LIST", "N_LEFTOUTER", "N_LESS_THAN", "N_LESS_THAN_OR_EQUAL", "N_LIMIT", "N_LOGICAL_AND", "N_LOGICAL_NOT", "N_LOGICAL_OR", "N_MULTIPLY", "N_NAME", "N_NOT_EQUAL", "N_OP", "N_ORDERBY", "N_REMAINDER", "N_SELECT", "N_SELECT_STATEMENT", "N_STRING", "N_SUBSTRUCT", "N_TABLE", "N_TABLE_NAME", "N_WHERE", "N_WITHIN", "N_WITHIN_RECORD", "O", "OCTAL_ESC", "ON", "ORDERBY", "OUTER", "P", "Q", "R", "RCURLY", "RECORD", "REMAINDER", "RPAREN", "RSQUARE", "S", "SELECT", "SEMICOLON", "SLASH", "STAR", "STRING", "SUBSTRUCT", "T", "U", "UNICODE_ESC", "V", "W", "WHERE", "WITHIN", "WS", "X", "Y", "Z"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public DrqlAntlrParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public DrqlAntlrParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return DrqlAntlrParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g"; }


    public static class request_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "request"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:44:1: request : selectStatement ( SEMICOLON !)? EOF !;
    public final DrqlAntlrParser.request_return request() throws RecognitionException {
        DrqlAntlrParser.request_return retval = new DrqlAntlrParser.request_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SEMICOLON2=null;
        Token EOF3=null;
        DrqlAntlrParser.selectStatement_return selectStatement1 =null;


        CommonTree SEMICOLON2_tree=null;
        CommonTree EOF3_tree=null;

        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:44:8: ( selectStatement ( SEMICOLON !)? EOF !)
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:44:10: selectStatement ( SEMICOLON !)? EOF !
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_selectStatement_in_request204);
            selectStatement1=selectStatement();

            state._fsp--;

            adaptor.addChild(root_0, selectStatement1.getTree());

            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:44:26: ( SEMICOLON !)?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==SEMICOLON) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:44:27: SEMICOLON !
                    {
                    SEMICOLON2=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_request207); 

                    }
                    break;

            }


            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_request212); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "request"


    public static class selectStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectStatement"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:47:1: selectStatement : selectClause fromClause ( joinClause )? ( whereClause )? ( havingClause )? ( groupbyClause )? ( orderbyClause )? ( limitClause )? -> ^( N_SELECT_STATEMENT fromClause selectClause ( joinClause )? ( whereClause )? ( groupbyClause )? ( havingClause )? ( orderbyClause )? ( limitClause )? ) ;
    public final DrqlAntlrParser.selectStatement_return selectStatement() throws RecognitionException {
        DrqlAntlrParser.selectStatement_return retval = new DrqlAntlrParser.selectStatement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        DrqlAntlrParser.selectClause_return selectClause4 =null;

        DrqlAntlrParser.fromClause_return fromClause5 =null;

        DrqlAntlrParser.joinClause_return joinClause6 =null;

        DrqlAntlrParser.whereClause_return whereClause7 =null;

        DrqlAntlrParser.havingClause_return havingClause8 =null;

        DrqlAntlrParser.groupbyClause_return groupbyClause9 =null;

        DrqlAntlrParser.orderbyClause_return orderbyClause10 =null;

        DrqlAntlrParser.limitClause_return limitClause11 =null;


        RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
        RewriteRuleSubtreeStream stream_orderbyClause=new RewriteRuleSubtreeStream(adaptor,"rule orderbyClause");
        RewriteRuleSubtreeStream stream_limitClause=new RewriteRuleSubtreeStream(adaptor,"rule limitClause");
        RewriteRuleSubtreeStream stream_joinClause=new RewriteRuleSubtreeStream(adaptor,"rule joinClause");
        RewriteRuleSubtreeStream stream_havingClause=new RewriteRuleSubtreeStream(adaptor,"rule havingClause");
        RewriteRuleSubtreeStream stream_selectClause=new RewriteRuleSubtreeStream(adaptor,"rule selectClause");
        RewriteRuleSubtreeStream stream_fromClause=new RewriteRuleSubtreeStream(adaptor,"rule fromClause");
        RewriteRuleSubtreeStream stream_groupbyClause=new RewriteRuleSubtreeStream(adaptor,"rule groupbyClause");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:47:16: ( selectClause fromClause ( joinClause )? ( whereClause )? ( havingClause )? ( groupbyClause )? ( orderbyClause )? ( limitClause )? -> ^( N_SELECT_STATEMENT fromClause selectClause ( joinClause )? ( whereClause )? ( groupbyClause )? ( havingClause )? ( orderbyClause )? ( limitClause )? ) )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:47:18: selectClause fromClause ( joinClause )? ( whereClause )? ( havingClause )? ( groupbyClause )? ( orderbyClause )? ( limitClause )?
            {
            pushFollow(FOLLOW_selectClause_in_selectStatement221);
            selectClause4=selectClause();

            state._fsp--;

            stream_selectClause.add(selectClause4.getTree());

            pushFollow(FOLLOW_fromClause_in_selectStatement223);
            fromClause5=fromClause();

            state._fsp--;

            stream_fromClause.add(fromClause5.getTree());

            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:47:42: ( joinClause )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==INNER||LA2_0==JOIN||LA2_0==LEFT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:47:42: joinClause
                    {
                    pushFollow(FOLLOW_joinClause_in_selectStatement225);
                    joinClause6=joinClause();

                    state._fsp--;

                    stream_joinClause.add(joinClause6.getTree());

                    }
                    break;

            }


            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:47:54: ( whereClause )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==WHERE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:47:54: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_selectStatement228);
                    whereClause7=whereClause();

                    state._fsp--;

                    stream_whereClause.add(whereClause7.getTree());

                    }
                    break;

            }


            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:48:5: ( havingClause )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==HAVING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:48:5: havingClause
                    {
                    pushFollow(FOLLOW_havingClause_in_selectStatement236);
                    havingClause8=havingClause();

                    state._fsp--;

                    stream_havingClause.add(havingClause8.getTree());

                    }
                    break;

            }


            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:48:19: ( groupbyClause )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==GROUPBY) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:48:19: groupbyClause
                    {
                    pushFollow(FOLLOW_groupbyClause_in_selectStatement239);
                    groupbyClause9=groupbyClause();

                    state._fsp--;

                    stream_groupbyClause.add(groupbyClause9.getTree());

                    }
                    break;

            }


            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:48:34: ( orderbyClause )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ORDERBY) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:48:34: orderbyClause
                    {
                    pushFollow(FOLLOW_orderbyClause_in_selectStatement242);
                    orderbyClause10=orderbyClause();

                    state._fsp--;

                    stream_orderbyClause.add(orderbyClause10.getTree());

                    }
                    break;

            }


            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:48:49: ( limitClause )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LIMIT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:48:49: limitClause
                    {
                    pushFollow(FOLLOW_limitClause_in_selectStatement245);
                    limitClause11=limitClause();

                    state._fsp--;

                    stream_limitClause.add(limitClause11.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: limitClause, fromClause, joinClause, groupbyClause, selectClause, whereClause, orderbyClause, havingClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 48:61: -> ^( N_SELECT_STATEMENT fromClause selectClause ( joinClause )? ( whereClause )? ( groupbyClause )? ( havingClause )? ( orderbyClause )? ( limitClause )? )
            {
                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:49:9: ^( N_SELECT_STATEMENT fromClause selectClause ( joinClause )? ( whereClause )? ( groupbyClause )? ( havingClause )? ( orderbyClause )? ( limitClause )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(N_SELECT_STATEMENT, "N_SELECT_STATEMENT")
                , root_1);

                adaptor.addChild(root_1, stream_fromClause.nextTree());

                adaptor.addChild(root_1, stream_selectClause.nextTree());

                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:49:54: ( joinClause )?
                if ( stream_joinClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_joinClause.nextTree());

                }
                stream_joinClause.reset();

                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:49:66: ( whereClause )?
                if ( stream_whereClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_whereClause.nextTree());

                }
                stream_whereClause.reset();

                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:50:9: ( groupbyClause )?
                if ( stream_groupbyClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_groupbyClause.nextTree());

                }
                stream_groupbyClause.reset();

                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:50:24: ( havingClause )?
                if ( stream_havingClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_havingClause.nextTree());

                }
                stream_havingClause.reset();

                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:50:38: ( orderbyClause )?
                if ( stream_orderbyClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_orderbyClause.nextTree());

                }
                stream_orderbyClause.reset();

                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:50:53: ( limitClause )?
                if ( stream_limitClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_limitClause.nextTree());

                }
                stream_limitClause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selectStatement"


    public static class selectClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectClause"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:53:1: selectClause : SELECT columnExpr ( COMMA columnExpr )* -> ^( N_SELECT ( columnExpr )+ ) ;
    public final DrqlAntlrParser.selectClause_return selectClause() throws RecognitionException {
        DrqlAntlrParser.selectClause_return retval = new DrqlAntlrParser.selectClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SELECT12=null;
        Token COMMA14=null;
        DrqlAntlrParser.columnExpr_return columnExpr13 =null;

        DrqlAntlrParser.columnExpr_return columnExpr15 =null;


        CommonTree SELECT12_tree=null;
        CommonTree COMMA14_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_SELECT=new RewriteRuleTokenStream(adaptor,"token SELECT");
        RewriteRuleSubtreeStream stream_columnExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnExpr");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:53:13: ( SELECT columnExpr ( COMMA columnExpr )* -> ^( N_SELECT ( columnExpr )+ ) )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:53:15: SELECT columnExpr ( COMMA columnExpr )*
            {
            SELECT12=(Token)match(input,SELECT,FOLLOW_SELECT_in_selectClause299);  
            stream_SELECT.add(SELECT12);


            pushFollow(FOLLOW_columnExpr_in_selectClause301);
            columnExpr13=columnExpr();

            state._fsp--;

            stream_columnExpr.add(columnExpr13.getTree());

            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:53:33: ( COMMA columnExpr )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:53:34: COMMA columnExpr
            	    {
            	    COMMA14=(Token)match(input,COMMA,FOLLOW_COMMA_in_selectClause304);  
            	    stream_COMMA.add(COMMA14);


            	    pushFollow(FOLLOW_columnExpr_in_selectClause306);
            	    columnExpr15=columnExpr();

            	    state._fsp--;

            	    stream_columnExpr.add(columnExpr15.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            // AST REWRITE
            // elements: columnExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 53:53: -> ^( N_SELECT ( columnExpr )+ )
            {
                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:54:5: ^( N_SELECT ( columnExpr )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(N_SELECT, "N_SELECT")
                , root_1);

                if ( !(stream_columnExpr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_columnExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_columnExpr.nextTree());

                }
                stream_columnExpr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selectClause"


    public static class columnExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "columnExpr"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:57:1: columnExpr : expr ( withinClause )? ( AS ID )? -> ^( N_COLUMN expr ( ^( N_ALIAS ID ) )? ( withinClause )? ) ;
    public final DrqlAntlrParser.columnExpr_return columnExpr() throws RecognitionException {
        DrqlAntlrParser.columnExpr_return retval = new DrqlAntlrParser.columnExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AS18=null;
        Token ID19=null;
        DrqlAntlrParser.expr_return expr16 =null;

        DrqlAntlrParser.withinClause_return withinClause17 =null;


        CommonTree AS18_tree=null;
        CommonTree ID19_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_withinClause=new RewriteRuleSubtreeStream(adaptor,"rule withinClause");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:57:11: ( expr ( withinClause )? ( AS ID )? -> ^( N_COLUMN expr ( ^( N_ALIAS ID ) )? ( withinClause )? ) )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:57:13: expr ( withinClause )? ( AS ID )?
            {
            pushFollow(FOLLOW_expr_in_columnExpr333);
            expr16=expr();

            state._fsp--;

            stream_expr.add(expr16.getTree());

            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:57:18: ( withinClause )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==WITHIN) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:57:18: withinClause
                    {
                    pushFollow(FOLLOW_withinClause_in_columnExpr335);
                    withinClause17=withinClause();

                    state._fsp--;

                    stream_withinClause.add(withinClause17.getTree());

                    }
                    break;

            }


            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:57:32: ( AS ID )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==AS) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:57:33: AS ID
                    {
                    AS18=(Token)match(input,AS,FOLLOW_AS_in_columnExpr339);  
                    stream_AS.add(AS18);


                    ID19=(Token)match(input,ID,FOLLOW_ID_in_columnExpr341);  
                    stream_ID.add(ID19);


                    }
                    break;

            }


            // AST REWRITE
            // elements: expr, ID, withinClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 57:41: -> ^( N_COLUMN expr ( ^( N_ALIAS ID ) )? ( withinClause )? )
            {
                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:58:5: ^( N_COLUMN expr ( ^( N_ALIAS ID ) )? ( withinClause )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(N_COLUMN, "N_COLUMN")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:58:21: ( ^( N_ALIAS ID ) )?
                if ( stream_ID.hasNext() ) {
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:58:21: ^( N_ALIAS ID )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(
                    (CommonTree)adaptor.create(N_ALIAS, "N_ALIAS")
                    , root_2);

                    adaptor.addChild(root_2, 
                    stream_ID.nextNode()
                    );

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_ID.reset();

                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:58:36: ( withinClause )?
                if ( stream_withinClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_withinClause.nextTree());

                }
                stream_withinClause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "columnExpr"


    public static class withinClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "withinClause"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:59:1: withinClause : ( WITHIN ( RECORD -> ^( N_WITHIN_RECORD ) | columnPath -> ^( N_WITHIN columnPath ) ) ) ;
    public final DrqlAntlrParser.withinClause_return withinClause() throws RecognitionException {
        DrqlAntlrParser.withinClause_return retval = new DrqlAntlrParser.withinClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token WITHIN20=null;
        Token RECORD21=null;
        DrqlAntlrParser.columnPath_return columnPath22 =null;


        CommonTree WITHIN20_tree=null;
        CommonTree RECORD21_tree=null;
        RewriteRuleTokenStream stream_WITHIN=new RewriteRuleTokenStream(adaptor,"token WITHIN");
        RewriteRuleTokenStream stream_RECORD=new RewriteRuleTokenStream(adaptor,"token RECORD");
        RewriteRuleSubtreeStream stream_columnPath=new RewriteRuleSubtreeStream(adaptor,"rule columnPath");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:59:13: ( ( WITHIN ( RECORD -> ^( N_WITHIN_RECORD ) | columnPath -> ^( N_WITHIN columnPath ) ) ) )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:59:15: ( WITHIN ( RECORD -> ^( N_WITHIN_RECORD ) | columnPath -> ^( N_WITHIN columnPath ) ) )
            {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:59:15: ( WITHIN ( RECORD -> ^( N_WITHIN_RECORD ) | columnPath -> ^( N_WITHIN columnPath ) ) )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:59:16: WITHIN ( RECORD -> ^( N_WITHIN_RECORD ) | columnPath -> ^( N_WITHIN columnPath ) )
            {
            WITHIN20=(Token)match(input,WITHIN,FOLLOW_WITHIN_in_withinClause374);  
            stream_WITHIN.add(WITHIN20);


            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:59:23: ( RECORD -> ^( N_WITHIN_RECORD ) | columnPath -> ^( N_WITHIN columnPath ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RECORD) ) {
                alt11=1;
            }
            else if ( (LA11_0==ID||LA11_0==STAR) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:59:24: RECORD
                    {
                    RECORD21=(Token)match(input,RECORD,FOLLOW_RECORD_in_withinClause377);  
                    stream_RECORD.add(RECORD21);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 59:31: -> ^( N_WITHIN_RECORD )
                    {
                        // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:59:34: ^( N_WITHIN_RECORD )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(N_WITHIN_RECORD, "N_WITHIN_RECORD")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:59:55: columnPath
                    {
                    pushFollow(FOLLOW_columnPath_in_withinClause387);
                    columnPath22=columnPath();

                    state._fsp--;

                    stream_columnPath.add(columnPath22.getTree());

                    // AST REWRITE
                    // elements: columnPath
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 59:66: -> ^( N_WITHIN columnPath )
                    {
                        // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:60:2: ^( N_WITHIN columnPath )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(N_WITHIN, "N_WITHIN")
                        , root_1);

                        adaptor.addChild(root_1, stream_columnPath.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }


            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "withinClause"


    public static class fromClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fromClause"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:63:1: fromClause : FROM subSelectStatement ( COMMA subSelectStatement )* -> ^( N_FROM ( subSelectStatement )+ ) ;
    public final DrqlAntlrParser.fromClause_return fromClause() throws RecognitionException {
        DrqlAntlrParser.fromClause_return retval = new DrqlAntlrParser.fromClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token FROM23=null;
        Token COMMA25=null;
        DrqlAntlrParser.subSelectStatement_return subSelectStatement24 =null;

        DrqlAntlrParser.subSelectStatement_return subSelectStatement26 =null;


        CommonTree FROM23_tree=null;
        CommonTree COMMA25_tree=null;
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_subSelectStatement=new RewriteRuleSubtreeStream(adaptor,"rule subSelectStatement");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:63:11: ( FROM subSelectStatement ( COMMA subSelectStatement )* -> ^( N_FROM ( subSelectStatement )+ ) )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:63:13: FROM subSelectStatement ( COMMA subSelectStatement )*
            {
            FROM23=(Token)match(input,FROM,FOLLOW_FROM_in_fromClause407);  
            stream_FROM.add(FROM23);


            pushFollow(FOLLOW_subSelectStatement_in_fromClause409);
            subSelectStatement24=subSelectStatement();

            state._fsp--;

            stream_subSelectStatement.add(subSelectStatement24.getTree());

            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:63:37: ( COMMA subSelectStatement )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:63:38: COMMA subSelectStatement
            	    {
            	    COMMA25=(Token)match(input,COMMA,FOLLOW_COMMA_in_fromClause412);  
            	    stream_COMMA.add(COMMA25);


            	    pushFollow(FOLLOW_subSelectStatement_in_fromClause414);
            	    subSelectStatement26=subSelectStatement();

            	    state._fsp--;

            	    stream_subSelectStatement.add(subSelectStatement26.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            // AST REWRITE
            // elements: subSelectStatement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 63:65: -> ^( N_FROM ( subSelectStatement )+ )
            {
                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:64:5: ^( N_FROM ( subSelectStatement )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(N_FROM, "N_FROM")
                , root_1);

                if ( !(stream_subSelectStatement.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_subSelectStatement.hasNext() ) {
                    adaptor.addChild(root_1, stream_subSelectStatement.nextTree());

                }
                stream_subSelectStatement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fromClause"


    public static class subSelectStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "subSelectStatement"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:65:1: subSelectStatement : ( tableName | ( LPAREN ! selectStatement RPAREN !) ) ;
    public final DrqlAntlrParser.subSelectStatement_return subSelectStatement() throws RecognitionException {
        DrqlAntlrParser.subSelectStatement_return retval = new DrqlAntlrParser.subSelectStatement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LPAREN28=null;
        Token RPAREN30=null;
        DrqlAntlrParser.tableName_return tableName27 =null;

        DrqlAntlrParser.selectStatement_return selectStatement29 =null;


        CommonTree LPAREN28_tree=null;
        CommonTree RPAREN30_tree=null;

        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:65:20: ( ( tableName | ( LPAREN ! selectStatement RPAREN !) ) )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:65:22: ( tableName | ( LPAREN ! selectStatement RPAREN !) )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:65:22: ( tableName | ( LPAREN ! selectStatement RPAREN !) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==LPAREN) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:65:23: tableName
                    {
                    pushFollow(FOLLOW_tableName_in_subSelectStatement437);
                    tableName27=tableName();

                    state._fsp--;

                    adaptor.addChild(root_0, tableName27.getTree());

                    }
                    break;
                case 2 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:65:35: ( LPAREN ! selectStatement RPAREN !)
                    {
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:65:35: ( LPAREN ! selectStatement RPAREN !)
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:65:36: LPAREN ! selectStatement RPAREN !
                    {
                    LPAREN28=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_subSelectStatement442); 

                    pushFollow(FOLLOW_selectStatement_in_subSelectStatement445);
                    selectStatement29=selectStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, selectStatement29.getTree());

                    RPAREN30=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_subSelectStatement447); 

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "subSelectStatement"


    public static class joinClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "joinClause"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:68:1: joinClause : joinClauseDesc JOIN joinClauseFrom ON joinConditionList -> ^( N_JOIN joinClauseDesc joinClauseFrom joinConditionList ) ;
    public final DrqlAntlrParser.joinClause_return joinClause() throws RecognitionException {
        DrqlAntlrParser.joinClause_return retval = new DrqlAntlrParser.joinClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token JOIN32=null;
        Token ON34=null;
        DrqlAntlrParser.joinClauseDesc_return joinClauseDesc31 =null;

        DrqlAntlrParser.joinClauseFrom_return joinClauseFrom33 =null;

        DrqlAntlrParser.joinConditionList_return joinConditionList35 =null;


        CommonTree JOIN32_tree=null;
        CommonTree ON34_tree=null;
        RewriteRuleTokenStream stream_ON=new RewriteRuleTokenStream(adaptor,"token ON");
        RewriteRuleTokenStream stream_JOIN=new RewriteRuleTokenStream(adaptor,"token JOIN");
        RewriteRuleSubtreeStream stream_joinClauseDesc=new RewriteRuleSubtreeStream(adaptor,"rule joinClauseDesc");
        RewriteRuleSubtreeStream stream_joinConditionList=new RewriteRuleSubtreeStream(adaptor,"rule joinConditionList");
        RewriteRuleSubtreeStream stream_joinClauseFrom=new RewriteRuleSubtreeStream(adaptor,"rule joinClauseFrom");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:68:11: ( joinClauseDesc JOIN joinClauseFrom ON joinConditionList -> ^( N_JOIN joinClauseDesc joinClauseFrom joinConditionList ) )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:68:13: joinClauseDesc JOIN joinClauseFrom ON joinConditionList
            {
            pushFollow(FOLLOW_joinClauseDesc_in_joinClause458);
            joinClauseDesc31=joinClauseDesc();

            state._fsp--;

            stream_joinClauseDesc.add(joinClauseDesc31.getTree());

            JOIN32=(Token)match(input,JOIN,FOLLOW_JOIN_in_joinClause460);  
            stream_JOIN.add(JOIN32);


            pushFollow(FOLLOW_joinClauseFrom_in_joinClause462);
            joinClauseFrom33=joinClauseFrom();

            state._fsp--;

            stream_joinClauseFrom.add(joinClauseFrom33.getTree());

            ON34=(Token)match(input,ON,FOLLOW_ON_in_joinClause464);  
            stream_ON.add(ON34);


            pushFollow(FOLLOW_joinConditionList_in_joinClause466);
            joinConditionList35=joinConditionList();

            state._fsp--;

            stream_joinConditionList.add(joinConditionList35.getTree());

            // AST REWRITE
            // elements: joinClauseFrom, joinConditionList, joinClauseDesc
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 68:69: -> ^( N_JOIN joinClauseDesc joinClauseFrom joinConditionList )
            {
                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:69:5: ^( N_JOIN joinClauseDesc joinClauseFrom joinConditionList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(N_JOIN, "N_JOIN")
                , root_1);

                adaptor.addChild(root_1, stream_joinClauseDesc.nextTree());

                adaptor.addChild(root_1, stream_joinClauseFrom.nextTree());

                adaptor.addChild(root_1, stream_joinConditionList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "joinClause"


    public static class joinClauseDesc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "joinClauseDesc"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:70:1: joinClauseDesc : ( ( ( INNER )? ) -> ^( N_INNER ) | ( LEFT OUTER ) -> ^( N_LEFTOUTER ) );
    public final DrqlAntlrParser.joinClauseDesc_return joinClauseDesc() throws RecognitionException {
        DrqlAntlrParser.joinClauseDesc_return retval = new DrqlAntlrParser.joinClauseDesc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INNER36=null;
        Token LEFT37=null;
        Token OUTER38=null;

        CommonTree INNER36_tree=null;
        CommonTree LEFT37_tree=null;
        CommonTree OUTER38_tree=null;
        RewriteRuleTokenStream stream_OUTER=new RewriteRuleTokenStream(adaptor,"token OUTER");
        RewriteRuleTokenStream stream_INNER=new RewriteRuleTokenStream(adaptor,"token INNER");
        RewriteRuleTokenStream stream_LEFT=new RewriteRuleTokenStream(adaptor,"token LEFT");

        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:70:15: ( ( ( INNER )? ) -> ^( N_INNER ) | ( LEFT OUTER ) -> ^( N_LEFTOUTER ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==INNER||LA15_0==JOIN) ) {
                alt15=1;
            }
            else if ( (LA15_0==LEFT) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:70:17: ( ( INNER )? )
                    {
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:70:17: ( ( INNER )? )
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:70:18: ( INNER )?
                    {
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:70:18: ( INNER )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==INNER) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:70:18: INNER
                            {
                            INNER36=(Token)match(input,INNER,FOLLOW_INNER_in_joinClauseDesc489);  
                            stream_INNER.add(INNER36);


                            }
                            break;

                    }


                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 70:26: -> ^( N_INNER )
                    {
                        // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:70:29: ^( N_INNER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(N_INNER, "N_INNER")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:70:42: ( LEFT OUTER )
                    {
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:70:42: ( LEFT OUTER )
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:70:43: LEFT OUTER
                    {
                    LEFT37=(Token)match(input,LEFT,FOLLOW_LEFT_in_joinClauseDesc502);  
                    stream_LEFT.add(LEFT37);


                    OUTER38=(Token)match(input,OUTER,FOLLOW_OUTER_in_joinClauseDesc504);  
                    stream_OUTER.add(OUTER38);


                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 70:55: -> ^( N_LEFTOUTER )
                    {
                        // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:70:58: ^( N_LEFTOUTER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(N_LEFTOUTER, "N_LEFTOUTER")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "joinClauseDesc"


    public static class joinClauseFrom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "joinClauseFrom"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:71:1: joinClauseFrom : ( optionallyAliasedTable -> ^( N_TABLE optionallyAliasedTable ) | aliasedSubSelectStatement -> ^( N_TABLE aliasedSubSelectStatement ) );
    public final DrqlAntlrParser.joinClauseFrom_return joinClauseFrom() throws RecognitionException {
        DrqlAntlrParser.joinClauseFrom_return retval = new DrqlAntlrParser.joinClauseFrom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        DrqlAntlrParser.optionallyAliasedTable_return optionallyAliasedTable39 =null;

        DrqlAntlrParser.aliasedSubSelectStatement_return aliasedSubSelectStatement40 =null;


        RewriteRuleSubtreeStream stream_optionallyAliasedTable=new RewriteRuleSubtreeStream(adaptor,"rule optionallyAliasedTable");
        RewriteRuleSubtreeStream stream_aliasedSubSelectStatement=new RewriteRuleSubtreeStream(adaptor,"rule aliasedSubSelectStatement");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:71:15: ( optionallyAliasedTable -> ^( N_TABLE optionallyAliasedTable ) | aliasedSubSelectStatement -> ^( N_TABLE aliasedSubSelectStatement ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==LPAREN) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:71:17: optionallyAliasedTable
                    {
                    pushFollow(FOLLOW_optionallyAliasedTable_in_joinClauseFrom517);
                    optionallyAliasedTable39=optionallyAliasedTable();

                    state._fsp--;

                    stream_optionallyAliasedTable.add(optionallyAliasedTable39.getTree());

                    // AST REWRITE
                    // elements: optionallyAliasedTable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 71:40: -> ^( N_TABLE optionallyAliasedTable )
                    {
                        // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:71:43: ^( N_TABLE optionallyAliasedTable )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(N_TABLE, "N_TABLE")
                        , root_1);

                        adaptor.addChild(root_1, stream_optionallyAliasedTable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:72:5: aliasedSubSelectStatement
                    {
                    pushFollow(FOLLOW_aliasedSubSelectStatement_in_joinClauseFrom534);
                    aliasedSubSelectStatement40=aliasedSubSelectStatement();

                    state._fsp--;

                    stream_aliasedSubSelectStatement.add(aliasedSubSelectStatement40.getTree());

                    // AST REWRITE
                    // elements: aliasedSubSelectStatement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 72:31: -> ^( N_TABLE aliasedSubSelectStatement )
                    {
                        // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:72:34: ^( N_TABLE aliasedSubSelectStatement )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(N_TABLE, "N_TABLE")
                        , root_1);

                        adaptor.addChild(root_1, stream_aliasedSubSelectStatement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "joinClauseFrom"


    public static class optionallyAliasedTable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "optionallyAliasedTable"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:73:1: optionallyAliasedTable : tableName ( AS ID )? -> ^( N_TABLE tableName ( ID )? ) ;
    public final DrqlAntlrParser.optionallyAliasedTable_return optionallyAliasedTable() throws RecognitionException {
        DrqlAntlrParser.optionallyAliasedTable_return retval = new DrqlAntlrParser.optionallyAliasedTable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AS42=null;
        Token ID43=null;
        DrqlAntlrParser.tableName_return tableName41 =null;


        CommonTree AS42_tree=null;
        CommonTree ID43_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:73:23: ( tableName ( AS ID )? -> ^( N_TABLE tableName ( ID )? ) )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:73:25: tableName ( AS ID )?
            {
            pushFollow(FOLLOW_tableName_in_optionallyAliasedTable548);
            tableName41=tableName();

            state._fsp--;

            stream_tableName.add(tableName41.getTree());

            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:73:35: ( AS ID )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==AS) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:73:36: AS ID
                    {
                    AS42=(Token)match(input,AS,FOLLOW_AS_in_optionallyAliasedTable551);  
                    stream_AS.add(AS42);


                    ID43=(Token)match(input,ID,FOLLOW_ID_in_optionallyAliasedTable553);  
                    stream_ID.add(ID43);


                    }
                    break;

            }


            // AST REWRITE
            // elements: tableName, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 73:44: -> ^( N_TABLE tableName ( ID )? )
            {
                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:73:47: ^( N_TABLE tableName ( ID )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(N_TABLE, "N_TABLE")
                , root_1);

                adaptor.addChild(root_1, stream_tableName.nextTree());

                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:73:67: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "optionallyAliasedTable"


    public static class aliasedSubSelectStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aliasedSubSelectStatement"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:74:1: aliasedSubSelectStatement : LPAREN selectStatement RPAREN AS tableName -> ^( N_TABLE selectStatement tableName ) ;
    public final DrqlAntlrParser.aliasedSubSelectStatement_return aliasedSubSelectStatement() throws RecognitionException {
        DrqlAntlrParser.aliasedSubSelectStatement_return retval = new DrqlAntlrParser.aliasedSubSelectStatement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LPAREN44=null;
        Token RPAREN46=null;
        Token AS47=null;
        DrqlAntlrParser.selectStatement_return selectStatement45 =null;

        DrqlAntlrParser.tableName_return tableName48 =null;


        CommonTree LPAREN44_tree=null;
        CommonTree RPAREN46_tree=null;
        CommonTree AS47_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_selectStatement=new RewriteRuleSubtreeStream(adaptor,"rule selectStatement");
        RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:74:26: ( LPAREN selectStatement RPAREN AS tableName -> ^( N_TABLE selectStatement tableName ) )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:74:28: LPAREN selectStatement RPAREN AS tableName
            {
            LPAREN44=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_aliasedSubSelectStatement572);  
            stream_LPAREN.add(LPAREN44);


            pushFollow(FOLLOW_selectStatement_in_aliasedSubSelectStatement574);
            selectStatement45=selectStatement();

            state._fsp--;

            stream_selectStatement.add(selectStatement45.getTree());

            RPAREN46=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_aliasedSubSelectStatement576);  
            stream_RPAREN.add(RPAREN46);


            AS47=(Token)match(input,AS,FOLLOW_AS_in_aliasedSubSelectStatement578);  
            stream_AS.add(AS47);


            pushFollow(FOLLOW_tableName_in_aliasedSubSelectStatement580);
            tableName48=tableName();

            state._fsp--;

            stream_tableName.add(tableName48.getTree());

            // AST REWRITE
            // elements: tableName, selectStatement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 74:71: -> ^( N_TABLE selectStatement tableName )
            {
                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:75:5: ^( N_TABLE selectStatement tableName )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(N_TABLE, "N_TABLE")
                , root_1);

                adaptor.addChild(root_1, stream_selectStatement.nextTree());

                adaptor.addChild(root_1, stream_tableName.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "aliasedSubSelectStatement"


    public static class joinConditionList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "joinConditionList"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:76:1: joinConditionList : joinCondition ( LOGICAL_AND joinCondition )* -> ^( N_JOIN_ON_LIST ( joinCondition )+ ) ;
    public final DrqlAntlrParser.joinConditionList_return joinConditionList() throws RecognitionException {
        DrqlAntlrParser.joinConditionList_return retval = new DrqlAntlrParser.joinConditionList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LOGICAL_AND50=null;
        DrqlAntlrParser.joinCondition_return joinCondition49 =null;

        DrqlAntlrParser.joinCondition_return joinCondition51 =null;


        CommonTree LOGICAL_AND50_tree=null;
        RewriteRuleTokenStream stream_LOGICAL_AND=new RewriteRuleTokenStream(adaptor,"token LOGICAL_AND");
        RewriteRuleSubtreeStream stream_joinCondition=new RewriteRuleSubtreeStream(adaptor,"rule joinCondition");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:76:18: ( joinCondition ( LOGICAL_AND joinCondition )* -> ^( N_JOIN_ON_LIST ( joinCondition )+ ) )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:76:20: joinCondition ( LOGICAL_AND joinCondition )*
            {
            pushFollow(FOLLOW_joinCondition_in_joinConditionList600);
            joinCondition49=joinCondition();

            state._fsp--;

            stream_joinCondition.add(joinCondition49.getTree());

            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:76:34: ( LOGICAL_AND joinCondition )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==LOGICAL_AND) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:76:35: LOGICAL_AND joinCondition
            	    {
            	    LOGICAL_AND50=(Token)match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_joinConditionList603);  
            	    stream_LOGICAL_AND.add(LOGICAL_AND50);


            	    pushFollow(FOLLOW_joinCondition_in_joinConditionList605);
            	    joinCondition51=joinCondition();

            	    state._fsp--;

            	    stream_joinCondition.add(joinCondition51.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            // AST REWRITE
            // elements: joinCondition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 76:63: -> ^( N_JOIN_ON_LIST ( joinCondition )+ )
            {
                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:77:5: ^( N_JOIN_ON_LIST ( joinCondition )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(N_JOIN_ON_LIST, "N_JOIN_ON_LIST")
                , root_1);

                if ( !(stream_joinCondition.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_joinCondition.hasNext() ) {
                    adaptor.addChild(root_1, stream_joinCondition.nextTree());

                }
                stream_joinCondition.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "joinConditionList"


    public static class joinCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "joinCondition"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:78:1: joinCondition : a= columnPath EQUAL b= columnPath -> ^( N_JOIN_ON $a $b) ;
    public final DrqlAntlrParser.joinCondition_return joinCondition() throws RecognitionException {
        DrqlAntlrParser.joinCondition_return retval = new DrqlAntlrParser.joinCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQUAL52=null;
        DrqlAntlrParser.columnPath_return a =null;

        DrqlAntlrParser.columnPath_return b =null;


        CommonTree EQUAL52_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_columnPath=new RewriteRuleSubtreeStream(adaptor,"rule columnPath");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:78:14: (a= columnPath EQUAL b= columnPath -> ^( N_JOIN_ON $a $b) )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:78:16: a= columnPath EQUAL b= columnPath
            {
            pushFollow(FOLLOW_columnPath_in_joinCondition628);
            a=columnPath();

            state._fsp--;

            stream_columnPath.add(a.getTree());

            EQUAL52=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_joinCondition630);  
            stream_EQUAL.add(EQUAL52);


            pushFollow(FOLLOW_columnPath_in_joinCondition634);
            b=columnPath();

            state._fsp--;

            stream_columnPath.add(b.getTree());

            // AST REWRITE
            // elements: a, b
            // token labels: 
            // rule labels: retval, b, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 78:48: -> ^( N_JOIN_ON $a $b)
            {
                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:78:51: ^( N_JOIN_ON $a $b)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(N_JOIN_ON, "N_JOIN_ON")
                , root_1);

                adaptor.addChild(root_1, stream_a.nextTree());

                adaptor.addChild(root_1, stream_b.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "joinCondition"


    public static class whereClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whereClause"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:81:1: whereClause : WHERE expr -> ^( N_WHERE expr ) ;
    public final DrqlAntlrParser.whereClause_return whereClause() throws RecognitionException {
        DrqlAntlrParser.whereClause_return retval = new DrqlAntlrParser.whereClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token WHERE53=null;
        DrqlAntlrParser.expr_return expr54 =null;


        CommonTree WHERE53_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:81:12: ( WHERE expr -> ^( N_WHERE expr ) )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:81:14: WHERE expr
            {
            WHERE53=(Token)match(input,WHERE,FOLLOW_WHERE_in_whereClause654);  
            stream_WHERE.add(WHERE53);


            pushFollow(FOLLOW_expr_in_whereClause656);
            expr54=expr();

            state._fsp--;

            stream_expr.add(expr54.getTree());

            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 81:25: -> ^( N_WHERE expr )
            {
                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:81:28: ^( N_WHERE expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(N_WHERE, "N_WHERE")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whereClause"


    public static class groupbyClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupbyClause"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:84:1: groupbyClause : GROUPBY columnName ( COMMA columnName )* -> ^( N_GROUPBY ( columnName )+ ) ;
    public final DrqlAntlrParser.groupbyClause_return groupbyClause() throws RecognitionException {
        DrqlAntlrParser.groupbyClause_return retval = new DrqlAntlrParser.groupbyClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token GROUPBY55=null;
        Token COMMA57=null;
        DrqlAntlrParser.columnName_return columnName56 =null;

        DrqlAntlrParser.columnName_return columnName58 =null;


        CommonTree GROUPBY55_tree=null;
        CommonTree COMMA57_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_GROUPBY=new RewriteRuleTokenStream(adaptor,"token GROUPBY");
        RewriteRuleSubtreeStream stream_columnName=new RewriteRuleSubtreeStream(adaptor,"rule columnName");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:84:14: ( GROUPBY columnName ( COMMA columnName )* -> ^( N_GROUPBY ( columnName )+ ) )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:84:16: GROUPBY columnName ( COMMA columnName )*
            {
            GROUPBY55=(Token)match(input,GROUPBY,FOLLOW_GROUPBY_in_groupbyClause672);  
            stream_GROUPBY.add(GROUPBY55);


            pushFollow(FOLLOW_columnName_in_groupbyClause674);
            columnName56=columnName();

            state._fsp--;

            stream_columnName.add(columnName56.getTree());

            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:84:35: ( COMMA columnName )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==COMMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:84:36: COMMA columnName
            	    {
            	    COMMA57=(Token)match(input,COMMA,FOLLOW_COMMA_in_groupbyClause677);  
            	    stream_COMMA.add(COMMA57);


            	    pushFollow(FOLLOW_columnName_in_groupbyClause679);
            	    columnName58=columnName();

            	    state._fsp--;

            	    stream_columnName.add(columnName58.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            // AST REWRITE
            // elements: columnName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 84:55: -> ^( N_GROUPBY ( columnName )+ )
            {
                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:85:5: ^( N_GROUPBY ( columnName )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(N_GROUPBY, "N_GROUPBY")
                , root_1);

                if ( !(stream_columnName.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_columnName.hasNext() ) {
                    adaptor.addChild(root_1, stream_columnName.nextTree());

                }
                stream_columnName.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "groupbyClause"


    public static class havingClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "havingClause"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:88:1: havingClause : HAVING expr -> ^( N_HAVING expr ) ;
    public final DrqlAntlrParser.havingClause_return havingClause() throws RecognitionException {
        DrqlAntlrParser.havingClause_return retval = new DrqlAntlrParser.havingClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token HAVING59=null;
        DrqlAntlrParser.expr_return expr60 =null;


        CommonTree HAVING59_tree=null;
        RewriteRuleTokenStream stream_HAVING=new RewriteRuleTokenStream(adaptor,"token HAVING");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:88:13: ( HAVING expr -> ^( N_HAVING expr ) )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:88:15: HAVING expr
            {
            HAVING59=(Token)match(input,HAVING,FOLLOW_HAVING_in_havingClause703);  
            stream_HAVING.add(HAVING59);


            pushFollow(FOLLOW_expr_in_havingClause705);
            expr60=expr();

            state._fsp--;

            stream_expr.add(expr60.getTree());

            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 88:27: -> ^( N_HAVING expr )
            {
                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:88:30: ^( N_HAVING expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(N_HAVING, "N_HAVING")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "havingClause"


    public static class orderbyClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "orderbyClause"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:91:1: orderbyClause : ( ORDERBY orderbyColumnName ( COMMA orderbyColumnName )* ) -> ^( N_ORDERBY ( orderbyColumnName )+ ) ;
    public final DrqlAntlrParser.orderbyClause_return orderbyClause() throws RecognitionException {
        DrqlAntlrParser.orderbyClause_return retval = new DrqlAntlrParser.orderbyClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ORDERBY61=null;
        Token COMMA63=null;
        DrqlAntlrParser.orderbyColumnName_return orderbyColumnName62 =null;

        DrqlAntlrParser.orderbyColumnName_return orderbyColumnName64 =null;


        CommonTree ORDERBY61_tree=null;
        CommonTree COMMA63_tree=null;
        RewriteRuleTokenStream stream_ORDERBY=new RewriteRuleTokenStream(adaptor,"token ORDERBY");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_orderbyColumnName=new RewriteRuleSubtreeStream(adaptor,"rule orderbyColumnName");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:91:14: ( ( ORDERBY orderbyColumnName ( COMMA orderbyColumnName )* ) -> ^( N_ORDERBY ( orderbyColumnName )+ ) )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:91:16: ( ORDERBY orderbyColumnName ( COMMA orderbyColumnName )* )
            {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:91:16: ( ORDERBY orderbyColumnName ( COMMA orderbyColumnName )* )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:91:18: ORDERBY orderbyColumnName ( COMMA orderbyColumnName )*
            {
            ORDERBY61=(Token)match(input,ORDERBY,FOLLOW_ORDERBY_in_orderbyClause723);  
            stream_ORDERBY.add(ORDERBY61);


            pushFollow(FOLLOW_orderbyColumnName_in_orderbyClause725);
            orderbyColumnName62=orderbyColumnName();

            state._fsp--;

            stream_orderbyColumnName.add(orderbyColumnName62.getTree());

            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:91:44: ( COMMA orderbyColumnName )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==COMMA) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:91:45: COMMA orderbyColumnName
            	    {
            	    COMMA63=(Token)match(input,COMMA,FOLLOW_COMMA_in_orderbyClause728);  
            	    stream_COMMA.add(COMMA63);


            	    pushFollow(FOLLOW_orderbyColumnName_in_orderbyClause730);
            	    orderbyColumnName64=orderbyColumnName();

            	    state._fsp--;

            	    stream_orderbyColumnName.add(orderbyColumnName64.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            // AST REWRITE
            // elements: orderbyColumnName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 91:72: -> ^( N_ORDERBY ( orderbyColumnName )+ )
            {
                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:92:5: ^( N_ORDERBY ( orderbyColumnName )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(N_ORDERBY, "N_ORDERBY")
                , root_1);

                if ( !(stream_orderbyColumnName.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_orderbyColumnName.hasNext() ) {
                    adaptor.addChild(root_1, stream_orderbyColumnName.nextTree());

                }
                stream_orderbyColumnName.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "orderbyClause"


    public static class orderbyColumnName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "orderbyColumnName"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:93:1: orderbyColumnName : columnName ( ASC -> ^( N_ASC columnName ) | DESC -> ^( N_DESC columnName ) | -> ^( N_ASC columnName ) ) ;
    public final DrqlAntlrParser.orderbyColumnName_return orderbyColumnName() throws RecognitionException {
        DrqlAntlrParser.orderbyColumnName_return retval = new DrqlAntlrParser.orderbyColumnName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ASC66=null;
        Token DESC67=null;
        DrqlAntlrParser.columnName_return columnName65 =null;


        CommonTree ASC66_tree=null;
        CommonTree DESC67_tree=null;
        RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleSubtreeStream stream_columnName=new RewriteRuleSubtreeStream(adaptor,"rule columnName");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:93:18: ( columnName ( ASC -> ^( N_ASC columnName ) | DESC -> ^( N_DESC columnName ) | -> ^( N_ASC columnName ) ) )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:93:20: columnName ( ASC -> ^( N_ASC columnName ) | DESC -> ^( N_DESC columnName ) | -> ^( N_ASC columnName ) )
            {
            pushFollow(FOLLOW_columnName_in_orderbyColumnName752);
            columnName65=columnName();

            state._fsp--;

            stream_columnName.add(columnName65.getTree());

            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:93:31: ( ASC -> ^( N_ASC columnName ) | DESC -> ^( N_DESC columnName ) | -> ^( N_ASC columnName ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case ASC:
                {
                alt21=1;
                }
                break;
            case DESC:
                {
                alt21=2;
                }
                break;
            case EOF:
            case COMMA:
            case LIMIT:
            case RPAREN:
            case SEMICOLON:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:93:32: ASC
                    {
                    ASC66=(Token)match(input,ASC,FOLLOW_ASC_in_orderbyColumnName755);  
                    stream_ASC.add(ASC66);


                    // AST REWRITE
                    // elements: columnName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 93:36: -> ^( N_ASC columnName )
                    {
                        // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:93:39: ^( N_ASC columnName )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(N_ASC, "N_ASC")
                        , root_1);

                        adaptor.addChild(root_1, stream_columnName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:93:61: DESC
                    {
                    DESC67=(Token)match(input,DESC,FOLLOW_DESC_in_orderbyColumnName767);  
                    stream_DESC.add(DESC67);


                    // AST REWRITE
                    // elements: columnName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 93:66: -> ^( N_DESC columnName )
                    {
                        // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:94:5: ^( N_DESC columnName )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(N_DESC, "N_DESC")
                        , root_1);

                        adaptor.addChild(root_1, stream_columnName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:94:53: 
                    {
                    // AST REWRITE
                    // elements: columnName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 94:53: -> ^( N_ASC columnName )
                    {
                        // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:94:56: ^( N_ASC columnName )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(N_ASC, "N_ASC")
                        , root_1);

                        adaptor.addChild(root_1, stream_columnName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "orderbyColumnName"


    public static class limitClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "limitClause"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:97:1: limitClause : ( LIMIT INT ) -> ^( N_LIMIT INT ) ;
    public final DrqlAntlrParser.limitClause_return limitClause() throws RecognitionException {
        DrqlAntlrParser.limitClause_return retval = new DrqlAntlrParser.limitClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LIMIT68=null;
        Token INT69=null;

        CommonTree LIMIT68_tree=null;
        CommonTree INT69_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");

        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:97:12: ( ( LIMIT INT ) -> ^( N_LIMIT INT ) )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:97:14: ( LIMIT INT )
            {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:97:14: ( LIMIT INT )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:97:16: LIMIT INT
            {
            LIMIT68=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_limitClause808);  
            stream_LIMIT.add(LIMIT68);


            INT69=(Token)match(input,INT,FOLLOW_INT_in_limitClause810);  
            stream_INT.add(INT69);


            }


            // AST REWRITE
            // elements: INT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 97:28: -> ^( N_LIMIT INT )
            {
                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:97:31: ^( N_LIMIT INT )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(N_LIMIT, "N_LIMIT")
                , root_1);

                adaptor.addChild(root_1, 
                stream_INT.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "limitClause"


    public static class columnPath_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "columnPath"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:100:1: columnPath : columnPath2 -> ^( N_ID columnPath2 ) ;
    public final DrqlAntlrParser.columnPath_return columnPath() throws RecognitionException {
        DrqlAntlrParser.columnPath_return retval = new DrqlAntlrParser.columnPath_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        DrqlAntlrParser.columnPath2_return columnPath270 =null;


        RewriteRuleSubtreeStream stream_columnPath2=new RewriteRuleSubtreeStream(adaptor,"rule columnPath2");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:100:11: ( columnPath2 -> ^( N_ID columnPath2 ) )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:100:13: columnPath2
            {
            pushFollow(FOLLOW_columnPath2_in_columnPath828);
            columnPath270=columnPath2();

            state._fsp--;

            stream_columnPath2.add(columnPath270.getTree());

            // AST REWRITE
            // elements: columnPath2
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 100:25: -> ^( N_ID columnPath2 )
            {
                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:100:28: ^( N_ID columnPath2 )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(N_ID, "N_ID")
                , root_1);

                adaptor.addChild(root_1, stream_columnPath2.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "columnPath"


    public static class columnPath2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "columnPath2"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:101:1: columnPath2 : columnName ( DOT ! columnName )* ;
    public final DrqlAntlrParser.columnPath2_return columnPath2() throws RecognitionException {
        DrqlAntlrParser.columnPath2_return retval = new DrqlAntlrParser.columnPath2_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DOT72=null;
        DrqlAntlrParser.columnName_return columnName71 =null;

        DrqlAntlrParser.columnName_return columnName73 =null;


        CommonTree DOT72_tree=null;

        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:101:12: ( columnName ( DOT ! columnName )* )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:101:14: columnName ( DOT ! columnName )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_columnName_in_columnPath2842);
            columnName71=columnName();

            state._fsp--;

            adaptor.addChild(root_0, columnName71.getTree());

            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:101:25: ( DOT ! columnName )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==DOT) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:101:26: DOT ! columnName
            	    {
            	    DOT72=(Token)match(input,DOT,FOLLOW_DOT_in_columnPath2845); 

            	    pushFollow(FOLLOW_columnName_in_columnPath2848);
            	    columnName73=columnName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, columnName73.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "columnPath2"


    public static class columnName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "columnName"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:102:1: columnName : ( ID -> ^( N_NAME ID ) | STAR -> ^( N_NAME STAR ) );
    public final DrqlAntlrParser.columnName_return columnName() throws RecognitionException {
        DrqlAntlrParser.columnName_return retval = new DrqlAntlrParser.columnName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID74=null;
        Token STAR75=null;

        CommonTree ID74_tree=null;
        CommonTree STAR75_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:102:11: ( ID -> ^( N_NAME ID ) | STAR -> ^( N_NAME STAR ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ID) ) {
                alt23=1;
            }
            else if ( (LA23_0==STAR) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:102:13: ID
                    {
                    ID74=(Token)match(input,ID,FOLLOW_ID_in_columnName856);  
                    stream_ID.add(ID74);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 102:16: -> ^( N_NAME ID )
                    {
                        // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:102:19: ^( N_NAME ID )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(N_NAME, "N_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:102:34: STAR
                    {
                    STAR75=(Token)match(input,STAR,FOLLOW_STAR_in_columnName868);  
                    stream_STAR.add(STAR75);


                    // AST REWRITE
                    // elements: STAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 102:39: -> ^( N_NAME STAR )
                    {
                        // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:102:42: ^( N_NAME STAR )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(N_NAME, "N_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_STAR.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "columnName"


    public static class tablePath_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tablePath"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:105:1: tablePath : tablePath2 -> ^( N_TABLE tablePath2 ) ;
    public final DrqlAntlrParser.tablePath_return tablePath() throws RecognitionException {
        DrqlAntlrParser.tablePath_return retval = new DrqlAntlrParser.tablePath_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        DrqlAntlrParser.tablePath2_return tablePath276 =null;


        RewriteRuleSubtreeStream stream_tablePath2=new RewriteRuleSubtreeStream(adaptor,"rule tablePath2");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:105:10: ( tablePath2 -> ^( N_TABLE tablePath2 ) )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:105:12: tablePath2
            {
            pushFollow(FOLLOW_tablePath2_in_tablePath884);
            tablePath276=tablePath2();

            state._fsp--;

            stream_tablePath2.add(tablePath276.getTree());

            // AST REWRITE
            // elements: tablePath2
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 105:23: -> ^( N_TABLE tablePath2 )
            {
                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:105:26: ^( N_TABLE tablePath2 )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(N_TABLE, "N_TABLE")
                , root_1);

                adaptor.addChild(root_1, stream_tablePath2.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tablePath"


    public static class tablePath2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tablePath2"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:106:1: tablePath2 : tableName ( DOT ! tableName )* ;
    public final DrqlAntlrParser.tablePath2_return tablePath2() throws RecognitionException {
        DrqlAntlrParser.tablePath2_return retval = new DrqlAntlrParser.tablePath2_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DOT78=null;
        DrqlAntlrParser.tableName_return tableName77 =null;

        DrqlAntlrParser.tableName_return tableName79 =null;


        CommonTree DOT78_tree=null;

        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:106:11: ( tableName ( DOT ! tableName )* )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:106:13: tableName ( DOT ! tableName )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_tableName_in_tablePath2898);
            tableName77=tableName();

            state._fsp--;

            adaptor.addChild(root_0, tableName77.getTree());

            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:106:23: ( DOT ! tableName )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==DOT) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:106:24: DOT ! tableName
            	    {
            	    DOT78=(Token)match(input,DOT,FOLLOW_DOT_in_tablePath2901); 

            	    pushFollow(FOLLOW_tableName_in_tablePath2904);
            	    tableName79=tableName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, tableName79.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tablePath2"


    public static class tableName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableName"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:107:1: tableName : ID -> ^( N_TABLE_NAME ID ) ;
    public final DrqlAntlrParser.tableName_return tableName() throws RecognitionException {
        DrqlAntlrParser.tableName_return retval = new DrqlAntlrParser.tableName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID80=null;

        CommonTree ID80_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:107:10: ( ID -> ^( N_TABLE_NAME ID ) )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:107:12: ID
            {
            ID80=(Token)match(input,ID,FOLLOW_ID_in_tableName918);  
            stream_ID.add(ID80);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 107:15: -> ^( N_TABLE_NAME ID )
            {
                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:107:18: ^( N_TABLE_NAME ID )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(N_TABLE_NAME, "N_TABLE_NAME")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tableName"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:110:1: expr : expr2 -> ^( N_EXPRESSION expr2 ) ;
    public final DrqlAntlrParser.expr_return expr() throws RecognitionException {
        DrqlAntlrParser.expr_return retval = new DrqlAntlrParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        DrqlAntlrParser.expr2_return expr281 =null;


        RewriteRuleSubtreeStream stream_expr2=new RewriteRuleSubtreeStream(adaptor,"rule expr2");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:110:5: ( expr2 -> ^( N_EXPRESSION expr2 ) )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:110:7: expr2
            {
            pushFollow(FOLLOW_expr2_in_expr934);
            expr281=expr2();

            state._fsp--;

            stream_expr2.add(expr281.getTree());

            // AST REWRITE
            // elements: expr2
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 110:13: -> ^( N_EXPRESSION expr2 )
            {
                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:110:16: ^( N_EXPRESSION expr2 )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(N_EXPRESSION, "N_EXPRESSION")
                , root_1);

                adaptor.addChild(root_1, stream_expr2.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class expr2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr2"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:111:1: expr2 : (a= b10e -> $a) (o= b11o b= b10e -> ^( $o $expr2 $b) )* ;
    public final DrqlAntlrParser.expr2_return expr2() throws RecognitionException {
        DrqlAntlrParser.expr2_return retval = new DrqlAntlrParser.expr2_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        DrqlAntlrParser.b10e_return a =null;

        DrqlAntlrParser.b11o_return o =null;

        DrqlAntlrParser.b10e_return b =null;


        RewriteRuleSubtreeStream stream_b10e=new RewriteRuleSubtreeStream(adaptor,"rule b10e");
        RewriteRuleSubtreeStream stream_b11o=new RewriteRuleSubtreeStream(adaptor,"rule b11o");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:111:6: ( (a= b10e -> $a) (o= b11o b= b10e -> ^( $o $expr2 $b) )* )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:111:7: (a= b10e -> $a) (o= b11o b= b10e -> ^( $o $expr2 $b) )*
            {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:111:7: (a= b10e -> $a)
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:111:8: a= b10e
            {
            pushFollow(FOLLOW_b10e_in_expr2950);
            a=b10e();

            state._fsp--;

            stream_b10e.add(a.getTree());

            // AST REWRITE
            // elements: a
            // token labels: 
            // rule labels: retval, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 111:14: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextTree());

            }


            retval.tree = root_0;

            }


            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:111:20: (o= b11o b= b10e -> ^( $o $expr2 $b) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==LOGICAL_OR) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:111:21: o= b11o b= b10e
            	    {
            	    pushFollow(FOLLOW_b11o_in_expr2959);
            	    o=b11o();

            	    state._fsp--;

            	    stream_b11o.add(o.getTree());

            	    pushFollow(FOLLOW_b10e_in_expr2963);
            	    b=b10e();

            	    state._fsp--;

            	    stream_b10e.add(b.getTree());

            	    // AST REWRITE
            	    // elements: o, b, expr2
            	    // token labels: 
            	    // rule labels: retval, b, o
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
            	    RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 111:35: -> ^( $o $expr2 $b)
            	    {
            	        // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:111:38: ^( $o $expr2 $b)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_b.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr2"


    public static class b10e_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "b10e"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:112:1: b10e : (a= b9e -> $a) (o= b10o b= b9e -> ^( $o $b10e $b) )* ;
    public final DrqlAntlrParser.b10e_return b10e() throws RecognitionException {
        DrqlAntlrParser.b10e_return retval = new DrqlAntlrParser.b10e_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        DrqlAntlrParser.b9e_return a =null;

        DrqlAntlrParser.b10o_return o =null;

        DrqlAntlrParser.b9e_return b =null;


        RewriteRuleSubtreeStream stream_b9e=new RewriteRuleSubtreeStream(adaptor,"rule b9e");
        RewriteRuleSubtreeStream stream_b10o=new RewriteRuleSubtreeStream(adaptor,"rule b10o");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:112:5: ( (a= b9e -> $a) (o= b10o b= b9e -> ^( $o $b10e $b) )* )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:112:7: (a= b9e -> $a) (o= b10o b= b9e -> ^( $o $b10e $b) )*
            {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:112:7: (a= b9e -> $a)
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:112:8: a= b9e
            {
            pushFollow(FOLLOW_b9e_in_b10e987);
            a=b9e();

            state._fsp--;

            stream_b9e.add(a.getTree());

            // AST REWRITE
            // elements: a
            // token labels: 
            // rule labels: retval, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 112:13: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextTree());

            }


            retval.tree = root_0;

            }


            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:112:19: (o= b10o b= b9e -> ^( $o $b10e $b) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==LOGICAL_AND) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:112:20: o= b10o b= b9e
            	    {
            	    pushFollow(FOLLOW_b10o_in_b10e996);
            	    o=b10o();

            	    state._fsp--;

            	    stream_b10o.add(o.getTree());

            	    pushFollow(FOLLOW_b9e_in_b10e1000);
            	    b=b9e();

            	    state._fsp--;

            	    stream_b9e.add(b.getTree());

            	    // AST REWRITE
            	    // elements: b10e, o, b
            	    // token labels: 
            	    // rule labels: retval, b, o
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
            	    RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 112:33: -> ^( $o $b10e $b)
            	    {
            	        // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:112:36: ^( $o $b10e $b)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_b.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "b10e"


    public static class b9e_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "b9e"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:113:1: b9e : (a= b8e -> $a) (o= b9o b= b8e -> ^( $o $b9e $b) )* ;
    public final DrqlAntlrParser.b9e_return b9e() throws RecognitionException {
        DrqlAntlrParser.b9e_return retval = new DrqlAntlrParser.b9e_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        DrqlAntlrParser.b8e_return a =null;

        DrqlAntlrParser.b9o_return o =null;

        DrqlAntlrParser.b8e_return b =null;


        RewriteRuleSubtreeStream stream_b9o=new RewriteRuleSubtreeStream(adaptor,"rule b9o");
        RewriteRuleSubtreeStream stream_b8e=new RewriteRuleSubtreeStream(adaptor,"rule b8e");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:113:4: ( (a= b8e -> $a) (o= b9o b= b8e -> ^( $o $b9e $b) )* )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:113:7: (a= b8e -> $a) (o= b9o b= b8e -> ^( $o $b9e $b) )*
            {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:113:7: (a= b8e -> $a)
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:113:8: a= b8e
            {
            pushFollow(FOLLOW_b8e_in_b9e1025);
            a=b8e();

            state._fsp--;

            stream_b8e.add(a.getTree());

            // AST REWRITE
            // elements: a
            // token labels: 
            // rule labels: retval, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 113:13: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextTree());

            }


            retval.tree = root_0;

            }


            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:113:19: (o= b9o b= b8e -> ^( $o $b9e $b) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==BITWISE_OR) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:113:20: o= b9o b= b8e
            	    {
            	    pushFollow(FOLLOW_b9o_in_b9e1034);
            	    o=b9o();

            	    state._fsp--;

            	    stream_b9o.add(o.getTree());

            	    pushFollow(FOLLOW_b8e_in_b9e1038);
            	    b=b8e();

            	    state._fsp--;

            	    stream_b8e.add(b.getTree());

            	    // AST REWRITE
            	    // elements: b, o, b9e
            	    // token labels: 
            	    // rule labels: retval, b, o
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
            	    RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 113:33: -> ^( $o $b9e $b)
            	    {
            	        // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:113:36: ^( $o $b9e $b)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_b.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "b9e"


    public static class b8e_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "b8e"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:114:1: b8e : (a= b7e -> $a) (o= b8o b= b7e -> ^( $o $b8e $b) )* ;
    public final DrqlAntlrParser.b8e_return b8e() throws RecognitionException {
        DrqlAntlrParser.b8e_return retval = new DrqlAntlrParser.b8e_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        DrqlAntlrParser.b7e_return a =null;

        DrqlAntlrParser.b8o_return o =null;

        DrqlAntlrParser.b7e_return b =null;


        RewriteRuleSubtreeStream stream_b8o=new RewriteRuleSubtreeStream(adaptor,"rule b8o");
        RewriteRuleSubtreeStream stream_b7e=new RewriteRuleSubtreeStream(adaptor,"rule b7e");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:114:4: ( (a= b7e -> $a) (o= b8o b= b7e -> ^( $o $b8e $b) )* )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:114:7: (a= b7e -> $a) (o= b8o b= b7e -> ^( $o $b8e $b) )*
            {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:114:7: (a= b7e -> $a)
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:114:8: a= b7e
            {
            pushFollow(FOLLOW_b7e_in_b8e1064);
            a=b7e();

            state._fsp--;

            stream_b7e.add(a.getTree());

            // AST REWRITE
            // elements: a
            // token labels: 
            // rule labels: retval, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 114:13: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextTree());

            }


            retval.tree = root_0;

            }


            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:114:19: (o= b8o b= b7e -> ^( $o $b8e $b) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==BITWISE_XOR) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:114:20: o= b8o b= b7e
            	    {
            	    pushFollow(FOLLOW_b8o_in_b8e1073);
            	    o=b8o();

            	    state._fsp--;

            	    stream_b8o.add(o.getTree());

            	    pushFollow(FOLLOW_b7e_in_b8e1077);
            	    b=b7e();

            	    state._fsp--;

            	    stream_b7e.add(b.getTree());

            	    // AST REWRITE
            	    // elements: b, o, b8e
            	    // token labels: 
            	    // rule labels: retval, b, o
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
            	    RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 114:33: -> ^( $o $b8e $b)
            	    {
            	        // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:114:36: ^( $o $b8e $b)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_b.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "b8e"


    public static class b7e_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "b7e"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:115:1: b7e : (a= b6e -> $a) (o= b7o b= b6e -> ^( $o $b7e $b) )* ;
    public final DrqlAntlrParser.b7e_return b7e() throws RecognitionException {
        DrqlAntlrParser.b7e_return retval = new DrqlAntlrParser.b7e_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        DrqlAntlrParser.b6e_return a =null;

        DrqlAntlrParser.b7o_return o =null;

        DrqlAntlrParser.b6e_return b =null;


        RewriteRuleSubtreeStream stream_b6e=new RewriteRuleSubtreeStream(adaptor,"rule b6e");
        RewriteRuleSubtreeStream stream_b7o=new RewriteRuleSubtreeStream(adaptor,"rule b7o");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:115:4: ( (a= b6e -> $a) (o= b7o b= b6e -> ^( $o $b7e $b) )* )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:115:7: (a= b6e -> $a) (o= b7o b= b6e -> ^( $o $b7e $b) )*
            {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:115:7: (a= b6e -> $a)
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:115:8: a= b6e
            {
            pushFollow(FOLLOW_b6e_in_b7e1103);
            a=b6e();

            state._fsp--;

            stream_b6e.add(a.getTree());

            // AST REWRITE
            // elements: a
            // token labels: 
            // rule labels: retval, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 115:13: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextTree());

            }


            retval.tree = root_0;

            }


            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:115:19: (o= b7o b= b6e -> ^( $o $b7e $b) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==BITWISE_AND) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:115:20: o= b7o b= b6e
            	    {
            	    pushFollow(FOLLOW_b7o_in_b7e1112);
            	    o=b7o();

            	    state._fsp--;

            	    stream_b7o.add(o.getTree());

            	    pushFollow(FOLLOW_b6e_in_b7e1116);
            	    b=b6e();

            	    state._fsp--;

            	    stream_b6e.add(b.getTree());

            	    // AST REWRITE
            	    // elements: o, b, b7e
            	    // token labels: 
            	    // rule labels: retval, b, o
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
            	    RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 115:33: -> ^( $o $b7e $b)
            	    {
            	        // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:115:36: ^( $o $b7e $b)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_b.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "b7e"


    public static class b6e_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "b6e"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:116:1: b6e : (a= b5e -> $a) (o= b6o b= b5e -> ^( $o $b6e $b) )* ;
    public final DrqlAntlrParser.b6e_return b6e() throws RecognitionException {
        DrqlAntlrParser.b6e_return retval = new DrqlAntlrParser.b6e_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        DrqlAntlrParser.b5e_return a =null;

        DrqlAntlrParser.b6o_return o =null;

        DrqlAntlrParser.b5e_return b =null;


        RewriteRuleSubtreeStream stream_b5e=new RewriteRuleSubtreeStream(adaptor,"rule b5e");
        RewriteRuleSubtreeStream stream_b6o=new RewriteRuleSubtreeStream(adaptor,"rule b6o");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:116:4: ( (a= b5e -> $a) (o= b6o b= b5e -> ^( $o $b6e $b) )* )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:116:7: (a= b5e -> $a) (o= b6o b= b5e -> ^( $o $b6e $b) )*
            {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:116:7: (a= b5e -> $a)
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:116:8: a= b5e
            {
            pushFollow(FOLLOW_b5e_in_b6e1142);
            a=b5e();

            state._fsp--;

            stream_b5e.add(a.getTree());

            // AST REWRITE
            // elements: a
            // token labels: 
            // rule labels: retval, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 116:13: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextTree());

            }


            retval.tree = root_0;

            }


            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:116:19: (o= b6o b= b5e -> ^( $o $b6e $b) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==EQUAL||LA30_0==NOT_EQUAL) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:116:20: o= b6o b= b5e
            	    {
            	    pushFollow(FOLLOW_b6o_in_b6e1151);
            	    o=b6o();

            	    state._fsp--;

            	    stream_b6o.add(o.getTree());

            	    pushFollow(FOLLOW_b5e_in_b6e1155);
            	    b=b5e();

            	    state._fsp--;

            	    stream_b5e.add(b.getTree());

            	    // AST REWRITE
            	    // elements: o, b6e, b
            	    // token labels: 
            	    // rule labels: retval, b, o
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
            	    RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 116:33: -> ^( $o $b6e $b)
            	    {
            	        // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:116:36: ^( $o $b6e $b)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_b.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "b6e"


    public static class b5e_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "b5e"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:117:1: b5e : (a= b4e -> $a) (o= b5o b= b4e -> ^( $o $b5e $b) )* ;
    public final DrqlAntlrParser.b5e_return b5e() throws RecognitionException {
        DrqlAntlrParser.b5e_return retval = new DrqlAntlrParser.b5e_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        DrqlAntlrParser.b4e_return a =null;

        DrqlAntlrParser.b5o_return o =null;

        DrqlAntlrParser.b4e_return b =null;


        RewriteRuleSubtreeStream stream_b4e=new RewriteRuleSubtreeStream(adaptor,"rule b4e");
        RewriteRuleSubtreeStream stream_b5o=new RewriteRuleSubtreeStream(adaptor,"rule b5o");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:117:4: ( (a= b4e -> $a) (o= b5o b= b4e -> ^( $o $b5e $b) )* )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:117:7: (a= b4e -> $a) (o= b5o b= b4e -> ^( $o $b5e $b) )*
            {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:117:7: (a= b4e -> $a)
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:117:8: a= b4e
            {
            pushFollow(FOLLOW_b4e_in_b5e1181);
            a=b4e();

            state._fsp--;

            stream_b4e.add(a.getTree());

            // AST REWRITE
            // elements: a
            // token labels: 
            // rule labels: retval, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 117:13: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextTree());

            }


            retval.tree = root_0;

            }


            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:117:19: (o= b5o b= b4e -> ^( $o $b5e $b) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0 >= GREATER_THAN && LA31_0 <= GREATER_THAN_OR_EQUAL)||(LA31_0 >= LESS_THAN && LA31_0 <= LESS_THAN_OR_EQUAL)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:117:20: o= b5o b= b4e
            	    {
            	    pushFollow(FOLLOW_b5o_in_b5e1190);
            	    o=b5o();

            	    state._fsp--;

            	    stream_b5o.add(o.getTree());

            	    pushFollow(FOLLOW_b4e_in_b5e1194);
            	    b=b4e();

            	    state._fsp--;

            	    stream_b4e.add(b.getTree());

            	    // AST REWRITE
            	    // elements: o, b, b5e
            	    // token labels: 
            	    // rule labels: retval, b, o
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
            	    RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 117:33: -> ^( $o $b5e $b)
            	    {
            	        // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:117:36: ^( $o $b5e $b)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_b.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "b5e"


    public static class b4e_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "b4e"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:118:1: b4e : (a= b3e -> $a) (o= b4o b= b3e -> ^( $o $b4e $b) )* ;
    public final DrqlAntlrParser.b4e_return b4e() throws RecognitionException {
        DrqlAntlrParser.b4e_return retval = new DrqlAntlrParser.b4e_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        DrqlAntlrParser.b3e_return a =null;

        DrqlAntlrParser.b4o_return o =null;

        DrqlAntlrParser.b3e_return b =null;


        RewriteRuleSubtreeStream stream_b3e=new RewriteRuleSubtreeStream(adaptor,"rule b3e");
        RewriteRuleSubtreeStream stream_b4o=new RewriteRuleSubtreeStream(adaptor,"rule b4o");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:118:4: ( (a= b3e -> $a) (o= b4o b= b3e -> ^( $o $b4e $b) )* )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:118:7: (a= b3e -> $a) (o= b4o b= b3e -> ^( $o $b4e $b) )*
            {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:118:7: (a= b3e -> $a)
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:118:8: a= b3e
            {
            pushFollow(FOLLOW_b3e_in_b4e1220);
            a=b3e();

            state._fsp--;

            stream_b3e.add(a.getTree());

            // AST REWRITE
            // elements: a
            // token labels: 
            // rule labels: retval, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 118:13: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextTree());

            }


            retval.tree = root_0;

            }


            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:118:19: (o= b4o b= b3e -> ^( $o $b4e $b) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==BITWISE_LEFT_SHIFT||LA32_0==BITWISE_RIGHT_SHIFT) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:118:20: o= b4o b= b3e
            	    {
            	    pushFollow(FOLLOW_b4o_in_b4e1229);
            	    o=b4o();

            	    state._fsp--;

            	    stream_b4o.add(o.getTree());

            	    pushFollow(FOLLOW_b3e_in_b4e1233);
            	    b=b3e();

            	    state._fsp--;

            	    stream_b3e.add(b.getTree());

            	    // AST REWRITE
            	    // elements: o, b, b4e
            	    // token labels: 
            	    // rule labels: retval, b, o
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
            	    RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 118:33: -> ^( $o $b4e $b)
            	    {
            	        // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:118:36: ^( $o $b4e $b)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_b.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "b4e"


    public static class b3e_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "b3e"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:119:1: b3e : (a= b2e -> $a) (o= b3o b= b2e -> ^( $o $b3e $b) )* ;
    public final DrqlAntlrParser.b3e_return b3e() throws RecognitionException {
        DrqlAntlrParser.b3e_return retval = new DrqlAntlrParser.b3e_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        DrqlAntlrParser.b2e_return a =null;

        DrqlAntlrParser.b3o_return o =null;

        DrqlAntlrParser.b2e_return b =null;


        RewriteRuleSubtreeStream stream_b3o=new RewriteRuleSubtreeStream(adaptor,"rule b3o");
        RewriteRuleSubtreeStream stream_b2e=new RewriteRuleSubtreeStream(adaptor,"rule b2e");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:119:4: ( (a= b2e -> $a) (o= b3o b= b2e -> ^( $o $b3e $b) )* )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:119:7: (a= b2e -> $a) (o= b3o b= b2e -> ^( $o $b3e $b) )*
            {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:119:7: (a= b2e -> $a)
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:119:8: a= b2e
            {
            pushFollow(FOLLOW_b2e_in_b3e1259);
            a=b2e();

            state._fsp--;

            stream_b2e.add(a.getTree());

            // AST REWRITE
            // elements: a
            // token labels: 
            // rule labels: retval, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 119:13: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextTree());

            }


            retval.tree = root_0;

            }


            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:119:19: (o= b3o b= b2e -> ^( $o $b3e $b) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==ADD||LA33_0==SUBSTRUCT) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:119:20: o= b3o b= b2e
            	    {
            	    pushFollow(FOLLOW_b3o_in_b3e1268);
            	    o=b3o();

            	    state._fsp--;

            	    stream_b3o.add(o.getTree());

            	    pushFollow(FOLLOW_b2e_in_b3e1272);
            	    b=b2e();

            	    state._fsp--;

            	    stream_b2e.add(b.getTree());

            	    // AST REWRITE
            	    // elements: o, b3e, b
            	    // token labels: 
            	    // rule labels: retval, b, o
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
            	    RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 119:33: -> ^( $o $b3e $b)
            	    {
            	        // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:119:36: ^( $o $b3e $b)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_b.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "b3e"


    public static class b2e_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "b2e"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:120:1: b2e : (a= b1e -> $a) (o= b2o b= b1e -> ^( $o $b2e $b) )* ;
    public final DrqlAntlrParser.b2e_return b2e() throws RecognitionException {
        DrqlAntlrParser.b2e_return retval = new DrqlAntlrParser.b2e_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        DrqlAntlrParser.b1e_return a =null;

        DrqlAntlrParser.b2o_return o =null;

        DrqlAntlrParser.b1e_return b =null;


        RewriteRuleSubtreeStream stream_b2o=new RewriteRuleSubtreeStream(adaptor,"rule b2o");
        RewriteRuleSubtreeStream stream_b1e=new RewriteRuleSubtreeStream(adaptor,"rule b1e");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:120:4: ( (a= b1e -> $a) (o= b2o b= b1e -> ^( $o $b2e $b) )* )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:120:7: (a= b1e -> $a) (o= b2o b= b1e -> ^( $o $b2e $b) )*
            {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:120:7: (a= b1e -> $a)
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:120:8: a= b1e
            {
            pushFollow(FOLLOW_b1e_in_b2e1298);
            a=b1e();

            state._fsp--;

            stream_b1e.add(a.getTree());

            // AST REWRITE
            // elements: a
            // token labels: 
            // rule labels: retval, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 120:13: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextTree());

            }


            retval.tree = root_0;

            }


            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:120:19: (o= b2o b= b1e -> ^( $o $b2e $b) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==DIV||LA34_0==REMAINDER||(LA34_0 >= SLASH && LA34_0 <= STAR)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:120:20: o= b2o b= b1e
            	    {
            	    pushFollow(FOLLOW_b2o_in_b2e1307);
            	    o=b2o();

            	    state._fsp--;

            	    stream_b2o.add(o.getTree());

            	    pushFollow(FOLLOW_b1e_in_b2e1311);
            	    b=b1e();

            	    state._fsp--;

            	    stream_b1e.add(b.getTree());

            	    // AST REWRITE
            	    // elements: b, b2e, o
            	    // token labels: 
            	    // rule labels: retval, b, o
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
            	    RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 120:33: -> ^( $o $b2e $b)
            	    {
            	        // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:120:36: ^( $o $b2e $b)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_b.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "b2e"


    public static class b1e_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "b1e"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:121:1: b1e : (a= uPrefixExpr -> $a) (o= b1o b= uPrefixExpr -> ^( $o $b1e $b) )* ;
    public final DrqlAntlrParser.b1e_return b1e() throws RecognitionException {
        DrqlAntlrParser.b1e_return retval = new DrqlAntlrParser.b1e_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        DrqlAntlrParser.uPrefixExpr_return a =null;

        DrqlAntlrParser.b1o_return o =null;

        DrqlAntlrParser.uPrefixExpr_return b =null;


        RewriteRuleSubtreeStream stream_uPrefixExpr=new RewriteRuleSubtreeStream(adaptor,"rule uPrefixExpr");
        RewriteRuleSubtreeStream stream_b1o=new RewriteRuleSubtreeStream(adaptor,"rule b1o");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:121:4: ( (a= uPrefixExpr -> $a) (o= b1o b= uPrefixExpr -> ^( $o $b1e $b) )* )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:121:7: (a= uPrefixExpr -> $a) (o= b1o b= uPrefixExpr -> ^( $o $b1e $b) )*
            {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:121:7: (a= uPrefixExpr -> $a)
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:121:8: a= uPrefixExpr
            {
            pushFollow(FOLLOW_uPrefixExpr_in_b1e1337);
            a=uPrefixExpr();

            state._fsp--;

            stream_uPrefixExpr.add(a.getTree());

            // AST REWRITE
            // elements: a
            // token labels: 
            // rule labels: retval, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 121:21: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextTree());

            }


            retval.tree = root_0;

            }


            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:121:29: (o= b1o b= uPrefixExpr -> ^( $o $b1e $b) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==CONTAINS) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:121:30: o= b1o b= uPrefixExpr
            	    {
            	    pushFollow(FOLLOW_b1o_in_b1e1348);
            	    o=b1o();

            	    state._fsp--;

            	    stream_b1o.add(o.getTree());

            	    pushFollow(FOLLOW_uPrefixExpr_in_b1e1352);
            	    b=uPrefixExpr();

            	    state._fsp--;

            	    stream_uPrefixExpr.add(b.getTree());

            	    // AST REWRITE
            	    // elements: o, b, b1e
            	    // token labels: 
            	    // rule labels: retval, b, o
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
            	    RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 121:50: -> ^( $o $b1e $b)
            	    {
            	        // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:121:53: ^( $o $b1e $b)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_b.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "b1e"


    public static class uPrefixExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "uPrefixExpr"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:122:1: uPrefixExpr : (o= uPrefixOp -> ^( $o $uPrefixExpr) )* (a= uPostfixExpr -> $a) ;
    public final DrqlAntlrParser.uPrefixExpr_return uPrefixExpr() throws RecognitionException {
        DrqlAntlrParser.uPrefixExpr_return retval = new DrqlAntlrParser.uPrefixExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        DrqlAntlrParser.uPrefixOp_return o =null;

        DrqlAntlrParser.uPostfixExpr_return a =null;


        RewriteRuleSubtreeStream stream_uPrefixOp=new RewriteRuleSubtreeStream(adaptor,"rule uPrefixOp");
        RewriteRuleSubtreeStream stream_uPostfixExpr=new RewriteRuleSubtreeStream(adaptor,"rule uPostfixExpr");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:122:12: ( (o= uPrefixOp -> ^( $o $uPrefixExpr) )* (a= uPostfixExpr -> $a) )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:122:14: (o= uPrefixOp -> ^( $o $uPrefixExpr) )* (a= uPostfixExpr -> $a)
            {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:122:14: (o= uPrefixOp -> ^( $o $uPrefixExpr) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==BITWISE_NOT||LA36_0==LOGICAL_NOT) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:122:15: o= uPrefixOp
            	    {
            	    pushFollow(FOLLOW_uPrefixOp_in_uPrefixExpr1376);
            	    o=uPrefixOp();

            	    state._fsp--;

            	    stream_uPrefixOp.add(o.getTree());

            	    // AST REWRITE
            	    // elements: o, uPrefixExpr
            	    // token labels: 
            	    // rule labels: retval, o
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 122:26: -> ^( $o $uPrefixExpr)
            	    {
            	        // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:122:28: ^( $o $uPrefixExpr)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:122:49: (a= uPostfixExpr -> $a)
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:122:50: a= uPostfixExpr
            {
            pushFollow(FOLLOW_uPostfixExpr_in_uPrefixExpr1391);
            a=uPostfixExpr();

            state._fsp--;

            stream_uPostfixExpr.add(a.getTree());

            // AST REWRITE
            // elements: a
            // token labels: 
            // rule labels: retval, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 122:65: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextTree());

            }


            retval.tree = root_0;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "uPrefixExpr"


    public static class uPostfixExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "uPostfixExpr"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:123:1: uPostfixExpr : (a= atomExpr -> $a) (o= uPostfixOp -> ^( $o $uPostfixExpr) )* ;
    public final DrqlAntlrParser.uPostfixExpr_return uPostfixExpr() throws RecognitionException {
        DrqlAntlrParser.uPostfixExpr_return retval = new DrqlAntlrParser.uPostfixExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        DrqlAntlrParser.atomExpr_return a =null;

        DrqlAntlrParser.uPostfixOp_return o =null;


        RewriteRuleSubtreeStream stream_atomExpr=new RewriteRuleSubtreeStream(adaptor,"rule atomExpr");
        RewriteRuleSubtreeStream stream_uPostfixOp=new RewriteRuleSubtreeStream(adaptor,"rule uPostfixOp");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:123:13: ( (a= atomExpr -> $a) (o= uPostfixOp -> ^( $o $uPostfixExpr) )* )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:123:15: (a= atomExpr -> $a) (o= uPostfixOp -> ^( $o $uPostfixExpr) )*
            {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:123:15: (a= atomExpr -> $a)
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:123:16: a= atomExpr
            {
            pushFollow(FOLLOW_atomExpr_in_uPostfixExpr1407);
            a=atomExpr();

            state._fsp--;

            stream_atomExpr.add(a.getTree());

            // AST REWRITE
            // elements: a
            // token labels: 
            // rule labels: retval, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 123:26: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextTree());

            }


            retval.tree = root_0;

            }


            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:123:32: (o= uPostfixOp -> ^( $o $uPostfixExpr) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==IN||LA37_0==LPAREN) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:123:33: o= uPostfixOp
            	    {
            	    pushFollow(FOLLOW_uPostfixOp_in_uPostfixExpr1416);
            	    o=uPostfixOp();

            	    state._fsp--;

            	    stream_uPostfixOp.add(o.getTree());

            	    // AST REWRITE
            	    // elements: o, uPostfixExpr
            	    // token labels: 
            	    // rule labels: retval, o
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 123:46: -> ^( $o $uPostfixExpr)
            	    {
            	        // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:123:49: ^( $o $uPostfixExpr)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "uPostfixExpr"


    public static class atomExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atomExpr"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:124:1: atomExpr : ( INT -> ^( N_INT INT ) | FLOAT -> ^( N_FLOAT FLOAT ) | STRING -> ^( N_STRING STRING ) | ( LPAREN expr RPAREN ) -> expr | columnPath );
    public final DrqlAntlrParser.atomExpr_return atomExpr() throws RecognitionException {
        DrqlAntlrParser.atomExpr_return retval = new DrqlAntlrParser.atomExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INT82=null;
        Token FLOAT83=null;
        Token STRING84=null;
        Token LPAREN85=null;
        Token RPAREN87=null;
        DrqlAntlrParser.expr_return expr86 =null;

        DrqlAntlrParser.columnPath_return columnPath88 =null;


        CommonTree INT82_tree=null;
        CommonTree FLOAT83_tree=null;
        CommonTree STRING84_tree=null;
        CommonTree LPAREN85_tree=null;
        CommonTree RPAREN87_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:124:9: ( INT -> ^( N_INT INT ) | FLOAT -> ^( N_FLOAT FLOAT ) | STRING -> ^( N_STRING STRING ) | ( LPAREN expr RPAREN ) -> expr | columnPath )
            int alt38=5;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt38=1;
                }
                break;
            case FLOAT:
                {
                alt38=2;
                }
                break;
            case STRING:
                {
                alt38=3;
                }
                break;
            case LPAREN:
                {
                alt38=4;
                }
                break;
            case ID:
            case STAR:
                {
                alt38=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }

            switch (alt38) {
                case 1 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:124:11: INT
                    {
                    INT82=(Token)match(input,INT,FOLLOW_INT_in_atomExpr1434);  
                    stream_INT.add(INT82);


                    // AST REWRITE
                    // elements: INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 124:15: -> ^( N_INT INT )
                    {
                        // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:124:18: ^( N_INT INT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(N_INT, "N_INT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_INT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:125:7: FLOAT
                    {
                    FLOAT83=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_atomExpr1450);  
                    stream_FLOAT.add(FLOAT83);


                    // AST REWRITE
                    // elements: FLOAT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 125:13: -> ^( N_FLOAT FLOAT )
                    {
                        // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:125:16: ^( N_FLOAT FLOAT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(N_FLOAT, "N_FLOAT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_FLOAT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:126:7: STRING
                    {
                    STRING84=(Token)match(input,STRING,FOLLOW_STRING_in_atomExpr1466);  
                    stream_STRING.add(STRING84);


                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 126:14: -> ^( N_STRING STRING )
                    {
                        // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:126:17: ^( N_STRING STRING )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(N_STRING, "N_STRING")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_STRING.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:127:7: ( LPAREN expr RPAREN )
                    {
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:127:7: ( LPAREN expr RPAREN )
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:127:8: LPAREN expr RPAREN
                    {
                    LPAREN85=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atomExpr1485);  
                    stream_LPAREN.add(LPAREN85);


                    pushFollow(FOLLOW_expr_in_atomExpr1487);
                    expr86=expr();

                    state._fsp--;

                    stream_expr.add(expr86.getTree());

                    RPAREN87=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atomExpr1489);  
                    stream_RPAREN.add(RPAREN87);


                    }


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 127:28: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:128:7: columnPath
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_columnPath_in_atomExpr1502);
                    columnPath88=columnPath();

                    state._fsp--;

                    adaptor.addChild(root_0, columnPath88.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atomExpr"


    public static class b11o_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "b11o"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:131:1: b11o : LOGICAL_OR -> N_LOGICAL_OR ;
    public final DrqlAntlrParser.b11o_return b11o() throws RecognitionException {
        DrqlAntlrParser.b11o_return retval = new DrqlAntlrParser.b11o_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LOGICAL_OR89=null;

        CommonTree LOGICAL_OR89_tree=null;
        RewriteRuleTokenStream stream_LOGICAL_OR=new RewriteRuleTokenStream(adaptor,"token LOGICAL_OR");

        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:131:5: ( LOGICAL_OR -> N_LOGICAL_OR )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:131:7: LOGICAL_OR
            {
            LOGICAL_OR89=(Token)match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_b11o1510);  
            stream_LOGICAL_OR.add(LOGICAL_OR89);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 131:18: -> N_LOGICAL_OR
            {
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(N_LOGICAL_OR, "N_LOGICAL_OR")
                );

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "b11o"


    public static class b10o_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "b10o"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:132:1: b10o : LOGICAL_AND -> N_LOGICAL_AND ;
    public final DrqlAntlrParser.b10o_return b10o() throws RecognitionException {
        DrqlAntlrParser.b10o_return retval = new DrqlAntlrParser.b10o_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LOGICAL_AND90=null;

        CommonTree LOGICAL_AND90_tree=null;
        RewriteRuleTokenStream stream_LOGICAL_AND=new RewriteRuleTokenStream(adaptor,"token LOGICAL_AND");

        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:132:5: ( LOGICAL_AND -> N_LOGICAL_AND )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:132:7: LOGICAL_AND
            {
            LOGICAL_AND90=(Token)match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_b10o1521);  
            stream_LOGICAL_AND.add(LOGICAL_AND90);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 132:18: -> N_LOGICAL_AND
            {
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(N_LOGICAL_AND, "N_LOGICAL_AND")
                );

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "b10o"


    public static class b9o_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "b9o"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:133:1: b9o : BITWISE_OR -> N_BITWISE_OR ;
    public final DrqlAntlrParser.b9o_return b9o() throws RecognitionException {
        DrqlAntlrParser.b9o_return retval = new DrqlAntlrParser.b9o_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BITWISE_OR91=null;

        CommonTree BITWISE_OR91_tree=null;
        RewriteRuleTokenStream stream_BITWISE_OR=new RewriteRuleTokenStream(adaptor,"token BITWISE_OR");

        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:133:4: ( BITWISE_OR -> N_BITWISE_OR )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:133:7: BITWISE_OR
            {
            BITWISE_OR91=(Token)match(input,BITWISE_OR,FOLLOW_BITWISE_OR_in_b9o1531);  
            stream_BITWISE_OR.add(BITWISE_OR91);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 133:18: -> N_BITWISE_OR
            {
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(N_BITWISE_OR, "N_BITWISE_OR")
                );

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "b9o"


    public static class b8o_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "b8o"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:134:1: b8o : BITWISE_XOR -> N_BITWISE_XOR ;
    public final DrqlAntlrParser.b8o_return b8o() throws RecognitionException {
        DrqlAntlrParser.b8o_return retval = new DrqlAntlrParser.b8o_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BITWISE_XOR92=null;

        CommonTree BITWISE_XOR92_tree=null;
        RewriteRuleTokenStream stream_BITWISE_XOR=new RewriteRuleTokenStream(adaptor,"token BITWISE_XOR");

        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:134:4: ( BITWISE_XOR -> N_BITWISE_XOR )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:134:7: BITWISE_XOR
            {
            BITWISE_XOR92=(Token)match(input,BITWISE_XOR,FOLLOW_BITWISE_XOR_in_b8o1542);  
            stream_BITWISE_XOR.add(BITWISE_XOR92);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 134:18: -> N_BITWISE_XOR
            {
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(N_BITWISE_XOR, "N_BITWISE_XOR")
                );

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "b8o"


    public static class b7o_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "b7o"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:135:1: b7o : BITWISE_AND -> N_BITWISE_AND ;
    public final DrqlAntlrParser.b7o_return b7o() throws RecognitionException {
        DrqlAntlrParser.b7o_return retval = new DrqlAntlrParser.b7o_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BITWISE_AND93=null;

        CommonTree BITWISE_AND93_tree=null;
        RewriteRuleTokenStream stream_BITWISE_AND=new RewriteRuleTokenStream(adaptor,"token BITWISE_AND");

        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:135:4: ( BITWISE_AND -> N_BITWISE_AND )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:135:7: BITWISE_AND
            {
            BITWISE_AND93=(Token)match(input,BITWISE_AND,FOLLOW_BITWISE_AND_in_b7o1552);  
            stream_BITWISE_AND.add(BITWISE_AND93);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 135:18: -> N_BITWISE_AND
            {
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(N_BITWISE_AND, "N_BITWISE_AND")
                );

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "b7o"


    public static class b6o_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "b6o"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:136:1: b6o : ( EQUAL -> N_EQUAL | NOT_EQUAL -> N_NOT_EQUAL );
    public final DrqlAntlrParser.b6o_return b6o() throws RecognitionException {
        DrqlAntlrParser.b6o_return retval = new DrqlAntlrParser.b6o_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQUAL94=null;
        Token NOT_EQUAL95=null;

        CommonTree EQUAL94_tree=null;
        CommonTree NOT_EQUAL95_tree=null;
        RewriteRuleTokenStream stream_NOT_EQUAL=new RewriteRuleTokenStream(adaptor,"token NOT_EQUAL");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");

        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:136:4: ( EQUAL -> N_EQUAL | NOT_EQUAL -> N_NOT_EQUAL )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==EQUAL) ) {
                alt39=1;
            }
            else if ( (LA39_0==NOT_EQUAL) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }
            switch (alt39) {
                case 1 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:136:7: EQUAL
                    {
                    EQUAL94=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_b6o1562);  
                    stream_EQUAL.add(EQUAL94);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 136:13: -> N_EQUAL
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(N_EQUAL, "N_EQUAL")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:136:26: NOT_EQUAL
                    {
                    NOT_EQUAL95=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_b6o1570);  
                    stream_NOT_EQUAL.add(NOT_EQUAL95);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 136:36: -> N_NOT_EQUAL
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(N_NOT_EQUAL, "N_NOT_EQUAL")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "b6o"


    public static class b5o_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "b5o"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:137:1: b5o : ( LESS_THAN -> N_LESS_THAN | LESS_THAN_OR_EQUAL -> N_LESS_THAN_OR_EQUAL | GREATER_THAN -> N_GREATER_THAN | GREATER_THAN_OR_EQUAL -> N_GREATER_THAN_OR_EQUAL );
    public final DrqlAntlrParser.b5o_return b5o() throws RecognitionException {
        DrqlAntlrParser.b5o_return retval = new DrqlAntlrParser.b5o_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LESS_THAN96=null;
        Token LESS_THAN_OR_EQUAL97=null;
        Token GREATER_THAN98=null;
        Token GREATER_THAN_OR_EQUAL99=null;

        CommonTree LESS_THAN96_tree=null;
        CommonTree LESS_THAN_OR_EQUAL97_tree=null;
        CommonTree GREATER_THAN98_tree=null;
        CommonTree GREATER_THAN_OR_EQUAL99_tree=null;
        RewriteRuleTokenStream stream_GREATER_THAN_OR_EQUAL=new RewriteRuleTokenStream(adaptor,"token GREATER_THAN_OR_EQUAL");
        RewriteRuleTokenStream stream_LESS_THAN_OR_EQUAL=new RewriteRuleTokenStream(adaptor,"token LESS_THAN_OR_EQUAL");
        RewriteRuleTokenStream stream_GREATER_THAN=new RewriteRuleTokenStream(adaptor,"token GREATER_THAN");
        RewriteRuleTokenStream stream_LESS_THAN=new RewriteRuleTokenStream(adaptor,"token LESS_THAN");

        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:137:4: ( LESS_THAN -> N_LESS_THAN | LESS_THAN_OR_EQUAL -> N_LESS_THAN_OR_EQUAL | GREATER_THAN -> N_GREATER_THAN | GREATER_THAN_OR_EQUAL -> N_GREATER_THAN_OR_EQUAL )
            int alt40=4;
            switch ( input.LA(1) ) {
            case LESS_THAN:
                {
                alt40=1;
                }
                break;
            case LESS_THAN_OR_EQUAL:
                {
                alt40=2;
                }
                break;
            case GREATER_THAN:
                {
                alt40=3;
                }
                break;
            case GREATER_THAN_OR_EQUAL:
                {
                alt40=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }

            switch (alt40) {
                case 1 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:137:7: LESS_THAN
                    {
                    LESS_THAN96=(Token)match(input,LESS_THAN,FOLLOW_LESS_THAN_in_b5o1581);  
                    stream_LESS_THAN.add(LESS_THAN96);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 137:17: -> N_LESS_THAN
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(N_LESS_THAN, "N_LESS_THAN")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:137:34: LESS_THAN_OR_EQUAL
                    {
                    LESS_THAN_OR_EQUAL97=(Token)match(input,LESS_THAN_OR_EQUAL,FOLLOW_LESS_THAN_OR_EQUAL_in_b5o1589);  
                    stream_LESS_THAN_OR_EQUAL.add(LESS_THAN_OR_EQUAL97);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 137:53: -> N_LESS_THAN_OR_EQUAL
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(N_LESS_THAN_OR_EQUAL, "N_LESS_THAN_OR_EQUAL")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:138:5: GREATER_THAN
                    {
                    GREATER_THAN98=(Token)match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_b5o1602);  
                    stream_GREATER_THAN.add(GREATER_THAN98);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 138:18: -> N_GREATER_THAN
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(N_GREATER_THAN, "N_GREATER_THAN")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:139:5: GREATER_THAN_OR_EQUAL
                    {
                    GREATER_THAN_OR_EQUAL99=(Token)match(input,GREATER_THAN_OR_EQUAL,FOLLOW_GREATER_THAN_OR_EQUAL_in_b5o1615);  
                    stream_GREATER_THAN_OR_EQUAL.add(GREATER_THAN_OR_EQUAL99);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 139:27: -> N_GREATER_THAN_OR_EQUAL
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(N_GREATER_THAN_OR_EQUAL, "N_GREATER_THAN_OR_EQUAL")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "b5o"


    public static class b4o_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "b4o"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:140:1: b4o : ( BITWISE_LEFT_SHIFT -> N_BITWISE_LEFT_SHIFT | BITWISE_RIGHT_SHIFT -> N_BITWISE_RIGHT_SHIFT );
    public final DrqlAntlrParser.b4o_return b4o() throws RecognitionException {
        DrqlAntlrParser.b4o_return retval = new DrqlAntlrParser.b4o_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BITWISE_LEFT_SHIFT100=null;
        Token BITWISE_RIGHT_SHIFT101=null;

        CommonTree BITWISE_LEFT_SHIFT100_tree=null;
        CommonTree BITWISE_RIGHT_SHIFT101_tree=null;
        RewriteRuleTokenStream stream_BITWISE_LEFT_SHIFT=new RewriteRuleTokenStream(adaptor,"token BITWISE_LEFT_SHIFT");
        RewriteRuleTokenStream stream_BITWISE_RIGHT_SHIFT=new RewriteRuleTokenStream(adaptor,"token BITWISE_RIGHT_SHIFT");

        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:140:4: ( BITWISE_LEFT_SHIFT -> N_BITWISE_LEFT_SHIFT | BITWISE_RIGHT_SHIFT -> N_BITWISE_RIGHT_SHIFT )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==BITWISE_LEFT_SHIFT) ) {
                alt41=1;
            }
            else if ( (LA41_0==BITWISE_RIGHT_SHIFT) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }
            switch (alt41) {
                case 1 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:140:6: BITWISE_LEFT_SHIFT
                    {
                    BITWISE_LEFT_SHIFT100=(Token)match(input,BITWISE_LEFT_SHIFT,FOLLOW_BITWISE_LEFT_SHIFT_in_b4o1625);  
                    stream_BITWISE_LEFT_SHIFT.add(BITWISE_LEFT_SHIFT100);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 140:25: -> N_BITWISE_LEFT_SHIFT
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(N_BITWISE_LEFT_SHIFT, "N_BITWISE_LEFT_SHIFT")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:141:5: BITWISE_RIGHT_SHIFT
                    {
                    BITWISE_RIGHT_SHIFT101=(Token)match(input,BITWISE_RIGHT_SHIFT,FOLLOW_BITWISE_RIGHT_SHIFT_in_b4o1638);  
                    stream_BITWISE_RIGHT_SHIFT.add(BITWISE_RIGHT_SHIFT101);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 141:25: -> N_BITWISE_RIGHT_SHIFT
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(N_BITWISE_RIGHT_SHIFT, "N_BITWISE_RIGHT_SHIFT")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "b4o"


    public static class b3o_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "b3o"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:142:1: b3o : ( ADD -> N_ADD | SUBSTRUCT -> N_SUBSTRUCT );
    public final DrqlAntlrParser.b3o_return b3o() throws RecognitionException {
        DrqlAntlrParser.b3o_return retval = new DrqlAntlrParser.b3o_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ADD102=null;
        Token SUBSTRUCT103=null;

        CommonTree ADD102_tree=null;
        CommonTree SUBSTRUCT103_tree=null;
        RewriteRuleTokenStream stream_SUBSTRUCT=new RewriteRuleTokenStream(adaptor,"token SUBSTRUCT");
        RewriteRuleTokenStream stream_ADD=new RewriteRuleTokenStream(adaptor,"token ADD");

        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:142:4: ( ADD -> N_ADD | SUBSTRUCT -> N_SUBSTRUCT )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==ADD) ) {
                alt42=1;
            }
            else if ( (LA42_0==SUBSTRUCT) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }
            switch (alt42) {
                case 1 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:142:6: ADD
                    {
                    ADD102=(Token)match(input,ADD,FOLLOW_ADD_in_b3o1648);  
                    stream_ADD.add(ADD102);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 142:10: -> N_ADD
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(N_ADD, "N_ADD")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:142:21: SUBSTRUCT
                    {
                    SUBSTRUCT103=(Token)match(input,SUBSTRUCT,FOLLOW_SUBSTRUCT_in_b3o1656);  
                    stream_SUBSTRUCT.add(SUBSTRUCT103);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 142:31: -> N_SUBSTRUCT
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(N_SUBSTRUCT, "N_SUBSTRUCT")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "b3o"


    public static class b2o_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "b2o"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:143:1: b2o : ( multiplyOp -> N_MULTIPLY | divideOp -> N_DIVIDE | REMAINDER -> N_REMAINDER );
    public final DrqlAntlrParser.b2o_return b2o() throws RecognitionException {
        DrqlAntlrParser.b2o_return retval = new DrqlAntlrParser.b2o_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token REMAINDER106=null;
        DrqlAntlrParser.multiplyOp_return multiplyOp104 =null;

        DrqlAntlrParser.divideOp_return divideOp105 =null;


        CommonTree REMAINDER106_tree=null;
        RewriteRuleTokenStream stream_REMAINDER=new RewriteRuleTokenStream(adaptor,"token REMAINDER");
        RewriteRuleSubtreeStream stream_divideOp=new RewriteRuleSubtreeStream(adaptor,"rule divideOp");
        RewriteRuleSubtreeStream stream_multiplyOp=new RewriteRuleSubtreeStream(adaptor,"rule multiplyOp");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:143:4: ( multiplyOp -> N_MULTIPLY | divideOp -> N_DIVIDE | REMAINDER -> N_REMAINDER )
            int alt43=3;
            switch ( input.LA(1) ) {
            case STAR:
                {
                alt43=1;
                }
                break;
            case DIV:
            case SLASH:
                {
                alt43=2;
                }
                break;
            case REMAINDER:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }

            switch (alt43) {
                case 1 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:143:6: multiplyOp
                    {
                    pushFollow(FOLLOW_multiplyOp_in_b2o1666);
                    multiplyOp104=multiplyOp();

                    state._fsp--;

                    stream_multiplyOp.add(multiplyOp104.getTree());

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 143:17: -> N_MULTIPLY
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(N_MULTIPLY, "N_MULTIPLY")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:144:5: divideOp
                    {
                    pushFollow(FOLLOW_divideOp_in_b2o1679);
                    divideOp105=divideOp();

                    state._fsp--;

                    stream_divideOp.add(divideOp105.getTree());

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 144:14: -> N_DIVIDE
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(N_DIVIDE, "N_DIVIDE")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:144:28: REMAINDER
                    {
                    REMAINDER106=(Token)match(input,REMAINDER,FOLLOW_REMAINDER_in_b2o1687);  
                    stream_REMAINDER.add(REMAINDER106);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 144:38: -> N_REMAINDER
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(N_REMAINDER, "N_REMAINDER")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "b2o"


    public static class b1o_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "b1o"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:145:1: b1o : CONTAINS -> N_CONTAINS ;
    public final DrqlAntlrParser.b1o_return b1o() throws RecognitionException {
        DrqlAntlrParser.b1o_return retval = new DrqlAntlrParser.b1o_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token CONTAINS107=null;

        CommonTree CONTAINS107_tree=null;
        RewriteRuleTokenStream stream_CONTAINS=new RewriteRuleTokenStream(adaptor,"token CONTAINS");

        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:145:4: ( CONTAINS -> N_CONTAINS )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:145:6: CONTAINS
            {
            CONTAINS107=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_b1o1697);  
            stream_CONTAINS.add(CONTAINS107);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 145:15: -> N_CONTAINS
            {
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(N_CONTAINS, "N_CONTAINS")
                );

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "b1o"


    public static class uPrefixOp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "uPrefixOp"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:146:1: uPrefixOp : ( BITWISE_NOT -> N_BITWISE_NOT | LOGICAL_NOT -> N_LOGICAL_NOT );
    public final DrqlAntlrParser.uPrefixOp_return uPrefixOp() throws RecognitionException {
        DrqlAntlrParser.uPrefixOp_return retval = new DrqlAntlrParser.uPrefixOp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BITWISE_NOT108=null;
        Token LOGICAL_NOT109=null;

        CommonTree BITWISE_NOT108_tree=null;
        CommonTree LOGICAL_NOT109_tree=null;
        RewriteRuleTokenStream stream_LOGICAL_NOT=new RewriteRuleTokenStream(adaptor,"token LOGICAL_NOT");
        RewriteRuleTokenStream stream_BITWISE_NOT=new RewriteRuleTokenStream(adaptor,"token BITWISE_NOT");

        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:146:10: ( BITWISE_NOT -> N_BITWISE_NOT | LOGICAL_NOT -> N_LOGICAL_NOT )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==BITWISE_NOT) ) {
                alt44=1;
            }
            else if ( (LA44_0==LOGICAL_NOT) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }
            switch (alt44) {
                case 1 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:146:12: BITWISE_NOT
                    {
                    BITWISE_NOT108=(Token)match(input,BITWISE_NOT,FOLLOW_BITWISE_NOT_in_uPrefixOp1708);  
                    stream_BITWISE_NOT.add(BITWISE_NOT108);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 146:24: -> N_BITWISE_NOT
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(N_BITWISE_NOT, "N_BITWISE_NOT")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:146:43: LOGICAL_NOT
                    {
                    LOGICAL_NOT109=(Token)match(input,LOGICAL_NOT,FOLLOW_LOGICAL_NOT_in_uPrefixOp1716);  
                    stream_LOGICAL_NOT.add(LOGICAL_NOT109);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 146:55: -> N_LOGICAL_NOT
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(N_LOGICAL_NOT, "N_LOGICAL_NOT")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "uPrefixOp"


    public static class uPostfixOp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "uPostfixOp"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:147:1: uPostfixOp : ( uPostfixOpIn | uPostfixOpCall );
    public final DrqlAntlrParser.uPostfixOp_return uPostfixOp() throws RecognitionException {
        DrqlAntlrParser.uPostfixOp_return retval = new DrqlAntlrParser.uPostfixOp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        DrqlAntlrParser.uPostfixOpIn_return uPostfixOpIn110 =null;

        DrqlAntlrParser.uPostfixOpCall_return uPostfixOpCall111 =null;



        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:147:11: ( uPostfixOpIn | uPostfixOpCall )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==IN) ) {
                alt45=1;
            }
            else if ( (LA45_0==LPAREN) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }
            switch (alt45) {
                case 1 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:147:13: uPostfixOpIn
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_uPostfixOpIn_in_uPostfixOp1726);
                    uPostfixOpIn110=uPostfixOpIn();

                    state._fsp--;

                    adaptor.addChild(root_0, uPostfixOpIn110.getTree());

                    }
                    break;
                case 2 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:147:28: uPostfixOpCall
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_uPostfixOpCall_in_uPostfixOp1730);
                    uPostfixOpCall111=uPostfixOpCall();

                    state._fsp--;

                    adaptor.addChild(root_0, uPostfixOpCall111.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "uPostfixOp"


    public static class uPostfixOpIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "uPostfixOpIn"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:148:1: uPostfixOpIn : IN LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( N_IN_PARAMS ( expr )* ) ;
    public final DrqlAntlrParser.uPostfixOpIn_return uPostfixOpIn() throws RecognitionException {
        DrqlAntlrParser.uPostfixOpIn_return retval = new DrqlAntlrParser.uPostfixOpIn_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IN112=null;
        Token LPAREN113=null;
        Token COMMA115=null;
        Token RPAREN117=null;
        DrqlAntlrParser.expr_return expr114 =null;

        DrqlAntlrParser.expr_return expr116 =null;


        CommonTree IN112_tree=null;
        CommonTree LPAREN113_tree=null;
        CommonTree COMMA115_tree=null;
        CommonTree RPAREN117_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:148:13: ( IN LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( N_IN_PARAMS ( expr )* ) )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:148:15: IN LPAREN ( expr ( COMMA expr )* )? RPAREN
            {
            IN112=(Token)match(input,IN,FOLLOW_IN_in_uPostfixOpIn1736);  
            stream_IN.add(IN112);


            LPAREN113=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_uPostfixOpIn1738);  
            stream_LPAREN.add(LPAREN113);


            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:148:25: ( expr ( COMMA expr )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==BITWISE_NOT||LA47_0==FLOAT||LA47_0==ID||LA47_0==INT||LA47_0==LOGICAL_NOT||LA47_0==LPAREN||(LA47_0 >= STAR && LA47_0 <= STRING)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:148:26: expr ( COMMA expr )*
                    {
                    pushFollow(FOLLOW_expr_in_uPostfixOpIn1741);
                    expr114=expr();

                    state._fsp--;

                    stream_expr.add(expr114.getTree());

                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:148:31: ( COMMA expr )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==COMMA) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:148:32: COMMA expr
                    	    {
                    	    COMMA115=(Token)match(input,COMMA,FOLLOW_COMMA_in_uPostfixOpIn1744);  
                    	    stream_COMMA.add(COMMA115);


                    	    pushFollow(FOLLOW_expr_in_uPostfixOpIn1746);
                    	    expr116=expr();

                    	    state._fsp--;

                    	    stream_expr.add(expr116.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }


            RPAREN117=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_uPostfixOpIn1752);  
            stream_RPAREN.add(RPAREN117);


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 148:54: -> ^( N_IN_PARAMS ( expr )* )
            {
                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:148:57: ^( N_IN_PARAMS ( expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(N_IN_PARAMS, "N_IN_PARAMS")
                , root_1);

                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:148:71: ( expr )*
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "uPostfixOpIn"


    public static class uPostfixOpCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "uPostfixOpCall"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:149:1: uPostfixOpCall : LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( N_CALL_PARAMS ( expr )* ) ;
    public final DrqlAntlrParser.uPostfixOpCall_return uPostfixOpCall() throws RecognitionException {
        DrqlAntlrParser.uPostfixOpCall_return retval = new DrqlAntlrParser.uPostfixOpCall_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LPAREN118=null;
        Token COMMA120=null;
        Token RPAREN122=null;
        DrqlAntlrParser.expr_return expr119 =null;

        DrqlAntlrParser.expr_return expr121 =null;


        CommonTree LPAREN118_tree=null;
        CommonTree COMMA120_tree=null;
        CommonTree RPAREN122_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:149:15: ( LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( N_CALL_PARAMS ( expr )* ) )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:149:17: LPAREN ( expr ( COMMA expr )* )? RPAREN
            {
            LPAREN118=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_uPostfixOpCall1767);  
            stream_LPAREN.add(LPAREN118);


            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:149:24: ( expr ( COMMA expr )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==BITWISE_NOT||LA49_0==FLOAT||LA49_0==ID||LA49_0==INT||LA49_0==LOGICAL_NOT||LA49_0==LPAREN||(LA49_0 >= STAR && LA49_0 <= STRING)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:149:25: expr ( COMMA expr )*
                    {
                    pushFollow(FOLLOW_expr_in_uPostfixOpCall1770);
                    expr119=expr();

                    state._fsp--;

                    stream_expr.add(expr119.getTree());

                    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:149:30: ( COMMA expr )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==COMMA) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:149:31: COMMA expr
                    	    {
                    	    COMMA120=(Token)match(input,COMMA,FOLLOW_COMMA_in_uPostfixOpCall1773);  
                    	    stream_COMMA.add(COMMA120);


                    	    pushFollow(FOLLOW_expr_in_uPostfixOpCall1775);
                    	    expr121=expr();

                    	    state._fsp--;

                    	    stream_expr.add(expr121.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }


            RPAREN122=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_uPostfixOpCall1781);  
            stream_RPAREN.add(RPAREN122);


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 149:53: -> ^( N_CALL_PARAMS ( expr )* )
            {
                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:149:56: ^( N_CALL_PARAMS ( expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(N_CALL_PARAMS, "N_CALL_PARAMS")
                , root_1);

                // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:149:72: ( expr )*
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "uPostfixOpCall"


    public static class divideOp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "divideOp"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:152:1: divideOp : ( SLASH | DIV );
    public final DrqlAntlrParser.divideOp_return divideOp() throws RecognitionException {
        DrqlAntlrParser.divideOp_return retval = new DrqlAntlrParser.divideOp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set123=null;

        CommonTree set123_tree=null;

        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:152:9: ( SLASH | DIV )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set123=(Token)input.LT(1);

            if ( input.LA(1)==DIV||input.LA(1)==SLASH ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set123)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "divideOp"


    public static class multiplyOp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiplyOp"
    // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:153:1: multiplyOp : STAR ;
    public final DrqlAntlrParser.multiplyOp_return multiplyOp() throws RecognitionException {
        DrqlAntlrParser.multiplyOp_return retval = new DrqlAntlrParser.multiplyOp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STAR124=null;

        CommonTree STAR124_tree=null;

        try {
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:153:11: ( STAR )
            // /Users/antonio/Development/Projects/java/apache_drill_parser2/src/org/apache/drill/parsers/impl/drqlantlr/DrqlAntlr.g:153:13: STAR
            {
            root_0 = (CommonTree)adaptor.nil();


            STAR124=(Token)match(input,STAR,FOLLOW_STAR_in_multiplyOp1808); 
            STAR124_tree = 
            (CommonTree)adaptor.create(STAR124)
            ;
            adaptor.addChild(root_0, STAR124_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multiplyOp"

    // Delegated rules


 

    public static final BitSet FOLLOW_selectStatement_in_request204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMICOLON_in_request207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_request212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectClause_in_selectStatement221 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_fromClause_in_selectStatement223 = new BitSet(new long[]{0x0024485000000002L,0x0080000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_joinClause_in_selectStatement225 = new BitSet(new long[]{0x0020005000000002L,0x0080000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_whereClause_in_selectStatement228 = new BitSet(new long[]{0x0020005000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_havingClause_in_selectStatement236 = new BitSet(new long[]{0x0020001000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_groupbyClause_in_selectStatement239 = new BitSet(new long[]{0x0020000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_orderbyClause_in_selectStatement242 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_limitClause_in_selectStatement245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_selectClause299 = new BitSet(new long[]{0x0280120020000800L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_columnExpr_in_selectClause301 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_selectClause304 = new BitSet(new long[]{0x0280120020000800L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_columnExpr_in_selectClause306 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_expr_in_columnExpr333 = new BitSet(new long[]{0x0000000000000042L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_withinClause_in_columnExpr335 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AS_in_columnExpr339 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_columnExpr341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHIN_in_withinClause374 = new BitSet(new long[]{0x0000020000000000L,0x2000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RECORD_in_withinClause377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_columnPath_in_withinClause387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_fromClause407 = new BitSet(new long[]{0x0200020000000000L});
    public static final BitSet FOLLOW_subSelectStatement_in_fromClause409 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_fromClause412 = new BitSet(new long[]{0x0200020000000000L});
    public static final BitSet FOLLOW_subSelectStatement_in_fromClause414 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_tableName_in_subSelectStatement437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_subSelectStatement442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_selectStatement_in_subSelectStatement445 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_subSelectStatement447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_joinClauseDesc_in_joinClause458 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_JOIN_in_joinClause460 = new BitSet(new long[]{0x0200020000000000L});
    public static final BitSet FOLLOW_joinClauseFrom_in_joinClause462 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_ON_in_joinClause464 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_joinConditionList_in_joinClause466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INNER_in_joinClauseDesc489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_in_joinClauseDesc502 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_OUTER_in_joinClauseDesc504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optionallyAliasedTable_in_joinClauseFrom517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aliasedSubSelectStatement_in_joinClauseFrom534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableName_in_optionallyAliasedTable548 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AS_in_optionallyAliasedTable551 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_optionallyAliasedTable553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_aliasedSubSelectStatement572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_selectStatement_in_aliasedSubSelectStatement574 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_aliasedSubSelectStatement576 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AS_in_aliasedSubSelectStatement578 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_tableName_in_aliasedSubSelectStatement580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_joinCondition_in_joinConditionList600 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_joinConditionList603 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_joinCondition_in_joinConditionList605 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_columnPath_in_joinCondition628 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EQUAL_in_joinCondition630 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_columnPath_in_joinCondition634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_whereClause654 = new BitSet(new long[]{0x0280120020000800L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_expr_in_whereClause656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUPBY_in_groupbyClause672 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_columnName_in_groupbyClause674 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_groupbyClause677 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_columnName_in_groupbyClause679 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_HAVING_in_havingClause703 = new BitSet(new long[]{0x0280120020000800L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_expr_in_havingClause705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDERBY_in_orderbyClause723 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_orderbyColumnName_in_orderbyClause725 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_orderbyClause728 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_orderbyColumnName_in_orderbyClause730 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_columnName_in_orderbyColumnName752 = new BitSet(new long[]{0x0000000000200082L});
    public static final BitSet FOLLOW_ASC_in_orderbyColumnName755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_orderbyColumnName767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_limitClause808 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_INT_in_limitClause810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_columnPath2_in_columnPath828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_columnName_in_columnPath2842 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_DOT_in_columnPath2845 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_columnName_in_columnPath2848 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ID_in_columnName856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_columnName868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tablePath2_in_tablePath884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableName_in_tablePath2898 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_DOT_in_tablePath2901 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_tableName_in_tablePath2904 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ID_in_tableName918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr2_in_expr934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_b10e_in_expr2950 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_b11o_in_expr2959 = new BitSet(new long[]{0x0280120020000800L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_b10e_in_expr2963 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_b9e_in_b10e987 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_b10o_in_b10e996 = new BitSet(new long[]{0x0280120020000800L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_b9e_in_b10e1000 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_b8e_in_b9e1025 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_b9o_in_b9e1034 = new BitSet(new long[]{0x0280120020000800L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_b8e_in_b9e1038 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_b7e_in_b8e1064 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_b8o_in_b8e1073 = new BitSet(new long[]{0x0280120020000800L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_b7e_in_b8e1077 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_b6e_in_b7e1103 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_b7o_in_b7e1112 = new BitSet(new long[]{0x0280120020000800L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_b6e_in_b7e1116 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_b5e_in_b6e1142 = new BitSet(new long[]{0x2000000002000002L});
    public static final BitSet FOLLOW_b6o_in_b6e1151 = new BitSet(new long[]{0x0280120020000800L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_b5e_in_b6e1155 = new BitSet(new long[]{0x2000000002000002L});
    public static final BitSet FOLLOW_b4e_in_b5e1181 = new BitSet(new long[]{0x0018000C00000002L});
    public static final BitSet FOLLOW_b5o_in_b5e1190 = new BitSet(new long[]{0x0280120020000800L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_b4e_in_b5e1194 = new BitSet(new long[]{0x0018000C00000002L});
    public static final BitSet FOLLOW_b3e_in_b4e1220 = new BitSet(new long[]{0x0000000000002402L});
    public static final BitSet FOLLOW_b4o_in_b4e1229 = new BitSet(new long[]{0x0280120020000800L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_b3e_in_b4e1233 = new BitSet(new long[]{0x0000000000002402L});
    public static final BitSet FOLLOW_b2e_in_b3e1259 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_b3o_in_b3e1268 = new BitSet(new long[]{0x0280120020000800L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_b2e_in_b3e1272 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_b1e_in_b2e1298 = new BitSet(new long[]{0x0000000000400002L,0x4000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_b2o_in_b2e1307 = new BitSet(new long[]{0x0280120020000800L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_b1e_in_b2e1311 = new BitSet(new long[]{0x0000000000400002L,0x4000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_uPrefixExpr_in_b1e1337 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_b1o_in_b1e1348 = new BitSet(new long[]{0x0280120020000800L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_uPrefixExpr_in_b1e1352 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_uPrefixOp_in_uPrefixExpr1376 = new BitSet(new long[]{0x0280120020000800L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_uPostfixExpr_in_uPrefixExpr1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomExpr_in_uPostfixExpr1407 = new BitSet(new long[]{0x0200040000000002L});
    public static final BitSet FOLLOW_uPostfixOp_in_uPostfixExpr1416 = new BitSet(new long[]{0x0200040000000002L});
    public static final BitSet FOLLOW_INT_in_atomExpr1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_atomExpr1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atomExpr1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atomExpr1485 = new BitSet(new long[]{0x0280120020000800L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_expr_in_atomExpr1487 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_atomExpr1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_columnPath_in_atomExpr1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_b11o1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_b10o1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BITWISE_OR_in_b9o1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BITWISE_XOR_in_b8o1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BITWISE_AND_in_b7o1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_b6o1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_b6o1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_THAN_in_b5o1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_THAN_OR_EQUAL_in_b5o1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_THAN_in_b5o1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_THAN_OR_EQUAL_in_b5o1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BITWISE_LEFT_SHIFT_in_b4o1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BITWISE_RIGHT_SHIFT_in_b4o1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_b3o1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBSTRUCT_in_b3o1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplyOp_in_b2o1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_divideOp_in_b2o1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REMAINDER_in_b2o1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTAINS_in_b1o1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BITWISE_NOT_in_uPrefixOp1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOGICAL_NOT_in_uPrefixOp1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_uPostfixOpIn_in_uPostfixOp1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_uPostfixOpCall_in_uPostfixOp1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_uPostfixOpIn1736 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_uPostfixOpIn1738 = new BitSet(new long[]{0x0280120020000800L,0x8000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_expr_in_uPostfixOpIn1741 = new BitSet(new long[]{0x0000000000020000L,0x8000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_uPostfixOpIn1744 = new BitSet(new long[]{0x0280120020000800L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_expr_in_uPostfixOpIn1746 = new BitSet(new long[]{0x0000000000020000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_uPostfixOpIn1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_uPostfixOpCall1767 = new BitSet(new long[]{0x0280120020000800L,0x8000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_expr_in_uPostfixOpCall1770 = new BitSet(new long[]{0x0000000000020000L,0x8000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_uPostfixOpCall1773 = new BitSet(new long[]{0x0280120020000800L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_expr_in_uPostfixOpCall1775 = new BitSet(new long[]{0x0000000000020000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_uPostfixOpCall1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_multiplyOp1808 = new BitSet(new long[]{0x0000000000000002L});

}