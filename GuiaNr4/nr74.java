public class nr74 {
    public static void main(String[] args) {
        // Crear instancia de Articulo
        nr74ClassSuper articulo1 = new nr74ClassSuper(7890123456789L, "Leche Entera 1L", 2.5, 3.0, 100);

        // Mostrar el contenido
        articulo1.mostrarContenido();

        // Ejemplo de uso de métodos get y set
        articulo1.setPrecioVenta(3.5);
        System.out.println("Nuevo precio de venta de " + articulo1.getDescripcionArticulo() + ": " + articulo1.getPrecioVenta());
    }
}
