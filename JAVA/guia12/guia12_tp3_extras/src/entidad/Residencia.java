
package entidad;

public class Residencia extends AlojamientoExtraHotelero {
    private int cantidadHabitaciones;
    private boolean descuentosGremios;
    private boolean tieneCampoDeportivo;

    public Residencia(String nombre, String direccion, String localidad, String gerente,
                      boolean privado, double metrosCuadrados,
                      int cantidadHabitaciones, boolean descuentosGremios, boolean tieneCampoDeportivo) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadrados);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentosGremios = descuentosGremios;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    public boolean tieneDescuentosGremios() {
        return descuentosGremios;
    }
}
