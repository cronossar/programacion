package guia5.ejercicio.tp5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Daniel Buiak Branchesi
 */
public class Guia5EjercicioTp5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        
        // Paso 2: Crear y llenar la matriz con valores aleatorios
        int[][] matriz = new int[4][4];
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rand.nextInt(10); // Rango de 0 a 9
            }
        }
        
        // Paso 3: Imprimir la matriz
        System.out.println("Matriz generada:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Paso 4: Verificar si la matriz es antisimétrica
        boolean antisimetrica = true;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    antisimetrica = false;
                    break;
                }
            }
            if (!antisimetrica) {
                break;
            }
        }
        
        // Paso 5: Mostrar el resultado
        if (antisimetrica) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
    }
    
}