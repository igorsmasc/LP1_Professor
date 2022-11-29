package main;

public class PT1_Welcome_to_Java {
    public static void main(String[] args) {
        System.out.print("Hello, World!\n");
        System.out.println("Hello, World!");
        System.out.printf("Hello, %s!\n", "World!");

        /**
         *
         * %d - representa números inteiros
         * %f - representa números floats
         * %2f - representa números doubles
         * %b - representa valores booleanos
         * %c - representa valores char
         */

        System.out.printf("%d\n", 1);
        System.out.printf("%d\n", 15/2);
        System.out.printf("%f\n", 1.2);
        System.out.printf("%f\n", 1.12345);
        System.out.printf("%2f\n", 1.12);
        System.out.printf("%b\n", true);
    }
}
