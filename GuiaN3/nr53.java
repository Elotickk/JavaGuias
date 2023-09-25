/* Ejercicio Nro. 53: Creación, Definición e Invocación de Funciones
Realizar una función que reciba como parámetro una cadena de texto y a partir de ella devuelva la cantidad de letras “a” que tiene. Luego (INVOCAR Ó LLAMAR) esa función desde el programa PRINCIPAL. */

package GuiaNr3;

public class nr53 {
    public static int cantidadLetrasA(String texto) {
        int cantidad = 0;
        for (int i = 0; i <= texto.length()-1;i++){
            if ((texto.charAt(i)=='A') || (texto.charAt(i)=='a'))
                {
                    cantidad = cantidad + 1;
                }
        }
        return (cantidad);
    }

    public static void main(String[] args) {
        System.out.println("La cantidad de A que tiene el texto siguiente es "+cantidadLetrasA("Aguante river la concha de la lora"));
    }
}
