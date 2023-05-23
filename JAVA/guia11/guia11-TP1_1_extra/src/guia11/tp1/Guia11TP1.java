
package guia11.tp1;

import Entidad.Perro;
import Entidad.Persona;

public class Guia11TP1 {

    public static void main(String[] args) {
        
        /**
         * Realizar un programa para que una Persona pueda adoptar un Perro.
         * Vamos a contar de dos clases. Perro, que tendrá como atributos:
         * nombre, raza, edad y tamaño; y la clase Persona con atributos:
         * nombre, apellido, edad, documento y Perro. Ahora deberemos en el main
         * crear dos Personas y dos Perros. Después, vamos a tener que pensar la
         * lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
         * mostrar desde la clase Persona, la información del Perro y de la
         * Persona.
         */
        
        Perro p1 = new Perro( "Alicia","Caniche", 4 ,"Pequeño");
        Perro p2 = new Perro( "Brutus","Beagle", 1 ,"Mediano");
        
        Persona per1 = new Persona("Carlos", "Bochorno", 32777999, 43 , p2);
        Persona per2 = new Persona("Armando", "Lios", 17555666, 14 , p1);
        
        System.out.println(per1.toString());
        System.out.println(per2.toString());
        
    }

}