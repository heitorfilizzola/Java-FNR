// Iniciaremos primeiramente com o básico "Hello Word"

import java.util.Scanner; // Importa a biblioteca do Scanner utilizado mais a frente

public class MyClass{ /*  Todo código que roda em java deve estar dentro de uma classe, a qual nomeamos como "MyClass". Uma classe sempre deve se iniciar com uma letra maiúscula.
                       * Obs: O nome da classe deve ser SEMPRE o mesmo do nome do arquivo, no qual nesse caso seria "MyClass.java".*/
    
    // Sempre ao codar em java utilizamos o "public static void main(String args[]){}", em que todo código dentro desta função será executado.

    public static void main(String args[]){ 
    

// Printar informações no console/terminal:

    // Exemplo 1

        System.out.println("Exemplo Nº1:");

    /*  System é uma classe embutida no Java que contem membros úteis, como "out", que é a abreviação de "output".
    * O "println(), abreviação de "print line", é usado para "printar" um valor na tela.
    * Devemos ter também atenção de que todo código em java é finalizado com o ";".
    * Todo texto que deseja-se "printar" da função print deve estar entre aspas duplas "".*/

        System.out.println("Hello World!"); 
        System.out.println();
    
    // Também é possivel "printar" números utilizando a função "println", é apenas não utilizarmos as aspas duplas "".

        System.out.println(3);
        System.out.println(232);
        System.out.println(1233211);

    // O mesmo serve para fazer cálculos matemáticos

        System.out.println(3+3);// Soma
        System.out.println(3-3);// Subtração
        System.out.println(2*5);// Multiplicação
        System.out.println(4/2);// Divisão
        System.out.println(25%4);// Resto da divisão
        System.out.println(Math.pow(5,2));// Potenciação

    // Exemplo 2

        System.out.println("Exemplo Nº2:");

    // Também existe a função print(), que é muito similar a "println()", a única diferença é que no "println()" existe uma quebra de linha no fim do output e o "print()" não.
        
        System.out.print("Hello World!");
        System.out.print("Vai aparecer na mesma linha");
        System.out.println();

    // Exemplo 3

        System.out.println();
        System.out.println("Exemplo Nº3:");

    // Outra função é a "printf()", que é herdada do C.

        System.out.printf("%s\n", "Hello World!");

        /* A função "printf()" segue o seguinte formato: 
         *
         * System.out.printf(formato:"", argumentos:"");
         * 
         * Nos formatos podemos utilizar:
         * %d para decimais
         * %s para "strings"
         * %f para float
         * %b para booleano
         * 
         * e também podemos utilizar o "\n" para adicionar uma quebra de linha.
        */


// Variáveis:

    /*Tipos de variáveis:
     * 
     * String -> Utilizadas para guardar textos, seus valores devem estar entre aspas duplas "".
     * int -> Utilizadas para guardar números inteiros, sem decimais.
     * float -> Utilizadas para guardar números "com vírgula", com decimais.
     * double -> Mesma função do "float", porém pode armazenar o dobro de variáveis.
     * char -> Utilizadas para guardar caractéres únicos, como 'a' ou 'B'. Valores char devem estar entre aspas simples ''.
     * boolean -> Utilizadas para guardar valores com 2 estados: true ou false.
     */

    // Declarando Variáveis:

    /*Modelo:
     * tipodavariavel nomedavariavel = valordavariavel;
     */

    // Exemplo 4:

        System.out.println();
        System.out.println("Exemplo Nº4: ");

        String nome = "Pedro";  // Foi criada a variável "nome" e foi definida para ela o valor "Pedro".
        System.out.println(nome);   // Foi "printada" a variavel "nome".

        int meuNum = 15;
        System.out.println(meuNum);

    // Variáveis também podem ser representadas da seguinte forma:
        int meuNum2;
        meuNum2 = 15;
        System.out.println(meuNum2);

    // Note que se você definir um novo valor para uma variável existente, esse valor vai sobrescrever o valor anterior.

        int meuNum3 = 15;
        meuNum3 = 20; // O valor de meuNum3 agora é 20
        System.out.println(meuNum3);

    // Combinar textos com variáveis:

    // Para combinar textos com variáveis, utilizamos o sinal "+".

        String nome2 = "Joao";
        System.out.println("Oi " + nome2);

    // Também é possivel utilizar o sinal "+" para adicionar uma variável a outra:

        String primeiroNome = "Pedro ";
        String segundoNome = "Alves";
        String nomeCompleto = primeiroNome + segundoNome;
        System.out.println(nomeCompleto);

    // Para valores numéricos, o "+" funciona como um operador matemático normalmente:

        int x = 5;
        int y = 6;
        System.out.println(x + y); // Vai printar "11", valor de 5 + 6;

    // Para declarar mais de uma variavel do mesmo tipo, podemos declarar todas na mesma linha utilizando a vírgula ",":

        int x1 = 5, y1 = 6, z = 50;
        System.out.println(x1 + y1 + z);

    // Assim como podemos declarar um único valor para várias variáveis:

        int x2, y2, z1;
        x2 = y2 = z1 = 50;
        System.out.println(x2 + y2 + z1);

// Constantes:

    // Exemplo 5:

    System.out.println();
    System.out.println("Exemplo Nº5: ");
    
    // Declaração de constantes

    /*Se você não quer sobrescrever um valor existente, deve-se utilizar a palavra final
     * (Isso vai declarar a variável como "final" ou "constante", o que significa que não é possivel alterar seu valor.)
     */

    final int meuNum4 = 15;
    // Caso escreva agora "meuNum4 = 20;", o código não irá rodar e irá apresentar um erro: "cannot assign a value to a final variable"
    System.out.println(meuNum4);

// Regras para se declarar uma variável ou constante:

    /*
    *1. Os nomes para as variáveis são case-sensitive("minhaVar" e "MinhaVar" são variaveis diferentes);
    *2. Nomes deve começar com uma letra, um caractere sublinha ou underline (_) ou o símbolo cifrão ($). Os caracteres subseqüentes também podem ser algarismos;
    *3. Não utilizar caracteres especiais, como acentos, símbolos (?/:@#.),ç entre outros;
    *4. As letras podem ser maiúsculas ou minúsculas;
    *5. Não podem ser utilizadas palavras reservadas(Ex: int, boolean). 
    */

// Comandos de leitura de entrada em Java:
        /*  
        *   é necessário a utilização no inicio do código do comando:
        *   import java.util.Scanner;
        *   Depois disso, dentro do seu código você deve utilizar o comando:
        *   Scanner nomedoscanner = new Scanner(System.in); 
        *   para poder criar seu scanner dentro do código
        */

            Scanner kb = new Scanner(System.in);

        //   para utilizar o scanner basta escrever o seguinte comando:

        float read = kb.nextFloat();
        System.out.println("Seu float é: " + read);

        // ou

        int read2 = kb.nextInt();
        System.out.println("Seu inteiro é: " + read2);

        // ou

        String read3 = kb.nextLine();
        System.out.println("Sua String é: " + read3);
    }

// Operadores Relacionais:
// Sempre retornam "true" ou "false"

    /*
     * ==  -> igual
     * !=  -> diferente
     * >   -> maior que
     * >=  -> maior que ou igual
     * <   -> menor que
     * <=  -> menor que ou igual
     */

// Operadores lógicos:

    /*
     * !   -> Negação
     * ||  -> ou
     * &&  -> e
     * ^   -> se forem diferentes (Disjunção exclusiva)
     */

// Expressões booleanas:

    //Expressões que retornam como resultado valores booleanos: true ou false.

    int x = 10;
    int y = 9;
    System.out.println(x > y); // Saída: true, pois 10 é maior que 9



//ASSUNTO NÃO VISTO NA FACULDADE

// Operadores Aritiméticos:

        System.out.println(3--);// Subtrai 1 do valor da
        System.out.println(3++);// Adiciona 1 ao valor da variável

// Operadores de Atribuição:

        //x = 5        equivalente a: x = 5
        //x += 3       equivalente a: x = x + 3
        //x -= 3       equivalente a : x = x - 3
        //x *= 3       equivalente a: x = x * 3
        //x /= 3       equivalente a: x = x / 3
        //x %= 3       equivalente a: x = x % 3
        //x &= 3       equivalente a: x = x & 3
        //x |= 3       equivalente a: x = x | 3
        //x ^= 3       equivalente a: x = x ^ 3
        //x >>= 3       equivalente a: x = x >> 3
        //x <<= 3       equivalente a: x = x << 3


// Identificadores:

        /* 
        *Todas as variáveis devem ser identificadas com um nome único, esses nomes únicos são chamados de identificadores ou "identifiers".
        *Os identificadores podem ser nomes curtos (x e y) ou nomes mais descritivos (idade,volumeTotal). É recomendado o uso de nomes descritivos para poder criar um código mais entendivel
        */

// Data Types:

        // Como ja explicado anteriormente, uma variável em java deve ter seu tipo definido. Esses tipos podem ser definidos em 2 grupos:

        /*
        * Primitive data types: inclui byte, short, int, long, float, double, boolean e char.
        * 
        * byte = 1 byte -> números de inteiros de -128 até 127.
        * short = 2 bytes -> números inteiros de -32,768 até 32,767.
        * int = 4 bytes -> números inteiros de -2,147,483,648 até 2,147,483,647.
        * long = 8 bytes -> números inteiros de -9,223,372,036,854,775,808 até 9,223,372,036,854,775,807.
        * 
        *  float = 4 bytes -> números quebrados, suficiente para guardar de 6 a 7 digitos decimais.
        *  double = 8 bytes -> números quebrados, suficiente para guardar até 15 digitos decimais.
        *  boolean = 1 bit -> guarda valores verdadeiros ou falsos.
        *  char = 2 bytes -> guarda um caractér/letra único ou valores ASCII
        * 
        * 
        * Non-primitive data types(reference types): Inclui String, Arrays e classes.
        * 
        * São denominados como reference types pelo fato de que eles se referem a objetos, a principal diferença entre primitivos e não primitivos é:
        * 1- Primitivos são predefinidos (Já definidos) em java, já os não primitivos não é definido pelo Java, são criados pelo programador (exeto para String).
        * 2- Não primitivos podem ser usados para referir um método para realizar certas operações, enquanto primitivos não.
        * 3- Um primitivo sempre possue um valor, enquanto um não primitivo podem ser "null" ou nulos.
        * 4- Um primitivo começa com letra minúscula, enquanto os não primitivos começam com letras maiúsculas.
        */

// Fundição de tipos:

        /* 
        * Aumentando(Automaticamente): Convertendo um tipo menor para um tipo de maior tamanho:
        * byte -> float -> char -> int -> long -> float -> double
        */

       int meuInt = 9;
       double meuDouble = meuInt; // Fundição automática: int para double.

        System.out.println(meuInt);     // Saída: 9
        System.out.println(meuDouble);  // Saída: 9.0

        /*
        * Diminuindo(Manualmente): Convertendo um tipo maior para um tipo menor tamanho:
        * double -> float -> long -> int -> char -> short -> byte
        */

       double meuDouble1 = 9.78d;
        //Obs: O sufixo "d" no final do número serve para deixar literal ao compilador que o número se trata de um double e evitar possiveis erros de compilação.
       int meuInt1 = (int) meuDuble1;

       System.out.println(meuDouble1);      // Saída: 9.78
       System.out.println(meuInt1);         //Saída: 9

// Tamanho de uma string:

        /*
        * Uma string é na verdade um objeto, no qual contem métodos que podem que podem realizar certas operações.
        * Por exemplo, temos o tamanho da string, que pode ser encontrado utilizando a função "length()":
        */

       String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       System.out.println("O tamanho da string é: " + txt.length());

// Outros comando com strings:

    String txt = "Hello World";
    System.out.println(txt.toUpperCase()); // Saída: "HELLO WORLD"
    System.out.println(txt.toLowerCase()); // Saída: "hello world"

    // Encontrando algo em uma string:

    String txt = "Please locate where 'locate' occurs!";
    System.out.println(txt.indexOf("locate")); // Saída: 7

// Contatenação de uma String:

    // O operador pode ser usado entre strings para conseguir combinar-las, assim como com os outros tipos de variáveis. Isso é chamado cotatenação.

    String primeiroNome = "João";
    String segundoNome = "Pedro";
    System.out.println(primeiroNome + " " + segundoNome); // saída: João Pedro

    // Note que foi adicionado um texto vazio (" ") para criar um espaço entre o primeiro e o segundo nome na saída.

    // Você também pode utilizar o "concat()" para contatenar duas strings:

    String primeiroNome = "João ";
    String segundoNome = "Pedro";
    System.out.println(primeiroNome.concat(segundoNome)); 

    // Obs: Java usa o operador "+" para adição e contatenação. Números são somados e Strings são contatenadas.

// Caractéres especiais em Strings:

    /*
    * Em Java devemos utilizar caractéres especiais para representar aspas simpes, aspas duplas e barra invertida em uma string pelo fato de que
    * uma string é escrita entre aspas duplas, logo seria retornado um erro ao utilizar esses caractéres dentro de uma.
     */

        /* 
        *   \'    ->    '
        *   \"    ->    "
        *   \\    ->    \
         */

    // A sequência \" insere uma aspas dupla em uma string:

    String txt = "Nós somos assim chamados \"Vikings\" vindos do norte.";

    // A sequência \' insere uma aspas simples em uma string:

    String txt = "It\'s alright.";

    // A sequência \\ insere uma barra invertida em uma string:

    String txt = "O caractére \\ é chamado de barra invertida.";

// Outras sequências comuns que são válidas em Java são:

    /*
    * \n    -> Nova linha.
    * \r    -> Carriage Return (Ato de voltar ao inicio da linha seguinte, possui basicamente a mesma função do \n, porém é uma forma de utilização mais antiga.).
    * \t    -> Tab (Funciona da mesma forma que a tecla "tab" em um editor de texto. Adiciona um espaço grande).
    * \b    -> Backspace (Funciona da mesma forma que a tecla "Backspace" do teclado, ou a tecla de apagar).
    * \f    -> Form Feed (Serve como "Quebra de página", utilizado para indicar o fim de uma página ou documento e vai para o inicio de outro).
    */

// Matemática em Java:

    //Math.max(x,y):

        // A função Math.max(x,y) é utilizada para encontrar o maior valor de x e y:

        Math.max(5,10); // saída: 10

    //Math.min(x,y):

        // A função Math.min(x,y) é utilizada para encontrar o menor valor de x e y:

        Math.min(5,10); // saída: 5

    //Math.sqrt(x):

        // A função Math.sqrt(x) é utilizada para mostrar a raiz quadrada de x:

        Math.sqrt(64); // saída: 8.0

    //Math.abs(x):

        // A função serve para retornar o valor absoluto (positivo) do valor de x:

        Math.abs(-4.7); // saída: 4.7

    //Math.random():

        // Retorna um número aleatório entre 0.0 (Inclusivo), e 1.0 (Exclusivo):

        Math.random(); // saída: Número aleatório entre 0.0 e 1.0

        /* Para ter mais controle sobre o número aleatório, por exemplo, se você so quer um número aleatório entre 0 e 100, você pode usar
        a seguinte fórmula:*/

        int numAleatorio = (int)(Math.random() * 101); // 0 a 100

// If ... Else em Java

    // if

        // Utiliza-se o if para especificar um bloco de código a ser executado se a condição for verdadeira.

        if (condicao) {
            // Bloco de código a ser executado se a condição for verdadeira
        }

        // Obs: O if é utilizado em letras minúsculas. Se forem utilizadas letras maiúsculas será gerado um erro em seu cõdigo.

    // else

        // Utiliza-se para especificar o bloco de código a ser executado caso a condição seja falsa.

        if (condicao) {
            // Bloco de código a ser executado se a condição for verdadeira
        } else {
            // Bloco de código a ser executado se a condição for falsa
        }

    // else if

        // Utiliza-se para especificar uma nova condição se a primeira condição for falsa

        if (condicao1) {
            // Bloco de código a ser executado se a condição 1 for verdadeira
        } else if (condicao2) {
            // Bloco de código a ser executado se a condição 1 for falsa e a condição 2 for verdadeira
        } else {
            // Bloco de código a ser executado se a condição 1 for falsa e a condição 2 for falsa
        }

            // Exemplo 6

	            System.out.println();
	            System.out.println("Exemplo Nº6: ");

	            int hora = kb.nextInt();
	            if (6 < hora && hora < 12){
	                System.out.println("Bom dia");
	            } else if (12 < hora && hora < 18){
		                System.out.println("Boa tarde");
	            } else if(18< hora && hora < 00){
	                    System.out.println("Boa noite");
	            } else {
		                System.out.println("Boa madrugada");
                }

            // Se a hora maior que 6 e menor que 12, saída: Bom dia
            // Se a hora maior que 12 e menor que 18, saída: Boa tarde
            // Se a hora maior que 18 e menor que 00, saída: Boa noite
            // Se todos anteriores forem falsos, então, saída: Boa madrugada

    // forma curta de se escrever if ... else

        // Existe também a forma curta do if else, que é conhecida como operador ternario, pelo fato que consiste em 3 operandos.

        // Pode ser usado para substituir multiplas linhas de codigo com uma única linah, e geralmente usado para substituir utilizações simples de if else:

        //variavel = (condicao) ? expressaoVerdade : expressaoFalsa;

            // Invés de escrever:

                int hora = 20
                if (hora < 18) {
                    System.out.println("Bom dia.");
                } else {
                    System.out.println("Boa noite.");
                }

            // Pode-se escrever:

            Int hora = 20
            String resultado = (hora < 18) ? "Bom dia." : "Boa noite.";
            System.out.println(resultado);

// Switch em Java

    // Invés de escrever vários if..else, você pode usar a declaração switch.

    // A declaração switch seleciona um de vários blocos de código para serem executados:

        switch(expressao) {
            case x:
                // bloco de código
                break;
            case y:
                // bloco de código
                break;
            dafault:
                // bloco de código
        } 

    // O valor da expressão é comparado com os valores de cada case. Caso os valores sejam iguais, o bloco de código associado é executado.
    // Quando o compilador java atinje o break, isso para a execução do switch. Assim parando a execução de mais códigos e testes de case dentro do bloco.
    // Quando uma correspondência da expressão com o case é encontrada e o trabalho é feito, é hora de parar, pelo fato que não existe mais nada que seja necessário de testar.

        int dia = 4;
        switch(dia){
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
        // Saída: "Quinta" (dia 4)

    // O default especifica o bloco de código a ser executado caso não haja nenhuma correspondência com os "case".

        int dia = 4;
        switch(dia){
            case 6:
                System.out.println("Hoje é Sábado");
                break;
            case 7:
                System.out.println("Hoje é Domingo");
                break;
            default:
                System.out.println("Ansioso para o fim de semana")
        }
        // Saída: "Ansioso para o fim de semana".
}
