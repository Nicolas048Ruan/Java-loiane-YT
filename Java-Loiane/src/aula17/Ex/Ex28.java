package aula17.Ex;

import java.util.Scanner;

public class Ex28 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();

        int cont = 0;

        for (int i=1; i<=num; i++){
            if (num % i == 0){
                cont++;
            }
        }
        if (cont == 2){
            System.out.print("Número Primo");
        } else{
            System.out.print("Não é um número Primo");
        }
    }
}
