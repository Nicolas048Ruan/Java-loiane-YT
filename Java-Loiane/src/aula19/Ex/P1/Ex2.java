package aula19.Ex.P1;

public class Ex2 {
    
    public static void main(String[] args) {
        
        int[] A = new int[8];

        int[] B = new int[A.length];

        for (int i=0, j=0; i<A.length; i++, j+=2){
            A[i] = j;
            System.out.println(A[i]);
        }

        for (int i=0; i<B.length; i++){
            B[i] = A[i] * 2;
            System.out.print(B[i] + " ");
        }
    }
}
