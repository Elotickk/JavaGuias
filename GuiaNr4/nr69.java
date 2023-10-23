// Ejercicio Nro. 69: Realice un programa en JAVA que permita crear un vector de 5 posiciones del tipo doublé y luego realice lo siguiente:
// - Inicialice todas las posiciones del vector utilizando un ciclo FOR
// - realice un programa que permita cargar datos en las posiciones del VECTOR
// - obtenga y determine cuál es el elemento del vector de mayor valor (el valor más grande)
// - obtenga y determine cuál es el elemento del vector de menor valor (el valor más pequeño de todos).
// - obtenga la sumatoria total de todos los elementos del vector.
// - obtenga la cantidad de elementos del vector.
// - Obtenga el promedio de todos los elementos del vector.

import java.util.Scanner;

public class nr69 {
    public static void main(String[] args) {
        double[] vector = new double[5];
        try (Scanner scanner = new Scanner(System.in)) {
            // Inicializar todas las posiciones del vector utilizando un ciclo FOR
            for (int i = 0; i < 5; i++) {
                vector[i] = 0.0; // Puedes inicializarlo con cualquier valor según tu requisito
            }

            // Cargar datos en las posiciones del VECTOR
            for (int i = 0; i < 5; i++) {
                System.out.print("Ingrese el valor para la posición " + i + ": ");
                vector[i] = scanner.nextDouble();
            }
        }

        // Encontrar el valor máximo y mínimo
        double max = vector[0];
        double min = vector[0];
        double sum = 0;

        for (int i = 1; i < 5; i++) {
            if (vector[i] > max) {
                max = vector[i];
            }
            if (vector[i] < min) {
                min = vector[i];
            }
            sum += vector[i];
        }

        // Calcular la sumatoria, cantidad de elementos y el promedio
        double average = sum / 5;
        int count = vector.length;

        // Imprimir resultados
        System.out.println("El elemento de mayor valor es: " + max);
        System.out.println("El elemento de menor valor es: " + min);
        System.out.println("La sumatoria total de los elementos del vector es: " + sum);
        System.out.println("La cantidad de elementos del vector es: " + count);
        System.out.println("El promedio de los elementos del vector es: " + average);
    }
}

