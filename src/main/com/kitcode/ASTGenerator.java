package com.kitcode;

import antlr.Java8Lexer;
import antlr.Java8Parser;

import java.io.File;
import java.io.IOException;

import java.util.ArrayList;

import java.nio.charset.Charset;
import java.nio.file.Files;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class ASTGenerator {

    static ArrayList<String> LineNum = new ArrayList<String>();
    static ArrayList<String> Type = new ArrayList<String>();
    static ArrayList<String> Content = new ArrayList<String>();

    private static String readFile() throws IOException {
        File file = new File("resource/java/Blabla.java");
        byte[] encoded = Files.readAllBytes(file.toPath());
        return new String(encoded, Charset.forName("UTF-8"));
    }

    public static void main(String args[]) throws IOException{
        String inputString = readFile();
        ANTLRInputStream input = new ANTLRInputStream(inputString);
        Java8Lexer lexer = new Java8Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Java8Parser parser = new Java8Parser(tokens);
        ParserRuleContext ctx = parser.compilationUnit();

        generateAST(ctx, false, 0);
        printDOT();

    }

    private static void generateAST(RuleContext ctx, boolean verbose, int indentation) {
        boolean toBeIgnored = !verbose && ctx.getChildCount() == 1 && ctx.getChild(0) instanceof ParserRuleContext;

        if (!toBeIgnored) {
            String ruleName = Java8Parser.ruleNames[ctx.getRuleIndex()];
	    LineNum.add(Integer.toString(indentation));
            Type.add(ruleName);
            Content.add(ctx.getText());
	}
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof RuleContext) {
                generateAST((RuleContext) element, verbose, indentation + (toBeIgnored ? 0 : 1));
            }
        }
    }
    
    private static void printDOT(){
        int pos = 0;
        for(int i=1; i<LineNum.size();i++){
            pos=getPos(Integer.parseInt(LineNum.get(i))-1, i);
            System.out.println((Integer.parseInt(LineNum.get(i))-1)+Integer.toString(pos)+"->"+LineNum.get(i)+i);
        }
    }
    
    private static int getPos(int n, int limit){
        int pos = 0;
        for(int i=0; i<limit;i++){
            if(Integer.parseInt(LineNum.get(i))==n){
                pos = i;
            }
        }
        return pos;
    }
}
