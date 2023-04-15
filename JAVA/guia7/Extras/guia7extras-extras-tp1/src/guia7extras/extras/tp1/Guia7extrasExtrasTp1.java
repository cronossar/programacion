package guia7extras.extras.tp1;
import Fracciones.Fraccion;
import java.util.Scanner;
/**
 *Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 * @author cronossar1
 */
public class Guia7extrasExtrasTp1 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        int op;

        Fraccion fraccion1 = new Fraccion();

        fraccion1.cargarFraccion();
        
        do {
        System.out.println("Qué desea ver?");
        System.out.println("1- SUMA");
        System.out.println("2- RESTA");
        System.out.println("3- MULTIPLICAR");
        System.out.println("4- DIVIDIR");
        System.out.println("5- SALIR");
        op = leer.nextInt();

        switch (op) {
            case 1:
                fraccion1.sumar();
                break;
            case 2:
                fraccion1.restar();
                break;
            case 3:
                fraccion1.multiplicar();
                break;
            case 4:
                fraccion1.dividir();
                break;
            case 5:
                System.out.println("SALISTE");
                break;
            default:
                System.out.println("Opción incorrecta.");
        }
    } while (op != 5);    

    }
}  
    
    

