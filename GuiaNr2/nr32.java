/* Ejercicio Nro. 32: Largo de una Cadena de Texto
Realizar un programa que almacene una cadena de texto en una variable (que deberá introducir por teclado el operador) y a partir de ella obtener lo siguiente:
- Largo de la Cadena
- Obtener el primer caracter de la cadena y guardarlo en una variable; mostrar esa letra por pantalla.
- Obtener el último caracter de la cadena y guardarlo en una variable; mostrar esa letra por pantalla. */

package GuiaNr2;
import java.util.Scanner;

public class nr32 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {

            String texto = "";

            System.out.println("Ingrese una palabra");
            texto = Teclado.nextLine();

            int largo = texto.length();

            System.out.println("El largo del texto es " + largo);

            System.out.println("La primera letra es " + texto.charAt(0));

            System.out.println("El ultima letra es " + texto.charAt(largo-1));
        }
    }
}