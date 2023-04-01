package guia5.extras.tp7;

import java.util.Scanner;
/**
 *
 * @author Daniel Buiak Branchesi
 */
public class Guia5ExtrasTp7 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el número de términos para generar Fibonacci: ");
        int n = leer.nextInt();
        
        
        int[] fibo = new int[n];
        fibo[0] = 0;
        fibo[1] = 1;
        
        for (int i = 2; i < n; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        
        System.out.print("La sucesión de Fibonacci de " + n + " términos es: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}

