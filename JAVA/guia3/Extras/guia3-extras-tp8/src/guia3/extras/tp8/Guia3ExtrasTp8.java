
package guia3.extras.tp8;
import java.util.Scanner;
/**
 Escriba un programa que lea n�meros enteros. Si el n�mero es m�ltiplo
de cinco debe detener la lectura y mostrar la cantidad de n�meros
le�dos, la cantidad de n�meros pares y la cantidad de n�meros impares.
Al igual que en el ejercicio anterior los n�meros negativos no deben
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
            System.out.print("Ingrese un n�mero entero: ");
            int num = leer.nextInt();
            cont++;

            if (num % 5 == 0) {
                System.out.println("El n�mero es m�ltiplo de 5. Paramos de leer.");
                break;
            }

            if (num % 2 == 0) {
                Pares++;
            } else {
                Impares++;
            }
        }

        System.out.println("Cantidad de n�meros le�dos: " + cont);
        System.out.println("Cantidad de n�meros pares: " + Pares);
        System.out.println("Cantidad de n�meros impares: " + Impares);
        
    }
}
/*Se leen los n�meros enteros hasta que se lee un m�ltiplo de cinco 
En cada iteraci�n del bucle, se incrementa el contador de n�meros 
le�dos y se verifica si el n�mero es par o impar para actualizar los 
contadores correspondientes. Despu�s de salir del bucle, se muestra 
la cantidad de n�meros le�dos, la cantidad de n�meros pares y la cantidad
de n�meros impares.*/