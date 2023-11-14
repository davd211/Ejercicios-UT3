import java.util.Scanner;

/**
 *
 * @author David.P
 */
public class ejercicio2UT3 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num, numaprob = 0, numerosusp = 0;

        for (int i = 0; i < 5; i++) {
            num = teclado.nextInt();
            if (num >= 5) {
                numaprob++;
            }else { numerosusp++;
            }
        }

        System.out.print(" Aprobados " + numaprob + " Suspensos " + numerosusp);

    }

}
