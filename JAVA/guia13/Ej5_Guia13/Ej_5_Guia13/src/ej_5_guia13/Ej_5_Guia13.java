/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_5_guia13;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author pauvi
 */
public class Ej_5_Guia13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        int num = 0;
        int numAleatorio = (int) (Math.random()*5+1);
        int intentos = 0;
        do {
            try {
                System.out.println("Ingrese numero ");
                num = leer.nextInt();
                               
                if (num < numAleatorio && num >= 0) {
                    System.out.println("El numero a adivinar es mayor");
                }else if (num > numAleatorio && num <= 5) {
                    System.out.println("El numero a adivinar es menor");
                }
            
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número válido.");
                leer.nextLine(); //Con esta line limpiamos el buffer luego de haber usado leer.nextLine linea 16
            }
            
            intentos++;
        } while (num != numAleatorio);
        
        System.out.println("Has adivinado el numero secreto es "+numAleatorio);
        System.out.println("Lo lograste en "+ intentos +" intentos");
    }
}
    
    
