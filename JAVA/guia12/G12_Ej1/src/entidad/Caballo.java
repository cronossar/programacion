/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author user
 */
public class Caballo extends Animal{
    
    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
    public void Alimentarse() {
        System.out.println("El caballo se alimenta de "+getAlimento()); 
    }
}
