package main;

public class PT9_3_Funcoes_Desafio {
    public static void main(String[] args) {
        // Escreva um programa que retorna o menor multiplo PAR de um número
    }

    public int smallestEvenMultiple(int n) {
        if(n % 2 == 0) {
            return n;
        }

        return n * 2;
    }
}
