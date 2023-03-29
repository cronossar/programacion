package guia4.ejercicios.tp4;

import java.util.Scanner;

/**
 *Crea una aplicaci�n que nos pida un n�mero por teclado y con una
funci�n se lo pasamos por par�metro para que nos indique si es o no un
n�mero primo, debe devolver true si es primo, sino false.

 * @author Daniel Buiak Branchesi
 */
public class Guia4EjerciciosTp4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un n�mero: ");
        int num = scanner.nextInt();

        boolean esPrimo = esPrimo(num);

        if (esPrimo) {
            System.out.println(num + " es primo");
        } else {
            System.out.println(num + " no es primo");
        }
    }
    //Funcion 
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}


/*En este ejemplo, la funci�n esPrimo recibe un n�mero como par�metro y verifica
si es primo o no. Si el n�mero es menor o igual a 1, no es primo. De lo contrario,
se itera desde 2 hasta la ra�z cuadrada del n�mero. Si se encuentra un divisor, 
el n�mero no es primo y se devuelve false. Si no se encuentra ning�n divisor, 
el n�mero es primo y se devuelve true.

En el m�todo main, se solicita al usuario que ingrese un n�mero y se llama a 
la funci�n esPrimo para verificar si es primo o no. El resultado se muestra 
en la consola mediante un mensaje.*/