
package entidades;

public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad) {
        super(nombre, raza, edad);
    }

    
    @Override
    public void hacerRuido(){
        System.out.println("Ladrar");
    }    
}

