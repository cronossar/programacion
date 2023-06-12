package guia12.tp3;

import entidad.Electrodomesticos;
import entidad.Lavadora;
import entidad.Televisor;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Guia12TP3 {

    public static void main(String[] args) {
        
        DecimalFormat formato1 = new DecimalFormat("#.00");
        //Electrodomesticos e1 = new Electrodomesticos();
        //Creamos el ArrayList con el objeto Electromesticos
        ArrayList<Electrodomesticos> electro = new ArrayList<Electrodomesticos>();
        //Instanciamos los objetos
        Lavadora l1 = new Lavadora(40, 1020.25, "negro", 'A', 68);
        Lavadora l2 = new Lavadora(50, 2500.30, "rojo", 'D', 78);
        Televisor t1 = new Televisor(60, false, 5000.45, "azul", 'B', 24);
        Televisor t2 = new Televisor(45, true, 3500.78, "gris", 'E', 13);
        //Guardamos los objetos en el ArrayList
        electro.add(l1);
        electro.add(l2);
        electro.add(t1);
        electro.add(t2);
        System.out.println("Creamos un ArrayList, cargamos cuatro productos");
        //Mostramos los objetos
        System.out.println("Mostramos los precios iniciales de cada producto");
        System.out.println("---------------------------------");
        for (Electrodomesticos electromostra : electro) {
            System.out.println(electromostra);
        }
        System.out.println("---------------------------------");
        System.out.println("Cada valor se modifica según: color, peso, carga, consumo,\n si tiene TDT y resolución de imagen");
        System.out.println("---------------------------------");
        System.out.println("Calculamos sus precios");
        
        double aux=0.0;
        
        for (Electrodomesticos electrodo : electro) {
           electrodo.precioFinal();
           aux += electrodo.getPrecio();
            System.out.println("El precio final es: "+formato1.format(aux));
            
        }
        System.out.println("---------------------------------");
        System.out.println("El costo final de todos los electrodomesticos es: "+formato1.format(aux));
      
        
        //l1.crearLavadora();
//        l1.precioFinal();
//        System.out.println("%%%%%%%%%%%%%%");
        
        
//        System.out.println("Cargue los datos del televisor");
//        //t1.crearTelevisor();
//        t1.precioFinal();

    }

}
