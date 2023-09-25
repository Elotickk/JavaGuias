/* Ejercicio Nro. 46: Creación, Definición e Invocación de Procedimientos
Realice un procedimiento que permita dibujar una línea de 10(diez) asteriscos por pantalla y luego (INVOCAR Ó LLAMAR) ese procedimiento desde el programa PRINCIPAL. */

package GuiaNr3;
import java.util.Scanner;

public class Funciones    {
    /* Esta es una funcion que obtiene el cuadrado de un numero */
    public static double cuadrado(double x) {
        double aux = 0;
        aux = x * x;
        return (aux);
    }
    /* Este es el PROGAMA PRINCIPAL desde donde llamaremos o INVOCAREMOS las FUNCIONES */
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {

            /* Forma 1 de invocacion de una FUNCION */
            System.out.println("El cuadrado de un numero es "+ cuadrado(7));

            /* Forma 2 de invacion de una FUNCION */
            double num = 20;
            double resultado = cuadrado(num);

            System.out.println("El cuadrado de num es "+ resultado);

            /* Forma 3 de invacion de una FUNCION */
            double a1 = 15;
            double a2 = 5;

            double a3 = cuadrado(a1) + cuadrado(a2);

            System.out.println("El resultado de la operacion es:= "+ a3);

        }
    }
}