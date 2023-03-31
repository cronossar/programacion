package guia5.ejercicios.tp2;
import java.util.Scanner;
import java.util.Random;
/**
 *Realizar un algoritmo que llene un vector de tama�o N con valores
aleatorios y le pida al usuario un n�mero a buscar en el vector. El
programa mostrar� d�nde se encuentra el numero y si se encuentra
repetido
 * @author Daniel Buiak Branchesi
 */
public class Guia5EjerciciosTp2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, num, repite;
        
        repite = 0;
        
        System.out.println("Ingresar tama�o del vector:");
        n = leer.nextInt();
        int [] vector = new int [n];
        
        System.out.println("Ingresar n�mero a buscar en el vector:");
        num = leer.nextInt();
        System.out.println("- - - - - - - - - - - - - - "); 
        
        for (int i = 0; i < n; i++) {
            int aleatorio = (int) (Math.random() * 10);
            vector[i] = aleatorio;
            
            System.out.println (vector[i]);
            
            if (num == vector[i]) {
                repite++;
            }
        }
        
        System.out.println("- - - - - - - - - - - - - - ");  
        
        for (int i = 0; i < n; i++) {
            if (num == vector[i]) {
                System.out.println("N�mero encontrado en el sub�ndice " +i);
            }
        }
        
        if (repite >= 2) {
            System.out.println("El n�mero se encuentra repetido.");
        }else if (repite == 0) {
            System.out.println("El n�mero no se encontr�.");
        }
        
        System.out.println("Se encontr� " +repite+ " vez/veces.");
       
    }
}