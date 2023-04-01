package guia5.extras.tp5;

import java.util.Random;

/**
 *
 * @author Daniel Buiak Branchesi
 */
public class Guia5ExtrasTp5 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][4];

        // Rellenar la matriz con valores aleatorios
        rellenarMatriz(matriz);

        // Mostrar la matriz en la consola
        mostrarMatriz(matriz);

        // Calcular la suma de los elementos de la matriz
        int suma = calcularSumaMatriz(matriz);

        // Mostrar la suma en la consola
        System.out.println("La suma de los elementos de la matriz es: " + suma);
    }

    // Función para rellenar una matriz con valores aleatorios
    private static void rellenarMatriz(int[][] matriz) {
        Random rand = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rand.nextInt(10);
            }
        }
    }

    // Procedimiento para mostrar una matriz en la consola
    private static void mostrarMatriz(int[][] matriz) {
        System.out.println("La matriz es:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Función para calcular la suma de los elementos de una matriz
    private static int calcularSumaMatriz(int[][] matriz) {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }

        return suma;
    }
}
