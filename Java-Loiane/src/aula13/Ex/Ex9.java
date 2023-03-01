package aula13.Ex;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Graus em Farenheit: ");
        int grauF = ler.nextInt();

        int grauC = (5 * (grauF - 32) / 9);

        System.out.printf("%d°F Farenheit em Celsius fica %d°C", grauF, grauC);
    }
}