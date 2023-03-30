package guia5.ejercicios.tp2;
import java.util.Scanner;
import java.util.Random;
/**
 *Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
 * @author Daniel Buiak Branchesi
 */
public class Guia5EjerciciosTp2 {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        Random r = new Random();
        int cont=0;
        
        int[] num = new int [4];
        
               
        // Asigno valores mediante el For
        for (int i = 0; i < 20; i++) {
        num[i] = r.nextInt(20)-1;
        }
        
         //Pido valor a buscar       
        System.out.println("ingrese numero a buscar en el vector entre 1 y 100");
        int v = leer.nextInt();
        
        //Se muestra
        for (int i = 0; i < 20; i++) {
        if(num[i] == v);
        cont = cont + 1;
            System.out.println(v+" Se encontro en: "+ num[i] + " y se repitio "+cont+ " veces");
            
        }
        
        
        
    // Muestro la matriz
        /*for (int i = 99; i >= 0; i--) {

        System.out.println("[" + num[i] + "]");
        }
        System.out.println("");*/

    }
}

