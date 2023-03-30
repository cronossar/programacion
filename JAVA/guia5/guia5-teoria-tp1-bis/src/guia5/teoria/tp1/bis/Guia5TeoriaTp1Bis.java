package guia5.teoria.tp1.bis;
import java.util.Scanner;
/**
 *
 * @author Daniel Buiak Branchesi
 */
public class Guia5TeoriaTp1Bis {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        String[] [] equipo = new String [3] [3];

        System.out.println("Ingresa el nombre de tus compas de la clase");


// Asigno valores mediante el For
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
    
equipo[i][j] = leer.nextLine();
   }
}

// Muestro la matriz
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
System.out.print("[" + equipo[i][j] + "]");
}
System.out.println("");
}
// del main
    }
    // para funciones
    
}

