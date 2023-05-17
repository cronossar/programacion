
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
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
    
}
      //Mostrar en pantalla todas las películas con una duración mayor a 1 hora
    public void mostrarMayorT (ArrayList<Pelicula> peli){
        Collections.sort(peli, Utilidades.Comparadores.ordenarDuracionAscendente);
        for (Pelicula pelicula : peli) {
            System.out.println(pelicula);
        }
    
    } 
    public void mostrarMenorT(ArrayList<Pelicula> peli){
       peli.sort(Utilidades.Comparadores.ordenarDuracionDescendente);
       mostrarPeliculas(peli);
    }
    
    public void ordenapTitulo(ArrayList<Pelicula> peli){
       peli.sort(Utilidades.Comparadores.ordenarAlfaXTitulo);
       mostrarPeliculas(peli);
    }
    
    public void ordenarDirector(ArrayList<Pelicula> peli){
       peli.sort(Utilidades.Comparadores.ordenarAlfaXTitulo);
       mostrarPeliculas(peli);
    }
}
    
      

    
    

