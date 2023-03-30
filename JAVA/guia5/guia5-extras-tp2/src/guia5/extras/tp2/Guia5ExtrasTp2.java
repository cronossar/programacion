package guia5.extras.tp2;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Daniel Buiak Branchesi
 */
public class Guia5ExtrasTp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // usuario ingresa el tamaño de los vectores
        System.out.print("Ingrese el tamaño de los vectores: ");
        int n = scanner.nextInt();

        // Definimos los dos vectores de tamaño N
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];

        // Pedimos al usuario que ingrese los valores para cada vector
        System.out.println("Ingrese los valores del primer vector:");
        for (int i = 0; i < n; i++) {
            vector1[i] = scanner.nextInt();
        }

        System.out.println("Ingrese los valores del segundo vector:");
        for (int i = 0; i < n; i++) {
            vector2[i] = scanner.nextInt();
        }

        // Comparamos los vectores
        if (Arrays.equals(vector1, vector2)) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores son distintos");
        }
    }
}
