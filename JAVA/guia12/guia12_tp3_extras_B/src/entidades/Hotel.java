
package entidades;

public class Hotel extends Alojamiento {
    
    private int cantidadHabitaciones;
    private int numeroCamas;
    private int cantidadPisos;
    private double precioHabitaciones;

    public Hotel(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones,
                 int numeroCamas, int cantidadPisos, double precioHabitaciones) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantidadPisos = cantidadPisos;
        this.precioHabitaciones = precioHabitaciones;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public double getPrecioHabitaciones() {
        return precioHabitaciones;
    }
}