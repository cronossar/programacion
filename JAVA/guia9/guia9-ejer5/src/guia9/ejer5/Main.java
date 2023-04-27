package guia9.ejer5;

import Entidades.Persona;
import Servicio.PersonaService;
import java.util.Scanner;
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
     PersonaService personaService = new PersonaService();
    Persona persona = personaService.crearPersona();
    personaService.mostrarPersona(persona);
    int edad = personaService.calcularEdad(persona);
    System.out.println("Edad: " + edad);
    System.out.println("�La persona es menor que 18 a�os? " + personaService.menorQue(persona, 18));
}
}