package gui3.teoria.tp7;
import java.util.Scanner;
/**
 * @author cronossar1
 */
public class Gui3TeoriaTp7 {

    public static void main(String[] args) {
        int tipomotor;
        System.out.println("Seleccione una opción para tipo de bomba");
        Scanner teclado=new Scanner(System.in, "ISO8859-1");
        tipomotor=teclado.nextInt();
         
        switch(tipomotor){
        
        case 1:
                System.out.println("La bomba es una bomba de agua.");
                break;
        case 2:
                System.out.println("La bomba es una bomba de gasolina.");
                break;
        case 3:
                System.out.println("La bomba es una bomba de hormigón.");
                break;
        case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia.");
                break;
        default:
                System.out.println("No existe un valor valido para tipo de bomba.");
                break;
        
      
    }
    }
    
}
