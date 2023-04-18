
package Servicio;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {
    Scanner leer = new Scanner(System.in);
    
    //Metodos
    public void esMayordeEdad(Persona p1){
        
        
    }
    
    public Persona crearPersona(){
        
        //Se instancia un objeto persona
        Persona p1 = new Persona();
        //Se llenan los atributos
        System.out.println("En este calculador de IMC, vamos a crear una persona");
        System.out.println("##########################");
        System.out.println("Ingrese el nombre");
        p1.setNombre(leer.next());
        System.out.println("Ingrese la edad de la persona");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese el sexo: H (hombre), M (mujer), O (otro)");
        p1.setSexo(leer.next());
        System.out.println("##########################");
        return p1;
    } 
    
    public void calcularIMC(){
        
    }
}
