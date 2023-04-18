package nespresso;

import Entidades.Cafetera;
import Servicios.CafeteraServicios;
import java.util.Scanner;

public class Nespresso {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Cafetera cafetera = new Cafetera();
        CafeteraServicios servicio = new CafeteraServicios();

        System.out.println("Cantidad actual: " + cafetera.getCantidadActual());
        System.out.println("Capacidad máxima: " + cafetera.getCapacidadMaxima());
        System.out.println("***********************");
        servicio.llenarCafetera(cafetera);
        System.out.println("Cantidad actual de cafe: " + cafetera.getCantidadActual());
        System.out.println("Ingrese el tamaño en c.c. de su taza");
        servicio.servirTaza(cafetera, leer.nextInt());
        System.out.println("Cantidad actual de cafe: " + cafetera.getCantidadActual());
        System.out.println("***********************");
        System.out.println("Servir otra taza de cafe (tamaño fijo de 1000 c.c.)");
        servicio.servirTaza(cafetera, 1000);
        System.out.println("Cantidad actual: " + cafetera.getCantidadActual());
        System.out.println("***********************");
        servicio.vaciarCafetera(cafetera);
        System.out.println("Cantidad actual de cafe: " + cafetera.getCantidadActual());
        System.out.println("Recargar con cafe la cafetera");
        System.out.println("Ingrese la cantidad de c.c. a agregar");
        System.out.println("***********************");
        servicio.agregarCafe(cafetera, leer.nextInt());
        System.out.println("Cantidad actual de cafe: " + cafetera.getCantidadActual());
        System.out.println("***********************");
    }
}
