/*
Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
*/
package guia3.tp6;
/**
  * @author Daniel Buiak Branchesi
 */
import java.util.Scanner;
public class Guia3Tp6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Este programa es una Calculadora");
        System.out.println("------------------");
        System.out.println("Ingrese el 1º valor Entero: ");
        int valor1 = leer.nextInt();
        System.out.println("Ingrese el 2º valor Entero: ");
        int valor2 = leer.nextInt();
        int menu=0;
        while (menu!=5){
            System.out.println("MENU");
            System.out.println("1.Sumar | 2.Restar | 3.Multiplicar | 4.Dividir | 5.Salir");
            System.out.println("Elija opción: ");
            menu = leer.nextInt();
            switch(menu){
                case 1:
                    //sumar
                    System.out.print("SUMA: ");
                    System.out.println(valor1+valor2);
                    break;
                case 2:
                    //restar
                    System.out.print("RESTA: ");
                    System.out.println(valor1-valor2);
                    break;
                case 3:
                    //multiplicar
                    System.out.print("MULTIPLICACION: ");
                    System.out.println(valor1*valor2);
                    break;
                case 4:
                    //division
                    System.out.print("DIVISION: ");
                    System.out.println((double)valor1/valor2);
                    break;
                case 5:
                    System.out.print("Desea salir del programa? S/N: ");
                    String salir = leer.next();
                    if (salir.toUpperCase().equals("S")){
                        break;
                    } else {
                        menu=0;
                        break;
                    }
                default:
                    break;
            }
        }
    }
    
}
