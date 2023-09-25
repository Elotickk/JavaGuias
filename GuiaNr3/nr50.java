/* Ejercicio Nro. 50: Creación, Definición e Invocación de Funciones
Realizar una función que reciba como parámetro dos números (X, PORCENTAJE). El primero será un número que lo llamaremos x y al segundo lo llamaremos porcentaje. La idea es que la función tome el número x y le calcule el porcentaje que recibe como segundo parámetro; a ese resultado devolverlo al programa principal. Luego (INVOCAR Ó LLAMAR) esa función desde el programa PRINCIPAL. */

package GuiaNr3;

public class nr50 {
    public static double ObtenerPorcentaje(double x, double porcentaje) {
        double aux = 0;
        aux = (x * porcentaje )/100;
        return (aux);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("El porcentaje de que me diste es "+ ObtenerPorcentaje(2,10));
    }
}
