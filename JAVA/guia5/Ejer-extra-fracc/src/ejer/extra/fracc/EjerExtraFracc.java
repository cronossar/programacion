
package ejer.extra.fracc;

import Entidad.Fracciones;
import Servicio.FraccionesServicio;
import java.util.Scanner;

public class EjerExtraFracc {

    public static void main(String[] args) {
         FraccionesServicio fs= new FraccionesServicio();
        Scanner read= new Scanner(System.in);
        int cont, opcion;
        double num1, num2, de1, de2; 
        cont=1;
        System.out.println("Ingrese el numerador "+ cont);
        num1=(read.nextDouble());
        System.out.println("Ingrese el denominador "+ cont);
        de1=(read.nextDouble());
        cont ++;
        System.out.println("Ingrese el numerador "+ cont);
        num2=(read.nextDouble());
        System.out.println("Ingrese el denominador "+ cont);
        de2=(read.nextDouble());
        cont=0;
        
        Fracciones ej1 = fs.crearFraccion(num1, num2, de1, de2);
        do {
            System.out.println(" Menu ");
            System.out.println("1. Sumar");
            System.out.println("2. Resta");
            System.out.println("3. multi");
            System.out.println("4. div");
            System.out.println("5. salir");
            opcion=read.nextInt();
            switch (opcion) {
                case 1:
                    fs.sumaFrac(ej1);
                    break;
                case 2:
                    fs.restaFrac(ej1);
                    break;
                case 3:
                    fs.multiFrac(ej1);
                    break;
                case 4:
                    fs.divFrac(ej1);
                    break;
                default:
                    System.out.println("Si desea salir ingrese (1. Si/ 2.no)");
                    cont=read.nextInt();
                    break;
            }
        } while (cont != 1);
    }
}
