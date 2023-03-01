package aula17.Ex;

import java.util.Scanner;

public class Ex18 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Número: ");
        int num = input.nextInt();

        int cont = 0;

        for (int i=1; i<=num; i++){
            if (num % i == 0 ){
                cont +=1;
            }
        }

        if (cont == 2){
            System.out.println("Número Primo");
        } else{
            System.out.println("Número Não é Primo");
        }

    }
}
