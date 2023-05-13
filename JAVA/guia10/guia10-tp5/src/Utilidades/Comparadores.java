
package Utilidades;

import Entidad.Paises;
import java.util.Comparator;

public class Comparadores {
    
    public static Comparator <Paises> ordenarAlfaXPais Comparator<Paises>(){
        @Override
        public int compare (Paises t1, Paises t2){
        return t2.getNomb_pais().compareTo(t1.getNomb_pais));
    }
    };
}
