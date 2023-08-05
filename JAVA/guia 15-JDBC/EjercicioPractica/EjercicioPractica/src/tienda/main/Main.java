
package tienda.main;

import tienda.servicios.FabricanteServicio;

public class Main {
    public static void main(String[] args) {
        
        FabricanteServicio FS = new FabricanteServicio();
        
        FS.mostrarFabricantes();
        FS.modificarFabricante();
        
//        FS.agregarFabricante();
//        FS.mostrarFabricantes();
        
        
    }
}
