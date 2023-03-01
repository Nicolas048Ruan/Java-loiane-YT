package aula15.Ex;

import java.util.Scanner;

public class Ex5 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Primeira nota: ");
        double nota1 = ler.nextDouble();
        
        System.out.print("Segunda nota: ");
        double nota2 = ler.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7 && media < 9){
            System.out.printf("%.1f Aprovado", media);
        } else if (media < 7){
            System.out.printf("%.1f Reprovado", media);
        } else{
            System.out.printf("%.1f Aprovadocom Distinção", media);
        }
    }
}
