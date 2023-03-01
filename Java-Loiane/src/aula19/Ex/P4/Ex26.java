package aula19.Ex.P4;

import java.util.Scanner;

public class Ex26 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] A = new int[10];

        int[] B = new int[A.length];

        int[] C = new int[A.length];

        for (int i=0; i<A.length; i++){
            System.out.print("Num-A " + (i+1) + ": ");
            A[i] = input.nextInt();
        }

        for (int i=0; i<B.length; i++){
            System.out.print("Num-B " + (i+1) + ": ");
            B[i] = input.nextInt();
        }

        for (int i=0; i<A.length; i++){
            if (A[i] > B[i]){
                C[i] = 1;
            } else if (A[i] == B[i]){
                C[i] = 0;
            } else{
                C[i] = -1;
            }
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
        System.out.println();

        System.out.print("C = ");
        for (int i=0; i<C.length; i++){
            System.out.print(C[i] + " ");
        }
    }
}
