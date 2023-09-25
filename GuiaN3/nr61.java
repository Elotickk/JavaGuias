package GuiaNr3;

/* Realice una función que reciba como parámetro una fecha en formato (DIA,MES, AÑO) y determine si el año ingresado es válido.
Por ejemplo:
- El año de la siguiente fecha es inválido (02/01/0000)
- El año de la siguiente fecha es inválido (02/01/-1900) */

public class nr61 {
    public static boolean esAnioValido(int dia, int mes, int anio) {
        if (anio >= 1 && anio <= 9999) {
            return true; 
        } else {
            return false;
            }
        }
    
        public static void main(String[] args) {
            int dia = 2;
            int mes = 1;
            int anio = 678;
    
            if (esAnioValido(dia, mes, anio)) {
                System.out.println("El año de la fecha ingresada es válido.");
            } else {
                System.out.println("El año de la fecha ingresada es inválido.");
            }
        }
    

}
