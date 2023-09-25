package GuiaNr3;

/* Ejercicio Nro. 62: Creación, Definición e Invocación de Funciones
Realice una función que determine si una fecha en formato (DIA, MES, AÑO) es una fecha válida y para ello deberá utilizar las funciones desarrolladas en los ejercicios (58, 59 y 60).
Nota: Una fecha válida sería aquella que
- El día es válido
- El mes es válido
- El año es válido */

public class nr62 {

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

    public static boolean MesValido(int mes) {
        return mes >= 1 && mes <= 12;
    }

    public static boolean esFechaValida(int dia, int mes, int anio) {
        if (esDiaValido(dia, mes, anio)) {
            if (MesValido(mes)) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int dia = 7;
        int mes = 19;
        int anio = 2023;
    
        if (esFechaValida(dia, mes, anio)) {
            System.out.println("La fecha es válida.");
        } 
        else {
            System.out.println("La fecha no es válida.");
        }
    }
}
