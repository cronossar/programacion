package guia9.ejer5;

import Entidades.Persona;
import Servicio.PersonaService;

public class Main {
//En este ejemplo, creamos un objeto Scanner en el constructor de la clase PersonaService
//para poder pedir información al usuario a través de la consola. Luego, en el 
//método crearPersona(), solicitamos el nombre y la fecha de nacimiento 
//de la persona y creamos un objeto Persona con ellos.
//
//El método calcularEdad() utiliza la clase LocalDate para calcular la edad de la persona
//a partir de su fecha de nacimiento y la fecha actual.
//
//El método menorQue() utiliza el método calcularEdad() para obtener la edad de la persona
//y compara esa edad con la edad pasada por parámetro.
//
//El método mostrarPersona() muestra la información de la persona (nombre, fecha de nacimiento
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
