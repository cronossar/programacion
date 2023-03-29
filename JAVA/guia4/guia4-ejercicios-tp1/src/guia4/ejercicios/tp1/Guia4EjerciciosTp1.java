package guia4.ejercicios.tp1;

import java.util.Scanner;

/**
 *Crea una aplicaci�n que le pida dos n�meros al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicaci�n debe tener
una funci�n para cada operaci�n matem�tica y deben devolver sus
resultados para imprimirlos en el main.
 * 
 * @author Daniel Buiak Branchesi
 */
public class Guia4EjerciciosTp1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese dos n�meros:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        int opcion=0;
        
while (opcion!=5){
        System.out.println("Elija una operaci�n:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicaci�n");
        System.out.println("4. Divisi�n");
        System.out.println("5. Divisi�n");

        opcion = input.nextInt();

        switch (opcion) {
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + suma(num1, num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + resta(num1, num2));
                break;
            case 3:
                System.out.println(num1 + " * " + num2 + " = " + multiplicacion(num1, num2));
                break;
            case 4:
                System.out.println(num1 + " / " + num2 + " = " + division(num1, num2));
                break;
            case 5:
                    System.out.print("Desea salir del programa? S/N: ");
                    String salir = input.next();
                    if (salir.toUpperCase().equals("S")){
                        break;
                    } else {
                        opcion=0;
                        break;
                    }
                default:
                    break;
        }
    }

    
    }
    
    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }
}

/*En este c�digo, primero se importa la clase Scanner para permitir al usuario
ingresar n�meros. Luego, se solicita al usuario que ingrese dos n�meros y se le
presenta un men� de opciones para elegir la operaci�n que desea realizar. El programa
utiliza un switch para determinar qu� funci�n llamar y mostrar el resultado de la
operaci�n elegida.

Las cuatro funciones de operaci�n matem�tica son definidas en la clase Calculadora
como m�todos est�ticos que toman dos par�metros de tipo double y devuelven un resultado
de tipo double. La funci�n main llama a estos m�todos seg�n la opci�n elegida por el
usuario y muestra el resultado en la consola.*/