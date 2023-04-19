package calcularimc;

import Entidades.Persona;
import Servicio.PersonaServicio;

public class CalcularIMC {

    public static void main(String[] args) {
        PersonaServicio servicio = new PersonaServicio();

        Persona p1 = new Persona("Juan", 25, 'H', 70, 1.75);
        Persona p2 = new Persona("María", 30, 'M', 110, 1.6);
        Persona p3 = new Persona("Juanita", 45, 'M', 60, 1.6);
        Persona p4 = new Persona("Roberto", 55, 'O', 95, 1.6);
       
    }
    
}
