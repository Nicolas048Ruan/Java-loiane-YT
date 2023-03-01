package aula21;

import java.util.Random;

// ForEach é utilizado no java 5, mas é bom aprender-lo

public class ForEach {
    
    public static void main(String[] args) {
        
        int[] notas = new int[10];

        Random random = new Random();

        for (int i=0; i<notas.length; i++){
            notas[i] = random.nextInt(10);
        }

        for (int i=0; i<notas.length; i++){ // É a mesma coisa que o for de baixo mas com o contador
            int nota = notas[i];
            System.out.println(nota);
        }

        System.out.println("Usando o for each");
        for(int nota : notas){ // É a mesma coisa que o for de cima mas sem o contador
            System.out.println(nota);
        }

        System.out.println("Exemplo com arrays multidimensionais");
        double [][] notasAlunos = new double[3][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 9.5;

        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9;

        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 9;
        notasAlunos[2][2] = 10;
        notasAlunos[2][3] = 7;

        for (double[] notaAluno : notasAlunos){

            for (double nota : notaAluno){
                System.out.print(nota + " ");
            }
            System.out.println();
        }
    }
}
