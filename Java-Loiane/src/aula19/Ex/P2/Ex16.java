package aula19.Ex.P2;

import java.util.Scanner;

public class Ex16 {
   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] A = new int[10];

        int menor15 = 0;
        int igual15 = 0;

        int maior15 = 0;
        int cont = 0;

        for (int i=0; i<A.length; i++){
            System.out.print("Num " + (i+1) + ": ");
            A[i] = input.nextInt();

            if (A[i] < 15){
                menor15 += A[i];
            } else if (A[i] == 15){
                igual15++;
            } else{
                maior15 += A[i];
                cont++;
            }
        }

        System.out.print("Vetor A = ");
        for (int i=0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println("Qtd num == 15: " + igual15);
        System.out.println("Soma num < 15: " + menor15);
        System.out.println("Media num > 15: " + (maior15 / cont));
    }
}
