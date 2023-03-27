package guia3.extras.tp11;
import java.util.Scanner;
/**
 *Escribir un programa que lea un n�mero entero y devuelva el n�mero de
d�gitos que componen ese n�mero. Por ejemplo, si introducimos el
n�mero 12345, el programa deber� devolver 5. Calcular la cantidad de
d�gitos matem�ticamente utilizando el operador de divisi�n. Nota:
recordar que las variables de tipo entero truncan los n�meros o
resultados
 * @author Daniel Buiak Branchesi
 */
public class Guia3ExtrasTp11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in,"ISO8859-1");
        int num;
        int cont = 0;
        
        System.out.print("Ingrese un n�mero entero: ");
        num = leer.nextInt();
        
        while (num != 0) {
            num /= 10;
            cont++;
        }
        
        System.out.println("Cantidad de d�gitos: " + cont);
    }
}
/*Se utiliza un bucle while para dividir el n�mero por 10 repetidamente
hasta que el resultado de la divisi�n sea 0, contando la cantidad de veces que se realiza
la divisi�n. Cada vez que se divide el n�mero por 10, se "elimina" el 
�ltimo d�gito del n�mero, por lo que al repetir esta operaci�n hasta que el resultado sea 0,
se cuenta la cantidad de d�gitos en el n�mero original.

Las variables de tipo entero al truncan los n�meros o resultados,
por lo que al dividir un n�mero entero por otro entero, el resultado ser� un n�mero entero que 
representa la parte entera del resultado de la divisi�n.*/