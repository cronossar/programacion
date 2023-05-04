package Entidad;

public class Juego {

        private String[] meses;
        private String mesSecreto;

        public Juego() {
            this.meses = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
            this.mesSecreto = meses[(int)(Math.random()*12)+1];
            System.out.println(mesSecreto);

        }

        public String[] getMeses() {
            return meses;
        }

        public void setMeses(String[] meses) {
            this.meses = meses;
        }

        public String getMesSecreto() {
            return mesSecreto;
        }

        public void setMesSecreto(String mesSecreto) {
            this.mesSecreto = mesSecreto;
        }

    }
