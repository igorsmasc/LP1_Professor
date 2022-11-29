package main;

public class PT14_2_Finally {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] nums2 = {0, 1, 2, 3};

        for(int i = 0; i < nums.length; i++) {
            try {
                System.out.println(nums[i] + "/" + nums2[i] + " = " + (nums[i]/nums2[i]));
            } catch (ArithmeticException exception) {
                System.out.println("Não é possível dividir por zero");
            }
//            catch (ArrayIndexOutOfBoundsException exception) {
//                System.out.println("Posicao da array inválida");
//            }
            catch (Throwable exception) {
                System.out.println("Ocorreu um erro");
            } finally {
                System.out.println("Faz sempre algo no final");
            }
        }

    }
}
