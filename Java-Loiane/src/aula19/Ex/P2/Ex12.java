package aula19.Ex.P2;

import java.util.Scanner;

public class Ex12 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] A = new int[10];

        int soma = 0;

        for (int i=0; i<A.length; i++){
            System.out.print("Num " + (i+1) + ": ");
            A[i] = input.nextInt();

            soma += A[i];
        }
        System.out.println("A soma de todos os elementos é: " + soma);
    }
}
