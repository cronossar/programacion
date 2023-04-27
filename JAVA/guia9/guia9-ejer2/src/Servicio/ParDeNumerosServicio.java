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
        System.out.println("Calculo de la potencia del mayor valor, elevado al numero menor");
        System.out.println("---------------------");
        if (n1 > n2) {
          double pot = Math.pow(n1, n2);
            System.out.println("N1 es mayor, entonces la potencia queda: "+pot);
        }else{
          double pot = Math.pow(n2, n1);
          System.out.println("N2 es mayor, entonces la potencia queda: "+pot);
        }
    }

    public void calcularRaiz(ParDeNumeros nx) {
        double abs1 = Math.round(nx.getNum1());
        double abs2 = Math.round(nx.getNum2());
        
        Math.abs(abs1);
        Math.abs(abs1);
        System.out.println("Calculo de la raiz cuadrada del mayor valor");
        System.out.println("------------------------");
        System.out.println("Primer valor: "+abs1);
        System.out.println("Segundo valor: "+abs2);
        System.out.println("------------------------");
        if (abs1 > abs2) {
            System.out.println("El primer numero es mayor y su raiz cuadrada es: "+Math.sqrt(abs1));
        }else{
            System.out.println("El segundo numero es mayor y su raiz cuadrada es: "+Math.sqrt(abs2));
        }
       
       
    }

}
