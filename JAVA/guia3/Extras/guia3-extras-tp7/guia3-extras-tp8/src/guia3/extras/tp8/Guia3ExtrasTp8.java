
package guia3.extras.tp8;
import java.util.Scanner;
/**
 Escriba un programa que lea n�meros enteros. Si el n�mero es m�ltiplo
de cinco debe detener la lectura y mostrar la cantidad de n�meros
le�dos, la cantidad de n�meros pares y la cantidad de n�meros impares.
Al igual que en el ejercicio anterior los n�meros negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.
 * @author Daniel Buiak Branchesi
 */
public class Guia3ExtrasTp8 {
    public static void main(String[] args) {
        int num=0;
        int cont=0;
        int par=0;
        int impar=0;
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Vamos a leer los numeros enteros que ingreses");
        num=leer.nextInt();
        cont = cont+1;
        
        while(num<0){
            
            if(num %5 == 0){
            System.out.println("El valor ingresado es multiplo de 5 ");
            break;
            }else if(num%2==0){
             par = par+1;   
            }else{
             impar = impar+1;
            }
            
                       
        }
        System.out.println("Hasta el momento ingres�: "+cont+" numeros");
        System.out.println("De los numeros ingresados hay "+par+" numeros pares y "+impar+" numeros impares");
        
        
    }
    
}
