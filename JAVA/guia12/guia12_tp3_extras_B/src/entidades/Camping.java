
package entidades;

public class Camping extends Alojamiento {
    private int capacidadMaximaCarpas;
    private int cantidadBanos;
    private boolean tieneRestaurante;

    public Camping(String nombre, String direccion, String localidad, String gerente, int capacidadMaximaCarpas,
                   int cantidadBanos, boolean tieneRestaurante) {
        super(nombre, direccion, localidad, gerente);
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.cantidadBanos = cantidadBanos;
        this.tieneRestaurante = tieneRestaurante;
    }

    public int getCapacidadMaximaCarpas() {
        return capacidadMaximaCarpas;
    }

    public int getCantidadBanos() {
        return cantidadBanos;
    }

    public boolean tieneRestaurante() {
        return tieneRestaurante;
    }
}