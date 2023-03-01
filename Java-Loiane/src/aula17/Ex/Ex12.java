package aula17.Ex;

// Gerador de tabuada

import java.util.Scanner;

public class Ex12 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int num = input.nextInt();

        System.out.println("Tabuada de " + num + ":");

        for (int i=1; i<=10; i++){
            System.out.printf("\n%d X %d = %d", num, i, (num * i));
        }
    }
}
