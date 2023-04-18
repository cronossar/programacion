package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicios {

    Scanner leer = new Scanner(System.in);

    public void llenarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
    }

    public void servirTaza(Cafetera cafetera, int tamanoTaza) {
        int cantidadServida = 0;
        if (cafetera.getCantidadActual() >= tamanoTaza) {
            cantidadServida = tamanoTaza;
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamanoTaza);
            System.out.println("Se ha llenado la taza de " + tamanoTaza + " cc.");
        } else {
            cantidadServida = cafetera.getCantidadActual();
            cafetera.setCantidadActual(0);
            System.out.println("No se ha podido llenar la taza completamente. Se han servido " + cantidadServida + " cc.");
        }
    }

    public void vaciarCafetera(Cafetera cafetera) {
        System.out.println("Se vacia la cafetera, para recargar");
        cafetera.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera cafetera, int cantidad) {
        int cantidadMaxima = cafetera.getCapacidadMaxima() - cafetera.getCantidadActual();
        if (cantidadMaxima >= cantidad) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidad);
            System.out.println("Se han agregado " + cantidad + " cc de café a la cafetera.");
        } else {
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
            System.out.println("No se han podido agregar todos los cc de café indicados. La cafetera se ha llenado.");
        }
    }
}
