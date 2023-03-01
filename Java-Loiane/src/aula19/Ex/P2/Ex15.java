package aula19.Ex.P2;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] A = new int[10];
        
        int impar = 0;

        for (int i=0; i<A.length; i++){
            System.out.print("Num " + (i+1) + ": ");
            A[i] = input.nextInt();

            if (A[i] % 2 == 1){
                impar++;
            }
        }

        int par = A.length - impar;

        double porcPar = (par * 100) / A.length;
        double porcImpar = 100 - porcPar;

        System.out.print("Vetor A = ");
        for (int i=0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println("Porcentagem Pares: " + porcPar);
        System.out.println("Porcentagem Impares: " + porcImpar);
    }
}
