package aula19.Ex.P5;

import java.util.Scanner;

public class Ex30 {
 
    public static void main(String[] args) {
        
        Scanner input  = new Scanner(System.in);

        int[] A = new int[20];

        int[] B = new int[A.length];

        int[] C = new int[A.length];

        for (int i=0; i<A.length; i++){
            System.out.print("Num-A " + (i+1) + ": ");
            A[i] = input.nextInt();
        }

        int posB = 0;
        int posC = 0;

        for (int i=0; i<A.length; i++){
            if (A[i] % 2 == 0){
                B[posB] = A[i];
                posB++;
            } else{
                C[posC] = A[i];
                posC++;
            }
        }


        System.out.print("Vetor A = ");
        for (int i=0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i=0; i<posB; i++){
            System.out.print(B[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor C = ");
        for (int i=0; i<posC; i++){
            System.out.print(C[i] + " ");
        }
    }
}
