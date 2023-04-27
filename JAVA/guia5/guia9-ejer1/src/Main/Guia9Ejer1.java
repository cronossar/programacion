
package Main;

import Entidad.Cadena;
import Servicios.CadenaServicio;
import java.util.Scanner;

public class Guia9Ejer1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        CadenaServicio f1 = new CadenaServicio();
        
        Cadena c1 = new Cadena();
        
        f1.mostrarVocales(c1);
        System.out.println("------------------------");
        f1.invertirFrase(c1);
        System.out.println("------------------------");
        f1.vecesRepetido(c1);
        System.out.println("------------------------");
        f1.compararLongitud(c1);
        System.out.println("------------------------");
        f1.unirFrases(c1);
    }
    
}
