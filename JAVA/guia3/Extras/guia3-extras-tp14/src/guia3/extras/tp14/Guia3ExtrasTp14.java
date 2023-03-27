package guia3.extras.tp14;
import java.util.Scanner;
/**
 *.Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.
 * @author Daniel Buiak Branchesi
 */
public class Guia3ExtrasTp14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.println("Ingrese la cantidad de familias: ");
        System.out.println("---------------------");
        int nFamilias = leer.nextInt();
        
        int totalHijos = 0;
        int totalEdad = 0;
        
        for (int i = 1; i <= nFamilias; i++) {
            System.out.println("---------------------");
            System.out.println("Ingrese la cantidad de hijos de la familia " + i + ": ");
            System.out.println("---------------------");
            int nHijos = leer.nextInt();
            
            for (int j = 1; j <= nHijos; j++) {
                System.out.println("---------------------");
                System.out.println("Ingrese la edad del hijo " + j + ": ");
                System.out.println("---------------------");
                int edadHijo = leer.nextInt();
                totalEdad += edadHijo;
            }
            
            totalHijos += nHijos;
        }
        
        double mediaEdad = (double) totalEdad / totalHijos;
        System.out.println(">>>>>>>>>>>><<<<<<<<<<<<");
        System.out.println("La media de edad de los hijos de todas las familias es: " + mediaEdad);
        System.out.println(">>>>>>>>>>>><<<<<<<<<<<<");
    }
}
/*Se pide al usuario la cantidad de familias y luego se utilizan dos ciclos for anidados para pedir
la cantidad de hijos de cada familia y la edad de cada hijo. En cada vuelta del ciclo interior,
se suma la edad del hijo a una variable totalEdad. Además, se suma la cantidad de hijos de cada 
familia a una variable totalHijos.

Al final del programa, se calcula la media de edad de los hijos de todas las familias dividiendo
la variable totalEdad por la variable totalHijos. Esto se almacena en la variable mediaEdad
y se muestra por pantalla.*/
