package aula15.Ex;

import java.util.Scanner;

public class Ex20 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int conta = 0;

        String classificacao = "";

        System.out.print("telefonou pra vitima? [S/N] ");
        String telefonou = ler.next();

        if (telefonou.equalsIgnoreCase("s")){
            conta++;
        }

        System.out.print("Esteve no local do crime? [S/N] ");
        String esteve = ler.next();

        if (esteve.equalsIgnoreCase("s")){
            conta++;
        }
        
        System.out.print("Mora perto da vitima? [S/N] ");
        String mora = ler.next();

        if (mora.equalsIgnoreCase("s")){
            conta++;
        }
        
        System.out.print("Devia pra vitima? [S/N] ");
        String devia = ler.next();

        if (devia.equalsIgnoreCase("s")){
            conta++;
        }

        System.out.print("Já trabalhou com a vitima? [S/N] ");
        String trabalhou = ler.next();

        if (trabalhou.equalsIgnoreCase("s")){
            conta++;
        }

        if (conta < 2){
            classificacao = "Inocente";
        } else if (conta == 2){
            classificacao = "Suspeito";
        } else if (conta > 2 && conta <= 4){
            classificacao = "Cúmplice";
        } else{
            classificacao = "Assasino";
        }

        System.out.print("Você é " + classificacao);
    }
}
