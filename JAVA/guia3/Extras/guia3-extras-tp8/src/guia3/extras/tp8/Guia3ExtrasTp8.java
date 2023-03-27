
package guia3.extras.tp8;
import java.util.Scanner;
/**
 Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.
 * @author Daniel Buiak Branchesi
 */
public class Guia3ExtrasTp8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO8859-1");
        int cont = 0;
        int Pares = 0;
        int Impares = 0;

        while (true) {
            System.out.print("Ingrese un número entero: ");
            int num = leer.nextInt();
            cont++;

            if (num % 5 == 0) {
                System.out.println("El número es múltiplo de 5. Paramos de leer.");
                break;
            }

            if (num % 2 == 0) {
                Pares++;
            } else {
                Impares++;
            }
        }

        System.out.println("Cantidad de números leídos: " + cont);
        System.out.println("Cantidad de números pares: " + Pares);
        System.out.println("Cantidad de números impares: " + Impares);
        
    }
}
/*Se leen los números enteros hasta que se lee un múltiplo de cinco 
En cada iteración del bucle, se incrementa el contador de números 
leídos y se verifica si el número es par o impar para actualizar los 
contadores correspondientes. Después de salir del bucle, se muestra 
la cantidad de números leídos, la cantidad de números pares y la cantidad
de números impares.*/