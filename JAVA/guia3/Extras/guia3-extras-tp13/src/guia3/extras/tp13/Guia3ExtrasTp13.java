package guia3.extras.tp13;
import java.util.Scanner;
/**
 *
 * @author Daniel Buiak Branchesi
 */
public class Guia3ExtrasTp13 {
    public static void main(String[] args) {
        // Pedimos la altura de la escalera
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la altura de la escalera: ");
        int altura = leer.nextInt();
        
        // Imprimimos la escalera de n�meros
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Salto de l�nea para imprimir la siguiente fila
        }
    }
}

/*Se pide al usuario la altura de la escalera y luego se utiliza dos ciclos for anidados
para imprimir los n�meros. El primer ciclo imprimime cada fila de la escalera,
mientras que el ciclo interior imprime los n�meros en cada fila, desde 1 hasta el n�mero de la
fila correspondiente.*/