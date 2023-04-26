package nespresso;

import Entidades.Cafetera;
import Servicios.CafeteraServicios;
import java.util.Scanner;

public class Nespresso {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
       
        CafeteraServicios servicio = new CafeteraServicios();
       
        Cafetera cafetera = new Cafetera();
        

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
    //Acomodar el menu
    // menu
       /* int op;
        boolean tb = true;
        do {
            System.out.println("1.llenar cafetera");
            System.out.println("2.servir taza");
            System.out.println("3.vaciar cafetera");
            System.out.println("4.agregar cafe");
            System.out.println("5.ver");
            System.out.println("6.Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println(cs.llenarCafetera(c));
                    break;
                case 2:
                    System.out.println(cs.servirTaza(leer.nextInt(), c));
                    break;
                case 3:
                    System.out.println(cs.vaciarCafetera(c));
                    break;
                case 4:
                    System.out.println(cs.agregarCafe(leer.nextInt(), c));
                    break;
                case 5:
                    System.out.println(cs.ver(c));
                    break;
                case 6:
                    tb = false;
                    break;
                default:
                    System.out.println("escrbibi bien");
            }

        } while (tb == true);
    }*/
    
}
