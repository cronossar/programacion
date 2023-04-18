
package Entidades;

public class Persona {
    private String nombre;
    private Integer edad;
    private String sexo;
    
    //Constructor por defecto

    public Persona() {
    }
    //Constructor por parametros

    public Persona(String nombre, Integer edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    //Getter & Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}

