package Servicio;

import java.util.Date;
import java.text.SimpleDateFormat;
import Entidades.Persona;
public class personaServicio {
    //private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public Persona crearPersona(String nomb, Date fnac ) {
        return new Persona(nomb, fnac);
    }
    
    /*Método calcularEdad que calcule la edad del usuario utilizando el atributo 
    de fecha de nacimiento y la fecha actual.*/
    
    public int calcularEdad(Date factual, Date fnacimiento) {
        int edad;
        edad= factual.getYear()- fnacimiento.getYear();
        if (fnacimiento.getMonth() > factual.getMonth()) {
            edad-=1;
            
        } else if (fnacimiento.getMonth() == factual.getMonth()) {
            if (factual.getDate() < fnacimiento.getDate()) {
                edad-=1;
            }
        }
        return edad;
        
  
    }
    public boolean menorQue(Persona obj, personaServicio objserv, int edad) {
        Date factual= new Date();
        
        return ((objserv.calcularEdad(factual, obj.getF_nac())) < edad);
    }
    
    public void mostrarPersona(Persona obj){
        SimpleDateFormat format = new SimpleDateFormat ("dd/MM/yyyy");
        System.out.println(" la persona es: "  +  obj.getNombre()+     
                "la fecha de nacimiento es   " + format.format(obj.getF_nac()));
    }
        

}