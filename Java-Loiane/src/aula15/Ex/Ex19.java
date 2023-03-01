package aula15.Ex;

import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int num1, num2;

        String operação;

        System.out.print("Digite um número: ");
        num1 = ler.nextInt();

        System.out.print("Digite outro número: ");
        num2 = ler.nextInt();

        System.out.print("Sua Operação (+ - / *): ");
        operação = ler.next();

        double resultado = 0;
        boolean valida = true;

        switch(operação){
            case "+": resultado = num1 + num2; break;
            case "-": resultado = num1 - num2; break;
            case "/": resultado = num1 / num2; break;
            case "*": resultado = num1 * num2; break;
            default:
                System.out.println("Operação inválida");
                valida = false;
        }

        if (valida){
            System.out.printf("%d %s %d = %.1f", num1, operação, num2, resultado);

            if (resultado >= 0){
                System.out.print(" - Positivo");
            } else{
                System.out.print(" - Negativo");
            }

            if ((resultado % 2) == 0){
                System.out.print(" - É PAR!");
            } else{
                System.out.print(" - É ÍMPAR!");
            }
 
        }

    }
}
