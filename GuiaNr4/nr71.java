public class nr71{
    public static void main(String[] args) {
        //De esta manera,unicamente estoy desclarando dos objetos de la nr71Claass
        // nr71Class objeto1;
        // nr71Class objeto2;
        //Crear e Instanciar objettos de la clase correspondiente
        
        nr71Class objeto3 = new nr71Class(43192101,"Romero","Gonzalo","3834946767","gonzalo@gmail.com",true);
        nr71Class objeto4 = new nr71Class(38343454,"Romero","Juan","3834946767","gonzalo@gmail.com",true);

        objeto3.MostrarDatos();
        objeto4.MostrarDatos();

        System.out.println("El nombre del objeto 3 es " + objeto3.getNombre());
        System.out.println("El nombre del objeto 4 es " + objeto4.getNombre());
    }
}