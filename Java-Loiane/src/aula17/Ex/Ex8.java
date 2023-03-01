package aula17.Ex;

import java.util.Scanner;

public class Ex8 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int soma = 0;
        double media;

        for (int i=0; i<5; ){
            i++;
            System.out.print("Digite o "+ i +" número: ");
            int num = input.nextInt();
            soma += num;
        }

        media = soma / 5;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}
