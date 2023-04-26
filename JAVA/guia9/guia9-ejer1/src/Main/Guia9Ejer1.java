<<<<<<< HEAD

=======
>>>>>>> 560c2eba08e318a6bbb265928a6b4b1b32a758d4
package Main;

import Entidad.Cadena;
import Servicios.CadenaServicio;
<<<<<<< HEAD
import java.util.Scanner;
=======
>>>>>>> 560c2eba08e318a6bbb265928a6b4b1b32a758d4

public class Guia9Ejer1 {

    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner scanner = new Scanner(System.in);
        
        CadenaServicio f1 = new CadenaServicio();
        
        Cadena c1 = new Cadena();
        
//        f1.mostrarVocales(c1);
//        System.out.println("------------------------");
//        f1.invertirFrase(c1);
//        System.out.println("------------------------");
//        f1.vecesRepetido(c1);
//        System.out.println("------------------------");
//        System.out.println("Ingrese frase para comparar");
//        f1.compararLongitud(c1, scanner.nextLine());
//        System.out.println("------------------------");
//        f1.unirFrases(c1);
          System.out.println("------------------------");
        
          f1.reemplazar(c1, scanner.next());
    }
 }
=======

        CadenaServicio f1 = new CadenaServicio();

        Cadena c1 = new Cadena();

        f1.crearFrase(c1);
        f1.mostrarVocales(c1);
        System.out.println("------------------------");
        f1.invertirFrase(c1);
        System.out.println("------------------------");
        f1.vecesRepetido(c1);
        System.out.println("------------------------");
        f1.compararLongitud(c1);
        System.out.println("------------------------");
        f1.unirFrases(c1);
        System.out.println("------------------------");
        f1.reemplazar(c1);
        System.out.println("------------------------");
        System.out.println("La frase contiene la letra que ingresaste " + f1.contiene(c1));
    }
}
>>>>>>> 560c2eba08e318a6bbb265928a6b4b1b32a758d4
