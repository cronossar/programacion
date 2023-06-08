
package entidades;

public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String raza, Integer edad) {
        super(nombre, raza, edad);
    }
    
 
    @Override
    public void hacerRuido(){
        System.out.println("Maullar");
    }    
}
