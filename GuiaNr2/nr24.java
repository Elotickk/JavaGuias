/* Ejercicio Nro. 24: (Estructuras Repetitivas + Estructuras de Control de Flujo + Contadores + Acumuladores)
Realizar un Programa que permita ingresar 10 números y que para todos ellos realice las siguientes operaciones:
- Contar la cantidad de números pares
- Sumar el total de los números pares
- Promedio de números pares
- Contar la cantidad de números impares
- Sumar el total de los números impares
- Promedio de números impares
- Sumar la Cantidad total de elementos ingresados
Nota: Controlar que al realizar los promedios las cantidades no sean igual a cero; ya que al calcular el cociente podría dar una indeterminación. */

package GuiaNr2;
import java.util.Scanner;

public class nr24 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {

            double SumaTotal = 0;
            double numeroingresado= 0;
            int contador = 0;
            double parIngresados = 0;
            double totalPares = 0;
            double imparIngresados = 0;
            double totalImpares = 0;

            //Ciclo FOR
            for (int i = 1; i <= 10; i = i + 1) {

                System.out.print("Ingrese el número " + i + ": ");
                numeroingresado = Teclado.nextInt();
                
                SumaTotal = SumaTotal + numeroingresado; // Acumulador
                contador = contador + 1; //contador
                double par = numeroingresado % 2;
                double impar = numeroingresado % 3;

                if(par == 0){

                    parIngresados = parIngresados + 1;//Contador
                    totalPares = totalPares + parIngresados; //Acumulador
                }
                if(impar == 0){
                    imparIngresados = imparIngresados + 1;//Contador
                    totalImpares = totalImpares + imparIngresados; //Acumulador
                }
            }

            if(parIngresados == 0){
                System.out.println("No hay numeros par ingresados");
            }
            else{
                System.out.println("La suma total de numeros pares es "+ totalPares);
                System.out.println("La cantidad de numeros pares es "+ parIngresados);
                System.out.println("El promedio de los numeros par es "+ totalPares/parIngresados);
            }

            if(imparIngresados == 0){
                System.out.println("No hay numeros impar ingresados");
            }
            else{
                System.out.println("La suma total de numeros impares es "+ totalImpares);
                System.out.println("La cantidad de numeros impares es "+ imparIngresados);    
                System.out.println("El promedio de los numeros impar es "+ totalImpares/imparIngresados);
            }
        }
    }
}