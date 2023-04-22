
package raiz;

import Entidad.Entidad;
import RaicesServicios.Servicio;

public class Main {

    public static void main(String[] args) {
       Entidad raices = new Entidad(2, -5, 3);
        Servicio servicio = new Servicio(raices);
        servicio.calcular();
    }
}
   
