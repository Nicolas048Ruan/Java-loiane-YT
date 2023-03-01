package aula13.Ex;

import java.util.Scanner;

public class Ex5 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite uma quantidade de metros: ");
        double metros = ler.nextDouble();

        System.out.printf("%.0fm equivalem a %.0fcm", metros, (metros * 100));
    }
}
