package aula19.Ex.P3;

import java.util.Scanner;

public class Ex21 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double[] A = new double[20];

        System.out.print("Cotação do dolár: ");
        double cotacao = input.nextDouble();

        for (int i=0; i<A.length; i++){
            A[i] = cotacao * (i+1);
            System.out.println("A" + (i+1) +" = " + A[i]);
        }
    }
}
