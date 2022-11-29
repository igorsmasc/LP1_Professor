package main;

public class PT14_0_Try_Catch {
    // Tratamento de erros
    // Key words - try, catch, throw, throws, finally

    public static void main(String[] args) {

        int[] nums = new int[4];
        System.out.println("Antes do erro.");
//        nums[4] = 10;
//        System.out.println("Não será mostrado");

        try {
            nums[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Exceção ao acessar indice que não existe");
        }

        System.out.println("Será mostrado");

        int x;

        try {
            x = 10/0;
        } catch (ArithmeticException exception) {
            System.out.println("Problema com a formula");
        }

    }

    // Não tratar as exceções fazem com que o programa finalize
    // Tratar
    // - Permite executar uma lógia caso ocorra um erro
    // - Permite que o programa continue sua execução


}
