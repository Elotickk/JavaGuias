package GuiaNr3;

/* Realizar una función que reciba como parámetro una cadena de texto y a partir de ella devuelva un número que será evaluando la siguiente relación.
Por cada letra “a” otorgará puntos de acuerdo a la siguiente tabla LETRA PUNTOS
A
1
B
2
C
3
D
4
E
5
F
6
G
7
H
8
I
9
J
10
K
11
L
12
M
13
N
14
Ñ
15
O
16
P
17
Q
18
R
19
S
20
T
21
U
22
V
23
W
24
X
25
Y
26
Z
27 */

public class nr56 {
    public static int CalcularPuntuacion(String cadena) {
        int puntuacion = 0;
        
        for (int i = 0; i < cadena.length(); i++) {
            char letra = Character.toUpperCase(cadena.charAt(i));
            
            if (letra >= 'A' && letra <= 'Z') {
                int valorLetra = letra - 'A' + 1;
                puntuacion += valorLetra;
            }
        }
        
        return puntuacion;
    }

    public static void main(String[] args) {
        String cadena = "abcd";
        int puntuacionTotal = CalcularPuntuacion(cadena);

        System.out.println("La puntuación total de la cadena es: " + puntuacionTotal);
    }

}
