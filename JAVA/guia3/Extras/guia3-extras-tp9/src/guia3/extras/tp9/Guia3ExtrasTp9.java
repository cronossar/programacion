package guia3.extras.tp9;
import java.util.Scanner;
/**
 *Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.

 * @author Daniel Buiak Branchesi
 */
public class Guia3ExtrasTp9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO8859-1");

        System.out.print("Ingrese el dividendo: ");
        int dividendo = leer.nextInt();

        System.out.print("Ingrese el divisor: ");
        int divisor = leer.nextInt();

        // Validamos que sea mayor a 1 
        if (divisor <= 1 || dividendo <= 1) {
            System.out.println("Los números ingresados deben ser mayores que 1.");
            return;
        }

        int cociente = 0;
        while (dividendo >= divisor) {
            dividendo -= divisor;
            cociente++;
        }

        int residuo = dividendo;

        System.out.println("Cociente: " + cociente);
        System.out.println("Residuo: " + residuo);

        
    }
}
/*Importamos la clase Scanner para leer la entrada del usuario.
Pedimos al usuario que ingrese el dividendo y el divisor utilizando leer.nextInt().
Validamos la entrada para asegurarnos de que ambos números sean mayores que 1.
Iniciamos la variable cociente en 0.
Iniciamos un bucle while que se ejecutará mientras el dividendo sea mayor o igual que el divisor.
En cada iteración, restamos el divisor del dividendo y aumentamos el cociente en 1.
Al salir del bucle, el valor restante del dividendo es el residuo.
Mostramos el cociente y el residuo utilizando la función System.out.println().*/
  
