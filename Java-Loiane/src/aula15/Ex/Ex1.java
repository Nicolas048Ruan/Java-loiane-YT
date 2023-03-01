package aula15.Ex;

import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        int num1 = ler.nextInt();

        System.out.print("Segundo número: ");
        int num2 = ler.nextInt();

        if (num1 > num2){
            System.out.print("Primeiro número é maior.");
        } else{
            System.out.print("Segundo número é maior.");
        }
    }
}