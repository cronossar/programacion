package guia7.ejercicios.tp4;

import guia7.ejercicios.tp4.Rectangulos.Rectangulo;

/**
 *Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 * @author cronossar1
 */
public class Guia7EjerciciosTp4 {

    public static void main(String[] args) {
        //Se cargan valores absolutos a base y altura
        /*Rectangulo rectangulo1 = new Rectangulo(5, 3);
        System.out.println("Superficie: " + rectangulo1.calcularSuperficie());
        System.out.println("Perímetro: " + rectangulo1.calcularPerimetro());
        rectangulo1.dibujarRectangulo();*/
        //Se pide base y altura por teclado
        Rectangulo rectangulo2 = new Rectangulo();
        rectangulo2.crearRectangulo();
        System.out.println("Superficie: " + rectangulo2.calcularSuperficie());
        System.out.println("Perímetro: " + rectangulo2.calcularPerimetro());
        rectangulo2.dibujarRectangulo();
    }
}
