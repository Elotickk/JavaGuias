public class nr72ClassClub {
    private String nombreClub;
    private int cantidadTitulosInternacionales;
    private int cantidadTitulosNacionales;
    private String sitioWebOficial;

    // Constructor
    public nr72ClassClub(String nombreClub, int cantidadTitulosInternacionales, int cantidadTitulosNacionales, String sitioWebOficial) {
        this.nombreClub = nombreClub;
        this.cantidadTitulosInternacionales = cantidadTitulosInternacionales;
        this.cantidadTitulosNacionales = cantidadTitulosNacionales;
        this.sitioWebOficial = sitioWebOficial;
    }

    // Métodos get y set
    public String getNombreClub() {
        return nombreClub;
    }

    public void setNombreClub(String nombreClub) {
        this.nombreClub = nombreClub;
    }

    public int getCantidadTitulosInternacionales() {
        return cantidadTitulosInternacionales;
    }

    public void setCantidadTitulosInternacionales(int cantidadTitulosInternacionales) {
        this.cantidadTitulosInternacionales = cantidadTitulosInternacionales;
    }

    public int getCantidadTitulosNacionales() {
        return cantidadTitulosNacionales;
    }

    public void setCantidadTitulosNacionales(int cantidadTitulosNacionales) {
        this.cantidadTitulosNacionales = cantidadTitulosNacionales;
    }

    public String getSitioWebOficial() {
        return sitioWebOficial;
    }

    public void setSitioWebOficial(String sitioWebOficial) {
        this.sitioWebOficial = sitioWebOficial;
    }

    // Método para mostrar el contenido
    public void mostrarContenido() {
        System.out.println("Nombre del Club: " + nombreClub);
        System.out.println("Cantidad de Títulos Internacionales: " + cantidadTitulosInternacionales);
        System.out.println("Cantidad de Títulos Nacionales: " + cantidadTitulosNacionales);
        System.out.println("Sitio Web Oficial: " + sitioWebOficial);
    }
}
