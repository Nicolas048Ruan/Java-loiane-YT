package aula19.Ex.P5;

import java.util.Scanner;

public class Ex34 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] A = new int[10];

        for (int i=0; i<A.length; i++){
            System.out.print("Num-A " + (i+1) + ": ");
            A[i] = input.nextInt();
        }

        System.out.println("Vetor A:");
        for (int i=0; i<A.length; i++){
            System.out.println("Analizando o num " + A[i]);

            for (int j=2; j<A[i]; j++){
                if (j % 2 == 0){
                    System.out.println(j + " - Par");
                }
            }
            System.out.println();
        }
    }
}
