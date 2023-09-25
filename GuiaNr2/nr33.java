/*Ejercicio Nro. 33: Trabajo con Cadenas de Caracteres
Realizar un programa que almacene una cadena de texto en una variable (que deberá introducir por teclado el operador) y a partir de ella recorrer la cadena caracter por caracter y mostrarlos a los mismos uno x uno. */

package GuiaNr2;
import java.util.Scanner;

public class nr33 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {

            String texto = "";

            System.out.println("Ingrese una palabra");
            texto = Teclado.nextLine();

            int largo = texto.length();

            for(int i = 0;i <= largo -1; i++){
                char caracter = texto.charAt(i);
                System.out.println(caracter);
            }
        }
    }
}