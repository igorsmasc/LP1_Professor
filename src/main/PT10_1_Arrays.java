package main;

public class PT10_1_Arrays {

    public static void main(String[] args) {

        // Iniciamos definindo o tamanho
        int[] nums = new int[]{1, 2, 3, 4};

        //Um array é um contêiner de objetos que armazena uma quantidade limitada de elementos de um único tipo. O tamanho do array é definido em sua declaração.
        // Para declarar um array de 10 posições de números inteiros, podemos escrever

        //int[] nums = new int[]{1, 2, 3, 4};
        int[] nums2 = {1, 2, 3, 4};

        for(int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i]);
        }

        // Busca linear
        for(int i = 0; i < nums2.length; i++) {
            if(nums2[i] == 1) {
                System.out.println("achei!");
            }
        }

        // declares an array of integers
        int[] ages;
        // allocates memory for 10 integers
        ages = new int[10];
        // initialize first element
        ages[0] = 10;
        // and so forth
        ages[1] = 15;
        ages[2] = 22;
        ages[3] = 35;
        ages[4] = 37;
        ages[5] = 17;
        ages[6] = 21;
        ages[7] = 19;
        ages[8] = 26;
        ages[9] = 28;
        // Alternatively, you can use the shortcut syntax to create and initialize an array:
        // int[] anArray = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        System.out.println("Element at index 0: " + ages[0]);
        System.out.println("Element at index 1: " + ages[1]);
        System.out.println("Element at index 2: " + ages[2]);
        System.out.println("Element at index 3: " + ages[3]);
        System.out.println("Element at index 4: " + ages[4]);
        System.out.println("Element at index 5: " + ages[5]);
        System.out.println("Element at index 6: " + ages[6]);
        System.out.println("Element at index 7: " + ages[7]);
        System.out.println("Element at index 8: " + ages[8]);
        System.out.println("Element at index 9: " + ages[9]);


        // Tem por objetivo deixar as operações o mais rapido possível
        // Sempre inicia com o index 0
        // Na memória os itens ficam um ao lado do outro

        // Maior vantagem - Acesso Randomico

        // Cada item tem um index
        // inicia sempre com index 0
        // itens do mesmo tipo
        // acesso randomico

        // Tamanho fixo, mas podemos aumentar de algumas formas

        // Utilizado em filas, pilhas e hashtable (dicionario)

    }

}
