
package entidad;

public class HotelCuatroEstrellas extends Hotel {
    
    private String gimnasio;
    private String nombreRestaurante;
    private int capacidadRestaurante;

    public HotelCuatroEstrellas(String nombre, String direccion, String localidad, String gerente,
                                int cantidadHabitaciones, int numeroCamas, int cantidadPisos,
                                String gimnasio, String nombreRestaurante, int capacidadRestaurante) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, cantidadPisos);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }
}