import java.util.Scanner;

/**
 *
 * @author David.P
 */
public class ejercicio6UT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int resultado;

        resultado = num1 + num2;
        
        System.out.print(resultado);
    }

}
