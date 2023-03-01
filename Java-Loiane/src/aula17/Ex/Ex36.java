package aula17.Ex;

import java.util.Scanner;

public class Ex36 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = input.nextInt();

        double soma = 0;

        for (int i=1; i<=n; i++){
            soma += 1 / i;
        }
        System.out.println("Soma: " + soma);
    }
}
