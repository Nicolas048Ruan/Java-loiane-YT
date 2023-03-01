package aula15.Ex;

import java.util.Scanner;

public class Ex2 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = ler.nextInt();

        if (num > 0){
            System.out.print("Número positivo");
        } else if (num == 0){
            System.out.print("Número neutro");
        } else{
            System.out.print("Número negativo");
        }
    }
}
