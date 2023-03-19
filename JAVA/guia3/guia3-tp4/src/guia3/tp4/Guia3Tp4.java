/*
 Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java
 */
package guia3.tp4;

/**
     * autor Daniel Buiak Branchesi
     */
import java.util.Scanner;
public class Guia3Tp4 {
    public static void main(String[] args) {
        String palabra;
        String p2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        palabra = leer.next();
        p2 = palabra.substring(0,1);
        
        if (p2.toUpperCase().equals("A")){
        System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        
    }
    
}
