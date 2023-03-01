package aula15.Ex;

import java.util.Scanner;

public class Ex16 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int a, b, c;

        double delta, x1, x2;

        System.out.print("Valor A: ");
        a = ler.nextInt();
        if (a != 0){
            System.out.print("Valor B: ");
            b = ler.nextInt();

            System.out.print("Valor C: ");
            c = ler.nextInt();

            System.out.println("----------------------------------");

            delta = (b * b) - (4 * a * c);
            if (delta < 0){
                System.out.print("Delta negativo - A equação não possui raizes reais");
            }else {
                System.out.println("Delta: " + delta);

                if (delta == 0){
                    x1 = ((-b) + Math.sqrt(delta)) / (2 * a);

                    System.out.printf("A equação possui apenas uma raíz: \nx1 = %.2f", x1);
                } else{
                    x1 = ((-b) + Math.sqrt(delta)) / (2 * a);

                    x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
    
                    System.out.printf("A equação possui duas raízes: \nx1 = %2f \nx2 = %2f", x1, x2);
                }
            }
        } else{
            System.out.print("Não é uma equação do segundo grau.");
        }

    }
}