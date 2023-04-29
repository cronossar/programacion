
package Entidad;

import java.util.Scanner;

public class Curso {
    
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumnos = new String[5];

    public Curso() {
        // Constructor por defecto
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    // Métodos getters y setters
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    // Método para cargar los nombres de los alumnos
    public void cargarAlumnos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los nombres de los 5 alumnos:");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("Alumno " + (i+1) + ": ");
            alumnos[i] = sc.nextLine();
        }
    }

    // Método para crear un curso
    public void crearCurso() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del curso: ");
        nombreCurso = sc.nextLine();
        System.out.print("Ingrese la cantidad de horas por día: ");
        cantidadHorasPorDia = sc.nextInt();
        System.out.print("Ingrese la cantidad de días por semana: ");
        cantidadDiasPorSemana = sc.nextInt();
        System.out.print("Ingrese el turno (mañana o tarde): ");
        turno = sc.next();
        System.out.print("Ingrese el precio por hora: ");
        precioPorHora = sc.nextDouble();

        // Cargamos los nombres de los alumnos
        cargarAlumnos();
    }

    // Método para calcular la ganancia semanal
    public double calcularGananciaSemanal() {
        double gananciaSemanal = cantidadHorasPorDia * precioPorHora * cantidadDiasPorSemana * alumnos.length;
        return gananciaSemanal;
    }
}

