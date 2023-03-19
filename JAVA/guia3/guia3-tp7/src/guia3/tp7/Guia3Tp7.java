/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package guia3.tp7;
/**
 * @author cronossar1
 */
import java.util.Scanner;
public class Guia3Tp7 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String fde = "&&&&&";
        System.out.println("Bienvenido al sistema que emula un dispositivo RS232");
        System.out.print("Ingrese los comandos (letras) que desea probar: ");
        int correcta=0;
        int incorrecta=0;
        String valor = leer.next();
        valor=valor.toUpperCase();
                
        while (!valor.equals(fde)){
            if (valor.length()== 5 && valor.substring(0,1).equals("X") && valor.substring(4,5).equals("O")){
                correcta++;
            } else {
                incorrecta++;
            }
            valor = leer.next();
            valor=valor.toUpperCase();
        }
        System.out.println("COMANDOS CORRECTOS: "+correcta);
        System.out.println("COMANDOS INCORRECTOS: "+incorrecta);      
    }
    
}
