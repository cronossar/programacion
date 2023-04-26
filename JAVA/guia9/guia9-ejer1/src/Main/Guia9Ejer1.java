package Main;

import Entidad.Cadena;
import Servicios.CadenaServicio;

public class Guia9Ejer1 {

    public static void main(String[] args) {

        CadenaServicio f1 = new CadenaServicio();

        Cadena c1 = new Cadena();

        f1.crearFrase(c1);
        f1.mostrarVocales(c1);
        System.out.println("------------------------");
        f1.invertirFrase(c1);
        System.out.println("------------------------");
        f1.vecesRepetido(c1);
        System.out.println("------------------------");
        f1.compararLongitud(c1);
        System.out.println("------------------------");
        f1.unirFrases(c1);
        System.out.println("------------------------");
        f1.reemplazar(c1);
        System.out.println("------------------------");
        System.out.println("La frase contiene la letra que ingresaste " + f1.contiene(c1));
    }
}
