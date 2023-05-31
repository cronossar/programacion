package entidades;

import java.util.List;

public class Voto {

    private Alumno alumnoVotante;
    private List<Alumno> alumnosVotados;
    
    public Voto(Alumno alumnoVotante, List<Alumno> alumnosVotados) {
        this.alumnoVotante = alumnoVotante;
        this.alumnosVotados = alumnosVotados;
    }

    public Alumno getAlumnoVotante() {
        return alumnoVotante;
    }

    public void setAlumnoVotante(Alumno alumnoVotante) {
        this.alumnoVotante = alumnoVotante;
    }

    public List<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }

    public void setAlumnosVotados(List<Alumno> alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }
    
    
}