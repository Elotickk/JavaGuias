/* Ejercicio Nro. 54: Creación, Definición e Invocación de Funciones
Realizar una función que reciba como parámetro una cadena de texto y a partir de ella devuelva la cantidad de vocales que tiene la misma. */

package GuiaNr3;

public class nr54 {
    public static boolean CaracterEsVocal(char Caracter){
        if ((Caracter == 'A') || (Caracter == 'E') || (Caracter == 'I') || (Caracter == 'O') || (Caracter == 'U')){
            return true;
        }
        else {
            return false;
        }
    }

    public static int cantidadVocales(String texto) {
        int cantidad = 0;
        for (int i = 0; i <= texto.length()-1;i++){

            char CaracterExtraido = texto.charAt(i);
            if (CaracterEsVocal(CaracterExtraido)){
                cantidad = cantidad + 1;
            }
        }
        return (cantidad);
    }

    public static void main(String[] args) {
        System.out.println("La cantidad de vocales que tiene el texto siguiente es "+cantidadVocales("AGUANTE RIVER HDP LA CONCHA DE TU MADRE"));
    }
}
