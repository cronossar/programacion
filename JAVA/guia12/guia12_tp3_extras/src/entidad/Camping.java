
package entidad;

public class Camping extends Alojamiento {
    protected int capacidadMaximaCarpas;
    protected int cantidadBanos;
    protected boolean tieneRestaurante;

    public Camping() {
    }

    public Camping(int capacidadMaximaCarpas, int cantidadBanos, boolean tieneRestaurante, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.cantidadBanos = cantidadBanos;
        this.tieneRestaurante = tieneRestaurante;
    }

    
    public int getCapacidadMaximaCarpas() {
        return capacidadMaximaCarpas;
    }

    public void setCapacidadMaximaCarpas(int capacidadMaximaCarpas) {
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
    }

    public int getCantidadBanos() {
        return cantidadBanos;
    }

    public void setCantidadBanos(int cantidadBanos) {
        this.cantidadBanos = cantidadBanos;
    }

    public boolean isTieneRestaurante() {
        return tieneRestaurante;
    }

    public void setTieneRestaurante(boolean tieneRestaurante) {
        this.tieneRestaurante = tieneRestaurante;
    }

    @Override
    public String toString() {
        return "Camping{" + "capacidadMaximaCarpas=" + capacidadMaximaCarpas + ", cantidadBanos=" + cantidadBanos + ", tieneRestaurante=" + tieneRestaurante + '}';
    }

        
}