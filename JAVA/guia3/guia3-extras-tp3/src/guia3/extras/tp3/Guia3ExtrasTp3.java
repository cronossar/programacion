/*
 Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String
 */
package guia3.extras.tp3;
/**
 * @author Daniel Buiak Branchesi
 */
import java.util.Scanner;
public class Guia3ExtrasTp3 {
    public static void main(String[] args) {
     
        Scanner leer=new Scanner(System.in);
        System.out.println("Por favor, ingrese una letra");
        String letra="";
          
        letra=leer.next();
        letra=letra.toUpperCase();
        if(letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U") ){
        System.out.println("Usted ingreso: "+letra+ " Es una vocal ");
        }else{ 
        System.out.println("Usted ingreso: "+letra+ " No es una vocal ");
        }
       
        
    }
        
}
