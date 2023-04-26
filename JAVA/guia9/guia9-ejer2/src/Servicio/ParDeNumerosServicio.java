package Servicio;

import Entidad.ParDeNumeros;
import java.util.Scanner;

public class ParDeNumerosServicio {

    private Scanner scan;

    public ParDeNumerosServicio() {
        this.scan = new Scanner(System.in);
    }

    public void mostrarValores(ParDeNumeros nx) {
        System.out.println("El primer valor numerico es: " + nx.getNum1());
        System.out.println("El segundo valor numerico es: " + nx.getNum2());
    }

    public void devolverMayor(ParDeNumeros nx) {
        if (nx.getNum1() > nx.getNum2()) {
            System.out.println("Es mayor el primer valor numerico: " + nx.getNum1());
        } else {
            System.out.println("Es mayor el segundo valor numerico: " + nx.getNum2());
        }
    }

    public void calcularPotencia(ParDeNumeros nx) {
        double n1 = Math.round(nx.getNum1());
        double n2 = Math.round(nx.getNum2());
        System.out.println("Primer valor: " + n1 + " | " + "Segundo valor: " + n2);
        System.out.println("---------------------");
        System.out.println("Calculo la potencia del mayor valor, elevado al numero menor");
        

    }

    public void calcularRaiz(ParDeNumeros nx) {

    }

}
