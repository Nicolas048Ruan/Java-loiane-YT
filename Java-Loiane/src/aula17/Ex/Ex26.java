package aula17.Ex;

import java.util.Scanner;

public class Ex26 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Fatorial de: ");
        int fatorial = input.nextInt();

        int total = 1;

        System.out.print(fatorial + "!= ");

        for (int i=fatorial; i>1; i--){
            System.out.print(i + " . ");
            total *= i;
        }
        System.out.print("1 = " + total);
    }
}
