/* Ejercicio Nro.13:
Realizar un programa que permita introducir cuatro números (A,B,C,D) y determinar si la suma de los dos primeros (A + B) es mayor a la suma de los dos segundos (C + D). */

package GuiaNr1;
import java.util.Scanner;

public class nr13 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {

            double A = 0;
            double B = 0;
            double C = 0;
            double D = 0;

            System.out.println("Ingrese un numero");
            A = Teclado.nextInt();
            
            System.out.println("Ingrese un numero");
            B = Teclado.nextInt();

            System.out.println("Ingrese un numero");
            C = Teclado.nextInt();
            
            System.out.println("Ingrese un numero");
            D = Teclado.nextInt();
            
            double suma = A + B;
            double suma2 = C + D;

            if( suma == suma2 ){
                System.out.println("La suma de A y B es igual al de C y D");
            }
            else{
                if (suma > suma2) {
                    System.out.println("La suma de A y B es MAYOR" );
                }
                else{
                    System.out.println("La suma de C y D es MAYOR");
                }
            }
        }
    }
}

