package GuiaNr3;
import java.time.LocalDate;

/* Realice una función que a partir de dos fechas en formato (DIA1, MES1, AÑO1, DIA2, MES2, AÑO2) determine la 
cantidad de días que hay entre esas dos fechas. Para ello debería reutilizar algunas funciones de las que ya tiene definidas. */

public class nr68 {
    public static int diasEnAño(int año) {
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            return 366; // Es un año bisiesto
        } else {
            return 365; // No es un año bisiesto
        }
    }

    public static int diasDesdeInicioDeAño(int dia, int mes, int año) {
        LocalDate fechaIngresada = LocalDate.of(año, mes, dia);
        LocalDate primerDiaDelAño = LocalDate.of(año, 1, 1);
        
        // Calcular la diferencia en días
        int diasTranscurridos = (int) ((int) fechaIngresada.toEpochDay() - primerDiaDelAño.toEpochDay() + 1);
        
        return diasTranscurridos;
    }

    public static int diasEntreFechas(int dia1, int mes1, int año1, int dia2, int mes2, int año2) {
        
        int diasEnAño1 = diasEnAño(año1);
        int diasDesdeInicio1 = diasDesdeInicioDeAño(dia1, mes1, año1);
        
        int diasDesdeInicio2 = diasDesdeInicioDeAño(dia2, mes2, año2);
        
        // Calcular la diferencia en días entre las dos fechas
        int diferenciaEnDias = (diasEnAño1 - diasDesdeInicio1) + (diasDesdeInicio2 - 1); // Restamos 1 para incluir el día2
        
        // Sumar los años completos entre las dos fechas (excluyendo los años de inicio y fin)
        for (int año = año1 + 1; año < año2; año++) {
            diferenciaEnDias += diasEnAño(año);
        }
        
        return diferenciaEnDias;
    }

    public static void main(String[] args) {
        int dia1 = 25;
        int mes1 = 12;
        int año1 = 2023;

        int dia2 = 1;
        int mes2 = 1;
        int año2 = 2024;
        
        int diasEntre = diasEntreFechas(dia1, mes1, año1, dia2, mes2, año2);
        System.out.println("Entre el " + dia1 + "/" + mes1 + "/" + año1 + " y el " + dia2 + "/" + mes2 + "/" + año2 + " hay " + diasEntre + " días.");
    }
}

