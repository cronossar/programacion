package servicio;

import entidades.Alumno;
import entidades.Voto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Simulador {

    private List<Alumno> alumnos;
    private List<Integer> dnis;
    
    public Simulador() {
        alumnos = new ArrayList<>();
        dnis = new ArrayList<>();
    }
    
    public List<Alumno> generarListadoAlumnos(int cantidadAlumnos) {
        List<String> nombres = Arrays.asList("Juan", "Maria", "Pedro", "Laura", "Carlos", "Ana");
        List<String> apellidos = Arrays.asList("Gomez", "Lopez", "Rodriguez", "Fernandez", "Perez", "Torres");
        List<String> combinacionesNombres = generarCombinacionesAleatorias(nombres, cantidadAlumnos);
        List<String> combinacionesApellidos = generarCombinacionesAleatorias(apellidos, cantidadAlumnos);
        
        for (int i = 0; i < cantidadAlumnos; i++) {
            String nombreCompleto = combinacionesNombres.get(i) + " " + combinacionesApellidos.get(i);
            Alumno alumno = new Alumno(nombreCompleto, 0);
            alumnos.add(alumno);
        }
        
        return alumnos;
    }
    
    private List<String> generarCombinacionesAleatorias(List<String> elementos, int cantidad) {
        List<String> combinaciones = new ArrayList<>();
        Random random = new Random();
        
        for (int i = 0; i < cantidad; i++) {
            int index = random.nextInt(elementos.size());
            combinaciones.add(elementos.get(index));
        }
        
        return combinaciones;
    }
    
    public List<Integer> generarListadoDnis(int cantidadDnis, int rangoMin, int rangoMax) {
        List<Integer> dnis = new ArrayList<>();
        Random random = new Random();
        
        for (int i = 0; i < cantidadDnis; i++) {
            int dni = random.nextInt(rangoMax - rangoMin + 1) + rangoMin;
            dnis.add(dni);
        }
        
        return dnis;
    }
    
    public void asignarDatosAlumnos(List<Alumno> alumnos, List<Integer> dnis) {
        int cantidadAlumnos = alumnos.size();
        int cantidadDnis = dnis.size();
        
        for (int i = 0; i < cantidadAlumnos; i++) {
            String nombreCompleto = alumnos.get(i).getNombreCompleto();
            int dni = dnis.get(i % cantidadDnis);
            alumnos.get(i).setDni(dni);
        }
    }
    
    public void imprimirListadoAlumnos(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println("Nombre completo: " + alumno.getNombreCompleto());
            System.out.println("DNI: " + alumno.getDni());
            System.out.println("Cantidad de votos: " + alumno.getCantidadVotos());
            System.out.println("-----------------------");
        }
    }
    
    public void votacion(List<Alumno> alumnos) {
        Random random = new Random();
        HashSet<Alumno> alumnosVotados = new HashSet<>();
        
        for (Alumno alumno : alumnos) {
            Voto voto = generarVotoAleatorio(alumno, alumnos, alumnosVotados, random);
            alumno.incrementarVotos();
            
            System.out.println("Alumno que vota: " + voto.getAlumnoVotante().getNombreCompleto());
            System.out.println("Alumnos votados:");
            for (Alumno votado : voto.getAlumnosVotados()) {
                System.out.println("- " + votado.getNombreCompleto());
            }
            System.out.println("-----------------------");
        }
    }
    
    public Voto generarVotoAleatorio(Alumno alumnoVotante, List<Alumno> alumnos, HashSet<Alumno> alumnosVotados, Random random) {
        List<Alumno> alumnosVotadoss = new ArrayList<>();
        alumnosVotadoss.add(alumnoVotante); // El alumno no puede votarse a sí mismo
        
        while (alumnosVotados.size() < 4) {
            int index = random.nextInt(alumnos.size());
            Alumno alumnoVotado = alumnos.get(index);
            if (!alumnosVotados.contains(alumnoVotado)) {
                alumnosVotados.add(alumnoVotado);
            }
        }
        
        return new Voto(alumnoVotante, alumnosVotadoss);
    }
    
    public void mostrarResultados(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println("Alumno: " + alumno.getNombreCompleto());
            System.out.println("Cantidad de votos: " + alumno.getCantidadVotos());
            System.out.println("Votos recibidos:");
            for (Voto voto : votos) {
                if (voto.getAlumnosVotados().contains(alumno)) {
                    System.out.println("- Votado por: " + voto.getAlumnoVotante().getNombreCompleto());
                }
            }
            System.out.println("-----------------------");
        }
    }
    
    public void contarVotos(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            for (Voto voto : votos) {
                if (voto.getAlumnosVotados().contains(alumno)) {
                    alumno.incrementarVotos();
                }
            }
        }
    }
    
    public void mostrarFacilitadores(List<Alumno> alumnos) {
        Collections.sort(alumnos, new Comparator<Alumno>() {
            public int compare(Alumno a1, Alumno a2) {
                return a2.getCantidadVotos() - a1.getCantidadVotos();
            }
        });
        
        System.out.println("Facilitadores:");
        for (int i = 0; i < 5; i++) {
            Alumno facilitador = alumnos.get(i);
            System.out.println((i + 1) + ". " + facilitador.getNombreCompleto() + " - Votos: " + facilitador.getCantidadVotos());
        }
        
        System.out.println("-----------------------");
        
        System.out.println("Facilitadores suplentes:");
        for (int i = 5; i < 10; i++) {
            Alumno facilitadorSuplente = alumnos.get(i);
            System.out.println((i + 1) + ". " + facilitadorSuplente.getNombreCompleto() + " - Votos: " + facilitadorSuplente.getCantidadVotos());
        }
    }
}