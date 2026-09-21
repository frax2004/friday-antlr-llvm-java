package com.friday;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.stringtemplate.v4.*;
import org.stringtemplate.v4.misc.ObjectModelAdaptor;


public class Main {

  public static interface CCodegen {
    public final static record Field(String type, String name) {}
    public final static record Param(String type, String name) {}
    public final static record ForwardStructDecl(String name) {}
    public final static record StructDecl(String name, List<Field> fields) {}
    public final static record ForwardFunctionDecl(String returnType, String name, List<Param> params) {}
    public final static record FunctionDecl(String returnType, String name, List<Param> params) {}

    public static STGroup getGroup() {
      STGroup group = new STGroupFile("C.stg");

      for(Class<?> c : CCodegen.class.getDeclaredClasses()) {
        group.registerModelAdaptor(c, new ObjectModelAdaptor<Object>() {
          @Override 
          public Object getProperty(Interpreter intt, ST self, Object o, Object prop, String name) {
            try {
              return o.getClass().getMethod(name).invoke(o);
            } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
              return super.getProperty(intt, self, e, prop, name);
            }
          }
        });
      }
      
      return group;
    }

  }

  public static void main(String[] args) {
    STGroup group = new STGroupFile("C.stg");
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