package aula13.Ex;

import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = ler.nextInt();

        System.out.print("Digite outro número: ");
        int n2 = ler.nextInt();

        System.out.printf("A soma entre %d e %d é %d", n1, n2 , (n1 + n2));
    }
}