/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g12_ej1;

import entidad.Animal;
import entidad.Caballo;
import entidad.Gato;
import entidad.Perro;

/**
 *
 * @author user
 */
public class G12_Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro= new Perro("Pipo", "Carne", 1, "Caniche");
        perro.Alimentarse();
        
        Animal gato= new Gato("Michi","Croqueta", 3, "Baldi");
        gato.Alimentarse();
        
        Animal caballo= new Caballo("Willy","pasto" , 3, "pura");
        caballo.Alimentarse();
    }
    
}
