package aula13.Ex;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
    
        Scanner ler = new Scanner(System.in);

        System.out.print("Sua altura: ");
        double altura = ler.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.printf("Seu peso ideal é %.1f", pesoIdeal);
    }
}
