/*Ejercicio Nro. 29: (Estructuras Repetitivas + Contador)
Realizar un programa que obtenga los valores que asume la siguiente función cuadrática (y = x2), para valores de x comprendidos entre (0 y 400).
Nota: Ud. A partir del siguiente ejercicio obtendrá dos valores (X,Y) ; haga que el gatito se desplace gráficamente por esos pares de coordenadas. */

package GuiaNr2;
import java.util.Scanner;

public class nr29 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {

            double y = 0;

            for (int x = 0; x <= 400; x++){
                y = Math.pow(x, 2);

                System.out.println("X:= "+ x + " Y:= "+ y);
            }

        }
    }
}
