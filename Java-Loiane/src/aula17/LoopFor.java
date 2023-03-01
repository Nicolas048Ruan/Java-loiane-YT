package aula17;

// for é semelhante ao for range d python

public class LoopFor {
    
    public static void main(String[] args) {
        
        for (int i=0; i < 5; i++){
            System.out.println("valor " + i);
        }

        System.out.println("-------------------------------");

        for (int i=5; i > 0; i--){
            System.out.println("valor " + i);
        }

        for (int i=0, j=10; i < j; i++, j--){
            System.out.println("i= " +i+" - j= " + j);
        }

        int count = 0;
        for ( ; count < 10; ){
            System.out.println("valor count: " + count);
            count += 2;
        } // Esse é o mesmo q o de baixo

        for (int cont=0; cont < 10; cont += 2){
            System.out.println("Valor de cont: " + cont);
        }

        // for (;; ); loop infinito

        // for sem corpo
        int soma = 0;
        for (int i=1; i < 5; soma += i++);
        System.out.println("Valor soma: " + soma);
        
    }
}