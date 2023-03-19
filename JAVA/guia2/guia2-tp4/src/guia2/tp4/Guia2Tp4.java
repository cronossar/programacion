package guia2.tp4;
import java.util.Scanner;
/**
     * autor Daniel Buiak Branchesi
     */
public class Guia2Tp4 {
    public static void main(String[] args) {
        System.out.println("VAMOS A CONVERTIR GRADOS CELSIUS A FAHRENHEIT");
        System.out.println("-----------------------");
        System.out.println("INGRESA UN VALOR EN GRADOS CELSIUS");
        Scanner leer = new Scanner(System.in); // Creamos el Scanner
        Double num = leer.nextDouble();
        Double far;
        far = 32+(9*num/5);
        System.out.println("------Calculando------");
        System.out.println(num + " Grados Celsius equivalen a: " + far + " Grados Fahremheit ");
        System.out.println("------Calculando------");
    }
    
}
