package mascotapp;
import java.util.Scanner;
import mascotapp.Entidades.Mascota;
/**
 *
 * @author cronossar1
 */
public class MascotAPP {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
       Mascota m1 = new Mascota("Chiquito", "Barrabas", "Perro");
       
       m1.setNombre("Carlitos");
       
        System.out.println(m1.toString());
       
    }
    
}
