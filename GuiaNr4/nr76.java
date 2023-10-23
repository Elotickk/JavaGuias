// Ejercicio Nro. 76: Realice un programa en JAVA utilizando el Compilador NetBeans donde:
// Defina un vector que permita almacenar datos de los CLUBES de Primera DIVISIÓN del Futbol Argentino, para ello debería crear un vector a partir de la clase definida por Ud. en el Ejercicio 72 y para esa estructura realizar lo siguiente:
// - Cargar los elementos del VECTOR DE CLUBES
// - Recorrer el VECTOR DE CLUBES obteniendo cual es el CLUB que mayor cantidad de títulos Internacionales tiene en la actualidad ¿?.
// - Recorrer el VECTOR DE CLUBES obteniendo cual es el CLUB que mayor cantidad de títulos Nacionales tiene en la actualidad ¿?.

public class nr76 {
    public static void main(String[] args) {
        nr72ClassClub[] clubes = new nr72ClassClub[3]; // Tamaño del vector de clubes

        // Cargar los elementos del vector de clubes
        clubes[0] = new nr72ClassClub("Boca Juniors", 18, 56, "https://www.bocajuniors.com.ar");
        clubes[1] = new nr72ClassClub("River Plate", 12, 52, "https://www.cariverplate.com.ar");
        clubes[2] = new nr72ClassClub("Independiente", 18, 26, "https://clubaindependiente.com/");

        // Encontrar el club con la mayor cantidad de títulos internacionales
        nr72ClassClub maxTitulosInternacionales = clubes[0];
        for (nr72ClassClub club : clubes) {
            if (club.getCantidadTitulosInternacionales() > maxTitulosInternacionales
                    .getCantidadTitulosInternacionales()) {
                maxTitulosInternacionales = club;
            }
        }
        System.out.println("El club con más títulos internacionales es: " + maxTitulosInternacionales.getNombreClub());

        // Encontrar el club con la mayor cantidad de títulos nacionales
        nr72ClassClub maxTitulosNacionales = clubes[0];
        for (nr72ClassClub club : clubes) {
            if (club.getCantidadTitulosNacionales() > maxTitulosNacionales.getCantidadTitulosNacionales()) {
                maxTitulosNacionales = club;
            }
        }
        System.out.println("El club con más títulos nacionales es: " + maxTitulosNacionales.getNombreClub());
    }
}
