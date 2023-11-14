import java.util.Scanner;

/**
 *
 * @author David.P
 */
public class ejercicio1UT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

int resultadosuma, resultadoresta,resultadomulti;


    Scanner teclado = new Scanner(System.in);

         int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        
        resultadosuma = num1 + num2;
        resultadoresta = num1 - num2;
        resultadomulti = num1 * num2;
         
        System.out.print(resultadosuma+ ""+  resultadoresta+ ""+ resultadomulti  );
       

    }
    
}
