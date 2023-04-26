
package guia9.ejer2;

import Entidad.ParDeNumeros;
import Servicio.ParDeNumerosServicio;

public class Main {

    public static void main(String[] args) {
        ParDeNumerosServicio num = new ParDeNumerosServicio();
        ParDeNumeros n = new ParDeNumeros();
        
        num.mostrarValores(n);
        System.out.println("###############################");
        num.devolverMayor(n);
        System.out.println("###############################");
        num.calcularPotencia(n);
    }
    
}
