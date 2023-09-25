/* Ejercicio Nro. 31: (Estructuras repetitivas + uso de banderas + Contador + Acumulador)
Realizar un programa que permita el ingreso de 10 números por teclado y determinar:
- Cuál de ellos es el mayor ¿?.
- Cuál de ellos es el menor ¿?.
- Suma total de todos los números ingresados
- Cantidad total de todos los números ingresados
- Promedio total de todos los números ingresados
- Si el Promedio es mayor que 10 obtener el 10% del mayor valor y mostrarlo por teclado
- Si el Promedio es menor que 10 obtener el 15% del menor valor y mostrarlo por teclado. */

package GuiaNr2;
import java.util.Scanner;

public class nr31 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {

            double numeroIngresado = 0;

            double mayor = 0;
            double menor = 0;

            double sumaTotal = 0;
            double contador = 0;

            for (int i = 1; i <= 10; i++) {

                System.out.println("Ingrese un numero:");
                numeroIngresado = Teclado.nextDouble();

                if (i == 1){
                    mayor = numeroIngresado;
                    menor = numeroIngresado;
                }

                if(numeroIngresado > mayor){
                    mayor = numeroIngresado;
                }

                if(numeroIngresado < menor){
                    menor = numeroIngresado;
                }

                sumaTotal = sumaTotal + numeroIngresado; // Acumulador
                contador = contador + 1; // contador
            }

            System.out.println("El numero mayor de los 10 es " + mayor);
            System.out.println("El numero menor de los 10 es " + menor);



            if (contador == 0) {
                System.out.println("No hay numeros ingresados");
            } else {
                Double promedio = sumaTotal / contador;
                System.out.println("La suma total de numeros es " + sumaTotal);
                System.out.println("La cantidad de numeros es " + contador);
                System.out.println("El promedio de los numeros es " + promedio);
                if(promedio > 10){
                    System.out.println("El 10% del mayor es " + (mayor * 10)/100);
                }
                if(promedio < 10){
                    System.out.println("El 5% del menor es " + (menor * 5)/100);
                }
            }   
        }
    }
}