package aula17.Ex;

import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        boolean verifica = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;


        do {
            System.out.print("Nome: ");
            nome = input.nextLine();

            if (nome.length() >= 3){
                verifica = true;
            } else{
                System.out.println("Precisa de 3 caracteres!");
            }
        } while (verifica == false);

        verifica = false;
        do {
            System.out.print("Idade: ");
            idade = input.nextInt();

            if (idade >= 0 && idade <= 150){
                verifica = true;
            } else{
                System.out.println("Digite uma idade entre 0 e 150!");
            }
        } while (verifica == false);

        verifica = false;
        do {
            System.out.print("Salário: ");
            salario = input.nextDouble();

            if (salario > 0){
                verifica = true;
            } else{
                System.out.println("Digite um salário maior que 0!");
            }
        } while (verifica == false);

        verifica = false;
        do {
            System.out.print("Sexo: ");
            sexo = input.next();

            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
                verifica = true;
            } else{
                System.out.println("Digite apenas F ou M!");
            }
        } while (verifica == false);

        verifica = false;
        do {
            System.out.print("Estado Civil: ");
            estadoCivil = input.next();

            switch(estadoCivil){
                case "s":
                case "c":
                case "v":
                case "d": verifica = true; break;
                default: System.out.println("Digite apenas S/C/V/D!");
            }
        } while (verifica == false);

        System.out.println("Informações validadas!");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
    }
}
