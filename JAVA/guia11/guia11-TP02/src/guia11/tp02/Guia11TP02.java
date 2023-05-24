/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia11.tp02;

public class Guia11TP02 {

    public static void main(String[] args) {
        
        Juego juego = new Juego(3);
        
        while( !juego.finJuego() ){
            juego.ronda();            
            //juego.rondaV2();
        }
        
        System.out.println("El juego ha terminado");
        
    }
    
}