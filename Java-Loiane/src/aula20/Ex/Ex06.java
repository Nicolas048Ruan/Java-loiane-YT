package Ex;

import java.util.Scanner;

public class Ex06 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        char[][] jogoVelha = new char[3][3];

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0, coluna = 0;

        while (!ganhou){
            if (jogada % 2 == 1){ // Jogador 1
                System.out.print("Jogador 1. Escolha linha e coluna (1-3) ");
                sinal = 'X';
            } else{
                System.out.print("Jogador 2. Escolha linha e coluna (1-3) ");
                sinal = 'O';
            }

            boolean linhaValida = false;
            while (!linhaValida){
                System.out.print("Linha 1, 2 ou 3 ");
                linha = input.nextInt();
                if (linha >= 1 && linha <= 3){
                    linhaValida = true;
                } else{
                    System.out.println("Invalido. Tente novamente");
                }
            }

            boolean colunaValida = false;
            while (!colunaValida){
                System.out.print("Coluna 1, 2 ou 3 ");
                coluna = input.nextInt();
                if (coluna >= 1 && coluna <= 3){
                    colunaValida = true;
                } else{
                    System.out.println("Invalido. Tente novamente");
                }
            }
        
            // Continua a lógica
            linha--;
            coluna--;
            if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O'){
                System.out.println("Posição já usada, tente novamente");
            } else{ // Jogada valida
                jogoVelha[linha][coluna] = sinal;
                jogada++;
            }

            // Imprimir tabuleiro
            for (int i=0; i<jogoVelha.length; i++){

                for (int j=0; j<jogoVelha[i].length; j++){
                    System.out.print(jogoVelha[i][j] + " | ");
                }
                System.out.println();
            }

            // Verifica se tem ganhador
            if (
                (jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') || // Linha 1
                (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') || // Linha 2
                (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X') || // Linha 3
                (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') || // Coluna 1
                (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') || // Coluna 2
                (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') || // Coluna3
                (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X')    // Diagonal
            ){
                ganhou = true;
                System.out.println("Jogador 1 ganhou!");
            } else if (
                (jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') || // Linha 1
                (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') || // Linha 2
                (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O') || // Linha 3
                (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O') || // Coluna 1
                (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') || // Coluna 2
                (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O') || // Coluna3
                (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O')    // Diagonal
            ){
                ganhou = true;
                System.out.println("Jogador 2 ganhou!");
            } else if (jogada > 9){
                ganhou = true;
                System.out.println("Empate!");
            }
        }
    }
}
