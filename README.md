# AnalisadorLex

O AnalisadorLex é um analisador léxico desenvolvido em Java utilizando Jflex para a disciplina de Compiladores. O projeto consiste em quatro arquivos simples, cada um desempenhando um papel específico:

1. **Token.java** - Uma classe responsável por representar os tokens gerados pelo analisador léxico.

2. **Lexer.jflex** - O arquivo Lex do analisador léxico, contendo as regras para a geração dos tokens.

3. **Lexer.java** - A classe gerada pelo Jflex que contém a implementação do analisador léxico.

4. **TestLexer.java** - Uma classe de teste que pode ser utilizada para verificar o funcionamento do analisador léxico.

O projeto já inclui um arquivo de teste fornecido pelo professor, chamado **teste.OWL**.

## Execução do Programa

Para executar o programa, siga os seguintes passos:

1. Navegue até a pasta `analisadorlex`.

2. Encontre o arquivo `AnalisadorLex.jar`.

3. Execute o arquivo `AnalisadorLex.jar`. Se estiver utilizando a linha de comando, você verá todos os tokens lidos e um resumo sobre eles.

Após a execução, na pasta central do projeto em `/analisadorlex/src/main/java/com/jongs/AnalisadorLex`, será gerado um arquivo chamado **token_output.txt**. Este arquivo conterá todos os tokens lidos durante a execução do programa.

Certifique-se de seguir essas instruções para uma execução adequada do AnalisadorLex e para obter os resultados esperados.
