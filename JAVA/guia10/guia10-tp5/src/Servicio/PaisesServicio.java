package Servicio;
import Entidad.Paises;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Collections;

public class PaisesServicio {
    private Scanner read= new Scanner(System.in).useDelimiter("\n");
    
    public void crearPais(HashSet<Paises> paises) { 
        String sal="s"; 
        do {
            Paises aux= new Paises();
            System.out.println("Ingrese el nombre del País");
            aux.setNomb_pais(read.nextLine());
            System.out.println("Ingrese la cantidad de habitantes");
            aux.setCant_hab(read.nextInt());
            read.nextLine();
            paises.add(aux);
            
            System.out.println("Desea agregar otro País? (s/n)");
            sal=read.nextLine();
            
        } while (sal.equalsIgnoreCase("s"));
        
    }
    
    public void mostrarPaises(HashSet<Paises> paises) {
        for (Paises v: paises) {
             System.out.println(v.toString());
        }
    }
    public void mostrarPaises2(ArrayList<Paises> paises) {
        for (Paises v: paises) {
             System.out.println(v.toString());
        }
    }
    
    public ArrayList<Paises> ordenarAlfaXPais(HashSet<Paises> paises) {
        ArrayList<Paises>  listaPaises = new ArrayList(paises);
        listaPaises.sort(Comparadores.ordenarAlfaPaises);
        mostrarPaises2(listaPaises);
        return listaPaises;
    }
   
}
