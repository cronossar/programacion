package guia7.ejercicios.tp4.Rectangulos;

import java.util.Scanner;

public class Rectangulo {
    //Se crea la clase con sus atributos privados
    private double base;
    private double altura;
    //Se inicia el constructor por parametros
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    //Constructor vacio
    public Rectangulo() {
    }
    //Get y Set
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    //Metodo que solicita datos de base y altura y asigna a los atributos
    public void crearRectangulo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la base del rectángulo: ");
        this.base = sc.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        this.altura = sc.nextDouble();
    }
    //Metodo que calcula superficie
    public double calcularSuperficie() {
        return this.base * this.altura;
    }
    //Metodo que calcula perimetro
    public double calcularPerimetro() {
        return (this.base + this.altura) * 2;
    }
    //Metodo que dibuja el rectangulo usando loop For
    public void dibujarRectangulo() {
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

