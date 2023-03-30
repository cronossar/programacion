package guia5.ejercicios.tp4;

import java.util.Random;

/**
 *
 * @author Daniel Buiak Branchesi
 */
public class Guia5EjerciciosTp4 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        // Llenar la matriz con valores aleatorios entre 0 y 9
        Random rand = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rand.nextInt(10);
            }
        }

        // Mostrar la matriz original
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        // Calcular la traspuesta de la matriz
        int[][] traspuesta = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }

        // Mostrar la matriz traspuesta
        System.out.println("Matriz traspuesta:");
        mostrarMatriz(traspuesta);
    }

    // Método auxiliar para mostrar una matriz en consola
    private static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}