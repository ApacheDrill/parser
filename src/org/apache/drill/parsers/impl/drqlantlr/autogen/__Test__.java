package org.apache.drill.parsers.impl.drqlantlr.autogen; 

import org.antlr.runtime.*;

public class __Test__ {

    public static void main(String args[]) throws Exception {
        DrqlAntlrLexer lex = new DrqlAntlrLexer(new ANTLRFileStream("/home/leon/workspace/Drill2/src/org/apache/drill/parsers/impl/drqlantlr/autogen/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        DrqlAntlrParser g = new DrqlAntlrParser(tokens);
        try {
            g.request();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}