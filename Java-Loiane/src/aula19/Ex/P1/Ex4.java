package aula19.Ex.P1;

import java.util.Scanner;

public class Ex4 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int[] A = new int[15];

        double[] B = new double[A.length];


        for (int i=0; i<A.length; i++){
            System.out.print("Num posição " + i + ": ");
            A[i] = input.nextInt();

        }

        for (int i=0; i<B.length; i++){
            B[i] = Math.sqrt(A[i]);
            System.out.printf("\nA = %d - B = %.1f", A[i], B[i]);
        }
    }
}
