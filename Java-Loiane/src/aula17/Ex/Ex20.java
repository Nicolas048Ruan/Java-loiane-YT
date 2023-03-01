package aula17.Ex;

// Média idade

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas: ");
        int qnt = input.nextInt();

        int soma = 0;

        for (int i=1; i<=qnt; i++){
            System.out.print("Idade " + i + " pessoa: ");
            int idade = input.nextInt();

            soma += idade;
        }

        double media = soma / qnt;

        System.out.println("Média das idades: " + media);

        if (media >= 0 && media <= 25){
            System.out.printf("A média de idade da turma é de %.1f - Turma Jovem", media);
        } else if (media > 25 && media <= 60){
            System.out.printf("A média de idade da turma é de %.1f - Turma Adulta", media);
        } else{
            System.out.printf("A média de idade da turma é de %.1f - Turma Idosa", media); 
        }

    }
}
