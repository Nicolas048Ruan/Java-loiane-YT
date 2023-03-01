package aula10; // Declaração do pacote

public class Variaveis {

    public static void main (String[] args) {
    
        // convenção Java
        int idade = 20;
        String nome = "Nicolas";
        String nomeCachorro = "totó";
        String ano2014;

        // aceito mas não utilizado
        int _idade;
        int $idade;

        // não é convenção Java
        String nome_do_cachorro;
        String NomeDoCachorro;
        String nomeDoCachorro;

        idade = 25;

        System.out.println("Idade = " + idade);
        System.out.println("Nome = " + nome);

        // má prática
        int a = 10;
        String b = "Nicolas";
    }
}
