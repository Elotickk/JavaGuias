package GuiaNr3;

/* Realice una función que reciba como parámetro una fecha en formato (DIA, MES, AÑO) y determine si el mes ingresado es válido.
Por ejemplo:
- El mes de la siguiente fecha es inválido (31/14/2015)
- El mes de la siguiente fecha es inválido (02/17/2015)
La función debería devolver un valor booleano (true ó false) dependiendo si el día es válido ó no para la fecha que se está analizando. */

public class nr60 {
    public static boolean MesValido(int mes) {
        return mes >= 1 && mes <= 12;
    }
    
    public static void main(String[] args) {
        int dia = 31;
        int mes = 14;
        int anio = 2015;
    
        boolean esValido = MesValido(mes);
    
        if (esValido) {
            System.out.println("El mes de la fecha " + dia + "/" + mes + "/" + anio + " es válido.");
        } else {
            System.out.println("El mes de la fecha " + dia + "/" + mes + "/" + anio + " es inválido.");
        }
    }

}
