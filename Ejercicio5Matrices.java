import java.util.Scanner;

/**
 *
 * @author David.P
 */
public class Ejercicio6UT4Matrices {

  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introduce el tamaño de la matriz
        int tamano = scanner.nextInt();

        // Crea la matriz
        char[][] matriz = new char[tamano][tamano];

        // Inicializa las columnas pares con 'a' y las impares con 'b'
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (j % 2 == 0) {
                    matriz[i][j] = 'a';
                } else {
                    matriz[i][j] = 'b';
                }
            }
        }

        // Visualiza la matriz
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }            System.out.println();

    }         

}
