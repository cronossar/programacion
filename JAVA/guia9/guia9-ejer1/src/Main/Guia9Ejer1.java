
package Main;

import Entidad.Cadena;
import Servicios.CadenaServicio;
<<<<<<< HEAD
=======
import java.util.Scanner;
>>>>>>> f8d28fc13f3794a015e449fb66f8939f7f694470

public class Guia9Ejer1 {

    public static void main(String[] args) {
<<<<<<< HEAD
                
=======
        Scanner scanner = new Scanner(System.in);
        
>>>>>>> f8d28fc13f3794a015e449fb66f8939f7f694470
        CadenaServicio f1 = new CadenaServicio();
        
        Cadena c1 = new Cadena();
        
<<<<<<< HEAD
          f1.crearFrase(c1);
=======
>>>>>>> f8d28fc13f3794a015e449fb66f8939f7f694470
//        f1.mostrarVocales(c1);
//        System.out.println("------------------------");
//        f1.invertirFrase(c1);
//        System.out.println("------------------------");
//        f1.vecesRepetido(c1);
//        System.out.println("------------------------");
<<<<<<< HEAD
          //f1.compararLongitud(c1);
//        System.out.println("------------------------");
//        f1.unirFrases(c1);
          System.out.println("------------------------");
          f1.reemplazar(c1);
=======
//        System.out.println("Ingrese frase para comparar");
//        f1.compararLongitud(c1, scanner.nextLine());
//        System.out.println("------------------------");
//        f1.unirFrases(c1);
          System.out.println("------------------------");
        
          f1.reemplazar(c1, scanner.next());
>>>>>>> f8d28fc13f3794a015e449fb66f8939f7f694470
    }
 }
