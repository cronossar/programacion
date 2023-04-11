package guia7.ejercicios.tp1.Libro;

import java.util.Scanner;

public class Libro {
    
    private String isbn;
    private String titulo;
    private String autor;
    private int numPaginas;
    
    public Libro() {
        this.isbn = "";
        this.titulo = "";
        this.autor = "";
        this.numPaginas = 0;
    }
    //Constructor por parametros
    public Libro(String isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    //Metodo para cargar los datos
    public void cargarLibro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ISBN del libro: ");
        this.isbn = scanner.nextLine();
        System.out.print("Ingrese el título del libro: ");
        this.titulo = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        this.autor = scanner.nextLine();
        System.out.print("Ingrese el número de páginas del libro: ");
        this.numPaginas = scanner.nextInt();
    }
    //Metodo para mostrar datos
    public void informarDatos() {
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numPaginas);
    }
}