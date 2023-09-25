//Ejercicio Nro. 17: (No se hace con Scratch)
//Realizar un programa que dado un polinomio de segundo grado (aX2+bX + C) obtenga las raíces del polinomio utilizando la fórmula de Bhaskara.
//Se deberían introducir los valores (a, b y c) y a partir de ellos realizar la siguiente operación

//Raíz x1 = (-b + raíz (b2 – 4 * a * c)) / 2 * a
//Raíz x2 = (-b - raíz (b2 – 4 * a * c)) / 2 * a

package GuiaNr1;
import java.util.Scanner;

public class nr17 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {

            double a = 0;
            double b = 0;
            double c = 0;

            System.out.println("Ingrese el valor de A");
            a = Teclado.nextDouble();

            System.out.println("Ingrese el valor de B");
            b = Teclado.nextDouble();

            System.out.println("Ingrese el valor de C");
            c = Teclado.nextDouble();

            if(a == 0){
                System.out.println("Ingrese otro numero diferente a 0");
            }
            else{

                double x1 = 0,x2 = 0;

                x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

                x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

                System.out.println("Las raices del polinomio son x1="+x1+" x2:"+x2);
            }

        }
    }
}