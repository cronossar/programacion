package guia4.ejercicios.tp2;

import java.util.Scanner;

/**
 *
 * @author Daniel Buiak Branchesi
 */
public class Guia4EjerciciosTp2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        boolean continuar = true;
        
        while (continuar == true) {
            System.out.print("Ingrese el nombre de la persona: ");
            String nombre = input.nextLine();
            
            System.out.print("Ingrese la edad de la persona: ");
            int edad = input.nextInt();
            input.nextLine();
            
            if (esMayorDeEdad(edad)) {
                System.out.println(nombre + " es mayor de edad.");
            } else {
                System.out.println(nombre + " es menor de edad.");
            }
            
            System.out.print("¿Quiere seguir mostrando personas? (S/N): ");
            String respuesta = input.nextLine();
            
            if (respuesta.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }
        
        System.out.println("Programa terminado.");
    }
    
    public static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }
}






/*La función esMayorDeEdad es el subprograma que determina si una persona es mayor o menor 
de edad. La función toma un parámetro edad y devuelve true si la edad es mayor o igual a 18,
lo que significa que la persona es mayor de edad.

En el programa principal, se utiliza un bucle while para solicitar el nombre y la edad de 
cada persona. Después de cada persona, se llama a la función esMayorDeEdad para determinar si
la persona es mayor o menor de edad, y se imprime el resultado.

Después de cada persona, el programa pregunta al usuario si quiere seguir mostrando personas.
Si el usuario ingresa "No", el bucle se detiene y el programa termina.

Es importante tener en cuenta que el programa utiliza la función nextLine después de la lectura
de la edad para consumir el carácter de nueva línea que queda en el búfer de entrada. De lo contrario,
el siguiente input.nextLine() consumirá inmediatamente ese carácter y saltará a la siguiente iteración
del bucle sin dar al usuario la oportunidad de ingresar la respuesta*/
