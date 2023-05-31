package entidades;

public class Alumno {

    private String nombreCompleto;
    private int dni;
    private int cantidadVotos;
    
    public Alumno(String nombreCompleto, int dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantidadVotos = 0;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }
    
    
    
    public void incrementarVotos() {
        cantidadVotos++;
    }
}