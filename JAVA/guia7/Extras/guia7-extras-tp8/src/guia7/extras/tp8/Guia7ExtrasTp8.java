package guia7.extras.tp8;
import guia7.extras.tp8.Cuadrilatero.Rectangulo;
/**
 *Crea una clase "Rect�ngulo" que tenga atributos "lado1" y "lado2" y un
m�todo "calcular_area" que calcule y devuelva el �rea del rect�ngulo.
Luego crea un objeto "rectangulo1" de la clase "Rect�ngulo" con lados
de 4 y 6 y imprime el �rea del rect�ngulo.
 * @author cronossar1
 */
public class Guia7ExtrasTp8 {
    public static void main(String[] args) {
        
        Rectangulo r1 = new Rectangulo(4 ,6);
        
        System.out.println(r1.toString());
        System.out.println("-----------------");
        System.out.println("El area del rectangulo es: "+r1.calcularArea());
        
        
    }
    
}
