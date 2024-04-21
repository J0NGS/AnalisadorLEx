package com.jongs.AnalisadorLex.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jongs.AnalisadorLex.Lex.Lexer;
import com.jongs.AnalisadorLex.Lex.sym;

import java_cup.runtime.Symbol;

public class TestLexer {
    public static void main(String[] args) throws IOException {
        // Caminhos dos arquivos
        String rootPath = Paths.get("").toAbsolutePath().toString();
        String subPath = "/analisadorlex/src/main/java/com/jongs/AnalisadorLex/test";
        String sourceCode = rootPath + subPath + "/testePrimitiva.OWL";
        String outputFilePath = rootPath + subPath + "/tokens_output.txt";

        // Inicializa o analisador léxico
        Lexer lexical = new Lexer(new FileReader(sourceCode));
        String token;

        // Lista para armazenar todos os tokens
        List<String> tokenList = new ArrayList<>();

        // Mapa para contar a quantidade de cada tipo de token
        Map<String, Integer> tokenCountMap = new HashMap<>();
        Symbol symbol;
        int eof = 0;
        // Loop para processar todos os tokens
        while ((symbol = lexical.next_token()) != null  && eof == 0) {
            // Adiciona o token à lista
            token = symbol.value.toString();
            tokenList.add(token);

            // Atualiza o contador de tokens
            tokenCountMap.put(sym.terminalNames[symbol.sym], tokenCountMap.getOrDefault(sym.terminalNames[symbol.sym], 0) + 1);

            // Exibe o token na linha de comando
            System.out.println("token->" + token);
            System.out.println("tipo do token->" + sym.terminalNames[symbol.sym]);
            System.out.println("--------------------------------------");
            if (token.equals("EOF")) {
                eof = 1;
            }
        }

        // Gera o arquivo de saída com todos os tokens
        exportTokensToFile(tokenList, outputFilePath);

        // Exibe o resumo final dos tokens
        System.out.println("\nResumo Final:");
        for (Map.Entry<String, Integer> entry : tokenCountMap.entrySet()) {
            System.out.println("Token-> " + entry.getKey() + " | Ocorrências-> " + entry.getValue());
        }
    }

    // Função para exportar tokens para um arquivo
    private static void exportTokensToFile(List<String> tokens, String filePath) {
        try (PrintWriter writer = new PrintWriter(filePath)) {
            for (String token : tokens) {
                writer.println(token.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}