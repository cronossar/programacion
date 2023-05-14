
package Utilidades;

import Entidad.Paises;
import java.util.Comparator;

public class Comparadores {
    
    public static Comparator <Paises> ordenarAlfaXPais = new Comparator<Paises>() {
        @Override
        public int compare(Paises o1, Paises o2) {
            return o1.getNomb_pais(). compareTo(o2.getNomb_pais());
        }
    };
        
}
