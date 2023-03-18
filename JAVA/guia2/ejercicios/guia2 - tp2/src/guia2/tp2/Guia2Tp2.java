package guia2.tp2;
import java.util.Scanner;
public class Guia2Tp2 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in); // Creamos el Scanner
        System.out.println("Hola....");
        System.out.println("¿Cúal es tu Nombre?");
        String nombre = leer.nextLine(); 
        System.out.println("Espero que tengas muy lindo día "+ nombre);
    }
    
}
