package guia9.extras.tp2;
import Servicio.AhorcadoServicio;
import Entidad.Ahorcado;

public class Main {

    public static void main(String[] args) {
        
        AhorcadoServicio A1 = new AhorcadoServicio();
        //Ahorcado ahorcado = new Ahorcado();
        A1.crearJuego();
        A1.longitud();
        A1.intentos();
        A1.juego();
        
    }
}
