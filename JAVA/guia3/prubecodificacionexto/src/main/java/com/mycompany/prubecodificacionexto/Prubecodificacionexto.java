/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prubecodificacionexto;

import java.util.Scanner;

/**
 *
 * @author cronossar1
 */
public class Prubecodificacionexto {

    public static void main(String[] args) {
        Scanner leer; // Creamos el Scanner
        leer = new Scanner(System.in, "ISO8859-1");
        System.out.println("Hola....");
        System.out.println("¿Cúal es tu Nombre?");
        String nombre = leer.nextLine(); 
        System.out.println("Espero que tengas muy lindo día "+ nombre);
    }
}
