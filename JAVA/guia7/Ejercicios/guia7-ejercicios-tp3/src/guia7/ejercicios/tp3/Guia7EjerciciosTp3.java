package guia7.ejercicios.tp3;

import guia7.ejercicios.tp3.Calculadora.Operacion;

/**
 *Crear una clase llamada Operacion que tenga como atributos privados
numero1 y numero2. A continuaci�n, se deben crear los siguientes
m�todospara sumar, restar, multiplicar y dividir (validar que no se
* haga por cero)
 * @author cronossar1
 */
public class Guia7EjerciciosTp3 {

    public static void main(String[] args) {
    //Cargando valores absolutos
    /*Operacion op1 = new Operacion(10, 5);
    System.out.println("Resultado de la suma: " + op1.sumar());
    System.out.println("Resultado de la resta: " + op1.restar());
    System.out.println("Resultado de la multiplicaci�n: " + op1.multiplicar());
    System.out.println("Resultado de la divisi�n: " + op1.dividir());*/
   
    //Pidiendo valores por teclado
    Operacion op2 = new Operacion();
    op2.crearOperacion();
    System.out.println("Resultado de la suma: " + op2.sumar());
    System.out.println("Resultado de la resta: " + op2.restar());
    System.out.println("Resultado de la multiplicaci�n: " + op2.multiplicar());
    System.out.println("Resultado de la divisi�n: " + op2.dividir());
}
}
