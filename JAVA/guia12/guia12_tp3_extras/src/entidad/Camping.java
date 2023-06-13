
package entidad;

public class Camping extends AlojamientoExtraHotelero {
    private int capacidadMaximaCarpas;
    private int cantidadBanos;
    private boolean tieneRestaurante;

    public Camping(String nombre, String direccion, String localidad, String gerente,
                   boolean privado, double metrosCuadrados,
                   int capacidadMaximaCarpas, int cantidadBanos, boolean tieneRestaurante) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadrados);
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.cantidadBanos = cantidadBanos;
        this.tieneRestaurante = tieneRestaurante;
    }

    public boolean tieneRestaurante() {
        return tieneRestaurante;
    }
}