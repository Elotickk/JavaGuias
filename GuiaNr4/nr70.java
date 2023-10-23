// Ejercicio Nro. 70: Realice un programa en JAVA que permita crear un vector de 5 posiciones del tipo String y luego realice lo siguiente:
// - Inicialice todas las posiciones del vector utilizando un ciclo FOR
// - realice un programa que permita cargar datos en las posiciones del VECTOR; en este caso como son posiciones del tipo string, cada posición del vector será una palabra ó frase; por ejemplo:
// En la posición 0: “HOLA COMO TE VA”
// En la posición 1: “BIEN, MUY BIEN”
// En la posición 2: “COMO TE LLAMAS ¿?”
// En la posición 3: “ME LLAMO RODOLFO Y VOS ¿?”
// En la posición 4: “ME LLAMO ANALÍA, MUCHO GUSTO ¡!!”

import java.util.Scanner;


public class nr70 {
    public static void main(String[] args) {
        String[] vector = new String[5];
        try (Scanner scanner = new Scanner(System.in)) {
            // Inicializar todas las posiciones del vector utilizando un ciclo FOR
            for (int i = 0; i < 5; i++) {
                vector[i] = "";
            }

            // Cargar datos en las posiciones del VECTOR
            for (int i = 0; i < 5; i++) {
                System.out.print("Ingrese una palabra o frase para la posición " + i + ": ");
                vector[i] = scanner.nextLine();
            }
        }

        // Mostrar el contenido del vector
        System.out.println("Contenido del vector:");
        for (int i = 0; i < 5; i++) {
            System.out.println("En la posición " + i + ": " + vector[i]);
        }

        // Recorrer el vector y contar la cantidad de letras "a" en todo el vector
        int totalA = 0;
        for (int i = 0; i < 5; i++) {
            totalA += contarLetraA(vector[i]);
        }

        System.out.println("La cantidad total de letras 'a' en todo el vector es: " + totalA);
    }

    // Función para contar la cantidad de letras "a" en una cadena
    public static int contarLetraA(String cadena) {
        int count = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'A') {
                count++;
            }
        }
        return count;
    }
}