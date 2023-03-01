package aula17.Ex;

import java.util.Scanner;

public class Ex29 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();

        for (int i=1; i<=num; i++){

            boolean primo = true;

            for (int j=2; j<i; j++){
                if (i % j == 0){
                    primo = false;
                }
            }

            if (primo == true){
                System.out.print(i + " ");
            }
        }

    }
}
