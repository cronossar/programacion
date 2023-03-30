package guia5.ejercicio.tp2.bis;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Daniel Buiak Branchesi
 */
public class Guia5EjercicioTp2Bis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Paso 1: Definir N como el tamaño del vector
        int N = 10;
        
        // Paso 2: Crear un vector V de tamaño N
        int[] V = new int[N];
        
        // Paso 3: Llenar el vector con valores aleatorios
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            V[i] = rand.nextInt(100); // Rango de 0 a 99
        }
        
        // Paso 4: Pedir al usuario un número a buscar
        System.out.print("Ingrese un número a buscar: ");
        int x = input.nextInt();
        
        // Paso 5: Definir la variable encontrado como false
        boolean encontrado = false;
        
        // Paso 6: Buscar el número en el vector
        for (int i = 0; i < N; i++) {
            if (V[i] == x) {
                encontrado = true;
                System.out.println("El número " + x + " se encuentra en la posición " + i);
            }
        }
        
        // Paso 7: Verificar si el número está repetido
        if (encontrado) {
            int frecuencia = 0;
            for (int i = 0; i < N; i++) {
                if (V[i] == x) {
                    frecuencia++;
                }
            }
            if (frecuencia > 1) {
                System.out.println("El número " + x + " se encuentra repetido " + frecuencia + " veces en el vector.");
            } else {
                System.out.println("El número " + x + " se encuentra una sola vez en el vector.");
            }
        } else {
            System.out.println("El número " + x + " no se encuentra en el vector.");
        }
    }

}
