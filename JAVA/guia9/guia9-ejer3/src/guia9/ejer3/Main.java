package guia9.ejer3;
import Servicio.ArregloService;

public class Main {

    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        ArregloService servicio = new ArregloService();

        servicio.inicializarA(arregloA);

        System.out.println("Arreglo A:");
        servicio.mostrar(arregloA);

        System.out.println("Arreglo A ordenado de mayor a menor:");
        servicio.ordenar(arregloA);
        servicio.mostrar(arregloA);

        servicio.inicializarB(arregloA, arregloB);

        System.out.println("Arreglo A:");
        servicio.mostrar(arregloA);

        System.out.println("Arreglo B:");
        servicio.mostrar(arregloB);
    }
}