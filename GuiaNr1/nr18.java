//Ejercicio Nro. 18:
//Realice un programa que permita ingresar dos números que representarán hora de Salida y Hora de llegada de un vehículo.
//Controlar que la Hora de Llegada sea mayor a la hora de salida. Si estos valores fueron bien ingresados calcular la velocidad en la que llega un vehículo sabiendo que recorrió una distancia "D".

package GuiaNr1;
import java.util.Scanner;

public class nr18 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {

            double salida = 0;
            double llegada = 0;
            double distancia = 0;

            System.out.println("Ingrese tu hora de salida");
            salida = Teclado.nextDouble();

            System.out.println("Ingrese tu hora de entrada");
            llegada = Teclado.nextDouble();

            System.out.println("Ingrese la distancia recorrida");
            distancia = Teclado.nextDouble();

            if(llegada > salida){

                double velocidad = 0;

                velocidad = distancia / (llegada - salida);

                System.out.println("La velocidad recorrida es "+velocidad+"km por hora");

            }
            else{
                System.out.println("No puede ingresar una hora de salida mas grande que de entrada");
            }


        }
    }
}