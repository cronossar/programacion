/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar
 */
package guia3.extras.tp2;
/**
 * @author Daniel Buiak Branchesi
 */
import java.util.Scanner;
public class Guia3ExtrasTp2 {

    public static void main(String[] args) {
        int a=120;
        int b=230;
        int c=321;
        int d=654;
        int aux=0;
        System.out.println("A: "+a+ "|"+"B: "+b+ "|"+"C: "+c+ "|"+"D: "+d+ "|");
        aux=b;
        b=c;
        c=a;
        a=d;
        d=aux;
        System.out.println("---------------------------");
        System.out.println("A: "+a+ "|"+"B: "+b+ "|"+"C: "+c+ "|"+"D: "+d+ "|");
    }
    
}
