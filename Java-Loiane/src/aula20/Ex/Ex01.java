package Ex;

import java.util.Random;

public class Ex01 {
    
    public static void main(String[] args) {
        
        int[][] numAleatorios = new int[4][4];

        Random nuRandom = new Random();

        for (int i=0; i<numAleatorios.length; i++){

            for (int j=0; j<numAleatorios[i].length; j++){
                numAleatorios[i][j] = nuRandom.nextInt(100);
            }

        }

        int maior = Integer.MIN_VALUE;
        int linha = 0;
        int coluna = 0;
        for (int i=0; i<numAleatorios.length; i++){

            for (int j=0; j<numAleatorios[i].length; j++){
                if (numAleatorios[i][j] > maior){
                    maior = numAleatorios[i][j];
                    linha = i;
                    coluna = j;
                }
            }

        }

        for (int i=0; i<numAleatorios.length; i++){

            for (int j=0; j<numAleatorios[i].length; j++){
                System.out.print(numAleatorios[i][j] + " - ");
            }
            System.out.println();
        }

        System.out.println("Maior = " + maior);
        System.out.println("Linha = " + linha);
        System.out.println("Coluna = " + coluna);
    }
}
