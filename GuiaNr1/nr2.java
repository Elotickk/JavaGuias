/* Ejercicio Nro. 2:
Realizar un programa que permita el Ingreso de 2 (dos números) (A y B) utilizando variables y que realice las siguientes operaciones.
- Muestre la suma de ambos (A + B)
- Muestre la resta del primero (A – B)
- Muestre el Producto de ambos (A * B)
- Muestre el Cociente entre ambos (A / B)
Nota: En este último caso, verificar que sucede cuando B es igual a cero. Que sucede con el programa ¿?.*/

package GuiaNr1;
import java.util.Scanner;

public class nr2 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {
            double a = 0; // Declaro variable
            double b = 0; // Declaro variable

            System.out.println("Por favor ingrese el valor de A");
            a = Teclado.nextDouble();
            System.out.println("Por favor ingrese el valor de B");
            b = Teclado.nextDouble();

            double suma = a + b;
            double resta = a - b;
            double multi = a * b;
            double div = 0;

            System.out.println("La suma es igual a " + suma);
            System.out.println("La resta es igual a " + resta);
            System.out.println("La multiplicacion es igua a " + multi);

            if (b != 0) {
                div = a / b;
            } else {
                System.out.println("No pude realizar la division porque B = a 0");
            }

            System.out.println("La division es igual a " + div);
        }

    }
}