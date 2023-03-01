package aula17.Ex;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        boolean notaValida = false;

        do{
            System.out.print("Digite uma nota entre 0 e 10: ");
            double nota = input.nextDouble();

            if (nota >= 0 && nota <= 10){
                notaValida = true;
                System.out.printf("Você digitou a nota %.1f", nota);
            } else{
                System.out.println("Nota inválida!");
            }
        } while (notaValida == false);
    }
}   