package main;

import java.util.Scanner;

public class PT14_5_Errors_Exceptions {
    public static void main(String[] args) {
        // Lança a exceção para que outra classe trate dela
        try {
            capturaNumero();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static double capturaNumero() throws Exception {
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        return num;
    }

}
