package entidades;

public class Alumno {

    private String nombreCompleto;
    private int DNI;
    private int cantidadVotos;

    public Alumno(String nombreCompleto, int DNI) {
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
        this.cantidadVotos = 0;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getDNI() {
        return DNI;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }
    

    public void incrementarVotos() {
        cantidadVotos++;
    }
}