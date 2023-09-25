/* Ejercicio Nro. 49: Creación, Definición e Invocación de Funciones
Realice una función que reciba como parámetro un número y devuelva el cuadrado del mismo. Luego (INVOCAR Ó LLAMAR) esa función desde el programa PRINCIPAL. */

package GuiaNr3;

public class nr49 {
    /* Esta es una funcion que obtiene el cuadrado de un numero */
    public static double cuadrado(double x) {
        double aux = 0;
        aux = x * x;
        return (aux);
    }
    /* Este es el PROGAMA PRINCIPAL desde donde llamaremos o INVOCAREMOS las FUNCIONES */
    public static void main(String[] args) throws Exception {
        /* Forma 1 de invocacion de una FUNCION */
        System.out.println("El cuadrado de un numero es "+ cuadrado(7));
    }
}
