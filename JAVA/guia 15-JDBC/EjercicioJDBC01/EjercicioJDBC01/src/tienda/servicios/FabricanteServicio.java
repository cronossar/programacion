/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

/**
 *
 * @author jorge
 */
public class FabricanteServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    FabricanteDAO FDAO = new FabricanteDAO();

    public void ingresarFabricante() {
        System.out.println("AGREGAR FABRICANTE");
        Fabricante F = new Fabricante();
        System.out.println("Ingrese el Nombre del Fabricante");
        F.setNombre(leer.next());
        try {
            FDAO.ingresarFabricante(F);
        } catch (Exception e) {
            System.out.println("Error al intentar agregar fabricante: " + e.getMessage());
        }
    }
    
    public void mostrarFabricantes(){
        System.out.println("LISTA DE FABRICANTES");
         try {
            FDAO.mostrarFabricantes();
        } catch (Exception e) {
            System.out.println("Error al intentar listar todos los fabricantes: " + e.getMessage());
        }
    }
}
