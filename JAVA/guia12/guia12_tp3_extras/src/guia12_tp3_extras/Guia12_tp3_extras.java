
package guia12_tp3_extras;

import entidad.Alojamiento;
import entidad.Camping;
import entidad.Hotel;
import entidad.HotelCincoEstrellas;
import entidad.HotelCuatroEstrellas;
import entidad.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



public class Guia12_tp3_extras {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HotelCuatroEstrellas H4ES = new HotelCuatroEstrellas();
        HotelCincoEstrellas H5ES = new HotelCincoEstrellas();
        ArrayList<Alojamiento> listaAlojamientos = new ArrayList();

        HotelCincoEstrellas H5E1 = new HotelCincoEstrellas(1, 3, 2,
                "A", "DANY RESTO", 20, 5, 2,
                3, 0, "HOTEL DANY", "CALLE DANY", "MISIONES", "DANY B");

        HotelCincoEstrellas H5E2 = new HotelCincoEstrellas(2, 1, 1,
                "B", "JUAN RESTO", 60, 3, 3,
                3, 0, "HOTEL JUAN", "CALLE JUAN", "LOMAS DE ZAMORA", "JUAN P");

        HotelCuatroEstrellas H4E1 = new HotelCuatroEstrellas("A", "JORGE RESTO", 40, 5, 2,
                2, 0, "HOTEL JORGE", "CALLE JORGE", "SAN MARTIN", "JORGE S");

        listaAlojamientos.add(H5E1);
        listaAlojamientos.add(H5E2);
        listaAlojamientos.add(H4E1);

        for (Alojamiento listaAlojamiento : listaAlojamientos) {
            if (listaAlojamiento instanceof Hotel) {
                if (listaAlojamiento instanceof HotelCincoEstrellas) {
                    ((HotelCincoEstrellas) listaAlojamiento).calcularPrecio();
                } else if (listaAlojamiento instanceof HotelCuatroEstrellas) {
                    ((HotelCuatroEstrellas) listaAlojamiento).calcularPrecio();
                }
            }
        }
        boolean salir = true;
        do {
            System.out.println("-------------");
            System.out.println("MENU");
            System.out.println("ALOJAMIENTOS");
            System.out.println("-------------");
            System.out.println("OPCIONES");
            System.out.println("1-MOSTRAR TODOS LOS ALOJAMIENTOS");
            System.out.println("2-MOSTRAR HOTELES POR PRECIO MÁS CARO AL MÁS BARATO");
            System.out.println("3-MOSTRAR TODOS LOS CAMPINGS CON RESTAURANTE");
            System.out.println("4-MOSTRAR TODAS LAS RESIDENCIAS CON DESCUENTO");
            System.out.println("0-SALIR");
            System.out.println("-------------");
            System.out.println("Elija una opción:");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    for (Alojamiento mostrarAlojamientos : listaAlojamientos) {
                        System.out.println(mostrarAlojamientos);
                    }
                    break;
                case 2:
                        listaAlojamientos.sort();
                        
                    break;
                case 3:

                    break;
                case 4:

                    break;

                case 0:
                    System.out.println("USTED SELECCIONO SALIR");
                    salir = false;
                    break;
                default:
                    System.out.println("La opcion elegida no es valida");
            }
        } while (salir);

    }
}