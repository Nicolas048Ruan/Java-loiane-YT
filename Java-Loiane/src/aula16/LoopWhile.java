package aula16;

/*  while e do-while

    while = é semelhante ao do python, ele verifica c é true e então faz, ele avalia e depois executa

    do-while = ele faz e depois verifica c é true, ele executa e depois avalia
*/

public class LoopWhile {
    
    public static void main(String[] args) {
        
        int i = 1;
        int max = 10;

        System.out.println("Contando até " + max);

        while(i <= max){
            System.out.println(i);
            i++;
        }

        System.out.println(i); // valor de 11

        do { // executa
            i++;
            System.out.println("Valor de " + i);
        } while(i < 11); // dps avalia

        System.out.print(i);
    }
}
