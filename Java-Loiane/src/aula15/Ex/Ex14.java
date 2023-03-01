package aula15.Ex;

import java.util.Scanner;

public class Ex14 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double nota1 = ler.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = ler.nextDouble();

        System.out.println("--------------------------------");

        double media = (nota1 + nota2) / 2;

        String conceito = "";

        if (media >= 9){
            conceito = "A";
        } else if (media < 9 & media >= 7.5){
            conceito = "B";
        } else if (media < 7.5 & media >= 6){
            conceito = "C";
        } else if (media < 6 & media >= 4){
            conceito = "D";
        } else{
            conceito = "E";
        }

        System.out.printf("Média: %.1f \nConceito: %s", media, conceito);

        switch(conceito){
            case "A":
            case "B":
            case "C": System.out.print("\nAPROVADO"); break;
            case "D":
            case "E": System.out.print("\nREPROVADO");
        }
    }
}
