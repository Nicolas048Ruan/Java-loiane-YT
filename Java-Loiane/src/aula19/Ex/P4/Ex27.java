package aula19.Ex.P4;

import java.util.Scanner;

public class Ex27 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] A = new int[10];

        char[] B = new char[A.length];

        for (int i=0; i<A.length; i++){
            System.out.print("Num " + (i+1) + ": ");
            A[i] = input.nextInt();
        }

        for (int i=0; i<B.length; i++){
            if (A[i] < 7){
                B[i] = 'a';
            } else if (A[i] == 7){
                B[i] = 'b';
            } else if(A[i] > 7 && A[i] < 10){
                B[i] = 'c';
            } else if (A[i] == 10){
                B[i] = 'd';
            } else{
                B[i] = 'e';
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
    }
}
