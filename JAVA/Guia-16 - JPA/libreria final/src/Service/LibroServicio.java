
package Service;

import static java.rmi.server.ObjID.read;
import java.util.Locale;
import java.util.Scanner;
import jpalibreria.Entidades.Autor;
import jpalibreria.Entidades.Editorial;
import jpalibreria.Entidades.Libro;
import jpalibreria.Servicio.AutorDAO;
import jpalibreria.Servicio.EditorialDAO;
import jpalibreria.Servicio.LibroDAO;


public class LibroServicio {
 
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    
    public void CrearLibros() {
        LibroDAO lib= new LibroDAO();
        try {
         
           
              Libro l = new Libro();
//            Autor a= new Autor(1, "Rodrigo", true);
//            Editorial e = new Editorial(1, "La montaña", true);
            
            
            System.out.println("Titulo");
            l.setTitulo(leer.nextLine());
            System.out.println("Año de salida");
            l.setAnio(leer.nextInt());
            System.out.println("Cantidad de ejemplares");
            int e=leer.nextInt();
            l.setEjemplares(e);
            System.out.println("Ejemplares Prestados");
            int p=leer.nextInt();
            l.setEjemplaresPrestados(p);
             int r= e-p;
            l.setEjemplaresRestantes(r);
            l.setAlta(true);
            l.setAutor(null);
            l.setEditorial(null);
            lib.guardar(l);
            
        } catch (Exception e) {
            System.out.println("error:"+ e.toString());
        }  
       
     
    }
         public void CrearAutor() {
        AutorDAO autor= new AutorDAO();
        try {
         
           
              Autor au = new Autor();
//            Autor a= new Autor(1, "Rodrigo", true);
//            Editorial e = new Editorial(1, "La montaña", true);
            
            
            System.out.println("Nombre");
            au.setNombre(leer.nextLine());
            
            au.setAlta(true);
            
            autor.guardar(au);
            
        } catch (Exception e) {
            System.out.println("error:"+ e.toString());
        }  
       
         } 
         
        public void CrearEditorial() {
        EditorialDAO ed= new EditorialDAO();
       
        try {
         
           
              Editorial edit = new Editorial();
//            Autor a= new Autor(1, "Rodrigo", true);
//            Editorial e = new Editorial(1, "La montaña", true);
            
            
            System.out.println("Nombre");
            edit.setNombre(leer.nextLine());
            
            edit.setAlta(true);
            
            ed.guardar(edit);
            
        } catch (Exception e) {
            System.out.println("error:"+ e.toString());
        }  
        
        
        
        
        
        
        
    }
    
    
}
