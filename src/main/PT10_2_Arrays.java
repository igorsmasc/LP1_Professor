package main;

public class PT10_2_Arrays {

    public static void main(String[] args) {
        // Operações

        // 1) Adicionar um valor
        // Adicionar um item é muito rápido, porém se a array tiver cheia precisamos aumentar seu tamanho.
        // Opções ->
        // 1 - Iniciar com uma array pequena que poderá aumentar no futuro (+ lento | - memoria)
        // 2 - Iniciar com uma array grande que ficara com espaços vazios ocupando memoria (+ rapido | + memoria)


        // 2) Adicionar um valor em um lugar aleatorio (deve mover todos os outros itens)

        // 3) Remover o ultimo item O(1)

        // 4) Remover um item aleatorio O(n)

        // Vantagens
        // Acesso aleatorio
        // Fácil de implementar e utilizar
        // Muito rápido
        // Devemos utilizar ao manipular o ultimo item ou quando sabemos o seu index

        // Desvantagens
        // Não é dinamica (tamanho fixo)
        // Quando chega na capacidade máxima, precisamos dobrar o tamanha O(n)
        // Geralmente suporta um unico tipo de dado
    }

}
