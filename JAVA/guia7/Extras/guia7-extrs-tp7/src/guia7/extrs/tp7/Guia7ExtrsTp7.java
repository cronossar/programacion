package guia7.extrs.tp7;

import java.util.Scanner;
import guia7.extrs.tp7.Empleado.Empleado;

/**
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
 * "salario". Luego, crea un m�todo "calcular_aumento" que calcule el aumento
 * salarial de un empleado en funci�n de su edad y salario actual. El aumento
 * salarial debe ser del 10% si el empleado tiene m�s de 30 a�os o del 5% si
 * tiene menos de 30 a�os.
 *
 * @author cronossar1
 */
public class Guia7ExtrsTp7 {

    public static void main(String[] args) {

        Empleado emp1 = new Empleado("Juan", 35, 1000.0);
        emp1.calcular_aumento();
    }
}


    

