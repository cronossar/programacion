package guia3.tp2;
/*
Ejercicio # 02 
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
 */
import java.util.Scanner;
/**
     * autor Daniel Buiak Branchesi
     */
public class Guia3Tp2 {
    public static void main(String[] args) {
        String palabra;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa una palabra");
        palabra = leer.next();
        if(palabra.toLowerCase().equals("eureka")){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        
    }
    
}
