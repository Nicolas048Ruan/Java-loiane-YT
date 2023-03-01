package aula15.Ex;

import java.util.Scanner;

public class Ex4 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Uma letra: ");
        String letra = ler.next();

        // Semelhante ao len() do python
        if (letra.length() > 1){
            System.out.print("Não é uma letra válida.");
        } else{
            // Se forem tds iguais basta colocar no último
            switch(letra){
                case "a": 
                case "e": 
                case "i": 
                case "o": 
                case "u":
                case "A": 
                case "E": 
                case "I": 
                case "O": 
                case "U": System.out.print("Vogal"); break;
                default: System.out.print("Consoante");
            }
        }
    }
}  
