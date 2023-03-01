
public class MatrizTridimensional {

    public static void main(String[] args) {
        
        // P3: Matrizes 3 dimensões
        int[][][] matrizTridimenional = new int[3][3][3]; // Matriz d 3 dimensões é semelhante a um cubo

        for (int i=0; i<matrizTridimenional.length; i++){

            for (int j=0; j<matrizTridimenional[i].length; j++){

                for (int k=0; k<matrizTridimenional[i][j].length; k++){
                    System.out.println("i = " +i+ " - j = " +j+ " - k = " +k); // Melhor ex d como elas funcionam
                    matrizTridimenional[i][j][k] = i + j + k;
                }

            }

        }

        int soma = 0;
        int somaPares = 0;
        int somaImpares = 0;
        for (int i=0; i<matrizTridimenional.length; i++){

            for (int j=0; j<matrizTridimenional[i].length; j++){

                for (int k=0; k<matrizTridimenional[i][j].length; k++){
                    soma += matrizTridimenional[i][j][k];

                    if (matrizTridimenional[i][j][k] % 2 == 0){
                        somaPares += matrizTridimenional[i][j][k];
                    } else{
                        somaImpares += matrizTridimenional[i][j][k];
                    }
                }

            }

        }
        System.out.println("Soma Total = " + soma);
        System.out.println("Soma Pares = " + somaPares);
        System.out.println("Soma Impares = " + somaImpares);
    }
}
