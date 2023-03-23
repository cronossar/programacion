/*
 Escriba un programa que lea 20 n�meros. Si el n�mero le�do es igual a cero se
debe salir del bucle y mostrar el mensaje "Se captur� el numero cero". El
programa deber� calcular y mostrar el resultado de la suma de los n�meros
le�dos, pero si el n�mero es negativo no debe sumarse. Nota: recordar el uso
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
            System.out.println("Se captur� el numero cero");
            System.out.println("la suma es: " + suma);
        }

    }

}
