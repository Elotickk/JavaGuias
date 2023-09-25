package GuiaNr3;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/* Ejercicio Nro. 66: Creación, Definición e Invocación de Funciones
Realice una función que a partir de una fecha en formato (DIA, MES, AÑO) determine la Cantidad de días que faltan para llegar a fin de año. */

public class nr66 {
    public static long diasFaltantesHastaFinDeAño(int dia, int mes, int año) {
        LocalDate fechaIngresada = LocalDate.of(año, mes, dia);
        
        // Crear una fecha para el final del año
        LocalDate finDeAño = LocalDate.of(año, 12, 31);
        
        // Calcular la diferencia en días
        long diasFaltantes = ChronoUnit.DAYS.between(fechaIngresada, finDeAño);
        
        return diasFaltantes;
    }

    public static void main(String[] args) {
        int dia = 15;
        int mes = 9;
        int año = 2023;

        long diasFaltantes = diasFaltantesHastaFinDeAño(dia, mes, año);
        System.out.println("Faltan " + diasFaltantes + " días para llegar al final del año.");
    }
}
