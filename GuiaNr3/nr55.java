/* Realizar una función que reciba dos parámetros, una CADENA de texto y un CARACTER; a partir de 
estos datos determinar si ese carácter pasado como parámetro se encuentra en la cadena. La función
debería devolver la cantidad de veces que se encuentra ese carácter en la cadena.

Por Ejemplo:
Cadena = “hola sapo sin cola”
Si invocamos a la función deberíamos pasarle como parámetro la cadena y luego el carácter que se desea buscar d
entro de la cadena; la función debería recorrer la cadena buscando el carácter y contar la cantidad de veces que 
se encuentra y devolver ese valor. */

package GuiaNr3;

public class nr55 {
    public static int ContarCaracter(String cadena, char caracter) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        String cadena = "aguante Gustavo Cerati, Lionel Messi y Diego Maradona";
        char caracterBuscado = 'a';
        
        int cantidadDeVeces = ContarCaracter(cadena, caracterBuscado);

        System.out.println("El caracter '" + caracterBuscado + "' aparece " + cantidadDeVeces + " veces en la cadena.");
    }
}

