package com.jongs.AnalisadorLex.Lex;

import java_cup.runtime.Symbol;
import java_cup.runtime.SymbolFactory;

public class CustomSymbolFactory implements SymbolFactory {
    @Override
    public Symbol newSymbol(String name, int id) {
        return new Symbol(id);
    }

    @Override
    public Symbol newSymbol(String name, int id, Object value) {
        return new Symbol(id, value);
    }

    @Override
    public Symbol newSymbol(String name, int id, Symbol left, Symbol right) {
        return new Symbol(id, left, right);
    }

    @Override
    public Symbol newSymbol(String name, int id, Symbol left, Object value) {
        return new Symbol(id, left, value);
    }

    @Override
    public Symbol newSymbol(String name, int id, Symbol left, Symbol right, Object value) {
        return new Symbol(id, left, right, value);
    }

    @Override
    public Symbol startSymbol(String name, int id, int state) {
        return new Symbol(id, state);
    }
}