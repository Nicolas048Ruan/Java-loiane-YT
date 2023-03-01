
import java.util.Scanner;

public class MatrizIrregular {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Numeros de pessoas a ser intrevistadas: ");
        int numEntrevistados = input.nextInt();
        
        // P4: Matrizes Irregulares
        String[][] nomeFilhos = new String[numEntrevistados][];

        for (int i=0; i<nomeFilhos.length; i++){
            System.out.print("Qtd filhos: ");
            int qtdFilhos = input.nextInt();

            nomeFilhos[i] = new String[qtdFilhos];

            for (int j=0; j<nomeFilhos[i].length; j++){
                System.out.print("Digite o nome do filho " +(j+1)+ ": ");

                nomeFilhos[i][j] = input.next();
            }

        }

        for (int i=0; i<nomeFilhos.length; i++){
            System.out.println("Pessoa " +i+ " tem " + nomeFilhos[i].length + " filhos.");
            for (int j=0; j<nomeFilhos[i].length; j++){
                System.out.println(nomeFilhos[i][j]);
            }

        }

    }
}
