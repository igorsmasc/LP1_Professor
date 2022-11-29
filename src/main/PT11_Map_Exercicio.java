package main;

import java.util.HashMap;
import java.util.Map;

public class PT11_Map_Exercicio {

    /**
     *
     * Eleições
     *
     * Faça um programa que recebe o nome de 3 candidatos e inicia uma votação;
     * Para votar, o eleitor deve escrever o nome do candidato.
     * Caso o eleitor vote em um nome que não existe, deverá ser contabilizado um voto nulo.
     * Ao final da votação, mostre o vencedor da eleição com a porcentagem.
     *
     */

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "jose");
        map.put(2, "pedro");
        map.put(3, "ana");

        map.put(2, "clara");

        System.out.println(map);
    }

}
