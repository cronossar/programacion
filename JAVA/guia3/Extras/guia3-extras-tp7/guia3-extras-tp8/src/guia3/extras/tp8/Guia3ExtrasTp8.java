
package guia3.extras.tp8;
import java.util.Scanner;
/**
 Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
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
        System.out.println("Hasta el momento ingresó: "+cont+" numeros");
        System.out.println("De los numeros ingresados hay "+par+" numeros pares y "+impar+" numeros impares");
        
        
    }
    
}
