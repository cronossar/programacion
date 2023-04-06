package guia7.ejercicios.tp4;

import guia7.ejercicios.tp4.Rectangulos.Rectangulo;

/**
 *Crear una clase Rect�ngulo que modele rect�ngulos por medio de un
atributo privado base y un atributo privado altura. La clase incluir� un
m�todo para crear el rect�ngulo con los datos del Rect�ngulo dados por
el usuario. Tambi�n incluir� un m�todo para calcular la superficie del
rect�ngulo y un m�todo para calcular el per�metro del rect�ngulo. Por
�ltimo, tendremos un m�todo que dibujar� el rect�ngulo mediante
asteriscos usando la base y la altura. Se deber�n adem�s definir los
m�todos getters, setters y constructores correspondientes.
Superficie = base * altura / Per�metro = (base + altura) * 2.
 * @author cronossar1
 */
public class Guia7EjerciciosTp4 {

    public static void main(String[] args) {
        //Se cargan valores absolutos a base y altura
        /*Rectangulo rectangulo1 = new Rectangulo(5, 3);
        System.out.println("Superficie: " + rectangulo1.calcularSuperficie());
        System.out.println("Per�metro: " + rectangulo1.calcularPerimetro());
        rectangulo1.dibujarRectangulo();*/
        //Se pide base y altura por teclado
        Rectangulo rectangulo2 = new Rectangulo();
        rectangulo2.crearRectangulo();
        System.out.println("Superficie: " + rectangulo2.calcularSuperficie());
        System.out.println("Per�metro: " + rectangulo2.calcularPerimetro());
        rectangulo2.dibujarRectangulo();
    }
}
