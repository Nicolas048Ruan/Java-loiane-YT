package aula24.Ex;

import java.util.Date;

public class teste04 {
    
    public static void main(String[] args) {
        
        Ex04 livro = new Ex04();
        livro.nome = "Revolução dos bichos";
        livro.autor = "George Orwell";
        livro.anoLanc = 1945;

        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.emprestadoA = "Nicolas";

        System.out.println("Nome do livro: " + livro.nome);

    }
}
