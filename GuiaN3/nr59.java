package GuiaNr3;

/* Realice una función que reciba como parámetro una fecha en formato (DIA, MES, AÑO) y valide si el día es correcto.
Por ejemplo:
- El día de la siguiente fecha es inválido 35/02/2015
- El día de la siguiente fecha es inválido 74/03/2000
- El día de la siguiente fecha es inválido 29/01/2001
- El día de la siguiente fecha es inválido 31/04/2001
La función debería devolver un valor booleano (true ó false) dependiendo si el día es válido ó no para el mes que se esté analizando y el año. */

public class nr59 {

    public static boolean AnioBisiesto(int anio) {
        if ((anio % 4 == 0 && anio % 100 != 0)) {
            return true;
        }
        return false;
    }
    
    public static boolean esDiaValido(int dia, int mes, int anio) {

        switch (mes) {
            case 2:
                return dia <= (AnioBisiesto(anio) ? 29 : 28);
            case 4: case 6: case 9: case 11:
                return dia <= 30;
            default:
                return dia <= 31;
        }
    }

    public static void main(String[] args) {
        int dia1 = 35;
        int mes1 = 2;
        int anio1 = 2015;
        
        boolean esValido1 = esDiaValido(dia1, mes1, anio1);
        
        System.out.println("El día de la fecha " + dia1 + "/" + mes1 + "/" + anio1 + " es válido: " + esValido1);
    }


}
