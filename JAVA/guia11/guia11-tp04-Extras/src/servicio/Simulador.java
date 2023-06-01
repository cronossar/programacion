package servicio;

import entidades.Alumno;
import entidades.Voto;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;


public class Simulador {

    private Random random;
    private List<String> nombres;
    private List<String> apellidos;
    private List<Alumno> alumnos;
    private HashSet<Integer> dnis;

    public Simulador() {
        random = new Random();
        nombres = new ArrayList<>();
        apellidos = new ArrayList<>();
        alumnos = new ArrayList<>();
        dnis = new HashSet<>();
    }

    public void generarNombres() {
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Luis");
        nombres.add("Ana");
        nombres.add("Pedro");
        // Agregar más nombres según sea necesario
    }

    public void generarApellidos() {
        apellidos.add("Gómez");
        apellidos.add("Pérez");
        apellidos.add("López");
        apellidos.add("Fernández");
        apellidos.add("González");
        // Agregar más apellidos según sea necesario
    }

    public String generarNombreAleatorio() {
        int indiceNombre = random.nextInt(nombres.size());
        int indiceApellido = random.nextInt(apellidos.size());
        return nombres.get(indiceNombre) + " " + apellidos.get(indiceApellido);
    }

    public int generarDNI() {
        int dni;
        do {
            dni = random.nextInt(1000000000);
        } while (dnis.contains(dni));
        dnis.add(dni);
        return dni;
    }

    public void generarAlumnos(int cantidadAlumnos) {
        for (int i = 0; i < cantidadAlumnos; i++) {
            String nombreCompleto = generarNombreAleatorio();
            int dni = generarDNI();
            Alumno alumno = new Alumno(nombreCompleto, dni);
            alumnos.add(alumno);
        }
    }

    public void imprimirListadoAlumnos() {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }

    public void realizarVotacion() {
        HashSet<Alumno> votados = new HashSet<>();

        for (Alumno alumno : alumnos) {
            Voto voto = new Voto(alumno);

            while (voto.getAlumnosVotados().size() < 3) {
                int indiceAlumnoVotado = random.nextInt(alumnos.size());
                Alumno alumnoVotado = alumnos.get(indiceAlumnoVotado);

                if (!alumno.equals(alumnoVotado) && !voto.getAlumnosVotados().contains(alumnoVotado)) {
                    voto.agregarVoto(alumnoVotado);
                    votados.add(alumnoVotado);
                }
            }

            alumno.incrementarVotos();
        }
    }

    public void mostrarResultadosVotacion() {
        for (Alumno alumno : alumnos) {
            System.out.println("Alumno: " + alumno.getNombreCompleto());
            System.out.println("Cantidad de votos: " + alumno.getCantidadVotos());
            System.out.println("Votos recibidos:");

            for (Voto voto : obtenerVotosRecibidos(alumno)) {
                System.out.println("- " + voto.getAlumnoQueVota().getNombreCompleto());
            }

            System.out.println();
        }
    }

    public List<Voto> obtenerVotosRecibidos(Alumno alumno) {
        List<Voto> votosRecibidos = new ArrayList<>();

        for (Alumno votante : alumnos) {
            for (Voto voto : votante.getVotos()) {
                if (voto.getAlumnosVotados().contains(alumno)) {
                    votosRecibidos.add(voto);
                }
            }
        }

        return votosRecibidos;
    }

    public void realizarRecuentoVotos() {
        alumnos.sort((a1, a2) -> Integer.compare(a2.getCantidadVotos(), a1.getCantidadVotos()));
        List<Alumno> facilitadores = alumnos.subList(0, 5);
        List<Alumno> facilitadoresSuplentes = alumnos.subList(5, 10);

        System.out.println("Facilitadores elegidos:");
        for (int i = 0; i < facilitadores.size(); i++) {
            System.out.println((i + 1) + ". " + facilitadores.get(i).getNombreCompleto());
        }

        System.out.println("Facilitadores suplentes:");
        for (int i = 0; i < facilitadoresSuplentes.size(); i++) {
            System.out.println((i + 1) + ". " + facilitadoresSuplentes.get(i).getNombreCompleto());
        }
    }
}