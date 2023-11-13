import java.util.Scanner;

/**
 *
 * @author David.P
 */
public class ejercicio1AMPLI2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero = teclado.nextInt();
        int i, resultado = 0;
        resultado=numero;
        for (i = 1; i < numero; i++) {
            resultado= resultado*(numero-i);

        }
        System.out.print(resultado);

    }

}
