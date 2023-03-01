package aula19;

// Arrays/Vetores/Listas são as estruturas de dados mais simples existentes; Tbm são 
// listas de dados ordenadas

public class Arrays {
    
    public static void main(String[] args) {
        
        double[] temperaturas = new double[365]; // Esse 365 são o tamanho do array, no java precisa colocar o tamanho
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

        System.out.println("Temperatura 3: " + temperaturas[2]);

        System.out.println("Tamanho do array: " + temperaturas.length);

        System.out.println("Valores do array: " + temperaturas); // N mostra os valores, mostra o endereço de memória

        // Para mostrar os valores se usa um loop
        for (int i=0; i<temperaturas.length; i++){
            System.out.println("Temperatura dia " + (i+1) + " é: " + temperaturas[i]);
        }

        // for melhorado - tem acesso a somente o valor
        for (double temp : temperaturas){
            System.out.println(temp);
        }
    }
}
 