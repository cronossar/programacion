package gui2.tp5;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
     * autor Daniel Buiak Branchesi
     */
public class Gui2Tp5 {
    public static void main(String[] args) {
        // Escribir un programa que lea un n�mero entero por teclado y muestre
       //por pantalla el doble, el triple y la ra�z cuadrada de ese n�mero
       
        System.out.println("Ingresa un numero Entero");
        System.out.println("Voy a mostrarte su doble, el triple y la ra�z cuadrada de ese n�mero");
        System.out.println("-----------------");
        Scanner leer;
        leer = new Scanner(System.in);
        int num = leer.nextInt();
        System.out.println("-----------------");
        System.out.println("El doble de: "+ num + " es "+ (num * 2) );
        System.out.println("-----------------");
        System.out.println("El triple de: "+ num + " es "+ (num * 3) );
        System.out.println("-----------------");
        System.out.println("La Raiz Cuadrada de: "+ num + " es "+ sqrt(num) );
       
    }
    
}
