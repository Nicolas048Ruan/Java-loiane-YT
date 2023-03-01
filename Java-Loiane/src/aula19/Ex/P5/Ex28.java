package aula19.Ex.P5;

import java.util.Scanner;

public class Ex28 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] A = new int[10];

        int[] B = new int[A.length];

        for (int i=0; i<A.length; i++){
            System.out.print("Num " + (i+1) + ": ");
            A[i] = input.nextInt();

            B[A.length -1 -i] = A[i];
        }

        System.out.print("Vetor A = ");
        for (int i=0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i=0; i<B.length; i++){
            System.out.print(B[i] + " ");
        }
    }
}
