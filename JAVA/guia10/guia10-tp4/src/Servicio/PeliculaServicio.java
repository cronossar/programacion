
package Servicio;

import Entidad.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class PeliculaServicio {
    
    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void crearPelicula(ArrayList<Pelicula> peli) {
        String sal = "s";
        do {
            Pelicula aux = new Pelicula();
            System.out.println("Ingrese el nombre de la Pelicula");
            aux.setTitulo(read.nextLine());
            read.delimiter();
            System.out.println("Ingrese el nombre del Director");
            aux.setDirector(read.nextLine());
            read.delimiter();
            System.out.println("Ingrese la duracion de la pelicula en horas");
            aux.setDuracion(read.nextInt());
            read.delimiter();
            peli.add(aux);

            System.out.println("Desea agregar otra Pelicula? (s/n)");
            sal = read.nextLine();

        } while (sal.equalsIgnoreCase("s"));

    }
    //Mostrar en pantalla todas las películas
    public void mostrarPeliculas (ArrayList<Pelicula> peli){
        for (Pelicula p : peli) {
            System.out.println(p.toString());
        }
    //Mostrar en pantalla todas las películas con una duración mayor a 1 hora
    
     
          
      } 
}
    
    

