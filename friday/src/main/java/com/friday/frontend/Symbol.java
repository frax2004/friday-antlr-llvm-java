package com.friday.frontend;


public interface Symbol {
  public String getQualifiedId();
  public String getFullQualifiedId();
  public String getMangledId();
  public SymbolTable getParent();
  public Type getType();
}
