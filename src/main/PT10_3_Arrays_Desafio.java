package main;

public class PT10_3_Arrays_Desafio {

    public static void main(String[] args) {

    }

    // Exercicio -> Escreva um metodo que diz se 2 arrays são iguais

    // Desafio 1 -> ReverseArray InPlace - Não pode utilizar mais memória

    public int[] solucao(int[] nums) {
        int inicio = 0;
        int fim = nums.length-1;

        while (inicio < fim) {
            swap(nums, inicio, fim);
            inicio++;
            fim--;
        }

        return nums;
    }

    private void swap(int[] array, int pos1, int pos2) {
        int aux = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = aux;
    }

    public static boolean compareArrays(int[] array01, int[] array02) {
        if(array01.length != array02.length) {
            return false;
        }

        for(int i = 0; i < array01.length; i++) {
            if(array01[i] != array02[i]) {
                return false;
            }
        }

        return true;
    }

}
