/* Ejercicio Nro. 48: Creación, Definición e Invocación de Funciones
Realice una función que reciba dos parámetros (a y b) y sume ambos parámetros y los devuelva. Luego (INVOCAR Ó LLAMAR) esa función desde el programa PRINCIPAL. */

package GuiaNr3;

public class nr48 {
    public static double suma(double x, double y) {
        double aux = 0;
        aux = x + y;
        return (aux);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("La suma de los parametros que me diste es "+ suma(7,8));
    }
}
