
package guia12.alaobra1;

import entidades.Animal;
import entidades.Gato;
import entidades.Perro;
import java.util.ArrayList;

public class Guia12AlaObra1 {

    public static void main(String[] args) {
        
        
        
        Animal a = new Animal("Lompeporton", "Bullterrier", 5);
        Animal b = new Gato("Locomia", "Persa", 2);
        Animal c = new Perro("Cartucho", "Salchicha", 12);
        
        ArrayList<Animal> Animales = new ArrayList<>();
        Animales.add(a);
        Animales.add(b);
        Animales.add(c);
        
        for (Animal Anima : Animales) {
         Anima.hacerRuido();
     
        }
    }
    
}
