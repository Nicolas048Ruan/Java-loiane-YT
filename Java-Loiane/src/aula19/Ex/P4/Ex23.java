package aula19.Ex.P4;

import java.util.Scanner;

public class Ex23 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] A = new int[10];

        for (int i=0; i<A.length; i++){
            System.out.print((i+1) + ": ");
            A[i] = input.nextInt();

            if (A[i] % 2 == 1){
                break;
            }
        }
    }
}
