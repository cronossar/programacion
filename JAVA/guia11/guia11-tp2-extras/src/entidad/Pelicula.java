package entidad;

public class Pelicula {

    private String titulo;
    private Integer duracion;
    private Integer edadMinima;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, Integer duracion, Integer edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public Integer getEdadMinima() {
        return edadMinima;
    }

    public String getDirector() {
        return director;
    }
    
    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
}
