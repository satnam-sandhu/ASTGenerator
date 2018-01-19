package com.kitcode;

import antlr.*;
import java.io.File;
import java.io.IOException;

import java.nio.charset.Charset;
import java.nio.file.Files;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class ASTGenerator{
    
    public static String readFile() throws IOException{
        File file = new File("resource/java/Blabla.java");
        byte[] encoded = Files.readAllBytes(file.toPath());
        return new String(encoded, Charset.forName("UTF-8"));
    }
    
    public static void main(String args[]) throws IOException {
        String input = readFile();
	Java8Lexer lexer = new Java8Lexer(new ANTLRInputStream(input));
	CommonTokenStream tokens = new CommonTokenStream(lexer);
	Java8Parser parser = new Java8Parser(tokens);
        ParserRuleContext ctx = parser.classDeclaration();
        
        printAST(ctx, false, 0);
    }
    
    private static void printAST(RuleContext ctx, boolean verbose, int indentation) {
        boolean toBeIgnored = !verbose && ctx.getChildCount() == 1
                && ctx.getChild(0) instanceof ParserRuleContext;
        if (!toBeIgnored) {
            String ruleName = Java8Parser.ruleNames[ctx.getRuleIndex()];
            for (int i = 0; i < indentation; i++) {
                System.out.print("  ");
            }
            System.out.println(ruleName + " " + ctx.getText());
        }
        for (int i=0;i<ctx.getChildCount();i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof RuleContext) {
                printAST((RuleContext)element, verbose, indentation + (toBeIgnored ? 0 : 1));
            }
        }
    }
}
