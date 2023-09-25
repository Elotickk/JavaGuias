package GuiaNr3;
/* Ejercicio Nro.58: Creación, Definición e Invocación de Funciones
Realizar una función que retorne la cantidad de días de un mes determinando, 
teniendo la particularidad de que el Mes de Febrero de los años bisiestos tiene 29 días. 
Es decir, para poder devolver la cantidad de días de un mes necesitará pasar como parámetro dos parámetros; el mes y el año. */


public class nr58 {

    public static boolean AnioBisiesto(int anio) {
        if ((anio % 4 == 0 && anio % 100 != 0)) {
            return true;
        }
        return false;
    }
    
    public static int esAnioValido(int mes, int anio) {
        if (mes < 1 || mes > 12) {

        }
        
        switch (mes) {
            case 2:
                return AnioBisiesto(anio) ?29 : 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }

    public static void main(String[] args) {
        int mes = 9;
        int anio = 2650;
        
        int cantidadDias = esAnioValido(mes, anio);
        System.out.println("El mes " + mes + " del año " + anio + " tiene " + cantidadDias + " días.");
    }

}
