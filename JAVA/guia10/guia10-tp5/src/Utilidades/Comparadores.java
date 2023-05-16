
package Utilidades;

import Entidad.Paises;
import java.util.Comparator;
import java.util.ArrayList;

public class Comparadores {
    
    public static Comparator<Paises> ordenarMayorTiempo = new Comparator<Paises>() {
        @Override
        public int compare(Paises o1, Paises o2) {
            
            return o2.getDuracion().compareTo(o1.getDuracion());
            
        }
    };
}