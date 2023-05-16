
package Utilidades;

import Entidad.Pelicula;
import java.util.Comparator;

public class Comparadores {
    
   public static Comparator<Pelicula> mostrarMayorTiempo = new Comparator<Pelicula>() {
       @Override
       public int compare(Pelicula t1, Pelicula t2) {
       return t2.getDuracion().compareTo(t1.getDuracion());
       
       }
   };


}

