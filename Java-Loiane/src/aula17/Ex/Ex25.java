package aula17.Ex;

import java.util.Scanner;

public class Ex25 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double soma = 0;
        boolean sair = false;
        String continuar;

        do{
            System.out.print("\nNova compra? [S/N] ");
            continuar = input.next();

            if (continuar.equalsIgnoreCase("N")){
                sair = true;
            } else if (continuar.equalsIgnoreCase("S")){
                System.out.println("\nLojas Tabajara");
                for (int i=1; ;i++){
                    System.out.print("Produto " +i+ ": R$ ");
                    double produto = input.nextDouble();
        
                    if (produto == 0){
                        break;
                    } else{
                        soma += produto;
                    }
                }
                System.out.printf("\nTotal: R$ %.2f", soma);
        
                System.out.print("\nDinheiro: R$ ");
                double din = input.nextDouble();
        
                double troco = din - soma;
                System.out.printf("Troco: R$ %.2f", troco);

                soma = 0;
            } else{
                System.out.println("Inválido");
            }
        } while (sair == false);

    }
}
