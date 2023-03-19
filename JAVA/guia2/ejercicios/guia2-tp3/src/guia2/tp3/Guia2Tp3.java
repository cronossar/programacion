package guia2.tp3;
import java.util.Scanner;
public class Guia2Tp3 {
    public static void main(String[] args) {
        //función toUpperCase() y toLowerCase() en Java
        Scanner leer = new Scanner(System.in); // Creamos el Scanner
        System.out.println("INGRESA UNA FRASE"); //lee el ingreso de teclado
        String frase = leer.nextLine(); 
        System.out.println("La frase ingresada, pasa toda a MAYUSCULAS ");
        System.out.println("USAMOS LA FUNCIÓN: Uppercase ");
        frase = frase.toUpperCase();
        System.out.println(frase);
        System.out.println("La frase ingresada, pasa toda a MINUSCULAS ");
        System.out.println("USAMOS LA FUNCION: LowerCase ");
        frase = frase.toLowerCase();
        System.out.println(frase);
        
    }
}
