
package entidades;

public class HotelCuatroEstrellas extends Hotel {
    
    private String gimnasio;
    private String nombreRestaurante;
    private int capacidadRestaurante;

    public HotelCuatroEstrellas(String nombre, String direccion, String localidad, String gerente,
                                int cantidadHabitaciones, int numeroCamas, int cantidadPisos,
                                double precioHabitaciones, String gimnasio, String nombreRestaurante,
                                int capacidadRestaurante) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, cantidadPisos,
                precioHabitaciones);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }
}