# ASTGenerator
Sample Java AST built using ANTLR v4

## Prerequisites
* [git](https://git-scm.com/) (optional)
* [Java](http://openjdk.java.net/install/index.html)
* [Gradle](https://gradle.org/install/)

## Build & Run
Once you got java and gradle installed and running
Clone this repository:
```
$ git clone git@github.com:satnam-sandhu/ASTGenerator.git
```
Build and run the ASTGenerator at once:
```
$ gradle runJar
```

or you can run it manually:

```
$ java -jar build/libs/ASTGenerator.jar
```
File `Blabla.java` present in resource directory's AST will be printed:

```
normalClassDeclaration classexample{publicstaticvoidprint(inta){intb=a+1;System.out.println(b);}publicstaticvoidmain(){print(15);}}
  classBody {publicstaticvoidprint(inta){intb=a+1;System.out.println(b);}publicstaticvoidmain(){print(15);}}
    methodDeclaration publicstaticvoidprint(inta){intb=a+1;System.out.println(b);}
      methodModifier public
      methodModifier static
      methodHeader voidprint(inta)
        result void
        methodDeclarator print(inta)
          formalParameter inta
            integralType int
            variableDeclaratorId a
      block {intb=a+1;System.out.println(b);}
        blockStatements intb=a+1;System.out.println(b);
          localVariableDeclarationStatement intb=a+1;
            localVariableDeclaration intb=a+1
              integralType int
              variableDeclarator b=a+1
                variableDeclaratorId b
                additiveExpression a+1
                  expressionName a
                  literal 1
          expressionStatement System.out.println(b);
            methodInvocation System.out.println(b)
              typeName System.out
                packageOrTypeName System
              expressionName b
    methodDeclaration publicstaticvoidmain(){print(15);}
      methodModifier public
      methodModifier static
      methodHeader voidmain()
        result void
        methodDeclarator main()
      block {print(15);}
        expressionStatement print(15);
          methodInvocation print(15)
            methodName print
            literal 15
```
Change the content of `Blabla.java`  to generate your own AST.

## Grammar

The original grammar has been obtained from:

https://github.com/antlr/grammars-v4/tree/master/java8

It is available under the MIT License

## Help

This project was completed only after I refferd to this [repository](https://github.com/ftomassetti/python-ast) by [Federico Tomassetti](https://github.com/ftomassetti)
