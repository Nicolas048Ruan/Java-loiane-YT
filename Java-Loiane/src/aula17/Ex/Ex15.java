package aula17.Ex;

// Fibonacci

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Quantidade: ");
        int vezes = input.nextInt();

        int n1 = 1;
        int n2 = 1;
        int prox;

        System.out.print(n1 + ", ");
        System.out.print(n1 + ", ");

        for (int i=3; i<=vezes; i++){
            prox = n1 + n2;
            n1 = n2;
            n2 = prox;
            System.out.print(prox + ", ");
        }
    }
}