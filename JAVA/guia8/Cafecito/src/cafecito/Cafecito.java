package cafecito;

import Cafetera.CafeClass;

/**
 *
 * @author SEF
 */
public class Cafecito {
    public static void main(String[] args) {
        CafeClass miCafetera = new CafeClass(500);
        System.out.println("***********");
        System.out.println("Capacidad máxima de la cafetera: " + miCafetera.getCapacidadMaxima() + " c.c.");
        System.out.println("***********");
        System.out.println("Cantidad actual de café en la cafetera: " + miCafetera.getCantidadActual() + " c.c.");
        miCafetera.llenarCafetera();
        System.out.println("***********");
        System.out.println("Después de llenar la cafetera:");
        System.out.println("Cantidad actual de café en la cafetera: " + miCafetera.getCantidadActual() + " c.c.");
        System.out.println("############");
        miCafetera.servirTaza();
        System.out.println("Después de servir su taza de café");
        System.out.println("queda en la cafetera: " + miCafetera.getCantidadActual());
    }
    
}
