/* Ejercicio Nro. 52: Creación, Definición e Invocación de Funciones
Realizar una función que reciba como parámetro un número y determine si el número ingresado es par o es impar. La función podría llamarse EsNumeroPar y debería devolver un valor booleano (true ó false). Luego (INVOCAR Ó LLAMAR) esa función desde el programa PRINCIPAL. */

package GuiaNr3;

public class nr52 {
    public static boolean EsNumeroPar(double num1) {
        if (num1 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("El numero par es " + EsNumeroPar(13));
    }
}
