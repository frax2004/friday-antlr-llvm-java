package com.friday;


public interface Type {
  public String getName();
  public int getAlignment();
  public int getSize();
  
  public static Type getIntType() {
    return null;
  }

  public static Type getFloatType() {
    return null;
  }

  public static Type getByteType() {
    return null;
  }

  public static Type getVoidType() {
      return null;
  }

  public static interface Conversion {
    public static boolean isAllowed(Type from, Type to) {
      return false;
    }
  }
}
