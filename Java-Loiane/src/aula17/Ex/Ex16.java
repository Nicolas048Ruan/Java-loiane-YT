package aula17.Ex;

// Fibonacci até 500

public class Ex16 {
    
    public static void main(String[] args) {
        
        int num0 = 0;
        int num1 = 1;
        int proximo;

        System.out.print(num0 + " ");
        System.out.print(num1 + " ");

        do{
            proximo = num0 + num1;
            num0 = num1;
            num1 = proximo;
            System.out.print(proximo + " ");
        } while (proximo < 500);
    }
}
