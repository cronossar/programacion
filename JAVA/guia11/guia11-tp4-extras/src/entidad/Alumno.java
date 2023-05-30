
package entidad;

public class Alumno {
    
    public String nombreCompleto;
    public int dni;
    public int cantidadVotos;

    public Alumno(String nombreCompleto, int dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantidadVotos = 0;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getDni() {
        return dni;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public void incrementarVotos() {
        cantidadVotos++;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombreCompleto=" + nombreCompleto + ", dni=" + dni + ", cantidadVotos=" + cantidadVotos + '}';
    }
    
}