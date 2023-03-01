package aula14;

import java.util.Scanner;

public class Condicionais {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Entre com sua idade: ");

        int idade = ler.nextInt();

        if (idade >= 18){
            System.out.println("É maior de idade.");
        }else{
            System.out.println("Não é maior de idade");
        }

        System.out.print("Preço: ");
        double valor = ler.nextDouble();

        if (valor <= 10){
            System.out.println("Está barato.");
        } else if (valor > 10 && valor < 15){
            System.out.println("Peça desconto.");
        } else if (valor >= 15 && valor < 17){
            System.out.println("Pesquise mais.");
        } else{
            System.out.println("Está muito caro.");
        }
    }
}