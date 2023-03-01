package aula17.Ex;

import java.util.Scanner;

public class Ex27 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas temperaturas: ");
        int qtd = input.nextInt();

        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        double soma = 0;

        for (int i=1; i<=qtd; i++){
            System.out.print("Temperatura " +i+ ": ");
            double temp = input.nextDouble();

            soma += temp;

            if (temp >= maior){
                maior = temp;
            }

            if (temp <= menor){
                menor = temp;
            }
            
        }
        
        double media = soma / qtd;
        System.out.printf("\nMédia: %.1f", media);
        System.out.printf("\nMaior: %.1f", maior);
        System.out.printf("\nMenor: %.1f", menor);
    }
}
