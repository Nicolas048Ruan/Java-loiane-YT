package aula19.Ex.P3;

import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double[] Nota1 = new double[10];
        double[] Nota2 = new double[10];

        double[] Result = new double[10];

        for (int i=0; i<10; i++){
            System.out.println("Para o aluno " + (i+1));

            System.out.print("Nota1: ");
            Nota1[i] = input.nextDouble();

            System.out.print("Nota2: ");
            Nota2[i] = input.nextDouble();

            Result[i] = (Nota1[i] + Nota2[i]) / 2;

            System.out.println("--------------------------------------------");
            System.out.print("Aluno " + (i+1) + " - ");
            System.out.print("Média: " + Result[i] + " - ");
            if (Result[i] >= 7){
                System.out.println("Aprovado");
            } else{
                System.out.println("Reprovado");
            }
            System.out.println("--------------------------------------------");
        }
    }
}