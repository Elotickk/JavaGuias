// Ejercicio Nro. 74: Realice un programa en JAVA utilizando el Compilador NetBeans donde:
// Defina una clase de Usuario que permita almacenar los datos de un artículo de un supermercado donde se registren los siguientes datos.
// ARTICULO:
// - CODIGO DE ARTICULO (Código de BARRAS)
// - DESCRIPCION ARTICULO
// - PRECIO COMPRA
// - PRECIO VENTA
// - CANTIDAD ARTICULOS EN STOCK
//  Debe crear su Constructor
//  Crear varias variables desde el programa principal que sean del Tipo (Clase definida por el Usuario)
//  Mostrar su contenido
//  Implemente los métodos get y set de todos los atributos.

public class nr74ClassSuper {
    private long codigoArticulo;
    private String descripcionArticulo;
    private double precioCompra;
    private double precioVenta;
    private int cantidadEnStock;

    // Constructor
    public nr74ClassSuper(long codigoArticulo, String descripcionArticulo, double precioCompra, double precioVenta, int cantidadEnStock) {
        this.codigoArticulo = codigoArticulo;
        this.descripcionArticulo = descripcionArticulo;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.cantidadEnStock = cantidadEnStock;
    }

    // Métodos get y set
    public long getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(long codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public String getDescripcionArticulo() {
        return descripcionArticulo;
    }

    public void setDescripcionArticulo(String descripcionArticulo) {
        this.descripcionArticulo = descripcionArticulo;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    // Método para mostrar el contenido
    public void mostrarContenido() {
        System.out.println("Código de Artículo: " + codigoArticulo);
        System.out.println("Descripción de Artículo: " + descripcionArticulo);
        System.out.println("Precio de Compra: " + precioCompra);
        System.out.println("Precio de Venta: " + precioVenta);
        System.out.println("Cantidad de Artículos en Stock: " + cantidadEnStock);
    }
}
