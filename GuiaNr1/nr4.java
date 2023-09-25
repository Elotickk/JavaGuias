/* Ejercicio Nro. 4:
Realizar un programa que permita introducir tres valores y determine si la suma de los dos primeros es igual al tercer valor ingresado. */

package GuiaNr1;
import java.util.Scanner;

public class nr4 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {

            double a = 0, b = 0, c = 0;

            System.out.println("Ingrese el valor de A");
            a = Teclado.nextInt();

            System.out.println("Ingrese el valor de B");
            b = Teclado.nextInt();
            
            System.out.println("Ingrese el valor de C");
            c = Teclado.nextInt();

            double suma = a + b;
            if (suma == c) {
                System.out.print("La suma de A y B es igual a C");
            } else {
                System.out.print("La suma de A y B NO es igual a C");
            }
        }
    }
}