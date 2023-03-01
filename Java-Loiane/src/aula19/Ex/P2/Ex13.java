package aula19.Ex.P2;

import java.util.Scanner;

public class Ex13 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] A = new int[10];

        int soma = 0;

        for (int i=0; i<A.length; i++){
            System.out.print("Num " + (i+1) + ": ");
            A[i] = input.nextInt();
        }

        System.out.print("Os números divísiveis por 5 são: ");
        for (int i=0; i<A.length; i++){
            if (A[i] % 5 == 0){
                System.out.print(A[i] + " ");
                soma += A[i];
            }
        }

        System.out.println("\nA soma de todos os elementos é: " + soma);
    }
}
