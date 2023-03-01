package aula19.Ex.P5;

import java.util.Scanner;

public class Ex33 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] A = new int[5];

        for (int i=0; i<A.length; i++){
            System.out.print("Num-A " + (i+1) + ": ");
            A[i] = input.nextInt();
        }

        String msg = "";
        boolean primo;

        System.out.println("Vetor A:");
        for (int i=0; i<A.length; i++){

            primo = true;
            for (int j=2; j<A[i]; j++){
                if (A[i] % j == 0){
                    primo = false;
                    break;
                }
            }
            if (primo){
                msg = "Primo";
            } else{
                msg = "Não é Primo";
            }

            System.out.println(A[i] + " - " + msg);
        }
    }
}
