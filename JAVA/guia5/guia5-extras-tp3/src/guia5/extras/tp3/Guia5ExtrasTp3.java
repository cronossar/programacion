package guia5.extras.tp3;

/**
 *Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
 * @author Daniel Buiak Branchesi
 */
public class Guia5ExtrasTp3 {
    public static void main(String[] args) {
        
        int[] arr = new int[10];
        cargar(arr);
        mostrar(arr);
    }
    
    public static void cargar(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100); //generar números aleatorios del 0 al 99
        }
    }
    
    public static void mostrar(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
*/La forma de sacar un número aleatorio es mediante el método .random()
de la clase Math. El método .random() nos ofrece un número entre 0.0 y 1.0.
Es por ello que tendremos que multiplicar al resultado el número hasta el 
cual queramos sacar números aleatorios.*/