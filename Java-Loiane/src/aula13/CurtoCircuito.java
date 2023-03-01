package aula13;

public class CurtoCircuito {
    
    public static void main (String[] args) {

        boolean verdadeiro = true;
        boolean falso = false;
        // a diferença entre & e &&
        boolean resultado1 = falso &
                verdadeiro; /* checa o primeiro
        e mesmo se for falso, ainda checa o segundo. */
        boolean resultado2 = falso &&
                verdadeiro; /* checa o primeiro
        e se for falso nem checa o segundo. */
        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
