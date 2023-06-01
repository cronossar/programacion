package entidades;

import java.util.ArrayList;
import java.util.List;

public class Voto {

    private Alumno alumnoQueVota;
    private List<Alumno> alumnosVotados;

    public Voto(Alumno alumnoQueVota) {
        this.alumnoQueVota = alumnoQueVota;
        this.alumnosVotados = new ArrayList<>();
    }

    public Alumno getAlumnoQueVota() {
        return alumnoQueVota;
    }

    public List<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }

    public void agregarVoto(Alumno alumnoVotado) {
        alumnosVotados.add(alumnoVotado);
    }
}
