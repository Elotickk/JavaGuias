//Ejercicio Nro. 16:
//Realizar un programa declarando dos variables (X, Y) y para un valor ingresado de X obtener el siguiente resultado y guardarlo en Y.
//Y = 3 * X3 – 2 * X2 + X - 1

package GuiaNr1;
import java.util.Scanner;

public class nr16 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {
            double X = 0;

            System.out.println("Ingrese un numero");
            X = Teclado.nextDouble();

            double Y = 3 * Math.pow( X,3) - 2 * Math.pow( X,2) + X - 1;

            System.out.println("El resultado de Y es "+Y);
        }
    }
}