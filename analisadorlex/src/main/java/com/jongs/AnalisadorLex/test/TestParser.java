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
        int option = 50;

        // Inicializa o analisador sintático
        parser parser = new parser(new Lexer(new FileReader(sourceCode)));
        while (option != 0) {
            try {
                // Faz o parsing do arquivo de entrada
                parser.parse();
                // Se a análise sintática for bem-sucedida, exibe o resultado
                System.out.println("=========================");
                System.out.println("Análise sintática concluída com sucesso.");
                System.out.println("=========================");
                System.out.println("Debug Parser: ");            
                parser.debug_parse();
                System.out.println();
                System.out.println();
            } catch (Exception e) {
                // Em caso de erro, exibe a mensagem de erro
                System.out.println("Erro durante a análise sintática: " + e.getMessage());
            }
            System.out.println("Digite o nome do arquivo a passar pelo analisador sintático ou o número 0 para sair.");
            sourceFile = scn.nextLine();
            if (sourceFile.equals("0"))
                option = 0;
        }
    }
}
