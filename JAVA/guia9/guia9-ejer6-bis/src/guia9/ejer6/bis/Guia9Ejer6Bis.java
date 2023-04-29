
package guia9.ejer6.bis;

import Entidad.Curso;

public class Guia9Ejer6Bis {

    public static void main(String[] args) {
        Curso a1 = new Curso();
        
        a1.crearCurso();
        System.out.println("#################");
        System.out.println("La ganancia semanal de este curso sera de $: "+a1.calcularGananciaSemanal());
        
    }
    
}
