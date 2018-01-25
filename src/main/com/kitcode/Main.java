package com.kitcode;

import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;
 
class Main {
    
        public static void main(String[] args) throws Exception {
            parseFile("/home/satnam-sandhu/Workstation/ASTGenerator/resource/java/Blabla.java");
        }
        
	public static void parseFile(String f)throws Exception {
		
            JavaLexer lexer = new JavaLexer(new ANTLRFileStream(f));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            JavaParser parser = new JavaParser(tokens);
            CommonTree tree = (CommonTree)parser.compilationUnit().getTree();
            DOTTreeGenerator gen = new DOTTreeGenerator();
            StringTemplate st = gen.toDOT(tree);
            System.out.println(st);
                        
	}
	
}

