package aula17.Ex;

import java.util.Scanner;

public class Ex32 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        boolean naoTerminar = true;

        int cod, qtd;
        double  total = 0;
        String output = "";

        do{
            System.out.print("Código e Quantidade. 00 para sair.");
            cod = input.nextInt();
            qtd = input.nextInt();

            if (cod == 0 && qtd == 0){
                naoTerminar = false;
                output += "Total a pagar = " + total;
            } else{

                if (cod == 100){
                    output += "Cachorro Quente -> R$1,20 * " + qtd;
                    output += " = " + (1.2 * qtd) + "\n";
                    total += 1.2 * qtd;
                } else if (cod == 101){
                    output += "Bauru Simples -> R$1,30 * " + qtd;
                    output += " = " + (1.3 * qtd) + "\n";
                    total += 1.3 * qtd;
                } else if (cod == 102){
                    output += "Bauru com Ovo -> R$1,50 * " + qtd;
                    output += " = " + (1.5 * qtd) + "\n";
                    total += 1.5 * qtd;
                } else if (cod == 103){
                    output += "Hambúrguer -> R$1,20 * " + qtd;
                    output += " = " + (1.2 * qtd) + "\n";
                    total += 1.2 * qtd;
                } else if (cod == 104){
                    output += "Cheeseburguer -> R$1,30 * " + qtd;
                    output += " = " + (1.3 * qtd) + "\n";
                    total += 1.3 * qtd;
                } else if (cod == 105){
                    output += "Refrigerante -> R$1,00 * " + qtd;
                    output += " = " + (1 * qtd) + "\n";
                    total += 1 * qtd;
                }
            }

        } while (naoTerminar);

        System.out.println(output);
    }
}
