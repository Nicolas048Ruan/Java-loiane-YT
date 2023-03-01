package aula11;

/* O java funciona como uma roleta, assim que atinge o valor
max de um tipo, ele volta para o começo. EX: */

public class Curiosidade {
    
    public static void main (String[] args){

        int var1 = 2147483647; // max value int

        int var2 = 1;

        System.out.println(var1 + var2); // volta para o valor minimo
    }
}
