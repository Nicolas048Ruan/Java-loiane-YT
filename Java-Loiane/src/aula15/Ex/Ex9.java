package aula15.Ex;

import java.util.Scanner;

public class Ex9 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Número 1: ");
        int num1 = ler.nextInt();

        System.out.print("Número 2: ");
        int num2 = ler.nextInt();

        System.out.print("Número 3: ");
        int num3 = ler.nextInt();

        int maior = 0;

        int menor = 0;

        int meio = 0;

        // maior
        if (num1 > num2 & num1 > num3){
            maior = num1;
        } else if (num2 > num1 & num2 > num3){
            maior = num2;
        } else{
            maior = num3;
        }

        // menor
        if (num1 < num2 & num1 < num3){
            menor = num1;
        } else if (num2 < num1 & num2 < num3){
            menor = num2;
        } else{
            menor = num3;
        }

        // meio
        if (num1 < maior & num1 > menor){
            meio = num1;
        } else if (num2 < maior & num2 > menor){
            meio = num2;
        } else{
            meio = num3;
        }

        System.out.printf("O maior é %d, o menor é %d e o do meio é %d", maior, menor, meio);
    }
}
