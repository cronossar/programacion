/*
 Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.
 */
package guia3.extras.tp4;
/**
 * @author Educacion
 */
import java.util.Scanner;
public class Guia3ExtrasTp4 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int i = 0;
        
        
while (i !=11){
        
   System.out.println("Ingrese un numero entre 1 y 10 para conocer su equivalente en Romanos");
    System.out.println("Ingrese 11, para salir del programa");
        i=leer.nextInt(); 
                
switch(i) {
  case 1:
    System.out.println("-----------------");
    System.out.println(" El numero: "+i+" Equivale a: "+" I"+" en Números Romanos ");
    System.out.println("-----------------");
    break;
  case 2:
    System.out.println("-----------------");
    System.out.println(" El numero: "+i+" Equivale a: "+" II"+" en Números Romanos ");
    System.out.println("-----------------");
    break;
  case 3:
    System.out.println("-----------------");
    System.out.println(" El numero: "+i+" Equivale a: "+" III"+" en Números Romanos ");
    System.out.println("-----------------");
    break;
  case 4:
    System.out.println("-----------------");
    System.out.println(" El numero: "+i+" Equivale a: "+" IV"+" en Números Romanos ");
    System.out.println("-----------------");
    break;
  case 5:
    System.out.println("-----------------");
    System.out.println(" El numero: "+i+" Equivale a: "+" V"+" en Números Romanos ");
    System.out.println("-----------------");
    break;
  case 6:
    System.out.println("-----------------");
    System.out.println(" El numero: "+i+" Equivale a: "+" VI"+" en Números Romanos ");
    System.out.println("-----------------");
    break;
  case 7:
    System.out.println("-----------------");
    System.out.println(" El numero: "+i+" Equivale a: "+" VII"+" en Números Romanos ");
    System.out.println("-----------------");
    break;
  case 8:
    System.out.println("-----------------");
    System.out.println(" El numero: "+i+" Equivale a: "+" VIII"+" en Números Romanos ");
    System.out.println("-----------------");
    break;
  case 9:
    System.out.println("-----------------");
    System.out.println(" El numero: "+i+" Equivale a: "+" IX"+" en Números Romanos ");
    System.out.println("-----------------");
    break;
  case 10:
    System.out.println("-----------------");
    System.out.println(" El numero: "+i+" Equivale a: "+" X"+" en Números Romanos ");
    System.out.println("-----------------");
    break;
  case 11:
      System.out.print("Desea salir del programa? S/N: ");
                    String salir = leer.next();
                    if (salir.toUpperCase().equals("S")){
                        break;
                    } else if (salir.toUpperCase().equals("N")){
                        i=0;
                        break;
                    } else {
                        i=0;
                        break;
                    }
                default:
                    break;
                    }
        }

    }
}
    

