/*Ejercicio Nro. 23: (Estructuras Repetitivas + Contadores + Acumuladores)
Realizar un Programa que permita introducir 15 valores por teclado y para todos ellos realice:
- Suma Total de Todos los elementos (ACUMULADOR)
- Cantidad Total de Todos los elementos (CONTADOR)
- Promedio Total de Todos los elementos */

package GuiaNr2;
import java.util.Scanner;

public class nr23 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {

            double SumaTotal = 0;
            double numeroingresado= 0;
            int contador = 0;

            //Ciclo FOR
            for (int i = 1; i <= 15; i = i + 1) {

                System.out.print("Ingrese el número " + i + ": ");
                numeroingresado = Teclado.nextInt();
                
                SumaTotal = SumaTotal + numeroingresado; // Acumulador

                contador = contador + 1; //contador
            }


            if (contador == 0){
                System.out.println("No puedo calcular el promedio porque la cantidad es 0");
            }
            else{
                System.out.println("El promedio de los números ingresados es: " + SumaTotal/contador);
            }
            System.out.println("La cantida de números ingresados es: " + contador);
            System.out.println("La suma total de los números ingresados es: " + SumaTotal);
        }
    }
}