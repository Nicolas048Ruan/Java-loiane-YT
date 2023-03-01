package aula13.Ex;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Quanto voce ganha por hora: ");
        double recbHora = ler.nextDouble();

        System.out.print("Quantas horas trabalhadas: ");
        int horaTrabalhada = ler.nextInt();

        System.out.printf("Seu salario é R$%.2f", (recbHora * horaTrabalhada));
    }
}
