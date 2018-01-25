// $ANTLR 3.4 Java.g 2018-01-25 09:50:30

   package com.kitcode;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class JavaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSERT", "COMMENT", "CharacterLiteral", "DecimalLiteral", "ENUM", "EscapeSequence", "Exponent", "FloatTypeSuffix", "FloatingPointLiteral", "HexDigit", "HexLiteral", "Identifier", "IntegerTypeSuffix", "JavaIDDigit", "LINE_COMMENT", "Letter", "OctalEscape", "OctalLiteral", "StringLiteral", "UnicodeEscape", "WS", "'!'", "'!='", "'%'", "'%='", "'&&'", "'&'", "'&='", "'('", "')'", "'*'", "'*='", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'.'", "'...'", "'/'", "'/='", "':'", "';'", "'<'", "'='", "'=='", "'>'", "'?'", "'@'", "'['", "']'", "'^'", "'^='", "'abstract'", "'boolean'", "'break'", "'byte'", "'case'", "'catch'", "'char'", "'class'", "'continue'", "'default'", "'do'", "'double'", "'else'", "'extends'", "'false'", "'final'", "'finally'", "'float'", "'for'", "'if'", "'implements'", "'import'", "'instanceof'", "'int'", "'interface'", "'long'", "'native'", "'new'", "'null'", "'package'", "'private'", "'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", "'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", "'transient'", "'true'", "'try'", "'void'", "'volatile'", "'while'", "'{'", "'|'", "'|='", "'||'", "'}'", "'~'"
    };

    public static final int EOF=-1;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__110=110;
    public static final int T__111=111;
    public static final int T__112=112;
    public static final int T__113=113;
    public static final int ASSERT=4;
    public static final int COMMENT=5;
    public static final int CharacterLiteral=6;
    public static final int DecimalLiteral=7;
    public static final int ENUM=8;
    public static final int EscapeSequence=9;
    public static final int Exponent=10;
    public static final int FloatTypeSuffix=11;
    public static final int FloatingPointLiteral=12;
    public static final int HexDigit=13;
    public static final int HexLiteral=14;
    public static final int Identifier=15;
    public static final int IntegerTypeSuffix=16;
    public static final int JavaIDDigit=17;
    public static final int LINE_COMMENT=18;
    public static final int Letter=19;
    public static final int OctalEscape=20;
    public static final int OctalLiteral=21;
    public static final int StringLiteral=22;
    public static final int UnicodeEscape=23;
    public static final int WS=24;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public JavaParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public JavaParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return JavaParser.tokenNames; }
    public String getGrammarFileName() { return "Java.g"; }


    public static class compilationUnit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compilationUnit"
    // Java.g:19:1: compilationUnit : ( annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* ) | ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* );
    public final JavaParser.compilationUnit_return compilationUnit() throws RecognitionException {
        JavaParser.compilationUnit_return retval = new JavaParser.compilationUnit_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.annotations_return annotations1 =null;

        JavaParser.packageDeclaration_return packageDeclaration2 =null;

        JavaParser.importDeclaration_return importDeclaration3 =null;

        JavaParser.typeDeclaration_return typeDeclaration4 =null;

        JavaParser.classOrInterfaceDeclaration_return classOrInterfaceDeclaration5 =null;

        JavaParser.typeDeclaration_return typeDeclaration6 =null;

        JavaParser.packageDeclaration_return packageDeclaration7 =null;

        JavaParser.importDeclaration_return importDeclaration8 =null;

        JavaParser.typeDeclaration_return typeDeclaration9 =null;



        try {
            // Java.g:20:5: ( annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* ) | ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==54) ) {
                int LA8_1 = input.LA(2);

                if ( (synpred5_Java()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA8_0==EOF||LA8_0==ENUM||LA8_0==48||LA8_0==59||LA8_0==66||LA8_0==74||LA8_0==80||LA8_0==83||(LA8_0 >= 88 && LA8_0 <= 91)||(LA8_0 >= 94 && LA8_0 <= 95)) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // Java.g:20:9: annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* )
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_annotations_in_compilationUnit56);
                    annotations1=annotations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, annotations1.getTree());

                    // Java.g:21:9: ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==88) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==ENUM||LA4_0==54||LA4_0==59||LA4_0==66||LA4_0==74||LA4_0==83||(LA4_0 >= 89 && LA4_0 <= 91)||(LA4_0 >= 94 && LA4_0 <= 95)) ) {
                        alt4=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;

                    }
                    switch (alt4) {
                        case 1 :
                            // Java.g:21:13: packageDeclaration ( importDeclaration )* ( typeDeclaration )*
                            {
                            pushFollow(FOLLOW_packageDeclaration_in_compilationUnit70);
                            packageDeclaration2=packageDeclaration();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, packageDeclaration2.getTree());

                            // Java.g:21:32: ( importDeclaration )*
                            loop1:
                            do {
                                int alt1=2;
                                int LA1_0 = input.LA(1);

                                if ( (LA1_0==80) ) {
                                    alt1=1;
                                }


                                switch (alt1) {
                            	case 1 :
                            	    // Java.g:21:32: importDeclaration
                            	    {
                            	    pushFollow(FOLLOW_importDeclaration_in_compilationUnit72);
                            	    importDeclaration3=importDeclaration();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, importDeclaration3.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop1;
                                }
                            } while (true);


                            // Java.g:21:51: ( typeDeclaration )*
                            loop2:
                            do {
                                int alt2=2;
                                int LA2_0 = input.LA(1);

                                if ( (LA2_0==ENUM||LA2_0==48||LA2_0==54||LA2_0==59||LA2_0==66||LA2_0==74||LA2_0==83||(LA2_0 >= 89 && LA2_0 <= 91)||(LA2_0 >= 94 && LA2_0 <= 95)) ) {
                                    alt2=1;
                                }


                                switch (alt2) {
                            	case 1 :
                            	    // Java.g:21:51: typeDeclaration
                            	    {
                            	    pushFollow(FOLLOW_typeDeclaration_in_compilationUnit75);
                            	    typeDeclaration4=typeDeclaration();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeDeclaration4.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop2;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // Java.g:22:13: classOrInterfaceDeclaration ( typeDeclaration )*
                            {
                            pushFollow(FOLLOW_classOrInterfaceDeclaration_in_compilationUnit90);
                            classOrInterfaceDeclaration5=classOrInterfaceDeclaration();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, classOrInterfaceDeclaration5.getTree());

                            // Java.g:22:41: ( typeDeclaration )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( (LA3_0==ENUM||LA3_0==48||LA3_0==54||LA3_0==59||LA3_0==66||LA3_0==74||LA3_0==83||(LA3_0 >= 89 && LA3_0 <= 91)||(LA3_0 >= 94 && LA3_0 <= 95)) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // Java.g:22:41: typeDeclaration
                            	    {
                            	    pushFollow(FOLLOW_typeDeclaration_in_compilationUnit92);
                            	    typeDeclaration6=typeDeclaration();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeDeclaration6.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Java.g:24:9: ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )*
                    {
                    root_0 = (Object)adaptor.nil();


                    // Java.g:24:9: ( packageDeclaration )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==88) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // Java.g:24:9: packageDeclaration
                            {
                            pushFollow(FOLLOW_packageDeclaration_in_compilationUnit113);
                            packageDeclaration7=packageDeclaration();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, packageDeclaration7.getTree());

                            }
                            break;

                    }


                    // Java.g:24:29: ( importDeclaration )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==80) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // Java.g:24:29: importDeclaration
                    	    {
                    	    pushFollow(FOLLOW_importDeclaration_in_compilationUnit116);
                    	    importDeclaration8=importDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, importDeclaration8.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    // Java.g:24:48: ( typeDeclaration )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==ENUM||LA7_0==48||LA7_0==54||LA7_0==59||LA7_0==66||LA7_0==74||LA7_0==83||(LA7_0 >= 89 && LA7_0 <= 91)||(LA7_0 >= 94 && LA7_0 <= 95)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // Java.g:24:48: typeDeclaration
                    	    {
                    	    pushFollow(FOLLOW_typeDeclaration_in_compilationUnit119);
                    	    typeDeclaration9=typeDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeDeclaration9.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compilationUnit"


    public static class packageDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "packageDeclaration"
    // Java.g:27:1: packageDeclaration : 'package' qualifiedName ';' ;
    public final JavaParser.packageDeclaration_return packageDeclaration() throws RecognitionException {
        JavaParser.packageDeclaration_return retval = new JavaParser.packageDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal10=null;
        Token char_literal12=null;
        JavaParser.qualifiedName_return qualifiedName11 =null;


        Object string_literal10_tree=null;
        Object char_literal12_tree=null;

        try {
            // Java.g:28:5: ( 'package' qualifiedName ';' )
            // Java.g:28:9: 'package' qualifiedName ';'
            {
            root_0 = (Object)adaptor.nil();


            string_literal10=(Token)match(input,88,FOLLOW_88_in_packageDeclaration139); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal10_tree = 
            (Object)adaptor.create(string_literal10)
            ;
            adaptor.addChild(root_0, string_literal10_tree);
            }

            pushFollow(FOLLOW_qualifiedName_in_packageDeclaration141);
            qualifiedName11=qualifiedName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedName11.getTree());

            char_literal12=(Token)match(input,48,FOLLOW_48_in_packageDeclaration143); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal12_tree = 
            (Object)adaptor.create(char_literal12)
            ;
            adaptor.addChild(root_0, char_literal12_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "packageDeclaration"


    public static class importDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "importDeclaration"
    // Java.g:31:1: importDeclaration : 'import' ( 'static' )? qualifiedName ( '.' '*' )? ';' ;
    public final JavaParser.importDeclaration_return importDeclaration() throws RecognitionException {
        JavaParser.importDeclaration_return retval = new JavaParser.importDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal13=null;
        Token string_literal14=null;
        Token char_literal16=null;
        Token char_literal17=null;
        Token char_literal18=null;
        JavaParser.qualifiedName_return qualifiedName15 =null;


        Object string_literal13_tree=null;
        Object string_literal14_tree=null;
        Object char_literal16_tree=null;
        Object char_literal17_tree=null;
        Object char_literal18_tree=null;

        try {
            // Java.g:32:5: ( 'import' ( 'static' )? qualifiedName ( '.' '*' )? ';' )
            // Java.g:32:9: 'import' ( 'static' )? qualifiedName ( '.' '*' )? ';'
            {
            root_0 = (Object)adaptor.nil();


            string_literal13=(Token)match(input,80,FOLLOW_80_in_importDeclaration166); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal13_tree = 
            (Object)adaptor.create(string_literal13)
            ;
            adaptor.addChild(root_0, string_literal13_tree);
            }

            // Java.g:32:18: ( 'static' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==94) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Java.g:32:18: 'static'
                    {
                    string_literal14=(Token)match(input,94,FOLLOW_94_in_importDeclaration168); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal14_tree = 
                    (Object)adaptor.create(string_literal14)
                    ;
                    adaptor.addChild(root_0, string_literal14_tree);
                    }

                    }
                    break;

            }


            pushFollow(FOLLOW_qualifiedName_in_importDeclaration171);
            qualifiedName15=qualifiedName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedName15.getTree());

            // Java.g:32:42: ( '.' '*' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==43) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Java.g:32:43: '.' '*'
                    {
                    char_literal16=(Token)match(input,43,FOLLOW_43_in_importDeclaration174); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal16_tree = 
                    (Object)adaptor.create(char_literal16)
                    ;
                    adaptor.addChild(root_0, char_literal16_tree);
                    }

                    char_literal17=(Token)match(input,34,FOLLOW_34_in_importDeclaration176); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal17_tree = 
                    (Object)adaptor.create(char_literal17)
                    ;
                    adaptor.addChild(root_0, char_literal17_tree);
                    }

                    }
                    break;

            }


            char_literal18=(Token)match(input,48,FOLLOW_48_in_importDeclaration180); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal18_tree = 
            (Object)adaptor.create(char_literal18)
            ;
            adaptor.addChild(root_0, char_literal18_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "importDeclaration"


    public static class typeDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeDeclaration"
    // Java.g:35:1: typeDeclaration : ( classOrInterfaceDeclaration | ';' );
    public final JavaParser.typeDeclaration_return typeDeclaration() throws RecognitionException {
        JavaParser.typeDeclaration_return retval = new JavaParser.typeDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal20=null;
        JavaParser.classOrInterfaceDeclaration_return classOrInterfaceDeclaration19 =null;


        Object char_literal20_tree=null;

        try {
            // Java.g:36:5: ( classOrInterfaceDeclaration | ';' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ENUM||LA11_0==54||LA11_0==59||LA11_0==66||LA11_0==74||LA11_0==83||(LA11_0 >= 89 && LA11_0 <= 91)||(LA11_0 >= 94 && LA11_0 <= 95)) ) {
                alt11=1;
            }
            else if ( (LA11_0==48) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // Java.g:36:9: classOrInterfaceDeclaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classOrInterfaceDeclaration_in_typeDeclaration203);
                    classOrInterfaceDeclaration19=classOrInterfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classOrInterfaceDeclaration19.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:37:9: ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal20=(Token)match(input,48,FOLLOW_48_in_typeDeclaration213); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal20_tree = 
                    (Object)adaptor.create(char_literal20)
                    ;
                    adaptor.addChild(root_0, char_literal20_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeDeclaration"


    public static class classOrInterfaceDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classOrInterfaceDeclaration"
    // Java.g:40:1: classOrInterfaceDeclaration : classOrInterfaceModifiers ( classDeclaration | interfaceDeclaration ) ;
    public final JavaParser.classOrInterfaceDeclaration_return classOrInterfaceDeclaration() throws RecognitionException {
        JavaParser.classOrInterfaceDeclaration_return retval = new JavaParser.classOrInterfaceDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.classOrInterfaceModifiers_return classOrInterfaceModifiers21 =null;

        JavaParser.classDeclaration_return classDeclaration22 =null;

        JavaParser.interfaceDeclaration_return interfaceDeclaration23 =null;



        try {
            // Java.g:41:5: ( classOrInterfaceModifiers ( classDeclaration | interfaceDeclaration ) )
            // Java.g:41:9: classOrInterfaceModifiers ( classDeclaration | interfaceDeclaration )
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_classOrInterfaceModifiers_in_classOrInterfaceDeclaration236);
            classOrInterfaceModifiers21=classOrInterfaceModifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, classOrInterfaceModifiers21.getTree());

            // Java.g:41:35: ( classDeclaration | interfaceDeclaration )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ENUM||LA12_0==66) ) {
                alt12=1;
            }
            else if ( (LA12_0==54||LA12_0==83) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // Java.g:41:36: classDeclaration
                    {
                    pushFollow(FOLLOW_classDeclaration_in_classOrInterfaceDeclaration239);
                    classDeclaration22=classDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDeclaration22.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:41:55: interfaceDeclaration
                    {
                    pushFollow(FOLLOW_interfaceDeclaration_in_classOrInterfaceDeclaration243);
                    interfaceDeclaration23=interfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDeclaration23.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classOrInterfaceDeclaration"


    public static class classOrInterfaceModifiers_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classOrInterfaceModifiers"
    // Java.g:44:1: classOrInterfaceModifiers : ( classOrInterfaceModifier )* ;
    public final JavaParser.classOrInterfaceModifiers_return classOrInterfaceModifiers() throws RecognitionException {
        JavaParser.classOrInterfaceModifiers_return retval = new JavaParser.classOrInterfaceModifiers_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.classOrInterfaceModifier_return classOrInterfaceModifier24 =null;



        try {
            // Java.g:45:5: ( ( classOrInterfaceModifier )* )
            // Java.g:45:9: ( classOrInterfaceModifier )*
            {
            root_0 = (Object)adaptor.nil();


            // Java.g:45:9: ( classOrInterfaceModifier )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==54) ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==Identifier) ) {
                        alt13=1;
                    }


                }
                else if ( (LA13_0==59||LA13_0==74||(LA13_0 >= 89 && LA13_0 <= 91)||(LA13_0 >= 94 && LA13_0 <= 95)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Java.g:45:9: classOrInterfaceModifier
            	    {
            	    pushFollow(FOLLOW_classOrInterfaceModifier_in_classOrInterfaceModifiers267);
            	    classOrInterfaceModifier24=classOrInterfaceModifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classOrInterfaceModifier24.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classOrInterfaceModifiers"


    public static class classOrInterfaceModifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classOrInterfaceModifier"
    // Java.g:48:1: classOrInterfaceModifier : ( annotation | 'public' | 'protected' | 'private' | 'abstract' | 'static' | 'final' | 'strictfp' );
    public final JavaParser.classOrInterfaceModifier_return classOrInterfaceModifier() throws RecognitionException {
        JavaParser.classOrInterfaceModifier_return retval = new JavaParser.classOrInterfaceModifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal26=null;
        Token string_literal27=null;
        Token string_literal28=null;
        Token string_literal29=null;
        Token string_literal30=null;
        Token string_literal31=null;
        Token string_literal32=null;
        JavaParser.annotation_return annotation25 =null;


        Object string_literal26_tree=null;
        Object string_literal27_tree=null;
        Object string_literal28_tree=null;
        Object string_literal29_tree=null;
        Object string_literal30_tree=null;
        Object string_literal31_tree=null;
        Object string_literal32_tree=null;

        try {
            // Java.g:49:5: ( annotation | 'public' | 'protected' | 'private' | 'abstract' | 'static' | 'final' | 'strictfp' )
            int alt14=8;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt14=1;
                }
                break;
            case 91:
                {
                alt14=2;
                }
                break;
            case 90:
                {
                alt14=3;
                }
                break;
            case 89:
                {
                alt14=4;
                }
                break;
            case 59:
                {
                alt14=5;
                }
                break;
            case 94:
                {
                alt14=6;
                }
                break;
            case 74:
                {
                alt14=7;
                }
                break;
            case 95:
                {
                alt14=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // Java.g:49:9: annotation
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_annotation_in_classOrInterfaceModifier287);
                    annotation25=annotation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, annotation25.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:50:9: 'public'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal26=(Token)match(input,91,FOLLOW_91_in_classOrInterfaceModifier300); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal26_tree = 
                    (Object)adaptor.create(string_literal26)
                    ;
                    adaptor.addChild(root_0, string_literal26_tree);
                    }

                    }
                    break;
                case 3 :
                    // Java.g:51:9: 'protected'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal27=(Token)match(input,90,FOLLOW_90_in_classOrInterfaceModifier315); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal27_tree = 
                    (Object)adaptor.create(string_literal27)
                    ;
                    adaptor.addChild(root_0, string_literal27_tree);
                    }

                    }
                    break;
                case 4 :
                    // Java.g:52:9: 'private'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal28=(Token)match(input,89,FOLLOW_89_in_classOrInterfaceModifier327); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal28_tree = 
                    (Object)adaptor.create(string_literal28)
                    ;
                    adaptor.addChild(root_0, string_literal28_tree);
                    }

                    }
                    break;
                case 5 :
                    // Java.g:53:9: 'abstract'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal29=(Token)match(input,59,FOLLOW_59_in_classOrInterfaceModifier341); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal29_tree = 
                    (Object)adaptor.create(string_literal29)
                    ;
                    adaptor.addChild(root_0, string_literal29_tree);
                    }

                    }
                    break;
                case 6 :
                    // Java.g:54:9: 'static'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal30=(Token)match(input,94,FOLLOW_94_in_classOrInterfaceModifier354); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal30_tree = 
                    (Object)adaptor.create(string_literal30)
                    ;
                    adaptor.addChild(root_0, string_literal30_tree);
                    }

                    }
                    break;
                case 7 :
                    // Java.g:55:9: 'final'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal31=(Token)match(input,74,FOLLOW_74_in_classOrInterfaceModifier369); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal31_tree = 
                    (Object)adaptor.create(string_literal31)
                    ;
                    adaptor.addChild(root_0, string_literal31_tree);
                    }

                    }
                    break;
                case 8 :
                    // Java.g:56:9: 'strictfp'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal32=(Token)match(input,95,FOLLOW_95_in_classOrInterfaceModifier385); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal32_tree = 
                    (Object)adaptor.create(string_literal32)
                    ;
                    adaptor.addChild(root_0, string_literal32_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classOrInterfaceModifier"


    public static class modifiers_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "modifiers"
    // Java.g:59:1: modifiers : ( modifier )* ;
    public final JavaParser.modifiers_return modifiers() throws RecognitionException {
        JavaParser.modifiers_return retval = new JavaParser.modifiers_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.modifier_return modifier33 =null;



        try {
            // Java.g:60:5: ( ( modifier )* )
            // Java.g:60:9: ( modifier )*
            {
            root_0 = (Object)adaptor.nil();


            // Java.g:60:9: ( modifier )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==54) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==Identifier) ) {
                        alt15=1;
                    }


                }
                else if ( (LA15_0==59||LA15_0==74||LA15_0==85||(LA15_0 >= 89 && LA15_0 <= 91)||(LA15_0 >= 94 && LA15_0 <= 95)||LA15_0==98||LA15_0==102||LA15_0==106) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // Java.g:60:9: modifier
            	    {
            	    pushFollow(FOLLOW_modifier_in_modifiers407);
            	    modifier33=modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, modifier33.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "modifiers"


    public static class classDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDeclaration"
    // Java.g:63:1: classDeclaration : ( normalClassDeclaration | enumDeclaration );
    public final JavaParser.classDeclaration_return classDeclaration() throws RecognitionException {
        JavaParser.classDeclaration_return retval = new JavaParser.classDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.normalClassDeclaration_return normalClassDeclaration34 =null;

        JavaParser.enumDeclaration_return enumDeclaration35 =null;



        try {
            // Java.g:64:5: ( normalClassDeclaration | enumDeclaration )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==66) ) {
                alt16=1;
            }
            else if ( (LA16_0==ENUM) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // Java.g:64:9: normalClassDeclaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_normalClassDeclaration_in_classDeclaration427);
                    normalClassDeclaration34=normalClassDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, normalClassDeclaration34.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:65:9: enumDeclaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enumDeclaration_in_classDeclaration437);
                    enumDeclaration35=enumDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDeclaration35.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classDeclaration"


    public static class normalClassDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "normalClassDeclaration"
    // Java.g:68:1: normalClassDeclaration : 'class' Identifier ( typeParameters )? ( 'extends' type )? ( 'implements' typeList )? classBody ;
    public final JavaParser.normalClassDeclaration_return normalClassDeclaration() throws RecognitionException {
        JavaParser.normalClassDeclaration_return retval = new JavaParser.normalClassDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal36=null;
        Token Identifier37=null;
        Token string_literal39=null;
        Token string_literal41=null;
        JavaParser.typeParameters_return typeParameters38 =null;

        JavaParser.type_return type40 =null;

        JavaParser.typeList_return typeList42 =null;

        JavaParser.classBody_return classBody43 =null;


        Object string_literal36_tree=null;
        Object Identifier37_tree=null;
        Object string_literal39_tree=null;
        Object string_literal41_tree=null;

        try {
            // Java.g:69:5: ( 'class' Identifier ( typeParameters )? ( 'extends' type )? ( 'implements' typeList )? classBody )
            // Java.g:69:9: 'class' Identifier ( typeParameters )? ( 'extends' type )? ( 'implements' typeList )? classBody
            {
            root_0 = (Object)adaptor.nil();


            string_literal36=(Token)match(input,66,FOLLOW_66_in_normalClassDeclaration460); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal36_tree = 
            (Object)adaptor.create(string_literal36)
            ;
            adaptor.addChild(root_0, string_literal36_tree);
            }

            Identifier37=(Token)match(input,Identifier,FOLLOW_Identifier_in_normalClassDeclaration462); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier37_tree = 
            (Object)adaptor.create(Identifier37)
            ;
            adaptor.addChild(root_0, Identifier37_tree);
            }

            // Java.g:69:28: ( typeParameters )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==49) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // Java.g:69:28: typeParameters
                    {
                    pushFollow(FOLLOW_typeParameters_in_normalClassDeclaration464);
                    typeParameters38=typeParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParameters38.getTree());

                    }
                    break;

            }


            // Java.g:70:9: ( 'extends' type )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==72) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Java.g:70:10: 'extends' type
                    {
                    string_literal39=(Token)match(input,72,FOLLOW_72_in_normalClassDeclaration476); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal39_tree = 
                    (Object)adaptor.create(string_literal39)
                    ;
                    adaptor.addChild(root_0, string_literal39_tree);
                    }

                    pushFollow(FOLLOW_type_in_normalClassDeclaration478);
                    type40=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type40.getTree());

                    }
                    break;

            }


            // Java.g:71:9: ( 'implements' typeList )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==79) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Java.g:71:10: 'implements' typeList
                    {
                    string_literal41=(Token)match(input,79,FOLLOW_79_in_normalClassDeclaration491); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal41_tree = 
                    (Object)adaptor.create(string_literal41)
                    ;
                    adaptor.addChild(root_0, string_literal41_tree);
                    }

                    pushFollow(FOLLOW_typeList_in_normalClassDeclaration493);
                    typeList42=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList42.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_classBody_in_normalClassDeclaration505);
            classBody43=classBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody43.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "normalClassDeclaration"


    public static class typeParameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeParameters"
    // Java.g:75:1: typeParameters : '<' typeParameter ( ',' typeParameter )* '>' ;
    public final JavaParser.typeParameters_return typeParameters() throws RecognitionException {
        JavaParser.typeParameters_return retval = new JavaParser.typeParameters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal44=null;
        Token char_literal46=null;
        Token char_literal48=null;
        JavaParser.typeParameter_return typeParameter45 =null;

        JavaParser.typeParameter_return typeParameter47 =null;


        Object char_literal44_tree=null;
        Object char_literal46_tree=null;
        Object char_literal48_tree=null;

        try {
            // Java.g:76:5: ( '<' typeParameter ( ',' typeParameter )* '>' )
            // Java.g:76:9: '<' typeParameter ( ',' typeParameter )* '>'
            {
            root_0 = (Object)adaptor.nil();


            char_literal44=(Token)match(input,49,FOLLOW_49_in_typeParameters528); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal44_tree = 
            (Object)adaptor.create(char_literal44)
            ;
            adaptor.addChild(root_0, char_literal44_tree);
            }

            pushFollow(FOLLOW_typeParameter_in_typeParameters530);
            typeParameter45=typeParameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParameter45.getTree());

            // Java.g:76:27: ( ',' typeParameter )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==39) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Java.g:76:28: ',' typeParameter
            	    {
            	    char_literal46=(Token)match(input,39,FOLLOW_39_in_typeParameters533); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal46_tree = 
            	    (Object)adaptor.create(char_literal46)
            	    ;
            	    adaptor.addChild(root_0, char_literal46_tree);
            	    }

            	    pushFollow(FOLLOW_typeParameter_in_typeParameters535);
            	    typeParameter47=typeParameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParameter47.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            char_literal48=(Token)match(input,52,FOLLOW_52_in_typeParameters539); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal48_tree = 
            (Object)adaptor.create(char_literal48)
            ;
            adaptor.addChild(root_0, char_literal48_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeParameters"


    public static class typeParameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeParameter"
    // Java.g:79:1: typeParameter : Identifier ( 'extends' typeBound )? ;
    public final JavaParser.typeParameter_return typeParameter() throws RecognitionException {
        JavaParser.typeParameter_return retval = new JavaParser.typeParameter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Identifier49=null;
        Token string_literal50=null;
        JavaParser.typeBound_return typeBound51 =null;


        Object Identifier49_tree=null;
        Object string_literal50_tree=null;

        try {
            // Java.g:80:5: ( Identifier ( 'extends' typeBound )? )
            // Java.g:80:9: Identifier ( 'extends' typeBound )?
            {
            root_0 = (Object)adaptor.nil();


            Identifier49=(Token)match(input,Identifier,FOLLOW_Identifier_in_typeParameter558); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier49_tree = 
            (Object)adaptor.create(Identifier49)
            ;
            adaptor.addChild(root_0, Identifier49_tree);
            }

            // Java.g:80:20: ( 'extends' typeBound )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==72) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // Java.g:80:21: 'extends' typeBound
                    {
                    string_literal50=(Token)match(input,72,FOLLOW_72_in_typeParameter561); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal50_tree = 
                    (Object)adaptor.create(string_literal50)
                    ;
                    adaptor.addChild(root_0, string_literal50_tree);
                    }

                    pushFollow(FOLLOW_typeBound_in_typeParameter563);
                    typeBound51=typeBound();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeBound51.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeParameter"


    public static class typeBound_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeBound"
    // Java.g:83:1: typeBound : type ( '&' type )* ;
    public final JavaParser.typeBound_return typeBound() throws RecognitionException {
        JavaParser.typeBound_return retval = new JavaParser.typeBound_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal53=null;
        JavaParser.type_return type52 =null;

        JavaParser.type_return type54 =null;


        Object char_literal53_tree=null;

        try {
            // Java.g:84:5: ( type ( '&' type )* )
            // Java.g:84:9: type ( '&' type )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_in_typeBound592);
            type52=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type52.getTree());

            // Java.g:84:14: ( '&' type )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==30) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // Java.g:84:15: '&' type
            	    {
            	    char_literal53=(Token)match(input,30,FOLLOW_30_in_typeBound595); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal53_tree = 
            	    (Object)adaptor.create(char_literal53)
            	    ;
            	    adaptor.addChild(root_0, char_literal53_tree);
            	    }

            	    pushFollow(FOLLOW_type_in_typeBound597);
            	    type54=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type54.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeBound"


    public static class enumDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumDeclaration"
    // Java.g:87:1: enumDeclaration : ENUM Identifier ( 'implements' typeList )? enumBody ;
    public final JavaParser.enumDeclaration_return enumDeclaration() throws RecognitionException {
        JavaParser.enumDeclaration_return retval = new JavaParser.enumDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ENUM55=null;
        Token Identifier56=null;
        Token string_literal57=null;
        JavaParser.typeList_return typeList58 =null;

        JavaParser.enumBody_return enumBody59 =null;


        Object ENUM55_tree=null;
        Object Identifier56_tree=null;
        Object string_literal57_tree=null;

        try {
            // Java.g:88:5: ( ENUM Identifier ( 'implements' typeList )? enumBody )
            // Java.g:88:9: ENUM Identifier ( 'implements' typeList )? enumBody
            {
            root_0 = (Object)adaptor.nil();


            ENUM55=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDeclaration618); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ENUM55_tree = 
            (Object)adaptor.create(ENUM55)
            ;
            adaptor.addChild(root_0, ENUM55_tree);
            }

            Identifier56=(Token)match(input,Identifier,FOLLOW_Identifier_in_enumDeclaration620); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier56_tree = 
            (Object)adaptor.create(Identifier56)
            ;
            adaptor.addChild(root_0, Identifier56_tree);
            }

            // Java.g:88:25: ( 'implements' typeList )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==79) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // Java.g:88:26: 'implements' typeList
                    {
                    string_literal57=(Token)match(input,79,FOLLOW_79_in_enumDeclaration623); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal57_tree = 
                    (Object)adaptor.create(string_literal57)
                    ;
                    adaptor.addChild(root_0, string_literal57_tree);
                    }

                    pushFollow(FOLLOW_typeList_in_enumDeclaration625);
                    typeList58=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList58.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_enumBody_in_enumDeclaration629);
            enumBody59=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, enumBody59.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "enumDeclaration"


    public static class enumBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumBody"
    // Java.g:91:1: enumBody : '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}' ;
    public final JavaParser.enumBody_return enumBody() throws RecognitionException {
        JavaParser.enumBody_return retval = new JavaParser.enumBody_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal60=null;
        Token char_literal62=null;
        Token char_literal64=null;
        JavaParser.enumConstants_return enumConstants61 =null;

        JavaParser.enumBodyDeclarations_return enumBodyDeclarations63 =null;


        Object char_literal60_tree=null;
        Object char_literal62_tree=null;
        Object char_literal64_tree=null;

        try {
            // Java.g:92:5: ( '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}' )
            // Java.g:92:9: '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}'
            {
            root_0 = (Object)adaptor.nil();


            char_literal60=(Token)match(input,108,FOLLOW_108_in_enumBody648); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal60_tree = 
            (Object)adaptor.create(char_literal60)
            ;
            adaptor.addChild(root_0, char_literal60_tree);
            }

            // Java.g:92:13: ( enumConstants )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Identifier||LA24_0==54) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // Java.g:92:13: enumConstants
                    {
                    pushFollow(FOLLOW_enumConstants_in_enumBody650);
                    enumConstants61=enumConstants();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumConstants61.getTree());

                    }
                    break;

            }


            // Java.g:92:28: ( ',' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // Java.g:92:28: ','
                    {
                    char_literal62=(Token)match(input,39,FOLLOW_39_in_enumBody653); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal62_tree = 
                    (Object)adaptor.create(char_literal62)
                    ;
                    adaptor.addChild(root_0, char_literal62_tree);
                    }

                    }
                    break;

            }


            // Java.g:92:33: ( enumBodyDeclarations )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==48) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // Java.g:92:33: enumBodyDeclarations
                    {
                    pushFollow(FOLLOW_enumBodyDeclarations_in_enumBody656);
                    enumBodyDeclarations63=enumBodyDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumBodyDeclarations63.getTree());

                    }
                    break;

            }


            char_literal64=(Token)match(input,112,FOLLOW_112_in_enumBody659); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal64_tree = 
            (Object)adaptor.create(char_literal64)
            ;
            adaptor.addChild(root_0, char_literal64_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "enumBody"


    public static class enumConstants_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumConstants"
    // Java.g:95:1: enumConstants : enumConstant ( ',' enumConstant )* ;
    public final JavaParser.enumConstants_return enumConstants() throws RecognitionException {
        JavaParser.enumConstants_return retval = new JavaParser.enumConstants_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal66=null;
        JavaParser.enumConstant_return enumConstant65 =null;

        JavaParser.enumConstant_return enumConstant67 =null;


        Object char_literal66_tree=null;

        try {
            // Java.g:96:5: ( enumConstant ( ',' enumConstant )* )
            // Java.g:96:9: enumConstant ( ',' enumConstant )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_enumConstant_in_enumConstants678);
            enumConstant65=enumConstant();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, enumConstant65.getTree());

            // Java.g:96:22: ( ',' enumConstant )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==39) ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==Identifier||LA27_1==54) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // Java.g:96:23: ',' enumConstant
            	    {
            	    char_literal66=(Token)match(input,39,FOLLOW_39_in_enumConstants681); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal66_tree = 
            	    (Object)adaptor.create(char_literal66)
            	    ;
            	    adaptor.addChild(root_0, char_literal66_tree);
            	    }

            	    pushFollow(FOLLOW_enumConstant_in_enumConstants683);
            	    enumConstant67=enumConstant();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumConstant67.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "enumConstants"


    public static class enumConstant_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumConstant"
    // Java.g:99:1: enumConstant : ( annotations )? Identifier ( arguments )? ( classBody )? ;
    public final JavaParser.enumConstant_return enumConstant() throws RecognitionException {
        JavaParser.enumConstant_return retval = new JavaParser.enumConstant_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Identifier69=null;
        JavaParser.annotations_return annotations68 =null;

        JavaParser.arguments_return arguments70 =null;

        JavaParser.classBody_return classBody71 =null;


        Object Identifier69_tree=null;

        try {
            // Java.g:100:5: ( ( annotations )? Identifier ( arguments )? ( classBody )? )
            // Java.g:100:9: ( annotations )? Identifier ( arguments )? ( classBody )?
            {
            root_0 = (Object)adaptor.nil();


            // Java.g:100:9: ( annotations )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==54) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // Java.g:100:9: annotations
                    {
                    pushFollow(FOLLOW_annotations_in_enumConstant708);
                    annotations68=annotations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, annotations68.getTree());

                    }
                    break;

            }


            Identifier69=(Token)match(input,Identifier,FOLLOW_Identifier_in_enumConstant711); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier69_tree = 
            (Object)adaptor.create(Identifier69)
            ;
            adaptor.addChild(root_0, Identifier69_tree);
            }

            // Java.g:100:33: ( arguments )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // Java.g:100:33: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_enumConstant713);
                    arguments70=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments70.getTree());

                    }
                    break;

            }


            // Java.g:100:44: ( classBody )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==108) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // Java.g:100:44: classBody
                    {
                    pushFollow(FOLLOW_classBody_in_enumConstant716);
                    classBody71=classBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody71.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "enumConstant"


    public static class enumBodyDeclarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumBodyDeclarations"
    // Java.g:103:1: enumBodyDeclarations : ';' ( classBodyDeclaration )* ;
    public final JavaParser.enumBodyDeclarations_return enumBodyDeclarations() throws RecognitionException {
        JavaParser.enumBodyDeclarations_return retval = new JavaParser.enumBodyDeclarations_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal72=null;
        JavaParser.classBodyDeclaration_return classBodyDeclaration73 =null;


        Object char_literal72_tree=null;

        try {
            // Java.g:104:5: ( ';' ( classBodyDeclaration )* )
            // Java.g:104:9: ';' ( classBodyDeclaration )*
            {
            root_0 = (Object)adaptor.nil();


            char_literal72=(Token)match(input,48,FOLLOW_48_in_enumBodyDeclarations740); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal72_tree = 
            (Object)adaptor.create(char_literal72)
            ;
            adaptor.addChild(root_0, char_literal72_tree);
            }

            // Java.g:104:13: ( classBodyDeclaration )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==ENUM||LA31_0==Identifier||(LA31_0 >= 48 && LA31_0 <= 49)||LA31_0==54||(LA31_0 >= 59 && LA31_0 <= 60)||LA31_0==62||(LA31_0 >= 65 && LA31_0 <= 66)||LA31_0==70||LA31_0==74||LA31_0==76||(LA31_0 >= 82 && LA31_0 <= 85)||(LA31_0 >= 89 && LA31_0 <= 91)||(LA31_0 >= 93 && LA31_0 <= 95)||LA31_0==98||LA31_0==102||(LA31_0 >= 105 && LA31_0 <= 106)||LA31_0==108) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // Java.g:104:14: classBodyDeclaration
            	    {
            	    pushFollow(FOLLOW_classBodyDeclaration_in_enumBodyDeclarations743);
            	    classBodyDeclaration73=classBodyDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBodyDeclaration73.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "enumBodyDeclarations"


    public static class interfaceDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaceDeclaration"
    // Java.g:107:1: interfaceDeclaration : ( normalInterfaceDeclaration | annotationTypeDeclaration );
    public final JavaParser.interfaceDeclaration_return interfaceDeclaration() throws RecognitionException {
        JavaParser.interfaceDeclaration_return retval = new JavaParser.interfaceDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.normalInterfaceDeclaration_return normalInterfaceDeclaration74 =null;

        JavaParser.annotationTypeDeclaration_return annotationTypeDeclaration75 =null;



        try {
            // Java.g:108:5: ( normalInterfaceDeclaration | annotationTypeDeclaration )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==83) ) {
                alt32=1;
            }
            else if ( (LA32_0==54) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // Java.g:108:9: normalInterfaceDeclaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_normalInterfaceDeclaration_in_interfaceDeclaration768);
                    normalInterfaceDeclaration74=normalInterfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, normalInterfaceDeclaration74.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:109:9: annotationTypeDeclaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_annotationTypeDeclaration_in_interfaceDeclaration778);
                    annotationTypeDeclaration75=annotationTypeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationTypeDeclaration75.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "interfaceDeclaration"


    public static class normalInterfaceDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "normalInterfaceDeclaration"
    // Java.g:112:1: normalInterfaceDeclaration : 'interface' Identifier ( typeParameters )? ( 'extends' typeList )? interfaceBody ;
    public final JavaParser.normalInterfaceDeclaration_return normalInterfaceDeclaration() throws RecognitionException {
        JavaParser.normalInterfaceDeclaration_return retval = new JavaParser.normalInterfaceDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal76=null;
        Token Identifier77=null;
        Token string_literal79=null;
        JavaParser.typeParameters_return typeParameters78 =null;

        JavaParser.typeList_return typeList80 =null;

        JavaParser.interfaceBody_return interfaceBody81 =null;


        Object string_literal76_tree=null;
        Object Identifier77_tree=null;
        Object string_literal79_tree=null;

        try {
            // Java.g:113:5: ( 'interface' Identifier ( typeParameters )? ( 'extends' typeList )? interfaceBody )
            // Java.g:113:9: 'interface' Identifier ( typeParameters )? ( 'extends' typeList )? interfaceBody
            {
            root_0 = (Object)adaptor.nil();


            string_literal76=(Token)match(input,83,FOLLOW_83_in_normalInterfaceDeclaration801); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal76_tree = 
            (Object)adaptor.create(string_literal76)
            ;
            adaptor.addChild(root_0, string_literal76_tree);
            }

            Identifier77=(Token)match(input,Identifier,FOLLOW_Identifier_in_normalInterfaceDeclaration803); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier77_tree = 
            (Object)adaptor.create(Identifier77)
            ;
            adaptor.addChild(root_0, Identifier77_tree);
            }

            // Java.g:113:32: ( typeParameters )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==49) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // Java.g:113:32: typeParameters
                    {
                    pushFollow(FOLLOW_typeParameters_in_normalInterfaceDeclaration805);
                    typeParameters78=typeParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParameters78.getTree());

                    }
                    break;

            }


            // Java.g:113:48: ( 'extends' typeList )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==72) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // Java.g:113:49: 'extends' typeList
                    {
                    string_literal79=(Token)match(input,72,FOLLOW_72_in_normalInterfaceDeclaration809); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal79_tree = 
                    (Object)adaptor.create(string_literal79)
                    ;
                    adaptor.addChild(root_0, string_literal79_tree);
                    }

                    pushFollow(FOLLOW_typeList_in_normalInterfaceDeclaration811);
                    typeList80=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList80.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_interfaceBody_in_normalInterfaceDeclaration815);
            interfaceBody81=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody81.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "normalInterfaceDeclaration"


    public static class typeList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeList"
    // Java.g:116:1: typeList : type ( ',' type )* ;
    public final JavaParser.typeList_return typeList() throws RecognitionException {
        JavaParser.typeList_return retval = new JavaParser.typeList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal83=null;
        JavaParser.type_return type82 =null;

        JavaParser.type_return type84 =null;


        Object char_literal83_tree=null;

        try {
            // Java.g:117:5: ( type ( ',' type )* )
            // Java.g:117:9: type ( ',' type )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_in_typeList838);
            type82=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type82.getTree());

            // Java.g:117:14: ( ',' type )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==39) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // Java.g:117:15: ',' type
            	    {
            	    char_literal83=(Token)match(input,39,FOLLOW_39_in_typeList841); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal83_tree = 
            	    (Object)adaptor.create(char_literal83)
            	    ;
            	    adaptor.addChild(root_0, char_literal83_tree);
            	    }

            	    pushFollow(FOLLOW_type_in_typeList843);
            	    type84=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type84.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeList"


    public static class classBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classBody"
    // Java.g:120:1: classBody : '{' ( classBodyDeclaration )* '}' ;
    public final JavaParser.classBody_return classBody() throws RecognitionException {
        JavaParser.classBody_return retval = new JavaParser.classBody_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal85=null;
        Token char_literal87=null;
        JavaParser.classBodyDeclaration_return classBodyDeclaration86 =null;


        Object char_literal85_tree=null;
        Object char_literal87_tree=null;

        try {
            // Java.g:121:5: ( '{' ( classBodyDeclaration )* '}' )
            // Java.g:121:9: '{' ( classBodyDeclaration )* '}'
            {
            root_0 = (Object)adaptor.nil();


            char_literal85=(Token)match(input,108,FOLLOW_108_in_classBody868); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal85_tree = 
            (Object)adaptor.create(char_literal85)
            ;
            adaptor.addChild(root_0, char_literal85_tree);
            }

            // Java.g:121:13: ( classBodyDeclaration )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==ENUM||LA36_0==Identifier||(LA36_0 >= 48 && LA36_0 <= 49)||LA36_0==54||(LA36_0 >= 59 && LA36_0 <= 60)||LA36_0==62||(LA36_0 >= 65 && LA36_0 <= 66)||LA36_0==70||LA36_0==74||LA36_0==76||(LA36_0 >= 82 && LA36_0 <= 85)||(LA36_0 >= 89 && LA36_0 <= 91)||(LA36_0 >= 93 && LA36_0 <= 95)||LA36_0==98||LA36_0==102||(LA36_0 >= 105 && LA36_0 <= 106)||LA36_0==108) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // Java.g:121:13: classBodyDeclaration
            	    {
            	    pushFollow(FOLLOW_classBodyDeclaration_in_classBody870);
            	    classBodyDeclaration86=classBodyDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBodyDeclaration86.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            char_literal87=(Token)match(input,112,FOLLOW_112_in_classBody873); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal87_tree = 
            (Object)adaptor.create(char_literal87)
            ;
            adaptor.addChild(root_0, char_literal87_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classBody"


    public static class interfaceBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaceBody"
    // Java.g:124:1: interfaceBody : '{' ( interfaceBodyDeclaration )* '}' ;
    public final JavaParser.interfaceBody_return interfaceBody() throws RecognitionException {
        JavaParser.interfaceBody_return retval = new JavaParser.interfaceBody_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal88=null;
        Token char_literal90=null;
        JavaParser.interfaceBodyDeclaration_return interfaceBodyDeclaration89 =null;


        Object char_literal88_tree=null;
        Object char_literal90_tree=null;

        try {
            // Java.g:125:5: ( '{' ( interfaceBodyDeclaration )* '}' )
            // Java.g:125:9: '{' ( interfaceBodyDeclaration )* '}'
            {
            root_0 = (Object)adaptor.nil();


            char_literal88=(Token)match(input,108,FOLLOW_108_in_interfaceBody896); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal88_tree = 
            (Object)adaptor.create(char_literal88)
            ;
            adaptor.addChild(root_0, char_literal88_tree);
            }

            // Java.g:125:13: ( interfaceBodyDeclaration )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==ENUM||LA37_0==Identifier||(LA37_0 >= 48 && LA37_0 <= 49)||LA37_0==54||(LA37_0 >= 59 && LA37_0 <= 60)||LA37_0==62||(LA37_0 >= 65 && LA37_0 <= 66)||LA37_0==70||LA37_0==74||LA37_0==76||(LA37_0 >= 82 && LA37_0 <= 85)||(LA37_0 >= 89 && LA37_0 <= 91)||(LA37_0 >= 93 && LA37_0 <= 95)||LA37_0==98||LA37_0==102||(LA37_0 >= 105 && LA37_0 <= 106)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // Java.g:125:13: interfaceBodyDeclaration
            	    {
            	    pushFollow(FOLLOW_interfaceBodyDeclaration_in_interfaceBody898);
            	    interfaceBodyDeclaration89=interfaceBodyDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBodyDeclaration89.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            char_literal90=(Token)match(input,112,FOLLOW_112_in_interfaceBody901); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal90_tree = 
            (Object)adaptor.create(char_literal90)
            ;
            adaptor.addChild(root_0, char_literal90_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "interfaceBody"


    public static class classBodyDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classBodyDeclaration"
    // Java.g:128:1: classBodyDeclaration : ( ';' | ( 'static' )? block | modifiers memberDecl );
    public final JavaParser.classBodyDeclaration_return classBodyDeclaration() throws RecognitionException {
        JavaParser.classBodyDeclaration_return retval = new JavaParser.classBodyDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal91=null;
        Token string_literal92=null;
        JavaParser.block_return block93 =null;

        JavaParser.modifiers_return modifiers94 =null;

        JavaParser.memberDecl_return memberDecl95 =null;


        Object char_literal91_tree=null;
        Object string_literal92_tree=null;

        try {
            // Java.g:129:5: ( ';' | ( 'static' )? block | modifiers memberDecl )
            int alt39=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt39=1;
                }
                break;
            case 94:
                {
                int LA39_2 = input.LA(2);

                if ( (LA39_2==108) ) {
                    alt39=2;
                }
                else if ( (LA39_2==ENUM||LA39_2==Identifier||LA39_2==49||LA39_2==54||(LA39_2 >= 59 && LA39_2 <= 60)||LA39_2==62||(LA39_2 >= 65 && LA39_2 <= 66)||LA39_2==70||LA39_2==74||LA39_2==76||(LA39_2 >= 82 && LA39_2 <= 85)||(LA39_2 >= 89 && LA39_2 <= 91)||(LA39_2 >= 93 && LA39_2 <= 95)||LA39_2==98||LA39_2==102||(LA39_2 >= 105 && LA39_2 <= 106)) ) {
                    alt39=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 2, input);

                    throw nvae;

                }
                }
                break;
            case 108:
                {
                alt39=2;
                }
                break;
            case ENUM:
            case Identifier:
            case 49:
            case 54:
            case 59:
            case 60:
            case 62:
            case 65:
            case 66:
            case 70:
            case 74:
            case 76:
            case 82:
            case 83:
            case 84:
            case 85:
            case 89:
            case 90:
            case 91:
            case 93:
            case 95:
            case 98:
            case 102:
            case 105:
            case 106:
                {
                alt39=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }

            switch (alt39) {
                case 1 :
                    // Java.g:129:9: ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal91=(Token)match(input,48,FOLLOW_48_in_classBodyDeclaration920); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal91_tree = 
                    (Object)adaptor.create(char_literal91)
                    ;
                    adaptor.addChild(root_0, char_literal91_tree);
                    }

                    }
                    break;
                case 2 :
                    // Java.g:130:9: ( 'static' )? block
                    {
                    root_0 = (Object)adaptor.nil();


                    // Java.g:130:9: ( 'static' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==94) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // Java.g:130:9: 'static'
                            {
                            string_literal92=(Token)match(input,94,FOLLOW_94_in_classBodyDeclaration930); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal92_tree = 
                            (Object)adaptor.create(string_literal92)
                            ;
                            adaptor.addChild(root_0, string_literal92_tree);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_block_in_classBodyDeclaration933);
                    block93=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block93.getTree());

                    }
                    break;
                case 3 :
                    // Java.g:131:9: modifiers memberDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_modifiers_in_classBodyDeclaration943);
                    modifiers94=modifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, modifiers94.getTree());

                    pushFollow(FOLLOW_memberDecl_in_classBodyDeclaration945);
                    memberDecl95=memberDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, memberDecl95.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classBodyDeclaration"


    public static class memberDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "memberDecl"
    // Java.g:134:1: memberDecl : ( genericMethodOrConstructorDecl | memberDeclaration | 'void' Identifier voidMethodDeclaratorRest | Identifier constructorDeclaratorRest | interfaceDeclaration | classDeclaration );
    public final JavaParser.memberDecl_return memberDecl() throws RecognitionException {
        JavaParser.memberDecl_return retval = new JavaParser.memberDecl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal98=null;
        Token Identifier99=null;
        Token Identifier101=null;
        JavaParser.genericMethodOrConstructorDecl_return genericMethodOrConstructorDecl96 =null;

        JavaParser.memberDeclaration_return memberDeclaration97 =null;

        JavaParser.voidMethodDeclaratorRest_return voidMethodDeclaratorRest100 =null;

        JavaParser.constructorDeclaratorRest_return constructorDeclaratorRest102 =null;

        JavaParser.interfaceDeclaration_return interfaceDeclaration103 =null;

        JavaParser.classDeclaration_return classDeclaration104 =null;


        Object string_literal98_tree=null;
        Object Identifier99_tree=null;
        Object Identifier101_tree=null;

        try {
            // Java.g:135:5: ( genericMethodOrConstructorDecl | memberDeclaration | 'void' Identifier voidMethodDeclaratorRest | Identifier constructorDeclaratorRest | interfaceDeclaration | classDeclaration )
            int alt40=6;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt40=1;
                }
                break;
            case Identifier:
                {
                int LA40_2 = input.LA(2);

                if ( (LA40_2==Identifier||LA40_2==43||LA40_2==49||LA40_2==55) ) {
                    alt40=2;
                }
                else if ( (LA40_2==32) ) {
                    alt40=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;

                }
                }
                break;
            case 60:
            case 62:
            case 65:
            case 70:
            case 76:
            case 82:
            case 84:
            case 93:
                {
                alt40=2;
                }
                break;
            case 105:
                {
                alt40=3;
                }
                break;
            case 54:
            case 83:
                {
                alt40=5;
                }
                break;
            case ENUM:
            case 66:
                {
                alt40=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }

            switch (alt40) {
                case 1 :
                    // Java.g:135:9: genericMethodOrConstructorDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_genericMethodOrConstructorDecl_in_memberDecl968);
                    genericMethodOrConstructorDecl96=genericMethodOrConstructorDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericMethodOrConstructorDecl96.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:136:9: memberDeclaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_memberDeclaration_in_memberDecl978);
                    memberDeclaration97=memberDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, memberDeclaration97.getTree());

                    }
                    break;
                case 3 :
                    // Java.g:137:9: 'void' Identifier voidMethodDeclaratorRest
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal98=(Token)match(input,105,FOLLOW_105_in_memberDecl988); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal98_tree = 
                    (Object)adaptor.create(string_literal98)
                    ;
                    adaptor.addChild(root_0, string_literal98_tree);
                    }

                    Identifier99=(Token)match(input,Identifier,FOLLOW_Identifier_in_memberDecl990); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier99_tree = 
                    (Object)adaptor.create(Identifier99)
                    ;
                    adaptor.addChild(root_0, Identifier99_tree);
                    }

                    pushFollow(FOLLOW_voidMethodDeclaratorRest_in_memberDecl992);
                    voidMethodDeclaratorRest100=voidMethodDeclaratorRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, voidMethodDeclaratorRest100.getTree());

                    }
                    break;
                case 4 :
                    // Java.g:138:9: Identifier constructorDeclaratorRest
                    {
                    root_0 = (Object)adaptor.nil();


                    Identifier101=(Token)match(input,Identifier,FOLLOW_Identifier_in_memberDecl1002); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier101_tree = 
                    (Object)adaptor.create(Identifier101)
                    ;
                    adaptor.addChild(root_0, Identifier101_tree);
                    }

                    pushFollow(FOLLOW_constructorDeclaratorRest_in_memberDecl1004);
                    constructorDeclaratorRest102=constructorDeclaratorRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constructorDeclaratorRest102.getTree());

                    }
                    break;
                case 5 :
                    // Java.g:139:9: interfaceDeclaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interfaceDeclaration_in_memberDecl1014);
                    interfaceDeclaration103=interfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDeclaration103.getTree());

                    }
                    break;
                case 6 :
                    // Java.g:140:9: classDeclaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDeclaration_in_memberDecl1024);
                    classDeclaration104=classDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDeclaration104.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "memberDecl"


    public static class memberDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "memberDeclaration"
    // Java.g:143:1: memberDeclaration : type ( methodDeclaration | fieldDeclaration ) ;
    public final JavaParser.memberDeclaration_return memberDeclaration() throws RecognitionException {
        JavaParser.memberDeclaration_return retval = new JavaParser.memberDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.type_return type105 =null;

        JavaParser.methodDeclaration_return methodDeclaration106 =null;

        JavaParser.fieldDeclaration_return fieldDeclaration107 =null;



        try {
            // Java.g:144:5: ( type ( methodDeclaration | fieldDeclaration ) )
            // Java.g:144:9: type ( methodDeclaration | fieldDeclaration )
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_in_memberDeclaration1047);
            type105=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type105.getTree());

            // Java.g:144:14: ( methodDeclaration | fieldDeclaration )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Identifier) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==32) ) {
                    alt41=1;
                }
                else if ( (LA41_1==39||LA41_1==48||LA41_1==50||LA41_1==55) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }
            switch (alt41) {
                case 1 :
                    // Java.g:144:15: methodDeclaration
                    {
                    pushFollow(FOLLOW_methodDeclaration_in_memberDeclaration1050);
                    methodDeclaration106=methodDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeclaration106.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:144:35: fieldDeclaration
                    {
                    pushFollow(FOLLOW_fieldDeclaration_in_memberDeclaration1054);
                    fieldDeclaration107=fieldDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldDeclaration107.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "memberDeclaration"


    public static class genericMethodOrConstructorDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "genericMethodOrConstructorDecl"
    // Java.g:147:1: genericMethodOrConstructorDecl : typeParameters genericMethodOrConstructorRest ;
    public final JavaParser.genericMethodOrConstructorDecl_return genericMethodOrConstructorDecl() throws RecognitionException {
        JavaParser.genericMethodOrConstructorDecl_return retval = new JavaParser.genericMethodOrConstructorDecl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.typeParameters_return typeParameters108 =null;

        JavaParser.genericMethodOrConstructorRest_return genericMethodOrConstructorRest109 =null;



        try {
            // Java.g:148:5: ( typeParameters genericMethodOrConstructorRest )
            // Java.g:148:9: typeParameters genericMethodOrConstructorRest
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_typeParameters_in_genericMethodOrConstructorDecl1074);
            typeParameters108=typeParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParameters108.getTree());

            pushFollow(FOLLOW_genericMethodOrConstructorRest_in_genericMethodOrConstructorDecl1076);
            genericMethodOrConstructorRest109=genericMethodOrConstructorRest();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, genericMethodOrConstructorRest109.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "genericMethodOrConstructorDecl"


    public static class genericMethodOrConstructorRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "genericMethodOrConstructorRest"
    // Java.g:151:1: genericMethodOrConstructorRest : ( ( type | 'void' ) Identifier methodDeclaratorRest | Identifier constructorDeclaratorRest );
    public final JavaParser.genericMethodOrConstructorRest_return genericMethodOrConstructorRest() throws RecognitionException {
        JavaParser.genericMethodOrConstructorRest_return retval = new JavaParser.genericMethodOrConstructorRest_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal111=null;
        Token Identifier112=null;
        Token Identifier114=null;
        JavaParser.type_return type110 =null;

        JavaParser.methodDeclaratorRest_return methodDeclaratorRest113 =null;

        JavaParser.constructorDeclaratorRest_return constructorDeclaratorRest115 =null;


        Object string_literal111_tree=null;
        Object Identifier112_tree=null;
        Object Identifier114_tree=null;

        try {
            // Java.g:152:5: ( ( type | 'void' ) Identifier methodDeclaratorRest | Identifier constructorDeclaratorRest )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Identifier) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==Identifier||LA43_1==43||LA43_1==49||LA43_1==55) ) {
                    alt43=1;
                }
                else if ( (LA43_1==32) ) {
                    alt43=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA43_0==60||LA43_0==62||LA43_0==65||LA43_0==70||LA43_0==76||LA43_0==82||LA43_0==84||LA43_0==93||LA43_0==105) ) {
                alt43=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }
            switch (alt43) {
                case 1 :
                    // Java.g:152:9: ( type | 'void' ) Identifier methodDeclaratorRest
                    {
                    root_0 = (Object)adaptor.nil();


                    // Java.g:152:9: ( type | 'void' )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==Identifier||LA42_0==60||LA42_0==62||LA42_0==65||LA42_0==70||LA42_0==76||LA42_0==82||LA42_0==84||LA42_0==93) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==105) ) {
                        alt42=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;

                    }
                    switch (alt42) {
                        case 1 :
                            // Java.g:152:10: type
                            {
                            pushFollow(FOLLOW_type_in_genericMethodOrConstructorRest1100);
                            type110=type();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, type110.getTree());

                            }
                            break;
                        case 2 :
                            // Java.g:152:17: 'void'
                            {
                            string_literal111=(Token)match(input,105,FOLLOW_105_in_genericMethodOrConstructorRest1104); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal111_tree = 
                            (Object)adaptor.create(string_literal111)
                            ;
                            adaptor.addChild(root_0, string_literal111_tree);
                            }

                            }
                            break;

                    }


                    Identifier112=(Token)match(input,Identifier,FOLLOW_Identifier_in_genericMethodOrConstructorRest1107); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier112_tree = 
                    (Object)adaptor.create(Identifier112)
                    ;
                    adaptor.addChild(root_0, Identifier112_tree);
                    }

                    pushFollow(FOLLOW_methodDeclaratorRest_in_genericMethodOrConstructorRest1109);
                    methodDeclaratorRest113=methodDeclaratorRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeclaratorRest113.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:153:9: Identifier constructorDeclaratorRest
                    {
                    root_0 = (Object)adaptor.nil();


                    Identifier114=(Token)match(input,Identifier,FOLLOW_Identifier_in_genericMethodOrConstructorRest1119); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier114_tree = 
                    (Object)adaptor.create(Identifier114)
                    ;
                    adaptor.addChild(root_0, Identifier114_tree);
                    }

                    pushFollow(FOLLOW_constructorDeclaratorRest_in_genericMethodOrConstructorRest1121);
                    constructorDeclaratorRest115=constructorDeclaratorRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constructorDeclaratorRest115.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "genericMethodOrConstructorRest"


    public static class methodDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodDeclaration"
    // Java.g:156:1: methodDeclaration : Identifier methodDeclaratorRest ;
    public final JavaParser.methodDeclaration_return methodDeclaration() throws RecognitionException {
        JavaParser.methodDeclaration_return retval = new JavaParser.methodDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Identifier116=null;
        JavaParser.methodDeclaratorRest_return methodDeclaratorRest117 =null;


        Object Identifier116_tree=null;

        try {
            // Java.g:157:5: ( Identifier methodDeclaratorRest )
            // Java.g:157:9: Identifier methodDeclaratorRest
            {
            root_0 = (Object)adaptor.nil();


            Identifier116=(Token)match(input,Identifier,FOLLOW_Identifier_in_methodDeclaration1140); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier116_tree = 
            (Object)adaptor.create(Identifier116)
            ;
            adaptor.addChild(root_0, Identifier116_tree);
            }

            pushFollow(FOLLOW_methodDeclaratorRest_in_methodDeclaration1142);
            methodDeclaratorRest117=methodDeclaratorRest();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeclaratorRest117.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "methodDeclaration"


    public static class fieldDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldDeclaration"
    // Java.g:160:1: fieldDeclaration : variableDeclarators ';' ;
    public final JavaParser.fieldDeclaration_return fieldDeclaration() throws RecognitionException {
        JavaParser.fieldDeclaration_return retval = new JavaParser.fieldDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal119=null;
        JavaParser.variableDeclarators_return variableDeclarators118 =null;


        Object char_literal119_tree=null;

        try {
            // Java.g:161:5: ( variableDeclarators ';' )
            // Java.g:161:9: variableDeclarators ';'
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_variableDeclarators_in_fieldDeclaration1161);
            variableDeclarators118=variableDeclarators();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarators118.getTree());

            char_literal119=(Token)match(input,48,FOLLOW_48_in_fieldDeclaration1163); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal119_tree = 
            (Object)adaptor.create(char_literal119)
            ;
            adaptor.addChild(root_0, char_literal119_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fieldDeclaration"


    public static class interfaceBodyDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaceBodyDeclaration"
    // Java.g:164:1: interfaceBodyDeclaration : ( modifiers interfaceMemberDecl | ';' );
    public final JavaParser.interfaceBodyDeclaration_return interfaceBodyDeclaration() throws RecognitionException {
        JavaParser.interfaceBodyDeclaration_return retval = new JavaParser.interfaceBodyDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal122=null;
        JavaParser.modifiers_return modifiers120 =null;

        JavaParser.interfaceMemberDecl_return interfaceMemberDecl121 =null;


        Object char_literal122_tree=null;

        try {
            // Java.g:165:5: ( modifiers interfaceMemberDecl | ';' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==ENUM||LA44_0==Identifier||LA44_0==49||LA44_0==54||(LA44_0 >= 59 && LA44_0 <= 60)||LA44_0==62||(LA44_0 >= 65 && LA44_0 <= 66)||LA44_0==70||LA44_0==74||LA44_0==76||(LA44_0 >= 82 && LA44_0 <= 85)||(LA44_0 >= 89 && LA44_0 <= 91)||(LA44_0 >= 93 && LA44_0 <= 95)||LA44_0==98||LA44_0==102||(LA44_0 >= 105 && LA44_0 <= 106)) ) {
                alt44=1;
            }
            else if ( (LA44_0==48) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }
            switch (alt44) {
                case 1 :
                    // Java.g:165:9: modifiers interfaceMemberDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_modifiers_in_interfaceBodyDeclaration1190);
                    modifiers120=modifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, modifiers120.getTree());

                    pushFollow(FOLLOW_interfaceMemberDecl_in_interfaceBodyDeclaration1192);
                    interfaceMemberDecl121=interfaceMemberDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceMemberDecl121.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:166:9: ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal122=(Token)match(input,48,FOLLOW_48_in_interfaceBodyDeclaration1202); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal122_tree = 
                    (Object)adaptor.create(char_literal122)
                    ;
                    adaptor.addChild(root_0, char_literal122_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "interfaceBodyDeclaration"


    public static class interfaceMemberDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaceMemberDecl"
    // Java.g:169:1: interfaceMemberDecl : ( interfaceMethodOrFieldDecl | interfaceGenericMethodDecl | 'void' Identifier voidInterfaceMethodDeclaratorRest | interfaceDeclaration | classDeclaration );
    public final JavaParser.interfaceMemberDecl_return interfaceMemberDecl() throws RecognitionException {
        JavaParser.interfaceMemberDecl_return retval = new JavaParser.interfaceMemberDecl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal125=null;
        Token Identifier126=null;
        JavaParser.interfaceMethodOrFieldDecl_return interfaceMethodOrFieldDecl123 =null;

        JavaParser.interfaceGenericMethodDecl_return interfaceGenericMethodDecl124 =null;

        JavaParser.voidInterfaceMethodDeclaratorRest_return voidInterfaceMethodDeclaratorRest127 =null;

        JavaParser.interfaceDeclaration_return interfaceDeclaration128 =null;

        JavaParser.classDeclaration_return classDeclaration129 =null;


        Object string_literal125_tree=null;
        Object Identifier126_tree=null;

        try {
            // Java.g:170:5: ( interfaceMethodOrFieldDecl | interfaceGenericMethodDecl | 'void' Identifier voidInterfaceMethodDeclaratorRest | interfaceDeclaration | classDeclaration )
            int alt45=5;
            switch ( input.LA(1) ) {
            case Identifier:
            case 60:
            case 62:
            case 65:
            case 70:
            case 76:
            case 82:
            case 84:
            case 93:
                {
                alt45=1;
                }
                break;
            case 49:
                {
                alt45=2;
                }
                break;
            case 105:
                {
                alt45=3;
                }
                break;
            case 54:
            case 83:
                {
                alt45=4;
                }
                break;
            case ENUM:
            case 66:
                {
                alt45=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }

            switch (alt45) {
                case 1 :
                    // Java.g:170:9: interfaceMethodOrFieldDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interfaceMethodOrFieldDecl_in_interfaceMemberDecl1221);
                    interfaceMethodOrFieldDecl123=interfaceMethodOrFieldDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceMethodOrFieldDecl123.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:171:9: interfaceGenericMethodDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interfaceGenericMethodDecl_in_interfaceMemberDecl1231);
                    interfaceGenericMethodDecl124=interfaceGenericMethodDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceGenericMethodDecl124.getTree());

                    }
                    break;
                case 3 :
                    // Java.g:172:9: 'void' Identifier voidInterfaceMethodDeclaratorRest
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal125=(Token)match(input,105,FOLLOW_105_in_interfaceMemberDecl1241); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal125_tree = 
                    (Object)adaptor.create(string_literal125)
                    ;
                    adaptor.addChild(root_0, string_literal125_tree);
                    }

                    Identifier126=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceMemberDecl1243); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier126_tree = 
                    (Object)adaptor.create(Identifier126)
                    ;
                    adaptor.addChild(root_0, Identifier126_tree);
                    }

                    pushFollow(FOLLOW_voidInterfaceMethodDeclaratorRest_in_interfaceMemberDecl1245);
                    voidInterfaceMethodDeclaratorRest127=voidInterfaceMethodDeclaratorRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, voidInterfaceMethodDeclaratorRest127.getTree());

                    }
                    break;
                case 4 :
                    // Java.g:173:9: interfaceDeclaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interfaceDeclaration_in_interfaceMemberDecl1255);
                    interfaceDeclaration128=interfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDeclaration128.getTree());

                    }
                    break;
                case 5 :
                    // Java.g:174:9: classDeclaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDeclaration_in_interfaceMemberDecl1265);
                    classDeclaration129=classDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDeclaration129.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "interfaceMemberDecl"


    public static class interfaceMethodOrFieldDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaceMethodOrFieldDecl"
    // Java.g:177:1: interfaceMethodOrFieldDecl : type Identifier interfaceMethodOrFieldRest ;
    public final JavaParser.interfaceMethodOrFieldDecl_return interfaceMethodOrFieldDecl() throws RecognitionException {
        JavaParser.interfaceMethodOrFieldDecl_return retval = new JavaParser.interfaceMethodOrFieldDecl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Identifier131=null;
        JavaParser.type_return type130 =null;

        JavaParser.interfaceMethodOrFieldRest_return interfaceMethodOrFieldRest132 =null;


        Object Identifier131_tree=null;

        try {
            // Java.g:178:5: ( type Identifier interfaceMethodOrFieldRest )
            // Java.g:178:9: type Identifier interfaceMethodOrFieldRest
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_in_interfaceMethodOrFieldDecl1288);
            type130=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type130.getTree());

            Identifier131=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceMethodOrFieldDecl1290); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier131_tree = 
            (Object)adaptor.create(Identifier131)
            ;
            adaptor.addChild(root_0, Identifier131_tree);
            }

            pushFollow(FOLLOW_interfaceMethodOrFieldRest_in_interfaceMethodOrFieldDecl1292);
            interfaceMethodOrFieldRest132=interfaceMethodOrFieldRest();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceMethodOrFieldRest132.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "interfaceMethodOrFieldDecl"


    public static class interfaceMethodOrFieldRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaceMethodOrFieldRest"
    // Java.g:181:1: interfaceMethodOrFieldRest : ( constantDeclaratorsRest ';' | interfaceMethodDeclaratorRest );
    public final JavaParser.interfaceMethodOrFieldRest_return interfaceMethodOrFieldRest() throws RecognitionException {
        JavaParser.interfaceMethodOrFieldRest_return retval = new JavaParser.interfaceMethodOrFieldRest_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal134=null;
        JavaParser.constantDeclaratorsRest_return constantDeclaratorsRest133 =null;

        JavaParser.interfaceMethodDeclaratorRest_return interfaceMethodDeclaratorRest135 =null;


        Object char_literal134_tree=null;

        try {
            // Java.g:182:5: ( constantDeclaratorsRest ';' | interfaceMethodDeclaratorRest )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==50||LA46_0==55) ) {
                alt46=1;
            }
            else if ( (LA46_0==32) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }
            switch (alt46) {
                case 1 :
                    // Java.g:182:9: constantDeclaratorsRest ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_constantDeclaratorsRest_in_interfaceMethodOrFieldRest1315);
                    constantDeclaratorsRest133=constantDeclaratorsRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constantDeclaratorsRest133.getTree());

                    char_literal134=(Token)match(input,48,FOLLOW_48_in_interfaceMethodOrFieldRest1317); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal134_tree = 
                    (Object)adaptor.create(char_literal134)
                    ;
                    adaptor.addChild(root_0, char_literal134_tree);
                    }

                    }
                    break;
                case 2 :
                    // Java.g:183:9: interfaceMethodDeclaratorRest
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interfaceMethodDeclaratorRest_in_interfaceMethodOrFieldRest1327);
                    interfaceMethodDeclaratorRest135=interfaceMethodDeclaratorRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceMethodDeclaratorRest135.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "interfaceMethodOrFieldRest"


    public static class methodDeclaratorRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodDeclaratorRest"
    // Java.g:186:1: methodDeclaratorRest : formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ( methodBody | ';' ) ;
    public final JavaParser.methodDeclaratorRest_return methodDeclaratorRest() throws RecognitionException {
        JavaParser.methodDeclaratorRest_return retval = new JavaParser.methodDeclaratorRest_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal137=null;
        Token char_literal138=null;
        Token string_literal139=null;
        Token char_literal142=null;
        JavaParser.formalParameters_return formalParameters136 =null;

        JavaParser.qualifiedNameList_return qualifiedNameList140 =null;

        JavaParser.methodBody_return methodBody141 =null;


        Object char_literal137_tree=null;
        Object char_literal138_tree=null;
        Object string_literal139_tree=null;
        Object char_literal142_tree=null;

        try {
            // Java.g:187:5: ( formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ( methodBody | ';' ) )
            // Java.g:187:9: formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ( methodBody | ';' )
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_formalParameters_in_methodDeclaratorRest1350);
            formalParameters136=formalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters136.getTree());

            // Java.g:187:26: ( '[' ']' )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==55) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // Java.g:187:27: '[' ']'
            	    {
            	    char_literal137=(Token)match(input,55,FOLLOW_55_in_methodDeclaratorRest1353); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal137_tree = 
            	    (Object)adaptor.create(char_literal137)
            	    ;
            	    adaptor.addChild(root_0, char_literal137_tree);
            	    }

            	    char_literal138=(Token)match(input,56,FOLLOW_56_in_methodDeclaratorRest1355); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal138_tree = 
            	    (Object)adaptor.create(char_literal138)
            	    ;
            	    adaptor.addChild(root_0, char_literal138_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            // Java.g:188:9: ( 'throws' qualifiedNameList )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==101) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // Java.g:188:10: 'throws' qualifiedNameList
                    {
                    string_literal139=(Token)match(input,101,FOLLOW_101_in_methodDeclaratorRest1368); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal139_tree = 
                    (Object)adaptor.create(string_literal139)
                    ;
                    adaptor.addChild(root_0, string_literal139_tree);
                    }

                    pushFollow(FOLLOW_qualifiedNameList_in_methodDeclaratorRest1370);
                    qualifiedNameList140=qualifiedNameList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedNameList140.getTree());

                    }
                    break;

            }


            // Java.g:189:9: ( methodBody | ';' )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==108) ) {
                alt49=1;
            }
            else if ( (LA49_0==48) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;

            }
            switch (alt49) {
                case 1 :
                    // Java.g:189:13: methodBody
                    {
                    pushFollow(FOLLOW_methodBody_in_methodDeclaratorRest1386);
                    methodBody141=methodBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodBody141.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:190:13: ';'
                    {
                    char_literal142=(Token)match(input,48,FOLLOW_48_in_methodDeclaratorRest1400); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal142_tree = 
                    (Object)adaptor.create(char_literal142)
                    ;
                    adaptor.addChild(root_0, char_literal142_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "methodDeclaratorRest"


    public static class voidMethodDeclaratorRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "voidMethodDeclaratorRest"
    // Java.g:194:1: voidMethodDeclaratorRest : formalParameters ( 'throws' qualifiedNameList )? ( methodBody | ';' ) ;
    public final JavaParser.voidMethodDeclaratorRest_return voidMethodDeclaratorRest() throws RecognitionException {
        JavaParser.voidMethodDeclaratorRest_return retval = new JavaParser.voidMethodDeclaratorRest_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal144=null;
        Token char_literal147=null;
        JavaParser.formalParameters_return formalParameters143 =null;

        JavaParser.qualifiedNameList_return qualifiedNameList145 =null;

        JavaParser.methodBody_return methodBody146 =null;


        Object string_literal144_tree=null;
        Object char_literal147_tree=null;

        try {
            // Java.g:195:5: ( formalParameters ( 'throws' qualifiedNameList )? ( methodBody | ';' ) )
            // Java.g:195:9: formalParameters ( 'throws' qualifiedNameList )? ( methodBody | ';' )
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_formalParameters_in_voidMethodDeclaratorRest1433);
            formalParameters143=formalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters143.getTree());

            // Java.g:195:26: ( 'throws' qualifiedNameList )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==101) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // Java.g:195:27: 'throws' qualifiedNameList
                    {
                    string_literal144=(Token)match(input,101,FOLLOW_101_in_voidMethodDeclaratorRest1436); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal144_tree = 
                    (Object)adaptor.create(string_literal144)
                    ;
                    adaptor.addChild(root_0, string_literal144_tree);
                    }

                    pushFollow(FOLLOW_qualifiedNameList_in_voidMethodDeclaratorRest1438);
                    qualifiedNameList145=qualifiedNameList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedNameList145.getTree());

                    }
                    break;

            }


            // Java.g:196:9: ( methodBody | ';' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==108) ) {
                alt51=1;
            }
            else if ( (LA51_0==48) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }
            switch (alt51) {
                case 1 :
                    // Java.g:196:13: methodBody
                    {
                    pushFollow(FOLLOW_methodBody_in_voidMethodDeclaratorRest1454);
                    methodBody146=methodBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodBody146.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:197:13: ';'
                    {
                    char_literal147=(Token)match(input,48,FOLLOW_48_in_voidMethodDeclaratorRest1468); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal147_tree = 
                    (Object)adaptor.create(char_literal147)
                    ;
                    adaptor.addChild(root_0, char_literal147_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "voidMethodDeclaratorRest"


    public static class interfaceMethodDeclaratorRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaceMethodDeclaratorRest"
    // Java.g:201:1: interfaceMethodDeclaratorRest : formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';' ;
    public final JavaParser.interfaceMethodDeclaratorRest_return interfaceMethodDeclaratorRest() throws RecognitionException {
        JavaParser.interfaceMethodDeclaratorRest_return retval = new JavaParser.interfaceMethodDeclaratorRest_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal149=null;
        Token char_literal150=null;
        Token string_literal151=null;
        Token char_literal153=null;
        JavaParser.formalParameters_return formalParameters148 =null;

        JavaParser.qualifiedNameList_return qualifiedNameList152 =null;


        Object char_literal149_tree=null;
        Object char_literal150_tree=null;
        Object string_literal151_tree=null;
        Object char_literal153_tree=null;

        try {
            // Java.g:202:5: ( formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';' )
            // Java.g:202:9: formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';'
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_formalParameters_in_interfaceMethodDeclaratorRest1501);
            formalParameters148=formalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters148.getTree());

            // Java.g:202:26: ( '[' ']' )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==55) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // Java.g:202:27: '[' ']'
            	    {
            	    char_literal149=(Token)match(input,55,FOLLOW_55_in_interfaceMethodDeclaratorRest1504); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal149_tree = 
            	    (Object)adaptor.create(char_literal149)
            	    ;
            	    adaptor.addChild(root_0, char_literal149_tree);
            	    }

            	    char_literal150=(Token)match(input,56,FOLLOW_56_in_interfaceMethodDeclaratorRest1506); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal150_tree = 
            	    (Object)adaptor.create(char_literal150)
            	    ;
            	    adaptor.addChild(root_0, char_literal150_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            // Java.g:202:37: ( 'throws' qualifiedNameList )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==101) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // Java.g:202:38: 'throws' qualifiedNameList
                    {
                    string_literal151=(Token)match(input,101,FOLLOW_101_in_interfaceMethodDeclaratorRest1511); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal151_tree = 
                    (Object)adaptor.create(string_literal151)
                    ;
                    adaptor.addChild(root_0, string_literal151_tree);
                    }

                    pushFollow(FOLLOW_qualifiedNameList_in_interfaceMethodDeclaratorRest1513);
                    qualifiedNameList152=qualifiedNameList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedNameList152.getTree());

                    }
                    break;

            }


            char_literal153=(Token)match(input,48,FOLLOW_48_in_interfaceMethodDeclaratorRest1517); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal153_tree = 
            (Object)adaptor.create(char_literal153)
            ;
            adaptor.addChild(root_0, char_literal153_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "interfaceMethodDeclaratorRest"


    public static class interfaceGenericMethodDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaceGenericMethodDecl"
    // Java.g:205:1: interfaceGenericMethodDecl : typeParameters ( type | 'void' ) Identifier interfaceMethodDeclaratorRest ;
    public final JavaParser.interfaceGenericMethodDecl_return interfaceGenericMethodDecl() throws RecognitionException {
        JavaParser.interfaceGenericMethodDecl_return retval = new JavaParser.interfaceGenericMethodDecl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal156=null;
        Token Identifier157=null;
        JavaParser.typeParameters_return typeParameters154 =null;

        JavaParser.type_return type155 =null;

        JavaParser.interfaceMethodDeclaratorRest_return interfaceMethodDeclaratorRest158 =null;


        Object string_literal156_tree=null;
        Object Identifier157_tree=null;

        try {
            // Java.g:206:5: ( typeParameters ( type | 'void' ) Identifier interfaceMethodDeclaratorRest )
            // Java.g:206:9: typeParameters ( type | 'void' ) Identifier interfaceMethodDeclaratorRest
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_typeParameters_in_interfaceGenericMethodDecl1540);
            typeParameters154=typeParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParameters154.getTree());

            // Java.g:206:24: ( type | 'void' )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==Identifier||LA54_0==60||LA54_0==62||LA54_0==65||LA54_0==70||LA54_0==76||LA54_0==82||LA54_0==84||LA54_0==93) ) {
                alt54=1;
            }
            else if ( (LA54_0==105) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;

            }
            switch (alt54) {
                case 1 :
                    // Java.g:206:25: type
                    {
                    pushFollow(FOLLOW_type_in_interfaceGenericMethodDecl1543);
                    type155=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type155.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:206:32: 'void'
                    {
                    string_literal156=(Token)match(input,105,FOLLOW_105_in_interfaceGenericMethodDecl1547); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal156_tree = 
                    (Object)adaptor.create(string_literal156)
                    ;
                    adaptor.addChild(root_0, string_literal156_tree);
                    }

                    }
                    break;

            }


            Identifier157=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceGenericMethodDecl1550); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier157_tree = 
            (Object)adaptor.create(Identifier157)
            ;
            adaptor.addChild(root_0, Identifier157_tree);
            }

            pushFollow(FOLLOW_interfaceMethodDeclaratorRest_in_interfaceGenericMethodDecl1560);
            interfaceMethodDeclaratorRest158=interfaceMethodDeclaratorRest();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceMethodDeclaratorRest158.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "interfaceGenericMethodDecl"


    public static class voidInterfaceMethodDeclaratorRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "voidInterfaceMethodDeclaratorRest"
    // Java.g:210:1: voidInterfaceMethodDeclaratorRest : formalParameters ( 'throws' qualifiedNameList )? ';' ;
    public final JavaParser.voidInterfaceMethodDeclaratorRest_return voidInterfaceMethodDeclaratorRest() throws RecognitionException {
        JavaParser.voidInterfaceMethodDeclaratorRest_return retval = new JavaParser.voidInterfaceMethodDeclaratorRest_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal160=null;
        Token char_literal162=null;
        JavaParser.formalParameters_return formalParameters159 =null;

        JavaParser.qualifiedNameList_return qualifiedNameList161 =null;


        Object string_literal160_tree=null;
        Object char_literal162_tree=null;

        try {
            // Java.g:211:5: ( formalParameters ( 'throws' qualifiedNameList )? ';' )
            // Java.g:211:9: formalParameters ( 'throws' qualifiedNameList )? ';'
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_formalParameters_in_voidInterfaceMethodDeclaratorRest1583);
            formalParameters159=formalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters159.getTree());

            // Java.g:211:26: ( 'throws' qualifiedNameList )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==101) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // Java.g:211:27: 'throws' qualifiedNameList
                    {
                    string_literal160=(Token)match(input,101,FOLLOW_101_in_voidInterfaceMethodDeclaratorRest1586); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal160_tree = 
                    (Object)adaptor.create(string_literal160)
                    ;
                    adaptor.addChild(root_0, string_literal160_tree);
                    }

                    pushFollow(FOLLOW_qualifiedNameList_in_voidInterfaceMethodDeclaratorRest1588);
                    qualifiedNameList161=qualifiedNameList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedNameList161.getTree());

                    }
                    break;

            }


            char_literal162=(Token)match(input,48,FOLLOW_48_in_voidInterfaceMethodDeclaratorRest1592); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal162_tree = 
            (Object)adaptor.create(char_literal162)
            ;
            adaptor.addChild(root_0, char_literal162_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "voidInterfaceMethodDeclaratorRest"


    public static class constructorDeclaratorRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constructorDeclaratorRest"
    // Java.g:214:1: constructorDeclaratorRest : formalParameters ( 'throws' qualifiedNameList )? constructorBody ;
    public final JavaParser.constructorDeclaratorRest_return constructorDeclaratorRest() throws RecognitionException {
        JavaParser.constructorDeclaratorRest_return retval = new JavaParser.constructorDeclaratorRest_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal164=null;
        JavaParser.formalParameters_return formalParameters163 =null;

        JavaParser.qualifiedNameList_return qualifiedNameList165 =null;

        JavaParser.constructorBody_return constructorBody166 =null;


        Object string_literal164_tree=null;

        try {
            // Java.g:215:5: ( formalParameters ( 'throws' qualifiedNameList )? constructorBody )
            // Java.g:215:9: formalParameters ( 'throws' qualifiedNameList )? constructorBody
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_formalParameters_in_constructorDeclaratorRest1615);
            formalParameters163=formalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters163.getTree());

            // Java.g:215:26: ( 'throws' qualifiedNameList )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==101) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // Java.g:215:27: 'throws' qualifiedNameList
                    {
                    string_literal164=(Token)match(input,101,FOLLOW_101_in_constructorDeclaratorRest1618); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal164_tree = 
                    (Object)adaptor.create(string_literal164)
                    ;
                    adaptor.addChild(root_0, string_literal164_tree);
                    }

                    pushFollow(FOLLOW_qualifiedNameList_in_constructorDeclaratorRest1620);
                    qualifiedNameList165=qualifiedNameList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedNameList165.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_constructorBody_in_constructorDeclaratorRest1624);
            constructorBody166=constructorBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, constructorBody166.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constructorDeclaratorRest"


    public static class constantDeclarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constantDeclarator"
    // Java.g:218:1: constantDeclarator : Identifier constantDeclaratorRest ;
    public final JavaParser.constantDeclarator_return constantDeclarator() throws RecognitionException {
        JavaParser.constantDeclarator_return retval = new JavaParser.constantDeclarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Identifier167=null;
        JavaParser.constantDeclaratorRest_return constantDeclaratorRest168 =null;


        Object Identifier167_tree=null;

        try {
            // Java.g:219:5: ( Identifier constantDeclaratorRest )
            // Java.g:219:9: Identifier constantDeclaratorRest
            {
            root_0 = (Object)adaptor.nil();


            Identifier167=(Token)match(input,Identifier,FOLLOW_Identifier_in_constantDeclarator1643); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier167_tree = 
            (Object)adaptor.create(Identifier167)
            ;
            adaptor.addChild(root_0, Identifier167_tree);
            }

            pushFollow(FOLLOW_constantDeclaratorRest_in_constantDeclarator1645);
            constantDeclaratorRest168=constantDeclaratorRest();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, constantDeclaratorRest168.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constantDeclarator"


    public static class variableDeclarators_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variableDeclarators"
    // Java.g:222:1: variableDeclarators : variableDeclarator ( ',' variableDeclarator )* ;
    public final JavaParser.variableDeclarators_return variableDeclarators() throws RecognitionException {
        JavaParser.variableDeclarators_return retval = new JavaParser.variableDeclarators_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal170=null;
        JavaParser.variableDeclarator_return variableDeclarator169 =null;

        JavaParser.variableDeclarator_return variableDeclarator171 =null;


        Object char_literal170_tree=null;

        try {
            // Java.g:223:5: ( variableDeclarator ( ',' variableDeclarator )* )
            // Java.g:223:9: variableDeclarator ( ',' variableDeclarator )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1668);
            variableDeclarator169=variableDeclarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarator169.getTree());

            // Java.g:223:28: ( ',' variableDeclarator )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==39) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // Java.g:223:29: ',' variableDeclarator
            	    {
            	    char_literal170=(Token)match(input,39,FOLLOW_39_in_variableDeclarators1671); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal170_tree = 
            	    (Object)adaptor.create(char_literal170)
            	    ;
            	    adaptor.addChild(root_0, char_literal170_tree);
            	    }

            	    pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1673);
            	    variableDeclarator171=variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarator171.getTree());

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variableDeclarators"


    public static class variableDeclarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variableDeclarator"
    // Java.g:226:1: variableDeclarator : variableDeclaratorId ( '=' variableInitializer )? ;
    public final JavaParser.variableDeclarator_return variableDeclarator() throws RecognitionException {
        JavaParser.variableDeclarator_return retval = new JavaParser.variableDeclarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal173=null;
        JavaParser.variableDeclaratorId_return variableDeclaratorId172 =null;

        JavaParser.variableInitializer_return variableInitializer174 =null;


        Object char_literal173_tree=null;

        try {
            // Java.g:227:5: ( variableDeclaratorId ( '=' variableInitializer )? )
            // Java.g:227:9: variableDeclaratorId ( '=' variableInitializer )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator1694);
            variableDeclaratorId172=variableDeclaratorId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaratorId172.getTree());

            // Java.g:227:30: ( '=' variableInitializer )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==50) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // Java.g:227:31: '=' variableInitializer
                    {
                    char_literal173=(Token)match(input,50,FOLLOW_50_in_variableDeclarator1697); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal173_tree = 
                    (Object)adaptor.create(char_literal173)
                    ;
                    adaptor.addChild(root_0, char_literal173_tree);
                    }

                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator1699);
                    variableInitializer174=variableInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer174.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variableDeclarator"


    public static class constantDeclaratorsRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constantDeclaratorsRest"
    // Java.g:230:1: constantDeclaratorsRest : constantDeclaratorRest ( ',' constantDeclarator )* ;
    public final JavaParser.constantDeclaratorsRest_return constantDeclaratorsRest() throws RecognitionException {
        JavaParser.constantDeclaratorsRest_return retval = new JavaParser.constantDeclaratorsRest_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal176=null;
        JavaParser.constantDeclaratorRest_return constantDeclaratorRest175 =null;

        JavaParser.constantDeclarator_return constantDeclarator177 =null;


        Object char_literal176_tree=null;

        try {
            // Java.g:231:5: ( constantDeclaratorRest ( ',' constantDeclarator )* )
            // Java.g:231:9: constantDeclaratorRest ( ',' constantDeclarator )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_constantDeclaratorRest_in_constantDeclaratorsRest1724);
            constantDeclaratorRest175=constantDeclaratorRest();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, constantDeclaratorRest175.getTree());

            // Java.g:231:32: ( ',' constantDeclarator )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==39) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // Java.g:231:33: ',' constantDeclarator
            	    {
            	    char_literal176=(Token)match(input,39,FOLLOW_39_in_constantDeclaratorsRest1727); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal176_tree = 
            	    (Object)adaptor.create(char_literal176)
            	    ;
            	    adaptor.addChild(root_0, char_literal176_tree);
            	    }

            	    pushFollow(FOLLOW_constantDeclarator_in_constantDeclaratorsRest1729);
            	    constantDeclarator177=constantDeclarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, constantDeclarator177.getTree());

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constantDeclaratorsRest"


    public static class constantDeclaratorRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constantDeclaratorRest"
    // Java.g:234:1: constantDeclaratorRest : ( '[' ']' )* '=' variableInitializer ;
    public final JavaParser.constantDeclaratorRest_return constantDeclaratorRest() throws RecognitionException {
        JavaParser.constantDeclaratorRest_return retval = new JavaParser.constantDeclaratorRest_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal178=null;
        Token char_literal179=null;
        Token char_literal180=null;
        JavaParser.variableInitializer_return variableInitializer181 =null;


        Object char_literal178_tree=null;
        Object char_literal179_tree=null;
        Object char_literal180_tree=null;

        try {
            // Java.g:235:5: ( ( '[' ']' )* '=' variableInitializer )
            // Java.g:235:9: ( '[' ']' )* '=' variableInitializer
            {
            root_0 = (Object)adaptor.nil();


            // Java.g:235:9: ( '[' ']' )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==55) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // Java.g:235:10: '[' ']'
            	    {
            	    char_literal178=(Token)match(input,55,FOLLOW_55_in_constantDeclaratorRest1751); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal178_tree = 
            	    (Object)adaptor.create(char_literal178)
            	    ;
            	    adaptor.addChild(root_0, char_literal178_tree);
            	    }

            	    char_literal179=(Token)match(input,56,FOLLOW_56_in_constantDeclaratorRest1753); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal179_tree = 
            	    (Object)adaptor.create(char_literal179)
            	    ;
            	    adaptor.addChild(root_0, char_literal179_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            char_literal180=(Token)match(input,50,FOLLOW_50_in_constantDeclaratorRest1757); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal180_tree = 
            (Object)adaptor.create(char_literal180)
            ;
            adaptor.addChild(root_0, char_literal180_tree);
            }

            pushFollow(FOLLOW_variableInitializer_in_constantDeclaratorRest1759);
            variableInitializer181=variableInitializer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer181.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constantDeclaratorRest"


    public static class variableDeclaratorId_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variableDeclaratorId"
    // Java.g:238:1: variableDeclaratorId : Identifier ( '[' ']' )* ;
    public final JavaParser.variableDeclaratorId_return variableDeclaratorId() throws RecognitionException {
        JavaParser.variableDeclaratorId_return retval = new JavaParser.variableDeclaratorId_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Identifier182=null;
        Token char_literal183=null;
        Token char_literal184=null;

        Object Identifier182_tree=null;
        Object char_literal183_tree=null;
        Object char_literal184_tree=null;

        try {
            // Java.g:239:5: ( Identifier ( '[' ']' )* )
            // Java.g:239:9: Identifier ( '[' ']' )*
            {
            root_0 = (Object)adaptor.nil();


            Identifier182=(Token)match(input,Identifier,FOLLOW_Identifier_in_variableDeclaratorId1782); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier182_tree = 
            (Object)adaptor.create(Identifier182)
            ;
            adaptor.addChild(root_0, Identifier182_tree);
            }

            // Java.g:239:20: ( '[' ']' )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==55) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // Java.g:239:21: '[' ']'
            	    {
            	    char_literal183=(Token)match(input,55,FOLLOW_55_in_variableDeclaratorId1785); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal183_tree = 
            	    (Object)adaptor.create(char_literal183)
            	    ;
            	    adaptor.addChild(root_0, char_literal183_tree);
            	    }

            	    char_literal184=(Token)match(input,56,FOLLOW_56_in_variableDeclaratorId1787); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal184_tree = 
            	    (Object)adaptor.create(char_literal184)
            	    ;
            	    adaptor.addChild(root_0, char_literal184_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variableDeclaratorId"


    public static class variableInitializer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variableInitializer"
    // Java.g:242:1: variableInitializer : ( arrayInitializer | expression );
    public final JavaParser.variableInitializer_return variableInitializer() throws RecognitionException {
        JavaParser.variableInitializer_return retval = new JavaParser.variableInitializer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.arrayInitializer_return arrayInitializer185 =null;

        JavaParser.expression_return expression186 =null;



        try {
            // Java.g:243:5: ( arrayInitializer | expression )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==108) ) {
                alt62=1;
            }
            else if ( ((LA62_0 >= CharacterLiteral && LA62_0 <= DecimalLiteral)||LA62_0==FloatingPointLiteral||(LA62_0 >= HexLiteral && LA62_0 <= Identifier)||(LA62_0 >= OctalLiteral && LA62_0 <= StringLiteral)||LA62_0==25||LA62_0==32||(LA62_0 >= 36 && LA62_0 <= 37)||(LA62_0 >= 40 && LA62_0 <= 41)||LA62_0==60||LA62_0==62||LA62_0==65||LA62_0==70||LA62_0==73||LA62_0==76||LA62_0==82||LA62_0==84||(LA62_0 >= 86 && LA62_0 <= 87)||LA62_0==93||LA62_0==96||LA62_0==99||LA62_0==103||LA62_0==105||LA62_0==113) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;

            }
            switch (alt62) {
                case 1 :
                    // Java.g:243:9: arrayInitializer
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer1808);
                    arrayInitializer185=arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayInitializer185.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:244:9: expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expression_in_variableInitializer1818);
                    expression186=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression186.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variableInitializer"


    public static class arrayInitializer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayInitializer"
    // Java.g:247:1: arrayInitializer : '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' ;
    public final JavaParser.arrayInitializer_return arrayInitializer() throws RecognitionException {
        JavaParser.arrayInitializer_return retval = new JavaParser.arrayInitializer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal187=null;
        Token char_literal189=null;
        Token char_literal191=null;
        Token char_literal192=null;
        JavaParser.variableInitializer_return variableInitializer188 =null;

        JavaParser.variableInitializer_return variableInitializer190 =null;


        Object char_literal187_tree=null;
        Object char_literal189_tree=null;
        Object char_literal191_tree=null;
        Object char_literal192_tree=null;

        try {
            // Java.g:248:5: ( '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' )
            // Java.g:248:9: '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}'
            {
            root_0 = (Object)adaptor.nil();


            char_literal187=(Token)match(input,108,FOLLOW_108_in_arrayInitializer1845); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal187_tree = 
            (Object)adaptor.create(char_literal187)
            ;
            adaptor.addChild(root_0, char_literal187_tree);
            }

            // Java.g:248:13: ( variableInitializer ( ',' variableInitializer )* ( ',' )? )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0 >= CharacterLiteral && LA65_0 <= DecimalLiteral)||LA65_0==FloatingPointLiteral||(LA65_0 >= HexLiteral && LA65_0 <= Identifier)||(LA65_0 >= OctalLiteral && LA65_0 <= StringLiteral)||LA65_0==25||LA65_0==32||(LA65_0 >= 36 && LA65_0 <= 37)||(LA65_0 >= 40 && LA65_0 <= 41)||LA65_0==60||LA65_0==62||LA65_0==65||LA65_0==70||LA65_0==73||LA65_0==76||LA65_0==82||LA65_0==84||(LA65_0 >= 86 && LA65_0 <= 87)||LA65_0==93||LA65_0==96||LA65_0==99||LA65_0==103||LA65_0==105||LA65_0==108||LA65_0==113) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // Java.g:248:14: variableInitializer ( ',' variableInitializer )* ( ',' )?
                    {
                    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer1848);
                    variableInitializer188=variableInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer188.getTree());

                    // Java.g:248:34: ( ',' variableInitializer )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==39) ) {
                            int LA63_1 = input.LA(2);

                            if ( ((LA63_1 >= CharacterLiteral && LA63_1 <= DecimalLiteral)||LA63_1==FloatingPointLiteral||(LA63_1 >= HexLiteral && LA63_1 <= Identifier)||(LA63_1 >= OctalLiteral && LA63_1 <= StringLiteral)||LA63_1==25||LA63_1==32||(LA63_1 >= 36 && LA63_1 <= 37)||(LA63_1 >= 40 && LA63_1 <= 41)||LA63_1==60||LA63_1==62||LA63_1==65||LA63_1==70||LA63_1==73||LA63_1==76||LA63_1==82||LA63_1==84||(LA63_1 >= 86 && LA63_1 <= 87)||LA63_1==93||LA63_1==96||LA63_1==99||LA63_1==103||LA63_1==105||LA63_1==108||LA63_1==113) ) {
                                alt63=1;
                            }


                        }


                        switch (alt63) {
                    	case 1 :
                    	    // Java.g:248:35: ',' variableInitializer
                    	    {
                    	    char_literal189=(Token)match(input,39,FOLLOW_39_in_arrayInitializer1851); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal189_tree = 
                    	    (Object)adaptor.create(char_literal189)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal189_tree);
                    	    }

                    	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer1853);
                    	    variableInitializer190=variableInitializer();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer190.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);


                    // Java.g:248:61: ( ',' )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==39) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // Java.g:248:62: ','
                            {
                            char_literal191=(Token)match(input,39,FOLLOW_39_in_arrayInitializer1858); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal191_tree = 
                            (Object)adaptor.create(char_literal191)
                            ;
                            adaptor.addChild(root_0, char_literal191_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            char_literal192=(Token)match(input,112,FOLLOW_112_in_arrayInitializer1865); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal192_tree = 
            (Object)adaptor.create(char_literal192)
            ;
            adaptor.addChild(root_0, char_literal192_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arrayInitializer"


    public static class modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "modifier"
    // Java.g:251:1: modifier : ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' );
    public final JavaParser.modifier_return modifier() throws RecognitionException {
        JavaParser.modifier_return retval = new JavaParser.modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal194=null;
        Token string_literal195=null;
        Token string_literal196=null;
        Token string_literal197=null;
        Token string_literal198=null;
        Token string_literal199=null;
        Token string_literal200=null;
        Token string_literal201=null;
        Token string_literal202=null;
        Token string_literal203=null;
        Token string_literal204=null;
        JavaParser.annotation_return annotation193 =null;


        Object string_literal194_tree=null;
        Object string_literal195_tree=null;
        Object string_literal196_tree=null;
        Object string_literal197_tree=null;
        Object string_literal198_tree=null;
        Object string_literal199_tree=null;
        Object string_literal200_tree=null;
        Object string_literal201_tree=null;
        Object string_literal202_tree=null;
        Object string_literal203_tree=null;
        Object string_literal204_tree=null;

        try {
            // Java.g:252:5: ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' )
            int alt66=12;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt66=1;
                }
                break;
            case 91:
                {
                alt66=2;
                }
                break;
            case 90:
                {
                alt66=3;
                }
                break;
            case 89:
                {
                alt66=4;
                }
                break;
            case 94:
                {
                alt66=5;
                }
                break;
            case 59:
                {
                alt66=6;
                }
                break;
            case 74:
                {
                alt66=7;
                }
                break;
            case 85:
                {
                alt66=8;
                }
                break;
            case 98:
                {
                alt66=9;
                }
                break;
            case 102:
                {
                alt66=10;
                }
                break;
            case 106:
                {
                alt66=11;
                }
                break;
            case 95:
                {
                alt66=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;

            }

            switch (alt66) {
                case 1 :
                    // Java.g:252:9: annotation
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_annotation_in_modifier1884);
                    annotation193=annotation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, annotation193.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:253:9: 'public'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal194=(Token)match(input,91,FOLLOW_91_in_modifier1894); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal194_tree = 
                    (Object)adaptor.create(string_literal194)
                    ;
                    adaptor.addChild(root_0, string_literal194_tree);
                    }

                    }
                    break;
                case 3 :
                    // Java.g:254:9: 'protected'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal195=(Token)match(input,90,FOLLOW_90_in_modifier1904); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal195_tree = 
                    (Object)adaptor.create(string_literal195)
                    ;
                    adaptor.addChild(root_0, string_literal195_tree);
                    }

                    }
                    break;
                case 4 :
                    // Java.g:255:9: 'private'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal196=(Token)match(input,89,FOLLOW_89_in_modifier1914); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal196_tree = 
                    (Object)adaptor.create(string_literal196)
                    ;
                    adaptor.addChild(root_0, string_literal196_tree);
                    }

                    }
                    break;
                case 5 :
                    // Java.g:256:9: 'static'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal197=(Token)match(input,94,FOLLOW_94_in_modifier1924); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal197_tree = 
                    (Object)adaptor.create(string_literal197)
                    ;
                    adaptor.addChild(root_0, string_literal197_tree);
                    }

                    }
                    break;
                case 6 :
                    // Java.g:257:9: 'abstract'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal198=(Token)match(input,59,FOLLOW_59_in_modifier1934); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal198_tree = 
                    (Object)adaptor.create(string_literal198)
                    ;
                    adaptor.addChild(root_0, string_literal198_tree);
                    }

                    }
                    break;
                case 7 :
                    // Java.g:258:9: 'final'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal199=(Token)match(input,74,FOLLOW_74_in_modifier1944); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal199_tree = 
                    (Object)adaptor.create(string_literal199)
                    ;
                    adaptor.addChild(root_0, string_literal199_tree);
                    }

                    }
                    break;
                case 8 :
                    // Java.g:259:9: 'native'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal200=(Token)match(input,85,FOLLOW_85_in_modifier1954); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal200_tree = 
                    (Object)adaptor.create(string_literal200)
                    ;
                    adaptor.addChild(root_0, string_literal200_tree);
                    }

                    }
                    break;
                case 9 :
                    // Java.g:260:9: 'synchronized'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal201=(Token)match(input,98,FOLLOW_98_in_modifier1964); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal201_tree = 
                    (Object)adaptor.create(string_literal201)
                    ;
                    adaptor.addChild(root_0, string_literal201_tree);
                    }

                    }
                    break;
                case 10 :
                    // Java.g:261:9: 'transient'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal202=(Token)match(input,102,FOLLOW_102_in_modifier1974); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal202_tree = 
                    (Object)adaptor.create(string_literal202)
                    ;
                    adaptor.addChild(root_0, string_literal202_tree);
                    }

                    }
                    break;
                case 11 :
                    // Java.g:262:9: 'volatile'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal203=(Token)match(input,106,FOLLOW_106_in_modifier1984); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal203_tree = 
                    (Object)adaptor.create(string_literal203)
                    ;
                    adaptor.addChild(root_0, string_literal203_tree);
                    }

                    }
                    break;
                case 12 :
                    // Java.g:263:9: 'strictfp'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal204=(Token)match(input,95,FOLLOW_95_in_modifier1994); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal204_tree = 
                    (Object)adaptor.create(string_literal204)
                    ;
                    adaptor.addChild(root_0, string_literal204_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "modifier"


    public static class packageOrTypeName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "packageOrTypeName"
    // Java.g:266:1: packageOrTypeName : qualifiedName ;
    public final JavaParser.packageOrTypeName_return packageOrTypeName() throws RecognitionException {
        JavaParser.packageOrTypeName_return retval = new JavaParser.packageOrTypeName_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.qualifiedName_return qualifiedName205 =null;



        try {
            // Java.g:267:5: ( qualifiedName )
            // Java.g:267:9: qualifiedName
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_qualifiedName_in_packageOrTypeName2013);
            qualifiedName205=qualifiedName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedName205.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "packageOrTypeName"


    public static class enumConstantName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumConstantName"
    // Java.g:270:1: enumConstantName : Identifier ;
    public final JavaParser.enumConstantName_return enumConstantName() throws RecognitionException {
        JavaParser.enumConstantName_return retval = new JavaParser.enumConstantName_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Identifier206=null;

        Object Identifier206_tree=null;

        try {
            // Java.g:271:5: ( Identifier )
            // Java.g:271:9: Identifier
            {
            root_0 = (Object)adaptor.nil();


            Identifier206=(Token)match(input,Identifier,FOLLOW_Identifier_in_enumConstantName2032); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier206_tree = 
            (Object)adaptor.create(Identifier206)
            ;
            adaptor.addChild(root_0, Identifier206_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "enumConstantName"


    public static class typeName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeName"
    // Java.g:274:1: typeName : qualifiedName ;
    public final JavaParser.typeName_return typeName() throws RecognitionException {
        JavaParser.typeName_return retval = new JavaParser.typeName_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.qualifiedName_return qualifiedName207 =null;



        try {
            // Java.g:275:5: ( qualifiedName )
            // Java.g:275:9: qualifiedName
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_qualifiedName_in_typeName2051);
            qualifiedName207=qualifiedName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedName207.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeName"


    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // Java.g:278:1: type : ( classOrInterfaceType ( '[' ']' )* | primitiveType ( '[' ']' )* );
    public final JavaParser.type_return type() throws RecognitionException {
        JavaParser.type_return retval = new JavaParser.type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal209=null;
        Token char_literal210=null;
        Token char_literal212=null;
        Token char_literal213=null;
        JavaParser.classOrInterfaceType_return classOrInterfaceType208 =null;

        JavaParser.primitiveType_return primitiveType211 =null;


        Object char_literal209_tree=null;
        Object char_literal210_tree=null;
        Object char_literal212_tree=null;
        Object char_literal213_tree=null;

        try {
            // Java.g:279:2: ( classOrInterfaceType ( '[' ']' )* | primitiveType ( '[' ']' )* )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==Identifier) ) {
                alt69=1;
            }
            else if ( (LA69_0==60||LA69_0==62||LA69_0==65||LA69_0==70||LA69_0==76||LA69_0==82||LA69_0==84||LA69_0==93) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;

            }
            switch (alt69) {
                case 1 :
                    // Java.g:279:4: classOrInterfaceType ( '[' ']' )*
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classOrInterfaceType_in_type2065);
                    classOrInterfaceType208=classOrInterfaceType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classOrInterfaceType208.getTree());

                    // Java.g:279:25: ( '[' ']' )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==55) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // Java.g:279:26: '[' ']'
                    	    {
                    	    char_literal209=(Token)match(input,55,FOLLOW_55_in_type2068); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal209_tree = 
                    	    (Object)adaptor.create(char_literal209)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal209_tree);
                    	    }

                    	    char_literal210=(Token)match(input,56,FOLLOW_56_in_type2070); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal210_tree = 
                    	    (Object)adaptor.create(char_literal210)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal210_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Java.g:280:4: primitiveType ( '[' ']' )*
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_primitiveType_in_type2077);
                    primitiveType211=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType211.getTree());

                    // Java.g:280:18: ( '[' ']' )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==55) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // Java.g:280:19: '[' ']'
                    	    {
                    	    char_literal212=(Token)match(input,55,FOLLOW_55_in_type2080); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal212_tree = 
                    	    (Object)adaptor.create(char_literal212)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal212_tree);
                    	    }

                    	    char_literal213=(Token)match(input,56,FOLLOW_56_in_type2082); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal213_tree = 
                    	    (Object)adaptor.create(char_literal213)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal213_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type"


    public static class classOrInterfaceType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classOrInterfaceType"
    // Java.g:283:1: classOrInterfaceType : Identifier ( typeArguments )? ( '.' Identifier ( typeArguments )? )* ;
    public final JavaParser.classOrInterfaceType_return classOrInterfaceType() throws RecognitionException {
        JavaParser.classOrInterfaceType_return retval = new JavaParser.classOrInterfaceType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Identifier214=null;
        Token char_literal216=null;
        Token Identifier217=null;
        JavaParser.typeArguments_return typeArguments215 =null;

        JavaParser.typeArguments_return typeArguments218 =null;


        Object Identifier214_tree=null;
        Object char_literal216_tree=null;
        Object Identifier217_tree=null;

        try {
            // Java.g:284:2: ( Identifier ( typeArguments )? ( '.' Identifier ( typeArguments )? )* )
            // Java.g:284:4: Identifier ( typeArguments )? ( '.' Identifier ( typeArguments )? )*
            {
            root_0 = (Object)adaptor.nil();


            Identifier214=(Token)match(input,Identifier,FOLLOW_Identifier_in_classOrInterfaceType2095); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier214_tree = 
            (Object)adaptor.create(Identifier214)
            ;
            adaptor.addChild(root_0, Identifier214_tree);
            }

            // Java.g:284:15: ( typeArguments )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==49) ) {
                int LA70_1 = input.LA(2);

                if ( (LA70_1==Identifier||LA70_1==53||LA70_1==60||LA70_1==62||LA70_1==65||LA70_1==70||LA70_1==76||LA70_1==82||LA70_1==84||LA70_1==93) ) {
                    alt70=1;
                }
            }
            switch (alt70) {
                case 1 :
                    // Java.g:284:15: typeArguments
                    {
                    pushFollow(FOLLOW_typeArguments_in_classOrInterfaceType2097);
                    typeArguments215=typeArguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeArguments215.getTree());

                    }
                    break;

            }


            // Java.g:284:30: ( '.' Identifier ( typeArguments )? )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==43) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // Java.g:284:31: '.' Identifier ( typeArguments )?
            	    {
            	    char_literal216=(Token)match(input,43,FOLLOW_43_in_classOrInterfaceType2101); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal216_tree = 
            	    (Object)adaptor.create(char_literal216)
            	    ;
            	    adaptor.addChild(root_0, char_literal216_tree);
            	    }

            	    Identifier217=(Token)match(input,Identifier,FOLLOW_Identifier_in_classOrInterfaceType2103); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Identifier217_tree = 
            	    (Object)adaptor.create(Identifier217)
            	    ;
            	    adaptor.addChild(root_0, Identifier217_tree);
            	    }

            	    // Java.g:284:46: ( typeArguments )?
            	    int alt71=2;
            	    int LA71_0 = input.LA(1);

            	    if ( (LA71_0==49) ) {
            	        int LA71_1 = input.LA(2);

            	        if ( (LA71_1==Identifier||LA71_1==53||LA71_1==60||LA71_1==62||LA71_1==65||LA71_1==70||LA71_1==76||LA71_1==82||LA71_1==84||LA71_1==93) ) {
            	            alt71=1;
            	        }
            	    }
            	    switch (alt71) {
            	        case 1 :
            	            // Java.g:284:46: typeArguments
            	            {
            	            pushFollow(FOLLOW_typeArguments_in_classOrInterfaceType2105);
            	            typeArguments218=typeArguments();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeArguments218.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classOrInterfaceType"


    public static class primitiveType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primitiveType"
    // Java.g:287:1: primitiveType : ( 'boolean' | 'char' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' );
    public final JavaParser.primitiveType_return primitiveType() throws RecognitionException {
        JavaParser.primitiveType_return retval = new JavaParser.primitiveType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set219=null;

        Object set219_tree=null;

        try {
            // Java.g:288:5: ( 'boolean' | 'char' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' )
            // Java.g:
            {
            root_0 = (Object)adaptor.nil();


            set219=(Token)input.LT(1);

            if ( input.LA(1)==60||input.LA(1)==62||input.LA(1)==65||input.LA(1)==70||input.LA(1)==76||input.LA(1)==82||input.LA(1)==84||input.LA(1)==93 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set219)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "primitiveType"


    public static class variableModifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variableModifier"
    // Java.g:298:1: variableModifier : ( 'final' | annotation );
    public final JavaParser.variableModifier_return variableModifier() throws RecognitionException {
        JavaParser.variableModifier_return retval = new JavaParser.variableModifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal220=null;
        JavaParser.annotation_return annotation221 =null;


        Object string_literal220_tree=null;

        try {
            // Java.g:299:5: ( 'final' | annotation )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==74) ) {
                alt73=1;
            }
            else if ( (LA73_0==54) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;

            }
            switch (alt73) {
                case 1 :
                    // Java.g:299:9: 'final'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal220=(Token)match(input,74,FOLLOW_74_in_variableModifier2214); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal220_tree = 
                    (Object)adaptor.create(string_literal220)
                    ;
                    adaptor.addChild(root_0, string_literal220_tree);
                    }

                    }
                    break;
                case 2 :
                    // Java.g:300:9: annotation
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_annotation_in_variableModifier2224);
                    annotation221=annotation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, annotation221.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variableModifier"


    public static class typeArguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeArguments"
    // Java.g:303:1: typeArguments : '<' typeArgument ( ',' typeArgument )* '>' ;
    public final JavaParser.typeArguments_return typeArguments() throws RecognitionException {
        JavaParser.typeArguments_return retval = new JavaParser.typeArguments_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal222=null;
        Token char_literal224=null;
        Token char_literal226=null;
        JavaParser.typeArgument_return typeArgument223 =null;

        JavaParser.typeArgument_return typeArgument225 =null;


        Object char_literal222_tree=null;
        Object char_literal224_tree=null;
        Object char_literal226_tree=null;

        try {
            // Java.g:304:5: ( '<' typeArgument ( ',' typeArgument )* '>' )
            // Java.g:304:9: '<' typeArgument ( ',' typeArgument )* '>'
            {
            root_0 = (Object)adaptor.nil();


            char_literal222=(Token)match(input,49,FOLLOW_49_in_typeArguments2243); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal222_tree = 
            (Object)adaptor.create(char_literal222)
            ;
            adaptor.addChild(root_0, char_literal222_tree);
            }

            pushFollow(FOLLOW_typeArgument_in_typeArguments2245);
            typeArgument223=typeArgument();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeArgument223.getTree());

            // Java.g:304:26: ( ',' typeArgument )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==39) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // Java.g:304:27: ',' typeArgument
            	    {
            	    char_literal224=(Token)match(input,39,FOLLOW_39_in_typeArguments2248); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal224_tree = 
            	    (Object)adaptor.create(char_literal224)
            	    ;
            	    adaptor.addChild(root_0, char_literal224_tree);
            	    }

            	    pushFollow(FOLLOW_typeArgument_in_typeArguments2250);
            	    typeArgument225=typeArgument();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeArgument225.getTree());

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            char_literal226=(Token)match(input,52,FOLLOW_52_in_typeArguments2254); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal226_tree = 
            (Object)adaptor.create(char_literal226)
            ;
            adaptor.addChild(root_0, char_literal226_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeArguments"


    public static class typeArgument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeArgument"
    // Java.g:307:1: typeArgument : ( type | '?' ( ( 'extends' | 'super' ) type )? );
    public final JavaParser.typeArgument_return typeArgument() throws RecognitionException {
        JavaParser.typeArgument_return retval = new JavaParser.typeArgument_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal228=null;
        Token set229=null;
        JavaParser.type_return type227 =null;

        JavaParser.type_return type230 =null;


        Object char_literal228_tree=null;
        Object set229_tree=null;

        try {
            // Java.g:308:5: ( type | '?' ( ( 'extends' | 'super' ) type )? )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==Identifier||LA76_0==60||LA76_0==62||LA76_0==65||LA76_0==70||LA76_0==76||LA76_0==82||LA76_0==84||LA76_0==93) ) {
                alt76=1;
            }
            else if ( (LA76_0==53) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;

            }
            switch (alt76) {
                case 1 :
                    // Java.g:308:9: type
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_in_typeArgument2277);
                    type227=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type227.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:309:9: '?' ( ( 'extends' | 'super' ) type )?
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal228=(Token)match(input,53,FOLLOW_53_in_typeArgument2287); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal228_tree = 
                    (Object)adaptor.create(char_literal228)
                    ;
                    adaptor.addChild(root_0, char_literal228_tree);
                    }

                    // Java.g:309:13: ( ( 'extends' | 'super' ) type )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==72||LA75_0==96) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // Java.g:309:14: ( 'extends' | 'super' ) type
                            {
                            set229=(Token)input.LT(1);

                            if ( input.LA(1)==72||input.LA(1)==96 ) {
                                input.consume();
                                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                                (Object)adaptor.create(set229)
                                );
                                state.errorRecovery=false;
                                state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            pushFollow(FOLLOW_type_in_typeArgument2298);
                            type230=type();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, type230.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeArgument"


    public static class qualifiedNameList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "qualifiedNameList"
    // Java.g:312:1: qualifiedNameList : qualifiedName ( ',' qualifiedName )* ;
    public final JavaParser.qualifiedNameList_return qualifiedNameList() throws RecognitionException {
        JavaParser.qualifiedNameList_return retval = new JavaParser.qualifiedNameList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal232=null;
        JavaParser.qualifiedName_return qualifiedName231 =null;

        JavaParser.qualifiedName_return qualifiedName233 =null;


        Object char_literal232_tree=null;

        try {
            // Java.g:313:5: ( qualifiedName ( ',' qualifiedName )* )
            // Java.g:313:9: qualifiedName ( ',' qualifiedName )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_qualifiedName_in_qualifiedNameList2323);
            qualifiedName231=qualifiedName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedName231.getTree());

            // Java.g:313:23: ( ',' qualifiedName )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==39) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // Java.g:313:24: ',' qualifiedName
            	    {
            	    char_literal232=(Token)match(input,39,FOLLOW_39_in_qualifiedNameList2326); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal232_tree = 
            	    (Object)adaptor.create(char_literal232)
            	    ;
            	    adaptor.addChild(root_0, char_literal232_tree);
            	    }

            	    pushFollow(FOLLOW_qualifiedName_in_qualifiedNameList2328);
            	    qualifiedName233=qualifiedName();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedName233.getTree());

            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "qualifiedNameList"


    public static class formalParameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "formalParameters"
    // Java.g:316:1: formalParameters : '(' ( formalParameterDecls )? ')' ;
    public final JavaParser.formalParameters_return formalParameters() throws RecognitionException {
        JavaParser.formalParameters_return retval = new JavaParser.formalParameters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal234=null;
        Token char_literal236=null;
        JavaParser.formalParameterDecls_return formalParameterDecls235 =null;


        Object char_literal234_tree=null;
        Object char_literal236_tree=null;

        try {
            // Java.g:317:5: ( '(' ( formalParameterDecls )? ')' )
            // Java.g:317:9: '(' ( formalParameterDecls )? ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal234=(Token)match(input,32,FOLLOW_32_in_formalParameters2349); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal234_tree = 
            (Object)adaptor.create(char_literal234)
            ;
            adaptor.addChild(root_0, char_literal234_tree);
            }

            // Java.g:317:13: ( formalParameterDecls )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==Identifier||LA78_0==54||LA78_0==60||LA78_0==62||LA78_0==65||LA78_0==70||LA78_0==74||LA78_0==76||LA78_0==82||LA78_0==84||LA78_0==93) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // Java.g:317:13: formalParameterDecls
                    {
                    pushFollow(FOLLOW_formalParameterDecls_in_formalParameters2351);
                    formalParameterDecls235=formalParameterDecls();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameterDecls235.getTree());

                    }
                    break;

            }


            char_literal236=(Token)match(input,33,FOLLOW_33_in_formalParameters2354); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal236_tree = 
            (Object)adaptor.create(char_literal236)
            ;
            adaptor.addChild(root_0, char_literal236_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "formalParameters"


    public static class formalParameterDecls_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "formalParameterDecls"
    // Java.g:320:1: formalParameterDecls : variableModifiers type formalParameterDeclsRest ;
    public final JavaParser.formalParameterDecls_return formalParameterDecls() throws RecognitionException {
        JavaParser.formalParameterDecls_return retval = new JavaParser.formalParameterDecls_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.variableModifiers_return variableModifiers237 =null;

        JavaParser.type_return type238 =null;

        JavaParser.formalParameterDeclsRest_return formalParameterDeclsRest239 =null;



        try {
            // Java.g:321:5: ( variableModifiers type formalParameterDeclsRest )
            // Java.g:321:9: variableModifiers type formalParameterDeclsRest
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_variableModifiers_in_formalParameterDecls2377);
            variableModifiers237=variableModifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableModifiers237.getTree());

            pushFollow(FOLLOW_type_in_formalParameterDecls2379);
            type238=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type238.getTree());

            pushFollow(FOLLOW_formalParameterDeclsRest_in_formalParameterDecls2381);
            formalParameterDeclsRest239=formalParameterDeclsRest();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameterDeclsRest239.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "formalParameterDecls"


    public static class formalParameterDeclsRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "formalParameterDeclsRest"
    // Java.g:324:1: formalParameterDeclsRest : ( variableDeclaratorId ( ',' formalParameterDecls )? | '...' variableDeclaratorId );
    public final JavaParser.formalParameterDeclsRest_return formalParameterDeclsRest() throws RecognitionException {
        JavaParser.formalParameterDeclsRest_return retval = new JavaParser.formalParameterDeclsRest_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal241=null;
        Token string_literal243=null;
        JavaParser.variableDeclaratorId_return variableDeclaratorId240 =null;

        JavaParser.formalParameterDecls_return formalParameterDecls242 =null;

        JavaParser.variableDeclaratorId_return variableDeclaratorId244 =null;


        Object char_literal241_tree=null;
        Object string_literal243_tree=null;

        try {
            // Java.g:325:5: ( variableDeclaratorId ( ',' formalParameterDecls )? | '...' variableDeclaratorId )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==Identifier) ) {
                alt80=1;
            }
            else if ( (LA80_0==44) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;

            }
            switch (alt80) {
                case 1 :
                    // Java.g:325:9: variableDeclaratorId ( ',' formalParameterDecls )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest2404);
                    variableDeclaratorId240=variableDeclaratorId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaratorId240.getTree());

                    // Java.g:325:30: ( ',' formalParameterDecls )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==39) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // Java.g:325:31: ',' formalParameterDecls
                            {
                            char_literal241=(Token)match(input,39,FOLLOW_39_in_formalParameterDeclsRest2407); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal241_tree = 
                            (Object)adaptor.create(char_literal241)
                            ;
                            adaptor.addChild(root_0, char_literal241_tree);
                            }

                            pushFollow(FOLLOW_formalParameterDecls_in_formalParameterDeclsRest2409);
                            formalParameterDecls242=formalParameterDecls();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameterDecls242.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Java.g:326:9: '...' variableDeclaratorId
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal243=(Token)match(input,44,FOLLOW_44_in_formalParameterDeclsRest2421); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal243_tree = 
                    (Object)adaptor.create(string_literal243)
                    ;
                    adaptor.addChild(root_0, string_literal243_tree);
                    }

                    pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest2423);
                    variableDeclaratorId244=variableDeclaratorId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaratorId244.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "formalParameterDeclsRest"


    public static class methodBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodBody"
    // Java.g:329:1: methodBody : block ;
    public final JavaParser.methodBody_return methodBody() throws RecognitionException {
        JavaParser.methodBody_return retval = new JavaParser.methodBody_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.block_return block245 =null;



        try {
            // Java.g:330:5: ( block )
            // Java.g:330:9: block
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_block_in_methodBody2446);
            block245=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block245.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "methodBody"


    public static class constructorBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constructorBody"
    // Java.g:333:1: constructorBody : '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' ;
    public final JavaParser.constructorBody_return constructorBody() throws RecognitionException {
        JavaParser.constructorBody_return retval = new JavaParser.constructorBody_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal246=null;
        Token char_literal249=null;
        JavaParser.explicitConstructorInvocation_return explicitConstructorInvocation247 =null;

        JavaParser.blockStatement_return blockStatement248 =null;


        Object char_literal246_tree=null;
        Object char_literal249_tree=null;

        try {
            // Java.g:334:5: ( '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' )
            // Java.g:334:9: '{' ( explicitConstructorInvocation )? ( blockStatement )* '}'
            {
            root_0 = (Object)adaptor.nil();


            char_literal246=(Token)match(input,108,FOLLOW_108_in_constructorBody2465); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal246_tree = 
            (Object)adaptor.create(char_literal246)
            ;
            adaptor.addChild(root_0, char_literal246_tree);
            }

            // Java.g:334:13: ( explicitConstructorInvocation )?
            int alt81=2;
            switch ( input.LA(1) ) {
                case 49:
                    {
                    alt81=1;
                    }
                    break;
                case 99:
                    {
                    int LA81_2 = input.LA(2);

                    if ( (synpred113_Java()) ) {
                        alt81=1;
                    }
                    }
                    break;
                case 32:
                    {
                    int LA81_3 = input.LA(2);

                    if ( (synpred113_Java()) ) {
                        alt81=1;
                    }
                    }
                    break;
                case 96:
                    {
                    int LA81_4 = input.LA(2);

                    if ( (synpred113_Java()) ) {
                        alt81=1;
                    }
                    }
                    break;
                case DecimalLiteral:
                case HexLiteral:
                case OctalLiteral:
                    {
                    int LA81_5 = input.LA(2);

                    if ( (synpred113_Java()) ) {
                        alt81=1;
                    }
                    }
                    break;
                case FloatingPointLiteral:
                    {
                    int LA81_6 = input.LA(2);

                    if ( (synpred113_Java()) ) {
                        alt81=1;
                    }
                    }
                    break;
                case CharacterLiteral:
                    {
                    int LA81_7 = input.LA(2);

                    if ( (synpred113_Java()) ) {
                        alt81=1;
                    }
                    }
                    break;
                case StringLiteral:
                    {
                    int LA81_8 = input.LA(2);

                    if ( (synpred113_Java()) ) {
                        alt81=1;
                    }
                    }
                    break;
                case 73:
                case 103:
                    {
                    int LA81_9 = input.LA(2);

                    if ( (synpred113_Java()) ) {
                        alt81=1;
                    }
                    }
                    break;
                case 87:
                    {
                    int LA81_10 = input.LA(2);

                    if ( (synpred113_Java()) ) {
                        alt81=1;
                    }
                    }
                    break;
                case 86:
                    {
                    int LA81_11 = input.LA(2);

                    if ( (synpred113_Java()) ) {
                        alt81=1;
                    }
                    }
                    break;
                case Identifier:
                    {
                    int LA81_12 = input.LA(2);

                    if ( (synpred113_Java()) ) {
                        alt81=1;
                    }
                    }
                    break;
                case 60:
                case 62:
                case 65:
                case 70:
                case 76:
                case 82:
                case 84:
                case 93:
                    {
                    int LA81_13 = input.LA(2);

                    if ( (synpred113_Java()) ) {
                        alt81=1;
                    }
                    }
                    break;
                case 105:
                    {
                    int LA81_14 = input.LA(2);

                    if ( (synpred113_Java()) ) {
                        alt81=1;
                    }
                    }
                    break;
            }

            switch (alt81) {
                case 1 :
                    // Java.g:334:13: explicitConstructorInvocation
                    {
                    pushFollow(FOLLOW_explicitConstructorInvocation_in_constructorBody2467);
                    explicitConstructorInvocation247=explicitConstructorInvocation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, explicitConstructorInvocation247.getTree());

                    }
                    break;

            }


            // Java.g:334:44: ( blockStatement )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==ASSERT||(LA82_0 >= CharacterLiteral && LA82_0 <= ENUM)||LA82_0==FloatingPointLiteral||(LA82_0 >= HexLiteral && LA82_0 <= Identifier)||(LA82_0 >= OctalLiteral && LA82_0 <= StringLiteral)||LA82_0==25||LA82_0==32||(LA82_0 >= 36 && LA82_0 <= 37)||(LA82_0 >= 40 && LA82_0 <= 41)||LA82_0==48||LA82_0==54||(LA82_0 >= 59 && LA82_0 <= 62)||(LA82_0 >= 65 && LA82_0 <= 67)||(LA82_0 >= 69 && LA82_0 <= 70)||(LA82_0 >= 73 && LA82_0 <= 74)||(LA82_0 >= 76 && LA82_0 <= 78)||(LA82_0 >= 82 && LA82_0 <= 84)||(LA82_0 >= 86 && LA82_0 <= 87)||(LA82_0 >= 89 && LA82_0 <= 100)||(LA82_0 >= 103 && LA82_0 <= 105)||(LA82_0 >= 107 && LA82_0 <= 108)||LA82_0==113) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // Java.g:334:44: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_constructorBody2470);
            	    blockStatement248=blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockStatement248.getTree());

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


            char_literal249=(Token)match(input,112,FOLLOW_112_in_constructorBody2473); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal249_tree = 
            (Object)adaptor.create(char_literal249)
            ;
            adaptor.addChild(root_0, char_literal249_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constructorBody"


    public static class explicitConstructorInvocation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "explicitConstructorInvocation"
    // Java.g:337:1: explicitConstructorInvocation : ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' | primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';' );
    public final JavaParser.explicitConstructorInvocation_return explicitConstructorInvocation() throws RecognitionException {
        JavaParser.explicitConstructorInvocation_return retval = new JavaParser.explicitConstructorInvocation_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set251=null;
        Token char_literal253=null;
        Token char_literal255=null;
        Token string_literal257=null;
        Token char_literal259=null;
        JavaParser.nonWildcardTypeArguments_return nonWildcardTypeArguments250 =null;

        JavaParser.arguments_return arguments252 =null;

        JavaParser.primary_return primary254 =null;

        JavaParser.nonWildcardTypeArguments_return nonWildcardTypeArguments256 =null;

        JavaParser.arguments_return arguments258 =null;


        Object set251_tree=null;
        Object char_literal253_tree=null;
        Object char_literal255_tree=null;
        Object string_literal257_tree=null;
        Object char_literal259_tree=null;

        try {
            // Java.g:338:5: ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' | primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';' )
            int alt85=2;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt85=1;
                }
                break;
            case 99:
                {
                int LA85_2 = input.LA(2);

                if ( (synpred117_Java()) ) {
                    alt85=1;
                }
                else if ( (true) ) {
                    alt85=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 85, 2, input);

                    throw nvae;

                }
                }
                break;
            case CharacterLiteral:
            case DecimalLiteral:
            case FloatingPointLiteral:
            case HexLiteral:
            case Identifier:
            case OctalLiteral:
            case StringLiteral:
            case 32:
            case 60:
            case 62:
            case 65:
            case 70:
            case 73:
            case 76:
            case 82:
            case 84:
            case 86:
            case 87:
            case 93:
            case 103:
            case 105:
                {
                alt85=2;
                }
                break;
            case 96:
                {
                int LA85_4 = input.LA(2);

                if ( (synpred117_Java()) ) {
                    alt85=1;
                }
                else if ( (true) ) {
                    alt85=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 85, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;

            }

            switch (alt85) {
                case 1 :
                    // Java.g:338:9: ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    // Java.g:338:9: ( nonWildcardTypeArguments )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==49) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // Java.g:338:9: nonWildcardTypeArguments
                            {
                            pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation2492);
                            nonWildcardTypeArguments250=nonWildcardTypeArguments();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, nonWildcardTypeArguments250.getTree());

                            }
                            break;

                    }


                    set251=(Token)input.LT(1);

                    if ( input.LA(1)==96||input.LA(1)==99 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set251)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation2503);
                    arguments252=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments252.getTree());

                    char_literal253=(Token)match(input,48,FOLLOW_48_in_explicitConstructorInvocation2505); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal253_tree = 
                    (Object)adaptor.create(char_literal253)
                    ;
                    adaptor.addChild(root_0, char_literal253_tree);
                    }

                    }
                    break;
                case 2 :
                    // Java.g:339:9: primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_primary_in_explicitConstructorInvocation2515);
                    primary254=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary254.getTree());

                    char_literal255=(Token)match(input,43,FOLLOW_43_in_explicitConstructorInvocation2517); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal255_tree = 
                    (Object)adaptor.create(char_literal255)
                    ;
                    adaptor.addChild(root_0, char_literal255_tree);
                    }

                    // Java.g:339:21: ( nonWildcardTypeArguments )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==49) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // Java.g:339:21: nonWildcardTypeArguments
                            {
                            pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation2519);
                            nonWildcardTypeArguments256=nonWildcardTypeArguments();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, nonWildcardTypeArguments256.getTree());

                            }
                            break;

                    }


                    string_literal257=(Token)match(input,96,FOLLOW_96_in_explicitConstructorInvocation2522); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal257_tree = 
                    (Object)adaptor.create(string_literal257)
                    ;
                    adaptor.addChild(root_0, string_literal257_tree);
                    }

                    pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation2524);
                    arguments258=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments258.getTree());

                    char_literal259=(Token)match(input,48,FOLLOW_48_in_explicitConstructorInvocation2526); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal259_tree = 
                    (Object)adaptor.create(char_literal259)
                    ;
                    adaptor.addChild(root_0, char_literal259_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "explicitConstructorInvocation"


    public static class qualifiedName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "qualifiedName"
    // Java.g:343:1: qualifiedName : Identifier ( '.' Identifier )* ;
    public final JavaParser.qualifiedName_return qualifiedName() throws RecognitionException {
        JavaParser.qualifiedName_return retval = new JavaParser.qualifiedName_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Identifier260=null;
        Token char_literal261=null;
        Token Identifier262=null;

        Object Identifier260_tree=null;
        Object char_literal261_tree=null;
        Object Identifier262_tree=null;

        try {
            // Java.g:344:5: ( Identifier ( '.' Identifier )* )
            // Java.g:344:9: Identifier ( '.' Identifier )*
            {
            root_0 = (Object)adaptor.nil();


            Identifier260=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualifiedName2546); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier260_tree = 
            (Object)adaptor.create(Identifier260)
            ;
            adaptor.addChild(root_0, Identifier260_tree);
            }

            // Java.g:344:20: ( '.' Identifier )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==43) ) {
                    int LA86_2 = input.LA(2);

                    if ( (LA86_2==Identifier) ) {
                        alt86=1;
                    }


                }


                switch (alt86) {
            	case 1 :
            	    // Java.g:344:21: '.' Identifier
            	    {
            	    char_literal261=(Token)match(input,43,FOLLOW_43_in_qualifiedName2549); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal261_tree = 
            	    (Object)adaptor.create(char_literal261)
            	    ;
            	    adaptor.addChild(root_0, char_literal261_tree);
            	    }

            	    Identifier262=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualifiedName2551); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Identifier262_tree = 
            	    (Object)adaptor.create(Identifier262)
            	    ;
            	    adaptor.addChild(root_0, Identifier262_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "qualifiedName"


    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "literal"
    // Java.g:347:1: literal : ( integerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | booleanLiteral | 'null' );
    public final JavaParser.literal_return literal() throws RecognitionException {
        JavaParser.literal_return retval = new JavaParser.literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FloatingPointLiteral264=null;
        Token CharacterLiteral265=null;
        Token StringLiteral266=null;
        Token string_literal268=null;
        JavaParser.integerLiteral_return integerLiteral263 =null;

        JavaParser.booleanLiteral_return booleanLiteral267 =null;


        Object FloatingPointLiteral264_tree=null;
        Object CharacterLiteral265_tree=null;
        Object StringLiteral266_tree=null;
        Object string_literal268_tree=null;

        try {
            // Java.g:348:5: ( integerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | booleanLiteral | 'null' )
            int alt87=6;
            switch ( input.LA(1) ) {
            case DecimalLiteral:
            case HexLiteral:
            case OctalLiteral:
                {
                alt87=1;
                }
                break;
            case FloatingPointLiteral:
                {
                alt87=2;
                }
                break;
            case CharacterLiteral:
                {
                alt87=3;
                }
                break;
            case StringLiteral:
                {
                alt87=4;
                }
                break;
            case 73:
            case 103:
                {
                alt87=5;
                }
                break;
            case 87:
                {
                alt87=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;

            }

            switch (alt87) {
                case 1 :
                    // Java.g:348:9: integerLiteral
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_integerLiteral_in_literal2577);
                    integerLiteral263=integerLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerLiteral263.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:349:9: FloatingPointLiteral
                    {
                    root_0 = (Object)adaptor.nil();


                    FloatingPointLiteral264=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_literal2587); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FloatingPointLiteral264_tree = 
                    (Object)adaptor.create(FloatingPointLiteral264)
                    ;
                    adaptor.addChild(root_0, FloatingPointLiteral264_tree);
                    }

                    }
                    break;
                case 3 :
                    // Java.g:350:9: CharacterLiteral
                    {
                    root_0 = (Object)adaptor.nil();


                    CharacterLiteral265=(Token)match(input,CharacterLiteral,FOLLOW_CharacterLiteral_in_literal2597); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CharacterLiteral265_tree = 
                    (Object)adaptor.create(CharacterLiteral265)
                    ;
                    adaptor.addChild(root_0, CharacterLiteral265_tree);
                    }

                    }
                    break;
                case 4 :
                    // Java.g:351:9: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();


                    StringLiteral266=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_literal2607); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral266_tree = 
                    (Object)adaptor.create(StringLiteral266)
                    ;
                    adaptor.addChild(root_0, StringLiteral266_tree);
                    }

                    }
                    break;
                case 5 :
                    // Java.g:352:9: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_booleanLiteral_in_literal2617);
                    booleanLiteral267=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteral267.getTree());

                    }
                    break;
                case 6 :
                    // Java.g:353:9: 'null'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal268=(Token)match(input,87,FOLLOW_87_in_literal2627); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal268_tree = 
                    (Object)adaptor.create(string_literal268)
                    ;
                    adaptor.addChild(root_0, string_literal268_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "literal"


    public static class integerLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "integerLiteral"
    // Java.g:356:1: integerLiteral : ( HexLiteral | OctalLiteral | DecimalLiteral );
    public final JavaParser.integerLiteral_return integerLiteral() throws RecognitionException {
        JavaParser.integerLiteral_return retval = new JavaParser.integerLiteral_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set269=null;

        Object set269_tree=null;

        try {
            // Java.g:357:5: ( HexLiteral | OctalLiteral | DecimalLiteral )
            // Java.g:
            {
            root_0 = (Object)adaptor.nil();


            set269=(Token)input.LT(1);

            if ( input.LA(1)==DecimalLiteral||input.LA(1)==HexLiteral||input.LA(1)==OctalLiteral ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set269)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "integerLiteral"


    public static class booleanLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanLiteral"
    // Java.g:362:1: booleanLiteral : ( 'true' | 'false' );
    public final JavaParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        JavaParser.booleanLiteral_return retval = new JavaParser.booleanLiteral_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set270=null;

        Object set270_tree=null;

        try {
            // Java.g:363:5: ( 'true' | 'false' )
            // Java.g:
            {
            root_0 = (Object)adaptor.nil();


            set270=(Token)input.LT(1);

            if ( input.LA(1)==73||input.LA(1)==103 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set270)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "booleanLiteral"


    public static class annotations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "annotations"
    // Java.g:369:1: annotations : ( annotation )+ ;
    public final JavaParser.annotations_return annotations() throws RecognitionException {
        JavaParser.annotations_return retval = new JavaParser.annotations_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.annotation_return annotation271 =null;



        try {
            // Java.g:370:5: ( ( annotation )+ )
            // Java.g:370:9: ( annotation )+
            {
            root_0 = (Object)adaptor.nil();


            // Java.g:370:9: ( annotation )+
            int cnt88=0;
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==54) ) {
                    int LA88_2 = input.LA(2);

                    if ( (LA88_2==Identifier) ) {
                        int LA88_3 = input.LA(3);

                        if ( (synpred128_Java()) ) {
                            alt88=1;
                        }


                    }


                }


                switch (alt88) {
            	case 1 :
            	    // Java.g:370:9: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_annotations2716);
            	    annotation271=annotation();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, annotation271.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt88 >= 1 ) break loop88;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(88, input);
                        throw eee;
                }
                cnt88++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "annotations"


    public static class annotation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "annotation"
    // Java.g:373:1: annotation : '@' annotationName ( '(' ( elementValuePairs | elementValue )? ')' )? ;
    public final JavaParser.annotation_return annotation() throws RecognitionException {
        JavaParser.annotation_return retval = new JavaParser.annotation_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal272=null;
        Token char_literal274=null;
        Token char_literal277=null;
        JavaParser.annotationName_return annotationName273 =null;

        JavaParser.elementValuePairs_return elementValuePairs275 =null;

        JavaParser.elementValue_return elementValue276 =null;


        Object char_literal272_tree=null;
        Object char_literal274_tree=null;
        Object char_literal277_tree=null;

        try {
            // Java.g:374:5: ( '@' annotationName ( '(' ( elementValuePairs | elementValue )? ')' )? )
            // Java.g:374:9: '@' annotationName ( '(' ( elementValuePairs | elementValue )? ')' )?
            {
            root_0 = (Object)adaptor.nil();


            char_literal272=(Token)match(input,54,FOLLOW_54_in_annotation2736); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal272_tree = 
            (Object)adaptor.create(char_literal272)
            ;
            adaptor.addChild(root_0, char_literal272_tree);
            }

            pushFollow(FOLLOW_annotationName_in_annotation2738);
            annotationName273=annotationName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationName273.getTree());

            // Java.g:374:28: ( '(' ( elementValuePairs | elementValue )? ')' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==32) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // Java.g:374:30: '(' ( elementValuePairs | elementValue )? ')'
                    {
                    char_literal274=(Token)match(input,32,FOLLOW_32_in_annotation2742); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal274_tree = 
                    (Object)adaptor.create(char_literal274)
                    ;
                    adaptor.addChild(root_0, char_literal274_tree);
                    }

                    // Java.g:374:34: ( elementValuePairs | elementValue )?
                    int alt89=3;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==Identifier) ) {
                        int LA89_1 = input.LA(2);

                        if ( (LA89_1==50) ) {
                            alt89=1;
                        }
                        else if ( ((LA89_1 >= 26 && LA89_1 <= 27)||(LA89_1 >= 29 && LA89_1 <= 30)||(LA89_1 >= 32 && LA89_1 <= 34)||(LA89_1 >= 36 && LA89_1 <= 37)||(LA89_1 >= 40 && LA89_1 <= 41)||LA89_1==43||LA89_1==45||LA89_1==49||(LA89_1 >= 51 && LA89_1 <= 53)||LA89_1==55||LA89_1==57||LA89_1==81||LA89_1==109||LA89_1==111) ) {
                            alt89=2;
                        }
                    }
                    else if ( ((LA89_0 >= CharacterLiteral && LA89_0 <= DecimalLiteral)||LA89_0==FloatingPointLiteral||LA89_0==HexLiteral||(LA89_0 >= OctalLiteral && LA89_0 <= StringLiteral)||LA89_0==25||LA89_0==32||(LA89_0 >= 36 && LA89_0 <= 37)||(LA89_0 >= 40 && LA89_0 <= 41)||LA89_0==54||LA89_0==60||LA89_0==62||LA89_0==65||LA89_0==70||LA89_0==73||LA89_0==76||LA89_0==82||LA89_0==84||(LA89_0 >= 86 && LA89_0 <= 87)||LA89_0==93||LA89_0==96||LA89_0==99||LA89_0==103||LA89_0==105||LA89_0==108||LA89_0==113) ) {
                        alt89=2;
                    }
                    switch (alt89) {
                        case 1 :
                            // Java.g:374:36: elementValuePairs
                            {
                            pushFollow(FOLLOW_elementValuePairs_in_annotation2746);
                            elementValuePairs275=elementValuePairs();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValuePairs275.getTree());

                            }
                            break;
                        case 2 :
                            // Java.g:374:56: elementValue
                            {
                            pushFollow(FOLLOW_elementValue_in_annotation2750);
                            elementValue276=elementValue();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValue276.getTree());

                            }
                            break;

                    }


                    char_literal277=(Token)match(input,33,FOLLOW_33_in_annotation2755); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal277_tree = 
                    (Object)adaptor.create(char_literal277)
                    ;
                    adaptor.addChild(root_0, char_literal277_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "annotation"


    public static class annotationName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "annotationName"
    // Java.g:377:1: annotationName : Identifier ( '.' Identifier )* ;
    public final JavaParser.annotationName_return annotationName() throws RecognitionException {
        JavaParser.annotationName_return retval = new JavaParser.annotationName_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Identifier278=null;
        Token char_literal279=null;
        Token Identifier280=null;

        Object Identifier278_tree=null;
        Object char_literal279_tree=null;
        Object Identifier280_tree=null;

        try {
            // Java.g:378:5: ( Identifier ( '.' Identifier )* )
            // Java.g:378:7: Identifier ( '.' Identifier )*
            {
            root_0 = (Object)adaptor.nil();


            Identifier278=(Token)match(input,Identifier,FOLLOW_Identifier_in_annotationName2779); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier278_tree = 
            (Object)adaptor.create(Identifier278)
            ;
            adaptor.addChild(root_0, Identifier278_tree);
            }

            // Java.g:378:18: ( '.' Identifier )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==43) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // Java.g:378:19: '.' Identifier
            	    {
            	    char_literal279=(Token)match(input,43,FOLLOW_43_in_annotationName2782); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal279_tree = 
            	    (Object)adaptor.create(char_literal279)
            	    ;
            	    adaptor.addChild(root_0, char_literal279_tree);
            	    }

            	    Identifier280=(Token)match(input,Identifier,FOLLOW_Identifier_in_annotationName2784); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Identifier280_tree = 
            	    (Object)adaptor.create(Identifier280)
            	    ;
            	    adaptor.addChild(root_0, Identifier280_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "annotationName"


    public static class elementValuePairs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elementValuePairs"
    // Java.g:381:1: elementValuePairs : elementValuePair ( ',' elementValuePair )* ;
    public final JavaParser.elementValuePairs_return elementValuePairs() throws RecognitionException {
        JavaParser.elementValuePairs_return retval = new JavaParser.elementValuePairs_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal282=null;
        JavaParser.elementValuePair_return elementValuePair281 =null;

        JavaParser.elementValuePair_return elementValuePair283 =null;


        Object char_literal282_tree=null;

        try {
            // Java.g:382:5: ( elementValuePair ( ',' elementValuePair )* )
            // Java.g:382:9: elementValuePair ( ',' elementValuePair )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_elementValuePair_in_elementValuePairs2805);
            elementValuePair281=elementValuePair();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValuePair281.getTree());

            // Java.g:382:26: ( ',' elementValuePair )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==39) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // Java.g:382:27: ',' elementValuePair
            	    {
            	    char_literal282=(Token)match(input,39,FOLLOW_39_in_elementValuePairs2808); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal282_tree = 
            	    (Object)adaptor.create(char_literal282)
            	    ;
            	    adaptor.addChild(root_0, char_literal282_tree);
            	    }

            	    pushFollow(FOLLOW_elementValuePair_in_elementValuePairs2810);
            	    elementValuePair283=elementValuePair();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValuePair283.getTree());

            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elementValuePairs"


    public static class elementValuePair_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elementValuePair"
    // Java.g:385:1: elementValuePair : Identifier '=' elementValue ;
    public final JavaParser.elementValuePair_return elementValuePair() throws RecognitionException {
        JavaParser.elementValuePair_return retval = new JavaParser.elementValuePair_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Identifier284=null;
        Token char_literal285=null;
        JavaParser.elementValue_return elementValue286 =null;


        Object Identifier284_tree=null;
        Object char_literal285_tree=null;

        try {
            // Java.g:386:5: ( Identifier '=' elementValue )
            // Java.g:386:9: Identifier '=' elementValue
            {
            root_0 = (Object)adaptor.nil();


            Identifier284=(Token)match(input,Identifier,FOLLOW_Identifier_in_elementValuePair2831); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier284_tree = 
            (Object)adaptor.create(Identifier284)
            ;
            adaptor.addChild(root_0, Identifier284_tree);
            }

            char_literal285=(Token)match(input,50,FOLLOW_50_in_elementValuePair2833); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal285_tree = 
            (Object)adaptor.create(char_literal285)
            ;
            adaptor.addChild(root_0, char_literal285_tree);
            }

            pushFollow(FOLLOW_elementValue_in_elementValuePair2835);
            elementValue286=elementValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValue286.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elementValuePair"


    public static class elementValue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elementValue"
    // Java.g:389:1: elementValue : ( conditionalExpression | annotation | elementValueArrayInitializer );
    public final JavaParser.elementValue_return elementValue() throws RecognitionException {
        JavaParser.elementValue_return retval = new JavaParser.elementValue_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.conditionalExpression_return conditionalExpression287 =null;

        JavaParser.annotation_return annotation288 =null;

        JavaParser.elementValueArrayInitializer_return elementValueArrayInitializer289 =null;



        try {
            // Java.g:390:5: ( conditionalExpression | annotation | elementValueArrayInitializer )
            int alt93=3;
            switch ( input.LA(1) ) {
            case CharacterLiteral:
            case DecimalLiteral:
            case FloatingPointLiteral:
            case HexLiteral:
            case Identifier:
            case OctalLiteral:
            case StringLiteral:
            case 25:
            case 32:
            case 36:
            case 37:
            case 40:
            case 41:
            case 60:
            case 62:
            case 65:
            case 70:
            case 73:
            case 76:
            case 82:
            case 84:
            case 86:
            case 87:
            case 93:
            case 96:
            case 99:
            case 103:
            case 105:
            case 113:
                {
                alt93=1;
                }
                break;
            case 54:
                {
                alt93=2;
                }
                break;
            case 108:
                {
                alt93=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;

            }

            switch (alt93) {
                case 1 :
                    // Java.g:390:9: conditionalExpression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_conditionalExpression_in_elementValue2858);
                    conditionalExpression287=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression287.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:391:9: annotation
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_annotation_in_elementValue2868);
                    annotation288=annotation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, annotation288.getTree());

                    }
                    break;
                case 3 :
                    // Java.g:392:9: elementValueArrayInitializer
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_elementValueArrayInitializer_in_elementValue2878);
                    elementValueArrayInitializer289=elementValueArrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValueArrayInitializer289.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elementValue"


    public static class elementValueArrayInitializer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elementValueArrayInitializer"
    // Java.g:395:1: elementValueArrayInitializer : '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}' ;
    public final JavaParser.elementValueArrayInitializer_return elementValueArrayInitializer() throws RecognitionException {
        JavaParser.elementValueArrayInitializer_return retval = new JavaParser.elementValueArrayInitializer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal290=null;
        Token char_literal292=null;
        Token char_literal294=null;
        Token char_literal295=null;
        JavaParser.elementValue_return elementValue291 =null;

        JavaParser.elementValue_return elementValue293 =null;


        Object char_literal290_tree=null;
        Object char_literal292_tree=null;
        Object char_literal294_tree=null;
        Object char_literal295_tree=null;

        try {
            // Java.g:396:5: ( '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}' )
            // Java.g:396:9: '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}'
            {
            root_0 = (Object)adaptor.nil();


            char_literal290=(Token)match(input,108,FOLLOW_108_in_elementValueArrayInitializer2901); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal290_tree = 
            (Object)adaptor.create(char_literal290)
            ;
            adaptor.addChild(root_0, char_literal290_tree);
            }

            // Java.g:396:13: ( elementValue ( ',' elementValue )* )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( ((LA95_0 >= CharacterLiteral && LA95_0 <= DecimalLiteral)||LA95_0==FloatingPointLiteral||(LA95_0 >= HexLiteral && LA95_0 <= Identifier)||(LA95_0 >= OctalLiteral && LA95_0 <= StringLiteral)||LA95_0==25||LA95_0==32||(LA95_0 >= 36 && LA95_0 <= 37)||(LA95_0 >= 40 && LA95_0 <= 41)||LA95_0==54||LA95_0==60||LA95_0==62||LA95_0==65||LA95_0==70||LA95_0==73||LA95_0==76||LA95_0==82||LA95_0==84||(LA95_0 >= 86 && LA95_0 <= 87)||LA95_0==93||LA95_0==96||LA95_0==99||LA95_0==103||LA95_0==105||LA95_0==108||LA95_0==113) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // Java.g:396:14: elementValue ( ',' elementValue )*
                    {
                    pushFollow(FOLLOW_elementValue_in_elementValueArrayInitializer2904);
                    elementValue291=elementValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValue291.getTree());

                    // Java.g:396:27: ( ',' elementValue )*
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==39) ) {
                            int LA94_1 = input.LA(2);

                            if ( ((LA94_1 >= CharacterLiteral && LA94_1 <= DecimalLiteral)||LA94_1==FloatingPointLiteral||(LA94_1 >= HexLiteral && LA94_1 <= Identifier)||(LA94_1 >= OctalLiteral && LA94_1 <= StringLiteral)||LA94_1==25||LA94_1==32||(LA94_1 >= 36 && LA94_1 <= 37)||(LA94_1 >= 40 && LA94_1 <= 41)||LA94_1==54||LA94_1==60||LA94_1==62||LA94_1==65||LA94_1==70||LA94_1==73||LA94_1==76||LA94_1==82||LA94_1==84||(LA94_1 >= 86 && LA94_1 <= 87)||LA94_1==93||LA94_1==96||LA94_1==99||LA94_1==103||LA94_1==105||LA94_1==108||LA94_1==113) ) {
                                alt94=1;
                            }


                        }


                        switch (alt94) {
                    	case 1 :
                    	    // Java.g:396:28: ',' elementValue
                    	    {
                    	    char_literal292=(Token)match(input,39,FOLLOW_39_in_elementValueArrayInitializer2907); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal292_tree = 
                    	    (Object)adaptor.create(char_literal292)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal292_tree);
                    	    }

                    	    pushFollow(FOLLOW_elementValue_in_elementValueArrayInitializer2909);
                    	    elementValue293=elementValue();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValue293.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop94;
                        }
                    } while (true);


                    }
                    break;

            }


            // Java.g:396:49: ( ',' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==39) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // Java.g:396:50: ','
                    {
                    char_literal294=(Token)match(input,39,FOLLOW_39_in_elementValueArrayInitializer2916); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal294_tree = 
                    (Object)adaptor.create(char_literal294)
                    ;
                    adaptor.addChild(root_0, char_literal294_tree);
                    }

                    }
                    break;

            }


            char_literal295=(Token)match(input,112,FOLLOW_112_in_elementValueArrayInitializer2920); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal295_tree = 
            (Object)adaptor.create(char_literal295)
            ;
            adaptor.addChild(root_0, char_literal295_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elementValueArrayInitializer"


    public static class annotationTypeDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "annotationTypeDeclaration"
    // Java.g:399:1: annotationTypeDeclaration : '@' 'interface' Identifier annotationTypeBody ;
    public final JavaParser.annotationTypeDeclaration_return annotationTypeDeclaration() throws RecognitionException {
        JavaParser.annotationTypeDeclaration_return retval = new JavaParser.annotationTypeDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal296=null;
        Token string_literal297=null;
        Token Identifier298=null;
        JavaParser.annotationTypeBody_return annotationTypeBody299 =null;


        Object char_literal296_tree=null;
        Object string_literal297_tree=null;
        Object Identifier298_tree=null;

        try {
            // Java.g:400:5: ( '@' 'interface' Identifier annotationTypeBody )
            // Java.g:400:9: '@' 'interface' Identifier annotationTypeBody
            {
            root_0 = (Object)adaptor.nil();


            char_literal296=(Token)match(input,54,FOLLOW_54_in_annotationTypeDeclaration2943); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal296_tree = 
            (Object)adaptor.create(char_literal296)
            ;
            adaptor.addChild(root_0, char_literal296_tree);
            }

            string_literal297=(Token)match(input,83,FOLLOW_83_in_annotationTypeDeclaration2945); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal297_tree = 
            (Object)adaptor.create(string_literal297)
            ;
            adaptor.addChild(root_0, string_literal297_tree);
            }

            Identifier298=(Token)match(input,Identifier,FOLLOW_Identifier_in_annotationTypeDeclaration2947); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier298_tree = 
            (Object)adaptor.create(Identifier298)
            ;
            adaptor.addChild(root_0, Identifier298_tree);
            }

            pushFollow(FOLLOW_annotationTypeBody_in_annotationTypeDeclaration2949);
            annotationTypeBody299=annotationTypeBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationTypeBody299.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "annotationTypeDeclaration"


    public static class annotationTypeBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "annotationTypeBody"
    // Java.g:403:1: annotationTypeBody : '{' ( annotationTypeElementDeclaration )* '}' ;
    public final JavaParser.annotationTypeBody_return annotationTypeBody() throws RecognitionException {
        JavaParser.annotationTypeBody_return retval = new JavaParser.annotationTypeBody_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal300=null;
        Token char_literal302=null;
        JavaParser.annotationTypeElementDeclaration_return annotationTypeElementDeclaration301 =null;


        Object char_literal300_tree=null;
        Object char_literal302_tree=null;

        try {
            // Java.g:404:5: ( '{' ( annotationTypeElementDeclaration )* '}' )
            // Java.g:404:9: '{' ( annotationTypeElementDeclaration )* '}'
            {
            root_0 = (Object)adaptor.nil();


            char_literal300=(Token)match(input,108,FOLLOW_108_in_annotationTypeBody2972); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal300_tree = 
            (Object)adaptor.create(char_literal300)
            ;
            adaptor.addChild(root_0, char_literal300_tree);
            }

            // Java.g:404:13: ( annotationTypeElementDeclaration )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==ENUM||LA97_0==Identifier||LA97_0==49||LA97_0==54||(LA97_0 >= 59 && LA97_0 <= 60)||LA97_0==62||(LA97_0 >= 65 && LA97_0 <= 66)||LA97_0==70||LA97_0==74||LA97_0==76||(LA97_0 >= 82 && LA97_0 <= 85)||(LA97_0 >= 89 && LA97_0 <= 91)||(LA97_0 >= 93 && LA97_0 <= 95)||LA97_0==98||LA97_0==102||(LA97_0 >= 105 && LA97_0 <= 106)) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // Java.g:404:14: annotationTypeElementDeclaration
            	    {
            	    pushFollow(FOLLOW_annotationTypeElementDeclaration_in_annotationTypeBody2975);
            	    annotationTypeElementDeclaration301=annotationTypeElementDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationTypeElementDeclaration301.getTree());

            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);


            char_literal302=(Token)match(input,112,FOLLOW_112_in_annotationTypeBody2979); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal302_tree = 
            (Object)adaptor.create(char_literal302)
            ;
            adaptor.addChild(root_0, char_literal302_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "annotationTypeBody"


    public static class annotationTypeElementDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "annotationTypeElementDeclaration"
    // Java.g:407:1: annotationTypeElementDeclaration : modifiers annotationTypeElementRest ;
    public final JavaParser.annotationTypeElementDeclaration_return annotationTypeElementDeclaration() throws RecognitionException {
        JavaParser.annotationTypeElementDeclaration_return retval = new JavaParser.annotationTypeElementDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.modifiers_return modifiers303 =null;

        JavaParser.annotationTypeElementRest_return annotationTypeElementRest304 =null;



        try {
            // Java.g:408:5: ( modifiers annotationTypeElementRest )
            // Java.g:408:9: modifiers annotationTypeElementRest
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_modifiers_in_annotationTypeElementDeclaration3002);
            modifiers303=modifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, modifiers303.getTree());

            pushFollow(FOLLOW_annotationTypeElementRest_in_annotationTypeElementDeclaration3004);
            annotationTypeElementRest304=annotationTypeElementRest();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationTypeElementRest304.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "annotationTypeElementDeclaration"


    public static class annotationTypeElementRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "annotationTypeElementRest"
    // Java.g:411:1: annotationTypeElementRest : ( type annotationMethodOrConstantRest ';' | normalClassDeclaration ( ';' )? | normalInterfaceDeclaration ( ';' )? | enumDeclaration ( ';' )? | annotationTypeDeclaration ( ';' )? );
    public final JavaParser.annotationTypeElementRest_return annotationTypeElementRest() throws RecognitionException {
        JavaParser.annotationTypeElementRest_return retval = new JavaParser.annotationTypeElementRest_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal307=null;
        Token char_literal309=null;
        Token char_literal311=null;
        Token char_literal313=null;
        Token char_literal315=null;
        JavaParser.type_return type305 =null;

        JavaParser.annotationMethodOrConstantRest_return annotationMethodOrConstantRest306 =null;

        JavaParser.normalClassDeclaration_return normalClassDeclaration308 =null;

        JavaParser.normalInterfaceDeclaration_return normalInterfaceDeclaration310 =null;

        JavaParser.enumDeclaration_return enumDeclaration312 =null;

        JavaParser.annotationTypeDeclaration_return annotationTypeDeclaration314 =null;


        Object char_literal307_tree=null;
        Object char_literal309_tree=null;
        Object char_literal311_tree=null;
        Object char_literal313_tree=null;
        Object char_literal315_tree=null;

        try {
            // Java.g:412:5: ( type annotationMethodOrConstantRest ';' | normalClassDeclaration ( ';' )? | normalInterfaceDeclaration ( ';' )? | enumDeclaration ( ';' )? | annotationTypeDeclaration ( ';' )? )
            int alt102=5;
            switch ( input.LA(1) ) {
            case Identifier:
            case 60:
            case 62:
            case 65:
            case 70:
            case 76:
            case 82:
            case 84:
            case 93:
                {
                alt102=1;
                }
                break;
            case 66:
                {
                alt102=2;
                }
                break;
            case 83:
                {
                alt102=3;
                }
                break;
            case ENUM:
                {
                alt102=4;
                }
                break;
            case 54:
                {
                alt102=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;

            }

            switch (alt102) {
                case 1 :
                    // Java.g:412:9: type annotationMethodOrConstantRest ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_in_annotationTypeElementRest3027);
                    type305=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type305.getTree());

                    pushFollow(FOLLOW_annotationMethodOrConstantRest_in_annotationTypeElementRest3029);
                    annotationMethodOrConstantRest306=annotationMethodOrConstantRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationMethodOrConstantRest306.getTree());

                    char_literal307=(Token)match(input,48,FOLLOW_48_in_annotationTypeElementRest3031); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal307_tree = 
                    (Object)adaptor.create(char_literal307)
                    ;
                    adaptor.addChild(root_0, char_literal307_tree);
                    }

                    }
                    break;
                case 2 :
                    // Java.g:413:9: normalClassDeclaration ( ';' )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_normalClassDeclaration_in_annotationTypeElementRest3041);
                    normalClassDeclaration308=normalClassDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, normalClassDeclaration308.getTree());

                    // Java.g:413:32: ( ';' )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==48) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // Java.g:413:32: ';'
                            {
                            char_literal309=(Token)match(input,48,FOLLOW_48_in_annotationTypeElementRest3043); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal309_tree = 
                            (Object)adaptor.create(char_literal309)
                            ;
                            adaptor.addChild(root_0, char_literal309_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // Java.g:414:9: normalInterfaceDeclaration ( ';' )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_normalInterfaceDeclaration_in_annotationTypeElementRest3054);
                    normalInterfaceDeclaration310=normalInterfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, normalInterfaceDeclaration310.getTree());

                    // Java.g:414:36: ( ';' )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==48) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // Java.g:414:36: ';'
                            {
                            char_literal311=(Token)match(input,48,FOLLOW_48_in_annotationTypeElementRest3056); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal311_tree = 
                            (Object)adaptor.create(char_literal311)
                            ;
                            adaptor.addChild(root_0, char_literal311_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // Java.g:415:9: enumDeclaration ( ';' )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enumDeclaration_in_annotationTypeElementRest3067);
                    enumDeclaration312=enumDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDeclaration312.getTree());

                    // Java.g:415:25: ( ';' )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==48) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // Java.g:415:25: ';'
                            {
                            char_literal313=(Token)match(input,48,FOLLOW_48_in_annotationTypeElementRest3069); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal313_tree = 
                            (Object)adaptor.create(char_literal313)
                            ;
                            adaptor.addChild(root_0, char_literal313_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // Java.g:416:9: annotationTypeDeclaration ( ';' )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_annotationTypeDeclaration_in_annotationTypeElementRest3080);
                    annotationTypeDeclaration314=annotationTypeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationTypeDeclaration314.getTree());

                    // Java.g:416:35: ( ';' )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==48) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // Java.g:416:35: ';'
                            {
                            char_literal315=(Token)match(input,48,FOLLOW_48_in_annotationTypeElementRest3082); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal315_tree = 
                            (Object)adaptor.create(char_literal315)
                            ;
                            adaptor.addChild(root_0, char_literal315_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "annotationTypeElementRest"


    public static class annotationMethodOrConstantRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "annotationMethodOrConstantRest"
    // Java.g:419:1: annotationMethodOrConstantRest : ( annotationMethodRest | annotationConstantRest );
    public final JavaParser.annotationMethodOrConstantRest_return annotationMethodOrConstantRest() throws RecognitionException {
        JavaParser.annotationMethodOrConstantRest_return retval = new JavaParser.annotationMethodOrConstantRest_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.annotationMethodRest_return annotationMethodRest316 =null;

        JavaParser.annotationConstantRest_return annotationConstantRest317 =null;



        try {
            // Java.g:420:5: ( annotationMethodRest | annotationConstantRest )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==Identifier) ) {
                int LA103_1 = input.LA(2);

                if ( (LA103_1==32) ) {
                    alt103=1;
                }
                else if ( (LA103_1==39||LA103_1==48||LA103_1==50||LA103_1==55) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;

            }
            switch (alt103) {
                case 1 :
                    // Java.g:420:9: annotationMethodRest
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_annotationMethodRest_in_annotationMethodOrConstantRest3106);
                    annotationMethodRest316=annotationMethodRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationMethodRest316.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:421:9: annotationConstantRest
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_annotationConstantRest_in_annotationMethodOrConstantRest3116);
                    annotationConstantRest317=annotationConstantRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationConstantRest317.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "annotationMethodOrConstantRest"


    public static class annotationMethodRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "annotationMethodRest"
    // Java.g:424:1: annotationMethodRest : Identifier '(' ')' ( defaultValue )? ;
    public final JavaParser.annotationMethodRest_return annotationMethodRest() throws RecognitionException {
        JavaParser.annotationMethodRest_return retval = new JavaParser.annotationMethodRest_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Identifier318=null;
        Token char_literal319=null;
        Token char_literal320=null;
        JavaParser.defaultValue_return defaultValue321 =null;


        Object Identifier318_tree=null;
        Object char_literal319_tree=null;
        Object char_literal320_tree=null;

        try {
            // Java.g:425:5: ( Identifier '(' ')' ( defaultValue )? )
            // Java.g:425:9: Identifier '(' ')' ( defaultValue )?
            {
            root_0 = (Object)adaptor.nil();


            Identifier318=(Token)match(input,Identifier,FOLLOW_Identifier_in_annotationMethodRest3139); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier318_tree = 
            (Object)adaptor.create(Identifier318)
            ;
            adaptor.addChild(root_0, Identifier318_tree);
            }

            char_literal319=(Token)match(input,32,FOLLOW_32_in_annotationMethodRest3141); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal319_tree = 
            (Object)adaptor.create(char_literal319)
            ;
            adaptor.addChild(root_0, char_literal319_tree);
            }

            char_literal320=(Token)match(input,33,FOLLOW_33_in_annotationMethodRest3143); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal320_tree = 
            (Object)adaptor.create(char_literal320)
            ;
            adaptor.addChild(root_0, char_literal320_tree);
            }

            // Java.g:425:28: ( defaultValue )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==68) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // Java.g:425:28: defaultValue
                    {
                    pushFollow(FOLLOW_defaultValue_in_annotationMethodRest3145);
                    defaultValue321=defaultValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultValue321.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "annotationMethodRest"


    public static class annotationConstantRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "annotationConstantRest"
    // Java.g:428:1: annotationConstantRest : variableDeclarators ;
    public final JavaParser.annotationConstantRest_return annotationConstantRest() throws RecognitionException {
        JavaParser.annotationConstantRest_return retval = new JavaParser.annotationConstantRest_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.variableDeclarators_return variableDeclarators322 =null;



        try {
            // Java.g:429:5: ( variableDeclarators )
            // Java.g:429:9: variableDeclarators
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_variableDeclarators_in_annotationConstantRest3169);
            variableDeclarators322=variableDeclarators();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarators322.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "annotationConstantRest"


    public static class defaultValue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "defaultValue"
    // Java.g:432:1: defaultValue : 'default' elementValue ;
    public final JavaParser.defaultValue_return defaultValue() throws RecognitionException {
        JavaParser.defaultValue_return retval = new JavaParser.defaultValue_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal323=null;
        JavaParser.elementValue_return elementValue324 =null;


        Object string_literal323_tree=null;

        try {
            // Java.g:433:5: ( 'default' elementValue )
            // Java.g:433:9: 'default' elementValue
            {
            root_0 = (Object)adaptor.nil();


            string_literal323=(Token)match(input,68,FOLLOW_68_in_defaultValue3192); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal323_tree = 
            (Object)adaptor.create(string_literal323)
            ;
            adaptor.addChild(root_0, string_literal323_tree);
            }

            pushFollow(FOLLOW_elementValue_in_defaultValue3194);
            elementValue324=elementValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValue324.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "defaultValue"


    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // Java.g:438:1: block : '{' ( blockStatement )* '}' ;
    public final JavaParser.block_return block() throws RecognitionException {
        JavaParser.block_return retval = new JavaParser.block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal325=null;
        Token char_literal327=null;
        JavaParser.blockStatement_return blockStatement326 =null;


        Object char_literal325_tree=null;
        Object char_literal327_tree=null;

        try {
            // Java.g:439:5: ( '{' ( blockStatement )* '}' )
            // Java.g:439:9: '{' ( blockStatement )* '}'
            {
            root_0 = (Object)adaptor.nil();


            char_literal325=(Token)match(input,108,FOLLOW_108_in_block3215); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal325_tree = 
            (Object)adaptor.create(char_literal325)
            ;
            adaptor.addChild(root_0, char_literal325_tree);
            }

            // Java.g:439:13: ( blockStatement )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==ASSERT||(LA105_0 >= CharacterLiteral && LA105_0 <= ENUM)||LA105_0==FloatingPointLiteral||(LA105_0 >= HexLiteral && LA105_0 <= Identifier)||(LA105_0 >= OctalLiteral && LA105_0 <= StringLiteral)||LA105_0==25||LA105_0==32||(LA105_0 >= 36 && LA105_0 <= 37)||(LA105_0 >= 40 && LA105_0 <= 41)||LA105_0==48||LA105_0==54||(LA105_0 >= 59 && LA105_0 <= 62)||(LA105_0 >= 65 && LA105_0 <= 67)||(LA105_0 >= 69 && LA105_0 <= 70)||(LA105_0 >= 73 && LA105_0 <= 74)||(LA105_0 >= 76 && LA105_0 <= 78)||(LA105_0 >= 82 && LA105_0 <= 84)||(LA105_0 >= 86 && LA105_0 <= 87)||(LA105_0 >= 89 && LA105_0 <= 100)||(LA105_0 >= 103 && LA105_0 <= 105)||(LA105_0 >= 107 && LA105_0 <= 108)||LA105_0==113) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // Java.g:439:13: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_block3217);
            	    blockStatement326=blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockStatement326.getTree());

            	    }
            	    break;

            	default :
            	    break loop105;
                }
            } while (true);


            char_literal327=(Token)match(input,112,FOLLOW_112_in_block3220); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal327_tree = 
            (Object)adaptor.create(char_literal327)
            ;
            adaptor.addChild(root_0, char_literal327_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block"


    public static class blockStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "blockStatement"
    // Java.g:442:1: blockStatement : ( localVariableDeclarationStatement | classOrInterfaceDeclaration | statement );
    public final JavaParser.blockStatement_return blockStatement() throws RecognitionException {
        JavaParser.blockStatement_return retval = new JavaParser.blockStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.localVariableDeclarationStatement_return localVariableDeclarationStatement328 =null;

        JavaParser.classOrInterfaceDeclaration_return classOrInterfaceDeclaration329 =null;

        JavaParser.statement_return statement330 =null;



        try {
            // Java.g:443:5: ( localVariableDeclarationStatement | classOrInterfaceDeclaration | statement )
            int alt106=3;
            switch ( input.LA(1) ) {
            case 74:
                {
                int LA106_1 = input.LA(2);

                if ( (synpred151_Java()) ) {
                    alt106=1;
                }
                else if ( (synpred152_Java()) ) {
                    alt106=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 106, 1, input);

                    throw nvae;

                }
                }
                break;
            case 54:
                {
                int LA106_2 = input.LA(2);

                if ( (synpred151_Java()) ) {
                    alt106=1;
                }
                else if ( (synpred152_Java()) ) {
                    alt106=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 106, 2, input);

                    throw nvae;

                }
                }
                break;
            case Identifier:
                {
                int LA106_3 = input.LA(2);

                if ( (synpred151_Java()) ) {
                    alt106=1;
                }
                else if ( (true) ) {
                    alt106=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 106, 3, input);

                    throw nvae;

                }
                }
                break;
            case 60:
            case 62:
            case 65:
            case 70:
            case 76:
            case 82:
            case 84:
            case 93:
                {
                int LA106_4 = input.LA(2);

                if ( (synpred151_Java()) ) {
                    alt106=1;
                }
                else if ( (true) ) {
                    alt106=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 106, 4, input);

                    throw nvae;

                }
                }
                break;
            case ENUM:
            case 59:
            case 66:
            case 83:
            case 89:
            case 90:
            case 91:
            case 94:
            case 95:
                {
                alt106=2;
                }
                break;
            case ASSERT:
            case CharacterLiteral:
            case DecimalLiteral:
            case FloatingPointLiteral:
            case HexLiteral:
            case OctalLiteral:
            case StringLiteral:
            case 25:
            case 32:
            case 36:
            case 37:
            case 40:
            case 41:
            case 48:
            case 61:
            case 67:
            case 69:
            case 73:
            case 77:
            case 78:
            case 86:
            case 87:
            case 92:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 103:
            case 104:
            case 105:
            case 107:
            case 108:
            case 113:
                {
                alt106=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;

            }

            switch (alt106) {
                case 1 :
                    // Java.g:443:9: localVariableDeclarationStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_localVariableDeclarationStatement_in_blockStatement3243);
                    localVariableDeclarationStatement328=localVariableDeclarationStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclarationStatement328.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:444:9: classOrInterfaceDeclaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classOrInterfaceDeclaration_in_blockStatement3253);
                    classOrInterfaceDeclaration329=classOrInterfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classOrInterfaceDeclaration329.getTree());

                    }
                    break;
                case 3 :
                    // Java.g:445:9: statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statement_in_blockStatement3263);
                    statement330=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement330.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "blockStatement"


    public static class localVariableDeclarationStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "localVariableDeclarationStatement"
    // Java.g:448:1: localVariableDeclarationStatement : localVariableDeclaration ';' ;
    public final JavaParser.localVariableDeclarationStatement_return localVariableDeclarationStatement() throws RecognitionException {
        JavaParser.localVariableDeclarationStatement_return retval = new JavaParser.localVariableDeclarationStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal332=null;
        JavaParser.localVariableDeclaration_return localVariableDeclaration331 =null;


        Object char_literal332_tree=null;

        try {
            // Java.g:449:5: ( localVariableDeclaration ';' )
            // Java.g:449:10: localVariableDeclaration ';'
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement3287);
            localVariableDeclaration331=localVariableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclaration331.getTree());

            char_literal332=(Token)match(input,48,FOLLOW_48_in_localVariableDeclarationStatement3289); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal332_tree = 
            (Object)adaptor.create(char_literal332)
            ;
            adaptor.addChild(root_0, char_literal332_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "localVariableDeclarationStatement"


    public static class localVariableDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "localVariableDeclaration"
    // Java.g:452:1: localVariableDeclaration : variableModifiers type variableDeclarators ;
    public final JavaParser.localVariableDeclaration_return localVariableDeclaration() throws RecognitionException {
        JavaParser.localVariableDeclaration_return retval = new JavaParser.localVariableDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.variableModifiers_return variableModifiers333 =null;

        JavaParser.type_return type334 =null;

        JavaParser.variableDeclarators_return variableDeclarators335 =null;



        try {
            // Java.g:453:5: ( variableModifiers type variableDeclarators )
            // Java.g:453:9: variableModifiers type variableDeclarators
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_variableModifiers_in_localVariableDeclaration3308);
            variableModifiers333=variableModifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableModifiers333.getTree());

            pushFollow(FOLLOW_type_in_localVariableDeclaration3310);
            type334=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type334.getTree());

            pushFollow(FOLLOW_variableDeclarators_in_localVariableDeclaration3312);
            variableDeclarators335=variableDeclarators();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarators335.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "localVariableDeclaration"


    public static class variableModifiers_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variableModifiers"
    // Java.g:456:1: variableModifiers : ( variableModifier )* ;
    public final JavaParser.variableModifiers_return variableModifiers() throws RecognitionException {
        JavaParser.variableModifiers_return retval = new JavaParser.variableModifiers_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.variableModifier_return variableModifier336 =null;



        try {
            // Java.g:457:5: ( ( variableModifier )* )
            // Java.g:457:9: ( variableModifier )*
            {
            root_0 = (Object)adaptor.nil();


            // Java.g:457:9: ( variableModifier )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==54||LA107_0==74) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // Java.g:457:9: variableModifier
            	    {
            	    pushFollow(FOLLOW_variableModifier_in_variableModifiers3335);
            	    variableModifier336=variableModifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableModifier336.getTree());

            	    }
            	    break;

            	default :
            	    break loop107;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variableModifiers"


    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // Java.g:460:1: statement : ( block | ASSERT expression ( ':' expression )? ';' | 'if' parExpression statement ( options {k=1; } : 'else' statement )? | 'for' '(' forControl ')' statement | 'while' parExpression statement | 'do' statement 'while' parExpression ';' | 'try' block ( catches 'finally' block | catches | 'finally' block ) | 'switch' parExpression '{' switchBlockStatementGroups '}' | 'synchronized' parExpression block | 'return' ( expression )? ';' | 'throw' expression ';' | 'break' ( Identifier )? ';' | 'continue' ( Identifier )? ';' | ';' | statementExpression ';' | Identifier ':' statement );
    public final JavaParser.statement_return statement() throws RecognitionException {
        JavaParser.statement_return retval = new JavaParser.statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ASSERT338=null;
        Token char_literal340=null;
        Token char_literal342=null;
        Token string_literal343=null;
        Token string_literal346=null;
        Token string_literal348=null;
        Token char_literal349=null;
        Token char_literal351=null;
        Token string_literal353=null;
        Token string_literal356=null;
        Token string_literal358=null;
        Token char_literal360=null;
        Token string_literal361=null;
        Token string_literal364=null;
        Token string_literal367=null;
        Token string_literal369=null;
        Token char_literal371=null;
        Token char_literal373=null;
        Token string_literal374=null;
        Token string_literal377=null;
        Token char_literal379=null;
        Token string_literal380=null;
        Token char_literal382=null;
        Token string_literal383=null;
        Token Identifier384=null;
        Token char_literal385=null;
        Token string_literal386=null;
        Token Identifier387=null;
        Token char_literal388=null;
        Token char_literal389=null;
        Token char_literal391=null;
        Token Identifier392=null;
        Token char_literal393=null;
        JavaParser.block_return block337 =null;

        JavaParser.expression_return expression339 =null;

        JavaParser.expression_return expression341 =null;

        JavaParser.parExpression_return parExpression344 =null;

        JavaParser.statement_return statement345 =null;

        JavaParser.statement_return statement347 =null;

        JavaParser.forControl_return forControl350 =null;

        JavaParser.statement_return statement352 =null;

        JavaParser.parExpression_return parExpression354 =null;

        JavaParser.statement_return statement355 =null;

        JavaParser.statement_return statement357 =null;

        JavaParser.parExpression_return parExpression359 =null;

        JavaParser.block_return block362 =null;

        JavaParser.catches_return catches363 =null;

        JavaParser.block_return block365 =null;

        JavaParser.catches_return catches366 =null;

        JavaParser.block_return block368 =null;

        JavaParser.parExpression_return parExpression370 =null;

        JavaParser.switchBlockStatementGroups_return switchBlockStatementGroups372 =null;

        JavaParser.parExpression_return parExpression375 =null;

        JavaParser.block_return block376 =null;

        JavaParser.expression_return expression378 =null;

        JavaParser.expression_return expression381 =null;

        JavaParser.statementExpression_return statementExpression390 =null;

        JavaParser.statement_return statement394 =null;


        Object ASSERT338_tree=null;
        Object char_literal340_tree=null;
        Object char_literal342_tree=null;
        Object string_literal343_tree=null;
        Object string_literal346_tree=null;
        Object string_literal348_tree=null;
        Object char_literal349_tree=null;
        Object char_literal351_tree=null;
        Object string_literal353_tree=null;
        Object string_literal356_tree=null;
        Object string_literal358_tree=null;
        Object char_literal360_tree=null;
        Object string_literal361_tree=null;
        Object string_literal364_tree=null;
        Object string_literal367_tree=null;
        Object string_literal369_tree=null;
        Object char_literal371_tree=null;
        Object char_literal373_tree=null;
        Object string_literal374_tree=null;
        Object string_literal377_tree=null;
        Object char_literal379_tree=null;
        Object string_literal380_tree=null;
        Object char_literal382_tree=null;
        Object string_literal383_tree=null;
        Object Identifier384_tree=null;
        Object char_literal385_tree=null;
        Object string_literal386_tree=null;
        Object Identifier387_tree=null;
        Object char_literal388_tree=null;
        Object char_literal389_tree=null;
        Object char_literal391_tree=null;
        Object Identifier392_tree=null;
        Object char_literal393_tree=null;

        try {
            // Java.g:461:5: ( block | ASSERT expression ( ':' expression )? ';' | 'if' parExpression statement ( options {k=1; } : 'else' statement )? | 'for' '(' forControl ')' statement | 'while' parExpression statement | 'do' statement 'while' parExpression ';' | 'try' block ( catches 'finally' block | catches | 'finally' block ) | 'switch' parExpression '{' switchBlockStatementGroups '}' | 'synchronized' parExpression block | 'return' ( expression )? ';' | 'throw' expression ';' | 'break' ( Identifier )? ';' | 'continue' ( Identifier )? ';' | ';' | statementExpression ';' | Identifier ':' statement )
            int alt114=16;
            switch ( input.LA(1) ) {
            case 108:
                {
                alt114=1;
                }
                break;
            case ASSERT:
                {
                alt114=2;
                }
                break;
            case 78:
                {
                alt114=3;
                }
                break;
            case 77:
                {
                alt114=4;
                }
                break;
            case 107:
                {
                alt114=5;
                }
                break;
            case 69:
                {
                alt114=6;
                }
                break;
            case 104:
                {
                alt114=7;
                }
                break;
            case 97:
                {
                alt114=8;
                }
                break;
            case 98:
                {
                alt114=9;
                }
                break;
            case 92:
                {
                alt114=10;
                }
                break;
            case 100:
                {
                alt114=11;
                }
                break;
            case 61:
                {
                alt114=12;
                }
                break;
            case 67:
                {
                alt114=13;
                }
                break;
            case 48:
                {
                alt114=14;
                }
                break;
            case CharacterLiteral:
            case DecimalLiteral:
            case FloatingPointLiteral:
            case HexLiteral:
            case OctalLiteral:
            case StringLiteral:
            case 25:
            case 32:
            case 36:
            case 37:
            case 40:
            case 41:
            case 60:
            case 62:
            case 65:
            case 70:
            case 73:
            case 76:
            case 82:
            case 84:
            case 86:
            case 87:
            case 93:
            case 96:
            case 99:
            case 103:
            case 105:
            case 113:
                {
                alt114=15;
                }
                break;
            case Identifier:
                {
                int LA114_16 = input.LA(2);

                if ( (LA114_16==47) ) {
                    alt114=16;
                }
                else if ( ((LA114_16 >= 26 && LA114_16 <= 32)||(LA114_16 >= 34 && LA114_16 <= 38)||(LA114_16 >= 40 && LA114_16 <= 43)||(LA114_16 >= 45 && LA114_16 <= 46)||(LA114_16 >= 48 && LA114_16 <= 53)||LA114_16==55||(LA114_16 >= 57 && LA114_16 <= 58)||LA114_16==81||(LA114_16 >= 109 && LA114_16 <= 111)) ) {
                    alt114=15;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 114, 16, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;

            }

            switch (alt114) {
                case 1 :
                    // Java.g:461:7: block
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_block_in_statement3353);
                    block337=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block337.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:462:9: ASSERT expression ( ':' expression )? ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    ASSERT338=(Token)match(input,ASSERT,FOLLOW_ASSERT_in_statement3363); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSERT338_tree = 
                    (Object)adaptor.create(ASSERT338)
                    ;
                    adaptor.addChild(root_0, ASSERT338_tree);
                    }

                    pushFollow(FOLLOW_expression_in_statement3365);
                    expression339=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression339.getTree());

                    // Java.g:462:27: ( ':' expression )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==47) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // Java.g:462:28: ':' expression
                            {
                            char_literal340=(Token)match(input,47,FOLLOW_47_in_statement3368); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal340_tree = 
                            (Object)adaptor.create(char_literal340)
                            ;
                            adaptor.addChild(root_0, char_literal340_tree);
                            }

                            pushFollow(FOLLOW_expression_in_statement3370);
                            expression341=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression341.getTree());

                            }
                            break;

                    }


                    char_literal342=(Token)match(input,48,FOLLOW_48_in_statement3374); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal342_tree = 
                    (Object)adaptor.create(char_literal342)
                    ;
                    adaptor.addChild(root_0, char_literal342_tree);
                    }

                    }
                    break;
                case 3 :
                    // Java.g:463:9: 'if' parExpression statement ( options {k=1; } : 'else' statement )?
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal343=(Token)match(input,78,FOLLOW_78_in_statement3384); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal343_tree = 
                    (Object)adaptor.create(string_literal343)
                    ;
                    adaptor.addChild(root_0, string_literal343_tree);
                    }

                    pushFollow(FOLLOW_parExpression_in_statement3386);
                    parExpression344=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression344.getTree());

                    pushFollow(FOLLOW_statement_in_statement3388);
                    statement345=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement345.getTree());

                    // Java.g:463:38: ( options {k=1; } : 'else' statement )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==71) ) {
                        int LA109_1 = input.LA(2);

                        if ( (synpred157_Java()) ) {
                            alt109=1;
                        }
                    }
                    switch (alt109) {
                        case 1 :
                            // Java.g:463:54: 'else' statement
                            {
                            string_literal346=(Token)match(input,71,FOLLOW_71_in_statement3398); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal346_tree = 
                            (Object)adaptor.create(string_literal346)
                            ;
                            adaptor.addChild(root_0, string_literal346_tree);
                            }

                            pushFollow(FOLLOW_statement_in_statement3400);
                            statement347=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement347.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // Java.g:464:9: 'for' '(' forControl ')' statement
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal348=(Token)match(input,77,FOLLOW_77_in_statement3412); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal348_tree = 
                    (Object)adaptor.create(string_literal348)
                    ;
                    adaptor.addChild(root_0, string_literal348_tree);
                    }

                    char_literal349=(Token)match(input,32,FOLLOW_32_in_statement3414); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal349_tree = 
                    (Object)adaptor.create(char_literal349)
                    ;
                    adaptor.addChild(root_0, char_literal349_tree);
                    }

                    pushFollow(FOLLOW_forControl_in_statement3416);
                    forControl350=forControl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forControl350.getTree());

                    char_literal351=(Token)match(input,33,FOLLOW_33_in_statement3418); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal351_tree = 
                    (Object)adaptor.create(char_literal351)
                    ;
                    adaptor.addChild(root_0, char_literal351_tree);
                    }

                    pushFollow(FOLLOW_statement_in_statement3420);
                    statement352=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement352.getTree());

                    }
                    break;
                case 5 :
                    // Java.g:465:9: 'while' parExpression statement
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal353=(Token)match(input,107,FOLLOW_107_in_statement3430); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal353_tree = 
                    (Object)adaptor.create(string_literal353)
                    ;
                    adaptor.addChild(root_0, string_literal353_tree);
                    }

                    pushFollow(FOLLOW_parExpression_in_statement3432);
                    parExpression354=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression354.getTree());

                    pushFollow(FOLLOW_statement_in_statement3434);
                    statement355=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement355.getTree());

                    }
                    break;
                case 6 :
                    // Java.g:466:9: 'do' statement 'while' parExpression ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal356=(Token)match(input,69,FOLLOW_69_in_statement3444); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal356_tree = 
                    (Object)adaptor.create(string_literal356)
                    ;
                    adaptor.addChild(root_0, string_literal356_tree);
                    }

                    pushFollow(FOLLOW_statement_in_statement3446);
                    statement357=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement357.getTree());

                    string_literal358=(Token)match(input,107,FOLLOW_107_in_statement3448); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal358_tree = 
                    (Object)adaptor.create(string_literal358)
                    ;
                    adaptor.addChild(root_0, string_literal358_tree);
                    }

                    pushFollow(FOLLOW_parExpression_in_statement3450);
                    parExpression359=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression359.getTree());

                    char_literal360=(Token)match(input,48,FOLLOW_48_in_statement3452); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal360_tree = 
                    (Object)adaptor.create(char_literal360)
                    ;
                    adaptor.addChild(root_0, char_literal360_tree);
                    }

                    }
                    break;
                case 7 :
                    // Java.g:467:9: 'try' block ( catches 'finally' block | catches | 'finally' block )
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal361=(Token)match(input,104,FOLLOW_104_in_statement3462); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal361_tree = 
                    (Object)adaptor.create(string_literal361)
                    ;
                    adaptor.addChild(root_0, string_literal361_tree);
                    }

                    pushFollow(FOLLOW_block_in_statement3464);
                    block362=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block362.getTree());

                    // Java.g:468:9: ( catches 'finally' block | catches | 'finally' block )
                    int alt110=3;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==64) ) {
                        int LA110_1 = input.LA(2);

                        if ( (synpred162_Java()) ) {
                            alt110=1;
                        }
                        else if ( (synpred163_Java()) ) {
                            alt110=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 110, 1, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA110_0==75) ) {
                        alt110=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 110, 0, input);

                        throw nvae;

                    }
                    switch (alt110) {
                        case 1 :
                            // Java.g:468:11: catches 'finally' block
                            {
                            pushFollow(FOLLOW_catches_in_statement3476);
                            catches363=catches();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, catches363.getTree());

                            string_literal364=(Token)match(input,75,FOLLOW_75_in_statement3478); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal364_tree = 
                            (Object)adaptor.create(string_literal364)
                            ;
                            adaptor.addChild(root_0, string_literal364_tree);
                            }

                            pushFollow(FOLLOW_block_in_statement3480);
                            block365=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, block365.getTree());

                            }
                            break;
                        case 2 :
                            // Java.g:469:11: catches
                            {
                            pushFollow(FOLLOW_catches_in_statement3492);
                            catches366=catches();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, catches366.getTree());

                            }
                            break;
                        case 3 :
                            // Java.g:470:13: 'finally' block
                            {
                            string_literal367=(Token)match(input,75,FOLLOW_75_in_statement3506); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal367_tree = 
                            (Object)adaptor.create(string_literal367)
                            ;
                            adaptor.addChild(root_0, string_literal367_tree);
                            }

                            pushFollow(FOLLOW_block_in_statement3508);
                            block368=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, block368.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 8 :
                    // Java.g:472:9: 'switch' parExpression '{' switchBlockStatementGroups '}'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal369=(Token)match(input,97,FOLLOW_97_in_statement3528); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal369_tree = 
                    (Object)adaptor.create(string_literal369)
                    ;
                    adaptor.addChild(root_0, string_literal369_tree);
                    }

                    pushFollow(FOLLOW_parExpression_in_statement3530);
                    parExpression370=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression370.getTree());

                    char_literal371=(Token)match(input,108,FOLLOW_108_in_statement3532); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal371_tree = 
                    (Object)adaptor.create(char_literal371)
                    ;
                    adaptor.addChild(root_0, char_literal371_tree);
                    }

                    pushFollow(FOLLOW_switchBlockStatementGroups_in_statement3534);
                    switchBlockStatementGroups372=switchBlockStatementGroups();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, switchBlockStatementGroups372.getTree());

                    char_literal373=(Token)match(input,112,FOLLOW_112_in_statement3536); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal373_tree = 
                    (Object)adaptor.create(char_literal373)
                    ;
                    adaptor.addChild(root_0, char_literal373_tree);
                    }

                    }
                    break;
                case 9 :
                    // Java.g:473:9: 'synchronized' parExpression block
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal374=(Token)match(input,98,FOLLOW_98_in_statement3546); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal374_tree = 
                    (Object)adaptor.create(string_literal374)
                    ;
                    adaptor.addChild(root_0, string_literal374_tree);
                    }

                    pushFollow(FOLLOW_parExpression_in_statement3548);
                    parExpression375=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression375.getTree());

                    pushFollow(FOLLOW_block_in_statement3550);
                    block376=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block376.getTree());

                    }
                    break;
                case 10 :
                    // Java.g:474:9: 'return' ( expression )? ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal377=(Token)match(input,92,FOLLOW_92_in_statement3560); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal377_tree = 
                    (Object)adaptor.create(string_literal377)
                    ;
                    adaptor.addChild(root_0, string_literal377_tree);
                    }

                    // Java.g:474:18: ( expression )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( ((LA111_0 >= CharacterLiteral && LA111_0 <= DecimalLiteral)||LA111_0==FloatingPointLiteral||(LA111_0 >= HexLiteral && LA111_0 <= Identifier)||(LA111_0 >= OctalLiteral && LA111_0 <= StringLiteral)||LA111_0==25||LA111_0==32||(LA111_0 >= 36 && LA111_0 <= 37)||(LA111_0 >= 40 && LA111_0 <= 41)||LA111_0==60||LA111_0==62||LA111_0==65||LA111_0==70||LA111_0==73||LA111_0==76||LA111_0==82||LA111_0==84||(LA111_0 >= 86 && LA111_0 <= 87)||LA111_0==93||LA111_0==96||LA111_0==99||LA111_0==103||LA111_0==105||LA111_0==113) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // Java.g:474:18: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement3562);
                            expression378=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression378.getTree());

                            }
                            break;

                    }


                    char_literal379=(Token)match(input,48,FOLLOW_48_in_statement3565); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal379_tree = 
                    (Object)adaptor.create(char_literal379)
                    ;
                    adaptor.addChild(root_0, char_literal379_tree);
                    }

                    }
                    break;
                case 11 :
                    // Java.g:475:9: 'throw' expression ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal380=(Token)match(input,100,FOLLOW_100_in_statement3575); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal380_tree = 
                    (Object)adaptor.create(string_literal380)
                    ;
                    adaptor.addChild(root_0, string_literal380_tree);
                    }

                    pushFollow(FOLLOW_expression_in_statement3577);
                    expression381=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression381.getTree());

                    char_literal382=(Token)match(input,48,FOLLOW_48_in_statement3579); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal382_tree = 
                    (Object)adaptor.create(char_literal382)
                    ;
                    adaptor.addChild(root_0, char_literal382_tree);
                    }

                    }
                    break;
                case 12 :
                    // Java.g:476:9: 'break' ( Identifier )? ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal383=(Token)match(input,61,FOLLOW_61_in_statement3589); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal383_tree = 
                    (Object)adaptor.create(string_literal383)
                    ;
                    adaptor.addChild(root_0, string_literal383_tree);
                    }

                    // Java.g:476:17: ( Identifier )?
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==Identifier) ) {
                        alt112=1;
                    }
                    switch (alt112) {
                        case 1 :
                            // Java.g:476:17: Identifier
                            {
                            Identifier384=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement3591); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            Identifier384_tree = 
                            (Object)adaptor.create(Identifier384)
                            ;
                            adaptor.addChild(root_0, Identifier384_tree);
                            }

                            }
                            break;

                    }


                    char_literal385=(Token)match(input,48,FOLLOW_48_in_statement3594); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal385_tree = 
                    (Object)adaptor.create(char_literal385)
                    ;
                    adaptor.addChild(root_0, char_literal385_tree);
                    }

                    }
                    break;
                case 13 :
                    // Java.g:477:9: 'continue' ( Identifier )? ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal386=(Token)match(input,67,FOLLOW_67_in_statement3604); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal386_tree = 
                    (Object)adaptor.create(string_literal386)
                    ;
                    adaptor.addChild(root_0, string_literal386_tree);
                    }

                    // Java.g:477:20: ( Identifier )?
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==Identifier) ) {
                        alt113=1;
                    }
                    switch (alt113) {
                        case 1 :
                            // Java.g:477:20: Identifier
                            {
                            Identifier387=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement3606); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            Identifier387_tree = 
                            (Object)adaptor.create(Identifier387)
                            ;
                            adaptor.addChild(root_0, Identifier387_tree);
                            }

                            }
                            break;

                    }


                    char_literal388=(Token)match(input,48,FOLLOW_48_in_statement3609); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal388_tree = 
                    (Object)adaptor.create(char_literal388)
                    ;
                    adaptor.addChild(root_0, char_literal388_tree);
                    }

                    }
                    break;
                case 14 :
                    // Java.g:478:9: ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal389=(Token)match(input,48,FOLLOW_48_in_statement3619); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal389_tree = 
                    (Object)adaptor.create(char_literal389)
                    ;
                    adaptor.addChild(root_0, char_literal389_tree);
                    }

                    }
                    break;
                case 15 :
                    // Java.g:479:9: statementExpression ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statementExpression_in_statement3630);
                    statementExpression390=statementExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementExpression390.getTree());

                    char_literal391=(Token)match(input,48,FOLLOW_48_in_statement3632); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal391_tree = 
                    (Object)adaptor.create(char_literal391)
                    ;
                    adaptor.addChild(root_0, char_literal391_tree);
                    }

                    }
                    break;
                case 16 :
                    // Java.g:480:9: Identifier ':' statement
                    {
                    root_0 = (Object)adaptor.nil();


                    Identifier392=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement3642); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier392_tree = 
                    (Object)adaptor.create(Identifier392)
                    ;
                    adaptor.addChild(root_0, Identifier392_tree);
                    }

                    char_literal393=(Token)match(input,47,FOLLOW_47_in_statement3644); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal393_tree = 
                    (Object)adaptor.create(char_literal393)
                    ;
                    adaptor.addChild(root_0, char_literal393_tree);
                    }

                    pushFollow(FOLLOW_statement_in_statement3646);
                    statement394=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement394.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class catches_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "catches"
    // Java.g:483:1: catches : catchClause ( catchClause )* ;
    public final JavaParser.catches_return catches() throws RecognitionException {
        JavaParser.catches_return retval = new JavaParser.catches_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.catchClause_return catchClause395 =null;

        JavaParser.catchClause_return catchClause396 =null;



        try {
            // Java.g:484:5: ( catchClause ( catchClause )* )
            // Java.g:484:9: catchClause ( catchClause )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_catchClause_in_catches3669);
            catchClause395=catchClause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, catchClause395.getTree());

            // Java.g:484:21: ( catchClause )*
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==64) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // Java.g:484:22: catchClause
            	    {
            	    pushFollow(FOLLOW_catchClause_in_catches3672);
            	    catchClause396=catchClause();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchClause396.getTree());

            	    }
            	    break;

            	default :
            	    break loop115;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "catches"


    public static class catchClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "catchClause"
    // Java.g:487:1: catchClause : 'catch' '(' formalParameter ')' block ;
    public final JavaParser.catchClause_return catchClause() throws RecognitionException {
        JavaParser.catchClause_return retval = new JavaParser.catchClause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal397=null;
        Token char_literal398=null;
        Token char_literal400=null;
        JavaParser.formalParameter_return formalParameter399 =null;

        JavaParser.block_return block401 =null;


        Object string_literal397_tree=null;
        Object char_literal398_tree=null;
        Object char_literal400_tree=null;

        try {
            // Java.g:488:5: ( 'catch' '(' formalParameter ')' block )
            // Java.g:488:9: 'catch' '(' formalParameter ')' block
            {
            root_0 = (Object)adaptor.nil();


            string_literal397=(Token)match(input,64,FOLLOW_64_in_catchClause3697); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal397_tree = 
            (Object)adaptor.create(string_literal397)
            ;
            adaptor.addChild(root_0, string_literal397_tree);
            }

            char_literal398=(Token)match(input,32,FOLLOW_32_in_catchClause3699); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal398_tree = 
            (Object)adaptor.create(char_literal398)
            ;
            adaptor.addChild(root_0, char_literal398_tree);
            }

            pushFollow(FOLLOW_formalParameter_in_catchClause3701);
            formalParameter399=formalParameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameter399.getTree());

            char_literal400=(Token)match(input,33,FOLLOW_33_in_catchClause3703); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal400_tree = 
            (Object)adaptor.create(char_literal400)
            ;
            adaptor.addChild(root_0, char_literal400_tree);
            }

            pushFollow(FOLLOW_block_in_catchClause3705);
            block401=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block401.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "catchClause"


    public static class formalParameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "formalParameter"
    // Java.g:491:1: formalParameter : variableModifiers type variableDeclaratorId ;
    public final JavaParser.formalParameter_return formalParameter() throws RecognitionException {
        JavaParser.formalParameter_return retval = new JavaParser.formalParameter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.variableModifiers_return variableModifiers402 =null;

        JavaParser.type_return type403 =null;

        JavaParser.variableDeclaratorId_return variableDeclaratorId404 =null;



        try {
            // Java.g:492:5: ( variableModifiers type variableDeclaratorId )
            // Java.g:492:9: variableModifiers type variableDeclaratorId
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_variableModifiers_in_formalParameter3724);
            variableModifiers402=variableModifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableModifiers402.getTree());

            pushFollow(FOLLOW_type_in_formalParameter3726);
            type403=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type403.getTree());

            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameter3728);
            variableDeclaratorId404=variableDeclaratorId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaratorId404.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "formalParameter"


    public static class switchBlockStatementGroups_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switchBlockStatementGroups"
    // Java.g:495:1: switchBlockStatementGroups : ( switchBlockStatementGroup )* ;
    public final JavaParser.switchBlockStatementGroups_return switchBlockStatementGroups() throws RecognitionException {
        JavaParser.switchBlockStatementGroups_return retval = new JavaParser.switchBlockStatementGroups_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.switchBlockStatementGroup_return switchBlockStatementGroup405 =null;



        try {
            // Java.g:496:5: ( ( switchBlockStatementGroup )* )
            // Java.g:496:9: ( switchBlockStatementGroup )*
            {
            root_0 = (Object)adaptor.nil();


            // Java.g:496:9: ( switchBlockStatementGroup )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==63||LA116_0==68) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // Java.g:496:10: switchBlockStatementGroup
            	    {
            	    pushFollow(FOLLOW_switchBlockStatementGroup_in_switchBlockStatementGroups3756);
            	    switchBlockStatementGroup405=switchBlockStatementGroup();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, switchBlockStatementGroup405.getTree());

            	    }
            	    break;

            	default :
            	    break loop116;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "switchBlockStatementGroups"


    public static class switchBlockStatementGroup_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switchBlockStatementGroup"
    // Java.g:503:1: switchBlockStatementGroup : ( switchLabel )+ ( blockStatement )* ;
    public final JavaParser.switchBlockStatementGroup_return switchBlockStatementGroup() throws RecognitionException {
        JavaParser.switchBlockStatementGroup_return retval = new JavaParser.switchBlockStatementGroup_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.switchLabel_return switchLabel406 =null;

        JavaParser.blockStatement_return blockStatement407 =null;



        try {
            // Java.g:504:5: ( ( switchLabel )+ ( blockStatement )* )
            // Java.g:504:9: ( switchLabel )+ ( blockStatement )*
            {
            root_0 = (Object)adaptor.nil();


            // Java.g:504:9: ( switchLabel )+
            int cnt117=0;
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==63) ) {
                    int LA117_2 = input.LA(2);

                    if ( (synpred178_Java()) ) {
                        alt117=1;
                    }


                }
                else if ( (LA117_0==68) ) {
                    int LA117_3 = input.LA(2);

                    if ( (synpred178_Java()) ) {
                        alt117=1;
                    }


                }


                switch (alt117) {
            	case 1 :
            	    // Java.g:504:9: switchLabel
            	    {
            	    pushFollow(FOLLOW_switchLabel_in_switchBlockStatementGroup3783);
            	    switchLabel406=switchLabel();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, switchLabel406.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt117 >= 1 ) break loop117;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(117, input);
                        throw eee;
                }
                cnt117++;
            } while (true);


            // Java.g:504:22: ( blockStatement )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==ASSERT||(LA118_0 >= CharacterLiteral && LA118_0 <= ENUM)||LA118_0==FloatingPointLiteral||(LA118_0 >= HexLiteral && LA118_0 <= Identifier)||(LA118_0 >= OctalLiteral && LA118_0 <= StringLiteral)||LA118_0==25||LA118_0==32||(LA118_0 >= 36 && LA118_0 <= 37)||(LA118_0 >= 40 && LA118_0 <= 41)||LA118_0==48||LA118_0==54||(LA118_0 >= 59 && LA118_0 <= 62)||(LA118_0 >= 65 && LA118_0 <= 67)||(LA118_0 >= 69 && LA118_0 <= 70)||(LA118_0 >= 73 && LA118_0 <= 74)||(LA118_0 >= 76 && LA118_0 <= 78)||(LA118_0 >= 82 && LA118_0 <= 84)||(LA118_0 >= 86 && LA118_0 <= 87)||(LA118_0 >= 89 && LA118_0 <= 100)||(LA118_0 >= 103 && LA118_0 <= 105)||(LA118_0 >= 107 && LA118_0 <= 108)||LA118_0==113) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // Java.g:504:22: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_switchBlockStatementGroup3786);
            	    blockStatement407=blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockStatement407.getTree());

            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "switchBlockStatementGroup"


    public static class switchLabel_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switchLabel"
    // Java.g:507:1: switchLabel : ( 'case' constantExpression ':' | 'case' enumConstantName ':' | 'default' ':' );
    public final JavaParser.switchLabel_return switchLabel() throws RecognitionException {
        JavaParser.switchLabel_return retval = new JavaParser.switchLabel_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal408=null;
        Token char_literal410=null;
        Token string_literal411=null;
        Token char_literal413=null;
        Token string_literal414=null;
        Token char_literal415=null;
        JavaParser.constantExpression_return constantExpression409 =null;

        JavaParser.enumConstantName_return enumConstantName412 =null;


        Object string_literal408_tree=null;
        Object char_literal410_tree=null;
        Object string_literal411_tree=null;
        Object char_literal413_tree=null;
        Object string_literal414_tree=null;
        Object char_literal415_tree=null;

        try {
            // Java.g:508:5: ( 'case' constantExpression ':' | 'case' enumConstantName ':' | 'default' ':' )
            int alt119=3;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==63) ) {
                int LA119_1 = input.LA(2);

                if ( ((LA119_1 >= CharacterLiteral && LA119_1 <= DecimalLiteral)||LA119_1==FloatingPointLiteral||LA119_1==HexLiteral||(LA119_1 >= OctalLiteral && LA119_1 <= StringLiteral)||LA119_1==25||LA119_1==32||(LA119_1 >= 36 && LA119_1 <= 37)||(LA119_1 >= 40 && LA119_1 <= 41)||LA119_1==60||LA119_1==62||LA119_1==65||LA119_1==70||LA119_1==73||LA119_1==76||LA119_1==82||LA119_1==84||(LA119_1 >= 86 && LA119_1 <= 87)||LA119_1==93||LA119_1==96||LA119_1==99||LA119_1==103||LA119_1==105||LA119_1==113) ) {
                    alt119=1;
                }
                else if ( (LA119_1==Identifier) ) {
                    int LA119_4 = input.LA(3);

                    if ( ((LA119_4 >= 26 && LA119_4 <= 32)||(LA119_4 >= 34 && LA119_4 <= 38)||(LA119_4 >= 40 && LA119_4 <= 43)||(LA119_4 >= 45 && LA119_4 <= 46)||(LA119_4 >= 49 && LA119_4 <= 53)||LA119_4==55||(LA119_4 >= 57 && LA119_4 <= 58)||LA119_4==81||(LA119_4 >= 109 && LA119_4 <= 111)) ) {
                        alt119=1;
                    }
                    else if ( (LA119_4==47) ) {
                        int LA119_5 = input.LA(4);

                        if ( (synpred180_Java()) ) {
                            alt119=1;
                        }
                        else if ( (synpred181_Java()) ) {
                            alt119=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 119, 5, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 119, 4, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 119, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA119_0==68) ) {
                alt119=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;

            }
            switch (alt119) {
                case 1 :
                    // Java.g:508:9: 'case' constantExpression ':'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal408=(Token)match(input,63,FOLLOW_63_in_switchLabel3810); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal408_tree = 
                    (Object)adaptor.create(string_literal408)
                    ;
                    adaptor.addChild(root_0, string_literal408_tree);
                    }

                    pushFollow(FOLLOW_constantExpression_in_switchLabel3812);
                    constantExpression409=constantExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constantExpression409.getTree());

                    char_literal410=(Token)match(input,47,FOLLOW_47_in_switchLabel3814); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal410_tree = 
                    (Object)adaptor.create(char_literal410)
                    ;
                    adaptor.addChild(root_0, char_literal410_tree);
                    }

                    }
                    break;
                case 2 :
                    // Java.g:509:9: 'case' enumConstantName ':'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal411=(Token)match(input,63,FOLLOW_63_in_switchLabel3824); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal411_tree = 
                    (Object)adaptor.create(string_literal411)
                    ;
                    adaptor.addChild(root_0, string_literal411_tree);
                    }

                    pushFollow(FOLLOW_enumConstantName_in_switchLabel3826);
                    enumConstantName412=enumConstantName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumConstantName412.getTree());

                    char_literal413=(Token)match(input,47,FOLLOW_47_in_switchLabel3828); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal413_tree = 
                    (Object)adaptor.create(char_literal413)
                    ;
                    adaptor.addChild(root_0, char_literal413_tree);
                    }

                    }
                    break;
                case 3 :
                    // Java.g:510:9: 'default' ':'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal414=(Token)match(input,68,FOLLOW_68_in_switchLabel3838); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal414_tree = 
                    (Object)adaptor.create(string_literal414)
                    ;
                    adaptor.addChild(root_0, string_literal414_tree);
                    }

                    char_literal415=(Token)match(input,47,FOLLOW_47_in_switchLabel3840); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal415_tree = 
                    (Object)adaptor.create(char_literal415)
                    ;
                    adaptor.addChild(root_0, char_literal415_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "switchLabel"


    public static class forControl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forControl"
    // Java.g:513:1: forControl options {k=3; } : ( enhancedForControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? );
    public final JavaParser.forControl_return forControl() throws RecognitionException {
        JavaParser.forControl_return retval = new JavaParser.forControl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal418=null;
        Token char_literal420=null;
        JavaParser.enhancedForControl_return enhancedForControl416 =null;

        JavaParser.forInit_return forInit417 =null;

        JavaParser.expression_return expression419 =null;

        JavaParser.forUpdate_return forUpdate421 =null;


        Object char_literal418_tree=null;
        Object char_literal420_tree=null;

        try {
            // Java.g:515:5: ( enhancedForControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? )
            int alt123=2;
            alt123 = dfa123.predict(input);
            switch (alt123) {
                case 1 :
                    // Java.g:515:9: enhancedForControl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enhancedForControl_in_forControl3871);
                    enhancedForControl416=enhancedForControl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enhancedForControl416.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:516:9: ( forInit )? ';' ( expression )? ';' ( forUpdate )?
                    {
                    root_0 = (Object)adaptor.nil();


                    // Java.g:516:9: ( forInit )?
                    int alt120=2;
                    int LA120_0 = input.LA(1);

                    if ( ((LA120_0 >= CharacterLiteral && LA120_0 <= DecimalLiteral)||LA120_0==FloatingPointLiteral||(LA120_0 >= HexLiteral && LA120_0 <= Identifier)||(LA120_0 >= OctalLiteral && LA120_0 <= StringLiteral)||LA120_0==25||LA120_0==32||(LA120_0 >= 36 && LA120_0 <= 37)||(LA120_0 >= 40 && LA120_0 <= 41)||LA120_0==54||LA120_0==60||LA120_0==62||LA120_0==65||LA120_0==70||(LA120_0 >= 73 && LA120_0 <= 74)||LA120_0==76||LA120_0==82||LA120_0==84||(LA120_0 >= 86 && LA120_0 <= 87)||LA120_0==93||LA120_0==96||LA120_0==99||LA120_0==103||LA120_0==105||LA120_0==113) ) {
                        alt120=1;
                    }
                    switch (alt120) {
                        case 1 :
                            // Java.g:516:9: forInit
                            {
                            pushFollow(FOLLOW_forInit_in_forControl3881);
                            forInit417=forInit();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, forInit417.getTree());

                            }
                            break;

                    }


                    char_literal418=(Token)match(input,48,FOLLOW_48_in_forControl3884); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal418_tree = 
                    (Object)adaptor.create(char_literal418)
                    ;
                    adaptor.addChild(root_0, char_literal418_tree);
                    }

                    // Java.g:516:22: ( expression )?
                    int alt121=2;
                    int LA121_0 = input.LA(1);

                    if ( ((LA121_0 >= CharacterLiteral && LA121_0 <= DecimalLiteral)||LA121_0==FloatingPointLiteral||(LA121_0 >= HexLiteral && LA121_0 <= Identifier)||(LA121_0 >= OctalLiteral && LA121_0 <= StringLiteral)||LA121_0==25||LA121_0==32||(LA121_0 >= 36 && LA121_0 <= 37)||(LA121_0 >= 40 && LA121_0 <= 41)||LA121_0==60||LA121_0==62||LA121_0==65||LA121_0==70||LA121_0==73||LA121_0==76||LA121_0==82||LA121_0==84||(LA121_0 >= 86 && LA121_0 <= 87)||LA121_0==93||LA121_0==96||LA121_0==99||LA121_0==103||LA121_0==105||LA121_0==113) ) {
                        alt121=1;
                    }
                    switch (alt121) {
                        case 1 :
                            // Java.g:516:22: expression
                            {
                            pushFollow(FOLLOW_expression_in_forControl3886);
                            expression419=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression419.getTree());

                            }
                            break;

                    }


                    char_literal420=(Token)match(input,48,FOLLOW_48_in_forControl3889); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal420_tree = 
                    (Object)adaptor.create(char_literal420)
                    ;
                    adaptor.addChild(root_0, char_literal420_tree);
                    }

                    // Java.g:516:38: ( forUpdate )?
                    int alt122=2;
                    int LA122_0 = input.LA(1);

                    if ( ((LA122_0 >= CharacterLiteral && LA122_0 <= DecimalLiteral)||LA122_0==FloatingPointLiteral||(LA122_0 >= HexLiteral && LA122_0 <= Identifier)||(LA122_0 >= OctalLiteral && LA122_0 <= StringLiteral)||LA122_0==25||LA122_0==32||(LA122_0 >= 36 && LA122_0 <= 37)||(LA122_0 >= 40 && LA122_0 <= 41)||LA122_0==60||LA122_0==62||LA122_0==65||LA122_0==70||LA122_0==73||LA122_0==76||LA122_0==82||LA122_0==84||(LA122_0 >= 86 && LA122_0 <= 87)||LA122_0==93||LA122_0==96||LA122_0==99||LA122_0==103||LA122_0==105||LA122_0==113) ) {
                        alt122=1;
                    }
                    switch (alt122) {
                        case 1 :
                            // Java.g:516:38: forUpdate
                            {
                            pushFollow(FOLLOW_forUpdate_in_forControl3891);
                            forUpdate421=forUpdate();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, forUpdate421.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "forControl"


    public static class forInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forInit"
    // Java.g:519:1: forInit : ( localVariableDeclaration | expressionList );
    public final JavaParser.forInit_return forInit() throws RecognitionException {
        JavaParser.forInit_return retval = new JavaParser.forInit_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.localVariableDeclaration_return localVariableDeclaration422 =null;

        JavaParser.expressionList_return expressionList423 =null;



        try {
            // Java.g:520:5: ( localVariableDeclaration | expressionList )
            int alt124=2;
            switch ( input.LA(1) ) {
            case 54:
            case 74:
                {
                alt124=1;
                }
                break;
            case Identifier:
                {
                int LA124_3 = input.LA(2);

                if ( (synpred186_Java()) ) {
                    alt124=1;
                }
                else if ( (true) ) {
                    alt124=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 124, 3, input);

                    throw nvae;

                }
                }
                break;
            case 60:
            case 62:
            case 65:
            case 70:
            case 76:
            case 82:
            case 84:
            case 93:
                {
                int LA124_4 = input.LA(2);

                if ( (synpred186_Java()) ) {
                    alt124=1;
                }
                else if ( (true) ) {
                    alt124=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 124, 4, input);

                    throw nvae;

                }
                }
                break;
            case CharacterLiteral:
            case DecimalLiteral:
            case FloatingPointLiteral:
            case HexLiteral:
            case OctalLiteral:
            case StringLiteral:
            case 25:
            case 32:
            case 36:
            case 37:
            case 40:
            case 41:
            case 73:
            case 86:
            case 87:
            case 96:
            case 99:
            case 103:
            case 105:
            case 113:
                {
                alt124=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;

            }

            switch (alt124) {
                case 1 :
                    // Java.g:520:9: localVariableDeclaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_localVariableDeclaration_in_forInit3911);
                    localVariableDeclaration422=localVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclaration422.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:521:9: expressionList
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expressionList_in_forInit3921);
                    expressionList423=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList423.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "forInit"


    public static class enhancedForControl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enhancedForControl"
    // Java.g:524:1: enhancedForControl : variableModifiers type Identifier ':' expression ;
    public final JavaParser.enhancedForControl_return enhancedForControl() throws RecognitionException {
        JavaParser.enhancedForControl_return retval = new JavaParser.enhancedForControl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Identifier426=null;
        Token char_literal427=null;
        JavaParser.variableModifiers_return variableModifiers424 =null;

        JavaParser.type_return type425 =null;

        JavaParser.expression_return expression428 =null;


        Object Identifier426_tree=null;
        Object char_literal427_tree=null;

        try {
            // Java.g:525:5: ( variableModifiers type Identifier ':' expression )
            // Java.g:525:9: variableModifiers type Identifier ':' expression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_variableModifiers_in_enhancedForControl3944);
            variableModifiers424=variableModifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableModifiers424.getTree());

            pushFollow(FOLLOW_type_in_enhancedForControl3946);
            type425=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type425.getTree());

            Identifier426=(Token)match(input,Identifier,FOLLOW_Identifier_in_enhancedForControl3948); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier426_tree = 
            (Object)adaptor.create(Identifier426)
            ;
            adaptor.addChild(root_0, Identifier426_tree);
            }

            char_literal427=(Token)match(input,47,FOLLOW_47_in_enhancedForControl3950); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal427_tree = 
            (Object)adaptor.create(char_literal427)
            ;
            adaptor.addChild(root_0, char_literal427_tree);
            }

            pushFollow(FOLLOW_expression_in_enhancedForControl3952);
            expression428=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression428.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "enhancedForControl"


    public static class forUpdate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forUpdate"
    // Java.g:528:1: forUpdate : expressionList ;
    public final JavaParser.forUpdate_return forUpdate() throws RecognitionException {
        JavaParser.forUpdate_return retval = new JavaParser.forUpdate_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.expressionList_return expressionList429 =null;



        try {
            // Java.g:529:5: ( expressionList )
            // Java.g:529:9: expressionList
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expressionList_in_forUpdate3971);
            expressionList429=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList429.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "forUpdate"


    public static class parExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parExpression"
    // Java.g:534:1: parExpression : '(' expression ')' ;
    public final JavaParser.parExpression_return parExpression() throws RecognitionException {
        JavaParser.parExpression_return retval = new JavaParser.parExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal430=null;
        Token char_literal432=null;
        JavaParser.expression_return expression431 =null;


        Object char_literal430_tree=null;
        Object char_literal432_tree=null;

        try {
            // Java.g:535:5: ( '(' expression ')' )
            // Java.g:535:9: '(' expression ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal430=(Token)match(input,32,FOLLOW_32_in_parExpression3992); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal430_tree = 
            (Object)adaptor.create(char_literal430)
            ;
            adaptor.addChild(root_0, char_literal430_tree);
            }

            pushFollow(FOLLOW_expression_in_parExpression3994);
            expression431=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression431.getTree());

            char_literal432=(Token)match(input,33,FOLLOW_33_in_parExpression3996); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal432_tree = 
            (Object)adaptor.create(char_literal432)
            ;
            adaptor.addChild(root_0, char_literal432_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parExpression"


    public static class expressionList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressionList"
    // Java.g:538:1: expressionList : expression ( ',' expression )* ;
    public final JavaParser.expressionList_return expressionList() throws RecognitionException {
        JavaParser.expressionList_return retval = new JavaParser.expressionList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal434=null;
        JavaParser.expression_return expression433 =null;

        JavaParser.expression_return expression435 =null;


        Object char_literal434_tree=null;

        try {
            // Java.g:539:5: ( expression ( ',' expression )* )
            // Java.g:539:9: expression ( ',' expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expression_in_expressionList4019);
            expression433=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression433.getTree());

            // Java.g:539:20: ( ',' expression )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==39) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // Java.g:539:21: ',' expression
            	    {
            	    char_literal434=(Token)match(input,39,FOLLOW_39_in_expressionList4022); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal434_tree = 
            	    (Object)adaptor.create(char_literal434)
            	    ;
            	    adaptor.addChild(root_0, char_literal434_tree);
            	    }

            	    pushFollow(FOLLOW_expression_in_expressionList4024);
            	    expression435=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression435.getTree());

            	    }
            	    break;

            	default :
            	    break loop125;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressionList"


    public static class statementExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statementExpression"
    // Java.g:542:1: statementExpression : expression ;
    public final JavaParser.statementExpression_return statementExpression() throws RecognitionException {
        JavaParser.statementExpression_return retval = new JavaParser.statementExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.expression_return expression436 =null;



        try {
            // Java.g:543:5: ( expression )
            // Java.g:543:9: expression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expression_in_statementExpression4045);
            expression436=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression436.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statementExpression"


    public static class constantExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constantExpression"
    // Java.g:546:1: constantExpression : expression ;
    public final JavaParser.constantExpression_return constantExpression() throws RecognitionException {
        JavaParser.constantExpression_return retval = new JavaParser.constantExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.expression_return expression437 =null;



        try {
            // Java.g:547:5: ( expression )
            // Java.g:547:9: expression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expression_in_constantExpression4068);
            expression437=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression437.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constantExpression"


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // Java.g:550:1: expression : conditionalExpression ( assignmentOperator expression )? ;
    public final JavaParser.expression_return expression() throws RecognitionException {
        JavaParser.expression_return retval = new JavaParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.conditionalExpression_return conditionalExpression438 =null;

        JavaParser.assignmentOperator_return assignmentOperator439 =null;

        JavaParser.expression_return expression440 =null;



        try {
            // Java.g:551:5: ( conditionalExpression ( assignmentOperator expression )? )
            // Java.g:551:9: conditionalExpression ( assignmentOperator expression )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_conditionalExpression_in_expression4091);
            conditionalExpression438=conditionalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression438.getTree());

            // Java.g:551:31: ( assignmentOperator expression )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==28||LA126_0==31||LA126_0==35||LA126_0==38||LA126_0==42||LA126_0==46||(LA126_0 >= 49 && LA126_0 <= 50)||LA126_0==52||LA126_0==58||LA126_0==110) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // Java.g:551:32: assignmentOperator expression
                    {
                    pushFollow(FOLLOW_assignmentOperator_in_expression4094);
                    assignmentOperator439=assignmentOperator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentOperator439.getTree());

                    pushFollow(FOLLOW_expression_in_expression4096);
                    expression440=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression440.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class assignmentOperator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignmentOperator"
    // Java.g:554:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | ( '<' '<' '=' )=>t1= '<' t2= '<' t3= '=' {...}?| ( '>' '>' '>' '=' )=>t1= '>' t2= '>' t3= '>' t4= '=' {...}?| ( '>' '>' '=' )=>t1= '>' t2= '>' t3= '=' {...}?);
    public final JavaParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
        JavaParser.assignmentOperator_return retval = new JavaParser.assignmentOperator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token t1=null;
        Token t2=null;
        Token t3=null;
        Token t4=null;
        Token char_literal441=null;
        Token string_literal442=null;
        Token string_literal443=null;
        Token string_literal444=null;
        Token string_literal445=null;
        Token string_literal446=null;
        Token string_literal447=null;
        Token string_literal448=null;
        Token string_literal449=null;

        Object t1_tree=null;
        Object t2_tree=null;
        Object t3_tree=null;
        Object t4_tree=null;
        Object char_literal441_tree=null;
        Object string_literal442_tree=null;
        Object string_literal443_tree=null;
        Object string_literal444_tree=null;
        Object string_literal445_tree=null;
        Object string_literal446_tree=null;
        Object string_literal447_tree=null;
        Object string_literal448_tree=null;
        Object string_literal449_tree=null;

        try {
            // Java.g:555:5: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | ( '<' '<' '=' )=>t1= '<' t2= '<' t3= '=' {...}?| ( '>' '>' '>' '=' )=>t1= '>' t2= '>' t3= '>' t4= '=' {...}?| ( '>' '>' '=' )=>t1= '>' t2= '>' t3= '=' {...}?)
            int alt127=12;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==50) ) {
                alt127=1;
            }
            else if ( (LA127_0==38) ) {
                alt127=2;
            }
            else if ( (LA127_0==42) ) {
                alt127=3;
            }
            else if ( (LA127_0==35) ) {
                alt127=4;
            }
            else if ( (LA127_0==46) ) {
                alt127=5;
            }
            else if ( (LA127_0==31) ) {
                alt127=6;
            }
            else if ( (LA127_0==110) ) {
                alt127=7;
            }
            else if ( (LA127_0==58) ) {
                alt127=8;
            }
            else if ( (LA127_0==28) ) {
                alt127=9;
            }
            else if ( (LA127_0==49) && (synpred198_Java())) {
                alt127=10;
            }
            else if ( (LA127_0==52) ) {
                int LA127_11 = input.LA(2);

                if ( (LA127_11==52) ) {
                    int LA127_12 = input.LA(3);

                    if ( (LA127_12==52) && (synpred199_Java())) {
                        alt127=11;
                    }
                    else if ( (LA127_12==50) && (synpred200_Java())) {
                        alt127=12;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 127, 12, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 127, 11, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;

            }
            switch (alt127) {
                case 1 :
                    // Java.g:555:9: '='
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal441=(Token)match(input,50,FOLLOW_50_in_assignmentOperator4121); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal441_tree = 
                    (Object)adaptor.create(char_literal441)
                    ;
                    adaptor.addChild(root_0, char_literal441_tree);
                    }

                    }
                    break;
                case 2 :
                    // Java.g:556:9: '+='
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal442=(Token)match(input,38,FOLLOW_38_in_assignmentOperator4131); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal442_tree = 
                    (Object)adaptor.create(string_literal442)
                    ;
                    adaptor.addChild(root_0, string_literal442_tree);
                    }

                    }
                    break;
                case 3 :
                    // Java.g:557:9: '-='
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal443=(Token)match(input,42,FOLLOW_42_in_assignmentOperator4141); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal443_tree = 
                    (Object)adaptor.create(string_literal443)
                    ;
                    adaptor.addChild(root_0, string_literal443_tree);
                    }

                    }
                    break;
                case 4 :
                    // Java.g:558:9: '*='
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal444=(Token)match(input,35,FOLLOW_35_in_assignmentOperator4151); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal444_tree = 
                    (Object)adaptor.create(string_literal444)
                    ;
                    adaptor.addChild(root_0, string_literal444_tree);
                    }

                    }
                    break;
                case 5 :
                    // Java.g:559:9: '/='
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal445=(Token)match(input,46,FOLLOW_46_in_assignmentOperator4161); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal445_tree = 
                    (Object)adaptor.create(string_literal445)
                    ;
                    adaptor.addChild(root_0, string_literal445_tree);
                    }

                    }
                    break;
                case 6 :
                    // Java.g:560:9: '&='
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal446=(Token)match(input,31,FOLLOW_31_in_assignmentOperator4171); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal446_tree = 
                    (Object)adaptor.create(string_literal446)
                    ;
                    adaptor.addChild(root_0, string_literal446_tree);
                    }

                    }
                    break;
                case 7 :
                    // Java.g:561:9: '|='
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal447=(Token)match(input,110,FOLLOW_110_in_assignmentOperator4181); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal447_tree = 
                    (Object)adaptor.create(string_literal447)
                    ;
                    adaptor.addChild(root_0, string_literal447_tree);
                    }

                    }
                    break;
                case 8 :
                    // Java.g:562:9: '^='
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal448=(Token)match(input,58,FOLLOW_58_in_assignmentOperator4191); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal448_tree = 
                    (Object)adaptor.create(string_literal448)
                    ;
                    adaptor.addChild(root_0, string_literal448_tree);
                    }

                    }
                    break;
                case 9 :
                    // Java.g:563:9: '%='
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal449=(Token)match(input,28,FOLLOW_28_in_assignmentOperator4201); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal449_tree = 
                    (Object)adaptor.create(string_literal449)
                    ;
                    adaptor.addChild(root_0, string_literal449_tree);
                    }

                    }
                    break;
                case 10 :
                    // Java.g:564:9: ( '<' '<' '=' )=>t1= '<' t2= '<' t3= '=' {...}?
                    {
                    root_0 = (Object)adaptor.nil();


                    t1=(Token)match(input,49,FOLLOW_49_in_assignmentOperator4222); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t1_tree = 
                    (Object)adaptor.create(t1)
                    ;
                    adaptor.addChild(root_0, t1_tree);
                    }

                    t2=(Token)match(input,49,FOLLOW_49_in_assignmentOperator4226); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t2_tree = 
                    (Object)adaptor.create(t2)
                    ;
                    adaptor.addChild(root_0, t2_tree);
                    }

                    t3=(Token)match(input,50,FOLLOW_50_in_assignmentOperator4230); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t3_tree = 
                    (Object)adaptor.create(t3)
                    ;
                    adaptor.addChild(root_0, t3_tree);
                    }

                    if ( !(( t1.getLine() == t2.getLine() &&
                              t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() && 
                              t2.getLine() == t3.getLine() && 
                              t2.getCharPositionInLine() + 1 == t3.getCharPositionInLine() )) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "assignmentOperator", " $t1.getLine() == $t2.getLine() &&\n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() && \n          $t2.getLine() == $t3.getLine() && \n          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() ");
                    }

                    }
                    break;
                case 11 :
                    // Java.g:569:9: ( '>' '>' '>' '=' )=>t1= '>' t2= '>' t3= '>' t4= '=' {...}?
                    {
                    root_0 = (Object)adaptor.nil();


                    t1=(Token)match(input,52,FOLLOW_52_in_assignmentOperator4264); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t1_tree = 
                    (Object)adaptor.create(t1)
                    ;
                    adaptor.addChild(root_0, t1_tree);
                    }

                    t2=(Token)match(input,52,FOLLOW_52_in_assignmentOperator4268); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t2_tree = 
                    (Object)adaptor.create(t2)
                    ;
                    adaptor.addChild(root_0, t2_tree);
                    }

                    t3=(Token)match(input,52,FOLLOW_52_in_assignmentOperator4272); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t3_tree = 
                    (Object)adaptor.create(t3)
                    ;
                    adaptor.addChild(root_0, t3_tree);
                    }

                    t4=(Token)match(input,50,FOLLOW_50_in_assignmentOperator4276); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t4_tree = 
                    (Object)adaptor.create(t4)
                    ;
                    adaptor.addChild(root_0, t4_tree);
                    }

                    if ( !(( t1.getLine() == t2.getLine() && 
                              t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() &&
                              t2.getLine() == t3.getLine() && 
                              t2.getCharPositionInLine() + 1 == t3.getCharPositionInLine() &&
                              t3.getLine() == t4.getLine() && 
                              t3.getCharPositionInLine() + 1 == t4.getCharPositionInLine() )) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "assignmentOperator", " $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() &&\n          $t2.getLine() == $t3.getLine() && \n          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() &&\n          $t3.getLine() == $t4.getLine() && \n          $t3.getCharPositionInLine() + 1 == $t4.getCharPositionInLine() ");
                    }

                    }
                    break;
                case 12 :
                    // Java.g:576:9: ( '>' '>' '=' )=>t1= '>' t2= '>' t3= '=' {...}?
                    {
                    root_0 = (Object)adaptor.nil();


                    t1=(Token)match(input,52,FOLLOW_52_in_assignmentOperator4307); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t1_tree = 
                    (Object)adaptor.create(t1)
                    ;
                    adaptor.addChild(root_0, t1_tree);
                    }

                    t2=(Token)match(input,52,FOLLOW_52_in_assignmentOperator4311); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t2_tree = 
                    (Object)adaptor.create(t2)
                    ;
                    adaptor.addChild(root_0, t2_tree);
                    }

                    t3=(Token)match(input,50,FOLLOW_50_in_assignmentOperator4315); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t3_tree = 
                    (Object)adaptor.create(t3)
                    ;
                    adaptor.addChild(root_0, t3_tree);
                    }

                    if ( !(( t1.getLine() == t2.getLine() && 
                              t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() && 
                              t2.getLine() == t3.getLine() && 
                              t2.getCharPositionInLine() + 1 == t3.getCharPositionInLine() )) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "assignmentOperator", " $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() && \n          $t2.getLine() == $t3.getLine() && \n          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() ");
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignmentOperator"


    public static class conditionalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionalExpression"
    // Java.g:583:1: conditionalExpression : conditionalOrExpression ( '?' conditionalExpression ':' conditionalExpression )? ;
    public final JavaParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        JavaParser.conditionalExpression_return retval = new JavaParser.conditionalExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal451=null;
        Token char_literal453=null;
        JavaParser.conditionalOrExpression_return conditionalOrExpression450 =null;

        JavaParser.conditionalExpression_return conditionalExpression452 =null;

        JavaParser.conditionalExpression_return conditionalExpression454 =null;


        Object char_literal451_tree=null;
        Object char_literal453_tree=null;

        try {
            // Java.g:584:5: ( conditionalOrExpression ( '?' conditionalExpression ':' conditionalExpression )? )
            // Java.g:584:9: conditionalOrExpression ( '?' conditionalExpression ':' conditionalExpression )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalExpression4344);
            conditionalOrExpression450=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalOrExpression450.getTree());

            // Java.g:584:33: ( '?' conditionalExpression ':' conditionalExpression )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==53) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // Java.g:584:35: '?' conditionalExpression ':' conditionalExpression
                    {
                    char_literal451=(Token)match(input,53,FOLLOW_53_in_conditionalExpression4348); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal451_tree = 
                    (Object)adaptor.create(char_literal451)
                    ;
                    adaptor.addChild(root_0, char_literal451_tree);
                    }

                    pushFollow(FOLLOW_conditionalExpression_in_conditionalExpression4350);
                    conditionalExpression452=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression452.getTree());

                    char_literal453=(Token)match(input,47,FOLLOW_47_in_conditionalExpression4352); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal453_tree = 
                    (Object)adaptor.create(char_literal453)
                    ;
                    adaptor.addChild(root_0, char_literal453_tree);
                    }

                    pushFollow(FOLLOW_conditionalExpression_in_conditionalExpression4354);
                    conditionalExpression454=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression454.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conditionalExpression"


    public static class conditionalOrExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionalOrExpression"
    // Java.g:587:1: conditionalOrExpression : conditionalAndExpression ( '||' conditionalAndExpression )* ;
    public final JavaParser.conditionalOrExpression_return conditionalOrExpression() throws RecognitionException {
        JavaParser.conditionalOrExpression_return retval = new JavaParser.conditionalOrExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal456=null;
        JavaParser.conditionalAndExpression_return conditionalAndExpression455 =null;

        JavaParser.conditionalAndExpression_return conditionalAndExpression457 =null;


        Object string_literal456_tree=null;

        try {
            // Java.g:588:5: ( conditionalAndExpression ( '||' conditionalAndExpression )* )
            // Java.g:588:9: conditionalAndExpression ( '||' conditionalAndExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression4376);
            conditionalAndExpression455=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression455.getTree());

            // Java.g:588:34: ( '||' conditionalAndExpression )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( (LA129_0==111) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // Java.g:588:36: '||' conditionalAndExpression
            	    {
            	    string_literal456=(Token)match(input,111,FOLLOW_111_in_conditionalOrExpression4380); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal456_tree = 
            	    (Object)adaptor.create(string_literal456)
            	    ;
            	    adaptor.addChild(root_0, string_literal456_tree);
            	    }

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression4382);
            	    conditionalAndExpression457=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression457.getTree());

            	    }
            	    break;

            	default :
            	    break loop129;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conditionalOrExpression"


    public static class conditionalAndExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionalAndExpression"
    // Java.g:591:1: conditionalAndExpression : inclusiveOrExpression ( '&&' inclusiveOrExpression )* ;
    public final JavaParser.conditionalAndExpression_return conditionalAndExpression() throws RecognitionException {
        JavaParser.conditionalAndExpression_return retval = new JavaParser.conditionalAndExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal459=null;
        JavaParser.inclusiveOrExpression_return inclusiveOrExpression458 =null;

        JavaParser.inclusiveOrExpression_return inclusiveOrExpression460 =null;


        Object string_literal459_tree=null;

        try {
            // Java.g:592:5: ( inclusiveOrExpression ( '&&' inclusiveOrExpression )* )
            // Java.g:592:9: inclusiveOrExpression ( '&&' inclusiveOrExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression4404);
            inclusiveOrExpression458=inclusiveOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inclusiveOrExpression458.getTree());

            // Java.g:592:31: ( '&&' inclusiveOrExpression )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( (LA130_0==29) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // Java.g:592:33: '&&' inclusiveOrExpression
            	    {
            	    string_literal459=(Token)match(input,29,FOLLOW_29_in_conditionalAndExpression4408); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal459_tree = 
            	    (Object)adaptor.create(string_literal459)
            	    ;
            	    adaptor.addChild(root_0, string_literal459_tree);
            	    }

            	    pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression4410);
            	    inclusiveOrExpression460=inclusiveOrExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inclusiveOrExpression460.getTree());

            	    }
            	    break;

            	default :
            	    break loop130;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conditionalAndExpression"


    public static class inclusiveOrExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inclusiveOrExpression"
    // Java.g:595:1: inclusiveOrExpression : exclusiveOrExpression ( '|' exclusiveOrExpression )* ;
    public final JavaParser.inclusiveOrExpression_return inclusiveOrExpression() throws RecognitionException {
        JavaParser.inclusiveOrExpression_return retval = new JavaParser.inclusiveOrExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal462=null;
        JavaParser.exclusiveOrExpression_return exclusiveOrExpression461 =null;

        JavaParser.exclusiveOrExpression_return exclusiveOrExpression463 =null;


        Object char_literal462_tree=null;

        try {
            // Java.g:596:5: ( exclusiveOrExpression ( '|' exclusiveOrExpression )* )
            // Java.g:596:9: exclusiveOrExpression ( '|' exclusiveOrExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression4432);
            exclusiveOrExpression461=exclusiveOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exclusiveOrExpression461.getTree());

            // Java.g:596:31: ( '|' exclusiveOrExpression )*
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==109) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // Java.g:596:33: '|' exclusiveOrExpression
            	    {
            	    char_literal462=(Token)match(input,109,FOLLOW_109_in_inclusiveOrExpression4436); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal462_tree = 
            	    (Object)adaptor.create(char_literal462)
            	    ;
            	    adaptor.addChild(root_0, char_literal462_tree);
            	    }

            	    pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression4438);
            	    exclusiveOrExpression463=exclusiveOrExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exclusiveOrExpression463.getTree());

            	    }
            	    break;

            	default :
            	    break loop131;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "inclusiveOrExpression"


    public static class exclusiveOrExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exclusiveOrExpression"
    // Java.g:599:1: exclusiveOrExpression : andExpression ( '^' andExpression )* ;
    public final JavaParser.exclusiveOrExpression_return exclusiveOrExpression() throws RecognitionException {
        JavaParser.exclusiveOrExpression_return retval = new JavaParser.exclusiveOrExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal465=null;
        JavaParser.andExpression_return andExpression464 =null;

        JavaParser.andExpression_return andExpression466 =null;


        Object char_literal465_tree=null;

        try {
            // Java.g:600:5: ( andExpression ( '^' andExpression )* )
            // Java.g:600:9: andExpression ( '^' andExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression4460);
            andExpression464=andExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression464.getTree());

            // Java.g:600:23: ( '^' andExpression )*
            loop132:
            do {
                int alt132=2;
                int LA132_0 = input.LA(1);

                if ( (LA132_0==57) ) {
                    alt132=1;
                }


                switch (alt132) {
            	case 1 :
            	    // Java.g:600:25: '^' andExpression
            	    {
            	    char_literal465=(Token)match(input,57,FOLLOW_57_in_exclusiveOrExpression4464); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal465_tree = 
            	    (Object)adaptor.create(char_literal465)
            	    ;
            	    adaptor.addChild(root_0, char_literal465_tree);
            	    }

            	    pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression4466);
            	    andExpression466=andExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression466.getTree());

            	    }
            	    break;

            	default :
            	    break loop132;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exclusiveOrExpression"


    public static class andExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "andExpression"
    // Java.g:603:1: andExpression : equalityExpression ( '&' equalityExpression )* ;
    public final JavaParser.andExpression_return andExpression() throws RecognitionException {
        JavaParser.andExpression_return retval = new JavaParser.andExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal468=null;
        JavaParser.equalityExpression_return equalityExpression467 =null;

        JavaParser.equalityExpression_return equalityExpression469 =null;


        Object char_literal468_tree=null;

        try {
            // Java.g:604:5: ( equalityExpression ( '&' equalityExpression )* )
            // Java.g:604:9: equalityExpression ( '&' equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_equalityExpression_in_andExpression4488);
            equalityExpression467=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression467.getTree());

            // Java.g:604:28: ( '&' equalityExpression )*
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==30) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // Java.g:604:30: '&' equalityExpression
            	    {
            	    char_literal468=(Token)match(input,30,FOLLOW_30_in_andExpression4492); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal468_tree = 
            	    (Object)adaptor.create(char_literal468)
            	    ;
            	    adaptor.addChild(root_0, char_literal468_tree);
            	    }

            	    pushFollow(FOLLOW_equalityExpression_in_andExpression4494);
            	    equalityExpression469=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression469.getTree());

            	    }
            	    break;

            	default :
            	    break loop133;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "andExpression"


    public static class equalityExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equalityExpression"
    // Java.g:607:1: equalityExpression : instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* ;
    public final JavaParser.equalityExpression_return equalityExpression() throws RecognitionException {
        JavaParser.equalityExpression_return retval = new JavaParser.equalityExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set471=null;
        JavaParser.instanceOfExpression_return instanceOfExpression470 =null;

        JavaParser.instanceOfExpression_return instanceOfExpression472 =null;


        Object set471_tree=null;

        try {
            // Java.g:608:5: ( instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* )
            // Java.g:608:9: instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression4516);
            instanceOfExpression470=instanceOfExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOfExpression470.getTree());

            // Java.g:608:30: ( ( '==' | '!=' ) instanceOfExpression )*
            loop134:
            do {
                int alt134=2;
                int LA134_0 = input.LA(1);

                if ( (LA134_0==26||LA134_0==51) ) {
                    alt134=1;
                }


                switch (alt134) {
            	case 1 :
            	    // Java.g:608:32: ( '==' | '!=' ) instanceOfExpression
            	    {
            	    set471=(Token)input.LT(1);

            	    if ( input.LA(1)==26||input.LA(1)==51 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set471)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression4528);
            	    instanceOfExpression472=instanceOfExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOfExpression472.getTree());

            	    }
            	    break;

            	default :
            	    break loop134;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "equalityExpression"


    public static class instanceOfExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instanceOfExpression"
    // Java.g:611:1: instanceOfExpression : relationalExpression ( 'instanceof' type )? ;
    public final JavaParser.instanceOfExpression_return instanceOfExpression() throws RecognitionException {
        JavaParser.instanceOfExpression_return retval = new JavaParser.instanceOfExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal474=null;
        JavaParser.relationalExpression_return relationalExpression473 =null;

        JavaParser.type_return type475 =null;


        Object string_literal474_tree=null;

        try {
            // Java.g:612:5: ( relationalExpression ( 'instanceof' type )? )
            // Java.g:612:9: relationalExpression ( 'instanceof' type )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_relationalExpression_in_instanceOfExpression4550);
            relationalExpression473=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression473.getTree());

            // Java.g:612:30: ( 'instanceof' type )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==81) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // Java.g:612:31: 'instanceof' type
                    {
                    string_literal474=(Token)match(input,81,FOLLOW_81_in_instanceOfExpression4553); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal474_tree = 
                    (Object)adaptor.create(string_literal474)
                    ;
                    adaptor.addChild(root_0, string_literal474_tree);
                    }

                    pushFollow(FOLLOW_type_in_instanceOfExpression4555);
                    type475=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type475.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instanceOfExpression"


    public static class relationalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relationalExpression"
    // Java.g:615:1: relationalExpression : shiftExpression ( relationalOp shiftExpression )* ;
    public final JavaParser.relationalExpression_return relationalExpression() throws RecognitionException {
        JavaParser.relationalExpression_return retval = new JavaParser.relationalExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.shiftExpression_return shiftExpression476 =null;

        JavaParser.relationalOp_return relationalOp477 =null;

        JavaParser.shiftExpression_return shiftExpression478 =null;



        try {
            // Java.g:616:5: ( shiftExpression ( relationalOp shiftExpression )* )
            // Java.g:616:9: shiftExpression ( relationalOp shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_shiftExpression_in_relationalExpression4576);
            shiftExpression476=shiftExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpression476.getTree());

            // Java.g:616:25: ( relationalOp shiftExpression )*
            loop136:
            do {
                int alt136=2;
                int LA136_0 = input.LA(1);

                if ( (LA136_0==49) ) {
                    int LA136_2 = input.LA(2);

                    if ( ((LA136_2 >= CharacterLiteral && LA136_2 <= DecimalLiteral)||LA136_2==FloatingPointLiteral||(LA136_2 >= HexLiteral && LA136_2 <= Identifier)||(LA136_2 >= OctalLiteral && LA136_2 <= StringLiteral)||LA136_2==25||LA136_2==32||(LA136_2 >= 36 && LA136_2 <= 37)||(LA136_2 >= 40 && LA136_2 <= 41)||LA136_2==50||LA136_2==60||LA136_2==62||LA136_2==65||LA136_2==70||LA136_2==73||LA136_2==76||LA136_2==82||LA136_2==84||(LA136_2 >= 86 && LA136_2 <= 87)||LA136_2==93||LA136_2==96||LA136_2==99||LA136_2==103||LA136_2==105||LA136_2==113) ) {
                        alt136=1;
                    }


                }
                else if ( (LA136_0==52) ) {
                    int LA136_3 = input.LA(2);

                    if ( ((LA136_3 >= CharacterLiteral && LA136_3 <= DecimalLiteral)||LA136_3==FloatingPointLiteral||(LA136_3 >= HexLiteral && LA136_3 <= Identifier)||(LA136_3 >= OctalLiteral && LA136_3 <= StringLiteral)||LA136_3==25||LA136_3==32||(LA136_3 >= 36 && LA136_3 <= 37)||(LA136_3 >= 40 && LA136_3 <= 41)||LA136_3==50||LA136_3==60||LA136_3==62||LA136_3==65||LA136_3==70||LA136_3==73||LA136_3==76||LA136_3==82||LA136_3==84||(LA136_3 >= 86 && LA136_3 <= 87)||LA136_3==93||LA136_3==96||LA136_3==99||LA136_3==103||LA136_3==105||LA136_3==113) ) {
                        alt136=1;
                    }


                }


                switch (alt136) {
            	case 1 :
            	    // Java.g:616:27: relationalOp shiftExpression
            	    {
            	    pushFollow(FOLLOW_relationalOp_in_relationalExpression4580);
            	    relationalOp477=relationalOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalOp477.getTree());

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpression4582);
            	    shiftExpression478=shiftExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpression478.getTree());

            	    }
            	    break;

            	default :
            	    break loop136;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relationalExpression"


    public static class relationalOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relationalOp"
    // Java.g:619:1: relationalOp : ( ( '<' '=' )=>t1= '<' t2= '=' {...}?| ( '>' '=' )=>t1= '>' t2= '=' {...}?| '<' | '>' );
    public final JavaParser.relationalOp_return relationalOp() throws RecognitionException {
        JavaParser.relationalOp_return retval = new JavaParser.relationalOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token t1=null;
        Token t2=null;
        Token char_literal479=null;
        Token char_literal480=null;

        Object t1_tree=null;
        Object t2_tree=null;
        Object char_literal479_tree=null;
        Object char_literal480_tree=null;

        try {
            // Java.g:620:5: ( ( '<' '=' )=>t1= '<' t2= '=' {...}?| ( '>' '=' )=>t1= '>' t2= '=' {...}?| '<' | '>' )
            int alt137=4;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==49) ) {
                int LA137_1 = input.LA(2);

                if ( (LA137_1==50) && (synpred211_Java())) {
                    alt137=1;
                }
                else if ( ((LA137_1 >= CharacterLiteral && LA137_1 <= DecimalLiteral)||LA137_1==FloatingPointLiteral||(LA137_1 >= HexLiteral && LA137_1 <= Identifier)||(LA137_1 >= OctalLiteral && LA137_1 <= StringLiteral)||LA137_1==25||LA137_1==32||(LA137_1 >= 36 && LA137_1 <= 37)||(LA137_1 >= 40 && LA137_1 <= 41)||LA137_1==60||LA137_1==62||LA137_1==65||LA137_1==70||LA137_1==73||LA137_1==76||LA137_1==82||LA137_1==84||(LA137_1 >= 86 && LA137_1 <= 87)||LA137_1==93||LA137_1==96||LA137_1==99||LA137_1==103||LA137_1==105||LA137_1==113) ) {
                    alt137=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 137, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA137_0==52) ) {
                int LA137_2 = input.LA(2);

                if ( (LA137_2==50) && (synpred212_Java())) {
                    alt137=2;
                }
                else if ( ((LA137_2 >= CharacterLiteral && LA137_2 <= DecimalLiteral)||LA137_2==FloatingPointLiteral||(LA137_2 >= HexLiteral && LA137_2 <= Identifier)||(LA137_2 >= OctalLiteral && LA137_2 <= StringLiteral)||LA137_2==25||LA137_2==32||(LA137_2 >= 36 && LA137_2 <= 37)||(LA137_2 >= 40 && LA137_2 <= 41)||LA137_2==60||LA137_2==62||LA137_2==65||LA137_2==70||LA137_2==73||LA137_2==76||LA137_2==82||LA137_2==84||(LA137_2 >= 86 && LA137_2 <= 87)||LA137_2==93||LA137_2==96||LA137_2==99||LA137_2==103||LA137_2==105||LA137_2==113) ) {
                    alt137=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 137, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;

            }
            switch (alt137) {
                case 1 :
                    // Java.g:620:9: ( '<' '=' )=>t1= '<' t2= '=' {...}?
                    {
                    root_0 = (Object)adaptor.nil();


                    t1=(Token)match(input,49,FOLLOW_49_in_relationalOp4617); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t1_tree = 
                    (Object)adaptor.create(t1)
                    ;
                    adaptor.addChild(root_0, t1_tree);
                    }

                    t2=(Token)match(input,50,FOLLOW_50_in_relationalOp4621); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t2_tree = 
                    (Object)adaptor.create(t2)
                    ;
                    adaptor.addChild(root_0, t2_tree);
                    }

                    if ( !(( t1.getLine() == t2.getLine() && 
                              t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() )) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "relationalOp", " $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() ");
                    }

                    }
                    break;
                case 2 :
                    // Java.g:623:9: ( '>' '=' )=>t1= '>' t2= '=' {...}?
                    {
                    root_0 = (Object)adaptor.nil();


                    t1=(Token)match(input,52,FOLLOW_52_in_relationalOp4651); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t1_tree = 
                    (Object)adaptor.create(t1)
                    ;
                    adaptor.addChild(root_0, t1_tree);
                    }

                    t2=(Token)match(input,50,FOLLOW_50_in_relationalOp4655); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t2_tree = 
                    (Object)adaptor.create(t2)
                    ;
                    adaptor.addChild(root_0, t2_tree);
                    }

                    if ( !(( t1.getLine() == t2.getLine() && 
                              t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() )) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "relationalOp", " $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() ");
                    }

                    }
                    break;
                case 3 :
                    // Java.g:626:9: '<'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal479=(Token)match(input,49,FOLLOW_49_in_relationalOp4676); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal479_tree = 
                    (Object)adaptor.create(char_literal479)
                    ;
                    adaptor.addChild(root_0, char_literal479_tree);
                    }

                    }
                    break;
                case 4 :
                    // Java.g:627:9: '>'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal480=(Token)match(input,52,FOLLOW_52_in_relationalOp4687); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal480_tree = 
                    (Object)adaptor.create(char_literal480)
                    ;
                    adaptor.addChild(root_0, char_literal480_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relationalOp"


    public static class shiftExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "shiftExpression"
    // Java.g:630:1: shiftExpression : additiveExpression ( shiftOp additiveExpression )* ;
    public final JavaParser.shiftExpression_return shiftExpression() throws RecognitionException {
        JavaParser.shiftExpression_return retval = new JavaParser.shiftExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.additiveExpression_return additiveExpression481 =null;

        JavaParser.shiftOp_return shiftOp482 =null;

        JavaParser.additiveExpression_return additiveExpression483 =null;



        try {
            // Java.g:631:5: ( additiveExpression ( shiftOp additiveExpression )* )
            // Java.g:631:9: additiveExpression ( shiftOp additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_additiveExpression_in_shiftExpression4707);
            additiveExpression481=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression481.getTree());

            // Java.g:631:28: ( shiftOp additiveExpression )*
            loop138:
            do {
                int alt138=2;
                int LA138_0 = input.LA(1);

                if ( (LA138_0==49) ) {
                    int LA138_1 = input.LA(2);

                    if ( (LA138_1==49) ) {
                        int LA138_4 = input.LA(3);

                        if ( ((LA138_4 >= CharacterLiteral && LA138_4 <= DecimalLiteral)||LA138_4==FloatingPointLiteral||(LA138_4 >= HexLiteral && LA138_4 <= Identifier)||(LA138_4 >= OctalLiteral && LA138_4 <= StringLiteral)||LA138_4==25||LA138_4==32||(LA138_4 >= 36 && LA138_4 <= 37)||(LA138_4 >= 40 && LA138_4 <= 41)||LA138_4==60||LA138_4==62||LA138_4==65||LA138_4==70||LA138_4==73||LA138_4==76||LA138_4==82||LA138_4==84||(LA138_4 >= 86 && LA138_4 <= 87)||LA138_4==93||LA138_4==96||LA138_4==99||LA138_4==103||LA138_4==105||LA138_4==113) ) {
                            alt138=1;
                        }


                    }


                }
                else if ( (LA138_0==52) ) {
                    int LA138_2 = input.LA(2);

                    if ( (LA138_2==52) ) {
                        int LA138_5 = input.LA(3);

                        if ( (LA138_5==52) ) {
                            int LA138_7 = input.LA(4);

                            if ( ((LA138_7 >= CharacterLiteral && LA138_7 <= DecimalLiteral)||LA138_7==FloatingPointLiteral||(LA138_7 >= HexLiteral && LA138_7 <= Identifier)||(LA138_7 >= OctalLiteral && LA138_7 <= StringLiteral)||LA138_7==25||LA138_7==32||(LA138_7 >= 36 && LA138_7 <= 37)||(LA138_7 >= 40 && LA138_7 <= 41)||LA138_7==60||LA138_7==62||LA138_7==65||LA138_7==70||LA138_7==73||LA138_7==76||LA138_7==82||LA138_7==84||(LA138_7 >= 86 && LA138_7 <= 87)||LA138_7==93||LA138_7==96||LA138_7==99||LA138_7==103||LA138_7==105||LA138_7==113) ) {
                                alt138=1;
                            }


                        }
                        else if ( ((LA138_5 >= CharacterLiteral && LA138_5 <= DecimalLiteral)||LA138_5==FloatingPointLiteral||(LA138_5 >= HexLiteral && LA138_5 <= Identifier)||(LA138_5 >= OctalLiteral && LA138_5 <= StringLiteral)||LA138_5==25||LA138_5==32||(LA138_5 >= 36 && LA138_5 <= 37)||(LA138_5 >= 40 && LA138_5 <= 41)||LA138_5==60||LA138_5==62||LA138_5==65||LA138_5==70||LA138_5==73||LA138_5==76||LA138_5==82||LA138_5==84||(LA138_5 >= 86 && LA138_5 <= 87)||LA138_5==93||LA138_5==96||LA138_5==99||LA138_5==103||LA138_5==105||LA138_5==113) ) {
                            alt138=1;
                        }


                    }


                }


                switch (alt138) {
            	case 1 :
            	    // Java.g:631:30: shiftOp additiveExpression
            	    {
            	    pushFollow(FOLLOW_shiftOp_in_shiftExpression4711);
            	    shiftOp482=shiftOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftOp482.getTree());

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression4713);
            	    additiveExpression483=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression483.getTree());

            	    }
            	    break;

            	default :
            	    break loop138;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "shiftExpression"


    public static class shiftOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "shiftOp"
    // Java.g:634:1: shiftOp : ( ( '<' '<' )=>t1= '<' t2= '<' {...}?| ( '>' '>' '>' )=>t1= '>' t2= '>' t3= '>' {...}?| ( '>' '>' )=>t1= '>' t2= '>' {...}?);
    public final JavaParser.shiftOp_return shiftOp() throws RecognitionException {
        JavaParser.shiftOp_return retval = new JavaParser.shiftOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token t1=null;
        Token t2=null;
        Token t3=null;

        Object t1_tree=null;
        Object t2_tree=null;
        Object t3_tree=null;

        try {
            // Java.g:635:5: ( ( '<' '<' )=>t1= '<' t2= '<' {...}?| ( '>' '>' '>' )=>t1= '>' t2= '>' t3= '>' {...}?| ( '>' '>' )=>t1= '>' t2= '>' {...}?)
            int alt139=3;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==49) && (synpred215_Java())) {
                alt139=1;
            }
            else if ( (LA139_0==52) ) {
                int LA139_2 = input.LA(2);

                if ( (LA139_2==52) ) {
                    int LA139_3 = input.LA(3);

                    if ( (LA139_3==52) && (synpred216_Java())) {
                        alt139=2;
                    }
                    else if ( (LA139_3==36) && (synpred217_Java())) {
                        alt139=3;
                    }
                    else if ( (LA139_3==40) && (synpred217_Java())) {
                        alt139=3;
                    }
                    else if ( (LA139_3==37) && (synpred217_Java())) {
                        alt139=3;
                    }
                    else if ( (LA139_3==41) && (synpred217_Java())) {
                        alt139=3;
                    }
                    else if ( (LA139_3==113) && (synpred217_Java())) {
                        alt139=3;
                    }
                    else if ( (LA139_3==25) && (synpred217_Java())) {
                        alt139=3;
                    }
                    else if ( (LA139_3==32) && (synpred217_Java())) {
                        alt139=3;
                    }
                    else if ( (LA139_3==99) && (synpred217_Java())) {
                        alt139=3;
                    }
                    else if ( (LA139_3==96) && (synpred217_Java())) {
                        alt139=3;
                    }
                    else if ( (LA139_3==DecimalLiteral||LA139_3==HexLiteral||LA139_3==OctalLiteral) && (synpred217_Java())) {
                        alt139=3;
                    }
                    else if ( (LA139_3==FloatingPointLiteral) && (synpred217_Java())) {
                        alt139=3;
                    }
                    else if ( (LA139_3==CharacterLiteral) && (synpred217_Java())) {
                        alt139=3;
                    }
                    else if ( (LA139_3==StringLiteral) && (synpred217_Java())) {
                        alt139=3;
                    }
                    else if ( (LA139_3==73||LA139_3==103) && (synpred217_Java())) {
                        alt139=3;
                    }
                    else if ( (LA139_3==87) && (synpred217_Java())) {
                        alt139=3;
                    }
                    else if ( (LA139_3==86) && (synpred217_Java())) {
                        alt139=3;
                    }
                    else if ( (LA139_3==Identifier) && (synpred217_Java())) {
                        alt139=3;
                    }
                    else if ( (LA139_3==60||LA139_3==62||LA139_3==65||LA139_3==70||LA139_3==76||LA139_3==82||LA139_3==84||LA139_3==93) && (synpred217_Java())) {
                        alt139=3;
                    }
                    else if ( (LA139_3==105) && (synpred217_Java())) {
                        alt139=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 139, 3, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 139, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 0, input);

                throw nvae;

            }
            switch (alt139) {
                case 1 :
                    // Java.g:635:9: ( '<' '<' )=>t1= '<' t2= '<' {...}?
                    {
                    root_0 = (Object)adaptor.nil();


                    t1=(Token)match(input,49,FOLLOW_49_in_shiftOp4744); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t1_tree = 
                    (Object)adaptor.create(t1)
                    ;
                    adaptor.addChild(root_0, t1_tree);
                    }

                    t2=(Token)match(input,49,FOLLOW_49_in_shiftOp4748); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t2_tree = 
                    (Object)adaptor.create(t2)
                    ;
                    adaptor.addChild(root_0, t2_tree);
                    }

                    if ( !(( t1.getLine() == t2.getLine() && 
                              t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() )) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "shiftOp", " $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() ");
                    }

                    }
                    break;
                case 2 :
                    // Java.g:638:9: ( '>' '>' '>' )=>t1= '>' t2= '>' t3= '>' {...}?
                    {
                    root_0 = (Object)adaptor.nil();


                    t1=(Token)match(input,52,FOLLOW_52_in_shiftOp4780); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t1_tree = 
                    (Object)adaptor.create(t1)
                    ;
                    adaptor.addChild(root_0, t1_tree);
                    }

                    t2=(Token)match(input,52,FOLLOW_52_in_shiftOp4784); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t2_tree = 
                    (Object)adaptor.create(t2)
                    ;
                    adaptor.addChild(root_0, t2_tree);
                    }

                    t3=(Token)match(input,52,FOLLOW_52_in_shiftOp4788); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t3_tree = 
                    (Object)adaptor.create(t3)
                    ;
                    adaptor.addChild(root_0, t3_tree);
                    }

                    if ( !(( t1.getLine() == t2.getLine() && 
                              t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() &&
                              t2.getLine() == t3.getLine() && 
                              t2.getCharPositionInLine() + 1 == t3.getCharPositionInLine() )) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "shiftOp", " $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() &&\n          $t2.getLine() == $t3.getLine() && \n          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() ");
                    }

                    }
                    break;
                case 3 :
                    // Java.g:643:9: ( '>' '>' )=>t1= '>' t2= '>' {...}?
                    {
                    root_0 = (Object)adaptor.nil();


                    t1=(Token)match(input,52,FOLLOW_52_in_shiftOp4818); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t1_tree = 
                    (Object)adaptor.create(t1)
                    ;
                    adaptor.addChild(root_0, t1_tree);
                    }

                    t2=(Token)match(input,52,FOLLOW_52_in_shiftOp4822); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t2_tree = 
                    (Object)adaptor.create(t2)
                    ;
                    adaptor.addChild(root_0, t2_tree);
                    }

                    if ( !(( t1.getLine() == t2.getLine() && 
                              t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() )) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "shiftOp", " $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() ");
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "shiftOp"


    public static class additiveExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "additiveExpression"
    // Java.g:649:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
    public final JavaParser.additiveExpression_return additiveExpression() throws RecognitionException {
        JavaParser.additiveExpression_return retval = new JavaParser.additiveExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set485=null;
        JavaParser.multiplicativeExpression_return multiplicativeExpression484 =null;

        JavaParser.multiplicativeExpression_return multiplicativeExpression486 =null;


        Object set485_tree=null;

        try {
            // Java.g:650:5: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
            // Java.g:650:9: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4852);
            multiplicativeExpression484=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression484.getTree());

            // Java.g:650:34: ( ( '+' | '-' ) multiplicativeExpression )*
            loop140:
            do {
                int alt140=2;
                int LA140_0 = input.LA(1);

                if ( (LA140_0==36||LA140_0==40) ) {
                    alt140=1;
                }


                switch (alt140) {
            	case 1 :
            	    // Java.g:650:36: ( '+' | '-' ) multiplicativeExpression
            	    {
            	    set485=(Token)input.LT(1);

            	    if ( input.LA(1)==36||input.LA(1)==40 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set485)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4864);
            	    multiplicativeExpression486=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression486.getTree());

            	    }
            	    break;

            	default :
            	    break loop140;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "additiveExpression"


    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiplicativeExpression"
    // Java.g:653:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
    public final JavaParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        JavaParser.multiplicativeExpression_return retval = new JavaParser.multiplicativeExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set488=null;
        JavaParser.unaryExpression_return unaryExpression487 =null;

        JavaParser.unaryExpression_return unaryExpression489 =null;


        Object set488_tree=null;

        try {
            // Java.g:654:5: ( unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
            // Java.g:654:9: unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4886);
            unaryExpression487=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression487.getTree());

            // Java.g:654:25: ( ( '*' | '/' | '%' ) unaryExpression )*
            loop141:
            do {
                int alt141=2;
                int LA141_0 = input.LA(1);

                if ( (LA141_0==27||LA141_0==34||LA141_0==45) ) {
                    alt141=1;
                }


                switch (alt141) {
            	case 1 :
            	    // Java.g:654:27: ( '*' | '/' | '%' ) unaryExpression
            	    {
            	    set488=(Token)input.LT(1);

            	    if ( input.LA(1)==27||input.LA(1)==34||input.LA(1)==45 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set488)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4904);
            	    unaryExpression489=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression489.getTree());

            	    }
            	    break;

            	default :
            	    break loop141;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"


    public static class unaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unaryExpression"
    // Java.g:657:1: unaryExpression : ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus );
    public final JavaParser.unaryExpression_return unaryExpression() throws RecognitionException {
        JavaParser.unaryExpression_return retval = new JavaParser.unaryExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal490=null;
        Token char_literal492=null;
        Token string_literal494=null;
        Token string_literal496=null;
        JavaParser.unaryExpression_return unaryExpression491 =null;

        JavaParser.unaryExpression_return unaryExpression493 =null;

        JavaParser.unaryExpression_return unaryExpression495 =null;

        JavaParser.unaryExpression_return unaryExpression497 =null;

        JavaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus498 =null;


        Object char_literal490_tree=null;
        Object char_literal492_tree=null;
        Object string_literal494_tree=null;
        Object string_literal496_tree=null;

        try {
            // Java.g:658:5: ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus )
            int alt142=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt142=1;
                }
                break;
            case 40:
                {
                alt142=2;
                }
                break;
            case 37:
                {
                alt142=3;
                }
                break;
            case 41:
                {
                alt142=4;
                }
                break;
            case CharacterLiteral:
            case DecimalLiteral:
            case FloatingPointLiteral:
            case HexLiteral:
            case Identifier:
            case OctalLiteral:
            case StringLiteral:
            case 25:
            case 32:
            case 60:
            case 62:
            case 65:
            case 70:
            case 73:
            case 76:
            case 82:
            case 84:
            case 86:
            case 87:
            case 93:
            case 96:
            case 99:
            case 103:
            case 105:
            case 113:
                {
                alt142=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;

            }

            switch (alt142) {
                case 1 :
                    // Java.g:658:9: '+' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal490=(Token)match(input,36,FOLLOW_36_in_unaryExpression4930); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal490_tree = 
                    (Object)adaptor.create(char_literal490)
                    ;
                    adaptor.addChild(root_0, char_literal490_tree);
                    }

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression4932);
                    unaryExpression491=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression491.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:659:9: '-' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal492=(Token)match(input,40,FOLLOW_40_in_unaryExpression4942); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal492_tree = 
                    (Object)adaptor.create(char_literal492)
                    ;
                    adaptor.addChild(root_0, char_literal492_tree);
                    }

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression4944);
                    unaryExpression493=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression493.getTree());

                    }
                    break;
                case 3 :
                    // Java.g:660:9: '++' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal494=(Token)match(input,37,FOLLOW_37_in_unaryExpression4954); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal494_tree = 
                    (Object)adaptor.create(string_literal494)
                    ;
                    adaptor.addChild(root_0, string_literal494_tree);
                    }

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression4956);
                    unaryExpression495=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression495.getTree());

                    }
                    break;
                case 4 :
                    // Java.g:661:9: '--' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal496=(Token)match(input,41,FOLLOW_41_in_unaryExpression4966); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal496_tree = 
                    (Object)adaptor.create(string_literal496)
                    ;
                    adaptor.addChild(root_0, string_literal496_tree);
                    }

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression4968);
                    unaryExpression497=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression497.getTree());

                    }
                    break;
                case 5 :
                    // Java.g:662:9: unaryExpressionNotPlusMinus
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression4978);
                    unaryExpressionNotPlusMinus498=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus498.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unaryExpression"


    public static class unaryExpressionNotPlusMinus_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unaryExpressionNotPlusMinus"
    // Java.g:665:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );
    public final JavaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus() throws RecognitionException {
        JavaParser.unaryExpressionNotPlusMinus_return retval = new JavaParser.unaryExpressionNotPlusMinus_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal499=null;
        Token char_literal501=null;
        Token set506=null;
        JavaParser.unaryExpression_return unaryExpression500 =null;

        JavaParser.unaryExpression_return unaryExpression502 =null;

        JavaParser.castExpression_return castExpression503 =null;

        JavaParser.primary_return primary504 =null;

        JavaParser.selector_return selector505 =null;


        Object char_literal499_tree=null;
        Object char_literal501_tree=null;
        Object set506_tree=null;

        try {
            // Java.g:666:5: ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? )
            int alt145=4;
            switch ( input.LA(1) ) {
            case 113:
                {
                alt145=1;
                }
                break;
            case 25:
                {
                alt145=2;
                }
                break;
            case 32:
                {
                int LA145_3 = input.LA(2);

                if ( (synpred229_Java()) ) {
                    alt145=3;
                }
                else if ( (true) ) {
                    alt145=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 145, 3, input);

                    throw nvae;

                }
                }
                break;
            case CharacterLiteral:
            case DecimalLiteral:
            case FloatingPointLiteral:
            case HexLiteral:
            case Identifier:
            case OctalLiteral:
            case StringLiteral:
            case 60:
            case 62:
            case 65:
            case 70:
            case 73:
            case 76:
            case 82:
            case 84:
            case 86:
            case 87:
            case 93:
            case 96:
            case 99:
            case 103:
            case 105:
                {
                alt145=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                throw nvae;

            }

            switch (alt145) {
                case 1 :
                    // Java.g:666:9: '~' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal499=(Token)match(input,113,FOLLOW_113_in_unaryExpressionNotPlusMinus4997); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal499_tree = 
                    (Object)adaptor.create(char_literal499)
                    ;
                    adaptor.addChild(root_0, char_literal499_tree);
                    }

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus4999);
                    unaryExpression500=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression500.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:667:9: '!' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal501=(Token)match(input,25,FOLLOW_25_in_unaryExpressionNotPlusMinus5009); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal501_tree = 
                    (Object)adaptor.create(char_literal501)
                    ;
                    adaptor.addChild(root_0, char_literal501_tree);
                    }

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus5011);
                    unaryExpression502=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression502.getTree());

                    }
                    break;
                case 3 :
                    // Java.g:668:9: castExpression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_castExpression_in_unaryExpressionNotPlusMinus5021);
                    castExpression503=castExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, castExpression503.getTree());

                    }
                    break;
                case 4 :
                    // Java.g:669:9: primary ( selector )* ( '++' | '--' )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus5031);
                    primary504=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary504.getTree());

                    // Java.g:669:17: ( selector )*
                    loop143:
                    do {
                        int alt143=2;
                        int LA143_0 = input.LA(1);

                        if ( (LA143_0==43||LA143_0==55) ) {
                            alt143=1;
                        }


                        switch (alt143) {
                    	case 1 :
                    	    // Java.g:669:17: selector
                    	    {
                    	    pushFollow(FOLLOW_selector_in_unaryExpressionNotPlusMinus5033);
                    	    selector505=selector();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, selector505.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop143;
                        }
                    } while (true);


                    // Java.g:669:27: ( '++' | '--' )?
                    int alt144=2;
                    int LA144_0 = input.LA(1);

                    if ( (LA144_0==37||LA144_0==41) ) {
                        alt144=1;
                    }
                    switch (alt144) {
                        case 1 :
                            // Java.g:
                            {
                            set506=(Token)input.LT(1);

                            if ( input.LA(1)==37||input.LA(1)==41 ) {
                                input.consume();
                                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                                (Object)adaptor.create(set506)
                                );
                                state.errorRecovery=false;
                                state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unaryExpressionNotPlusMinus"


    public static class castExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "castExpression"
    // Java.g:672:1: castExpression : ( '(' primitiveType ')' unaryExpression | '(' ( type | expression ) ')' unaryExpressionNotPlusMinus );
    public final JavaParser.castExpression_return castExpression() throws RecognitionException {
        JavaParser.castExpression_return retval = new JavaParser.castExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal507=null;
        Token char_literal509=null;
        Token char_literal511=null;
        Token char_literal514=null;
        JavaParser.primitiveType_return primitiveType508 =null;

        JavaParser.unaryExpression_return unaryExpression510 =null;

        JavaParser.type_return type512 =null;

        JavaParser.expression_return expression513 =null;

        JavaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus515 =null;


        Object char_literal507_tree=null;
        Object char_literal509_tree=null;
        Object char_literal511_tree=null;
        Object char_literal514_tree=null;

        try {
            // Java.g:673:5: ( '(' primitiveType ')' unaryExpression | '(' ( type | expression ) ')' unaryExpressionNotPlusMinus )
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==32) ) {
                int LA147_1 = input.LA(2);

                if ( (synpred233_Java()) ) {
                    alt147=1;
                }
                else if ( (true) ) {
                    alt147=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 147, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 147, 0, input);

                throw nvae;

            }
            switch (alt147) {
                case 1 :
                    // Java.g:673:8: '(' primitiveType ')' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal507=(Token)match(input,32,FOLLOW_32_in_castExpression5059); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal507_tree = 
                    (Object)adaptor.create(char_literal507)
                    ;
                    adaptor.addChild(root_0, char_literal507_tree);
                    }

                    pushFollow(FOLLOW_primitiveType_in_castExpression5061);
                    primitiveType508=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType508.getTree());

                    char_literal509=(Token)match(input,33,FOLLOW_33_in_castExpression5063); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal509_tree = 
                    (Object)adaptor.create(char_literal509)
                    ;
                    adaptor.addChild(root_0, char_literal509_tree);
                    }

                    pushFollow(FOLLOW_unaryExpression_in_castExpression5065);
                    unaryExpression510=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression510.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:674:8: '(' ( type | expression ) ')' unaryExpressionNotPlusMinus
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal511=(Token)match(input,32,FOLLOW_32_in_castExpression5074); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal511_tree = 
                    (Object)adaptor.create(char_literal511)
                    ;
                    adaptor.addChild(root_0, char_literal511_tree);
                    }

                    // Java.g:674:12: ( type | expression )
                    int alt146=2;
                    alt146 = dfa146.predict(input);
                    switch (alt146) {
                        case 1 :
                            // Java.g:674:13: type
                            {
                            pushFollow(FOLLOW_type_in_castExpression5077);
                            type512=type();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, type512.getTree());

                            }
                            break;
                        case 2 :
                            // Java.g:674:20: expression
                            {
                            pushFollow(FOLLOW_expression_in_castExpression5081);
                            expression513=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression513.getTree());

                            }
                            break;

                    }


                    char_literal514=(Token)match(input,33,FOLLOW_33_in_castExpression5084); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal514_tree = 
                    (Object)adaptor.create(char_literal514)
                    ;
                    adaptor.addChild(root_0, char_literal514_tree);
                    }

                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_castExpression5086);
                    unaryExpressionNotPlusMinus515=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus515.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "castExpression"


    public static class primary_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary"
    // Java.g:677:1: primary : ( parExpression | 'this' ( '.' Identifier )* ( identifierSuffix )? | 'super' superSuffix | literal | 'new' creator | Identifier ( '.' Identifier )* ( identifierSuffix )? | primitiveType ( '[' ']' )* '.' 'class' | 'void' '.' 'class' );
    public final JavaParser.primary_return primary() throws RecognitionException {
        JavaParser.primary_return retval = new JavaParser.primary_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal517=null;
        Token char_literal518=null;
        Token Identifier519=null;
        Token string_literal521=null;
        Token string_literal524=null;
        Token Identifier526=null;
        Token char_literal527=null;
        Token Identifier528=null;
        Token char_literal531=null;
        Token char_literal532=null;
        Token char_literal533=null;
        Token string_literal534=null;
        Token string_literal535=null;
        Token char_literal536=null;
        Token string_literal537=null;
        JavaParser.parExpression_return parExpression516 =null;

        JavaParser.identifierSuffix_return identifierSuffix520 =null;

        JavaParser.superSuffix_return superSuffix522 =null;

        JavaParser.literal_return literal523 =null;

        JavaParser.creator_return creator525 =null;

        JavaParser.identifierSuffix_return identifierSuffix529 =null;

        JavaParser.primitiveType_return primitiveType530 =null;


        Object string_literal517_tree=null;
        Object char_literal518_tree=null;
        Object Identifier519_tree=null;
        Object string_literal521_tree=null;
        Object string_literal524_tree=null;
        Object Identifier526_tree=null;
        Object char_literal527_tree=null;
        Object Identifier528_tree=null;
        Object char_literal531_tree=null;
        Object char_literal532_tree=null;
        Object char_literal533_tree=null;
        Object string_literal534_tree=null;
        Object string_literal535_tree=null;
        Object char_literal536_tree=null;
        Object string_literal537_tree=null;

        try {
            // Java.g:678:5: ( parExpression | 'this' ( '.' Identifier )* ( identifierSuffix )? | 'super' superSuffix | literal | 'new' creator | Identifier ( '.' Identifier )* ( identifierSuffix )? | primitiveType ( '[' ']' )* '.' 'class' | 'void' '.' 'class' )
            int alt153=8;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt153=1;
                }
                break;
            case 99:
                {
                alt153=2;
                }
                break;
            case 96:
                {
                alt153=3;
                }
                break;
            case CharacterLiteral:
            case DecimalLiteral:
            case FloatingPointLiteral:
            case HexLiteral:
            case OctalLiteral:
            case StringLiteral:
            case 73:
            case 87:
            case 103:
                {
                alt153=4;
                }
                break;
            case 86:
                {
                alt153=5;
                }
                break;
            case Identifier:
                {
                alt153=6;
                }
                break;
            case 60:
            case 62:
            case 65:
            case 70:
            case 76:
            case 82:
            case 84:
            case 93:
                {
                alt153=7;
                }
                break;
            case 105:
                {
                alt153=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 153, 0, input);

                throw nvae;

            }

            switch (alt153) {
                case 1 :
                    // Java.g:678:9: parExpression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_parExpression_in_primary5105);
                    parExpression516=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression516.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:679:9: 'this' ( '.' Identifier )* ( identifierSuffix )?
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal517=(Token)match(input,99,FOLLOW_99_in_primary5115); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal517_tree = 
                    (Object)adaptor.create(string_literal517)
                    ;
                    adaptor.addChild(root_0, string_literal517_tree);
                    }

                    // Java.g:679:16: ( '.' Identifier )*
                    loop148:
                    do {
                        int alt148=2;
                        int LA148_0 = input.LA(1);

                        if ( (LA148_0==43) ) {
                            int LA148_2 = input.LA(2);

                            if ( (LA148_2==Identifier) ) {
                                int LA148_3 = input.LA(3);

                                if ( (synpred236_Java()) ) {
                                    alt148=1;
                                }


                            }


                        }


                        switch (alt148) {
                    	case 1 :
                    	    // Java.g:679:17: '.' Identifier
                    	    {
                    	    char_literal518=(Token)match(input,43,FOLLOW_43_in_primary5118); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal518_tree = 
                    	    (Object)adaptor.create(char_literal518)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal518_tree);
                    	    }

                    	    Identifier519=(Token)match(input,Identifier,FOLLOW_Identifier_in_primary5120); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    Identifier519_tree = 
                    	    (Object)adaptor.create(Identifier519)
                    	    ;
                    	    adaptor.addChild(root_0, Identifier519_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop148;
                        }
                    } while (true);


                    // Java.g:679:34: ( identifierSuffix )?
                    int alt149=2;
                    switch ( input.LA(1) ) {
                        case 55:
                            {
                            int LA149_1 = input.LA(2);

                            if ( (synpred237_Java()) ) {
                                alt149=1;
                            }
                            }
                            break;
                        case 32:
                            {
                            alt149=1;
                            }
                            break;
                        case 43:
                            {
                            int LA149_3 = input.LA(2);

                            if ( (synpred237_Java()) ) {
                                alt149=1;
                            }
                            }
                            break;
                    }

                    switch (alt149) {
                        case 1 :
                            // Java.g:679:34: identifierSuffix
                            {
                            pushFollow(FOLLOW_identifierSuffix_in_primary5124);
                            identifierSuffix520=identifierSuffix();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierSuffix520.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // Java.g:680:9: 'super' superSuffix
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal521=(Token)match(input,96,FOLLOW_96_in_primary5135); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal521_tree = 
                    (Object)adaptor.create(string_literal521)
                    ;
                    adaptor.addChild(root_0, string_literal521_tree);
                    }

                    pushFollow(FOLLOW_superSuffix_in_primary5137);
                    superSuffix522=superSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, superSuffix522.getTree());

                    }
                    break;
                case 4 :
                    // Java.g:681:9: literal
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_literal_in_primary5147);
                    literal523=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal523.getTree());

                    }
                    break;
                case 5 :
                    // Java.g:682:9: 'new' creator
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal524=(Token)match(input,86,FOLLOW_86_in_primary5157); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal524_tree = 
                    (Object)adaptor.create(string_literal524)
                    ;
                    adaptor.addChild(root_0, string_literal524_tree);
                    }

                    pushFollow(FOLLOW_creator_in_primary5159);
                    creator525=creator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, creator525.getTree());

                    }
                    break;
                case 6 :
                    // Java.g:683:9: Identifier ( '.' Identifier )* ( identifierSuffix )?
                    {
                    root_0 = (Object)adaptor.nil();


                    Identifier526=(Token)match(input,Identifier,FOLLOW_Identifier_in_primary5169); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier526_tree = 
                    (Object)adaptor.create(Identifier526)
                    ;
                    adaptor.addChild(root_0, Identifier526_tree);
                    }

                    // Java.g:683:20: ( '.' Identifier )*
                    loop150:
                    do {
                        int alt150=2;
                        int LA150_0 = input.LA(1);

                        if ( (LA150_0==43) ) {
                            int LA150_2 = input.LA(2);

                            if ( (LA150_2==Identifier) ) {
                                int LA150_3 = input.LA(3);

                                if ( (synpred242_Java()) ) {
                                    alt150=1;
                                }


                            }


                        }


                        switch (alt150) {
                    	case 1 :
                    	    // Java.g:683:21: '.' Identifier
                    	    {
                    	    char_literal527=(Token)match(input,43,FOLLOW_43_in_primary5172); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal527_tree = 
                    	    (Object)adaptor.create(char_literal527)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal527_tree);
                    	    }

                    	    Identifier528=(Token)match(input,Identifier,FOLLOW_Identifier_in_primary5174); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    Identifier528_tree = 
                    	    (Object)adaptor.create(Identifier528)
                    	    ;
                    	    adaptor.addChild(root_0, Identifier528_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop150;
                        }
                    } while (true);


                    // Java.g:683:38: ( identifierSuffix )?
                    int alt151=2;
                    switch ( input.LA(1) ) {
                        case 55:
                            {
                            int LA151_1 = input.LA(2);

                            if ( (synpred243_Java()) ) {
                                alt151=1;
                            }
                            }
                            break;
                        case 32:
                            {
                            alt151=1;
                            }
                            break;
                        case 43:
                            {
                            int LA151_3 = input.LA(2);

                            if ( (synpred243_Java()) ) {
                                alt151=1;
                            }
                            }
                            break;
                    }

                    switch (alt151) {
                        case 1 :
                            // Java.g:683:38: identifierSuffix
                            {
                            pushFollow(FOLLOW_identifierSuffix_in_primary5178);
                            identifierSuffix529=identifierSuffix();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierSuffix529.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // Java.g:684:9: primitiveType ( '[' ']' )* '.' 'class'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_primitiveType_in_primary5189);
                    primitiveType530=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType530.getTree());

                    // Java.g:684:23: ( '[' ']' )*
                    loop152:
                    do {
                        int alt152=2;
                        int LA152_0 = input.LA(1);

                        if ( (LA152_0==55) ) {
                            alt152=1;
                        }


                        switch (alt152) {
                    	case 1 :
                    	    // Java.g:684:24: '[' ']'
                    	    {
                    	    char_literal531=(Token)match(input,55,FOLLOW_55_in_primary5192); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal531_tree = 
                    	    (Object)adaptor.create(char_literal531)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal531_tree);
                    	    }

                    	    char_literal532=(Token)match(input,56,FOLLOW_56_in_primary5194); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal532_tree = 
                    	    (Object)adaptor.create(char_literal532)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal532_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop152;
                        }
                    } while (true);


                    char_literal533=(Token)match(input,43,FOLLOW_43_in_primary5198); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal533_tree = 
                    (Object)adaptor.create(char_literal533)
                    ;
                    adaptor.addChild(root_0, char_literal533_tree);
                    }

                    string_literal534=(Token)match(input,66,FOLLOW_66_in_primary5200); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal534_tree = 
                    (Object)adaptor.create(string_literal534)
                    ;
                    adaptor.addChild(root_0, string_literal534_tree);
                    }

                    }
                    break;
                case 8 :
                    // Java.g:685:9: 'void' '.' 'class'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal535=(Token)match(input,105,FOLLOW_105_in_primary5210); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal535_tree = 
                    (Object)adaptor.create(string_literal535)
                    ;
                    adaptor.addChild(root_0, string_literal535_tree);
                    }

                    char_literal536=(Token)match(input,43,FOLLOW_43_in_primary5212); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal536_tree = 
                    (Object)adaptor.create(char_literal536)
                    ;
                    adaptor.addChild(root_0, char_literal536_tree);
                    }

                    string_literal537=(Token)match(input,66,FOLLOW_66_in_primary5214); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal537_tree = 
                    (Object)adaptor.create(string_literal537)
                    ;
                    adaptor.addChild(root_0, string_literal537_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "primary"


    public static class identifierSuffix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifierSuffix"
    // Java.g:688:1: identifierSuffix : ( ( '[' ']' )+ '.' 'class' | ( '[' expression ']' )+ | arguments | '.' 'class' | '.' explicitGenericInvocation | '.' 'this' | '.' 'super' arguments | '.' 'new' innerCreator );
    public final JavaParser.identifierSuffix_return identifierSuffix() throws RecognitionException {
        JavaParser.identifierSuffix_return retval = new JavaParser.identifierSuffix_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal538=null;
        Token char_literal539=null;
        Token char_literal540=null;
        Token string_literal541=null;
        Token char_literal542=null;
        Token char_literal544=null;
        Token char_literal546=null;
        Token string_literal547=null;
        Token char_literal548=null;
        Token char_literal550=null;
        Token string_literal551=null;
        Token char_literal552=null;
        Token string_literal553=null;
        Token char_literal555=null;
        Token string_literal556=null;
        JavaParser.expression_return expression543 =null;

        JavaParser.arguments_return arguments545 =null;

        JavaParser.explicitGenericInvocation_return explicitGenericInvocation549 =null;

        JavaParser.arguments_return arguments554 =null;

        JavaParser.innerCreator_return innerCreator557 =null;


        Object char_literal538_tree=null;
        Object char_literal539_tree=null;
        Object char_literal540_tree=null;
        Object string_literal541_tree=null;
        Object char_literal542_tree=null;
        Object char_literal544_tree=null;
        Object char_literal546_tree=null;
        Object string_literal547_tree=null;
        Object char_literal548_tree=null;
        Object char_literal550_tree=null;
        Object string_literal551_tree=null;
        Object char_literal552_tree=null;
        Object string_literal553_tree=null;
        Object char_literal555_tree=null;
        Object string_literal556_tree=null;

        try {
            // Java.g:689:5: ( ( '[' ']' )+ '.' 'class' | ( '[' expression ']' )+ | arguments | '.' 'class' | '.' explicitGenericInvocation | '.' 'this' | '.' 'super' arguments | '.' 'new' innerCreator )
            int alt156=8;
            switch ( input.LA(1) ) {
            case 55:
                {
                int LA156_1 = input.LA(2);

                if ( (LA156_1==56) ) {
                    alt156=1;
                }
                else if ( ((LA156_1 >= CharacterLiteral && LA156_1 <= DecimalLiteral)||LA156_1==FloatingPointLiteral||(LA156_1 >= HexLiteral && LA156_1 <= Identifier)||(LA156_1 >= OctalLiteral && LA156_1 <= StringLiteral)||LA156_1==25||LA156_1==32||(LA156_1 >= 36 && LA156_1 <= 37)||(LA156_1 >= 40 && LA156_1 <= 41)||LA156_1==60||LA156_1==62||LA156_1==65||LA156_1==70||LA156_1==73||LA156_1==76||LA156_1==82||LA156_1==84||(LA156_1 >= 86 && LA156_1 <= 87)||LA156_1==93||LA156_1==96||LA156_1==99||LA156_1==103||LA156_1==105||LA156_1==113) ) {
                    alt156=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 156, 1, input);

                    throw nvae;

                }
                }
                break;
            case 32:
                {
                alt156=3;
                }
                break;
            case 43:
                {
                switch ( input.LA(2) ) {
                case 66:
                    {
                    alt156=4;
                    }
                    break;
                case 99:
                    {
                    alt156=6;
                    }
                    break;
                case 96:
                    {
                    alt156=7;
                    }
                    break;
                case 86:
                    {
                    alt156=8;
                    }
                    break;
                case 49:
                    {
                    alt156=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 156, 3, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 156, 0, input);

                throw nvae;

            }

            switch (alt156) {
                case 1 :
                    // Java.g:689:9: ( '[' ']' )+ '.' 'class'
                    {
                    root_0 = (Object)adaptor.nil();


                    // Java.g:689:9: ( '[' ']' )+
                    int cnt154=0;
                    loop154:
                    do {
                        int alt154=2;
                        int LA154_0 = input.LA(1);

                        if ( (LA154_0==55) ) {
                            alt154=1;
                        }


                        switch (alt154) {
                    	case 1 :
                    	    // Java.g:689:10: '[' ']'
                    	    {
                    	    char_literal538=(Token)match(input,55,FOLLOW_55_in_identifierSuffix5234); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal538_tree = 
                    	    (Object)adaptor.create(char_literal538)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal538_tree);
                    	    }

                    	    char_literal539=(Token)match(input,56,FOLLOW_56_in_identifierSuffix5236); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal539_tree = 
                    	    (Object)adaptor.create(char_literal539)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal539_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt154 >= 1 ) break loop154;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(154, input);
                                throw eee;
                        }
                        cnt154++;
                    } while (true);


                    char_literal540=(Token)match(input,43,FOLLOW_43_in_identifierSuffix5240); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal540_tree = 
                    (Object)adaptor.create(char_literal540)
                    ;
                    adaptor.addChild(root_0, char_literal540_tree);
                    }

                    string_literal541=(Token)match(input,66,FOLLOW_66_in_identifierSuffix5242); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal541_tree = 
                    (Object)adaptor.create(string_literal541)
                    ;
                    adaptor.addChild(root_0, string_literal541_tree);
                    }

                    }
                    break;
                case 2 :
                    // Java.g:690:9: ( '[' expression ']' )+
                    {
                    root_0 = (Object)adaptor.nil();


                    // Java.g:690:9: ( '[' expression ']' )+
                    int cnt155=0;
                    loop155:
                    do {
                        int alt155=2;
                        int LA155_0 = input.LA(1);

                        if ( (LA155_0==55) ) {
                            int LA155_2 = input.LA(2);

                            if ( (synpred249_Java()) ) {
                                alt155=1;
                            }


                        }


                        switch (alt155) {
                    	case 1 :
                    	    // Java.g:690:10: '[' expression ']'
                    	    {
                    	    char_literal542=(Token)match(input,55,FOLLOW_55_in_identifierSuffix5253); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal542_tree = 
                    	    (Object)adaptor.create(char_literal542)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal542_tree);
                    	    }

                    	    pushFollow(FOLLOW_expression_in_identifierSuffix5255);
                    	    expression543=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression543.getTree());

                    	    char_literal544=(Token)match(input,56,FOLLOW_56_in_identifierSuffix5257); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal544_tree = 
                    	    (Object)adaptor.create(char_literal544)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal544_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt155 >= 1 ) break loop155;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(155, input);
                                throw eee;
                        }
                        cnt155++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // Java.g:691:9: arguments
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_arguments_in_identifierSuffix5270);
                    arguments545=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments545.getTree());

                    }
                    break;
                case 4 :
                    // Java.g:692:9: '.' 'class'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal546=(Token)match(input,43,FOLLOW_43_in_identifierSuffix5280); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal546_tree = 
                    (Object)adaptor.create(char_literal546)
                    ;
                    adaptor.addChild(root_0, char_literal546_tree);
                    }

                    string_literal547=(Token)match(input,66,FOLLOW_66_in_identifierSuffix5282); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal547_tree = 
                    (Object)adaptor.create(string_literal547)
                    ;
                    adaptor.addChild(root_0, string_literal547_tree);
                    }

                    }
                    break;
                case 5 :
                    // Java.g:693:9: '.' explicitGenericInvocation
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal548=(Token)match(input,43,FOLLOW_43_in_identifierSuffix5292); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal548_tree = 
                    (Object)adaptor.create(char_literal548)
                    ;
                    adaptor.addChild(root_0, char_literal548_tree);
                    }

                    pushFollow(FOLLOW_explicitGenericInvocation_in_identifierSuffix5294);
                    explicitGenericInvocation549=explicitGenericInvocation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, explicitGenericInvocation549.getTree());

                    }
                    break;
                case 6 :
                    // Java.g:694:9: '.' 'this'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal550=(Token)match(input,43,FOLLOW_43_in_identifierSuffix5304); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal550_tree = 
                    (Object)adaptor.create(char_literal550)
                    ;
                    adaptor.addChild(root_0, char_literal550_tree);
                    }

                    string_literal551=(Token)match(input,99,FOLLOW_99_in_identifierSuffix5306); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal551_tree = 
                    (Object)adaptor.create(string_literal551)
                    ;
                    adaptor.addChild(root_0, string_literal551_tree);
                    }

                    }
                    break;
                case 7 :
                    // Java.g:695:9: '.' 'super' arguments
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal552=(Token)match(input,43,FOLLOW_43_in_identifierSuffix5316); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal552_tree = 
                    (Object)adaptor.create(char_literal552)
                    ;
                    adaptor.addChild(root_0, char_literal552_tree);
                    }

                    string_literal553=(Token)match(input,96,FOLLOW_96_in_identifierSuffix5318); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal553_tree = 
                    (Object)adaptor.create(string_literal553)
                    ;
                    adaptor.addChild(root_0, string_literal553_tree);
                    }

                    pushFollow(FOLLOW_arguments_in_identifierSuffix5320);
                    arguments554=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments554.getTree());

                    }
                    break;
                case 8 :
                    // Java.g:696:9: '.' 'new' innerCreator
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal555=(Token)match(input,43,FOLLOW_43_in_identifierSuffix5330); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal555_tree = 
                    (Object)adaptor.create(char_literal555)
                    ;
                    adaptor.addChild(root_0, char_literal555_tree);
                    }

                    string_literal556=(Token)match(input,86,FOLLOW_86_in_identifierSuffix5332); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal556_tree = 
                    (Object)adaptor.create(string_literal556)
                    ;
                    adaptor.addChild(root_0, string_literal556_tree);
                    }

                    pushFollow(FOLLOW_innerCreator_in_identifierSuffix5334);
                    innerCreator557=innerCreator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, innerCreator557.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "identifierSuffix"


    public static class creator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "creator"
    // Java.g:699:1: creator : ( nonWildcardTypeArguments createdName classCreatorRest | createdName ( arrayCreatorRest | classCreatorRest ) );
    public final JavaParser.creator_return creator() throws RecognitionException {
        JavaParser.creator_return retval = new JavaParser.creator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.nonWildcardTypeArguments_return nonWildcardTypeArguments558 =null;

        JavaParser.createdName_return createdName559 =null;

        JavaParser.classCreatorRest_return classCreatorRest560 =null;

        JavaParser.createdName_return createdName561 =null;

        JavaParser.arrayCreatorRest_return arrayCreatorRest562 =null;

        JavaParser.classCreatorRest_return classCreatorRest563 =null;



        try {
            // Java.g:700:5: ( nonWildcardTypeArguments createdName classCreatorRest | createdName ( arrayCreatorRest | classCreatorRest ) )
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==49) ) {
                alt158=1;
            }
            else if ( (LA158_0==Identifier||LA158_0==60||LA158_0==62||LA158_0==65||LA158_0==70||LA158_0==76||LA158_0==82||LA158_0==84||LA158_0==93) ) {
                alt158=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 158, 0, input);

                throw nvae;

            }
            switch (alt158) {
                case 1 :
                    // Java.g:700:9: nonWildcardTypeArguments createdName classCreatorRest
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_nonWildcardTypeArguments_in_creator5353);
                    nonWildcardTypeArguments558=nonWildcardTypeArguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nonWildcardTypeArguments558.getTree());

                    pushFollow(FOLLOW_createdName_in_creator5355);
                    createdName559=createdName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, createdName559.getTree());

                    pushFollow(FOLLOW_classCreatorRest_in_creator5357);
                    classCreatorRest560=classCreatorRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classCreatorRest560.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:701:9: createdName ( arrayCreatorRest | classCreatorRest )
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_createdName_in_creator5367);
                    createdName561=createdName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, createdName561.getTree());

                    // Java.g:701:21: ( arrayCreatorRest | classCreatorRest )
                    int alt157=2;
                    int LA157_0 = input.LA(1);

                    if ( (LA157_0==55) ) {
                        alt157=1;
                    }
                    else if ( (LA157_0==32) ) {
                        alt157=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 157, 0, input);

                        throw nvae;

                    }
                    switch (alt157) {
                        case 1 :
                            // Java.g:701:22: arrayCreatorRest
                            {
                            pushFollow(FOLLOW_arrayCreatorRest_in_creator5370);
                            arrayCreatorRest562=arrayCreatorRest();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayCreatorRest562.getTree());

                            }
                            break;
                        case 2 :
                            // Java.g:701:41: classCreatorRest
                            {
                            pushFollow(FOLLOW_classCreatorRest_in_creator5374);
                            classCreatorRest563=classCreatorRest();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, classCreatorRest563.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "creator"


    public static class createdName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "createdName"
    // Java.g:704:1: createdName : ( classOrInterfaceType | primitiveType );
    public final JavaParser.createdName_return createdName() throws RecognitionException {
        JavaParser.createdName_return retval = new JavaParser.createdName_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.classOrInterfaceType_return classOrInterfaceType564 =null;

        JavaParser.primitiveType_return primitiveType565 =null;



        try {
            // Java.g:705:5: ( classOrInterfaceType | primitiveType )
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==Identifier) ) {
                alt159=1;
            }
            else if ( (LA159_0==60||LA159_0==62||LA159_0==65||LA159_0==70||LA159_0==76||LA159_0==82||LA159_0==84||LA159_0==93) ) {
                alt159=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 159, 0, input);

                throw nvae;

            }
            switch (alt159) {
                case 1 :
                    // Java.g:705:9: classOrInterfaceType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classOrInterfaceType_in_createdName5394);
                    classOrInterfaceType564=classOrInterfaceType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classOrInterfaceType564.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:706:9: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_primitiveType_in_createdName5404);
                    primitiveType565=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType565.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "createdName"


    public static class innerCreator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "innerCreator"
    // Java.g:709:1: innerCreator : ( nonWildcardTypeArguments )? Identifier classCreatorRest ;
    public final JavaParser.innerCreator_return innerCreator() throws RecognitionException {
        JavaParser.innerCreator_return retval = new JavaParser.innerCreator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Identifier567=null;
        JavaParser.nonWildcardTypeArguments_return nonWildcardTypeArguments566 =null;

        JavaParser.classCreatorRest_return classCreatorRest568 =null;


        Object Identifier567_tree=null;

        try {
            // Java.g:710:5: ( ( nonWildcardTypeArguments )? Identifier classCreatorRest )
            // Java.g:710:9: ( nonWildcardTypeArguments )? Identifier classCreatorRest
            {
            root_0 = (Object)adaptor.nil();


            // Java.g:710:9: ( nonWildcardTypeArguments )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==49) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // Java.g:710:9: nonWildcardTypeArguments
                    {
                    pushFollow(FOLLOW_nonWildcardTypeArguments_in_innerCreator5427);
                    nonWildcardTypeArguments566=nonWildcardTypeArguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nonWildcardTypeArguments566.getTree());

                    }
                    break;

            }


            Identifier567=(Token)match(input,Identifier,FOLLOW_Identifier_in_innerCreator5430); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier567_tree = 
            (Object)adaptor.create(Identifier567)
            ;
            adaptor.addChild(root_0, Identifier567_tree);
            }

            pushFollow(FOLLOW_classCreatorRest_in_innerCreator5432);
            classCreatorRest568=classCreatorRest();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, classCreatorRest568.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "innerCreator"


    public static class arrayCreatorRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayCreatorRest"
    // Java.g:713:1: arrayCreatorRest : '[' ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* ) ;
    public final JavaParser.arrayCreatorRest_return arrayCreatorRest() throws RecognitionException {
        JavaParser.arrayCreatorRest_return retval = new JavaParser.arrayCreatorRest_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal569=null;
        Token char_literal570=null;
        Token char_literal571=null;
        Token char_literal572=null;
        Token char_literal575=null;
        Token char_literal576=null;
        Token char_literal578=null;
        Token char_literal579=null;
        Token char_literal580=null;
        JavaParser.arrayInitializer_return arrayInitializer573 =null;

        JavaParser.expression_return expression574 =null;

        JavaParser.expression_return expression577 =null;


        Object char_literal569_tree=null;
        Object char_literal570_tree=null;
        Object char_literal571_tree=null;
        Object char_literal572_tree=null;
        Object char_literal575_tree=null;
        Object char_literal576_tree=null;
        Object char_literal578_tree=null;
        Object char_literal579_tree=null;
        Object char_literal580_tree=null;

        try {
            // Java.g:714:5: ( '[' ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* ) )
            // Java.g:714:9: '[' ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* )
            {
            root_0 = (Object)adaptor.nil();


            char_literal569=(Token)match(input,55,FOLLOW_55_in_arrayCreatorRest5451); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal569_tree = 
            (Object)adaptor.create(char_literal569)
            ;
            adaptor.addChild(root_0, char_literal569_tree);
            }

            // Java.g:715:9: ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* )
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==56) ) {
                alt164=1;
            }
            else if ( ((LA164_0 >= CharacterLiteral && LA164_0 <= DecimalLiteral)||LA164_0==FloatingPointLiteral||(LA164_0 >= HexLiteral && LA164_0 <= Identifier)||(LA164_0 >= OctalLiteral && LA164_0 <= StringLiteral)||LA164_0==25||LA164_0==32||(LA164_0 >= 36 && LA164_0 <= 37)||(LA164_0 >= 40 && LA164_0 <= 41)||LA164_0==60||LA164_0==62||LA164_0==65||LA164_0==70||LA164_0==73||LA164_0==76||LA164_0==82||LA164_0==84||(LA164_0 >= 86 && LA164_0 <= 87)||LA164_0==93||LA164_0==96||LA164_0==99||LA164_0==103||LA164_0==105||LA164_0==113) ) {
                alt164=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 164, 0, input);

                throw nvae;

            }
            switch (alt164) {
                case 1 :
                    // Java.g:715:13: ']' ( '[' ']' )* arrayInitializer
                    {
                    char_literal570=(Token)match(input,56,FOLLOW_56_in_arrayCreatorRest5465); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal570_tree = 
                    (Object)adaptor.create(char_literal570)
                    ;
                    adaptor.addChild(root_0, char_literal570_tree);
                    }

                    // Java.g:715:17: ( '[' ']' )*
                    loop161:
                    do {
                        int alt161=2;
                        int LA161_0 = input.LA(1);

                        if ( (LA161_0==55) ) {
                            alt161=1;
                        }


                        switch (alt161) {
                    	case 1 :
                    	    // Java.g:715:18: '[' ']'
                    	    {
                    	    char_literal571=(Token)match(input,55,FOLLOW_55_in_arrayCreatorRest5468); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal571_tree = 
                    	    (Object)adaptor.create(char_literal571)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal571_tree);
                    	    }

                    	    char_literal572=(Token)match(input,56,FOLLOW_56_in_arrayCreatorRest5470); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal572_tree = 
                    	    (Object)adaptor.create(char_literal572)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal572_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop161;
                        }
                    } while (true);


                    pushFollow(FOLLOW_arrayInitializer_in_arrayCreatorRest5474);
                    arrayInitializer573=arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayInitializer573.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:716:13: expression ']' ( '[' expression ']' )* ( '[' ']' )*
                    {
                    pushFollow(FOLLOW_expression_in_arrayCreatorRest5488);
                    expression574=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression574.getTree());

                    char_literal575=(Token)match(input,56,FOLLOW_56_in_arrayCreatorRest5490); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal575_tree = 
                    (Object)adaptor.create(char_literal575)
                    ;
                    adaptor.addChild(root_0, char_literal575_tree);
                    }

                    // Java.g:716:28: ( '[' expression ']' )*
                    loop162:
                    do {
                        int alt162=2;
                        int LA162_0 = input.LA(1);

                        if ( (LA162_0==55) ) {
                            int LA162_1 = input.LA(2);

                            if ( (synpred262_Java()) ) {
                                alt162=1;
                            }


                        }


                        switch (alt162) {
                    	case 1 :
                    	    // Java.g:716:29: '[' expression ']'
                    	    {
                    	    char_literal576=(Token)match(input,55,FOLLOW_55_in_arrayCreatorRest5493); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal576_tree = 
                    	    (Object)adaptor.create(char_literal576)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal576_tree);
                    	    }

                    	    pushFollow(FOLLOW_expression_in_arrayCreatorRest5495);
                    	    expression577=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression577.getTree());

                    	    char_literal578=(Token)match(input,56,FOLLOW_56_in_arrayCreatorRest5497); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal578_tree = 
                    	    (Object)adaptor.create(char_literal578)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal578_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop162;
                        }
                    } while (true);


                    // Java.g:716:50: ( '[' ']' )*
                    loop163:
                    do {
                        int alt163=2;
                        int LA163_0 = input.LA(1);

                        if ( (LA163_0==55) ) {
                            int LA163_2 = input.LA(2);

                            if ( (LA163_2==56) ) {
                                alt163=1;
                            }


                        }


                        switch (alt163) {
                    	case 1 :
                    	    // Java.g:716:51: '[' ']'
                    	    {
                    	    char_literal579=(Token)match(input,55,FOLLOW_55_in_arrayCreatorRest5502); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal579_tree = 
                    	    (Object)adaptor.create(char_literal579)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal579_tree);
                    	    }

                    	    char_literal580=(Token)match(input,56,FOLLOW_56_in_arrayCreatorRest5504); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal580_tree = 
                    	    (Object)adaptor.create(char_literal580)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal580_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop163;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arrayCreatorRest"


    public static class classCreatorRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classCreatorRest"
    // Java.g:720:1: classCreatorRest : arguments ( classBody )? ;
    public final JavaParser.classCreatorRest_return classCreatorRest() throws RecognitionException {
        JavaParser.classCreatorRest_return retval = new JavaParser.classCreatorRest_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JavaParser.arguments_return arguments581 =null;

        JavaParser.classBody_return classBody582 =null;



        try {
            // Java.g:721:5: ( arguments ( classBody )? )
            // Java.g:721:9: arguments ( classBody )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_arguments_in_classCreatorRest5535);
            arguments581=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments581.getTree());

            // Java.g:721:19: ( classBody )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==108) ) {
                alt165=1;
            }
            switch (alt165) {
                case 1 :
                    // Java.g:721:19: classBody
                    {
                    pushFollow(FOLLOW_classBody_in_classCreatorRest5537);
                    classBody582=classBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody582.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classCreatorRest"


    public static class explicitGenericInvocation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "explicitGenericInvocation"
    // Java.g:724:1: explicitGenericInvocation : nonWildcardTypeArguments Identifier arguments ;
    public final JavaParser.explicitGenericInvocation_return explicitGenericInvocation() throws RecognitionException {
        JavaParser.explicitGenericInvocation_return retval = new JavaParser.explicitGenericInvocation_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Identifier584=null;
        JavaParser.nonWildcardTypeArguments_return nonWildcardTypeArguments583 =null;

        JavaParser.arguments_return arguments585 =null;


        Object Identifier584_tree=null;

        try {
            // Java.g:725:5: ( nonWildcardTypeArguments Identifier arguments )
            // Java.g:725:9: nonWildcardTypeArguments Identifier arguments
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitGenericInvocation5561);
            nonWildcardTypeArguments583=nonWildcardTypeArguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, nonWildcardTypeArguments583.getTree());

            Identifier584=(Token)match(input,Identifier,FOLLOW_Identifier_in_explicitGenericInvocation5563); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier584_tree = 
            (Object)adaptor.create(Identifier584)
            ;
            adaptor.addChild(root_0, Identifier584_tree);
            }

            pushFollow(FOLLOW_arguments_in_explicitGenericInvocation5565);
            arguments585=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments585.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "explicitGenericInvocation"


    public static class nonWildcardTypeArguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nonWildcardTypeArguments"
    // Java.g:728:1: nonWildcardTypeArguments : '<' typeList '>' ;
    public final JavaParser.nonWildcardTypeArguments_return nonWildcardTypeArguments() throws RecognitionException {
        JavaParser.nonWildcardTypeArguments_return retval = new JavaParser.nonWildcardTypeArguments_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal586=null;
        Token char_literal588=null;
        JavaParser.typeList_return typeList587 =null;


        Object char_literal586_tree=null;
        Object char_literal588_tree=null;

        try {
            // Java.g:729:5: ( '<' typeList '>' )
            // Java.g:729:9: '<' typeList '>'
            {
            root_0 = (Object)adaptor.nil();


            char_literal586=(Token)match(input,49,FOLLOW_49_in_nonWildcardTypeArguments5588); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal586_tree = 
            (Object)adaptor.create(char_literal586)
            ;
            adaptor.addChild(root_0, char_literal586_tree);
            }

            pushFollow(FOLLOW_typeList_in_nonWildcardTypeArguments5590);
            typeList587=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList587.getTree());

            char_literal588=(Token)match(input,52,FOLLOW_52_in_nonWildcardTypeArguments5592); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal588_tree = 
            (Object)adaptor.create(char_literal588)
            ;
            adaptor.addChild(root_0, char_literal588_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nonWildcardTypeArguments"


    public static class selector_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selector"
    // Java.g:732:1: selector : ( '.' Identifier ( arguments )? | '.' 'this' | '.' 'super' superSuffix | '.' 'new' innerCreator | '[' expression ']' );
    public final JavaParser.selector_return selector() throws RecognitionException {
        JavaParser.selector_return retval = new JavaParser.selector_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal589=null;
        Token Identifier590=null;
        Token char_literal592=null;
        Token string_literal593=null;
        Token char_literal594=null;
        Token string_literal595=null;
        Token char_literal597=null;
        Token string_literal598=null;
        Token char_literal600=null;
        Token char_literal602=null;
        JavaParser.arguments_return arguments591 =null;

        JavaParser.superSuffix_return superSuffix596 =null;

        JavaParser.innerCreator_return innerCreator599 =null;

        JavaParser.expression_return expression601 =null;


        Object char_literal589_tree=null;
        Object Identifier590_tree=null;
        Object char_literal592_tree=null;
        Object string_literal593_tree=null;
        Object char_literal594_tree=null;
        Object string_literal595_tree=null;
        Object char_literal597_tree=null;
        Object string_literal598_tree=null;
        Object char_literal600_tree=null;
        Object char_literal602_tree=null;

        try {
            // Java.g:733:5: ( '.' Identifier ( arguments )? | '.' 'this' | '.' 'super' superSuffix | '.' 'new' innerCreator | '[' expression ']' )
            int alt167=5;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==43) ) {
                switch ( input.LA(2) ) {
                case Identifier:
                    {
                    alt167=1;
                    }
                    break;
                case 99:
                    {
                    alt167=2;
                    }
                    break;
                case 96:
                    {
                    alt167=3;
                    }
                    break;
                case 86:
                    {
                    alt167=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 167, 1, input);

                    throw nvae;

                }

            }
            else if ( (LA167_0==55) ) {
                alt167=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 167, 0, input);

                throw nvae;

            }
            switch (alt167) {
                case 1 :
                    // Java.g:733:9: '.' Identifier ( arguments )?
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal589=(Token)match(input,43,FOLLOW_43_in_selector5615); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal589_tree = 
                    (Object)adaptor.create(char_literal589)
                    ;
                    adaptor.addChild(root_0, char_literal589_tree);
                    }

                    Identifier590=(Token)match(input,Identifier,FOLLOW_Identifier_in_selector5617); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier590_tree = 
                    (Object)adaptor.create(Identifier590)
                    ;
                    adaptor.addChild(root_0, Identifier590_tree);
                    }

                    // Java.g:733:24: ( arguments )?
                    int alt166=2;
                    int LA166_0 = input.LA(1);

                    if ( (LA166_0==32) ) {
                        alt166=1;
                    }
                    switch (alt166) {
                        case 1 :
                            // Java.g:733:24: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_selector5619);
                            arguments591=arguments();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments591.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Java.g:734:9: '.' 'this'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal592=(Token)match(input,43,FOLLOW_43_in_selector5630); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal592_tree = 
                    (Object)adaptor.create(char_literal592)
                    ;
                    adaptor.addChild(root_0, char_literal592_tree);
                    }

                    string_literal593=(Token)match(input,99,FOLLOW_99_in_selector5632); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal593_tree = 
                    (Object)adaptor.create(string_literal593)
                    ;
                    adaptor.addChild(root_0, string_literal593_tree);
                    }

                    }
                    break;
                case 3 :
                    // Java.g:735:9: '.' 'super' superSuffix
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal594=(Token)match(input,43,FOLLOW_43_in_selector5642); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal594_tree = 
                    (Object)adaptor.create(char_literal594)
                    ;
                    adaptor.addChild(root_0, char_literal594_tree);
                    }

                    string_literal595=(Token)match(input,96,FOLLOW_96_in_selector5644); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal595_tree = 
                    (Object)adaptor.create(string_literal595)
                    ;
                    adaptor.addChild(root_0, string_literal595_tree);
                    }

                    pushFollow(FOLLOW_superSuffix_in_selector5646);
                    superSuffix596=superSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, superSuffix596.getTree());

                    }
                    break;
                case 4 :
                    // Java.g:736:9: '.' 'new' innerCreator
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal597=(Token)match(input,43,FOLLOW_43_in_selector5656); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal597_tree = 
                    (Object)adaptor.create(char_literal597)
                    ;
                    adaptor.addChild(root_0, char_literal597_tree);
                    }

                    string_literal598=(Token)match(input,86,FOLLOW_86_in_selector5658); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal598_tree = 
                    (Object)adaptor.create(string_literal598)
                    ;
                    adaptor.addChild(root_0, string_literal598_tree);
                    }

                    pushFollow(FOLLOW_innerCreator_in_selector5660);
                    innerCreator599=innerCreator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, innerCreator599.getTree());

                    }
                    break;
                case 5 :
                    // Java.g:737:9: '[' expression ']'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal600=(Token)match(input,55,FOLLOW_55_in_selector5670); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal600_tree = 
                    (Object)adaptor.create(char_literal600)
                    ;
                    adaptor.addChild(root_0, char_literal600_tree);
                    }

                    pushFollow(FOLLOW_expression_in_selector5672);
                    expression601=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression601.getTree());

                    char_literal602=(Token)match(input,56,FOLLOW_56_in_selector5674); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal602_tree = 
                    (Object)adaptor.create(char_literal602)
                    ;
                    adaptor.addChild(root_0, char_literal602_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selector"


    public static class superSuffix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "superSuffix"
    // Java.g:740:1: superSuffix : ( arguments | '.' Identifier ( arguments )? );
    public final JavaParser.superSuffix_return superSuffix() throws RecognitionException {
        JavaParser.superSuffix_return retval = new JavaParser.superSuffix_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal604=null;
        Token Identifier605=null;
        JavaParser.arguments_return arguments603 =null;

        JavaParser.arguments_return arguments606 =null;


        Object char_literal604_tree=null;
        Object Identifier605_tree=null;

        try {
            // Java.g:741:5: ( arguments | '.' Identifier ( arguments )? )
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==32) ) {
                alt169=1;
            }
            else if ( (LA169_0==43) ) {
                alt169=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 169, 0, input);

                throw nvae;

            }
            switch (alt169) {
                case 1 :
                    // Java.g:741:9: arguments
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_arguments_in_superSuffix5697);
                    arguments603=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments603.getTree());

                    }
                    break;
                case 2 :
                    // Java.g:742:9: '.' Identifier ( arguments )?
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal604=(Token)match(input,43,FOLLOW_43_in_superSuffix5707); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal604_tree = 
                    (Object)adaptor.create(char_literal604)
                    ;
                    adaptor.addChild(root_0, char_literal604_tree);
                    }

                    Identifier605=(Token)match(input,Identifier,FOLLOW_Identifier_in_superSuffix5709); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier605_tree = 
                    (Object)adaptor.create(Identifier605)
                    ;
                    adaptor.addChild(root_0, Identifier605_tree);
                    }

                    // Java.g:742:24: ( arguments )?
                    int alt168=2;
                    int LA168_0 = input.LA(1);

                    if ( (LA168_0==32) ) {
                        alt168=1;
                    }
                    switch (alt168) {
                        case 1 :
                            // Java.g:742:24: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_superSuffix5711);
                            arguments606=arguments();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments606.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "superSuffix"


    public static class arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arguments"
    // Java.g:745:1: arguments : '(' ( expressionList )? ')' ;
    public final JavaParser.arguments_return arguments() throws RecognitionException {
        JavaParser.arguments_return retval = new JavaParser.arguments_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal607=null;
        Token char_literal609=null;
        JavaParser.expressionList_return expressionList608 =null;


        Object char_literal607_tree=null;
        Object char_literal609_tree=null;

        try {
            // Java.g:746:5: ( '(' ( expressionList )? ')' )
            // Java.g:746:9: '(' ( expressionList )? ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal607=(Token)match(input,32,FOLLOW_32_in_arguments5731); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal607_tree = 
            (Object)adaptor.create(char_literal607)
            ;
            adaptor.addChild(root_0, char_literal607_tree);
            }

            // Java.g:746:13: ( expressionList )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( ((LA170_0 >= CharacterLiteral && LA170_0 <= DecimalLiteral)||LA170_0==FloatingPointLiteral||(LA170_0 >= HexLiteral && LA170_0 <= Identifier)||(LA170_0 >= OctalLiteral && LA170_0 <= StringLiteral)||LA170_0==25||LA170_0==32||(LA170_0 >= 36 && LA170_0 <= 37)||(LA170_0 >= 40 && LA170_0 <= 41)||LA170_0==60||LA170_0==62||LA170_0==65||LA170_0==70||LA170_0==73||LA170_0==76||LA170_0==82||LA170_0==84||(LA170_0 >= 86 && LA170_0 <= 87)||LA170_0==93||LA170_0==96||LA170_0==99||LA170_0==103||LA170_0==105||LA170_0==113) ) {
                alt170=1;
            }
            switch (alt170) {
                case 1 :
                    // Java.g:746:13: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_arguments5733);
                    expressionList608=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList608.getTree());

                    }
                    break;

            }


            char_literal609=(Token)match(input,33,FOLLOW_33_in_arguments5736); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal609_tree = 
            (Object)adaptor.create(char_literal609)
            ;
            adaptor.addChild(root_0, char_literal609_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arguments"

    // $ANTLR start synpred5_Java
    public final void synpred5_Java_fragment() throws RecognitionException {
        // Java.g:20:9: ( annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* ) )
        // Java.g:20:9: annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* )
        {
        pushFollow(FOLLOW_annotations_in_synpred5_Java56);
        annotations();

        state._fsp--;
        if (state.failed) return ;

        // Java.g:21:9: ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* )
        int alt176=2;
        int LA176_0 = input.LA(1);

        if ( (LA176_0==88) ) {
            alt176=1;
        }
        else if ( (LA176_0==ENUM||LA176_0==54||LA176_0==59||LA176_0==66||LA176_0==74||LA176_0==83||(LA176_0 >= 89 && LA176_0 <= 91)||(LA176_0 >= 94 && LA176_0 <= 95)) ) {
            alt176=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 176, 0, input);

            throw nvae;

        }
        switch (alt176) {
            case 1 :
                // Java.g:21:13: packageDeclaration ( importDeclaration )* ( typeDeclaration )*
                {
                pushFollow(FOLLOW_packageDeclaration_in_synpred5_Java70);
                packageDeclaration();

                state._fsp--;
                if (state.failed) return ;

                // Java.g:21:32: ( importDeclaration )*
                loop173:
                do {
                    int alt173=2;
                    int LA173_0 = input.LA(1);

                    if ( (LA173_0==80) ) {
                        alt173=1;
                    }


                    switch (alt173) {
                	case 1 :
                	    // Java.g:21:32: importDeclaration
                	    {
                	    pushFollow(FOLLOW_importDeclaration_in_synpred5_Java72);
                	    importDeclaration();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop173;
                    }
                } while (true);


                // Java.g:21:51: ( typeDeclaration )*
                loop174:
                do {
                    int alt174=2;
                    int LA174_0 = input.LA(1);

                    if ( (LA174_0==ENUM||LA174_0==48||LA174_0==54||LA174_0==59||LA174_0==66||LA174_0==74||LA174_0==83||(LA174_0 >= 89 && LA174_0 <= 91)||(LA174_0 >= 94 && LA174_0 <= 95)) ) {
                        alt174=1;
                    }


                    switch (alt174) {
                	case 1 :
                	    // Java.g:21:51: typeDeclaration
                	    {
                	    pushFollow(FOLLOW_typeDeclaration_in_synpred5_Java75);
                	    typeDeclaration();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop174;
                    }
                } while (true);


                }
                break;
            case 2 :
                // Java.g:22:13: classOrInterfaceDeclaration ( typeDeclaration )*
                {
                pushFollow(FOLLOW_classOrInterfaceDeclaration_in_synpred5_Java90);
                classOrInterfaceDeclaration();

                state._fsp--;
                if (state.failed) return ;

                // Java.g:22:41: ( typeDeclaration )*
                loop175:
                do {
                    int alt175=2;
                    int LA175_0 = input.LA(1);

                    if ( (LA175_0==ENUM||LA175_0==48||LA175_0==54||LA175_0==59||LA175_0==66||LA175_0==74||LA175_0==83||(LA175_0 >= 89 && LA175_0 <= 91)||(LA175_0 >= 94 && LA175_0 <= 95)) ) {
                        alt175=1;
                    }


                    switch (alt175) {
                	case 1 :
                	    // Java.g:22:41: typeDeclaration
                	    {
                	    pushFollow(FOLLOW_typeDeclaration_in_synpred5_Java92);
                	    typeDeclaration();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop175;
                    }
                } while (true);


                }
                break;

        }


        }

    }
    // $ANTLR end synpred5_Java

    // $ANTLR start synpred113_Java
    public final void synpred113_Java_fragment() throws RecognitionException {
        // Java.g:334:13: ( explicitConstructorInvocation )
        // Java.g:334:13: explicitConstructorInvocation
        {
        pushFollow(FOLLOW_explicitConstructorInvocation_in_synpred113_Java2467);
        explicitConstructorInvocation();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred113_Java

    // $ANTLR start synpred117_Java
    public final void synpred117_Java_fragment() throws RecognitionException {
        // Java.g:338:9: ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' )
        // Java.g:338:9: ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';'
        {
        // Java.g:338:9: ( nonWildcardTypeArguments )?
        int alt184=2;
        int LA184_0 = input.LA(1);

        if ( (LA184_0==49) ) {
            alt184=1;
        }
        switch (alt184) {
            case 1 :
                // Java.g:338:9: nonWildcardTypeArguments
                {
                pushFollow(FOLLOW_nonWildcardTypeArguments_in_synpred117_Java2492);
                nonWildcardTypeArguments();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        if ( input.LA(1)==96||input.LA(1)==99 ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_arguments_in_synpred117_Java2503);
        arguments();

        state._fsp--;
        if (state.failed) return ;

        match(input,48,FOLLOW_48_in_synpred117_Java2505); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred117_Java

    // $ANTLR start synpred128_Java
    public final void synpred128_Java_fragment() throws RecognitionException {
        // Java.g:370:9: ( annotation )
        // Java.g:370:9: annotation
        {
        pushFollow(FOLLOW_annotation_in_synpred128_Java2716);
        annotation();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred128_Java

    // $ANTLR start synpred151_Java
    public final void synpred151_Java_fragment() throws RecognitionException {
        // Java.g:443:9: ( localVariableDeclarationStatement )
        // Java.g:443:9: localVariableDeclarationStatement
        {
        pushFollow(FOLLOW_localVariableDeclarationStatement_in_synpred151_Java3243);
        localVariableDeclarationStatement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred151_Java

    // $ANTLR start synpred152_Java
    public final void synpred152_Java_fragment() throws RecognitionException {
        // Java.g:444:9: ( classOrInterfaceDeclaration )
        // Java.g:444:9: classOrInterfaceDeclaration
        {
        pushFollow(FOLLOW_classOrInterfaceDeclaration_in_synpred152_Java3253);
        classOrInterfaceDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred152_Java

    // $ANTLR start synpred157_Java
    public final void synpred157_Java_fragment() throws RecognitionException {
        // Java.g:463:54: ( 'else' statement )
        // Java.g:463:54: 'else' statement
        {
        match(input,71,FOLLOW_71_in_synpred157_Java3398); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred157_Java3400);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred157_Java

    // $ANTLR start synpred162_Java
    public final void synpred162_Java_fragment() throws RecognitionException {
        // Java.g:468:11: ( catches 'finally' block )
        // Java.g:468:11: catches 'finally' block
        {
        pushFollow(FOLLOW_catches_in_synpred162_Java3476);
        catches();

        state._fsp--;
        if (state.failed) return ;

        match(input,75,FOLLOW_75_in_synpred162_Java3478); if (state.failed) return ;

        pushFollow(FOLLOW_block_in_synpred162_Java3480);
        block();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred162_Java

    // $ANTLR start synpred163_Java
    public final void synpred163_Java_fragment() throws RecognitionException {
        // Java.g:469:11: ( catches )
        // Java.g:469:11: catches
        {
        pushFollow(FOLLOW_catches_in_synpred163_Java3492);
        catches();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred163_Java

    // $ANTLR start synpred178_Java
    public final void synpred178_Java_fragment() throws RecognitionException {
        // Java.g:504:9: ( switchLabel )
        // Java.g:504:9: switchLabel
        {
        pushFollow(FOLLOW_switchLabel_in_synpred178_Java3783);
        switchLabel();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred178_Java

    // $ANTLR start synpred180_Java
    public final void synpred180_Java_fragment() throws RecognitionException {
        // Java.g:508:9: ( 'case' constantExpression ':' )
        // Java.g:508:9: 'case' constantExpression ':'
        {
        match(input,63,FOLLOW_63_in_synpred180_Java3810); if (state.failed) return ;

        pushFollow(FOLLOW_constantExpression_in_synpred180_Java3812);
        constantExpression();

        state._fsp--;
        if (state.failed) return ;

        match(input,47,FOLLOW_47_in_synpred180_Java3814); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred180_Java

    // $ANTLR start synpred181_Java
    public final void synpred181_Java_fragment() throws RecognitionException {
        // Java.g:509:9: ( 'case' enumConstantName ':' )
        // Java.g:509:9: 'case' enumConstantName ':'
        {
        match(input,63,FOLLOW_63_in_synpred181_Java3824); if (state.failed) return ;

        pushFollow(FOLLOW_enumConstantName_in_synpred181_Java3826);
        enumConstantName();

        state._fsp--;
        if (state.failed) return ;

        match(input,47,FOLLOW_47_in_synpred181_Java3828); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred181_Java

    // $ANTLR start synpred182_Java
    public final void synpred182_Java_fragment() throws RecognitionException {
        // Java.g:515:9: ( enhancedForControl )
        // Java.g:515:9: enhancedForControl
        {
        pushFollow(FOLLOW_enhancedForControl_in_synpred182_Java3871);
        enhancedForControl();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred182_Java

    // $ANTLR start synpred186_Java
    public final void synpred186_Java_fragment() throws RecognitionException {
        // Java.g:520:9: ( localVariableDeclaration )
        // Java.g:520:9: localVariableDeclaration
        {
        pushFollow(FOLLOW_localVariableDeclaration_in_synpred186_Java3911);
        localVariableDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred186_Java

    // $ANTLR start synpred198_Java
    public final void synpred198_Java_fragment() throws RecognitionException {
        // Java.g:564:9: ( '<' '<' '=' )
        // Java.g:564:10: '<' '<' '='
        {
        match(input,49,FOLLOW_49_in_synpred198_Java4212); if (state.failed) return ;

        match(input,49,FOLLOW_49_in_synpred198_Java4214); if (state.failed) return ;

        match(input,50,FOLLOW_50_in_synpred198_Java4216); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred198_Java

    // $ANTLR start synpred199_Java
    public final void synpred199_Java_fragment() throws RecognitionException {
        // Java.g:569:9: ( '>' '>' '>' '=' )
        // Java.g:569:10: '>' '>' '>' '='
        {
        match(input,52,FOLLOW_52_in_synpred199_Java4252); if (state.failed) return ;

        match(input,52,FOLLOW_52_in_synpred199_Java4254); if (state.failed) return ;

        match(input,52,FOLLOW_52_in_synpred199_Java4256); if (state.failed) return ;

        match(input,50,FOLLOW_50_in_synpred199_Java4258); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred199_Java

    // $ANTLR start synpred200_Java
    public final void synpred200_Java_fragment() throws RecognitionException {
        // Java.g:576:9: ( '>' '>' '=' )
        // Java.g:576:10: '>' '>' '='
        {
        match(input,52,FOLLOW_52_in_synpred200_Java4297); if (state.failed) return ;

        match(input,52,FOLLOW_52_in_synpred200_Java4299); if (state.failed) return ;

        match(input,50,FOLLOW_50_in_synpred200_Java4301); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred200_Java

    // $ANTLR start synpred211_Java
    public final void synpred211_Java_fragment() throws RecognitionException {
        // Java.g:620:9: ( '<' '=' )
        // Java.g:620:10: '<' '='
        {
        match(input,49,FOLLOW_49_in_synpred211_Java4609); if (state.failed) return ;

        match(input,50,FOLLOW_50_in_synpred211_Java4611); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred211_Java

    // $ANTLR start synpred212_Java
    public final void synpred212_Java_fragment() throws RecognitionException {
        // Java.g:623:9: ( '>' '=' )
        // Java.g:623:10: '>' '='
        {
        match(input,52,FOLLOW_52_in_synpred212_Java4643); if (state.failed) return ;

        match(input,50,FOLLOW_50_in_synpred212_Java4645); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred212_Java

    // $ANTLR start synpred215_Java
    public final void synpred215_Java_fragment() throws RecognitionException {
        // Java.g:635:9: ( '<' '<' )
        // Java.g:635:10: '<' '<'
        {
        match(input,49,FOLLOW_49_in_synpred215_Java4736); if (state.failed) return ;

        match(input,49,FOLLOW_49_in_synpred215_Java4738); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred215_Java

    // $ANTLR start synpred216_Java
    public final void synpred216_Java_fragment() throws RecognitionException {
        // Java.g:638:9: ( '>' '>' '>' )
        // Java.g:638:10: '>' '>' '>'
        {
        match(input,52,FOLLOW_52_in_synpred216_Java4770); if (state.failed) return ;

        match(input,52,FOLLOW_52_in_synpred216_Java4772); if (state.failed) return ;

        match(input,52,FOLLOW_52_in_synpred216_Java4774); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred216_Java

    // $ANTLR start synpred217_Java
    public final void synpred217_Java_fragment() throws RecognitionException {
        // Java.g:643:9: ( '>' '>' )
        // Java.g:643:10: '>' '>'
        {
        match(input,52,FOLLOW_52_in_synpred217_Java4810); if (state.failed) return ;

        match(input,52,FOLLOW_52_in_synpred217_Java4812); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred217_Java

    // $ANTLR start synpred229_Java
    public final void synpred229_Java_fragment() throws RecognitionException {
        // Java.g:668:9: ( castExpression )
        // Java.g:668:9: castExpression
        {
        pushFollow(FOLLOW_castExpression_in_synpred229_Java5021);
        castExpression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred229_Java

    // $ANTLR start synpred233_Java
    public final void synpred233_Java_fragment() throws RecognitionException {
        // Java.g:673:8: ( '(' primitiveType ')' unaryExpression )
        // Java.g:673:8: '(' primitiveType ')' unaryExpression
        {
        match(input,32,FOLLOW_32_in_synpred233_Java5059); if (state.failed) return ;

        pushFollow(FOLLOW_primitiveType_in_synpred233_Java5061);
        primitiveType();

        state._fsp--;
        if (state.failed) return ;

        match(input,33,FOLLOW_33_in_synpred233_Java5063); if (state.failed) return ;

        pushFollow(FOLLOW_unaryExpression_in_synpred233_Java5065);
        unaryExpression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred233_Java

    // $ANTLR start synpred234_Java
    public final void synpred234_Java_fragment() throws RecognitionException {
        // Java.g:674:13: ( type )
        // Java.g:674:13: type
        {
        pushFollow(FOLLOW_type_in_synpred234_Java5077);
        type();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred234_Java

    // $ANTLR start synpred236_Java
    public final void synpred236_Java_fragment() throws RecognitionException {
        // Java.g:679:17: ( '.' Identifier )
        // Java.g:679:17: '.' Identifier
        {
        match(input,43,FOLLOW_43_in_synpred236_Java5118); if (state.failed) return ;

        match(input,Identifier,FOLLOW_Identifier_in_synpred236_Java5120); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred236_Java

    // $ANTLR start synpred237_Java
    public final void synpred237_Java_fragment() throws RecognitionException {
        // Java.g:679:34: ( identifierSuffix )
        // Java.g:679:34: identifierSuffix
        {
        pushFollow(FOLLOW_identifierSuffix_in_synpred237_Java5124);
        identifierSuffix();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred237_Java

    // $ANTLR start synpred242_Java
    public final void synpred242_Java_fragment() throws RecognitionException {
        // Java.g:683:21: ( '.' Identifier )
        // Java.g:683:21: '.' Identifier
        {
        match(input,43,FOLLOW_43_in_synpred242_Java5172); if (state.failed) return ;

        match(input,Identifier,FOLLOW_Identifier_in_synpred242_Java5174); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred242_Java

    // $ANTLR start synpred243_Java
    public final void synpred243_Java_fragment() throws RecognitionException {
        // Java.g:683:38: ( identifierSuffix )
        // Java.g:683:38: identifierSuffix
        {
        pushFollow(FOLLOW_identifierSuffix_in_synpred243_Java5178);
        identifierSuffix();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred243_Java

    // $ANTLR start synpred249_Java
    public final void synpred249_Java_fragment() throws RecognitionException {
        // Java.g:690:10: ( '[' expression ']' )
        // Java.g:690:10: '[' expression ']'
        {
        match(input,55,FOLLOW_55_in_synpred249_Java5253); if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred249_Java5255);
        expression();

        state._fsp--;
        if (state.failed) return ;

        match(input,56,FOLLOW_56_in_synpred249_Java5257); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred249_Java

    // $ANTLR start synpred262_Java
    public final void synpred262_Java_fragment() throws RecognitionException {
        // Java.g:716:29: ( '[' expression ']' )
        // Java.g:716:29: '[' expression ']'
        {
        match(input,55,FOLLOW_55_in_synpred262_Java5493); if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred262_Java5495);
        expression();

        state._fsp--;
        if (state.failed) return ;

        match(input,56,FOLLOW_56_in_synpred262_Java5497); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred262_Java

    // Delegated rules

    public final boolean synpred128_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred128_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred211_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred211_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred236_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred236_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred181_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred181_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred117_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred117_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred217_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred217_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred186_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred186_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred178_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred178_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred233_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred233_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred113_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred113_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred216_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred216_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred152_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred152_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred163_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred163_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred182_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred182_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred243_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred243_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred157_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred157_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred212_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred212_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred249_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred249_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred215_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred215_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred151_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred151_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred162_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred162_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred199_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred199_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred262_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred262_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred180_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred180_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred237_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred237_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred198_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred198_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred229_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred229_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred200_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred200_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred234_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred234_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred242_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred242_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA123 dfa123 = new DFA123(this);
    protected DFA146 dfa146 = new DFA146(this);
    static final String DFA123_eotS =
        "\u0087\uffff";
    static final String DFA123_eofS =
        "\u0087\uffff";
    static final String DFA123_minS =
        "\1\6\4\17\22\uffff\5\17\1\6\1\17\1\6\1\47\30\uffff\1\70\1\47\1\uffff"+
        "\21\0\2\uffff\3\0\21\uffff\1\0\5\uffff\1\0\30\uffff\1\0\5\uffff";
    static final String DFA123_maxS =
        "\1\161\1\135\1\17\1\157\1\67\22\uffff\2\67\1\135\1\17\1\135\1\161"+
        "\1\143\1\161\1\67\30\uffff\1\70\1\67\1\uffff\21\0\2\uffff\3\0\21"+
        "\uffff\1\0\5\uffff\1\0\30\uffff\1\0\5\uffff";
    static final String DFA123_acceptS =
        "\5\uffff\1\2\166\uffff\1\1\12\uffff";
    static final String DFA123_specialS =
        "\73\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\2\uffff\1\21\1\22\1\23\21\uffff\1\24\5\uffff"+
        "\1\25\30\uffff\1\26\5\uffff}>";
    static final String[] DFA123_transitionS = {
            "\2\5\4\uffff\1\5\1\uffff\1\5\1\3\5\uffff\2\5\2\uffff\1\5\6\uffff"+
            "\1\5\3\uffff\2\5\2\uffff\2\5\6\uffff\1\5\5\uffff\1\2\5\uffff"+
            "\1\4\1\uffff\1\4\2\uffff\1\4\4\uffff\1\4\2\uffff\1\5\1\1\1\uffff"+
            "\1\4\5\uffff\1\4\1\uffff\1\4\1\uffff\2\5\5\uffff\1\4\2\uffff"+
            "\1\5\2\uffff\1\5\3\uffff\1\5\1\uffff\1\5\7\uffff\1\5",
            "\1\27\46\uffff\1\32\5\uffff\1\30\1\uffff\1\30\2\uffff\1\30"+
            "\4\uffff\1\30\3\uffff\1\31\1\uffff\1\30\5\uffff\1\30\1\uffff"+
            "\1\30\10\uffff\1\30",
            "\1\33",
            "\1\37\12\uffff\7\5\1\uffff\11\5\1\35\1\uffff\2\5\1\uffff\1"+
            "\5\1\34\4\5\1\uffff\1\36\1\uffff\2\5\26\uffff\1\5\33\uffff\3"+
            "\5",
            "\1\71\33\uffff\1\5\13\uffff\1\70",
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
            "",
            "",
            "",
            "",
            "",
            "\1\76\33\uffff\1\74\5\uffff\1\73\5\uffff\1\75",
            "\1\100\47\uffff\1\77",
            "\1\101\46\uffff\1\104\5\uffff\1\102\1\uffff\1\102\2\uffff\1"+
            "\102\4\uffff\1\102\3\uffff\1\103\1\uffff\1\102\5\uffff\1\102"+
            "\1\uffff\1\102\10\uffff\1\102",
            "\1\105",
            "\1\110\20\uffff\1\107\12\uffff\1\106\12\uffff\1\113\5\uffff"+
            "\1\111\1\uffff\1\111\2\uffff\1\111\4\uffff\1\111\3\uffff\1\112"+
            "\1\uffff\1\111\5\uffff\1\111\1\uffff\1\111\10\uffff\1\111",
            "\2\5\4\uffff\1\5\1\uffff\1\5\1\116\5\uffff\2\5\2\uffff\1\5"+
            "\6\uffff\1\5\3\uffff\2\5\2\uffff\2\5\7\uffff\2\5\2\uffff\1\120"+
            "\6\uffff\1\117\1\uffff\1\117\2\uffff\1\117\4\uffff\1\117\2\uffff"+
            "\1\5\2\uffff\1\117\5\uffff\1\117\1\uffff\1\117\1\uffff\2\5\5"+
            "\uffff\1\117\2\uffff\1\5\2\uffff\1\5\3\uffff\1\5\1\uffff\1\5"+
            "\7\uffff\1\5",
            "\1\142\41\uffff\1\5\20\uffff\1\5\23\uffff\1\5\11\uffff\1\5"+
            "\2\uffff\1\5",
            "\2\5\4\uffff\1\5\1\uffff\2\5\5\uffff\2\5\2\uffff\1\5\6\uffff"+
            "\1\5\3\uffff\2\5\2\uffff\2\5\16\uffff\1\150\3\uffff\1\5\1\uffff"+
            "\1\5\2\uffff\1\5\4\uffff\1\5\2\uffff\1\5\2\uffff\1\5\5\uffff"+
            "\1\5\1\uffff\1\5\1\uffff\2\5\5\uffff\1\5\2\uffff\1\5\2\uffff"+
            "\1\5\3\uffff\1\5\1\uffff\1\5\7\uffff\1\5",
            "\1\5\7\uffff\1\174\1\5\1\uffff\1\5\4\uffff\1\5",
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
            "\1\u0081",
            "\1\5\7\uffff\1\174\1\5\1\uffff\1\5\4\uffff\1\5",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
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
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA123_eot = DFA.unpackEncodedString(DFA123_eotS);
    static final short[] DFA123_eof = DFA.unpackEncodedString(DFA123_eofS);
    static final char[] DFA123_min = DFA.unpackEncodedStringToUnsignedChars(DFA123_minS);
    static final char[] DFA123_max = DFA.unpackEncodedStringToUnsignedChars(DFA123_maxS);
    static final short[] DFA123_accept = DFA.unpackEncodedString(DFA123_acceptS);
    static final short[] DFA123_special = DFA.unpackEncodedString(DFA123_specialS);
    static final short[][] DFA123_transition;

    static {
        int numStates = DFA123_transitionS.length;
        DFA123_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA123_transition[i] = DFA.unpackEncodedString(DFA123_transitionS[i]);
        }
    }

    class DFA123 extends DFA {

        public DFA123(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 123;
            this.eot = DFA123_eot;
            this.eof = DFA123_eof;
            this.min = DFA123_min;
            this.max = DFA123_max;
            this.accept = DFA123_accept;
            this.special = DFA123_special;
            this.transition = DFA123_transition;
        }
        public String getDescription() {
            return "513:1: forControl options {k=3; } : ( enhancedForControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA123_59 = input.LA(1);

                         
                        int index123_59 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred182_Java()) ) {s = 124;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index123_59);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA123_60 = input.LA(1);

                         
                        int index123_60 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred182_Java()) ) {s = 124;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index123_60);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA123_61 = input.LA(1);

                         
                        int index123_61 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred182_Java()) ) {s = 124;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index123_61);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA123_62 = input.LA(1);

                         
                        int index123_62 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred182_Java()) ) {s = 124;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index123_62);

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA123_63 = input.LA(1);

                         
                        int index123_63 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred182_Java()) ) {s = 124;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index123_63);

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA123_64 = input.LA(1);

                         
                        int index123_64 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred182_Java()) ) {s = 124;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index123_64);

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA123_65 = input.LA(1);

                         
                        int index123_65 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred182_Java()) ) {s = 124;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index123_65);

                        if ( s>=0 ) return s;
                        break;

                    case 7 : 
                        int LA123_66 = input.LA(1);

                         
                        int index123_66 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred182_Java()) ) {s = 124;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index123_66);

                        if ( s>=0 ) return s;
                        break;

                    case 8 : 
                        int LA123_67 = input.LA(1);

                         
                        int index123_67 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred182_Java()) ) {s = 124;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index123_67);

                        if ( s>=0 ) return s;
                        break;

                    case 9 : 
                        int LA123_68 = input.LA(1);

                         
                        int index123_68 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred182_Java()) ) {s = 124;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index123_68);

                        if ( s>=0 ) return s;
                        break;

                    case 10 : 
                        int LA123_69 = input.LA(1);

                         
                        int index123_69 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred182_Java()) ) {s = 124;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index123_69);

                        if ( s>=0 ) return s;
                        break;

                    case 11 : 
                        int LA123_70 = input.LA(1);

                         
                        int index123_70 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred182_Java()) ) {s = 124;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index123_70);

                        if ( s>=0 ) return s;
                        break;

                    case 12 : 
                        int LA123_71 = input.LA(1);

                         
                        int index123_71 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred182_Java()) ) {s = 124;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index123_71);

                        if ( s>=0 ) return s;
                        break;

                    case 13 : 
                        int LA123_72 = input.LA(1);

                         
                        int index123_72 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred182_Java()) ) {s = 124;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index123_72);

                        if ( s>=0 ) return s;
                        break;

                    case 14 : 
                        int LA123_73 = input.LA(1);

                         
                        int index123_73 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred182_Java()) ) {s = 124;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index123_73);

                        if ( s>=0 ) return s;
                        break;

                    case 15 : 
                        int LA123_74 = input.LA(1);

                         
                        int index123_74 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred182_Java()) ) {s = 124;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index123_74);

                        if ( s>=0 ) return s;
                        break;

                    case 16 : 
                        int LA123_75 = input.LA(1);

                         
                        int index123_75 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred182_Java()) ) {s = 124;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index123_75);

                        if ( s>=0 ) return s;
                        break;

                    case 17 : 
                        int LA123_78 = input.LA(1);

                         
                        int index123_78 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred182_Java()) ) {s = 124;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index123_78);

                        if ( s>=0 ) return s;
                        break;

                    case 18 : 
                        int LA123_79 = input.LA(1);

                         
                        int index123_79 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred182_Java()) ) {s = 124;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index123_79);

                        if ( s>=0 ) return s;
                        break;

                    case 19 : 
                        int LA123_80 = input.LA(1);

                         
                        int index123_80 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred182_Java()) ) {s = 124;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index123_80);

                        if ( s>=0 ) return s;
                        break;

                    case 20 : 
                        int LA123_98 = input.LA(1);

                         
                        int index123_98 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred182_Java()) ) {s = 124;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index123_98);

                        if ( s>=0 ) return s;
                        break;

                    case 21 : 
                        int LA123_104 = input.LA(1);

                         
                        int index123_104 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred182_Java()) ) {s = 124;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index123_104);

                        if ( s>=0 ) return s;
                        break;

                    case 22 : 
                        int LA123_129 = input.LA(1);

                         
                        int index123_129 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred182_Java()) ) {s = 124;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index123_129);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 123, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA146_eotS =
        "\7\uffff";
    static final String DFA146_eofS =
        "\7\uffff";
    static final String DFA146_minS =
        "\1\6\1\0\1\41\2\uffff\1\70\1\41";
    static final String DFA146_maxS =
        "\1\161\1\0\1\67\2\uffff\1\70\1\67";
    static final String DFA146_acceptS =
        "\3\uffff\1\2\1\1\2\uffff";
    static final String DFA146_specialS =
        "\1\uffff\1\0\5\uffff}>";
    static final String[] DFA146_transitionS = {
            "\2\3\4\uffff\1\3\1\uffff\1\3\1\1\5\uffff\2\3\2\uffff\1\3\6\uffff"+
            "\1\3\3\uffff\2\3\2\uffff\2\3\22\uffff\1\2\1\uffff\1\2\2\uffff"+
            "\1\2\4\uffff\1\2\2\uffff\1\3\2\uffff\1\2\5\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\2\3\5\uffff\1\2\2\uffff\1\3\2\uffff\1\3\3\uffff"+
            "\1\3\1\uffff\1\3\7\uffff\1\3",
            "\1\uffff",
            "\1\4\11\uffff\1\3\13\uffff\1\5",
            "",
            "",
            "\1\6",
            "\1\4\11\uffff\1\3\13\uffff\1\5"
    };

    static final short[] DFA146_eot = DFA.unpackEncodedString(DFA146_eotS);
    static final short[] DFA146_eof = DFA.unpackEncodedString(DFA146_eofS);
    static final char[] DFA146_min = DFA.unpackEncodedStringToUnsignedChars(DFA146_minS);
    static final char[] DFA146_max = DFA.unpackEncodedStringToUnsignedChars(DFA146_maxS);
    static final short[] DFA146_accept = DFA.unpackEncodedString(DFA146_acceptS);
    static final short[] DFA146_special = DFA.unpackEncodedString(DFA146_specialS);
    static final short[][] DFA146_transition;

    static {
        int numStates = DFA146_transitionS.length;
        DFA146_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA146_transition[i] = DFA.unpackEncodedString(DFA146_transitionS[i]);
        }
    }

    class DFA146 extends DFA {

        public DFA146(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 146;
            this.eot = DFA146_eot;
            this.eof = DFA146_eof;
            this.min = DFA146_min;
            this.max = DFA146_max;
            this.accept = DFA146_accept;
            this.special = DFA146_special;
            this.transition = DFA146_transition;
        }
        public String getDescription() {
            return "674:12: ( type | expression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA146_1 = input.LA(1);

                         
                        int index146_1 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred234_Java()) ) {s = 4;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index146_1);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 146, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

    public static final BitSet FOLLOW_annotations_in_compilationUnit56 = new BitSet(new long[]{0x0840000000000100L,0x00000000CF080404L});
    public static final BitSet FOLLOW_packageDeclaration_in_compilationUnit70 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE090404L});
    public static final BitSet FOLLOW_importDeclaration_in_compilationUnit72 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE090404L});
    public static final BitSet FOLLOW_typeDeclaration_in_compilationUnit75 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
    public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_compilationUnit90 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
    public static final BitSet FOLLOW_typeDeclaration_in_compilationUnit92 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
    public static final BitSet FOLLOW_packageDeclaration_in_compilationUnit113 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE090404L});
    public static final BitSet FOLLOW_importDeclaration_in_compilationUnit116 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE090404L});
    public static final BitSet FOLLOW_typeDeclaration_in_compilationUnit119 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
    public static final BitSet FOLLOW_88_in_packageDeclaration139 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_qualifiedName_in_packageDeclaration141 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_packageDeclaration143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_importDeclaration166 = new BitSet(new long[]{0x0000000000008000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_importDeclaration168 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_qualifiedName_in_importDeclaration171 = new BitSet(new long[]{0x0001080000000000L});
    public static final BitSet FOLLOW_43_in_importDeclaration174 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_importDeclaration176 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_importDeclaration180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_typeDeclaration203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_typeDeclaration213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceModifiers_in_classOrInterfaceDeclaration236 = new BitSet(new long[]{0x0040000000000100L,0x0000000000080004L});
    public static final BitSet FOLLOW_classDeclaration_in_classOrInterfaceDeclaration239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDeclaration_in_classOrInterfaceDeclaration243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceModifier_in_classOrInterfaceModifiers267 = new BitSet(new long[]{0x0840000000000002L,0x00000000CE000400L});
    public static final BitSet FOLLOW_annotation_in_classOrInterfaceModifier287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_classOrInterfaceModifier300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_classOrInterfaceModifier315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_classOrInterfaceModifier327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_classOrInterfaceModifier341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_classOrInterfaceModifier354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_classOrInterfaceModifier369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_classOrInterfaceModifier385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_modifiers407 = new BitSet(new long[]{0x0840000000000002L,0x00000444CE200400L});
    public static final BitSet FOLLOW_normalClassDeclaration_in_classDeclaration427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDeclaration_in_classDeclaration437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_normalClassDeclaration460 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_Identifier_in_normalClassDeclaration462 = new BitSet(new long[]{0x0002000000000000L,0x0000100000008100L});
    public static final BitSet FOLLOW_typeParameters_in_normalClassDeclaration464 = new BitSet(new long[]{0x0000000000000000L,0x0000100000008100L});
    public static final BitSet FOLLOW_72_in_normalClassDeclaration476 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
    public static final BitSet FOLLOW_type_in_normalClassDeclaration478 = new BitSet(new long[]{0x0000000000000000L,0x0000100000008000L});
    public static final BitSet FOLLOW_79_in_normalClassDeclaration491 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
    public static final BitSet FOLLOW_typeList_in_normalClassDeclaration493 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_classBody_in_normalClassDeclaration505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_typeParameters528 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_typeParameter_in_typeParameters530 = new BitSet(new long[]{0x0010008000000000L});
    public static final BitSet FOLLOW_39_in_typeParameters533 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_typeParameter_in_typeParameters535 = new BitSet(new long[]{0x0010008000000000L});
    public static final BitSet FOLLOW_52_in_typeParameters539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_typeParameter558 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_typeParameter561 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
    public static final BitSet FOLLOW_typeBound_in_typeParameter563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeBound592 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_typeBound595 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
    public static final BitSet FOLLOW_type_in_typeBound597 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ENUM_in_enumDeclaration618 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_Identifier_in_enumDeclaration620 = new BitSet(new long[]{0x0000000000000000L,0x0000100000008000L});
    public static final BitSet FOLLOW_79_in_enumDeclaration623 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
    public static final BitSet FOLLOW_typeList_in_enumDeclaration625 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_enumBody_in_enumDeclaration629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_enumBody648 = new BitSet(new long[]{0x0041008000008000L,0x0001000000000000L});
    public static final BitSet FOLLOW_enumConstants_in_enumBody650 = new BitSet(new long[]{0x0001008000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_39_in_enumBody653 = new BitSet(new long[]{0x0001000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_enumBodyDeclarations_in_enumBody656 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_enumBody659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumConstant_in_enumConstants678 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_enumConstants681 = new BitSet(new long[]{0x0040000000008000L});
    public static final BitSet FOLLOW_enumConstant_in_enumConstants683 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_annotations_in_enumConstant708 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_Identifier_in_enumConstant711 = new BitSet(new long[]{0x0000000100000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_arguments_in_enumConstant713 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_classBody_in_enumConstant716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_enumBodyDeclarations740 = new BitSet(new long[]{0x5843000000008102L,0x00001644EE3C1446L});
    public static final BitSet FOLLOW_classBodyDeclaration_in_enumBodyDeclarations743 = new BitSet(new long[]{0x5843000000008102L,0x00001644EE3C1446L});
    public static final BitSet FOLLOW_normalInterfaceDeclaration_in_interfaceDeclaration768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationTypeDeclaration_in_interfaceDeclaration778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_normalInterfaceDeclaration801 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_Identifier_in_normalInterfaceDeclaration803 = new BitSet(new long[]{0x0002000000000000L,0x0000100000000100L});
    public static final BitSet FOLLOW_typeParameters_in_normalInterfaceDeclaration805 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000100L});
    public static final BitSet FOLLOW_72_in_normalInterfaceDeclaration809 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
    public static final BitSet FOLLOW_typeList_in_normalInterfaceDeclaration811 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_interfaceBody_in_normalInterfaceDeclaration815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList838 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_typeList841 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
    public static final BitSet FOLLOW_type_in_typeList843 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_108_in_classBody868 = new BitSet(new long[]{0x5843000000008100L,0x00011644EE3C1446L});
    public static final BitSet FOLLOW_classBodyDeclaration_in_classBody870 = new BitSet(new long[]{0x5843000000008100L,0x00011644EE3C1446L});
    public static final BitSet FOLLOW_112_in_classBody873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_interfaceBody896 = new BitSet(new long[]{0x5843000000008100L,0x00010644EE3C1446L});
    public static final BitSet FOLLOW_interfaceBodyDeclaration_in_interfaceBody898 = new BitSet(new long[]{0x5843000000008100L,0x00010644EE3C1446L});
    public static final BitSet FOLLOW_112_in_interfaceBody901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_classBodyDeclaration920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_classBodyDeclaration930 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_block_in_classBodyDeclaration933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_classBodyDeclaration943 = new BitSet(new long[]{0x5042000000008100L,0x00000200201C1046L});
    public static final BitSet FOLLOW_memberDecl_in_classBodyDeclaration945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericMethodOrConstructorDecl_in_memberDecl968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberDeclaration_in_memberDecl978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_memberDecl988 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_Identifier_in_memberDecl990 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_voidMethodDeclaratorRest_in_memberDecl992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_memberDecl1002 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_constructorDeclaratorRest_in_memberDecl1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDeclaration_in_memberDecl1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDeclaration_in_memberDecl1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_memberDeclaration1047 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_methodDeclaration_in_memberDeclaration1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDeclaration_in_memberDeclaration1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParameters_in_genericMethodOrConstructorDecl1074 = new BitSet(new long[]{0x5000000000008000L,0x0000020020141042L});
    public static final BitSet FOLLOW_genericMethodOrConstructorRest_in_genericMethodOrConstructorDecl1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_genericMethodOrConstructorRest1100 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_105_in_genericMethodOrConstructorRest1104 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_Identifier_in_genericMethodOrConstructorRest1107 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_methodDeclaratorRest_in_genericMethodOrConstructorRest1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_genericMethodOrConstructorRest1119 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_constructorDeclaratorRest_in_genericMethodOrConstructorRest1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_methodDeclaration1140 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_methodDeclaratorRest_in_methodDeclaration1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarators_in_fieldDeclaration1161 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_fieldDeclaration1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_interfaceBodyDeclaration1190 = new BitSet(new long[]{0x5042000000008100L,0x00000200201C1046L});
    public static final BitSet FOLLOW_interfaceMemberDecl_in_interfaceBodyDeclaration1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_interfaceBodyDeclaration1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceMethodOrFieldDecl_in_interfaceMemberDecl1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceGenericMethodDecl_in_interfaceMemberDecl1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_interfaceMemberDecl1241 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_Identifier_in_interfaceMemberDecl1243 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_voidInterfaceMethodDeclaratorRest_in_interfaceMemberDecl1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDeclaration_in_interfaceMemberDecl1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDeclaration_in_interfaceMemberDecl1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_interfaceMethodOrFieldDecl1288 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_Identifier_in_interfaceMethodOrFieldDecl1290 = new BitSet(new long[]{0x0084000100000000L});
    public static final BitSet FOLLOW_interfaceMethodOrFieldRest_in_interfaceMethodOrFieldDecl1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constantDeclaratorsRest_in_interfaceMethodOrFieldRest1315 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_interfaceMethodOrFieldRest1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceMethodDeclaratorRest_in_interfaceMethodOrFieldRest1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaratorRest1350 = new BitSet(new long[]{0x0081000000000000L,0x0000102000000000L});
    public static final BitSet FOLLOW_55_in_methodDeclaratorRest1353 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_methodDeclaratorRest1355 = new BitSet(new long[]{0x0081000000000000L,0x0000102000000000L});
    public static final BitSet FOLLOW_101_in_methodDeclaratorRest1368 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_qualifiedNameList_in_methodDeclaratorRest1370 = new BitSet(new long[]{0x0001000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_methodBody_in_methodDeclaratorRest1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_methodDeclaratorRest1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameters_in_voidMethodDeclaratorRest1433 = new BitSet(new long[]{0x0001000000000000L,0x0000102000000000L});
    public static final BitSet FOLLOW_101_in_voidMethodDeclaratorRest1436 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_qualifiedNameList_in_voidMethodDeclaratorRest1438 = new BitSet(new long[]{0x0001000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_methodBody_in_voidMethodDeclaratorRest1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_voidMethodDeclaratorRest1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameters_in_interfaceMethodDeclaratorRest1501 = new BitSet(new long[]{0x0081000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_55_in_interfaceMethodDeclaratorRest1504 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_interfaceMethodDeclaratorRest1506 = new BitSet(new long[]{0x0081000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_interfaceMethodDeclaratorRest1511 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_qualifiedNameList_in_interfaceMethodDeclaratorRest1513 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_interfaceMethodDeclaratorRest1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParameters_in_interfaceGenericMethodDecl1540 = new BitSet(new long[]{0x5000000000008000L,0x0000020020141042L});
    public static final BitSet FOLLOW_type_in_interfaceGenericMethodDecl1543 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_105_in_interfaceGenericMethodDecl1547 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_Identifier_in_interfaceGenericMethodDecl1550 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_interfaceMethodDeclaratorRest_in_interfaceGenericMethodDecl1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameters_in_voidInterfaceMethodDeclaratorRest1583 = new BitSet(new long[]{0x0001000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_voidInterfaceMethodDeclaratorRest1586 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_qualifiedNameList_in_voidInterfaceMethodDeclaratorRest1588 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_voidInterfaceMethodDeclaratorRest1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameters_in_constructorDeclaratorRest1615 = new BitSet(new long[]{0x0000000000000000L,0x0000102000000000L});
    public static final BitSet FOLLOW_101_in_constructorDeclaratorRest1618 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_qualifiedNameList_in_constructorDeclaratorRest1620 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_constructorBody_in_constructorDeclaratorRest1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_constantDeclarator1643 = new BitSet(new long[]{0x0084000000000000L});
    public static final BitSet FOLLOW_constantDeclaratorRest_in_constantDeclarator1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1668 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_variableDeclarators1671 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1673 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator1694 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_variableDeclarator1697 = new BitSet(new long[]{0x500003310260D0C0L,0x0002128920D41242L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constantDeclaratorRest_in_constantDeclaratorsRest1724 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_constantDeclaratorsRest1727 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_constantDeclarator_in_constantDeclaratorsRest1729 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_55_in_constantDeclaratorRest1751 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_constantDeclaratorRest1753 = new BitSet(new long[]{0x0084000000000000L});
    public static final BitSet FOLLOW_50_in_constantDeclaratorRest1757 = new BitSet(new long[]{0x500003310260D0C0L,0x0002128920D41242L});
    public static final BitSet FOLLOW_variableInitializer_in_constantDeclaratorRest1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_variableDeclaratorId1782 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_variableDeclaratorId1785 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_variableDeclaratorId1787 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_arrayInitializer1845 = new BitSet(new long[]{0x500003310260D0C0L,0x0003128920D41242L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer1848 = new BitSet(new long[]{0x0000008000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_39_in_arrayInitializer1851 = new BitSet(new long[]{0x500003310260D0C0L,0x0002128920D41242L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer1853 = new BitSet(new long[]{0x0000008000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_39_in_arrayInitializer1858 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_arrayInitializer1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_modifier1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_modifier1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_modifier1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_modifier1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_modifier1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_modifier1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_modifier1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_modifier1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_modifier1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_modifier1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_modifier1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_modifier1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedName_in_packageOrTypeName2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_enumConstantName2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedName_in_typeName2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceType_in_type2065 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_type2068 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_type2070 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type2077 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_type2080 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_type2082 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_Identifier_in_classOrInterfaceType2095 = new BitSet(new long[]{0x0002080000000002L});
    public static final BitSet FOLLOW_typeArguments_in_classOrInterfaceType2097 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_classOrInterfaceType2101 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_Identifier_in_classOrInterfaceType2103 = new BitSet(new long[]{0x0002080000000002L});
    public static final BitSet FOLLOW_typeArguments_in_classOrInterfaceType2105 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_74_in_variableModifier2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_variableModifier2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_typeArguments2243 = new BitSet(new long[]{0x5020000000008000L,0x0000000020141042L});
    public static final BitSet FOLLOW_typeArgument_in_typeArguments2245 = new BitSet(new long[]{0x0010008000000000L});
    public static final BitSet FOLLOW_39_in_typeArguments2248 = new BitSet(new long[]{0x5020000000008000L,0x0000000020141042L});
    public static final BitSet FOLLOW_typeArgument_in_typeArguments2250 = new BitSet(new long[]{0x0010008000000000L});
    public static final BitSet FOLLOW_52_in_typeArguments2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeArgument2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_typeArgument2287 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000100L});
    public static final BitSet FOLLOW_set_in_typeArgument2290 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
    public static final BitSet FOLLOW_type_in_typeArgument2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedName_in_qualifiedNameList2323 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_qualifiedNameList2326 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_qualifiedName_in_qualifiedNameList2328 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_32_in_formalParameters2349 = new BitSet(new long[]{0x5040000200008000L,0x0000000020141442L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameters2351 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_formalParameters2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifiers_in_formalParameterDecls2377 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
    public static final BitSet FOLLOW_type_in_formalParameterDecls2379 = new BitSet(new long[]{0x0000100000008000L});
    public static final BitSet FOLLOW_formalParameterDeclsRest_in_formalParameterDecls2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest2404 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_formalParameterDeclsRest2407 = new BitSet(new long[]{0x5040000000008000L,0x0000000020141442L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameterDeclsRest2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_formalParameterDeclsRest2421 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_methodBody2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_constructorBody2465 = new BitSet(new long[]{0x784303310260D1D0L,0x00031B9FFEDC766EL});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_constructorBody2467 = new BitSet(new long[]{0x784103310260D1D0L,0x00031B9FFEDC766EL});
    public static final BitSet FOLLOW_blockStatement_in_constructorBody2470 = new BitSet(new long[]{0x784103310260D1D0L,0x00031B9FFEDC766EL});
    public static final BitSet FOLLOW_112_in_constructorBody2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation2492 = new BitSet(new long[]{0x0000000000000000L,0x0000000900000000L});
    public static final BitSet FOLLOW_set_in_explicitConstructorInvocation2495 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation2503 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_explicitConstructorInvocation2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_explicitConstructorInvocation2515 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_explicitConstructorInvocation2517 = new BitSet(new long[]{0x0002000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation2519 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_explicitConstructorInvocation2522 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation2524 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_explicitConstructorInvocation2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_qualifiedName2546 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_qualifiedName2549 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_Identifier_in_qualifiedName2551 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_integerLiteral_in_literal2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_literal2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharacterLiteral_in_literal2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal2607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_literal2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_annotations2716 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_annotation2736 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_annotationName_in_annotation2738 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_annotation2742 = new BitSet(new long[]{0x504003330260D0C0L,0x0002128920D41242L});
    public static final BitSet FOLLOW_elementValuePairs_in_annotation2746 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_elementValue_in_annotation2750 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_annotation2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_annotationName2779 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_annotationName2782 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_Identifier_in_annotationName2784 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_elementValuePair_in_elementValuePairs2805 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_elementValuePairs2808 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_elementValuePair_in_elementValuePairs2810 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_Identifier_in_elementValuePair2831 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_elementValuePair2833 = new BitSet(new long[]{0x504003310260D0C0L,0x0002128920D41242L});
    public static final BitSet FOLLOW_elementValue_in_elementValuePair2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_elementValue2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_elementValue2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementValueArrayInitializer_in_elementValue2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_elementValueArrayInitializer2901 = new BitSet(new long[]{0x504003B10260D0C0L,0x0003128920D41242L});
    public static final BitSet FOLLOW_elementValue_in_elementValueArrayInitializer2904 = new BitSet(new long[]{0x0000008000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_39_in_elementValueArrayInitializer2907 = new BitSet(new long[]{0x504003310260D0C0L,0x0002128920D41242L});
    public static final BitSet FOLLOW_elementValue_in_elementValueArrayInitializer2909 = new BitSet(new long[]{0x0000008000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_39_in_elementValueArrayInitializer2916 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_elementValueArrayInitializer2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_annotationTypeDeclaration2943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_annotationTypeDeclaration2945 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_Identifier_in_annotationTypeDeclaration2947 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_annotationTypeBody_in_annotationTypeDeclaration2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_annotationTypeBody2972 = new BitSet(new long[]{0x5840000000008100L,0x00010444EE3C1446L});
    public static final BitSet FOLLOW_annotationTypeElementDeclaration_in_annotationTypeBody2975 = new BitSet(new long[]{0x5840000000008100L,0x00010444EE3C1446L});
    public static final BitSet FOLLOW_112_in_annotationTypeBody2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_annotationTypeElementDeclaration3002 = new BitSet(new long[]{0x5040000000008100L,0x00000000201C1046L});
    public static final BitSet FOLLOW_annotationTypeElementRest_in_annotationTypeElementDeclaration3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_annotationTypeElementRest3027 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_annotationMethodOrConstantRest_in_annotationTypeElementRest3029 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_annotationTypeElementRest3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalClassDeclaration_in_annotationTypeElementRest3041 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_annotationTypeElementRest3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalInterfaceDeclaration_in_annotationTypeElementRest3054 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_annotationTypeElementRest3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDeclaration_in_annotationTypeElementRest3067 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_annotationTypeElementRest3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationTypeDeclaration_in_annotationTypeElementRest3080 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_annotationTypeElementRest3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationMethodRest_in_annotationMethodOrConstantRest3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationConstantRest_in_annotationMethodOrConstantRest3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_annotationMethodRest3139 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_annotationMethodRest3141 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_annotationMethodRest3143 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_defaultValue_in_annotationMethodRest3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarators_in_annotationConstantRest3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_defaultValue3192 = new BitSet(new long[]{0x504003310260D0C0L,0x0002128920D41242L});
    public static final BitSet FOLLOW_elementValue_in_defaultValue3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_block3215 = new BitSet(new long[]{0x784103310260D1D0L,0x00031B9FFEDC766EL});
    public static final BitSet FOLLOW_blockStatement_in_block3217 = new BitSet(new long[]{0x784103310260D1D0L,0x00031B9FFEDC766EL});
    public static final BitSet FOLLOW_112_in_block3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclarationStatement_in_blockStatement3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_blockStatement3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement3287 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_localVariableDeclarationStatement3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifiers_in_localVariableDeclaration3308 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
    public static final BitSet FOLLOW_type_in_localVariableDeclaration3310 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_variableDeclarators_in_localVariableDeclaration3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifier_in_variableModifiers3335 = new BitSet(new long[]{0x0040000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_block_in_statement3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSERT_in_statement3363 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_expression_in_statement3365 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_47_in_statement3368 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_expression_in_statement3370 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_statement3374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_statement3384 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_parExpression_in_statement3386 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
    public static final BitSet FOLLOW_statement_in_statement3388 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_statement3398 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
    public static final BitSet FOLLOW_statement_in_statement3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_statement3412 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_statement3414 = new BitSet(new long[]{0x504103310260D0C0L,0x0002028920D41642L});
    public static final BitSet FOLLOW_forControl_in_statement3416 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_statement3418 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
    public static final BitSet FOLLOW_statement_in_statement3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_statement3430 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_parExpression_in_statement3432 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
    public static final BitSet FOLLOW_statement_in_statement3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_statement3444 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
    public static final BitSet FOLLOW_statement_in_statement3446 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_statement3448 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_parExpression_in_statement3450 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_statement3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_statement3462 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_block_in_statement3464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000801L});
    public static final BitSet FOLLOW_catches_in_statement3476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_statement3478 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_block_in_statement3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catches_in_statement3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_statement3506 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_block_in_statement3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_statement3528 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_parExpression_in_statement3530 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_statement3532 = new BitSet(new long[]{0x8000000000000000L,0x0001000000000010L});
    public static final BitSet FOLLOW_switchBlockStatementGroups_in_statement3534 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_statement3536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_statement3546 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_parExpression_in_statement3548 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_block_in_statement3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_statement3560 = new BitSet(new long[]{0x500103310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_expression_in_statement3562 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_statement3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_statement3575 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_expression_in_statement3577 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_statement3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_statement3589 = new BitSet(new long[]{0x0001000000008000L});
    public static final BitSet FOLLOW_Identifier_in_statement3591 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_statement3594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_statement3604 = new BitSet(new long[]{0x0001000000008000L});
    public static final BitSet FOLLOW_Identifier_in_statement3606 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_statement3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_statement3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementExpression_in_statement3630 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_statement3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_statement3642 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_statement3644 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
    public static final BitSet FOLLOW_statement_in_statement3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchClause_in_catches3669 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_catchClause_in_catches3672 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_catchClause3697 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_catchClause3699 = new BitSet(new long[]{0x5040000000008000L,0x0000000020141442L});
    public static final BitSet FOLLOW_formalParameter_in_catchClause3701 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_catchClause3703 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_block_in_catchClause3705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifiers_in_formalParameter3724 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
    public static final BitSet FOLLOW_type_in_formalParameter3726 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameter3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchBlockStatementGroup_in_switchBlockStatementGroups3756 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_switchLabel_in_switchBlockStatementGroup3783 = new BitSet(new long[]{0xF84103310260D1D2L,0x00021B9FFEDC767EL});
    public static final BitSet FOLLOW_blockStatement_in_switchBlockStatementGroup3786 = new BitSet(new long[]{0x784103310260D1D2L,0x00021B9FFEDC766EL});
    public static final BitSet FOLLOW_63_in_switchLabel3810 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_constantExpression_in_switchLabel3812 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_switchLabel3814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_switchLabel3824 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_enumConstantName_in_switchLabel3826 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_switchLabel3828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_switchLabel3838 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_switchLabel3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enhancedForControl_in_forControl3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInit_in_forControl3881 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_forControl3884 = new BitSet(new long[]{0x500103310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_expression_in_forControl3886 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_forControl3889 = new BitSet(new long[]{0x500003310260D0C2L,0x0002028920D41242L});
    public static final BitSet FOLLOW_forUpdate_in_forControl3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forInit3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifiers_in_enhancedForControl3944 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
    public static final BitSet FOLLOW_type_in_enhancedForControl3946 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_Identifier_in_enhancedForControl3948 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_enhancedForControl3950 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_expression_in_enhancedForControl3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forUpdate3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_parExpression3992 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_expression_in_parExpression3994 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_parExpression3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList4019 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_expressionList4022 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_expression_in_expressionList4024 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_expression_in_statementExpression4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_constantExpression4068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_expression4091 = new BitSet(new long[]{0x0416444890000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_expression4094 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_expression_in_expression4096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_assignmentOperator4121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_assignmentOperator4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_assignmentOperator4141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_assignmentOperator4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_assignmentOperator4161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_assignmentOperator4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_assignmentOperator4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_assignmentOperator4191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_assignmentOperator4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_assignmentOperator4222 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_assignmentOperator4226 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_assignmentOperator4230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_assignmentOperator4264 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_assignmentOperator4268 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_assignmentOperator4272 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_assignmentOperator4276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_assignmentOperator4307 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_assignmentOperator4311 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_assignmentOperator4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalExpression4344 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_conditionalExpression4348 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalExpression4350 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_conditionalExpression4352 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalExpression4354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression4376 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_conditionalOrExpression4380 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression4382 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression4404 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_conditionalAndExpression4408 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression4410 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression4432 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_inclusiveOrExpression4436 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression4438 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression4460 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_exclusiveOrExpression4464 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression4466 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression4488 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_andExpression4492 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression4494 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression4516 = new BitSet(new long[]{0x0008000004000002L});
    public static final BitSet FOLLOW_set_in_equalityExpression4520 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression4528 = new BitSet(new long[]{0x0008000004000002L});
    public static final BitSet FOLLOW_relationalExpression_in_instanceOfExpression4550 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_instanceOfExpression4553 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
    public static final BitSet FOLLOW_type_in_instanceOfExpression4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4576 = new BitSet(new long[]{0x0012000000000002L});
    public static final BitSet FOLLOW_relationalOp_in_relationalExpression4580 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4582 = new BitSet(new long[]{0x0012000000000002L});
    public static final BitSet FOLLOW_49_in_relationalOp4617 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_relationalOp4621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_relationalOp4651 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_relationalOp4655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_relationalOp4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_relationalOp4687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4707 = new BitSet(new long[]{0x0012000000000002L});
    public static final BitSet FOLLOW_shiftOp_in_shiftExpression4711 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4713 = new BitSet(new long[]{0x0012000000000002L});
    public static final BitSet FOLLOW_49_in_shiftOp4744 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_shiftOp4748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_shiftOp4780 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_shiftOp4784 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_shiftOp4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_shiftOp4818 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_shiftOp4822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4852 = new BitSet(new long[]{0x0000011000000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression4856 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4864 = new BitSet(new long[]{0x0000011000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4886 = new BitSet(new long[]{0x0000200408000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression4890 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4904 = new BitSet(new long[]{0x0000200408000002L});
    public static final BitSet FOLLOW_36_in_unaryExpression4930 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_unaryExpression4942 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_unaryExpression4954 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_unaryExpression4966 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_unaryExpressionNotPlusMinus4997 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus4999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_unaryExpressionNotPlusMinus5009 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus5011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpression_in_unaryExpressionNotPlusMinus5021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus5031 = new BitSet(new long[]{0x00800A2000000002L});
    public static final BitSet FOLLOW_selector_in_unaryExpressionNotPlusMinus5033 = new BitSet(new long[]{0x00800A2000000002L});
    public static final BitSet FOLLOW_32_in_castExpression5059 = new BitSet(new long[]{0x5000000000000000L,0x0000000020141042L});
    public static final BitSet FOLLOW_primitiveType_in_castExpression5061 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_castExpression5063 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_unaryExpression_in_castExpression5065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_castExpression5074 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_type_in_castExpression5077 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_expression_in_castExpression5081 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_castExpression5084 = new BitSet(new long[]{0x500000010260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_castExpression5086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_primary5105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_primary5115 = new BitSet(new long[]{0x0080080100000002L});
    public static final BitSet FOLLOW_43_in_primary5118 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_Identifier_in_primary5120 = new BitSet(new long[]{0x0080080100000002L});
    public static final BitSet FOLLOW_identifierSuffix_in_primary5124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_primary5135 = new BitSet(new long[]{0x0000080100000000L});
    public static final BitSet FOLLOW_superSuffix_in_primary5137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary5147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_primary5157 = new BitSet(new long[]{0x5002000000008000L,0x0000000020141042L});
    public static final BitSet FOLLOW_creator_in_primary5159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_primary5169 = new BitSet(new long[]{0x0080080100000002L});
    public static final BitSet FOLLOW_43_in_primary5172 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_Identifier_in_primary5174 = new BitSet(new long[]{0x0080080100000002L});
    public static final BitSet FOLLOW_identifierSuffix_in_primary5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_primary5189 = new BitSet(new long[]{0x0080080000000000L});
    public static final BitSet FOLLOW_55_in_primary5192 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_primary5194 = new BitSet(new long[]{0x0080080000000000L});
    public static final BitSet FOLLOW_43_in_primary5198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_primary5200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_primary5210 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_primary5212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_primary5214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_identifierSuffix5234 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_identifierSuffix5236 = new BitSet(new long[]{0x0080080000000000L});
    public static final BitSet FOLLOW_43_in_identifierSuffix5240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_identifierSuffix5242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_identifierSuffix5253 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_expression_in_identifierSuffix5255 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_identifierSuffix5257 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_arguments_in_identifierSuffix5270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_identifierSuffix5280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_identifierSuffix5282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_identifierSuffix5292 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_explicitGenericInvocation_in_identifierSuffix5294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_identifierSuffix5304 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_identifierSuffix5306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_identifierSuffix5316 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_identifierSuffix5318 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_arguments_in_identifierSuffix5320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_identifierSuffix5330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_identifierSuffix5332 = new BitSet(new long[]{0x0002000000008000L});
    public static final BitSet FOLLOW_innerCreator_in_identifierSuffix5334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_creator5353 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
    public static final BitSet FOLLOW_createdName_in_creator5355 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator5357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createdName_in_creator5367 = new BitSet(new long[]{0x0080000100000000L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_creator5370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator5374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceType_in_createdName5394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_createdName5404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_innerCreator5427 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_Identifier_in_innerCreator5430 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_classCreatorRest_in_innerCreator5432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_arrayCreatorRest5451 = new BitSet(new long[]{0x510003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_56_in_arrayCreatorRest5465 = new BitSet(new long[]{0x0080000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_55_in_arrayCreatorRest5468 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_arrayCreatorRest5470 = new BitSet(new long[]{0x0080000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_arrayInitializer_in_arrayCreatorRest5474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest5488 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_arrayCreatorRest5490 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_arrayCreatorRest5493 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest5495 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_arrayCreatorRest5497 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_arrayCreatorRest5502 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_arrayCreatorRest5504 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_arguments_in_classCreatorRest5535 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_classBody_in_classCreatorRest5537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitGenericInvocation5561 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_Identifier_in_explicitGenericInvocation5563 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_arguments_in_explicitGenericInvocation5565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_nonWildcardTypeArguments5588 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
    public static final BitSet FOLLOW_typeList_in_nonWildcardTypeArguments5590 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_nonWildcardTypeArguments5592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_selector5615 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_Identifier_in_selector5617 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_arguments_in_selector5619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_selector5630 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_selector5632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_selector5642 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_selector5644 = new BitSet(new long[]{0x0000080100000000L});
    public static final BitSet FOLLOW_superSuffix_in_selector5646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_selector5656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_selector5658 = new BitSet(new long[]{0x0002000000008000L});
    public static final BitSet FOLLOW_innerCreator_in_selector5660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_selector5670 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_expression_in_selector5672 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_selector5674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arguments_in_superSuffix5697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_superSuffix5707 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_Identifier_in_superSuffix5709 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_arguments_in_superSuffix5711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_arguments5731 = new BitSet(new long[]{0x500003330260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_expressionList_in_arguments5733 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_arguments5736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotations_in_synpred5_Java56 = new BitSet(new long[]{0x0840000000000100L,0x00000000CF080404L});
    public static final BitSet FOLLOW_packageDeclaration_in_synpred5_Java70 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE090404L});
    public static final BitSet FOLLOW_importDeclaration_in_synpred5_Java72 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE090404L});
    public static final BitSet FOLLOW_typeDeclaration_in_synpred5_Java75 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
    public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_synpred5_Java90 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
    public static final BitSet FOLLOW_typeDeclaration_in_synpred5_Java92 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_synpred113_Java2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_synpred117_Java2492 = new BitSet(new long[]{0x0000000000000000L,0x0000000900000000L});
    public static final BitSet FOLLOW_set_in_synpred117_Java2495 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_arguments_in_synpred117_Java2503 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_synpred117_Java2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_synpred128_Java2716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclarationStatement_in_synpred151_Java3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_synpred152_Java3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_synpred157_Java3398 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
    public static final BitSet FOLLOW_statement_in_synpred157_Java3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catches_in_synpred162_Java3476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_synpred162_Java3478 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_block_in_synpred162_Java3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catches_in_synpred163_Java3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchLabel_in_synpred178_Java3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_synpred180_Java3810 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_constantExpression_in_synpred180_Java3812 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_synpred180_Java3814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_synpred181_Java3824 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_enumConstantName_in_synpred181_Java3826 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_synpred181_Java3828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enhancedForControl_in_synpred182_Java3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_synpred186_Java3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred198_Java4212 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_synpred198_Java4214 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_synpred198_Java4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred199_Java4252 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_synpred199_Java4254 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_synpred199_Java4256 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_synpred199_Java4258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred200_Java4297 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_synpred200_Java4299 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_synpred200_Java4301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred211_Java4609 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_synpred211_Java4611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred212_Java4643 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_synpred212_Java4645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred215_Java4736 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_synpred215_Java4738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred216_Java4770 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_synpred216_Java4772 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_synpred216_Java4774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred217_Java4810 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_synpred217_Java4812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpression_in_synpred229_Java5021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred233_Java5059 = new BitSet(new long[]{0x5000000000000000L,0x0000000020141042L});
    public static final BitSet FOLLOW_primitiveType_in_synpred233_Java5061 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_synpred233_Java5063 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_unaryExpression_in_synpred233_Java5065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred234_Java5077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred236_Java5118 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_Identifier_in_synpred236_Java5120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierSuffix_in_synpred237_Java5124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred242_Java5172 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_Identifier_in_synpred242_Java5174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierSuffix_in_synpred243_Java5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred249_Java5253 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_expression_in_synpred249_Java5255 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_synpred249_Java5257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred262_Java5493 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
    public static final BitSet FOLLOW_expression_in_synpred262_Java5495 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_synpred262_Java5497 = new BitSet(new long[]{0x0000000000000002L});

}