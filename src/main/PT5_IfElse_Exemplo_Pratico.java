package main;

import java.util.Scanner;

public class PT5_IfElse_Exemplo_Pratico {

    public static void main(String[] args) {
        // Na balada só entram pessoas maiores de idade ou a partir de 16
        // Alunos fazer requisito que a partir de 16 anos entram pessoas acompanhadas

        Scanner input = new Scanner(System.in);
        System.out.println("Você deseja entrar na balada? Responda sim ou nao");
        String desejaEntrar = input.nextLine();

        if(desejaEntrar.equals("sim")) {
            System.out.println("Qual sua idade?");
            int idade = input.nextInt();
            if(idade >= 18) {
                System.out.println();
            }


            if (idade >= 16) {
                if(idade == 18)

                System.out.println("Voce esta acompanhado?");
                String acompanhado = input.nextLine();
                // Alunos implementam o "acompanhado"
            }

        } else if(desejaEntrar.equals("nao")) {
            System.out.println("Tchau");

        } else {
            System.out.println("Resposta inválida, tente novamente mais tarde!");
        }


        input.close();
    }
}
