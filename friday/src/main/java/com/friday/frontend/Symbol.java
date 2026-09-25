package com.friday.frontend;


public interface Symbol {
  String getQualifiedId();
  String getFullQualifiedId();
  String getMangledId();
  SymbolTable getParent();
}
