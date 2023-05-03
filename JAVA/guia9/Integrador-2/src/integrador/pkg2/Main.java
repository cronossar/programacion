package integrador.pkg2;

import entidad.Estudiante;
import servicio.Promedio;

public class Main {

    public static void main(String[] args) {
        Promedio p1 = new Promedio();
        
        double prom = p1.promedio();//llama al metodo que calcula el promedio
        
        System.out.println("##########");
        System.out.println("Promedio de notas de todo el curso es: " + prom);
        System.out.println("##########");
        p1.obtenerNombresNotasMayoresAlPromedio();

    }

}
