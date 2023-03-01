package aula15.Ex;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Produto 1: R$");
        double produt1 = ler.nextDouble();

        System.out.print("Produto 2: R$");
        double produt2 = ler.nextDouble();

        System.out.print("Produto 3: R$");
        double produt3 = ler.nextDouble();

        System.out.print("O produto a ser comprado vai ser o ");

        if (produt1 < produt2 & produt1 < produt3){
            System.out.printf("Produto1 com o valor de R$%.2f", produt1);
        } else if (produt2 < produt1 & produt2 < produt3){
            System.out.printf("Produto2 com o valor de R$%.2f", produt2);
        } else{
            System.out.printf("Produto3 com o valor de R$%.2f", produt3);
        }
    }
}