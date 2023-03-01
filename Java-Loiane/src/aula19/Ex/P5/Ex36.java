package aula19.Ex.P5;

public class Ex36 {
    
    public static void main(String[] args) {
        
        double[] A = new double[11];
 
        for (int i=0; i<A.length; i++){
            A[i] = Math.pow(2, i);
        }

        System.out.print("Vetor A = ");
        for (int i=0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}
