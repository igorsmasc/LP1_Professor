package main;

public class PT3_Datatypes {
    public static void main(String[] args) {
        /**
         *
         * JAVA é uma linguagem fortemente tipada, ou seja,
         * as variáveis precisam ter seu tipo definido na sua criação.
         *
         */

        // Oito tipos primitivos
        // Números inteiros
        byte numByte = 1; // 1 byte | -128 a 127
        short numShort = 2; // 2 bytes | -32.768 a 32.767
        int numInt = 3; // 4 bytes | -2.147.483.648 a 2.147.483.647
        long numLong = 7800000000L; // 8 bytes | -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        long numLong_2 = 7_800_000_000L; // Java permite o uso de underscore _ para separar visualmente números, facilitando a leitura do código.

        System.out.printf("long 1: %d\n", numLong);
        System.out.printf("long 2: %d\n", numLong_2);

        // Números de ponto fluante
        float numFloat = 1.0f; // 4 bytes | 6-7 dígitos decimais significativos
        double numDouble = 2.0; // 8 bytes | 15 dígitos decimais significativos
        System.out.println("Num double " + numDouble);

        /**
         *
         * O tipo double tem o dobro da precisão do tipo float.
         * Para tipos decimais, esse tipo, geralmente, é a escolha padrão.
         * Porém, ele nunca deve ser usado para representar valores exatos, como moedas.
         * Nesse caso, use BigDecimal.
         *
         */

        // Outros tipos primitivos
        boolean isTrue = true;
        char umLetra = 'c';

        // String
        String txt = "Hello, World!";

        /**
         * Constantes
         *
         * Como se pode imaginar, ao contrário das variáveis,
         * onde podemos alterar o seu conteúdo, as constantes representam valores fixos
         * e imutáveis. Sua principal contribuição é referenciar de forma fácil um valor fixo e,
         * caso desejemos alterar, fazê-lo em apenas um ponto do nosso código.
         *
         */

        final int QUANTIDADE_TENTATIVAS = 3;

        final double PI = 3.14159265358979323846;

        // QUANTIDADE_TENTATIVAS = 4;
    }
}
