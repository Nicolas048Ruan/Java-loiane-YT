package aula13;

/* +    adição
   -    subtração
   *    multiplicação
   /    divisão
   %    módulo(resto da divisão)
   ++   incremento(adiciona mais um)
   --   decremento(subtrai menos um)
 */

public class OperadoresAritmeticos {

    public static void main (String[] args) {
        
        int resultado = 1 + 2;
        System.out.println(resultado); // output: 3

        resultado -= 1;
        System.out.println(resultado); // output: 2

        resultado *= 2;
        System.out.println(resultado); // output: 4
        
        resultado /= 2;
        System.out.println(resultado); // output: 2
        
        resultado += 8;
        System.out.println(resultado); // output: 10
        
        resultado %= 7;
        System.out.println(resultado); // output: 3
        
        String primeiroNome = "Esta é ";
        String segundooNome = "uma String concatenada.";
        String terceiroNome = primeiroNome + segundooNome;
        System.out.println(terceiroNome);

        resultado += 1;
        System.out.println(resultado); // output: 4

        resultado++; // soma + 1
        System.out.println(resultado); // output: 5

        /* Esse ++ no final só vai somar dps de imprimir,
        é a mesma coisa que:
        System.out.println(resultado);
        resultado += 1
        */
        System.out.println(resultado++); // output: 5

        /* Esse ++ no começo vai somar e dps imprimir,
        é a mesma coisa que:
        resultado += 1
        System.out.println(resultado);
        */
        System.out.println(++resultado); // output: 7

        resultado--; // subtrai - 1
        System.out.println(resultado); // output: 6

        /* Vai imprimir e dps retirar 1 */
        System.out.println(resultado--); // output: 6

        /* Vai retirar 1 e dps imprimir */
        System.out.println(--resultado); // output: 4

    }
}