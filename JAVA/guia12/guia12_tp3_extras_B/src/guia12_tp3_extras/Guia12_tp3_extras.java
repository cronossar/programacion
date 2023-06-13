
package guia12_tp3_extras;

import entidades.Alojamiento;
import entidades.Hotel;
import entidades.HotelCincoEstrellas;
import entidades.HotelCuatroEstrellas;
import entidades.Camping;
import entidades.Residencia;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Guia12_tp3_extras {

    public static void main(String[] args) {
      // Crear lista de alojamientos
        ArrayList<Alojamiento> alojamientos = new ArrayList<>();

        // Agregar hoteles
        HotelCuatroEstrellas hotel1 = new HotelCuatroEstrellas("Hotel A", "Dirección A", "Localidad A",
                "Gerente A", 100, 200, 10, 150.0, "A", "Restaurante A", 40);
        HotelCincoEstrellas hotel2 = new HotelCincoEstrellas("Hotel B", "Dirección B", "Localidad B",
                "Gerente B", 200, 400, 20, 250.0, "B", "Restaurante B", 60, 5, 20, 3);

        alojamientos.add(hotel1);
        alojamientos.add(hotel2);

        // Agregar camping y residencia
        Camping camping1 = new Camping("Camping A", "Dirección C", "Localidad C", "Gerente C",
                50, 10, true);
        Residencia residencia1 = new Residencia("Residencia A", "Dirección D", "Localidad D",
                "Gerente D", 50, true, false);

        alojamientos.add(camping1);
        alojamientos.add(residencia1);

        // Consulta: todos los alojamientos
        System.out.println("Todos los alojamientos:");
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println("Nombre: " + alojamiento.getNombre());
            System.out.println("Dirección: " + alojamiento.getDireccion());
            System.out.println("Localidad: " + alojamiento.getLocalidad());
            System.out.println("Gerente: " + alojamiento.getGerente());
            System.out.println();
        }

        // Consulta: todos los hoteles de más caro a más barato
        System.out.println("Todos los hoteles de más caro a más barato:");
        alojamientos.stream()
                .filter(alojamiento -> alojamiento instanceof Hotel)
                .map(alojamiento -> (Hotel) alojamiento)
                .sorted(Comparator.comparingDouble(Hotel::getPrecioHabitaciones).reversed())
                .forEach(hotel -> {
                    System.out.println("Nombre: " + hotel.getNombre());
                    System.out.println("Dirección: " + hotel.getDireccion());
                    System.out.println("Localidad: " + hotel.getLocalidad());
                    System.out.println("Gerente: " + hotel.getGerente());
                    System.out.println("Precio Habitaciones: " + hotel.getPrecioHabitaciones());
                    System.out.println();
                });

        // Consulta: todos los campings con restaurante
        System.out.println("Todos los campings con restaurante:");
        alojamientos.stream()
                .filter(alojamiento -> alojamiento instanceof Camping)
                .map(alojamiento -> (Camping) alojamiento)
                .filter(Camping::tieneRestaurante)
                .forEach(camping -> {
                    System.out.println("Nombre: " + camping.getNombre());
                    System.out.println("Dirección: " + camping.getDireccion());
                    System.out.println("Localidad: " + camping.getLocalidad());
                    System.out.println("Gerente: " + camping.getGerente());
                    System.out.println();
                });

        // Consulta: todos las residencias que tienen descuento
        System.out.println("Todos las residencias que tienen descuento:");
        alojamientos.stream()
                .filter(alojamiento -> alojamiento instanceof Residencia)
                .map(alojamiento -> (Residencia) alojamiento)
                .filter(Residencia::tieneDescuentosGremios)
                .forEach(residencia -> {
                    System.out.println("Nombre: " + residencia.getNombre());
                    System.out.println("Dirección: " + residencia.getDireccion());
                    System.out.println("Localidad: " + residencia.getLocalidad());
                    System.out.println("Gerente: " + residencia.getGerente());
                    System.out.println();
                });
    }
}