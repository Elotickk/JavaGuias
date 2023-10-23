// Ejercicio Nro. 75: Realice un programa en JAVA utilizando el Compilador NetBeans donde:
// Defina un vector que permita almacenar datos de varias PERSONAS, para ello debería crear un vector a partir de la clase definida por Ud. en el Ejercicio 71 y
// para esa estructura realizar lo siguiente:
// - Cargar los elementos del VECTOR de PERSONAS
// - Recorrer el VECTOR de PERSONAS obteniendo la cantidad de PERSONAS por cada sexo; cuantos varones y cuantas mujeres.
// - Cuantas personas hay cargadas de APELLIDO == “ESPECHE”
// - Cuantas personas tienen NOMBRE == “JORGE”

public class nr75 {
    public static void main(String[] args) {
        //De esta manera,unicamente estoy desclarando dos objetos de la nr71Claass
        // nr71Class objeto1;
        // nr71Class objeto2;
        //Crear e Instanciar objettos de la clase correspondiente
        
        nr71Class[] personas = new nr71Class[5]; // Tamaño del vector de personas

        personas[0] = new nr71Class(11111111, "Espinoza", "Jorge", "123456789", "jorge@example.com",true);
        personas[1] = new nr71Class(22222222, "Espeche", "María", "987654321", "maria@example.com", false);
        personas[2] = new nr71Class(33333333, "Espeche", "Laura", "456789123", "laura@example.com", false);
        personas[3] = new nr71Class(44444444, "Pérez", "Jorge", "789123456", "jorge2@example.com", true);
        personas[4] = new nr71Class(55555555, "González", "Ana", "321654987", "ana@example.com", false);

        // Contadores
        int cantidadVarones = 0;
        int cantidadMujeres = 0;
        int cantidadApellidoEspeche = 0;
        int cantidadNombreJorge = 0;

        // Recorrer el vector de personas
        for (nr71Class persona : personas) {
            if (persona.getSexo().equals(true)) {
                cantidadVarones++;
            } else {
                cantidadMujeres++;
            }

            if (persona.getApellido().equals("Espeche")) {
                cantidadApellidoEspeche++;
            }

            if (persona.getNombre().equals("Jorge")) {
                cantidadNombreJorge++;
            }
        }
        // Resultados
        System.out.println("Cantidad de varones: " + cantidadVarones);
        System.out.println("Cantidad de mujeres: " + cantidadMujeres);
        System.out.println("Cantidad de personas con apellido 'Espeche': " + cantidadApellidoEspeche);
        System.out.println("Cantidad de personas con nombre 'Jorge': " + cantidadNombreJorge);
    }
}
