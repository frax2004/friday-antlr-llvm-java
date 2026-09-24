package com.friday;
import java.io.PrintStream;
import java.util.List;

import org.stringtemplate.v4.*;


public class Main {

  public static interface CCodegen {
    public final static record Field(String type, String name) {
      public String getType() { return this.type; }
      public String getName() { return this.name; }
    }
    public final static record Param(String type, String name) {
      public String getType() { return this.type; }
      public String getName() { return this.name; }
    }

    public final static record ForwardStructDecl(String name) {
      public String getName() { return this.name; }
    }

    public final static record StructDecl(String name, List<Field> fields) {
      public String getName() { return this.name; }
      public List<Field> getFields() { return this.fields; }
    }

    public final static record ForwardFunctionDecl(String returnType, String name, List<Param> params) {
      public String getReturnType() { return this.returnType;}
      public String getName() { return this.name;}
      public List<Param> getParams() { return this.params;}
    }

    public final static record FunctionDecl(String returnType, String name, List<Param> params) {
      public String getReturnType() { return this.returnType; }
      public String getName() { return this.name; }
      public List<Param> getParams() { return this.params; }
    }

    public static STGroup getGroup() {
      return new STGroupFile("C.stg");
    }

  }

  public static void main(String[] args) {
    STGroup group = CCodegen.getGroup();
    ST template = group.getInstanceOf("program");

    var fwdStructDecls = List.of(
      new CCodegen.ForwardStructDecl("Vector2"),
      new CCodegen.ForwardStructDecl("Vector3")
    );

    var structDecls = List.of(
      new CCodegen.StructDecl(
        "Vector2", 
        List.of(
          new CCodegen.Field("friday_float", "x"),
          new CCodegen.Field("friday_float", "y")
        )
      ),
      new CCodegen.StructDecl(
        "Vector3", 
        List.of(
          new CCodegen.Field("friday_float", "x"),
          new CCodegen.Field("friday_float", "y"),
          new CCodegen.Field("friday_float", "z")
        )
      )
    );

    var fwdFunctionDecls = List.of(
      new CCodegen.ForwardFunctionDecl(
        "Vector2", 
        "_Z7Vector2pl7Vector27Vector2", 
        List.of(
          new CCodegen.Param("Vector2", "lhs"),
          new CCodegen.Param("Vector2", "rhs")
        )
      )
    );

    var functionDecls = List.of(
      new CCodegen.FunctionDecl(
        "Vector2", 
        "_Z7Vector2pl7Vector27Vector2", 
        List.of(
          new CCodegen.Param("Vector2", "lhs"),
          new CCodegen.Param("Vector2", "rhs")
        )
      )
    );

    template.add("forwardStructDecls", fwdStructDecls);
    template.add("structDecls", structDecls);
    template.add("forwardFunctionDecls", fwdFunctionDecls);
    template.add("functionDecls", functionDecls);

    try(var output = new PrintStream("output.c")) {
      output.println(template.render());
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}