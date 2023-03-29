package guia4.teoria.tp2;
import java.util.Scanner;
/**
 *
 * @author Daniel Buiak Branchesi
 */
public class Guia4TeoriaTp2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in, "ISO8859-1");
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        
        esMultiplo(num1, num2);
    }
    
    public static void esMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println(num1 + " es múltiplo de " + num2);
        } else {
            System.out.println(num1 + " no es múltiplo de " + num2);
        }
    }
}

/*En este programa, el procedimiento esMultiplo recibe dos números enteros num1 y num2
y valida si num1 es múltiplo de num2. Si es así, se imprime un mensaje indicando que el
primer número es múltiplo del segundo. Si no es así, se imprime un mensaje indicando que
no lo son.

El programa principal utiliza el objeto Scanner para leer los dos números ingresados por
el usuario, y luego llama al procedimiento esMultiplo con los dos números como argumentos.*/
