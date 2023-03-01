package aula19.Ex.P2;

import java.util.Scanner;

public class Ex14 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] A = new int[10];

        int cont = 0;
        int soma = 0;

        for (int i=0; i<A.length; i++){
            System.out.print("Num " + (i+1) + ": ");
            A[i] = input.nextInt();
            }

        System.out.print("Os números ímpares são: ");
        for (int i=0; i<A.length; i++){
            if (A[i] % 2 == 1){
                System.out.print(A[i] + " ");
                soma += A[i];
                cont++;
            }
        }
        System.out.println("\nA soma é igual a: " + soma);

        double media = soma / cont;
        System.out.printf("A média é igual a: %.1f", media);
    }
}
