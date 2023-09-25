/* Ejercicio Nro.11:
Realizar un programa que permita el ingreso de dos números (A, B) y determine si la suma de ambos es mayor a 500. En ese caso mostrar un cartel diciendo que la suma de ambos superó a 500. */

package GuiaNr1;
import java.util.Scanner;

public class nr11 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {

            double num1 = 0;
            double num2 = 0;

            System.out.println("Ingrese un numero");
            num1 = Teclado.nextInt();
            
            System.out.println("Ingrese un numero");
            num2 = Teclado.nextInt();
            
            double suma = num1 + num2;

            if( suma > 500 ){
                System.out.println("El numero 1 ("+num1+") + el numero2 ("+num2+") supera los 500("+suma+")");
            }
            else{
                System.out.println("El numero 1 ("+num1+") + el numero2 ("+num2+") NO supera los 500("+suma+")");
            }
        }
    }
}
