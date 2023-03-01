package aula17.Ex;

import java.util.Scanner;

public class Ex22 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Quantidade de CDs: ");
        int cds = input.nextInt();

        double valor;
        double soma = 0;

        for (int i=1; i<=cds; i++){
            System.out.print("Informe o valor do CD " +i+ ": ");
            valor = input.nextDouble();

            soma += valor;
        }

        double media = soma / cds;

        System.out.println("Média de cada CD: " + media);
    }
}
