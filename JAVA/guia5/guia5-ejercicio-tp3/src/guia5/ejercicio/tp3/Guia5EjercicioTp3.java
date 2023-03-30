package guia5.ejercicio.tp3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Daniel Buiak Branchesi
 */
public class Guia5EjercicioTp3 {
    public static void main(String[] args) {
        // Leer los valores del vector por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los valores del vector separados por espacios:");
        String[] valores = sc.nextLine().split(" ");

        // Contar cuántos números tienen cada cantidad de dígitos
        int[] contadores = new int[3];
        for (String valor : valores) {
            int digitos = valor.length();
            if (digitos <= 5) {
                contadores[digitos - 1]++;
            }
        }

        // Mostrar el resultado
        for (int i = 0; i < contadores.length; i++) {
            System.out.printf("%d dígitos: %d\n", i + 1, contadores[i]);
        }
    }
}

/*Este programa lee los valores de un vector de enteros por teclado y luego
cuenta cuántos números tienen cada cantidad de dígitos. En este ejemplo se 
utiliza un vector de tamaño variable (se leen los valores como una cadena 
separada por espacios y se convierte a un arreglo de cadenas), pero se puede
adaptar para trabajar con un vector de tamaño fijo. El programa recorre cada
número del vector y cuenta cuántos dígitos tiene. Si el número tiene 1 a 5 dígitos,
se incrementa el contador correspondiente. Finalmente, el programa muestra el 
resultado en consola.*/

            

    
    

