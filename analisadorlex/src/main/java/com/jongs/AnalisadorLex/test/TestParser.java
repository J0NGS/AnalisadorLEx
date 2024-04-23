package com.jongs.AnalisadorLex.test;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

import com.jongs.AnalisadorLex.Compilador.Lexer;
import com.jongs.AnalisadorLex.Compilador.parser;
import com.jongs.AnalisadorLex.Compilador.sym;


public class TestParser {
    public static void main(String[] args) throws IOException {
        // Caminho do arquivo de entrada
        String rootPath = Paths.get("").toAbsolutePath().toString();
        String subPath = "/analisadorlex/src/main/resources";
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo a passar pelo analisador sintático");
        String sourceFile = scn.nextLine(); 
        String sourceCode = rootPath + subPath + "/" + sourceFile;
        

        // Inicializa o analisador sintático
        parser parser = new parser(new Lexer(new FileReader(sourceCode)));
        try {
            // Faz o parsing do arquivo de entrada
            parser.parse();
            // Se a análise sintática for bem-sucedida, exibe o resultado
            System.out.println("=========================");
            System.out.println("Análise sintática concluída com sucesso.");
            System.out.println("=========================");
            System.out.println("Debug Parser: ");            
            parser.debug_parse();
        } catch (Exception e) {
            // Em caso de erro, exibe a mensagem de erro
            System.out.println("Erro durante a análise sintática: " + e.getMessage());
        }
    }
}
