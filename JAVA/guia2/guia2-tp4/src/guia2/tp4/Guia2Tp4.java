package guia2.tp4;

import java.util.Scanner;

/**
 * Dada una cantidad de grados centígrados se debe mostrar su
    equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
    + (9 * C / 5).
     * autor Daniel Buiak Branchesi
     */
public class Guia2Tp4 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese un valor numerico en grados centigrados");
        System.out.println("Vamos a convertir ese valor a grados Fahrenheit");
        Double num;
        num=teclado.nextDouble();
        Double Farh;
        Farh=32 + (9 * num / 5);
        System.out.println("-----------------");
        System.out.println("Los grados centigrados "+num+" convertidos a Fahrenheit son: "+Farh);
        
    }
    
}
