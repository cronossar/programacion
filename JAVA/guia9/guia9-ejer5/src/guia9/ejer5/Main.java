package guia9.ejer5;

import Entidades.Persona;
import Servicio.PersonaService;

public class Main {
//En este ejemplo, creamos un objeto Scanner en el constructor de la clase PersonaService
//para poder pedir informaci�n al usuario a trav�s de la consola. Luego, en el 
//m�todo crearPersona(), solicitamos el nombre y la fecha de nacimiento 
//de la persona y creamos un objeto Persona con ellos.
//
//El m�todo calcularEdad() utiliza la clase LocalDate para calcular la edad de la persona
//a partir de su fecha de nacimiento y la fecha actual.
//
//El m�todo menorQue() utiliza el m�todo calcularEdad() para obtener la edad de la persona
//y compara esa edad con la edad pasada por par�metro.
//
//El m�todo mostrarPersona() muestra la informaci�n de la persona (nombre, fecha de nacimiento
//y edad) en la consola.
    public static void main(String[] args) {
        
        PersonaService p1 = new PersonaService();
        Persona per1 = new Persona();
        
        p1.crearPersona();
        System.out.println("&&&&&&&&&&&&&");
        //p1.calcularEdad(fechaNacimiento);
        p1.mostrarPersona(per1);
        
        
    }
    
}
