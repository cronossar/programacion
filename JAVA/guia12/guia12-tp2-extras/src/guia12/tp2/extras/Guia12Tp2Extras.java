
package guia12.tp2.extras;

import entidades.Edificio;
import entidades.EdificioDeOficina;
import entidades.Polideportivo;
import java.util.ArrayList;

public class Guia12Tp2Extras {

    public static void main(String[] args) {
        
        ArrayList<Edificio> edif = new ArrayList();
        
        Polideportivo p1 = new Polideportivo("IanBarney", "Techado", 120, 200, 12);
        Polideportivo p2 = new Polideportivo("SuperBowl", "Abierto", 230, 350, 22);
        
        EdificioDeOficina e1 = new EdificioDeOficina(4, 13, 5, 12.5, 25, 23);
        EdificioDeOficina e2 = new EdificioDeOficina(6, 15, 10, 20, 34, 12);
        
        edif.add(p1);
        edif.add(p2);
        edif.add(e1);
        edif.add(e2);
        
        for (Edificio edificio : edif) {
            System.out.println("La superficie es: "+edificio.calcularSuperficieConRetorno());
            System.out.println("El volumen es: "+edificio.calcularVolumenConRetorno());
            
        }
        int abierto=0;
        int cerrado=0;
        for (Edificio edificio : edif) {
            if (edificio instanceof Polideportivo) {
                Polideportivo poli = (Polideportivo) edificio;
                if (poli.getTipoInstalacion().equalsIgnoreCase("Abierto")) {
                abierto++;
            }else{
                cerrado++;    
                }
            }
        }
        System.out.println("La cantidad de Polideportivos Abierto es: "+abierto);
        System.out.println("La cantidad de Polideportivos Techados es: "+cerrado);
        
        for (Edificio oficina : edif) {
            if (oficina instanceof EdificioDeOficina) {
               EdificioDeOficina edifi = (EdificioDeOficina) oficina;
               edifi.cantPersonas();
            }
        }
    }
    
}
