package com.jongs.AnalisadorLex.test;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

import com.jongs.AnalisadorLex.Lex.Lexer;
import com.jongs.AnalisadorLex.Lex.parser;

import java.util.ArrayList;
import java_cup.runtime.Symbol;
import java.nio.file.Paths;

public class TestParser {
    public static void main(String[] args) throws IOException {
        // Caminho do arquivo de entrada
        String rootPath = Paths.get("").toAbsolutePath().toString();
        String subPath = "/analisadorlex/src/main/java/com/jongs/AnalisadorLex/test";
        String sourceCode = rootPath + subPath + "/teste.OWL";

        // Inicializa o analisador sintático
        parser parser = new parser(new Lexer(new FileReader(sourceCode)));

        try {
            // Faz o parsing do arquivo de entrada
            Symbol result = parser.parse();
            // Se a análise sintática for bem-sucedida, exibe o resultado
            System.out.println("Análise sintática concluída com sucesso.");
        } catch (Exception e) {
            // Em caso de erro, exibe a mensagem de erro
            System.out.println("Erro durante a análise sintática: " + e.getMessage());
        }
    }
}
