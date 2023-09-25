/* Realice un procedimiento que permita dibujar una línea de 10(diez) asteriscos por pantalla y luego (INVOCAR Ó LLAMAR) ese procedimiento desde el programa PRINCIPAL. */

package GuiaNr3;

public class nr46 {
    public static void dibujarLinea() {
        for (int i = 0; i < 10; i++) {
            System.out.println("*");
        }
    }
    public static void main(String[] args)  {
        dibujarLinea();
    }
}
