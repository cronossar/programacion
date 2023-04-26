
package Servicio;
import Entidad.Entidad;
import java.util.Scanner;

public class ServicioNif {
    
    Scanner leer = new Scanner(System.in);
    char[] LETRAS_NIF = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
   
        public Entidad crearNIF(){
        System.out.println("Ingrese su numero de DNI, sin puntos");
        int num = leer.nextInt();
        int posicion = (int) (num % 23);
        char letra = LETRAS_NIF[posicion];
        return new Entidad(num, letra);
    }
    
        public void mostrar(Entidad num) {
        System.out.println(num.toString());
}
}
