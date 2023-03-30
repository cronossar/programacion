package guia5.extras.tp1;
import java.util.Scanner;
/**
 *Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
 * @author Daniel Buiak Branchesi
 */
public class Guia5ExtrasTp1 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int suma = 0;
        System.out.print("Ingrese el tamaño del vector :");
        int N = leer.nextInt();
        int[] vector=new int[N];
        
        for (int i = 0; i < N; i++) {
        System.out.print("Ingrese un valor para subindice: " + i + " - ");
        vector[i] = leer.nextInt();
        suma += vector[i];
           
        }
        System.out.println("-------------------------");
        System.out.println(" La suma de los valores ingresados es : " + suma);
        
    }
    
}
