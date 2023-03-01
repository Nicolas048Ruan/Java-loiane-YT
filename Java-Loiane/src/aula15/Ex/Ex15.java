package aula15.Ex;

import java.util.Scanner;

public class Ex15 {
   
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int lado1, lado2, lado3;

        System.out.print("Lado 1: ");
        lado1 = ler.nextInt();

        System.out.print("Lado 2: ");
        lado2 = ler.nextInt();

        System.out.print("Lado 3: ");
        lado3 = ler.nextInt();

        String tipo = "";

        if (lado1 < (lado2 + lado3) || lado2 < (lado1 + lado3) || lado3 < (lado1 + lado2)){
            System.out.print("É um triângulo ");

            if (lado1 == lado2 && lado1 == lado3){
                tipo = "Equilátero";
            } else if (lado1 == lado2 | lado2 == lado3 | lado3 == lado1){
                tipo = "Isósceles";
            } else{
                tipo = "Escaleno ";
            } 
            System.out.print(tipo);
        } else{
            System.out.print("Não é um triângulo.");
        }
    }
}
