package main;

public class PT14_3_Stacktrace {
    public static void main(String[] args) {
        // A super classe throwable nos dá métodos uteis para identificar o erro

        // getMessage() - descrição do erro
        // printStackTrace() - stack trace do erro (onde o erro aconteceu)

        int[] nums = {1, 2, 3, 4, 5};
        int[] nums2 = {0, 1, 2, 3};

        for (int i = 0; i < nums.length; i++) {
            try {
                System.out.println(nums[i] + "/" + nums2[i] + " = " + (nums[i] / nums2[i]));
            } catch (ArithmeticException exception) {
                System.out.println("Não é possível dividir por zero");
            }
//            catch (ArrayIndexOutOfBoundsException exception) {
//                System.out.println("Posicao da array inválida");
//            }
            catch (Exception exception) {
                // log4j
                System.out.println("Ocorreu um erro");
                System.out.println(exception.getMessage());;
                exception.printStackTrace();
            }
        }
    }
}
