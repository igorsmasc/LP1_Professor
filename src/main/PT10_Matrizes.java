package main;

public class PT10_Matrizes {
    public static void main(String[] args) {

        //int[][] matrizInteiros = new int[5][5];

        //int[][] matrizInteiros = {{1,2,3},{4,5,6},{7,8,9}};

        int[][] matrizInteiros = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0; i < matrizInteiros.length; i++) {
            for (int j=0; j < matrizInteiros[i].length; j++) {
                System.out.println(matrizInteiros[i][j]);
            }
        }

    }
}
