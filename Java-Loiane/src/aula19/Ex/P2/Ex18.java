package aula19.Ex.P2;

import java.util.Scanner;

public class Ex18 {
   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] A = new int[10];

        int cont = 0;

        int maior = Integer.MIN_VALUE;
        int indexMaior = 0;

        int menor = Integer.MAX_VALUE;
        int indexMenor = 0;

        for (int i=0; i<A.length; i++){
            System.out.print("Idade " + (i+1) + ": ");
            A[i] = input.nextInt();

            if (A[i] >= maior){
                maior = A[i];
                indexMaior = i;
            }

            if (A[i] <= menor){
                menor = A[i];
                indexMenor = i;
            }
        }

        System.out.print("Vetor A = ");
        for (int i=0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println("Maoir idade: " + maior + " - Colocação: " + (indexMaior + 1));
        System.out.println("Menor idade: " + menor + " - Colocação: " + (indexMenor + 1));
    }
}
