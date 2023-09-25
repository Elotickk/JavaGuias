/* Ejercicio Nro.6:
Realizar un programa que permita ingresar por teclado un valor que represente un importe en pesos y a eso convertirlo a diferentes monedas según la cotización actual de esa moneda. Por ejemplo:
Valor en Pesos Argentinos: 45,20
El programa debería calcular
Valor en dólares: =
Valor en Euros:=
Valor en Reales (Moneda Brasileña):= */

package GuiaNr1;
import java.util.Scanner;

public class nr6 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {

            double pesosArg = 0;
            double dolar  = 223;
            double euro = 229;
            double real = 43;

            System.out.println("Ingrese los pesos Argentinos a pasar a dolares,euro y real");
            pesosArg = Teclado.nextInt();

            double resultadoDolar = pesosArg / dolar;
            double resultadoEuro = pesosArg / euro;
            double resultadoReal = pesosArg / real;

            System.out.println("La cantida de "+ pesosArg +" pesos argentinos a dolares es "+ resultadoDolar);
            System.out.println("La cantida de "+ pesosArg +" pesos argentinos a euro es "+ resultadoEuro);
            System.out.println("La cantida de "+ pesosArg +" pesos argentinos a real es "+ resultadoReal);
        }
    }
}