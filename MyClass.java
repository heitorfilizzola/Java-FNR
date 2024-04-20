
<<<<<<< HEAD
=======
// Iniciaremos primeiramente com o básico "Hello Word"

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



//ASSUNTO NÃO VISTO NA FACULDADE

// Operadores Aritiméticos:

        System.out.println(3--);// Subtrai 1 do valor da
        System.out.println(3++);// Adiciona 1 ao valor da variável

// Operadores de Atribuição:

        x = 5       // equivalente a: x = 5
        x += 3      // equivalente a: x = x + 3
        x -= 3      // equivalente a : x = x - 3
        x *= 3      // equivalente a: x = x * 3
        x /= 3      // equivalente a: x = x / 3
        x %= 3      // equivalente a: x = x % 3
        x &= 3      // equivalente a: x = x & 3
        x |= 3      // equivalente a: x = x | 3
        x ^= 3      // equivalente a: x = x ^ 3
        x >>= 3      // equivalente a: x = x >> 3
        x <<= 3      // equivalente a: x = x << 3


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

}
