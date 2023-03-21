/*Una obra social tiene tres clases de socios:
? Los socios tipo ?A? abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
? Los socios tipo ?B? abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
? Los socios que menos aportan, los de tipo ?C?, no reciben
descuentos sobre dichos tratamientos.
? Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio
 */
package guia3.extras.tp6;
import java.util.Scanner;
/**
 * @author Daniel Buiak Branchesi
 */
public class Guia3ExtrasTp6 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in, "ISO8859-1");
       
        Double costo=0.0;
        Double desc_a=0.50;
        Double desc_b=0.35;
        Double tot=0.0;
        
        int menu=0;
        
        while (menu !=4){
            System.out.println("OBRA SOCIAL");
            System.out.println("CALCULO DE PRESTACIONES");
            System.out.println("Elija una opción");
            System.out.println("1 - SOCIO TIPO A");
            System.out.println("2 - SOCIO TIPO B");
            System.out.println("3 - SOCIO TIPO C");
            System.out.println("4 - Salir del programa");
            menu=teclado.nextInt();
           
            
        switch(menu){
            case 1 -> {
                System.out.println("Ingrese el valor total de la prestación");
                costo=teclado.nextDouble();
                tot=costo-(costo*desc_a);
                System.out.println("-----------------------------");
                System.out.println("El costo total de la prestación es: "+" $ "+costo);
                System.out.println("Aplicado el descuento del 50%, deberá abonar en caja: "+" $ "+tot);
                System.out.println("-----------------------------");
                }
            case 2 -> {
                System.out.println("Ingrese el valor total de la prestación");
                costo=teclado.nextDouble();
                tot=costo-(costo*desc_b);
                System.out.println("-----------------------------");
                System.out.println("El costo total de la prestación es: "+" $ "+costo);
                System.out.println("Aplicado el descuento del 35%, deberá abonar en caja: "+" $ "+tot);
                System.out.println("-----------------------------");
                }
            case 3 -> {
                System.out.println("Ingrese el valor total de la prestación");
                costo=teclado.nextDouble();
                System.out.println("-----------------------------");
                System.out.println("Su categoría no dispone descuento, deberá abonar en caja: "+" $ "+costo);
                System.out.println("-----------------------------");
                }
            case 4 -> {
                System.out.print("Desea salir del programa? S/N: ");
                String salir = teclado.next();
                    if (salir.toUpperCase().equals("S")) {
                    } else if (salir.toUpperCase().equals("N")) {
                        menu=0;
                    } else {
                        menu=0;
                    }
                }
             default -> {
                }
            
        }
            
        }
        }
        
        
    }
    

