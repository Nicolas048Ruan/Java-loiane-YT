package aula13.Ex;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Lado: ");
        double lado = ler.nextDouble();

        double area = Math.pow(lado, 2);

        System.out.printf("A area é %.0fcm² e o dobro é %.0fcm²", area, (area * 2));
    }
}
