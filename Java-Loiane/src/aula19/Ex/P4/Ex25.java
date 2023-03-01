package aula19.Ex.P4;

import java.util.Scanner;

public class Ex25 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] A = new int[10];

        int[] B = new int[A.length];

        for (int i=0; i<A.length; i++){
            System.out.print("Num " + (i+1) + ": ");
            A[i] = input.nextInt();

            /* if (A[i] % 2 == 0){
                B[i] = 1;
            } else{
                B[i] = 0;
            } */

            // Operador Ternário
            B[i] = (A[i] % 2 == 0) ? 1 : 0; // Isso é a mesma coisa q o if de cima
        }

        System.out.print("A = ");
        for (int i=0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.print("B = ");
        for (int i=0; i<B.length; i++){
            System.out.print(B[i] + " ");
        }
    }
}
