package aula24.Ex;

public class teste05 {
    
    public static void main(String[] args) {
        
        Ex05 conta = new Ex05();
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;

        System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);
    }
}
