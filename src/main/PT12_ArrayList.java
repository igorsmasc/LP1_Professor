package main;

import java.util.ArrayList;
import java.util.Arrays;

public class PT12_ArrayList {
    public static void main(String[] args) {

        // Array
        // Tamanho fixo
        // Podem conter valores primitivos ou objetos

        // ArrayList
        // Tamanho dinamico
        // Podem conter apenas objetos ou wrapper classes

        // Criar

        String[] alunos = new String[10];
        String[] alunos2 = {"Pedro", "Ana", "Joao"};

        ArrayList<String> alunosList = new ArrayList<>();
        ArrayList<String> alunosList2 =
                new ArrayList<>(Arrays.asList("Pedro", "Ana", "Joao"));

        // Buscar um elemento
        System.out.println(alunos2[0]);
        System.out.println(alunosList2.get(0));

        // Tamanho
        System.out.println(alunos2.length);;
        System.out.println(alunosList2.size());

        // Adicionar um novo elemento (não podemos adicionar novos elementos em arrays)
        alunosList2.add("Chico");
        System.out.println(alunosList2.size());

        // Modificar um elemento
        System.out.println("Mudar");
        System.out.println(alunos2[0]);
        alunos2[0] = "Mudei";
        System.out.println(alunos2[0]);

        System.out.println(alunosList2.get(0));
        alunosList2.set(0, "Mudou");
        System.out.println(alunosList2.get(0));

        // Remover um elemento (Não é possivel em arrays)
        System.out.println("Remover");
        System.out.println(alunosList2.get(0));
        alunosList2.remove(0);
        System.out.println(alunosList2.get(0));

        // Mostrar valores
        System.out.println("Print");
        System.out.println(alunos2);
        // A arraylist implementa o método toString
        System.out.println(alunosList2);

        Object variavel = new String("s");
        System.out.println(variavel);

        variavel = 1;
        System.out.println(variavel);

    }
}
