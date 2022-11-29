package main;

public class PT9_1_Funcoes {

//    [modificador] tipo_retorno nome ([argumentos]) {
//        conteudo do método
//    }
public static void main(String[] args) {
    float f = 1.1234f;
    double d = 2.3456;

    System.out.printf("%f\n", f);
    System.out.printf("%.2f\n", f);
    System.out.printf("%f\n", d);
    System.out.printf("%.3f\n", d);
}

    /**
     *
     * public: Pode ser acessado por qualquer outra classe do projeto
     * protected: Podem ser acessados pelos métodos da própria classe, pelas classes do mesmo pacote e pelas classes derivadas.
     * private: Só podem ser acessados pelos métodos da própria classe.
     *
     */

    public int soma(int a, int b) {
        return a + b;
    }

}
