package aula17.Ex;

// Potenciação

import java.util.Scanner;

public class Ex13 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Base: ");
        int base = input.nextInt();

        System.out.print("Expoente: ");
        int expoente = input.nextInt();

        int resultado = 0;

        for (int i=1; i<=expoente; i++){
            if (resultado == 0){
                resultado += base;
            } else{
                resultado *= base;
            }
        }
        System.out.print("Resultado = " + resultado);
    }
}
