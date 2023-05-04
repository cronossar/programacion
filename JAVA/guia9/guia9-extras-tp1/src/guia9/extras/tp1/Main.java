package guia9.extras.tp1;

import Entidad.Juego;
import Servicio.JuegoServicio;

public class Main {

    public static void main(String[] args) {
        JuegoServicio js = new JuegoServicio();
        
        Juego j = new Juego();
        j.setMesSecreto(meses[(int) 9]);
        js.adivinar(j);

    }

}
