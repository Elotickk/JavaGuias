/* Ejercicio Nro. 7:
Dado los lados de un rectángulo (Base y Altura) determinar la superficie de los mismos. */

package GuiaNr1;
import java.util.Scanner;

public class nr7 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {
            
            double base = 0;
            double altura = 0;
            double superficie = 0;

            System.out.println("Ingrese la base del rectangulo");
            base = Teclado.nextInt();
            System.out.println("Ingrese la altura del rectangulo");
            altura = Teclado.nextInt();

            if (base > 0 && altura > 0){
                superficie = base * altura;
                System.out.println("La superficie del rectangulo es "+ superficie);
            }
            else{
                System.out.print("Ingrese la base o altura mayor que 0");
            }
            
        }
    }
}