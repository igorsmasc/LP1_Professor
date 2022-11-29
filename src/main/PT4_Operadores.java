package main;

public class PT4_Operadores {
    public static void main(String[] args) {

        // Aritméticos: soma (+), subtração (-), multiplicação (*) e divisão (/);
        int a = 10;
        int b = 2;

        int c = a + b;
        c = a - b;
        c = a * b;
        c = a / b;

        System.out.println(c);

        System.out.printf("soma = %d\n", a + b);
        System.out.printf("subtração = %d\n", a - b);
        System.out.printf("multiplicação = %d\n", a * b);
        System.out.printf("divisão = %d\n", a / b);

        // Lógicos: negação (!), E (&&), OU (||) // duplo pipe
        boolean isFalse = !true;
        System.out.println(isFalse);

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        // Relacionais: maior que (>), menor que (<), igual (==), diferente (!=)
        // >= e <=
        System.out.println(2 > 1);
        System.out.println(2 < 1);
        System.out.println(2 == 1);
        System.out.println(2 != 1);

        // Um operador aritmético especial, e que não foi mencionado, é o mod %. Este operador informa o "resto da divisão"
        int resultado = 3 % 2; // resultado = 1;


        // Operador + também concatena textos

        System.out.println("Ola " + "mundo");
        String nome = "Igor " + "Santos";
        System.out.println("Ola " + nome);

        // Incremento ++ e decremento --

        int numero = 0;
        numero++;

        System.out.println(numero); // 1
        //System.out.println(numero++); // 1
        System.out.println(++numero); // 2

        int x = numero++ + 1;
        int y = ++numero + 1;
        System.out.println(x);
        System.out.println(y);

        int x1 = numero-- + 1;
        int y1 = --numero + 1;
        System.out.println(x);
        System.out.println(y);


    }
}
