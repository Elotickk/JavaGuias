public class nr71Class {
    int Dni;
    String Apellido;
    String Nombre;
    String Telefono;
    String Email;
    Boolean Sexo;

    //Constructor
    public nr71Class(int dni,String apellido,String nombre,String Tel,String email,Boolean sexo)
    {
        Dni = dni;
        Apellido = apellido;
        Nombre = nombre;
        Telefono = Tel;
        Email = email;
        Sexo = sexo;
    }
    
    // Métodos get y set
    public int getDNI() {
        return Dni;
    }

    public void setDNI(int Dni) {
        this.Dni = Dni;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        this.Telefono = telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public Boolean getSexo() {
        return Sexo;
    }

    public void setSexo(Boolean sexo) {
        this.Sexo = sexo;
    }



    public void MostrarDatos()
    {
        System.out.println("DNI: " + Dni);
        System.out.println("Apellido: " + Apellido);
        System.out.println("Nombre: " + Nombre);
        System.out.println("Telefono: " + Telefono);
        System.out.println("Email: " + Email);
        System.out.println("Sexo: " + Sexo);
    }
}