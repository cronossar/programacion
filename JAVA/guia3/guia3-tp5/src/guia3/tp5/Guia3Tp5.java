/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
 */
package guia3.tp5;

/**
  * autor Daniel Buiak Branchesi
 */
import java.util.Scanner;
public class Guia3Tp5 {
    public static void main(String[] args) {
        
        int numlim;
        int tanteo;
        int suma=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero entero de referencia");
        numlim = leer.nextInt();
        System.out.println("Ingrese valores enteros hasta que la suma");
        System.out.println("de los valores alcance el valor de referencia");
        
        do{
            System.out.println("Ingrese un numero: ");
            suma = suma + leer.nextInt();
            System.out.println("Total de valores ingresados " + suma + " | " + "Valor limite "+ numlim);
        } while (numlim >= suma);
        
    }
    
}
