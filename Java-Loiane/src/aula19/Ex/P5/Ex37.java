package aula19.Ex.P5;

import java.util.Scanner;

public class Ex37 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int[] A = new int[15];
        int[] B = new int[A.length];
 
        for (int i=0; i<A.length; i++){
            System.out.print("Num-A " + (i+1) + ": ");
            A[i] = input.nextInt();
        }

        for (int i=0; i<A.length; i++){
            B[i] = 1;
            for (int j=1; j<=A[i]; j++){
                B[i] *= j;
            }
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
    }
}
