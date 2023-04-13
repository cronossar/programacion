package guia7.ejercicios.tp2;

import guia7.ejercicios.tp2.Circunferencia.Circunferencia;

/**
 *Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuaci�n, se deben crear los
siguientes m�todos:
a) M�todo constructor que inicialice el radio pasado como par�metro.
b) M�todos get y set para el atributo radio de la clase Circunferencia.
c) M�todo para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) M�todo area(): para calcular el �rea de la circunferencia (Area=?
?*radio?^2).
e) M�todo perimetro(): para calcular el per�metro
(Perimetro=2*?*radio).
* 
 * @author cronossar1
 */
public class Guia7EjerciciosTp2 {

    public static void main(String[] args) {
    //Calcular ingresando el radio    
    /*Circunferencia c1 = new Circunferencia(5.0);
    System.out.println("�rea de la circunferencia c1: " + c1.area());
    System.out.println("Per�metro de la circunferencia c1: " + c1.perimetro());*/
    
    //Calcular pidiendo el radio por teclado
    //Se copian estas lineas con variables nuevas como tantos calculos se desean
    Circunferencia c2 = new Circunferencia(0.0);
    c2.crearCircunferencia();
    System.out.println("�rea de la circunferencia c2: " + c2.area());
    System.out.println("Per�metro de la circunferencia c2: " + c2.perimetro());
    System.out.println("----------------------------");
    
        
    Circunferencia c3 = new Circunferencia(0.0);
    c3.crearCircunferencia();
    System.out.println("�rea de la circunferencia c3: " + c3.area());
    System.out.println("Per�metro de la circunferencia c3: " + c3.perimetro());
}
    }
    

