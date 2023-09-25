/*Ejercicio Nro. 27: (Estructuras Repetitivas + Contador)
Realizar un programa que obtenga los valores que asume la siguiente función lineal (Y = -2 * X + 3), para valores de x comprendidos entre (0 y 400).
Nota: Ud. A partir del siguiente ejercicio obtendrá dos valores (X,Y) de la siguiente forma; haga que el gatito se desplace gráficamente por esos pares de coordenadas */

package GuiaNr2;
import java.util.Scanner;

public class nr27 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {

            double y = 0;

            for (int x = 0; x <= 400; x++){
                y = -2 * x - 3;

                System.out.println("X:= "+ x + " Y:= "+ y);
            }
        }
    }
}