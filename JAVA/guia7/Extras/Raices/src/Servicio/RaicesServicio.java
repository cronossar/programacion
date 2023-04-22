package Servicio;

import Entidad.Raices;
import java.util.Scanner;

public class RaicesServicio {
   
static Scanner entrada = new Scanner(System.in).useDelimiter("\n"); 
    /*
    M�todo getDiscriminante(): devuelve el valor del
    discriminante (double). El discriminante tiene la
    siguiente f�rmula: (b^2)-4*a*c
    */
    public static double Discriminante(Raices obj){
        System.out.println("Ingrese el valor de a: ");
          obj.setA(entrada.nextInt());
          System.out.println("Ingrese el valor de b: ");
          obj.setB(entrada.nextInt());
          System.out.println("Ingrese el valor de c: ");
          obj.setC(entrada.nextInt());
        return (Math.pow(obj.getB(), 2)) -4 * obj.getA()*obj.getC();
    }
    /*
    M�todo tieneRaices(): devuelve un booleano indicando
    si tiene dos soluciones, para que esto ocurra, el
    discriminante debe ser mayor o igual que 0.
    */   
    public static boolean tieneRaices(Raices obj){
        double dato = Servicio.Discriminante(obj);
        if (dato >= 0) {
            return true;
        }else{
        return false;
    }
    }
    /*
    M�todo tieneRaiz(): devuelve un booleano indicando si tiene 
    una �nica soluci�n, para que esto ocurra, el discriminante 
    debe ser igual que 0.
    */
        
public static boolean tieneRaiz(Raices obj){
    double dato = Servicio.Discriminante(obj);
    if (dato == 0) {
       return true; 
}else{
        return false;
    }
}
/*
metodo llama tieneraces
*/
public static void obtenerRaices(Raices obj){
    boolean bandera = Servicio.tieneRaices(obj);
    double positivo;
    double negativo;
    if (bandera) {
        System.out.println("Tiene dos raices;");
        /*
        return false;
        */
        positivo = (-obj.getB()) + Math.sqrt(Servicio.Discriminante(obj)) / 2*obj.getA();
        System.out.println("Positivo: "+positivo);
         negativo = (-obj.getB()) - Math.sqrt(Servicio.Discriminante(obj)) / 2*obj.getA();
         System.out.println("Negativo: "+negativo);
    }
 
   /*
    M�todo calcular(): este? m�todo llamara? tieneRaices() 
    y a tieneRai?z(), y mostrara? por pantalla las posibles
    soluciones que tiene nuestra ecuaci�n con los m�todos 
    obtenerRaices() o obtenerRaiz(), seg�n lo que devuelvan
    nuestros m�todos y en caso de no existir soluci�n, 
    se mostrara? un mensaje.
    */
    
}
public static void calcular(Raices obj){
    if (Servicio.tieneRaices(obj)) {
      Servicio.obtenerRaices(obj);
    }else{
        Servicio.tieneRaiz(obj);
    }
}
}