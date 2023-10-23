public class nr73 {
    public static void main(String[] args) {
        // Crear instancia de Libro
        nr73ClassLibro libro1 = new nr73ClassLibro(1234, 2023, 10, 13, "El Señor de los Anillos", "J.R.R. Tolkien");

        // Mostrar el contenido
        libro1.mostrarContenido();

        // Ejemplo de uso de métodos get y set
        libro1.setAnioEdicion(2025);
        System.out.println("Nueva fecha de edición del libro '" + libro1.getTituloLibro() + "': " + libro1.getDiaEdicion() + "/" + libro1.getMesEdicion() + "/" + libro1.getAnioEdicion());
    }
}
