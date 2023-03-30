package guia5.ejercicios.tp1;
/**
 *Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
 * @author Daniel Buiak Branchesi
 */
public class Guia5EjerciciosTp1 {
    public static void main(String[] args) {
        int[] num = new int [100];

        
// Asigno valores mediante el For
for (int i = 0; i < 100; i++) {
    
num[i]=i+1;
   }


// Muestro la matriz
for (int i = 99; i >= 0; i--) {

System.out.println("[" + num[i] + "]");
}
System.out.println("");

    }
}


