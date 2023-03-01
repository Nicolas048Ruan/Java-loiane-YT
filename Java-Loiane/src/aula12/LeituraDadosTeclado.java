package aula12;

import java.util.Scanner; // Server como um input

public class LeituraDadosTeclado {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
         * System.out.println("Digite seu nome completo:");
         * String nomeCompleto = scan.nextLine();
         * System.out.println("Seu nome completo é: " + nomeCompleto);
         * 
         * System.out.println("Digite seu primeiro nome:");
         * String primeiroNome = scan.next();
         * System.out.print("Seu primeiro nome é: " + primeiroNome);
         * 
         * System.out.println("Digite sua idade: ");
         * int idade = scan.nextInt();
         * System.out.println("Sua idade é: " + idade);
         * 
         * System.out.println("Digite sua altura: ");
         * double altura = scan.nextDouble();
         * System.out.println("Sua altura é: " + altura);
         */

        System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, e se tem animal de estimação: ");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        boolean temPet = scan.nextBoolean();

        System.out.println("Você digitou: ");

        System.out.println(primeiroNome);
        System.out.println(idade);
        System.out.println(qtdFilhos);
        System.out.println(temPet);
    }
}