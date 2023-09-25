package GuiaNr3;

/* Ejercicio Nro. 67: Creación, Definición e Invocación de Funciones
Realice una función que a partir de una fecha en formato (DIA, MES, AÑO) determine la cantidad de días que hay desde principio de año a esa fecha. */

import java.time.LocalDate;

public class nr67 {
    public static int diasDesdeInicioDeAño(int dia, int mes, int año) {
        LocalDate fechaIngresada = LocalDate.of(año, mes, dia);
        LocalDate primerDiaDelAño = LocalDate.of(año, 1, 1);
        
        // Calcular la diferencia en días
        int diasTranscurridos = (int) ((int) fechaIngresada.toEpochDay() - primerDiaDelAño.toEpochDay() + 1);
        
        return diasTranscurridos;
    }

    public static void main(String[] args) {
        int dia = 15;
        int mes = 2;
        int año = 2023;

        int diasDesdeInicio = diasDesdeInicioDeAño(dia, mes, año);
        System.out.println("Desde el inicio del año hasta el " + dia + "/" + mes + "/" + año + " han transcurrido " + diasDesdeInicio + " días.");
    }
}




