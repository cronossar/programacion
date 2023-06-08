
package entidades;

public class Animal {
    
    protected String nombre;
    protected String raza;
    protected Integer edad;
    

    public Animal() {
    }

    public Animal(String nombre, String raza, Integer edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    
    public void hacerRuido(){
        System.out.println("Hola");
    } 
    
}
