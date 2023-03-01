package aula19.Ex.P5;

import java.util.Scanner;

public class Ex32 {
  
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] A = new int[5];

        for (int i=0; i<A.length; i++){
            System.out.print("Num: ");
            A[i] = input.nextInt();

            for (int j=0; j<=10; j++){
                System.out.print(A[i] + " X " + j + " = " + (A[i] * j));
                System.out.println();
            }
            System.out.println("-----------------------------------------");
        }
    }
}
