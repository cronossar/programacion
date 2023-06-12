
package guia12.tp4;

import entidades.Circulo;
import entidades.Rectangulo;

public class Guia12Tp4 {

    public static void main(String[] args) {
        
        Circulo c1 = new Circulo(5.0);
        System.out.println("Area del circulo: " + c1.calcularArea());
        System.out.println("Perimetro del circulo: " + c1.calcularPerimetro());

        Rectangulo r1 = new Rectangulo(4.0, 6.0);
        System.out.println("Area del rectangulo: " + r1.calcularArea());
        System.out.println("Perimetro del rectangulo: " + r1.calcularPerimetro());
    }
}