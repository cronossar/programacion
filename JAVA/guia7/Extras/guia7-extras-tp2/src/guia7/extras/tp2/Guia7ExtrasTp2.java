package guia7.extras.tp2;

import guia7.extras.tp2.Geometria.Punto;

/**
 * Definir una clase llamada Puntos que contendr� las coordenadas de dos puntos,
 * sus atributos ser�n, x1, y1, x2, y2, siendo cada x e y un punto. Generar un
 * objeto puntos usando un m�todo crearPuntos() que le pide al usuario los dos
 * n�meros y los ingresa en los atributos del objeto. Despu�s, a trav�s de otro
 * m�todo calcular y devolver la distancia que existe entre los dos puntos que
 * existen en la clase Puntos. Para conocer como calcular la distancia entre dos
 * puntos consulte el siguiente link:
 * http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 *
 * @author cronossar1
 */
public class Guia7ExtrasTp2 {

    public static void main(String[] args) {

        Punto puntos = new Punto();
        
        puntos.crearPuntos();
        double distancia = puntos.calcularDistancia();
        System.out.println("La distancia entre los dos puntos es: " + distancia);

    }

}
