package guia11.tp04.extras;


import entidades.Alumnos;
import java.util.ArrayList;
import servicios.Simulador;

public class Guia11Tp04Extras {

    public static void main(String[] args) {

        Simulador serviciosSimulador = new Simulador();
         
        System.out.println("Bienvenidos! EGG Rotos");
        
        
        
        ArrayList<String> alumnos = serviciosSimulador.generarListaAlumnos();
        System.out.println(alumnos);
        ArrayList<Integer> dnis = serviciosSimulador.generarListaDNI(alumnos);
        System.out.println(dnis);
        ArrayList<Alumnos> ListaAlumnosCompleta = serviciosSimulador.crearAlumno(dnis, alumnos);
        
        serviciosSimulador.mostrarAlumnos(ListaAlumnosCompleta);
        
        //Prueba Luis
        
        serviciosSimulador.mostrarVotos(serviciosSimulador.votacion(ListaAlumnosCompleta));
        serviciosSimulador.recuentoVotos(ListaAlumnosCompleta);
        serviciosSimulador.facilitadores(ListaAlumnosCompleta);
        
    }
    
}
