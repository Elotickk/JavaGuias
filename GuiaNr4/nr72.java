public class nr72 {
    public static void main(String[] args) {
        // Crear instancia de Club
        nr72ClassClub club1 = new nr72ClassClub("Boca Juniors", 17, 56, "https://www.bocajuniors.com.ar");
        nr72ClassClub club2 = new nr72ClassClub("River Plate", 18, 52, "https://www.riverplate.com.ar");

        // Mostrar el contenido
        club1.mostrarContenido();

        // Ejemplo de uso de métodos get y set
        club1.setCantidadTitulosInternacionales(18);
        System.out.println("Nueva cantidad de títulos internacionales de " + club1.getNombreClub() + ": " + club1.getCantidadTitulosInternacionales());

        System.out.println("El mas grande es " + club2.getNombreClub());
    }
}
