package aula17.Ex;

import java.util.Scanner;

public class Ex21 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Quantidade de turmas: ");
        int turmas = input.nextInt();

        int alunos;
        int soma = 0;
        boolean invalido;

        for (int i=1; i<=turmas; i++){

            invalido = true;
            do{
                System.out.print("Quantidade de alunos turma " + i +": ");
                alunos = input.nextInt();
    
                if (alunos <= 40){
                    invalido = false;
                } else{
                    System.out.println("Inválido");
                }
            } while (invalido == true);

            soma += alunos;
        }

        double media = soma / turmas;
        System.out.printf("Média: %.1f", media);

    }
}
