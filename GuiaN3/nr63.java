package GuiaNr3;

import java.time.LocalDate;
import java.time.Month;

/*Realice una función que a partir de una fecha en formato (DIA, MES, AÑO) retorne la cantidad 
de días que transcurrieron desde el principio de ese mes hasta la fecha ingresada. */


public class nr63 {

    public static int diasTranscurridosDesdeInicioMes(int dia, int mes, int año) {
        // Crear un objeto LocalDate para la fecha ingresada
        LocalDate fechaIngresada = LocalDate.of(año, Month.of(mes), dia);

        // Crear un objeto LocalDate para el primer día del mes
        LocalDate primerDiaMes = LocalDate.of(año, Month.of(mes), 1);

        // Calcular la diferencia en días
        int diasTranscurridos = fechaIngresada.getDayOfMonth() - primerDiaMes.getDayOfMonth() + 1;

        return diasTranscurridos;
    }

    public static void main(String[] args) {
        int dia = 3;
        int mes = 9;
        int año = 2023;

        int diasTranscurridos = diasTranscurridosDesdeInicioMes(dia, mes, año);
        System.out.println("Desde el inicio del mes hasta el " + dia + "/" + mes + "/" + año + " han transcurrido "
                + diasTranscurridos + " días.");
    }
}