/* Ejercicio Nro. 47: Creación, Definición e Invocación de Procedimientos
Realice un procedimiento que permita dibujar una línea de “n” asteriscos; siendo “n” un parámetro que recibe el procedimiento. */

package GuiaNr3;

public class nr47 {
    public static void dibujarLinea(String x) {
        for (int i = 0; i < 10; i++) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        dibujarLinea("z");
    }
}
