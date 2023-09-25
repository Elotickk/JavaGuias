/* Realizar un programa que obtenga los valores que asume la siguiente función lineal genérica (Y = a * X + B);
Siendo a un valor que el operador deberá ingresar por teclado
Siendo b un valor que el operador deberá ingresar por teclado
Siendo x los valores que irán cambiando desde (0 a 400)
Nota: Ud. A partir del siguiente ejercicio obtendrá dos valores (X,Y) de la siguiente forma; haga que el gatito se desplace gráficamente por esos pares de coordenadas*/

package GuiaNr2;
import java.util.Scanner;

public class nr28 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {

            double y = 0;
            double a = 0;
            double b = 0;

            System.out.print("Ingrese el número a :");
            a = Teclado.nextInt();

            System.out.print("Ingrese el número b :");
            b = Teclado.nextInt();

            for (int x = 0; x <= 400; x++){
                y = a * x + b;

                System.out.println("X:= "+ x + " Y:= "+ y);
            }
        }
    }
}