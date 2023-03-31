package guia5.ejercicios.tp4;

import java.util.Random;

/**
 *
 * @author cronossar1
 */
public class Guia5EjerciciosTp4 {
    public static void main(String[] args) {
        int[][] matriz = generarMatrizAleatoria(4, 4);

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        int[][] traspuesta = calcularMatrizTraspuesta(matriz);

        System.out.println("Matriz traspuesta:");
        imprimirMatriz(traspuesta);
    }

    // Función para generar una matriz aleatoria de tamaño especificado
    private static int[][] generarMatrizAleatoria(int filas, int columnas) {
        Random rand = new Random();
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rand.nextInt(10); // Generar un número aleatorio entre 0 y 9
            }
        }
        return matriz;
    }

    // Función para calcular la matriz traspuesta de una matriz dada
    private static int[][] calcularMatrizTraspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] traspuesta = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }
        return traspuesta;
    }

    // Función para imprimir una matriz
    private static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}