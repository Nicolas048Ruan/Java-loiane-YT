package aula17.Ex;

// Fatorial

import java.util.Scanner;

public class Ex17 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Fatorial: ");
        int num = input.nextInt();

        int teste = num;

        System.out.print(num + "!= ");

        do{
            System.out.print(teste + ".");
            teste--;
            num *= teste;
        } while (teste != 1);
        System.out.print("1 = " + num);
    }
}
