package guia7.ejercicios.tp1;

import guia7.ejercicios.tp1.Libro.Libro;

/**
 * Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, T�tulo, Autor, N�mero de p�ginas, y un constructor con todos los
atributos pasados por par�metro y un constructor vac�o. Crear un
m�todo para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro m�todo el n�mero de ISBN, el t�tulo, el autor del
libro y el n�mero de p�ginas
 * @author Daniel Buiak Branchesi
 */
public class Guia7EjerciciosTp1 {

    public static void main(String[] args) {
        
        
        Libro libro1 = new Libro();
    libro1.cargarLibro();
    libro1.informarDatos();
    
    
}
}