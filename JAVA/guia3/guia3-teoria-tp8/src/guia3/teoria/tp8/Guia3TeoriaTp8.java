/*
 Escriba un programa que valide si un numero esta? entre 0 y 10, sino esta? entre 0
 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package guia3.teoria.tp8;

import java.util.Scanner;

/**
 * @author Daniel Buiak Branchesi
 */
public class Guia3TeoriaTp8 {

    public static void main(String[] args) {
        String tecla_repetir;

        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero entero entre 0 y 10");
            int respuesta = leer.nextInt();
            if (respuesta >= 0 && respuesta <= 10) {
                System.out.println("Correcto, el numero esta comprendido en el rango");
            } else {
                System.out.println("El numero está fuera de rango");
            }

            System.out.println();
            do {
                System.out.print("Deseas repetir el proceso? (S/N): ");
                tecla_repetir = leer.nextLine();
            } while (!tecla_repetir.equalsIgnoreCase("s") && !tecla_repetir.equalsIgnoreCase("n"));

        } while (tecla_repetir.equalsIgnoreCase("s"));

    }
}
