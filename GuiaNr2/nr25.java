/*Ejercicio Nro. 25: (Estructuras Repetitivas + Contadores + Acumuladores)
Realizar un Programa que permita ingresar “n” números; siendo n una variable que el operador debe ingresar apenas inicia el programa. Para esos “n” números se debe obtener los cálculos que abajo se detallan y tener las consideraciones siguientes:
Tener las siguientes consideraciones:
- Descartar el ingreso de números negativos y mayores a 50
Para los números permitidos que estarían comprendidos entre (0 y 50) calcular lo siguiente
o Cantidad total de elementos ingresados
o Suma total de elementos ingresados
o Cantidad total de elementos comprendidos entre 0 y 25
o Suma total de elementos comprendidos entre 0 y 25
o Promedio de todos los números comprendidos entre 0 y 25
o Cantidad total de elementos comprendidos entre 25 y 50
o Suma total de elementos comprendidos entre 25 y 50
o Promedio de todos los números comprendidos entre 25 y 50
Nota: Controlar que al realizar los promedios las cantidades no sean igual a cero; ya que al calcular el cociente podría dar una indeterminación. */

package GuiaNr2;
import java.util.Scanner;

public class nr25 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {

            int cantidadNumIngresar = 0;
            double numeroIngresado = 0;

            double cantidadNum0a50 = 0;
            double sumaNum0a50 = 0;

            double cantidadNum0a25 = 0;
            double sumaNum0a25 = 0;

            double cantidadNum25a50 = 0;
            double sumaNum25a50 = 0;


            System.out.println("Indique la cantidad de numeros a ingresar:");
            cantidadNumIngresar = Teclado.nextInt();

            System.out.println("Indique la cantidad de numeros a ingresar:"+cantidadNumIngresar);

            for(int i = 1; i <= cantidadNumIngresar;i++){

                System.out.println("Ingrese el número " + i + ": ");
                numeroIngresado = Teclado.nextDouble();

                if ((numeroIngresado > 0) && (numeroIngresado <= 50)){
                    cantidadNum0a50 = cantidadNum0a50 + 1;
                    sumaNum0a50 = numeroIngresado + sumaNum0a50;

                    if ((numeroIngresado > 0) && (numeroIngresado < 25)){
                        cantidadNum0a25 = cantidadNum0a25 + 1;
                        sumaNum0a25 = numeroIngresado + sumaNum0a25;
                    }

                    if ((numeroIngresado >= 25) && (numeroIngresado <= 50)){
                        cantidadNum25a50 = cantidadNum25a50 + 1;
                        sumaNum25a50 = numeroIngresado + sumaNum25a50;
                    }
                }
            }
            if (cantidadNum0a25 == 0){
                System.out.println("No puedo calcular porque no hay numeros de 0 a 25");
            }
            else{
                System.out.println("Numeros entre 0 y 25");
                System.out.println("La cantida de números ingresados es: " + cantidadNum0a25);
                System.out.println("La suma total de los números ingresados es: " + sumaNum0a25);
                System.out.println("El promedio de los números ingresados es: " + sumaNum0a25/cantidadNum0a25);
            }

            if (cantidadNum25a50 == 0){
                System.out.println("No puedo calcular porque no hay numeros de 25 a 50");
            }
            else{
                System.out.println("Numeros entre 25 y 50");
                System.out.println("La cantida de números ingresados es: " + cantidadNum25a50);
                System.out.println("La suma total de los números ingresados es: " + sumaNum25a50);
                System.out.println("El promedio de los números ingresados es: " + sumaNum25a50/cantidadNum25a50);
            }

            if (cantidadNum0a50 == 0){
                System.out.println("No puedo calcular porque no hay numeros de 25 a 50");
            }
            else{
                System.out.println("Numeros entre 0 y 50");
                System.out.println("La cantida de números ingresados es: " + cantidadNum0a50);
                System.out.println("La suma total de los números ingresados es: " + sumaNum0a50);
            }
        }
    }
}