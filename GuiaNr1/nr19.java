//Ejercicio Nro.19:
//Realizar un programa que permita introducir 10 números y obtener los siguientes
//resultados.
//Nota: No debe utilizar 10 variables diferentes, puede reutilizar una misma variable

//La Suma total de todos los números Ingresados
//El Promedio de todos los números ingresados

package GuiaNr1;
import java.util.Scanner;

public class nr19 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            double SumaTotal = 0;
            double numeroingresado= 0;
            int contador = 0;

            //Ciclo FOR
            /*for (int i = 1; i <= 10; i = i + 1) {

                System.out.print("Ingrese el número " + i + ": ");
                numeroingresado = scanner.nextInt();
                
                SumaTotal = SumaTotal + numeroingresado; // Acumulador

                contador = contador + 1; //contador
            }*/

            int j = 1;
            while(j <= 10){

                System.out.print("Ingrese el número " + j + ": ");
                numeroingresado = scanner.nextInt();
                
                SumaTotal = SumaTotal + numeroingresado; // Acumulador

                contador = contador + 1; //contador

                j++;
            }

            System.out.println("La suma total de los números ingresados es: " + SumaTotal);
            
            if(contador != 0){
                System.out.println("El promedio de los números ingresados es: " + SumaTotal/contador);
            }
        }
    }
}
