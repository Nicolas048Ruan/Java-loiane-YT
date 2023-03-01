package aula15.Ex;

import java.util.Scanner;

public class Ex12 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Valor da hora: R$");
        double valorHr = ler.nextDouble();

        System.out.print("Quantidade de hora: ");
        double qntdHr = ler.nextDouble();

        double salario = valorHr * qntdHr;

        int impostoRenda = 0;

        if (salario > 900 & salario <=1500){
            impostoRenda = 5;
        } else if (salario > 1500 & salario <= 2500){
            impostoRenda = 10;
        } else{
            impostoRenda = 20;
        }

        System.out.printf("Sálario Bruto: R$%.2f", salario);

        if (salario > 900){
            System.out.printf("\n(-) IR ( %d ) - R$%.2f \nINSS ( 10 ) - R$%.2f \nFGTS ( 11 ) - R$%.2f", impostoRenda, (salario*impostoRenda)/100, (salario*10)/100, (salario*11)/100);

            System.out.printf("\nTotal de descontos: R$%.2f", ((salario*impostoRenda)/100 )+((salario*10)/100));

            System.out.printf("\nSálario Líquido: R$%.2f", salario - (((salario*impostoRenda)/100 )+((salario*10)/100)));
        }
    }
}