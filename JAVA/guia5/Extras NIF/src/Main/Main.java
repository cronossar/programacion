
package Main;

import Entidad.Nif;
import Servicio.NifServicio;

public class Main {

    public static void main(String[] args) {
        NifServicio nifService = new NifServicio();
        Nif nif = nifService.crearNif();
        nifService.mostrar(nif);
    }
}
    
    

