package aula13.Ex;

import java.util.Scanner;

public class Ex14 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Tamanho do arquivo: ");
        double tamArquivo = ler.nextDouble();

        System.out.print("Velocidade da internet: ");
        double velInternet = ler.nextDouble();

        double tempo = tamArquivo / velInternet;

        System.out.printf("Tempo de download: %.1f", tempo);
    }
}