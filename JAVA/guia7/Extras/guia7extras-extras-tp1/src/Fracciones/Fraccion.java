package Fracciones;

import java.util.Scanner;

 /*
    Crear un metodo lamada fracción que contenga 4 atributos (denominador y numerador de cada
    fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
    fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
    */
    public class Fraccion{

    private int den1, den2, num1, num2;

    public Fraccion() {
    }

    public Fraccion(int den1, int den2, int num1, int num2) {
        this.den1 = den1;
        this.den2 = den2;
        this.num1 = num1;
        this.num2 = num2;
    }
    
   public void sumar() {
       int suma = 0, denominador = 0;
       
       if (den1 == den2) {
           suma = num1 + num2;
           denominador = den1;
       } else if (den1 != den2) {
           denominador = den1 * den2;
           suma = num1 + num2;
       }
       System.out.println("- - - - - - - - - - - - - - - - - -");
       System.out.println("La suma es: " +suma+ "/" +denominador);
       System.out.println("- - - - - - - - - - - - - - - - - -");
   }
   
   public void restar() {
       int resta = 0, denominador = 0;
       
       if (den1 == den2) {
           resta = num1 - num2;
           denominador = den1;
       } else if (den1 != den2) {
           denominador = den1 * den2;
           resta = num1 - num2;
       }
       System.out.println("- - - - - - - - - - - - - - - - - -");
       System.out.println("La resta es: " +resta+ "/" +denominador);
       System.out.println("- - - - - - - - - - - - - - - - - -");
   }
   
   public void multiplicar() {
       int multi1, multi2;
       multi1 = num1 * num2;
       multi2 = den1 * den2;
       System.out.println("- - - - - - - - - - - - - - - - - -");
       System.out.println("La multiplicación es: " +multi1+ "/" +multi2);
       System.out.println("- - - - - - - - - - - - - - - - - -");
   }
   
   public void dividir() {
       int multi1, multi2;
       multi1 = num1 * den2;
       multi2 = num2 * den1;
       System.out.println("- - - - - - - - - - - - - - - - - -");
       System.out.println("La división es: " +multi1+ "/" +multi2);
       System.out.println("- - - - - - - - - - - - - - - - - -");
   }
   
   public void cargarFraccion() {
       Scanner leer = new Scanner(System.in);
       System.out.print("Ingresar DEN1: ");
       den1 = leer.nextInt();
       
       System.out.print("Ingresar DEN2: ");
       den2 = leer.nextInt();
       
       System.out.print("Ingresar NUM1: ");
       num1 = leer.nextInt();
       
       System.out.print("Ingresar NUM2: ");
       num2 = leer.nextInt();
   }

}