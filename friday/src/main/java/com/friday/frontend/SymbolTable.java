package com.friday.frontend;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;


public abstract class SymbolTable {
  private Map<String, Symbol> symbols = null;

  protected SymbolTable() {
    this.symbols = new HashMap<>();
  }

  public Symbol retrieve(String id) {
    return this.symbols.getOrDefault(id, null);
  }

  public Symbol retrieveIf(String id, Predicate<Symbol> filter) {
    Symbol candidate = this.symbols.getOrDefault(id, null);
    return candidate != null && filter.test(candidate) ? candidate : null;
  }

  public Symbol mostSimilar(String name, Predicate<Symbol> filter, int maxEditDistance) {
    return null;
  }

  public boolean define(Symbol symbol) {
    if(symbol == null) {
      throw new IllegalArgumentException("Cannot define null symbol in a symbol table");
    } else return this.symbols.putIfAbsent(symbol.getQualifiedId(), symbol) == null;

  }

  public boolean define(String id, Supplier<Symbol> generator) {
    if(this.isDefined(id)) return false;
    return this.define(generator.get());
  }

  public boolean isDefined(String id) {
    return this.symbols.containsKey(id);
  }

  public Stream<Symbol> getSymbols() {
    return this.symbols.values().stream();
  }
  
  public abstract SymbolTable getParent();
}
