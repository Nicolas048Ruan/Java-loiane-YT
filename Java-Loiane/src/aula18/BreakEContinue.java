package aula18;

// Break é usado para parar um looping

// Continue é um complemento do break; Continue o loop na próxima iteração; Ele ignora td q
// está abaixo dele e volta para o inicio do loop

import java.util.Scanner;

public class BreakEContinue {
    
    public static void main(String[] args) {

        // Break
        /*Scanner input = new Scanner(System.in);

        System.out.print("Entre com um número: ");
        int num = input.nextInt();

        System.out.print("Entre com um limite: ");
        int max = input.nextInt();

        for (int i=num; i<=max; i++){
            if (i % 7 == 0){
                System.out.println("Valor de i: " + i);
                break;
            }
        }*/

        // Break com rótulos - goto
        /*for (int i=0; i<=4; i++){
            rotulo1:{
                rotulo2:{
                    rotulo3:{
                        if (i == 1){
                            break rotulo1;
                        }
                        if (i == 2){
                            break rotulo2;
                        }
                        if (i == 3){
                            break rotulo3;
                        }
                        System.out.println("rotulo3");
                    }
                    System.out.println("rotulo2");
                }
                System.out.println("rotulo1");
            }
            System.out.println(i);
        }*/

        // Continue
        Scanner input = new Scanner(System.in);

        System.out.print("Entre com um número: ");
        int num = input.nextInt();

        System.out.print("Entre com um limite: ");
        int max = input.nextInt();

        for (int i=num; i<=max; i++){
            if (i % 7 == 0){
                continue; //Pula os números divisivel por 7
            }
            System.out.println("Valor de i: " + i);
        }
    }
}
