package guia5.teoria.tp1;
import java.util.Scanner;
/**
 *Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus
nombres más adelante.
 * @author Daniel Buiak Branchesi
 */
public class Guia5TeoriaTp1 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        String[] compas=new String[8];
        
        
        for (int i = 0; i < 9; i++) {
            System.out.println("Ingrese un nombre "+i);
        compas[i] = leer.next();
            System.out.println(compas[i]);
        }
        
    }
    
}
