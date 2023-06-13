
package entidades;

public class Residencia extends Alojamiento {
    private int cantidadHabitaciones;
    private boolean descuentosGremios;
    private boolean tieneCampoDeportivo;

    public Residencia(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones,
                      boolean descuentosGremios, boolean tieneCampoDeportivo) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentosGremios = descuentosGremios;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public boolean tieneDescuentosGremios() {
        return descuentosGremios;
    }

    public boolean tieneCampoDeportivo() {
        return tieneCampoDeportivo;
    }
}