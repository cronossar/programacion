
package Servicio;

import Entidad.Fracciones;

public class FraccionesServicio {
     public Fracciones crearFraccion(double numerador1, double numerador2, double denominador1, double denominador2) {
        return new Fracciones(numerador1,numerador2,denominador1, denominador2);
    }
    
    public void sumaFrac(Fracciones obj) {
        double result;
        result=((obj.getNumerador1()*obj.getDenominador2()) + (obj.getDenominador1()*obj.getNumerador2()))/(obj.getDenominador1()*obj.getDenominador2());
        System.out.println("La suma es: "+ result);
   
    }
    
    public void restaFrac(Fracciones obj) {
        double result;
        result=((obj.getNumerador1()*obj.getDenominador2()) - (obj.getDenominador1()*obj.getNumerador2()))/(obj.getDenominador1()*obj.getDenominador2());
        System.out.println("La resta es: "+ result);
   
    }
    
    public void multiFrac(Fracciones obj) {
        double result;
        result=(obj.getNumerador1()*obj.getNumerador2())/ (obj.getDenominador1()*obj.getDenominador2());
        System.out.println("La multiplicación es: "+ result);
    }
    
    public void divFrac(Fracciones obj) {
        double result;
        result=(obj.getNumerador1()*obj.getDenominador2())/(obj.getDenominador1()*obj.getNumerador2());
        System.out.println("La divición es: "+ result);
    }
}


