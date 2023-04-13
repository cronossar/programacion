package guia7.ejercicios.tp2.bis;
import guia7.ejercicios.tp2.bis.Circunferencia.Circunferencia;
/**
 *
 * @author cronossar1
 */
public class Guia7EjerciciosTp2Bis {

    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia();
        Circunferencia c2 = new Circunferencia();
        c1.crearCircunferencia();
        System.out.println("Con radio "+c1.getRadio()+":");
        c1.area();
        c1.perimetro();
          System.out.println("------------------------------------");
        c2.setRadio(2);
        System.out.println("Con radio=2 es:");
        c2.area();
        c2.perimetro();
    }

}
    
  
