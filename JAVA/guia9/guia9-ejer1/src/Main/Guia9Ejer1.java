package Main;

import Entidad.Cadena;
import Servicios.CadenaServicio;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
import java.util.Scanner;
>>>>>>> f8d28fc13f3794a015e449fb66f8939f7f694470
=======
>>>>>>> bcb6d48f0f5e80f9adfac228e594ba0dd4d56243
=======
>>>>>>> c2149cb1fa6564c78dd90533d0b7d49268879112

public class Guia9Ejer1 {

    public static void main(String[] args) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                
=======
        Scanner scanner = new Scanner(System.in);
        
>>>>>>> f8d28fc13f3794a015e449fb66f8939f7f694470
=======

>>>>>>> bcb6d48f0f5e80f9adfac228e594ba0dd4d56243
        CadenaServicio f1 = new CadenaServicio();

        Cadena c1 = new Cadena();
<<<<<<< HEAD
        
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
=======
=======

        CadenaServicio f1 = new CadenaServicio();

        Cadena c1 = new Cadena();
>>>>>>> c2149cb1fa6564c78dd90533d0b7d49268879112

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
<<<<<<< HEAD
>>>>>>> bcb6d48f0f5e80f9adfac228e594ba0dd4d56243
=======
>>>>>>> c2149cb1fa6564c78dd90533d0b7d49268879112
    }
}
