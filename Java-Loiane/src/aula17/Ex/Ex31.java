package aula17.Ex;

import java.text.DecimalFormat;
import java.util.Scanner; 

public class Ex31 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Salário inicial: ");
        double salario = input.nextDouble();

        double aumento = 1.5;

        double soma;
        double novoSalario = 0;

        salario += (salario * aumento) / 100;

        DecimalFormat format = new DecimalFormat("###,###.##");

        for (int i=1997; i<=2015; i++){
            aumento *= 2;
            
            salario += (salario * aumento) / 100;
            System.out.println(i + " = R$" + format.format(salario) + " - " + aumento + "%");
        }
    }
}
