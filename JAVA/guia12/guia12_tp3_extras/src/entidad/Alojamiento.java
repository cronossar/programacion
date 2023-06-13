package entidad;

public abstract class Alojamiento {

    private String nombre;
    private String direccion;
    private String localidad;
    private String gerente;

    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getGerente() {
        return gerente;
    }
}
