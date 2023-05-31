package entidad;

public class Espectador {

    private String nombre;
    private Integer edad;
    private Double dinero;

    public Espectador() {
    }

    public Espectador(String nombre, Integer edad, Double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public Double getDinero() {
        return dinero;
    }

    // Setters   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setDinero(Double dinero) {
        this.dinero = dinero;
    }

}
