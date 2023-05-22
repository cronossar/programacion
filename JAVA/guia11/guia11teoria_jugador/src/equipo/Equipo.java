
package equipo;

import java.util.ArrayList;
import java.util.List;
import jugador.Jugador;

public class Equipo {
    private List<Jugador> Jugadores = new ArrayList();

    public Equipo() {
    }

    public List<Jugador> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(List<Jugador> Jugadores) {
        this.Jugadores = Jugadores;
    }

    @Override
    public String toString() {
        return "Equipo \n{" + Jugadores + '}';
    }
    
}