package guia7.ejercicios.tp3.Calculadora;

import java.util.Scanner;

public class Operacion {
    //atributos privados numero1 y numero2
    private int numero1;
    private int numero2;
    //Método constructor con todos los atributos pasados por parámetro.
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    //Método constructor sin los atributos pasados por parámetro
    public Operacion() {
        this.numero1 = 0;
        this.numero2 = 0;
    }
    //Métodos get y set.
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    //Método para crearOperacion(): que le pide al usuario los dos
    //números y los guarda en los atributos del objeto
    public void crearOperacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        this.numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        this.numero2 = scanner.nextInt();
    }
    //Método sumar(): calcular la suma de los números y devolver el
    //resultado al main
    public int sumar() {
        return this.numero1 + this.numero2;
    }
    //Método restar(): calcular la resta de los números y devolver el
    //resultado al main
    public int restar() {
        return this.numero1 - this.numero2;
    }
    /*Método multiplicar(): primero valida que no se haga una
    multiplicación por cero, si fuera a multiplicar por cero, el método
    devuelve 0 y se le informa al usuario el error. Si no, se hace la
    multiplicación y se devuelve el resultado al main*/
    public int multiplicar() {
        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("Error: multiplicación por cero");
            return 0;
        } else {
            return this.numero1 * this.numero2;
        }
    }
    /*Método dividir(): primero valida que no se haga una división por cero,
    si fuera a pasar una división por cero, el método devuelve 0 y se le
    informa al usuario el error se le informa al usuario. Si no, se hace la
    división y se devuelve el resultado al main.*/
    public int dividir() {
        if (this.numero2 == 0) {
            System.out.println("Error: división por cero");
            return 0;
        } else {
            return this.numero1 / this.numero2;
        }
    }
}