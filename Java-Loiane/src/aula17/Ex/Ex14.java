package aula17.Ex;

// Pedir 10 numeros e mostrar impares e pares

import java.util.Scanner;

public class Ex14 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num;
        int par = 0;
        int impar = 0;

        for (int i=1; i<=10; i++){
            System.out.print(i + " Numero Inteiro: ");
            num = input.nextInt();

            if (num % 2 == 0){
                par++;
            } else{
                impar++;
            }
        }

        System.out.printf("Ao todo são %d números pares.", par);
        System.out.printf("\nAo todo são %d números impares.", impar);

    }
}
