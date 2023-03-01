package aula17.Ex;

import java.util.Scanner;

public class Ex7 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num, maior = 0;

        for (int i = 1; i<=5; i++){
            System.out.print("Digite o "+ i +" número: ");
            num = input.nextInt();

            if (maior == 0){
                maior = num;
            } else if(num >= maior){
                maior = num;
            }
        }
        System.out.print("O maior é o numero " + maior);
    }
}
