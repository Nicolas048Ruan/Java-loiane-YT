package aula17.Ex;

import java.util.Scanner;

public class Ex24 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos pães : ");
        int itens = input.nextInt();
        

        if (itens <= 50){
            double valor = 0.18;
            double total = 0;
        
            for (int i=1; i<=itens; i++){
                total += valor;
                System.out.printf("\n%d - R$ %.2f", i, total);
            }
        } else{
            System.out.print("Número maior que 50 é Inválido");
        }
    }
}
