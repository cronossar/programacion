
package calcularnif_bis;

import Entidad.Entidad;
import Servicio.ServicioNif;

public class Main {

    public static void main(String[] args) {
        ServicioNif nif1 = new ServicioNif();
        Entidad N1 = nif1.crearNIF();
        
        
        nif1.mostrar(N1);
    }
    
}
