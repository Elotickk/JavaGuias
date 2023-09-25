/* Ejercicio Nro. 51: Creación, Definición e Invocación de Funciones
Realizar una función que reciba como parámetro dos números y devuelva el menor de ambos. Luego (INVOCAR Ó LLAMAR) esa función desde el programa PRINCIPAL. Luego (INVOCAR Ó LLAMAR) esa función desde el programa PRINCIPAL. */

package GuiaNr3;

public class nr51 {
    public static double NumeroMenor(double num1, double num2) {

        if (num1 > num2) {
            return (num2);
        } 
        else if (num2 > num1) {
            return (num1);
        } 
        else {
            return (num1);
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("El numero menor es = "+ NumeroMenor(12, 6));
    }
}
