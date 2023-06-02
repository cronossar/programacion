package guia11.tp04.extras;


import java.util.ArrayList;
import servicios.Simulador;

public class Guia11Tp04Extras {

    public static void main(String[] args) {

        Simulador servicioSimulador = new Simulador();
         
        System.out.println("Bienvenidos! EGG Rotos");
        
        
        
        ArrayList<String> alumnos = servicioSimulador.generarListaAlumnos();
        System.out.println(alumnos);
        ArrayList<Integer> dnis = servicioSimulador.generarListaDNI(alumnos);
        System.out.println(dnis);
        ArrayList<Alumnos> ListaAlumnosCompleta = servicioSimulador.crearAlumno(dnis, alumnos);
        
        servicioSimulador.mostrarAlumnos(ListaAlumnosCompleta);
        
        //Prueba Luis
        
        servicioSimulador.mostrarVotos(servicioSimulador.votacion(ListaAlumnosCompleta));
        servicioSimulador.recuentoVotos(ListaAlumnosCompleta);
        servicioSimulador.facilitadores(ListaAlumnosCompleta);
        
    }
    
}
