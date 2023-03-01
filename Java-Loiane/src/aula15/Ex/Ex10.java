package aula15.Ex;

import java.util.Scanner;

public class Ex10 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Em que turno você estuda? [M/V/N] ");
        String turno = ler.nextLine();

        switch(turno){
            case "m":
            case "M": System.out.println("Bom Dia!"); break;
            case "v":
            case "V": System.out.println("Boa Tarde!"); break;
            case "n":
            case "N": System.out.println("Boa Noite!"); break;
            default: System.out.println("Valor Inválido!");
        }
    }
}
