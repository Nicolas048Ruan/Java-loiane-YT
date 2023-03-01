package aula19.Ex.P3;

public class Ex22 {
    
    public static void main(String[] args) {
        
        int[] A = new int[10];

        int qtd0 = 0;
        int qtd1 = 0;
    
        for (int i=0; i<A.length; i++){
            // O Math.round() arredonda os num, já que o Math.random() gera um número double e o 
            // (int) é pra transformar td em um int
            A[i] = (int)Math.round(Math.random() * 1); // Esse num dps do * é até qual pode gerar
            System.out.println(A[i]);

            if (A[i] == 0){
                qtd0++;
            } else{
                qtd1++;
            }
        }

        double porc0 = (qtd0 * 100) / A.length;
        double porc1 = (qtd1 * 100) / A.length;

        System.out.print("Vetor A = ");
        for (int i=0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println("Porc 0 = " + porc0);
        System.out.println("Porc 1 = " + porc1);
    }
}
