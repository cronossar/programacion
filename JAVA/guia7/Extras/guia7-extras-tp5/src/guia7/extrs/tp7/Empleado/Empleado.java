package guia7.extrs.tp7.Empleado;

public class Empleado {
    
    private String nombre;
    private int edad;
    private double salario;
    
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //Metodo
    
    public void calcular_aumento() {
        double aumento;
        if (edad > 30) {
            aumento = salario * 0.1;
        } else {
            aumento = salario * 0.05;
        }
        salario += aumento;
        System.out.println("El nuevo salario de " + nombre + " es " + salario);
    }
}
    
    
    


