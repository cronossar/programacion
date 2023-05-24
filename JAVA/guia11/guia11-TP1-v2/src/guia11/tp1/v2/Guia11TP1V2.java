
package guia11.tp1.v2;

import entidad.Perro;
import entidad.Persona;

public class Guia11TP1V2 {

    public static void main(String[] args) {
//Realizar un programa para que una Persona pueda adoptar un Perro. 
//Vamos a contar de dos
//clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y 
//la clase Persona con
//atributos: nombre, apellido, edad, documento y Perro.
//Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos 
//a tener que
//pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
//mostrar desde
//la clase Persona, la información del Perro y de la Persona.
     

Perro can1 = new Perro("Carucha", "BullTerrier", 5, "Mediano");
Perro can2 = new Perro("Rocket", "Salchicha", 3, "Mediano");    

Persona p1 = new Persona("Aldana", "Ramirez", 25, 21302230, can1);
Persona p2 = new Persona("Roberto", "Santo", 32, 45302230, can2);     
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        }
    
}
