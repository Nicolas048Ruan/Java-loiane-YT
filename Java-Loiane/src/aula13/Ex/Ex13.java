package aula13.Ex;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Ganho por hora: R$");
        double ganhoHora = ler.nextDouble();

        System.out.print("Horas trabalhadas por mês: ");
        double horaMes = ler.nextInt();

        System.out.println("------------------------------------");

        double salarioBruto = ganhoHora * horaMes;
        double impostoRenda = (salarioBruto * 11) / 100;
        double inss = (salarioBruto * 8) / 100;
        double sindicato = (salarioBruto * 5) / 100;
        double totalDesconto = impostoRenda + inss + sindicato;
        double salarioLiquido = salarioBruto - totalDesconto;

        System.out.printf("Salário Bruto: R$%.2f ", salarioBruto);
        System.out.printf("\nPagou ao Imposto de Renda: R$%.2f", impostoRenda);
        System.out.printf("\nPagou ao INSS: R$%.2f ", inss);
        System.out.printf("\nPagou ao sindicato: R$%.2f", sindicato);
        System.out.printf("\nTotal de descontos %.2f", totalDesconto);
        System.out.printf("\nSalário Liquido: R$%.2f", salarioLiquido);
    }
}