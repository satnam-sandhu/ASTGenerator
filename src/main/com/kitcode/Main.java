package com.kitcode;

import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;


/** Parse a java file or directory of java files using the generated parser
 *  ANTLR builds from java.g
 */
class Main {

	static JavaLexer lexer;

	public static void main(String[] args) throws Exception {
            parseFile("/home/satnam-sandhu/Workstation/ASTGenerator/resource/java/Blabla.java");
        }
	// Here's where we do the real work...
	public static void parseFile(String f)throws Exception {
		try {
			// Create a scanner that reads from the input stream passed to us
			if ( lexer==null ) {
				lexer = new JavaLexer();
			}
                        
                        lexer = new JavaLexer(new ANTLRFileStream(f));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			JavaParser parser = new JavaParser(tokens);
			//JavaParser.compilationUnit_return returnValue = parser.compilationUnit();
                        CommonTree tree = (CommonTree)parser.compilationUnit().getTree();
                        DOTTreeGenerator gen = new DOTTreeGenerator();
                        StringTemplate st = gen.toDOT(tree);
                        System.out.println(st);
                        
		}
		catch (Exception e) {
			//System.err.println("parser exception: "+e);
			e.printStackTrace();   // so we can get stack trace		
		}
	}
	
}

