package entidades;

import java.util.HashSet;

public class Voto {

    private Alumno alumno;
    private HashSet<Alumno> votados;

    public Voto() {
    }

    public Voto(Alumno alumno, HashSet<Alumno> votados) {
        this.alumno = alumno;
        this.votados = votados;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public HashSet<Alumno> getVotados() {
        return votados;
    }

    public void setVotados(HashSet<Alumno> votados) {
        this.votados = votados;
    }
}