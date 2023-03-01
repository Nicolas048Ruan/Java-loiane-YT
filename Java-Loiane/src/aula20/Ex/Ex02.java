package Ex;

import java.util.Random;

public class Ex02 {
    
    public static void main(String[] args) {

        int[][] numAleatorios = new int[10][10];

        Random nuRandom = new Random();

        for (int i=0; i<numAleatorios.length; i++){

            for (int j=0; j<numAleatorios[i].length; j++){
                numAleatorios[i][j] = nuRandom.nextInt(100);
            }

        }

        for (int i=0; i<numAleatorios.length; i++){

            for (int j=0; j<numAleatorios[i].length; j++){
                System.out.print(numAleatorios[i][j] + " - ");
            }
            System.out.println();
        }

        int maiorL5 = Integer.MIN_VALUE;
        int menorL5 = Integer.MAX_VALUE;
        for (int i=0; i<numAleatorios[5].length; i++){
            if (numAleatorios[5][i] > maiorL5){
                maiorL5 = numAleatorios[5][i];
            }

            if (numAleatorios[5][i] < maiorL5){
                menorL5 = numAleatorios[5][i];
            }
        }
        System.out.println("Maior linha 5 = " + maiorL5);
        System.out.println("Menor linha 5 = " + menorL5);

        int maiorC7 = Integer.MIN_VALUE;
        int menorC7 = Integer.MAX_VALUE;
        for (int i=0; i<numAleatorios.length; i++){
            if (numAleatorios[i][7] > maiorC7){
                maiorC7 = numAleatorios[i][7];
            }

            if (numAleatorios[i][7] < menorC7){
                menorC7 = numAleatorios[i][7];
            }
        }
        System.out.println("Maior Coluna 7 = " + maiorC7);
        System.out.println("Menor Coluna 7 = " + menorC7);
    }
}