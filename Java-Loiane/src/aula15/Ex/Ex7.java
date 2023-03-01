package aula15.Ex;

import java.util.Scanner;

public class Ex7 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        int num1 = ler.nextInt();
        
        System.out.print("Segundo número: ");
        int num2 = ler.nextInt();
        
        System.out.print("Terceiro número: ");
        int num3 = ler.nextInt();

        // Maior

        System.out.print("O maior é o ");

        if (num1 > num2 & num1 > num3){
            System.out.printf("Primeiro com %d", num1);
        } else if (num2 > num1 & num2 > num3){
            System.out.printf("Segundo com %d", num2);
        } else{
            System.out.printf("Terceiro com %d", num3);
        }

        // Menor

        System.out.print("\nO menor é o ");

        if (num1 < num2 & num1 < num3){
            System.out.printf("Primeiro com %d", num1);
        } else if (num2 < num1 & num2 < num3){
            System.out.printf("Segundo com %d", num2);
        } else{
            System.out.printf("Terceiro com %d", num3);
        }
    }
}