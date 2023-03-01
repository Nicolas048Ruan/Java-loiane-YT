package aula13.Ex;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
    
        Scanner ler = new Scanner(System.in);

        System.out.print("Número inteiro A: ");
        int numIntA = ler.nextInt();

        System.out.print("Número inteiro B: ");
        int numIntB = ler.nextInt();

        System.out.print("Número real: ");
        double numReal = ler.nextDouble();

        int produto = (numIntA * 2) * (numIntB / 2);
        System.out.printf("O produto do dobro de %d com a metade de %d é %d", numIntA, numIntB, produto);

        double soma = (numIntA * 3) + numReal;
        System.out.printf("\nA soma do triplo de %d com %.2f é %.2f", numIntA, numReal, soma);

        //double cubo = (numReal * numReal * numReal);
        double cubo = Math.pow(numReal, 3);
        System.out.printf("\nO %.2f elevado ao cubo é %.2f", numReal, cubo);
    }
}
