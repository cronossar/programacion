package guia4.ejercicios.tp4;

import java.util.Scanner;

/**
 *Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.

 * @author Daniel Buiak Branchesi
 */
public class Guia4EjerciciosTp4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
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


/*En este ejemplo, la función esPrimo recibe un número como parámetro y verifica
si es primo o no. Si el número es menor o igual a 1, no es primo. De lo contrario,
se itera desde 2 hasta la raíz cuadrada del número. Si se encuentra un divisor, 
el número no es primo y se devuelve false. Si no se encuentra ningún divisor, 
el número es primo y se devuelve true.

En el método main, se solicita al usuario que ingrese un número y se llama a 
la función esPrimo para verificar si es primo o no. El resultado se muestra 
en la consola mediante un mensaje.*/