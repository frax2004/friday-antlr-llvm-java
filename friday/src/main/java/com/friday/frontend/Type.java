package com.friday.frontend;


public interface Type {
  public String getName();
  public int getSize();
  public int getAlignment();

  public static Type getCShortType() {
    return null;
  }

  public static Type getCIntType() {
    return null;
  }

  public static Type getCFloatType() {
    return null;
  }

  public static Type getIntType() {
    return null;
  }

  public static Type getByteType() {
    return null;
  }

  public static Type getBoolType() {
    return null;
  }

  public static Type getFloatType() {
    return null;
  }

  public static Type getVoidptrType() {
    return null;
  }

  public static Type getByteptrType() {
    return null;
  }

  public static Type getVoidType() {
    return null;
  }

  public static Type getOverloadType() {
    return null;
  }

  public static Type getTypeType() {
    return null;
  }

  public static Type getNamespaceType() {
    return null;
  }

  public default boolean isPrimitiveType() {
    return false;
  }

  public default boolean isIntegralType() {
    return false;
  }

  public default boolean isFloatingType() {
    return false;
  }

  public default boolean isSliceType() {
    return false;
  }

  public default boolean isPointerType() {
    return false;
  }

  public default boolean isAggregateType() {
    return false;
  }

  public default boolean isOverloadType() {
    return false;
  }

  public default boolean isFunctionType() {
    return false;
  }

  public default boolean isTypeType() {
    return false;
  }

  public default boolean isErrorType() {
    return false;
  }

  public default boolean isConvertibleTo(Type to) {
    if(to == null) return false;
    if(this == to) return true;
    if(this.isPointerType() && to.isPointerType()) return true;

    Type VOIDPTR = Type.getVoidptrType();

    Type lhs = this.isPointerType() ? VOIDPTR : this;
    Type rhs = to.isPointerType() ? VOIDPTR : this;
    Type INT = Type.getIntType();
    Type BYTE = Type.getByteType();
    Type BOOL = Type.getBoolType();
    Type FLOAT = Type.getFloatType();
    Type CSHORT = Type.getCShortType();
    Type CINT = Type.getCIntType();
    Type CFLOAT = Type.getCFloatType();

    if(lhs == INT && rhs == VOIDPTR) return true;
    else if(lhs == INT && rhs == FLOAT) return true;
    else if(lhs == INT && rhs == BYTE) return true;
    else if(lhs == INT && rhs == BOOL) return true;
    else if(lhs == INT && rhs == CINT) return true;
    else if(lhs == INT && rhs == CSHORT) return true;
    else if(lhs == FLOAT && rhs == INT) return true;
    else if(lhs == FLOAT && rhs == CFLOAT) return true;
    else if(lhs == VOIDPTR && rhs == INT) return true;
    else if(lhs == BYTE && rhs == INT) return true;
    else if(lhs == BOOL && rhs == INT) return true;
    else if(lhs == CINT && rhs == INT) return true;
    else if(lhs == CFLOAT && rhs == FLOAT) return true;
    else if(lhs == CSHORT && rhs == INT) return true;
    else return false;
  }
}
