package aula17.Ex;

import java.util.Scanner;

public class Ex30 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Montar tabuada de: ");
        int tabuada = input.nextInt();

        System.out.print("Começar por: ");
        int inicio = input.nextInt();

        System.out.print("Terminar em: ");
        int fim = input.nextInt();

        int total;

        if (inicio > fim){
            System.out.println("Inválido");
        } else{
            for (int i=inicio; i<=fim; i++){
                total = tabuada * i;
                System.out.printf("\n%d X %d = %d", tabuada, i, total);
            }
        }
    }
}
