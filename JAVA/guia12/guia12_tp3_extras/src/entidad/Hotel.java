
package entidad;

public class Hotel extends Alojamiento {
    
    private int cantidadHabitaciones;
    private int numeroCamas;
    private int cantidadPisos;
    private double precioHabitaciones;

    public Hotel(String nombre, String direccion, String localidad, String gerente,
                 int cantidadHabitaciones, int numeroCamas, int cantidadPisos) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantidadPisos = cantidadPisos;
        this.precioHabitaciones = calcularPrecioHabitaciones();
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

    public double calcularPrecioHabitaciones() {
        double precio = 50 + (1 * cantidadHabitaciones);
        return precio;
    }
}
