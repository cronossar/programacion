
package entidades;

public class HotelCincoEstrellas extends Hotel {
    
    private String gimnasio;
    private String nombreRestaurante;
    private int capacidadRestaurante;
    private int cantidadSalonesConferencia;
    private int cantidadSuites;
    private int cantidadLimosinas;

    public HotelCincoEstrellas(String nombre, String direccion, String localidad, String gerente,
                               int cantidadHabitaciones, int numeroCamas, int cantidadPisos,
                               double precioHabitaciones, String gimnasio, String nombreRestaurante,
                               int capacidadRestaurante, int cantidadSalonesConferencia,
                               int cantidadSuites, int cantidadLimosinas) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, cantidadPisos,
                precioHabitaciones);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
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

    public int getCantidadSalonesConferencia() {
        return cantidadSalonesConferencia;
    }

    public int getCantidadSuites() {
        return cantidadSuites;
    }

    public int getCantidadLimosinas() {
        return cantidadLimosinas;
    }
}