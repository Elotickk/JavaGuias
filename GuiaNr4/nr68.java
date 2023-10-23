import java.util.Scanner;

// Ejercicio Nro. 68: Realice un programa en JAVA que permita crear un vector de 10 posiciones enteras y luego realice lo siguiente:
// - Inicialice todas las posiciones del vector utilizando un ciclo FOR
// - realice un programa que permita cargar datos en las posiciones del VECTOR
// - Recorra el vector mostrando su contenido

// public class nr68 {
//     public static void main(String[] args)
//     {
//     int b = 20;

//     int []VecEntero = new int[10];

//     VecEntero[5] = 7;
//     VecEntero[9] = -1;


//     }
//     import java.util.Scanner;

public class nr68 {
    public static void main(String[] args) {
        int[] vector = new int[10];
        try (Scanner scanner = new Scanner(System.in)) {
            // Inicializar todas las posiciones del vector utilizando un ciclo FOR
            for (int i = 0; i < 10; i++) {
                vector[i] = 0; // Puedes inicializarlo con cualquier valor según tu requisito
            }

            // Cargar datos en las posiciones del VECTOR
            for (int i = 0; i < 10; i++) {
                System.out.print("Ingrese el valor para la posición " + i + ": ");
                vector[i] = scanner.nextInt();
            }
        }

        // Recorrer el vector y mostrar su contenido
        System.out.println("Contenido del vector:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Posición " + i + ": " + vector[i]);
        }
    }
}

