package aula15.Ex;

import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = ler.nextInt();

        if ((num % 2) == 0){
            System.out.printf("O número %d é PAR!", num);
        } else{
            System.out.printf("O número %d é ÍMPAR!", num);
        }
    }
}
