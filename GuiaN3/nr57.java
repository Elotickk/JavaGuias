package GuiaNr3;

/* Realizar una función que determine si un año enviado por parámetro es año bisiesto, la función debe devolver un valor booleano (true o false).
Nota: Los años bisiestos son aquellos cuyo número cumple las siguientes características
- Son divisibles por 4
y
- (No son Divisibles por 100 salvo que sean divisibles por 400)
((EsDivisiblePor4 == true) y (NoEsDivisiblePor100 ó EsDivisiblePor400)) */

public class nr57 {
    public static boolean AnioBisiesto(int anio) {
        if ((anio % 4 == 0 && anio % 100 != 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int anio = 2025;
        
        if (AnioBisiesto(anio)) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
    }

}
