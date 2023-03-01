package aula13.Ex;

import java.util.Scanner;

public class Ex4 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Primeira nota: ");
        double nota1 = ler.nextDouble();

        System.out.print("Segunda nota: ");
        double nota2 = ler.nextDouble();

        System.out.print("Terceira nota: ");
        double nota3 = ler.nextDouble();

        System.out.print("Quarta nota: ");
        double nota4 = ler.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("A nota bimestral é %.1f", media);
    }
}