package gui3.extras.tp7_bis;
import java.util.Scanner;
/**
 * Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle ?while? y otra
con el bucle ?do - while?
 * 
 * @author Daniel Buiak Branchesi
 */
public class Gui3ExtrasTp7_bis {
    public static void main(String[] args) {
        int n = 0;
        int num = 0;
        int mayor = 0;
        int menor = 0;
        int suma = 0;
        int conta = 0;
        int promedio=0;
        
        
        Scanner leer = new Scanner(System.in, "ISO8859-1");
        System.out.println("""
                           Calcula y Visualiza el valor maximo, el valor
                           minimo y el promedio de n numeros""");
        System.out.println("----------------------------");
        System.out.print("Ingrese la cantidad de numeros con que trabajará: ");
        n = leer.nextInt();
        
        while(n<2){
                System.out.println("Ingrese un numero mayor a 1");
                n=leer.nextInt();
            }
               
        do {

            System.out.println("----------------");
            System.out.println("Ingrese el valor a evaluar: ");
            System.out.print("----------------: ");
            num = leer.nextInt();
            conta++;
            System.out.println("" + num + "  " + conta + " orden");
            if(conta == 1){;
            mayor = num;
            menor = num;

            }else if (num > mayor) {
                mayor = num;
            
            }else if(num < menor) {
                menor = num;
            }
            suma = suma + num;
            promedio = suma / conta;
        }while (conta != n);
        
        System.out.println("----------------------------");   
        System.out.println("mayor "+mayor+" / menor "+menor+" / promedio "+promedio);
        System.out.println("----------------------------");
            /*del main*/
        }

    }
