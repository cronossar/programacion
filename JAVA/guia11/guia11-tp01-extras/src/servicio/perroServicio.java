package servicio;

import entidad.Perro;
import java.util.Scanner;

public class perroServicio {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Perro crearperro() {

        Perro pe_aux = new Perro();
        System.out.println("Ingrese el nombre del guaguau");
        pe_aux.setNombre(scan.next());
        
        System.out.println("Ingrese la raza del guaguau");
        pe_aux.setRaza(scan.next());
        
        System.out.println("Ingrese la edad del guaguau");
        pe_aux.setEdad(scan.nextInt());
        
        System.out.println("Ingrese el tamaño del guaguau");
        pe_aux.setTamanio(scan.next());
        
        return pe_aux;
    
    }

}
