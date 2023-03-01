package aula19.Ex.P2;

import java.util.Scanner;

public class Ex17 {
   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] A = new int[10];

        int cont = 0;

        for (int i=0; i<A.length; i++){
            System.out.print("Idade: " + (i+1) + ": ");
            A[i] = input.nextInt();

            if (A[i] > 35){
                cont++;
            }
        }

        System.out.print("Vetor A = ");
        for (int i=0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println("Ao todo tem " + cont + " pessoas com mais de 35 anos.");

    }
}
