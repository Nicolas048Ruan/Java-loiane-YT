package aula19.Ex.P1;

import java.util.Scanner;

public class Ex10 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int[] A = new int[10];

        int[] B = new int[A.length];

        for (int i=0; i<A.length; i++){
            System.out.print("NumA posição " + (i+1) + ": ");
            A[i] = input.nextInt();
        }

        for (int i=0; i<B.length; i++){
            B[i] = A[i] % 2;
            System.out.println(A[i] + " % 2 == " + B[i]);
        }         
    }
}
