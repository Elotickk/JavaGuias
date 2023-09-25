/*Ejercicio Nro. 21: (Estructuras Condicionales Múltiples)
Realizar un Programa que permita el Ingreso de 3 números (variables) y determine:
Cuál es el mayor ¿?
Cuál es el Segundo ¿?
Cuál es el tercero ¿?
Nota: Contemple el caso en que los tres números sean iguales. */

package GuiaNr2;
import java.util.Scanner;

public class nr21 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {

            double num1 = 0;
            double num2 = 0;
            double num3 = 0;

            System.out.println("Ingrese un numero");
            num1 = Teclado.nextDouble();
            System.out.println("Ingrese un numero");
            num2 = Teclado.nextDouble();
            System.out.println("Ingrese un numero");
            num3 = Teclado.nextDouble();

            if ((num1 > num2) && (num1 > num3)) {
                if (num2 > num3) {
                    System.out.print("1 2 3");
                } else {
                    if (num3 > num2) {
                        System.out.print("1 3 2");
                    } else {
                        System.out.print("1 2=3");
                    }
                }
            }
            if ((num2 > num1) && (num2 > num3)) {
                if (num1 > num3) {
                    System.out.print("2 1 3");
                } else {
                    if (num3 > num1) {
                        System.out.print("2 3 1");
                    } else {
                        System.out.print("2 1=3");
                    }
                }
            }
            if ((num3 > num1) && (num3 > num2)) {
                if (num2 > num1) {
                    System.out.print("3 2 1");
                } else {
                    if (num1 > num2) {
                        System.out.print("3 1 2");
                    } else {
                        System.out.print("3 2=1");
                    }
                }
            }
            if ((num1 == num2) && (num3 == num2) && (num3 == num1)) {
                System.out.print("1=2=3");
            }
            if ((num1 < num3) && (num2 > num1)) {
                if (num1 == num2) {
                    System.out.print("1=2 3");
                }
                if (num3 == num2) {
                    System.out.print("2=3 1");
                }
            }

            // if(num2 == num3 ){
            // System.out.print("1 2=3");
            // }
            /*
             * if((num1 > num2) && (num2 > num3)){
             * System.out.print("1 2 3");
             * }
             * if((num1 > num2) && (num3 > num2)){
             * System.out.print("1 3 2");
             * }
             * if((num1 > num2) && (num2 == num3)){
             * System.out.print("1 2 = 3");
             * }
             * if((num2 > num1) && (num1 > num3)){
             * System.out.print("2 1 3");
             * }
             * if((num2 > num1) && (num3 > num1)){
             * System.out.print("2 3 1");
             * }
             * if((num2 > num1) && (num1 == num3)){
             * System.out.print("2 1 = 3");
             * }
             * if((num3 > num1) && (num1 > num2)){
             * System.out.print("3 1 2");
             * }
             * if((num3 > num1) && (num2 > num1)){
             * System.out.print("3 2 1");
             * }
             * if((num3 > num1) && (num1 == num2)){
             * System.out.print("3 1 = 2");
             * }
             * if((num2 == num1) && (num3 == num2)){
             * System.out.print("3 = 1 = 2");
             * }
             */
        }
    }
}