package aula13.Ex;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Graus em Calsius: ");
        int grauC = ler.nextInt();

        double grauF = ((grauC * 1.8) + 32);

        System.out.printf("%d°C Calsius em Farenheit fica %.0f°F", grauC, grauF);
    }
}
