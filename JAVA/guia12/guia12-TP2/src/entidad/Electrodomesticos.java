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
        
        this.precio = 1000.00;
        System.out.println("Los colores disponibles son: NEGRO - GRIS - ROJO - AZUL - BLANCO");
        System.out.println("Ingrese el color deseado");
        this.color = sc.next().toUpperCase();
        comprobarColor(color);
        System.out.println("Las opciones de consumo energetico son: A - B - C - D - E");
        System.out.println("Ingrese la letra de tipo consumo energetico");
        char C = sc.next().toUpperCase().charAt(0);
        consE(C);
        System.out.println("");
        System.out.println("Ingrese el peso del electrodomestico");
        this.peso = sc.nextInt();
        sc.nextLine();
    }

    public void consE(char C) {
        if (C == 'A' || C == 'B' || C == 'C' || C == 'D' || C == 'E') {
            this.consE = C;
        } else {
            this.consE='F';
        }
    }

    public void comprobarColor(String color) {
        if (color.equalsIgnoreCase("") || color.equalsIgnoreCase("GRIS") || color.equalsIgnoreCase("ROJO") ||
            color.equalsIgnoreCase("AZUL")) {
            this.color=color;
        } else {
            this.color="BLANCO";
        }
    }

    public void precioFinal() {
        switch (this.consE) {
            case 'A':
                this.precio += 1000.00;
                break;
            case 'B':
                this.precio += 800.00;
                break;
            case 'C':
                this.precio += 600.00;
                break;
            case 'D':
                this.precio += 500.00;
                break;
            case 'E':
                this.precio += 300.00;
                break;
            default:
                this.precio += 100.00;
        }
        if (peso > 0 && peso <= 19) {
            this.precio += 100.00;
        }
        if (peso >= 20 && peso <= 49) {
            this.precio += 500.00;
        }
        if (peso >= 50 && peso <= 79) {
            this.precio += 800.00;
        }
        if (peso > 80) {
            this.precio += 1000.00;
        }
//        System.out.println("Hasta el momento el precio del producto es:  "+this.precio);
        }

}

