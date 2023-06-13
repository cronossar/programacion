
package entidad;

public class AlojamientoExtraHotelero extends Alojamiento {
    
    private boolean privado;
    private double metrosCuadrados;

    public AlojamientoExtraHotelero(String nombre, String direccion, String localidad, String gerente,
                                    boolean privado, double metrosCuadrados) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }
}