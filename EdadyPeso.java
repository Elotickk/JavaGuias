// Realizar un programa en JAVA que permita cargar la 
// edad y el peso de los estudiantes de todo el Instituto 
// San Martín. (es decir por cada alumno deben pedir edad y peso).
// Para todos los alumnos ingresados determinar lo siguiente.

// - Cantidad de Alumnos entre 18 y 25 años
// - Edad Promedio de Alumnos entre 18 y 25 años
// - Peso Promedio de Alumnos entre 18 y 25 años

// - Cantidad de Alumnos mayores a 26 años
// - Edad Promedio de Alumnos mayores a 26 años
// - Peso Promedio de Alumnos mayores a 26 años

// - Mostrar también la cantidad total de alumnos
// es decir TODOS.

import java.util.Scanner;

public class EdadyPeso {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {
            
            double cantidadAlumnos = 0;
            double menores = 0;
            double edadAlumnos = 0;
            double peso = 0;
            double cantidadEdadAlumnosMayor18a25 = 0;
            double CantidadedadAlumnosMayor26 = 0;
            double edadTotal18a25 = 0;
            double edadTotalMayor26 = 0;
            double pesoTotal18a25 = 0;
            double pesoTotalMayor26 = 0;
            
            System.out.println("Ingrese la cantidad de alumnos que hay");
            cantidadAlumnos = Teclado.nextDouble();

            for (int i = 1; i <= cantidadAlumnos ; i++){ 
                System.out.println("Ingrese su edad");
                edadAlumnos = Teclado.nextDouble();

                if ((edadAlumnos >= 18)&&(edadAlumnos <= 25)){
                    cantidadEdadAlumnosMayor18a25 = cantidadEdadAlumnosMayor18a25 + 1;
                    edadTotal18a25 = edadTotal18a25 + edadAlumnos;

                    System.out.println("Ingrese su peso");
                    peso = Teclado.nextDouble();

                    pesoTotal18a25 = pesoTotal18a25 + peso;
                }
                else if (edadAlumnos >= 26){
                    CantidadedadAlumnosMayor26 = CantidadedadAlumnosMayor26 + 1;
                    edadTotalMayor26 = edadTotalMayor26 + edadAlumnos;

                    System.out.println("Ingrese su peso");
                    peso = Teclado.nextDouble();

                    pesoTotalMayor26 = pesoTotalMayor26 + peso;
                }
                else{
                    menores = menores + 1;
                }
            }
            System.out.println("La cantidad de alumnos menores es " + menores);

            double promedioMayor18a25 = 0;
            double promedioMayor26 = 0;
            double promedioPeso18a25 = 0;
            double promedioPeso26 = 0;

            if (cantidadEdadAlumnosMayor18a25 != 0){
                promedioMayor18a25 = edadTotal18a25 / cantidadEdadAlumnosMayor18a25;
                promedioPeso18a25 = pesoTotal18a25 / cantidadEdadAlumnosMayor18a25;

                System.out.println("La cantidad de alumnos entre 18 y 25 es " + cantidadEdadAlumnosMayor18a25);
                System.out.println("La suma total de las edades entre 18 y 25 es "+ edadTotal18a25);
                System.out.println("El promedio de la EDAD de los alumnos entre 18 y 25 es "+ promedioMayor18a25);
                System.out.println("El promedio del peso entre 18 y 25 es "+ promedioPeso18a25);
            }
            if (CantidadedadAlumnosMayor26 != 0){
                promedioMayor26 = edadTotalMayor26 / CantidadedadAlumnosMayor26;
                promedioPeso26 = pesoTotalMayor26 / CantidadedadAlumnosMayor26;

                System.out.println("La cantidad de alumnos MAYORES a 26 es " + CantidadedadAlumnosMayor26);
                System.out.println("La suma total de la EDAD de los alumnos MAYORES a 26 es "+ edadTotalMayor26);
                System.out.println("El promedio de la EDAD de los alumnos MAYORES 26 es "+ promedioMayor26);
                System.out.println("El promedio del peso mayores de 26 es "+ promedioPeso26);
            }
        }
    }
}