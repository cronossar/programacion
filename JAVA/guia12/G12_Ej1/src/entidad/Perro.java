package entidad;


public class Perro extends Animal{
    
    
    
    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void Alimentarse() {
        System.out.println(getNombre()+" se alimenta de "+getAlimento()); 
    }
  
    
}
