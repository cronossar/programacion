
package entidades;

import java.util.Scanner;

public class EdificioDeOficina extends Edificio {
    
    private int numOficinas;
    private int persoxoficina;
    private int numPisos;

    public EdificioDeOficina() {
    }

    
    public EdificioDeOficina(int numOficinas, int persoxoficina, int numPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.persoxoficina = persoxoficina;
        this.numPisos = numPisos;
    }

    
    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getPersoxoficina() {
        return persoxoficina;
    }

    public void setPersoxoficina(int persoxoficina) {
        this.persoxoficina = persoxoficina;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }
    
    //Metodos
    Scanner sc = new Scanner(System.in);
    
    @Override
    public double calcularSuperficieConRetorno(){
       
       return  this.ancho * this.largo; 
        
    }
    
    @Override
    public double calcularVolumenConRetorno(){
        
        return this.alto * this.ancho * this.largo;
    }
    
    public void cantPersonas(){
        
        int totalpersonasedif;
        int totalpersonasxpiso;
        
        totalpersonasxpiso = this.persoxoficina * this.numOficinas;
        totalpersonasedif = totalpersonasxpiso * this.numOficinas;
        System.out.println("-------------------");
        System.out.println("La cantidad de personas por piso es: "+totalpersonasxpiso);
        System.out.println("-------------------");
        System.out.println("La cantidad de personas en el edificio es: "+totalpersonasedif);
        
    }
        
    @Override
    public String toString() {
        return "EdificioDeOficina{" + "numOficinas=" + numOficinas + ", persoxoficina=" + persoxoficina + ", numPisos=" + numPisos + '}';
    }
   
}
