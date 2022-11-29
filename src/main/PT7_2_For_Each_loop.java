package main;

public class PT7_2_For_Each_loop {
    public static void main(String[] args) {
        String[] frutas = new String[] { "Maçã", "Laranja", "Uva", "Goiaba" };

        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }

    /**
     *
     * Então, quando você deve usar o loop for-each? Sempre que puder.
     * Isso realmente embeleza seu código.
     * Infelizmente, você não pode usá-lo em todos os lugares.
     * Considere, por exemplo, um método que remove com base no iterador. O programa precisa acessar o iterador para remover o elemento atual.
     * O loop for-each oculta o iterador, então você não pode chamar remove. Portanto, o loop for-each não é utilizável para filtragem.
     * Da mesma forma, não é utilizável para loops em que você precisa substituir elementos em uma lista ou array ao percorrê-la.
     * Por fim, não é utilizável para loops que devem iterar em várias coleções em paralelo.
     * Essas deficiências eram conhecidas pelos projetistas, que tomaram a decisão consciente de optar por uma construção limpa e simples que cobriria a grande maioria dos casos.
     *
     */
}
