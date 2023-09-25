/* Ejercicio Nro.10:
Escribir un algoritmo que determine si un número N es divisible por M. */

package GuiaNr1;
import java.util.Scanner;

public class nr10 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {

            double num1 = 0;
            double num2 = 0;

            System.out.println("Ingrese un numero");
            num1 = Teclado.nextInt();
            
            System.out.println("Ingrese un numero");
            num2 = Teclado.nextInt();
            
            double division = num1 % num2;

            if( division != 0 ){
                System.out.println("El numero 1 ("+num1+") NO es divisible por el numero2("+num2+")");
            }
            else{
                System.out.println("El numero 1 ("+num1+") es divisible por el numero2("+num2+")");
            }
        }
    }
}