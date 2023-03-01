package aula15.Ex;

import java.util.Scanner;

public class Ex22 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Kg morango: ");
        double qtdMorango = ler.nextDouble();

        System.out.print("Kg maça: ");
        double qtdMaca= ler.nextDouble();

        double precoKgMorang = 0;
        if (qtdMorango <= 5){
            precoKgMorang = 2.5;
        } else{
            precoKgMorang = 2.2;
        }

        double precoKgMaca = 0;
        if (qtdMaca <= 5){
            precoKgMaca = 1.8;
        } else{
            precoKgMaca = 1.5;
        }

        double precoTotMorang = qtdMorango * precoKgMorang;
        double precoTotMaca = qtdMaca * precoKgMaca;

        double precoParcial = precoKgMorang + precoKgMaca;
        double precoTotal = precoParcial;

        if ((qtdMorango + qtdMaca > 8) || precoParcial > 25){
            precoTotal = precoParcial - ((precoParcial / 100) * 10);
        }

        System.out.println("Preço totaç = R$" + precoTotal);
    }
}
