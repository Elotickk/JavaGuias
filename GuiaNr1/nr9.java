/* Ejercicio Nro. 9:
Realizar un programa que permita introducir dos números (A, B) y determine cuál es el mayor de los dos. */

package GuiaNr1;
import java.util.Scanner;

public class nr9 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {

            double num1 = 0;
            double num2 = 0;

            System.out.println("Ingrese un numero");
            num1 = Teclado.nextInt();
            
            System.out.println("Ingrese un numero");
            num2 = Teclado.nextInt();

            if(num1 > num2){
                System.out.println("El numero 1 ("+num1+") es mayor que el numero2("+num2+")");
            }
            else{
                System.out.println("El numero 2 ("+num2+") es mayor que el numero1("+num1+")");
            }
        }
    }
}