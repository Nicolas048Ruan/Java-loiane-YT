package aula17.Ex;

// Alterar o Ex anterior para mostrar a soma dos números

import java.util.Scanner;

public class Ex11 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Começa em que número: ");
        int comeco = input.nextInt();

        System.out.print("Vai até que número: ");
        int fim = input.nextInt();

        int soma = 0;

        for (int i=comeco; i<=fim; i++){
            System.out.print(i + " ");
            soma +=i;
        }
        System.out.print("\nA soma entre esses Números é " + soma);
    }
}
