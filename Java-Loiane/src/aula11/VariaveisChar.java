package aula11;

public class VariaveisChar {
   
    public static void main (String[] args){

        // char o = 'o';
        // char i = 'i';

        char o = 111; // Em decimais segundo tabela ascii
        char i = 105;
        char interrogacao = 63;

        System.out.println("" + o + i + interrogacao); /* É necessário tem as ""
        vazias pq ele pega pela tabela ascii transformando em
        decimais, e c n tiver as "" vai somar ao invés de
        colocar as letras certas.*/
    }
}
