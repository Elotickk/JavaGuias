/* Ejercicio Nro. 8:
Realizar un programa que permita el Ingreso de un número (X); luego calcular y mostrar sobre ese número las siguientes operaciones.
- Mostrar el cuadrado de X
- Mostrar la Raíz cuadrada de X
- Mostrar el resultado de la siguiente operación: x3 */

package GuiaNr1;
import java.util.Scanner;

public class nr8 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {

            double num = 0;

            System.out.println("Ingrese un numero");
            num = Teclado.nextInt();

            double cuadrado = Math.pow(num, 2);
            double cubo = Math.pow(num, 3);
            
            System.out.println("El resultado del cuadrado es " + cuadrado);
            System.out.println("El resultado del cuadrado es " + cubo);

            double raiz = 0;

            if(num > 0){
                raiz = Math.sqrt(num);
                System.out.println("El resultado del cuadrado es " + raiz);
            }
            else{
                System.out.print("El numero tiene que ser mayor a 0 para sacar la raiz");
            }
        }
    }
}
