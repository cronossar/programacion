package guia3.extras.tp7;
import java.util.Scanner;
/**
 * Realice un programa que calcule y visualice el valor m�ximo, el valor
m�nimo y el promedio de n n�meros (n>0). El valor de n se solicitar� al
principio del programa y los n�meros ser�n introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle ?while? y otra
con el bucle ?do - while?
 * 
 * @author Daniel Buiak Branchesi
 */
public class Guia3ExtrasTp7 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in, "ISO8859-1");
        System.out.println("Calcula y Visualiza el valor m�ximo, el valor\n" +
"m�nimo y el promedio de n n�meros (n>0)");
        System.out.println("----------------------------");
        System.out.println("Ingrese la cantidad de valores con que trabajar�");
        int n;
        int num=0;
        int mayor=0;
        int menor=0;
        int promedio=0;
        int conta=0;
        int conta1=0;
        
    while(num!=0){
        System.out.println("Ingrese un valor");
        num=leer.nextInt();
       
        if(num > mayor){
        mayor = num;
        conta = conta++;
    }else{
        menor = num;
        conta1 = conta1++;
            }
    
    
    }
    /*del main*/
   }
  
}
