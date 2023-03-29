package guia4.teoria.tp2;
import java.util.Scanner;
/**
 *
 * @author Daniel Buiak Branchesi
 */
public class Guia4TeoriaTp2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in, "ISO8859-1");
        System.out.print("Ingrese el primer n�mero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo n�mero: ");
        int num2 = scanner.nextInt();
        
        esMultiplo(num1, num2);
    }
    
    public static void esMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println(num1 + " es m�ltiplo de " + num2);
        } else {
            System.out.println(num1 + " no es m�ltiplo de " + num2);
        }
    }
}

/*En este programa, el procedimiento esMultiplo recibe dos n�meros enteros num1 y num2
y valida si num1 es m�ltiplo de num2. Si es as�, se imprime un mensaje indicando que el
primer n�mero es m�ltiplo del segundo. Si no es as�, se imprime un mensaje indicando que
no lo son.

El programa principal utiliza el objeto Scanner para leer los dos n�meros ingresados por
el usuario, y luego llama al procedimiento esMultiplo con los dos n�meros como argumentos.*/
