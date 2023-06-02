package entidades;

import java.util.ArrayList;
import java.util.List;

public class Voto {

    private Alumno alumno;
    private List<Alumno> votados;

    public Voto(Alumno alumno, List<Alumno> votados) {
        this.alumno = alumno;
        this.votados = votados;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public List<Alumno> getVotados() {
        return votados;
    }
}