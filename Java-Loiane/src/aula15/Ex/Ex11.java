package aula15.Ex;

import java.util.Scanner;

public class Ex11 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Salário Atual: R$");
        double salarioAntigo = ler.nextDouble();

        int aumento = 0;
        double novoSlario = 0;

        if (salarioAntigo <= 280){
            aumento = 20;
        } else if (salarioAntigo > 280 & salarioAntigo <= 700){
            aumento = 15;
        } else if (salarioAntigo > 700 & salarioAntigo <= 1500){
            aumento = 10;
        } else{
            aumento = 5;
        }

        novoSlario = salarioAntigo + ((salarioAntigo * aumento) / 100);

        System.out.printf("O sálario de R$%.2f recebe um aumento de %d que adiciona R$%.2f. \nNovo sálario : R$%.2f", salarioAntigo, aumento, (salarioAntigo*aumento)/100, novoSlario);
    }
 }
