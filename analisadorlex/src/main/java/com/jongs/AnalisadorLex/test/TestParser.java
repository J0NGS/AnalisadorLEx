package com.jongs.AnalisadorLex.test;

import java.io.FileReader;
import java.nio.file.Paths;

import com.jongs.AnalisadorLex.Lex.CustomSymbolFactory;
import com.jongs.AnalisadorLex.Lex.Lexer;
import com.jongs.AnalisadorLex.Lex.parser;

import java_cup.runtime.Symbol;
import java_cup.runtime.SymbolFactory;

public class TestParser {
    public static void main(String[] args) throws Exception {
        // Caminhos dos arquivos
        CustomSymbolFactory symbolFactory = new CustomSymbolFactory();
        String rootPath = Paths.get("").toAbsolutePath().toString();
        String subPath = "/analisadorlex/src/main/java/com/jongs/AnalisadorLex/test";
        String sourceCode = rootPath + subPath + "/testePrimitiva.OWL";

        // Inicializa o analisador léxico
        Lexer lexer = new Lexer(new FileReader(sourceCode));
        
        // Inicializa o analisador sintático
        parser p = new parser(lexer, symbolFactory);

        try {
            System.out.println("Iniciando análise sintática...");
            Object result = p.parse().value;
            System.out.println("Análise sintática concluída com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro durante a análise sintática:");
            e.printStackTrace();
        }
    }
}