package aula15.Ex;

import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Litros: ");
        double litros = ler.nextDouble();

        System.out.print("Tipo: ");
        String tipo = ler.next();
        
        int perDesconto = 0;
        double total = 0;
        double totDesc = 0;

        double precoGas = 2.5;
        double precoAlc = 1.9;

        if (tipo.equalsIgnoreCase("a")){
            
            if (litros <= 20){
                perDesconto = 3;
            } else{
                perDesconto = 5;
            }
            
            total = litros * precoAlc;

        } else if (tipo.equalsIgnoreCase("g")){

            if (litros <= 20){
                perDesconto = 4;
            } else{
                perDesconto = 6;
            }

            total = litros * precoGas;
        }

        totDesc = (total / 100) * perDesconto;

        double precoPagar = total - totDesc;

        System.out.print("Valor a pagar: R$" + precoPagar);
    }
 }