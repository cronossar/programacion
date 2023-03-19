package guia2.tp1;
import java.util.Scanner;
public class Guia2Tp1 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in); // Creamos el Scanner
        System.out.println("Te vamos a pedir dos numeros enteros por teclado para sumarlos");
        System.out.println("----------------------------------");
        System.out.println("Ingresa el primer numero entero");
        int num1 = leer.nextInt(); // Leer un entero
        System.out.println("Ingresa el segundo numero entero");
        int num2 = leer.nextInt(); // Leer un entero
        System.out.println("------- calculando ---------");
        System.out.println("La suma de los dos numeros enteros ingresados es: " + (num1 + num2));
    }
    
}
