package entidad;

import java.util.Scanner;

public class Electrodomesticos {
Scanner sc = new Scanner(System.in);
    protected double precio;
    protected String color;
    protected char consE;
    protected int peso;

    public Electrodomesticos() {
    }

    public Electrodomesticos(double precio, String color, char consE, int peso) {
        this.precio = precio;
        this.color = color;
        this.consE = consE;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsE() {
        return consE;
    }

    public void setConsE(char consE) {
        this.consE = consE;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void crearElectrodomestico() {
        
        precio = 1000.00;
        System.out.println("Los colores disponibles son: NEGRO - GRIS - ROJO - AZUL - BLANCO");
        System.out.println("Ingrese el color deseado");
        color = sc.next().toUpperCase();
        comprobarColor(color);
        System.out.println("Las opciones de consumo energetico son: A - B - C - D - E");
        System.out.println("Ingrese la letra de tipo consumo energetico");
        char C = sc.next().toUpperCase().charAt(0);
        consE(C);
        System.out.println("");
        System.out.println("Ingrese el peso del electrodomestico");
        peso = sc.nextInt();
    }

    public void consE(char C) {
        if (C == 'A' || C == 'B' || C == 'C' || C == 'D' || C == 'E') {
            setConsE(C);
        } else {
            setConsE('F');
        }
    }

    public void comprobarColor(String color) {
        if (color == "NEGRO" || color == "GRIS" || color == "ROJO" || color == "AZUL") {
            setColor(color);
        } else {
            setColor("BLANCO");
        }
    }

    public void precioFinal() {
        switch (consE) {
            case 'A':
                precio += 1000.00;
                break;
            case 'B':
                precio += 800.00;
                break;
            case 'C':
                precio += 600.00;
                break;
            case 'D':
                precio += 500.00;
                break;
            case 'E':
                precio += 300.00;
                break;
            default:
                precio += 100.00;
        }
        if (peso > 0 && peso <= 19) {
            precio += 100.00;
        }
        if (peso >= 20 && peso <= 49) {
            precio += 500.00;
        }
        if (peso >= 50 && peso <= 79) {
            precio += 800.00;
        }
        if (peso > 80) {
            precio += 1000.00;
        }
        System.out.println("Mostrar precio ahora como quedo "+precio);
    }

}
