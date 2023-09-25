package GuiaNr3;
import java.time.Month;
import java.time.YearMonth;

/* Realice una función que a partir de una fecha en formato (DIA, MES, AÑO) retorne la 
cantidad de días que faltan para llegar a fin de mes. Para ello debería utilizar la función 
realizada en el ejercicio 57 donde se obtiene la cantidad de días para un mes y año determinado. */

public class nr64 {
    public static int diasEnMes(int mes, int año) {
        YearMonth yearMonth = YearMonth.of(año, Month.of(mes));
        return yearMonth.lengthOfMonth();
    }

    public static int diasFaltantesHastaFinDeMes(int dia, int mes, int año) {
        int diasEnEsteMes = diasEnMes(mes, año);
        int diasFaltantes = diasEnEsteMes - dia;
        return diasFaltantes;
    }

    public static void main(String[] args) {
        int dia = 29;
        int mes = 10;
        int año = 2023;

        int diasFaltantes = diasFaltantesHastaFinDeMes(dia, mes, año);
        System.out.println("Faltan " + diasFaltantes + " días para llegar al final del mes.");
    }
}


