package guia3.extras.tp11;
import java.util.Scanner;
/**
 *Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados
 * @author Daniel Buiak Branchesi
 */
public class Guia3ExtrasTp11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in,"ISO8859-1");
        int num;
        int cont = 0;
        
        System.out.print("Ingrese un número entero: ");
        num = leer.nextInt();
        
        while (num != 0) {
            num /= 10;
            cont++;
        }
        
        System.out.println("Cantidad de dígitos: " + cont);
    }
}
/*Se utiliza un bucle while para dividir el número por 10 repetidamente
hasta que el resultado de la división sea 0, contando la cantidad de veces que se realiza
la división. Cada vez que se divide el número por 10, se "elimina" el 
último dígito del número, por lo que al repetir esta operación hasta que el resultado sea 0,
se cuenta la cantidad de dígitos en el número original.

Las variables de tipo entero al truncan los números o resultados,
por lo que al dividir un número entero por otro entero, el resultado será un número entero que 
representa la parte entera del resultado de la división.*/