
package entidad;

import java.util.List;

public class Voto {
    private Alumno alumno;
    private List<Alumno> votos;

    public Voto(Alumno alumno, List<Alumno> votos) {
        this.alumno = alumno;
        this.votos = votos;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public List<Alumno> getVotos() {
        return votos;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumno=" + alumno + ", votos=" + votos + '}';
    }
    
}