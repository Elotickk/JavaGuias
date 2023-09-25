package GuiaNr3;

/* Realice una función que a partir del año de una fecha (AÑO) retorne la cantidad de días que tiene ese año. Por ejemplo:
- El año 2016 tiene 366 días (Porque es Bisiesto)
- El año 2015 tiene 365 días (Porque no es Bisiesto) */

public class nr65 {
    public static int diasEnAño(int año) {
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            return 366; // Es un año bisiesto
        } else {
            return 365; // No es un año bisiesto
        }
    }

    public static void main(String[] args) {
        int año1 = 2016;
        int año2 = 2023;

        int diasEnAño1 = diasEnAño(año1);
        int diasEnAño2 = diasEnAño(año2);

        System.out.println("El año " + año1 + " tiene " + diasEnAño1 + " días.");
        System.out.println("El año " + año2 + " tiene " + diasEnAño2 + " días.");
    }
}
