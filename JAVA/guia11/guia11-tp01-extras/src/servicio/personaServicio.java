
package servicio;

import entidad.Persona;
import java.util.Scanner;

public class personaServicio {
    
    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Persona crearpersona() {

        Persona per_aux = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        per_aux.setNombre(scan.next());
        
        System.out.println("Ingrese el apellido");
        per_aux.setApellido(scan.next());
        
        System.out.println("Ingrese el N° documento");
        per_aux.setDocumento(scan.nextInt());
        
        System.out.println("Ingrese la edad de la persona");
        per_aux.setEdad(scan.nextInt());
        
        return per_aux;
    
    }
    
}
