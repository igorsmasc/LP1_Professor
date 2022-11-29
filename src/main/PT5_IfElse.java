package main;

import java.util.Scanner;

public class PT5_IfElse {

    public static void main(String[] args) {
        // https://app.diagrams.net/#G1DsCbbRC9Ql1Ip3DqhFOA2d-1pqUV38GW


        int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);

        int idade = 20;

        if(idade >= 18) {
            System.out.println("É maior de idade!");
        } else {
            System.out.println("É menor de idade!");
        }

        // Ternário: ? :
        final String msg = idade >= 10
                ? idade >= 10
                ? "É maior de idade!"
                : "É menor de idade!"
                : "É menor de idade!";

        System.out.println(msg);

        // Exercicio em aula para explicação - ter presença superior a 70%

        Scanner input = new Scanner(System.in);

        System.out.println("Olá, vamos calcular sua presença");
        System.out.println("Quantas aulas tem o curso?");
        double aulas = input.nextInt();

        System.out.println("Quantas vezes voce faltou?");
        double faltas = input.nextInt();
        double presencas = aulas - faltas;

        double presencaTotal = (presencas/aulas) * 100;

        if(presencaTotal >= 70) {

            System.out.println("Parabéns voce teve " + presencaTotal + "% de presença e está aprovado!" );
        } else {
            System.out.println("Oops, voce teve " + presencaTotal + "% de presença e está reprovado!" );
        }
    }
}
