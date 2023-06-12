
package guia12.tp1.extras;

import entidades.Alquiler;
import entidades.Barco;
import entidades.BarcoMotor;
import entidades.Velero;
import entidades.YateLujo;
import java.time.LocalDate;

public class Guia12Tp1Extras {

    public static void main(String[] args) {
       
        LocalDate fechaAlquiler = LocalDate.of(2023, 6, 1);
        LocalDate fechaDevolucion = LocalDate.of(2023, 6, 10);

        Barco barco = new Barco("ABC123", 10.5, 2010);
        Alquiler alquiler1 = new Alquiler("Juan Perez", "123456789", fechaAlquiler, fechaDevolucion, 1, barco);
        System.out.println("Precio de alquiler del barco: " + alquiler1.calcularPrecioAlquiler());

        Velero velero = new Velero("DEF456", 15.2, 2008, 3);
        Alquiler alquiler2 = new Alquiler("Maria Lopez", "987654321", fechaAlquiler, fechaDevolucion, 2, velero);
        System.out.println("Precio de alquiler del velero: " + alquiler2.calcularPrecioAlquiler());

        BarcoMotor barcoMotor = new BarcoMotor("GHI789", 12.8, 2015, 250);
        Alquiler alquiler3 = new Alquiler("Pedro Ramirez", "456789123", fechaAlquiler, fechaDevolucion, 3, barcoMotor);
        System.out.println("Precio de alquiler del barco a motor: " + alquiler3.calcularPrecioAlquiler());

        YateLujo yateLujo = new YateLujo("JKL012", 20.0, 2019, 500, 4);
        Alquiler alquiler4 = new Alquiler("Laura Torres", "789123456", fechaAlquiler, fechaDevolucion, 4, yateLujo);
        System.out.println("Precio de alquiler del yate de lujo: " + alquiler4.calcularPrecioAlquiler());
    }
}
////En este ejemplo, creamos las clases Barco, Velero, BarcoMotor y YateLujo, que heredan
//de la clase base Barco. Cada clase tiene sus propios atributos y métodos, y se sobrescribe
//el método calcularModulo() en las clases derivadas para ajustar el cálculo según el tipo de
//barco.
////
////Luego, creamos la clase Alquiler que contiene la información del alquiler, incluyendo
//el barco que se alquila. El método calcularPrecioAlquiler() calcula el precio multiplicando
//los días de ocupación por el módulo del barco correspondiente.
////
////En el método main, creamos instancias de diferentes tipos de barcos y las pasamos a
//objetos Alquiler para calcular el precio de alquiler correspondiente. Los resultados se
//imprimen en la consola.






