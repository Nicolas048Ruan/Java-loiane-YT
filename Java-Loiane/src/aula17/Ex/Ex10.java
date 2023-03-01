package aula17.Ex;

// Mostrar números inteiros entre o comeco e fim

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        System.out.print("Começa em que número: ");
        int comeco = input.nextInt();

        System.out.print("Vai até que número: ");
        int fim = input.nextInt();

        for (int i=comeco; i<=fim; i++){
            System.out.print(i + " ");
        }
    }
}
