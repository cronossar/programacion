package guia9.extras.tp1;

import Entidad.Juego;
import Servicio.JuegoServicio;

public class Main {

    public static void main(String[] args) {
        JuegoServicio js = new JuegoServicio();

        Juego j = new Juego();
        
        js.adivinar(j);

    }

}
