
package guia11.practca.curso;

import Entidades.Curso;
import Entidades.Profesor;


public class Guia11PractcaCurso {
    //UNO A UNO Por cada objeto tenemos una relación con un solo objeto.

    public static void main(String[] args) {
        
        Profesor profe = new Profesor();
        profe.setNombre("Agustin");
        profe.setApellido("Lima");
        Curso curso = new Curso();
        curso.setProfesor(profe);//seteamos un profesor en el curso
        
    }
    
}
