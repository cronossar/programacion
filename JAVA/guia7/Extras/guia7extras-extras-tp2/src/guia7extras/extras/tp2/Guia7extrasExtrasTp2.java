package guia7extras.extras.tp2;

import Reloj.Tiempo;

/**
 *
 * @author cronossar1
 */
public class Guia7extrasExtrasTp2 {

    public static void main(String[] args) {
        Tiempo t = new Tiempo(9, 0, 0); // Crear un objeto Tiempo con hora 9:00:00

        for (int i = 0; i < 10; i++) { // Simular el paso del tiempo
            System.out.print("Hora actual: ");
            t.imprimirHoraCompleta();
            System.out.println();

            try {
                Thread.sleep(1000); // Esperar 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Incrementar los segundos
            int nuevosSegundos = t.getSegundos() + 1;
            if (nuevosSegundos >= 60) {
                t.setSegundos(0);
                int nuevosMinutos = t.getMinutos() + 1;
                if (nuevosMinutos >= 60) {
                    t.setMinutos(0);
                    int nuevaHora = t.getHora() + 1;
                    if (nuevaHora >= 24) {
                        t.setHora(0);
                    } else {
                        t.setHora(nuevaHora);
                    }
                } else {
                    t.setMinutos(nuevosMinutos);
                }
            } else {
                t.setSegundos(nuevosSegundos);
            }
        }
    }
}
    
    

