package Ex;

import java.util.Scanner;

public class Ex05 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String[][][] compromissos = new String[12][31][24];

        boolean sair = false;
        byte opcao;
        while (!sair){
            System.out.println("1 Para add compromisso.");
            System.out.println("2 Para verificar compromisso.");
            System.out.println("0 para sair.");

            opcao = input.nextByte();

             if (opcao == 1){ // Adicionar compromisso

                Boolean mesValido = false;
                int mes = 0;
                while (!mesValido){
                    System.out.print("Entre com o mes: ");
                    mes = input.nextInt();
                    if (mes > 0 && mes <= 12){
                        mesValido = true;
                    } else{
                        System.out.println("Invalido, digite novamente");
                    }
                }

                Boolean diaValido = false;
                int dia = 0;
                while (!diaValido){
                    System.out.print("Entre com o dia do mes: ");
                    dia = input.nextInt();
                    if (dia > 0 && dia <= 31){
                        diaValido = true;
                    } else{
                        System.out.println("Invalido, digite novamente");
                    }
                }

                Boolean horaValido = false;
                int hora = 0;
                while (!horaValido){
                    System.out.print("Entre com a hora do compromisso: ");
                    hora = input.nextInt();
                    if (hora >= 0 && hora <= 8){
                        horaValido = true;
                    } else{
                        System.out.println("Invalido, digite novamente");
                    }
                }
                  
                System.out.print("Digite o compromisso: ");
                compromissos[--mes][--dia][hora] = input.next();
            
            } else if(opcao == 2){ // Verificar compromisso

                Boolean mesValido = false;
                int mes = 0;
                while (!mesValido){
                    System.out.print("Entre com o mes: ");
                    mes = input.nextInt();
                    if (mes > 0 && mes <= 12){
                        mesValido = true;
                    } else{
                        System.out.println("Invalido, digite novamente");
                    }
                }

                Boolean diaValido = false;
                int dia = 0;
                while (!diaValido){
                    System.out.print("Entre com o dia do mes: ");
                    dia = input.nextInt();
                    if (dia > 0 && dia <= 31){
                        diaValido = true;
                    } else{
                        System.out.println("Invalido, digite novamente");
                    }
                }

                Boolean horaValido = false;
                int hora = 0;
                while (!horaValido){
                    System.out.print("Entre com a hora do compromisso: ");
                    hora = input.nextInt();
                    if (hora >= 0 && hora <= 24){
                        horaValido = true;
                    } else{
                        System.out.println("Invalido, digite novamente");
                    }
                }

                mes--;
                dia--;
                System.out.print("O compromisso agendado é: ");
                System.out.println(compromissos[mes][dia][hora]);

             } else if(opcao == 0){
                sair = true;
             } else{
                System.out.println("Invalido, digite novamente.");
             }
        }
    }
}
