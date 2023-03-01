package aula13.Ex;

import java.util.Scanner;

public class Ex6 {
    
    public static void main(String[] args) {
      
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o raio do circulo: ");
        double raio = ler.nextDouble();

        //double area = 3.14 * (raio * raio);
        double area = Math.PI * Math.pow(raio, 2);

        System.out.printf("Com o raio de %.0fcm a area do circulo é igual a %.2fcm²", raio, area);
    }
}