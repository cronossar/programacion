package guia7.ejercicios.tp3.Calculadora;

import java.util.Scanner;

public class Operacion {
    //atributos privados numero1 y numero2
    private int numero1;
    private int numero2;
    //M�todo constructor con todos los atributos pasados por par�metro.
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    //M�todo constructor sin los atributos pasados por par�metro
    public Operacion() {
        this.numero1 = 0;
        this.numero2 = 0;
    }
    //M�todos get y set.
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
    //M�todo para crearOperacion(): que le pide al usuario los dos
    //n�meros y los guarda en los atributos del objeto
    public void crearOperacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer n�mero: ");
        this.numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo n�mero: ");
        this.numero2 = scanner.nextInt();
    }
    //M�todo sumar(): calcular la suma de los n�meros y devolver el
    //resultado al main
    public int sumar() {
        return this.numero1 + this.numero2;
    }
    //M�todo restar(): calcular la resta de los n�meros y devolver el
    //resultado al main
    public int restar() {
        return this.numero1 - this.numero2;
    }
    /*M�todo multiplicar(): primero valida que no se haga una
    multiplicaci�n por cero, si fuera a multiplicar por cero, el m�todo
    devuelve 0 y se le informa al usuario el error. Si no, se hace la
    multiplicaci�n y se devuelve el resultado al main*/
    public int multiplicar() {
        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("Error: multiplicaci�n por cero");
            return 0;
        } else {
            return this.numero1 * this.numero2;
        }
    }
    /*M�todo dividir(): primero valida que no se haga una divisi�n por cero,
    si fuera a pasar una divisi�n por cero, el m�todo devuelve 0 y se le
    informa al usuario el error se le informa al usuario. Si no, se hace la
    divisi�n y se devuelve el resultado al main.*/
    public int dividir() {
        if (this.numero2 == 0) {
            System.out.println("Error: divisi�n por cero");
            return 0;
        } else {
            return this.numero1 / this.numero2;
        }
    }
}