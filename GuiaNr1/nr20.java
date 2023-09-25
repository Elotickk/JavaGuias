//Ejercicio Nro. 20:
//Realizar un programa que permita el ingreso de 6 números que solamente deben estar
//comprendidos entre (0 y 10) “Los números ingresados no pueden ser ni mayores a 10, ni menores
//a cero”. Luego realizar la Suma de Todos ellos y mostrar el Promedio.

package GuiaNr1;
import java.util.Scanner;

public class nr20 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            double SumaTotal = 0;
            double numeroIngresado= 0;
            int cantidadNumValidos = 0;

            for (int i = 1; i <= 6 ; i = i + 1) {

                System.out.print("Ingrese el número " + i + ": ");
                numeroIngresado = scanner.nextInt();
                
                if ((numeroIngresado >= 0) && (numeroIngresado <= 10)){

                    SumaTotal = SumaTotal + numeroIngresado; // Acumulador
                    cantidadNumValidos = cantidadNumValidos + 1;
                }
                
            }

            System.out.println("La suma total de los números ingresados es: " + SumaTotal);

            if(cantidadNumValidos != 0) {

                System.out.println("El promedio de los números ingresados es: " + SumaTotal/cantidadNumValidos);
            }
            else {
                System.out.println("No se registraron numeros compredidos entro 0 y 10");
            }
        }
    }
}


