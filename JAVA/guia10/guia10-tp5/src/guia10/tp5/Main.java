
package guia10.tp5;

import Entidad.Paises;
import Servicio.PaisesServicio;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisesServicio ps= new PaisesServicio();
        HashSet<Paises> conj_paises= new HashSet<>();
        ArrayList<Paises> pais_lista;
        
        //Creamos los paises ESTAN EN UN CONJUNTO
        ps.crearPais(conj_paises);
        //mostramos los paises
        ps.mostrarPaises(conj_paises);
        //transformamos nuestro conjunto a lista:
        
        //pais_lista= ps.transformarConjunto(conj_paises);

        //ps.ordenarListaAlfabeticamente(pais_lista);
        
        pais_lista=ps.ordenarAlfaXPais(conj_paises);
       
    }
   
}
