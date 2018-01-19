package com.kitcode;

import antlr.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class ASTGenerator{
    public static void main(String args[]) {
        String input = "public class HelloWord {" +
            "public void print(String r){" +
            "for(int i = 0;true;i+=2)" +
            "System.out.println(r);" +
            "}" +
            "}";
	Java8Lexer lexer = new Java8Lexer(new ANTLRInputStream(input));
	CommonTokenStream tokens = new CommonTokenStream(lexer);
	Java8Parser parser = new Java8Parser(tokens);
        ParserRuleContext ctx = parser.classDeclaration();
        
        explore(ctx, false, 0);
        
        System.out.println("I am working fine!");
    }
    
    private static void explore(RuleContext ctx, boolean verbose, int indentation) {
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
                explore((RuleContext)element, verbose, indentation + (toBeIgnored ? 0 : 1));
            }
        }
    }
}
