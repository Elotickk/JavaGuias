/* Ejercicio Nro.12:
Realizar un programa que permita el ingreso de dos números (A,B) y realizar el producto entre ambos (A * B); si el resultado del producto es mayor a 100 calcular el 10% del resultado y mostrarlo por pantalla; caso contrario calcular el 5% del producto y mostrarlo por pantalla.
Ejemplo1: Si al programa le ingresamos los números (10 y 15) el resultado del producto será igual a 150 (como el resultado supera los 100 debemos obtener el 10% y mostrarlo por pantalla); en este caso el 10% de 150 es igual a 15.
Ejemplo2: Si al programa le ingresamos los números (8 y 5) el resultado del producto será igual a 40 (como el resultado NO SUPERA los 100 debemos obtener el 5% y mostrarlo por pantalla); en este caso el 5% de 40 es igual a 2. */

package GuiaNr1;
import java.util.Scanner;

public class nr12 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {

            double num1 = 0;
            double num2 = 0;

            System.out.println("Ingrese un numero");
            num1 = Teclado.nextInt();
            
            System.out.println("Ingrese un numero");
            num2 = Teclado.nextInt();
            
            double multi = num1 * num2;

            if( multi > 100 ){

                double resultado = (multi * 10) / 100;
                System.out.println("El 10% del resultado de la multiplicacion es " + resultado);
            }
            else{
                
                double resultado2 = (multi * 5) / 100;
                System.out.println("El 5% del resultado de la multiplicacion es " + resultado2);
            }
        }
    }
}
