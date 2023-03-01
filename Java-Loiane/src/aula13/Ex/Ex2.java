package aula13.Ex;

import java.util.Scanner;

public class Ex2 {
    
    public static void main (String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = ler.nextInt();
        System.out.printf("O número informado foi %d.", n);
    }
}
