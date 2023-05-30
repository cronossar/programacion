
package servicio;

import entidad.Alumno;
import entidad.Voto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Simulador {
    private static Random random = new Random();

    public List<Alumno> generarListadoAlumnos(int cantidad) {
        List<String> nombres = Arrays.asList("Juan", "Maria", "Pedro", "Ana", "Luis", "Laura");
        List<String> apellidos = Arrays.asList("Gomez", "Lopez", "Perez", "Rodriguez", "Fernandez", "Martinez");
        List<Alumno> alumnos = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            String nombreCompleto = generarNombreCompletoAleatorio(nombres, apellidos);
            int dni = generarDniAleatorio();
            Alumno alumno = new Alumno(nombreCompleto, dni);
            alumnos.add(alumno);
        }

        return alumnos;
    }

    private String generarNombreCompletoAleatorio(List<String> nombres, List<String> apellidos) {
        String nombre = nombres.get(random.nextInt(nombres.size()));
        String apellido = apellidos.get(random.nextInt(apellidos.size()));
        return nombre + " " + apellido;
    }

    private int generarDniAleatorio() {
        int rangoInicial = 10000000;
        int rangoFinal = 99999999;
        return random.nextInt(rangoFinal - rangoInicial + 1) + rangoInicial;
    }

    public void asignarNombresYDnis(List<Alumno> alumnos, List<String> nombres, List<Integer> dnis) {
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno alumno = alumnos.get(i);
            String nombreCompleto = nombres.get(i);
            int dni = dnis.get(i);
            alumno.nombreCompleto = nombreCompleto;
            alumno.dni = dni;
        }
    }

    public void imprimirListadoAlumnos(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println("Nombre: " + alumno.getNombreCompleto() + ", DNI: " + alumno.getDni());
        }
    }

    public void votacion(List<Alumno> alumnos) {
        HashSet<Integer> votosRealizados = new HashSet<>();

        for (Alumno alumno : alumnos) {
            List<Alumno> votos = generarVotosAleatorios(alumnos, alumno, votosRealizados);
            Voto voto = new Voto(alumno, votos);
            alumno.incrementarVotos();

            System.out.println("Alumno: " + alumno.getNombreCompleto() + ", Votos: " + votos);
        }
    }

    private List<Alumno> generarVotosAleatorios(List<Alumno> alumnos, Alumno alumno, HashSet<Integer> votosRealizados) {
        List<Alumno> votos = new ArrayList<>();
        HashSet<Integer> votosRealizadosPorAlumno = new HashSet<>();

        while (votos.size() < 3) {
            int indiceAleatorio = random.nextInt(alumnos.size());
            Alumno alumnoVotado = alumnos.get(indiceAleatorio);

            if (alumno != alumnoVotado && !votosRealizadosPorAlumno.contains(alumnoVotado.getDni())) {
                votos.add(alumnoVotado);
                votosRealizadosPorAlumno.add(alumnoVotado.getDni());
            }
        }

        return votos;
    }

    public void recuentoVotos(List<Alumno> alumnos) {
        Collections.sort(alumnos, (a1, a2) -> Integer.compare(a2.getCantidadVotos(), a1.getCantidadVotos()));

        List<Alumno> facilitadores = alumnos.subList(0, 5);
        List<Alumno> facilitadoresSuplentes = alumnos.subList(5, 10);

        System.out.println("Facilitadores:");
        mostrarAlumnos(facilitadores);

        System.out.println("\nFacilitadores Suplentes:");
        mostrarAlumnos(facilitadoresSuplentes);
    }

    private void mostrarAlumnos(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println("Nombre: " + alumno.getNombreCompleto() + ", Votos: " + alumno.getCantidadVotos());
        }
    }
}