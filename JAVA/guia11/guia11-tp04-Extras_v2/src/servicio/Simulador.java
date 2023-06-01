package servicio;

import entidades.Alumno;
import entidades.Voto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Simulador {

    private List<String> nombres;
    private List<String> apellidos;
    private List<Integer> dnis;
    private List<Alumno> alumnos;

    public Simulador() {
        
        nombres = Arrays.asList("Juan", "María", "Pedro", "Ana", "Luis", "Laura", "Carlos", "Sofía", "Miguel", "Lucía");
        apellidos = Arrays.asList("García", "Rodríguez", "López", "Fernández", "Martínez", "Pérez", "Gómez", "Sánchez", "Romero", "Torres");
        dnis = generarDNI(10_000_000, 90_000_000);
        alumnos = new ArrayList<>();
    }

    public List<String> generarNombres(int cantidad) {
        List<String> nombresGenerados = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            String nombre = nombres.get(random.nextInt(nombres.size()));
            String apellido = apellidos.get(random.nextInt(apellidos.size()));
            nombresGenerados.add(nombre + " " + apellido);
        }

        return nombresGenerados;
    }

    public List<Integer> generarDNI(int min, int max) {
        List<Integer> dnisGenerados = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int dni = random.nextInt(max - min) + min;
            dnisGenerados.add(dni);
        }

        return dnisGenerados;
    }

    public void generarAlumnos(int cantidad) {
        List<String> nombresGenerados = generarNombres(cantidad);
        List<Integer> dnisGenerados = generarDNI(10_000_000, 90_000_000);
        HashSet<Integer> dnisSet = new HashSet<>(dnisGenerados);

        for (int i = 0; i < cantidad; i++) {
            String nombreCompleto = nombresGenerados.get(i);
            int dni = dnisGenerados.get(i);
            Alumno alumno = new Alumno(nombreCompleto, dni);
            alumnos.add(alumno);
            dnisSet.remove(dni);
        }

        for (int i = 0; i < cantidad; i++) {
            if (alumnos.get(i).getDNI() == 0) {
                int dni = dnisSet.iterator().next();
                alumnos.get(i).setDNI(dni);
                dnisSet.remove(dni);
            }
        }
    }

    public void imprimirAlumnos() {
        for (Alumno alumno : alumnos) {
            System.out.println("Nombre completo: " + alumno.getNombreCompleto()
                    + ", DNI: " + alumno.getDNI()
                    + ", Votos: " + alumno.getCantidadVotos());
        }
    }

    public void votacion() {
        Random random = new Random();
        HashSet<Alumno> votadosSet = new HashSet<>();

        for (Alumno alumno : alumnos) {
            List<Alumno> votados = new ArrayList<>();
            while (votados.size() < 3) {
                int index = random.nextInt(alumnos.size());
                Alumno votado = alumnos.get(index);
                if (alumno != votado && !votadosSet.contains(votado)) {
                    votados.add(votado);
                    votadosSet.add(votado);
                }
            }
            alumno.incrementarVotos();
            Voto voto = new Voto(alumno, votados);
            System.out.println("Alumno: " + voto.getAlumno().getNombreCompleto());
            System.out.println("Votados: ");
            for (Alumno votado : voto.getVotados()) {
                System.out.println("- " + votado.getNombreCompleto());
            }
            System.out.println();
        }
    }

    public void recuentoVotos() {
        alumnos.sort(Comparator.comparingInt(Alumno::getCantidadVotos).reversed());

        List<Alumno> facilitadores = new ArrayList<>();
        List<Alumno> facilitadoresSuplentes = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            facilitadores.add(alumnos.get(i));
            facilitadoresSuplentes.add(alumnos.get(i + 5));
        }

        System.out.println("Facilitadores:");
        for (Alumno facilitador : facilitadores) {
            System.out.println("- " + facilitador.getNombreCompleto() + ", Votos: " + facilitador.getCantidadVotos());
        }

        System.out.println("\nFacilitadores Suplentes:");
        for (Alumno suplente : facilitadoresSuplentes) {
            System.out.println("- " + suplente.getNombreCompleto() + ", Votos: " + suplente.getCantidadVotos());
        }
    }
}
