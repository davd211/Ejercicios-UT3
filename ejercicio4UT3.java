import java.util.Scanner;

/**
 *
 * @author David.P
 */
public class ejercicio4UT4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1 = teclado.nextInt();

        if (num1 % 2 == 0) {
            System.out.print("Es par");

        } else {
            System.out.print("Es impar");
        }
    }

}

