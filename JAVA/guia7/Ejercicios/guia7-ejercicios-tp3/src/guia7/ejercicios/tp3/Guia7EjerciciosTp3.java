package guia7.ejercicios.tp3;

import guia7.ejercicios.tp3.Calculadora.Operacion;

/**
 *Crear una clase llamada Operacion que tenga como atributos privados
numero1 y numero2. A continuación, se deben crear los siguientes
métodospara sumar, restar, multiplicar y dividir (validar que no se
* haga por cero)
 * @author cronossar1
 */
public class Guia7EjerciciosTp3 {

    public static void main(String[] args) {
    //Cargando valores absolutos
    /*Operacion op1 = new Operacion(10, 5);
    System.out.println("Resultado de la suma: " + op1.sumar());
    System.out.println("Resultado de la resta: " + op1.restar());
    System.out.println("Resultado de la multiplicación: " + op1.multiplicar());
    System.out.println("Resultado de la división: " + op1.dividir());*/
   
    //Pidiendo valores por teclado
    Operacion op2 = new Operacion();
    op2.crearOperacion();
    System.out.println("Resultado de la suma: " + op2.sumar());
    System.out.println("Resultado de la resta: " + op2.restar());
    System.out.println("Resultado de la multiplicación: " + op2.multiplicar());
    System.out.println("Resultado de la división: " + op2.dividir());
}
}
