
package Entidad;

public class Paises {

    private String nombre;
    private String cant_hab;

    public Paises() {
    }

    public Paises(String nombre, String cant_hab) {
        this.nombre = nombre;
        this.cant_hab = cant_hab;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCant_hab() {
        return cant_hab;
    }

    public void setCant_hab(String cant_hab) {
        this.cant_hab = cant_hab;
    }

    @Override
    public String toString() {
        return "Paises{" + "nombre=" + nombre + ", cant_hab=" + cant_hab + '}';
    }
  
}
