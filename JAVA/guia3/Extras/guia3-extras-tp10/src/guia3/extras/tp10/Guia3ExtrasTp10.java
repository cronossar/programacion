package guia3.extras.tp10;
import java.util.Scanner;
/**
 *Realice un programa para que el usuario adivine el resultado de una
multiplicaci�n entre dos n�meros generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la funci�n Math.random() de Java
* 
 * @author Daniel Buiak BRanchesi
 */
public class Guia3ExtrasTp10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in,"ISO8859-1");
        int num1 = (int) (Math.random() * 11); // Genera un n�mero aleatorio entre 0 y 10
        int num2 = (int) (Math.random() * 11); // Genera otro n�mero aleatorio entre 0 y 10
        int respuesta;
        
        System.out.println("Adivina el resultado de la multiplicaci�n entre " + num1 + " y " + num2);
        
        do {
            System.out.print("Ingrese su respuesta: ");
            respuesta = leer.nextInt();
            
            if (respuesta == num1 * num2) {
                System.out.println("�Correcto!");
            } else {
                System.out.println("Respuesta incorrecta. Int�ntalo de nuevo.");
            }
        } while (respuesta != num1 * num2);
    }
}
/*Se utiliza la funci�n Math.random() para generar dos n�meros
aleatorios entre 0 y 10. La funci�n Math.random() devuelve un n�mero aleatorio 
entre 0 y 1, por lo que se multiplica por 11 y se convierte a un entero para obtener
un n�mero aleatorio entre 0 y 10.

Luego se le pide al usuario que adivine el resultado de la multiplicaci�n entre
los dos n�meros generados aleatoriamente. Se utiliza un bucle do-while para permitir
al usuario ingresar su respuesta varias veces hasta que adivine la respuesta correcta.
En cada vuelta del bucle, se verifica si la respuesta del usuario es correcta o no 
y se muestra un mensaje correspondiente. Si la respuesta es incorrecta, se permite al
usuario ingresar su respuesta nuevamente.*/