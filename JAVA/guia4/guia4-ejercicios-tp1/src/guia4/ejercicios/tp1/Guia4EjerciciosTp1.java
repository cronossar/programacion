package guia4.ejercicios.tp1;

import java.util.Scanner;

/**
 *Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 * 
 * @author Daniel Buiak Branchesi
 */
public class Guia4EjerciciosTp1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese dos números:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        int opcion=0;
        
while (opcion!=5){
        System.out.println("Elija una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. División");

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

/*En este código, primero se importa la clase Scanner para permitir al usuario
ingresar números. Luego, se solicita al usuario que ingrese dos números y se le
presenta un menú de opciones para elegir la operación que desea realizar. El programa
utiliza un switch para determinar qué función llamar y mostrar el resultado de la
operación elegida.

Las cuatro funciones de operación matemática son definidas en la clase Calculadora
como métodos estáticos que toman dos parámetros de tipo double y devuelven un resultado
de tipo double. La función main llama a estos métodos según la opción elegida por el
usuario y muestra el resultado en la consola.*/