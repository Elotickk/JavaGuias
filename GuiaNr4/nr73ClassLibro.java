// Ejercicio Nro. 73: Realice un programa en JAVA utilizando el Compilador NetBeans donde:
// Defina una clase de Usuario que permita almacenar los datos de un LIBRO donde se registren los siguientes datos.
// LIBRO:
// - LIBRO CÓDIGO
// - FECHA DE EDICIÓN (ANIO, MES Y DIA) POR SEPARADO
// - TITULO DEL LIBRO
// - AUTOR
//  Implemente su constructor.
//  Los métodos get y set de cada Atributo.
//  Cree Objetos de esta clase.
//  Implemente el método para Mostrar los Valores que tienen los atributos de esta clase.
//  Implemente los métodos get y set de todos los atributos.

public class nr73ClassLibro {
    private int libroCodigo;
    private int anioEdicion;
    private int mesEdicion;
    private int diaEdicion;
    private String tituloLibro;
    private String autor;

    // Constructor
    public nr73ClassLibro(int libroCodigo, int anioEdicion, int mesEdicion, int diaEdicion, String tituloLibro, String autor) {
        this.libroCodigo = libroCodigo;
        this.anioEdicion = anioEdicion;
        this.mesEdicion = mesEdicion;
        this.diaEdicion = diaEdicion;
        this.tituloLibro = tituloLibro;
        this.autor = autor;
    }

    // Métodos get y set
    public int getLibroCodigo() {
        return libroCodigo;
    }

    public void setLibroCodigo(int libroCodigo) {
        this.libroCodigo = libroCodigo;
    }

    public int getAnioEdicion() {
        return anioEdicion;
    }

    public void setAnioEdicion(int anioEdicion) {
        this.anioEdicion = anioEdicion;
    }

    public int getMesEdicion() {
        return mesEdicion;
    }

    public void setMesEdicion(int mesEdicion) {
        this.mesEdicion = mesEdicion;
    }

    public int getDiaEdicion() {
        return diaEdicion;
    }

    public void setDiaEdicion(int diaEdicion) {
        this.diaEdicion = diaEdicion;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Método para mostrar el contenido
    public void mostrarContenido() {
        System.out.println("Código del Libro: " + libroCodigo);
        System.out.println("Fecha de Edición: " + diaEdicion + "/" + mesEdicion + "/" + anioEdicion);
        System.out.println("Título del Libro: " + tituloLibro);
        System.out.println("Autor del Libro: " + autor);
    }
}
