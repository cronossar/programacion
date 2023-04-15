package Reloj;

public class Tiempo {
    private int hora;
    private int minutos;
    private int segundos;

    // Constructor vacío
    public Tiempo() {
        this.hora = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    // Constructor con parámetros
    public Tiempo(int hora, int minutos, int segundos) {
        if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            System.out.println("Error: la hora, minutos o segundos ingresados no son válidos.");
        }
    }

    // Getters y setters
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            System.out.println("Error: la hora ingresada no es válida.");
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
        } else {
            System.out.println("Error: los minutos ingresados no son válidos.");
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
        } else {
            System.out.println("Error: los segundos ingresados no son válidos.");
        }
    }

    // Método para imprimir la hora completa en formato hh:mm:ss
    public void imprimirHoraCompleta() {
        System.out.printf("%02d:%02d:%02d", hora, minutos, segundos);
    }
}
