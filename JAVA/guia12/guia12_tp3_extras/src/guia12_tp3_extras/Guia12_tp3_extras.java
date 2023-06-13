
package guia12_tp3_extras;

import entidad.Alojamiento;
import entidades.Camping;
import entidades.Hotel;
import entidades.HotelCincoEstrellas;
import entidades.HotelCuatroEstrellas;
import entidades.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Guia12_tp3_extras {

    public static void main(String[] args) {
        
        // Crear algunos alojamientos de ejemplo
        HotelCuatroEstrellas hotel1 = new HotelCuatroEstrellas("Hotel 1", "Dirección 1", "Localidad 1", "Gerente 1",
                100, 200, 5, "A", "Restaurante 1", 50);
        HotelCincoEstrellas hotel2 = new HotelCincoEstrellas("Hotel 2", "Dirección 2", "Localidad 2", "Gerente 2",
                200, 400, 10, "B", "Restaurante 2", 100, 5, 10, 3);
        Camping camping1 = new Camping("Camping 1", "Dirección 3", "Localidad 3", "Gerente 3",
                false, 1000, 50, 10, true);
        Camping camping2 = new Camping("Camping 2", "Dirección 4", "Localidad 4", "Gerente 4",
                true, 500, 30, 5, false);
        Residencia residencia1 = new Residencia("Residencia 1", "Dirección 5", "Localidad 5", "Gerente 5",
                false, 2000, 20, true, true);
        Residencia residencia2 = new Residencia("Residencia 2", "Dirección 6", "Localidad 6", "Gerente 6",
                true, 1500, 15, false, false);

        // Agregar los alojamientos a una lista
        List<Alojamiento> alojamientos = new ArrayList<>();
        alojamientos.add(hotel1);
        alojamientos.add(hotel2);
        alojamientos.add(camping1);
        alojamientos.add(camping2);
        alojamientos.add(residencia1);
        alojamientos.add(residencia2);

        // Consultar todos los alojamientos
        System.out.println("Todos los alojamientos:");
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println("Nombre: " + alojamiento.getNombre());
            System.out.println("Dirección: " + alojamiento.getDireccion());
            System.out.println("Localidad: " + alojamiento.getLocalidad());
            System.out.println("Gerente: " + alojamiento.getGerente());
            System.out.println();
        }

        // Consultar todos los hoteles de más caro a más barato
        System.out.println("Hoteles de más caro a más barato:");
        List<Hotel> hoteles = new ArrayList<>();
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel) {
                hoteles.add((Hotel) alojamiento);
            }
        }
        Collections.sort(hoteles, new Comparator<Hotel>() {
            @Override
            public int compare(Hotel hotel1, Hotel hotel2) {
                return Double.compare(hotel2.getPrecioHabitaciones(), hotel1.getPrecioHabitaciones());
            }
        });
        for (Hotel hotel : hoteles) {
            System.out.println("Nombre: " + hotel.getNombre());
            System.out.println("Precio Habitaciones: " + hotel.getPrecioHabitaciones());
            System.out.println();
        }

        // Consultar todos los campings con restaurante
        System.out.println("Campings con restaurante:");
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Camping && ((Camping) alojamiento).tieneRestaurante()) {
                System.out.println("Nombre: " + alojamiento.getNombre());
                System.out.println("Dirección: " + alojamiento.getDireccion());
                System.out.println("Localidad: " + alojamiento.getLocalidad());
                System.out.println("Gerente: " + alojamiento.getGerente());
                System.out.println();
            }
        }

        // Consultar todas las residencias que tienen descuento
        System.out.println("Residencias con descuento:");
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Residencia && ((Residencia) alojamiento).tieneDescuentosGremios()) {
                System.out.println("Nombre: " + alojamiento.getNombre());
                System.out.println("Dirección: " + alojamiento.getDireccion());
                System.out.println("Localidad: " + alojamiento.getLocalidad());
                System.out.println("Gerente: " + alojamiento.getGerente());
                System.out.println();
            }
        }
    }
}

