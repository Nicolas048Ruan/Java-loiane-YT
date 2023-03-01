package aula15.Ex;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = ler.nextInt();
        
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            System.out.printf("%d é uma Ano Bissexto", ano);
        } else{
            System.out.printf("%d Não é Bissexto", ano);
        }
    }
}
