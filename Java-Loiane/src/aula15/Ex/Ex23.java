package aula15.Ex;

import java.util.Scanner;

public class Ex23 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Tipo de carne: ");
        System.out.println("1 - file duplo");
        System.out.println("1 - alcatra");
        System.out.println("1 - picanha");
        int tipo = ler.nextInt();

        System.out.print("Quantidade Kg: ");
        double qtd = ler.nextDouble();

        double precoKG = 0;

        if (tipo == 1){

            System.out.println(qtd + "Kg - file duplo");

            if (qtd < 5){
                precoKG = 4.9;
            } else{
                precoKG = 5.8;
            }
        } else if (tipo == 2){

            System.out.println(qtd + "Kg - alcatra");

            if (qtd < 5){
                precoKG = 5.9;
            } else{
                precoKG = 6.8;
            }
        } else if (tipo == 3){

            System.out.println(qtd + "Kg - picanha");

            if (qtd < 5){
                precoKG = 6.9;
            } else{
                precoKG = 7.8;
            }
        }

        double total = qtd * precoKG;
        System.out.print(qtd + "Kg * " + precoKG + " = " + total);

        System.out.print("Cartão digite 1: ");
        int cartao = ler.nextInt();

        if (cartao == 1){
            double desconto = (total / 100) * 5;
            System.out.println("Desconto de R$" + desconto);
            System.out.println("Valor a apagar: R$" + (total - desconto));
        } else{
            System.out.println("Valor a apagar: R$" + total);
        }
    }
}
