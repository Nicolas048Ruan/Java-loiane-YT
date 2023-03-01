package Ex;

import java.util.Scanner;

public class Ex03 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[][] nums = new int[3][3];

        for (int i=0; i<nums.length; i++){

            for (int j=0; j<nums[i].length; j++){
                System.out.print("Valor da Pos [" +i+ ", " +j+ "] ");
                nums[i][j] = input.nextInt();
            }

        }

        int qtdPares = 0;
        int qtsImpares= 0;
        for (int i=0; i<nums.length; i++){

            for (int j=0; j<nums[i].length; j++){
                if (nums[i][j] % 2 == 0){
                    qtdPares++;
                } else{
                    qtsImpares++;
                }
            }
        }

        for (int i=0; i<nums.length; i++){

            for (int j=0; j<nums[i].length; j++){
                System.out.print(nums[i][j] + " - ");
            }
            System.out.println();
        }

        System.out.println("Qtd Pares = " + qtdPares);
        System.out.println("Qtd Impares = " + qtsImpares);
    }
}
