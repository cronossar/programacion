/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia7.ejercicios.tp2.bis.Circunferencia;

import java.util.Scanner;

/**
 *
 * @author cronossar1
 */
public class Circunferencia {
    Scanner leer=new Scanner(System.in);
    private double radio;
    
//Constructores:
    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }
//Getter y setter:
 
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        System.out.println("Ingrese el valor de readio");
        radio =leer.nextDouble();
        
    }
    
    public void area(){
        double area=Math.PI*Math.pow(radio, 2);
        System.out.println("El area es "+area);
        
    }
        public void perimetro(){
        double perimetro=Math.PI*2*radio;
        System.out.println("El perímetro es "+perimetro);
        
    }
}

