package Servicio;
<<<<<<< HEAD
import java.util.Arrays;
=======

import java.util.Arrays;
import java.util.Collections;
>>>>>>> c2149cb1fa6564c78dd90533d0b7d49268879112
import java.util.Random;
//Este código inicializa el arreglo A con números aleatorios,
//muestra el arreglo A por pantalla, ordena el arreglo A de mayor a menor,
//inicializa el arreglo B copiando los primeros 10 números del arreglo A 
//y llenando las últimas 10 posiciones con el valor 0.5, y muestra los 
//arreglos A y B por pantalla.
<<<<<<< HEAD
public class ArregloService {
    
=======

public class ArregloService {

>>>>>>> c2149cb1fa6564c78dd90533d0b7d49268879112
    public void inicializarA(double[] arreglo) {
        Random rand = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rand.nextDouble() * 100; // generamos un número aleatorio entre 0 y 100
        }
    }
<<<<<<< HEAD
=======

>>>>>>> c2149cb1fa6564c78dd90533d0b7d49268879112
    //Arrays.toString imprime los datos del arreglo
    public void mostrar(double[] arreglo) {
        System.out.println(Arrays.toString(arreglo));
    }
<<<<<<< HEAD
    //Arrays.sort ordena los datos del arreglo
    public void ordenar(double[] arreglo) {
=======

    //Arrays.sort ordena los datos del arreglo
    public void ordenar(double[] arreglo) {
        
//        Arrays.sort(arreglo, Collections.reverseOrder());
//
//        for (double i : arreglo) {
//            System.out.println("El valor es: " + i + ".");
//        }

>>>>>>> c2149cb1fa6564c78dd90533d0b7d49268879112
        Arrays.sort(arreglo);
        for (int i = 0; i < arreglo.length / 2; i++) {
            double temp = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - 1 - i];
            arreglo[arreglo.length - 1 - i] = temp;
        }
    }

    public void inicializarB(double[] arregloA, double[] arregloB) {
        for (int i = 0; i < 10; i++) {
            arregloB[i] = arregloA[i];
        }
        for (int i = 10; i < arregloB.length; i++) {
            arregloB[i] = 0.5;
        }
    }
<<<<<<< HEAD
    
}
=======

}
>>>>>>> c2149cb1fa6564c78dd90533d0b7d49268879112
