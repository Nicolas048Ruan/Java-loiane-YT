package aula17.Ex;

import java.util.Scanner;

public class Ex2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        boolean verifica = false;

        do {
            System.out.print("Nome do usuário: ");
            String usuario = input.nextLine();

            System.out.print("Senha: ");
            String senha = input.nextLine();

            if (usuario.equalsIgnoreCase(senha)){
                System.out.println("Não use senha e usuários iguais!");

            } else {
                verifica = true;
                System.out.printf("Usuário: %s - Senha: %s", usuario, senha);
            }
        } while (verifica == false);
    }
}
