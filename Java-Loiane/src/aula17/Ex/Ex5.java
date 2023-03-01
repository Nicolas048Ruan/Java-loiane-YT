package aula17.Ex;

import java.util.Scanner;

public class Ex5 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Qtd da População A: ");
        int popA = input.nextInt();

        System.out.print("Taxa de crescimento A: ");
        double taxaA = input.nextDouble();

        System.out.print("Qtd da População B: ");
        int popB = input.nextInt();

        System.out.print("Taxa de crescimento B: ");
        double taxaB = input.nextDouble();

        int cont = 0;

        while (popA < popB){
            popA += (popA * taxaA) / 100;
            popB += (popB * taxaB) / 100;
            cont++;
        }
        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Qtd anos: " + cont);
    }
}
