package aula15.Ex;

import java.util.Scanner;

public class Ex3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
    
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite F ou M: ");
        String letra = ler.nextLine();

        // usar o equalsIgnoreCase no lugar do == para comparar Strings no if-else

        switch (letra){
            case "F": System.out.print("F - Feminino"); break;
            case "M": System.out.print("M - Masculino");break;
            default: System.out.print("Sexo inválido");
        }
    }
}
