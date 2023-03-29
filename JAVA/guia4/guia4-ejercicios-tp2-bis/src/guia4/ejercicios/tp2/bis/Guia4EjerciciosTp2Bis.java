package guia4.ejercicios.tp2.bis;

import java.util.Scanner;

/**
 *
 * @author Daniel Buiak Branchesi
 */
public class Guia4EjerciciosTp2Bis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String respuesta = "S";
        
        while (respuesta.equalsIgnoreCase("S")) {
            String nombre = pedirNombre(input);
            int edad = pedirEdad(input);
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            if (esMayorDeEdad(edad)) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("Es menor de edad");
            }
            System.out.println("¿Quieres ingresar más personas? (S/N)");
            respuesta = input.next();
        }
    }

    public static String pedirNombre(Scanner input) {
        System.out.println("Ingresa un nombre:");
        return input.next();
    }

    public static int pedirEdad(Scanner input) {
        System.out.println("Ingresa una edad:");
        return input.nextInt();
    }

    public static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }
}
