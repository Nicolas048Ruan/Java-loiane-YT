package aula19.Ex.P1;

import java.util.Scanner;

public class Ex6 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int[] A = new int[10];

        int[] B = new int[10];

        int[] C = new int[B.length];


        for (int i=0; i<A.length; i++){
            System.out.print("Num posição " + i + ": ");
            A[i] = input.nextInt();

            B[i] = A[i] + 1;
        }

        for (int i=0; i<C.length; i++){
            C[i] = A[i] + B[i];
            System.out.println(A[i] + " + " + B[i] + " = " + C[i]);
        }
    }
}
