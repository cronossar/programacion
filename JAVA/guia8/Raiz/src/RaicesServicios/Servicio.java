
package RaicesServicios;

import Entidad.Entidad;

public class Servicio {
    private Entidad raices;

    public Servicio(Entidad raices) {
        this.raices = raices;
    }

    public double getDiscriminante() {
        return Math.pow(raices.getB(), 2) - 4 * raices.getA() * raices.getC();
    }

    public boolean tieneRaices() {
        return getDiscriminante() >= 0;
    }

    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    public void obtenerRaices() {
        if (tieneRaices()) {
            double x1 = (-raices.getB() + Math.sqrt(getDiscriminante())) / (2 * raices.getA());
            double x2 = (-raices.getB() - Math.sqrt(getDiscriminante())) / (2 * raices.getA());
            System.out.println("Las raices de la ecuación son: " + x1 + " y " + x2);
        } else {
            System.out.println("La ecuación no tiene raices reales.");
        }
    }

    public void obtenerRaiz() {
        if (tieneRaiz()) {
            double x = -raices.getB() / (2 * raices.getA());
            System.out.println("La única raiz de la ecuación es: " + x);
        } else {
            System.out.println("La ecuación no tiene una única raiz real.");
        }
    }

    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }
}

