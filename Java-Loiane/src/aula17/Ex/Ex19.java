package aula17.Ex;

// Média Aritmética

import java.util.Scanner;

public class Ex19 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos Semestres: ");
        int semetreste = input.nextInt();

        double nota;
        double soma = 0;

        for (int i=0; i<semetreste; i++){

            System.out.print("Nota " + (i+1) + ": ");
            nota = input.nextDouble();

            soma += nota;
        }

        double media = soma / semetreste;

        System.out.printf("A média é: %.1f", media);

    }
}
