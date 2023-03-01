package aula19.Ex.P5;

import java.util.Scanner;

public class Ex29 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] A = new int[10];

        int[] B = new int[A.length];

        int[] C = new int[A.length * 2];

        for (int i=0; i<A.length; i++){
            System.out.print("Num-A " + (i+1) + ": ");
            A[i] = input.nextInt();

            C[i] = A[i];
        }

        for (int i=0; i<B.length; i++){
            System.out.print("Num-B " + (i+1) + ": ");
            B[i] = input.nextInt();

            C[A.length + i] = B[i];
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
        System.out.println();

        System.out.print("Vetor C = ");
        for (int i=0; i<C.length; i++){
            System.out.print(C[i] + " ");
        }
    }
}
