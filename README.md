# Compilador OWL Classes

O Compilador OWL Classes é um analisador léxico junto com um sintático desenvolvido em Java utilizando Jflex e Java Cup para a disciplina de Compiladores. O projeto consiste em oito arquivos simples, cada um desempenhando um papel específico:

1. **Token.java** - Uma classe responsável por representar os tokens gerados pelo analisador léxico.

2. **Lexer.jflex** - O arquivo Lex do analisador léxico, contendo as regras para a geração dos tokens.

3. **Lexer.java** - A classe gerada pelo Jflex que contém a implementação do analisador léxico.

4. **TestLexer.java** - Uma classe de teste que pode ser utilizada para verificar o funcionamento do analisador léxico.

5. **Parser.cup** - Arquivo .cup que gera o analisador sintático com a gramática utilizada e algumas outras configurações.

6. **parser.java** - Arquivo gerado pelo JavaCup baseado no Parser.cup.

7. **sym.java** - tabela de simbolos gerada pelo Parser.cup.

8. **TestParser.java** - Classe de teste que pode ser utilizada para ver o funcionamento do analisador sintático.

## Tratamentos semânticos
O analisador sintático suporta 3 tipos de tratamentos semânticos que foram definidos, todos eles possuem um arquivo de teste e um arquivo "correto" que são os arquivos de teste sem o erro proposital que eles possuem.

1. **ANÁLISE DA PRECEDÊNCIA DOS OPERADORES** - erroPrecedencia1.owl, erroPrecedencia2.owl, Precedencia1.owl, Precedencia2.owl.

2. **VERIFICAÇÃO ESTÁTICA DE TIPOS POR COERÇÃO** - erroCoercao1.owl, erroCoercao2.owl, Coercao1.owl, Coercao2.owl.

3. **VERIFICAÇÃO ESTÁTICA DE TIPOS POR SOBRECARREGAMENTO** - dataProperty.owl, objectProperty.owl.


além disso o projeto tem outros arquivos de teste que são eles: 
**teste.OWL** arquivo da ontologia de exemplo de pizza.
**testeAninhada.OWL** arquivo de teste de classe Aninhada.
**testeCoberta.OWL** arquivo de teste de classe Coberta.
**testeDefinida.OWL** arquivo de teste de classe Definida.
**testeEnumerada.OWL** arquivo de teste de classe Enumerada.
**testeFechamento.OWL** arquivo de teste de classe Axioma de fechamento.

## Execução do Programa
Existem duas execuções, uma para o analisador léxico e outra para o sintático. Para executar o do léxico execute o arquivo TestLex.jar, para executar o do analisador sintático
execute o arquivo TestParser.

Para executar o programa, siga os seguintes passos:

1. Navegue até a pasta `analisadorlex` via linha de comando.

2. Encontre o arquivo `nomeDoArquivo.jar`.

3. Execute o arquivo `nomeDoArquivo.jar` com o comando `Java -jar nomeDoArquivo.jar`.

4. Digite o nome do arquivo de teste que deseja inserir, por exemplo, `testeDefinida.owl`.

Após a execução do analisador léxico, na pasta central do projeto em `/analisadorlex/src/main/java/com/jongs/AnalisadorLex/resources`, será gerado um arquivo chamado **token_output.txt**. Este arquivo conterá todos os tokens lidos durante a execução do programa.
Caso execute o analisador sintático, ele não produzirá nenhum arquvio de saída, mas exbirar toda a análise sintática no cmd.
### Arquivos OWL Personalizados
Caso queira adicionar algum arquivo para teste basta adiciona-lo na pasta `/analisadorlex/src/main/java/com/jongs/AnalisadorLex/resources` que ele ficará disponível para a execução

Certifique-se de seguir essas instruções para uma execução adequada do AnalisadorLex e para obter os resultados esperados.

### OBS
Essa gramática possui um erro, onde não é possivél utilizar o operador ONLY para fazer conexões entre propriedades e imagens de propriedade, tem um arquivo de exemplo para esse erro chamado **erroAnalisador.owl**
