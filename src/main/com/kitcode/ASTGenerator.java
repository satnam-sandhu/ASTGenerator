package com.kitcode;

import antlr.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class ASTGenerator extends Java8BaseVisitor<Void>{
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
        ParseTree tree = parser.compilationUnit();
        
        ASTGenerator visitor = new ASTGenerator();
        
        visitor.visit(tree);
        
        System.out.println("I am working fine!");
    }
}
