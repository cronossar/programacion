/*
 Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.
 */
package guia3.teoria.tp6;

import java.util.Scanner;

/**
 *
 * @author Daniel Buiak Branchesi
 */
public class Guia3TeoriaTp6 {

    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        num1= leer.nextInt();
        System.out.println("ingrese otro numero");
        num2= leer.nextInt();
        
        if (num1 > 25 && num2 > 25){
        System.out.println("ambos numeros ingresados son mayores a 25");
        }else if (num1 > 25){
        System.out.println("solo el primer numero ingresado es mayor a 25");
        }else if (num2 > 25){
        System.out.println("solo el segundo numero ingresado es mayor a 25");    
        }else{
        System.out.println("ninguno de los numeros es mayor a 25");    
        }
    }
    
}
   
    

