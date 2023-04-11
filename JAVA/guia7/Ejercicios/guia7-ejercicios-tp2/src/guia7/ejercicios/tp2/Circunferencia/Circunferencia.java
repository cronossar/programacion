package guia7.ejercicios.tp2.Circunferencia;

import java.util.Scanner;

public class Circunferencia {
    
    private double radio;
    //Constructor que inicia radio como parametro
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    //Get y Set para radio
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    //Metodo para crear circunferencia
    public void crearCircunferencia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio de la circunferencia: ");
        this.radio = scanner.nextDouble();
    }
    //Metodo que calcula el area
    public double area() {
        return Math.PI * Math.pow(this.radio, 2);
    }
    //Metodo que calcula el perimetro
    public double perimetro() {
        return 2 * Math.PI * this.radio;
    }
}

