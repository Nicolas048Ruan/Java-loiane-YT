package aula19.Ex.P2;

import java.util.Scanner;

public class Ex11 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] A = new int[10];

        int cont = 0;

        for (int i=0; i<A.length; i++){
            System.out.print("Num " + (i+1) + ": ");
            A[i] = input.nextInt();

            if (A[i] % 2 == 0){
                cont++;
            }
        }
        System.out.println("Ao todo tem " + cont + " números pares.");
    }
}
