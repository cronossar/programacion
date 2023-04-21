
package raiz;

import Entidad.Raices;
import RaicesServicios.SRaices;

public class Raiz {

    public static void main(String[] args) {
       Raices raices = new Raices(2, -5, 3);
        SRaices servicio = new SRaices(raices);
        servicio.calcular();
    }
}
   
