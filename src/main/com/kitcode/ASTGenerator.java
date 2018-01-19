package com.kitcode;

import antlr.*;
import org.antlr.v4.runtime.*;

public class ASTGenerator {
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

    }
}
