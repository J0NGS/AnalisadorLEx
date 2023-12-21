package com.jongs.AnalisadorLex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestLexer {
    public static void main(String[] args) throws IOException {
        // Caminhos dos arquivos
        String rootPath = Paths.get("").toAbsolutePath().toString();
        String subPath = "/analisadorlex/src/main/java/com/jongs/AnalisadorLex/";
        String sourceCode = rootPath + subPath + "/teste.OWL";
        String outputFilePath = rootPath + subPath + "/tokens_output.txt";

        // Inicializa o analisador léxico
        Lexer lexical = new Lexer(new FileReader(sourceCode));
        Token token;

        // Lista para armazenar todos os tokens
        List<Token> tokenList = new ArrayList<>();

        // Mapa para contar a quantidade de cada tipo de token
        Map<String, Integer> tokenCountMap = new HashMap<>();

        // Loop para processar todos os tokens
        while ((token = lexical.yylex()) != null) {
            // Adiciona o token à lista
            tokenList.add(token);

            // Atualiza o contador de tokens
            tokenCountMap.put(token.name, tokenCountMap.getOrDefault(token.name, 0) + 1);

            // Exibe o token na linha de comando
            System.out.println(token.toString());
        }

        // Gera o arquivo de saída com todos os tokens
        exportTokensToFile(tokenList, outputFilePath);

        // Exibe o resumo final dos tokens
        System.out.println("\nResumo Final:");
        for (Map.Entry<String, Integer> entry : tokenCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ocorrência(s)");
        }
    }

    // Função para exportar tokens para um arquivo
    private static void exportTokensToFile(List<Token> tokens, String filePath) {
        try (PrintWriter writer = new PrintWriter(filePath)) {
            for (Token token : tokens) {
                writer.println(token.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}