package guia5.ejercicios.tp5;

import java.util.Scanner;

/**
 *
 * @author cronossar1
 */
public class Guia5EjerciciosTp5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = scanner.nextInt();
        
        int[][] matriz = new int[filas][columnas];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        
        if (esAntisimetrica(matriz)) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
    }
    
    public static boolean esAntisimetrica(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        if (filas != columnas) {
            return false;
        }
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    return false;
                }
            }
        }
        
        return true;
    }
}