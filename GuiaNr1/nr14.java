//Realizar un programa declarando dos variables (X, Y) y para un valor ingresado de X obtener el siguiente resultado y guardarlo en Y.

package GuiaNr1;
import java.util.Scanner;

public class nr14 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {

            double X = 0;

            System.out.println("Ingrese un numero");
            X = Teclado.nextDouble();

            double Y = 2 * X + 1;

            System.out.println("El resultado de Y es "+Y);
            
        }
    }
}
