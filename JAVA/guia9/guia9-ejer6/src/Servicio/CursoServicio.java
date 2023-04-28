package Servicio;

import java.util.Scanner;
import Entidad.Curso;

public class CursoServicio {
      
    private Scanner scanner;

    public CursoServicio() {
        this.scanner = new Scanner(System.in);
    }
    
    public void cargarAlumnos(){
        String nombre;
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingresa el nombre del alumno");
            nombre = scanner.next();
            alumnos[i] = nombre;            
        }
        for (int i : alumnos) {
            System.out.println(i+" "); 
        }
    }
    
}
   
//-------------------------------------------------------

public Curso crearCurso() {
            /*
            this.nombreCurso = nombreCurso;
            this.cantidadHorasPorDia = cantidadHorasPorDia;
            this.cantidadDiasPorSemana = cantidadDiasPorSemana;
            this.turno = turno;
            this.precioPorHora = precioPorHora;
Curso(String nombreCurso, String cantidadHorasPorDia, String cantidadDiasPorSemana, String turno, double precioPorHora)             
             */
            System.out.println("ingrese nombre curso, cantidad horas dia, semana, turno, precio por hora y cargue los alumnos");
            Curso c = new Curso(leer.nextLine(),leer.nextLine(),leer.nextLine(),leer.nextLine(),leer.nextDouble()); 
            c.setAlumnos(cargarAlumnos());
            return c;
        }
        
        public void mostrar(Curso c){
            
            System.out.println(c.getAlumnos());
            System.out.println(c.getCantidadDiasPorSemana());
            System.out.println(c.getCantidadHorasPorDia());
            System.out.println(c.getNombreCurso());
            System.out.println(c.getPrecioPorHora());
            System.out.println(c.getTurno());
        }

    }
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class CrusoServicios {


        Scanner leer = new Scanner(System.in);
        Curso c = new Curso();
        public String[] cargarAlumnos() {
            String[] alumno = new String[5];
            for (int i = 0; i < 5; i++) {
                System.out.println("ingres el nombre del alumno");
                alumno[i] = leer.nextLine();
            }
            return alumno;
        }

        public Curso crearCurso() {
            /*
            this.nombreCurso = nombreCurso;
            this.cantidadHorasPorDia = cantidadHorasPorDia;
            this.cantidadDiasPorSemana = cantidadDiasPorSemana;
            this.turno = turno;
            this.precioPorHora = precioPorHora;
Curso(String nombreCurso, String cantidadHorasPorDia, String cantidadDiasPorSemana, String turno, double precioPorHora)             
             */
            System.out.println("ingrese nombre curso, cantidad horas dia, semana, turno, precio por hora y cargue los alumnos");
            Curso c = new Curso(leer.nextLine(),leer.nextLine(),leer.nextLine(),leer.nextLine(),leer.nextDouble()); 
            c.setAlumnos(cargarAlumnos());
            return c;
        }
        
        public void mostrar(Curso c){
            
            System.out.println(c.getAlumnos());
            System.out.println(c.getCantidadDiasPorSemana());
            System.out.println(c.getCantidadHorasPorDia());
            System.out.println(c.getNombreCurso());
            System.out.println(c.getPrecioPorHora());
            System.out.println(c.getTurno());
        }

    }


/*
-M�todo cargarAlumnos(): este m�todo le permitir� al usuario ingresar los alumnos 
que asisten a las clases. Nosotros nos encargaremos de almacenar esta informaci�n 
en un arreglo e iterar con un bucle, solicitando en cada repetici�n que se ingrese el nombre de cada alumno.
-M�todo crearCurso(): el m�todo crear curso, le pide los valores de los atributos 
al usuario y despu�s se le asignan a sus respectivos atributos para llenar el objeto Curso. 
En este m�todo invocamos al m�todo cargarAlumnos() para asignarle valor al atributo alumnos
-M�todo calcularGananciaSemanal(): este m�todo se encarga de calcular la ganancia en 
una semana por curso. Para ello, se deben multiplicar la cantidad de horas por d�a, el precio por hora, 
la cantidad de alumnos y la cantidad de d�as a la semana que se repite el encuentro.
 */ 

