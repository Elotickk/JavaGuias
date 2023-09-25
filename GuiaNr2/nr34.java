/* Ejercicio Nro. 34: Trabajo con Cadenas de Caracteres + Contadores
Realizar un programa que almacene una cadena de texto en una variable (que deberá introducir por teclado el operador) y a partir de ella recorrer la cadena caracter por caracter y realizar las siguientes operaciones.
- Contar la cantidad de veces que aparece la letra A
- Contar la cantidad de veces que aparece la letra E
- Determinar cuál de las dos letras aparece más que la otra dentro de la cadena */

package GuiaNr2;
import java.util.Scanner;

public class nr34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String cadena = scanner.nextLine();
        scanner.close();

        int contadorA = 0;
        int contadorE = 0;

        for (char caracter : cadena.toCharArray()) {
            if (caracter == 'A' || caracter == 'a') {
                contadorA++;
            } else if (caracter == 'E' || caracter == 'e') {
                contadorE++;
            }
        }

        char letraMasFrecuente;
        if (contadorA > contadorE) {
            letraMasFrecuente = 'A';
        } else if (contadorE > contadorA) {
            letraMasFrecuente = 'E';
        } else {
            letraMasFrecuente = 'N';
        }

        System.out.println("Cantidad de veces que aparece la letra A: " + contadorA);
        System.out.println("Cantidad de veces que aparece la letra E: " + contadorE);
        System.out.println("La letra que aparece más frecuentemente es: " + letraMasFrecuente);
    }
}
