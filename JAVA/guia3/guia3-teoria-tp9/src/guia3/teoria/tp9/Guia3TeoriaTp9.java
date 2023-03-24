/*
 Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
 */
package guia3.teoria.tp9;
import java.util.Scanner;
/**
 * @author Daniel Buiak Branchesi
 */
public class Guia3TeoriaTp9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int contador = 0;
        int suma = 0;

        do {
            System.out.println("Ingrese un numero entero");
            num = leer.nextInt();
            contador = contador + 1;
            if (num < 0) {
                continue;

            }
            suma = suma + num;
            if (num == 0) {
                break;
            }

        } while (contador < 20);

        if (num != 0) {

            System.out.println("la suma es: " + suma);
        } else {
            System.out.println("Se capturó el numero cero");
            System.out.println("la suma es: " + suma);
        }

    }

}
