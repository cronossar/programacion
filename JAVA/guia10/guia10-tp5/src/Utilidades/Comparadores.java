
package Utilidades;

import Entidad.Pelicula;
import java.util.Comparator;
import java.util.ArrayList;

public class Comparadores {
    
    public static Comparator<Pelicula> ordenarMayorTiempo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            
            return o2.getDuracion().compareTo(o1.getDuracion());
            
        }
    };
}