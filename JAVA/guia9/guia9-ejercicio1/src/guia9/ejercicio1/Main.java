
package guia9.ejercicio1;

import Entidades.Cadena;
import servicios.CadenaServicio;

public class Main {

    public static void main(String[] args, String scanner) {
        CadenaServicio f1 = new CadenaServicio();
        
        Cadena cad1 = new Cadena();
        
        cad1.setFrase("la casa del fantasma");
        //String letra = "A"
        f1.mostrarVocales(cad1);
        System.out.println("--------------------");
        f1.invertirFrase(cad1);
        System.out.println("--------------------");
        //f1.compararLongitud(cad1, "Hombres de negro");
        System.out.println("--------------------");
        //f1.contiene(cad1, letra);
        System.out.println("--------------------");
        //f1.mostrarVocales(cad1);
        System.out.println("--------------------");
        //f1.reemplazar(cad1, letra, 0);
        System.out.println("--------------------");
        //f1.unirFrases(cad1, "hola quetal");
        System.out.println("--------------------");
        //f1.vecesRepetido(cad1, "A");
        
        
    }
    
}
