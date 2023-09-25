/*Ejercicio Nro. 30: (Estructuras Repetitivas + Contador)
Realizar un programa que obtenga los valores que asume la siguiente función y = 10 * seno(x), para valores de x comprendidos entre (0 y 400).
Nota: Ud. A partir del siguiente ejercicio obtendrá dos valores (X,Y) ; haga que el gatito se desplace gráficamente por esos pares de coordenadas */

package GuiaNr2;
import java.util.Scanner;

public class nr30 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {

            double y = 0;

            for (int x = 0; x <= 400; x++){
                y = 10 * Math.sin(x);

                System.out.println("X:= "+ x + " Y:= "+ y);
            }

        }
    }
}