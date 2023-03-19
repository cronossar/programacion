/*
 Realizar un programa que solo permita introducir frases o palabras
de 8 caracteres de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Lenght() en Java.
 */
package guia3.tp3;
import java.util.Scanner;
public class Guia3Tp3 {
    /**
     * autor Daniel Buiak Branchesi
     */
    public static void main(String[] args) {
        String palabra;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        palabra = leer.next();
        palabra.toLowerCase();
        int p8 = palabra.length();
        
        if (p8 == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
       
    }
    
}
