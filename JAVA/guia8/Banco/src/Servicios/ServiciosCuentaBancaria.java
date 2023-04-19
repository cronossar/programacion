package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

public class ServiciosCuentaBancaria {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    CuentaBancaria cb = new CuentaBancaria();

    public void menu() {
        System.out.println("-----------------------");
        System.out.println("1. Mostrar datos");
        System.out.println("2. Ingresar de dinero");
        System.out.println("3. Retirar de dinero");
        System.out.println("4. Extraccion Rapida");
        System.out.println("5. Consultar saldo");
        System.out.println("6. Salir");
        System.out.println("------------------------");
    }

    public CuentaBancaria nuevoUsuario() {
        System.out.println("Bienvenido por favor complete los datos para continuar");
        System.out.print("ingrese el numero de cuenta : ");
        cb.setNumeroCuenta(scan.nextInt());
        System.out.print("ingrese su numero de dni : ");
        cb.setDniCliente(scan.nextLong());
        System.out.print("ingrese su saldo : ");
        cb.setSaldoActual(scan.nextDouble());
        return cb;

    }

    public void ingresar(CuentaBancaria cb) {
        System.out.println("ingrese la cantidad de dinero  que desea ingresar");
        double deposito = scan.nextDouble();
        cb.setSaldoActual(deposito + cb.getSaldoActual());
        System.out.println(" el saldo es " + cb.getSaldoActual());
    }

    /*
 Método retirar(double): recibe una cantidad de dinero a retirar y se le
  restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
  retirar se retirará el máximo posible hasta dejar la cuenta en 0.
     */
    public void retirar(CuentaBancaria cb) {

        System.out.println("Cuento dinero desea retirar");
        double retirar = scan.nextDouble();
        if (retirar > cb.getSaldoActual()) {
            System.out.println("*************************");
            System.out.println("el saldo no es suficiente");
            System.out.println("saldo actual: " + cb.getSaldoActual());
            System.out.println("***************************");
        } else {
            cb.setSaldoActual(cb.getSaldoActual() - retirar);
            System.out.println("*************************");
            System.out.println("saldo actual: " + cb.getSaldoActual());
            System.out.println("*************************");

        }

    }

    /*
      Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
  Validar que el usuario no saque más del 20%.
     */
    public void extraccionRapida(CuentaBancaria cb) {
        double max = cb.saldoActual * 0.2;
        // do {
        System.out.println("Cuento dinero desea retirar");
        double extra = scan.nextDouble();
        if (max <= extra) {
            System.out.println("*************************");
            System.out.println("Supera su limite diario");
            System.out.println("Saldo Actual: " + cb.getSaldoActual());
            System.out.println("***************************");
        } else {
            cb.setSaldoActual(cb.getSaldoActual() - extra);
            System.out.println("*************************");
            System.out.println("saldo actual: " + cb.getSaldoActual());
            System.out.println("*************************");
            max = max - extra;
        }

        //  } while (cb.getSaldoActual() != 0);
    }

    /*
      Método consultarSaldo: permitirá consultar el saldo disponible en la
  cuenta.
     */
    public void consultarSaldo(CuentaBancaria cb) {
        System.out.println("su saldo es: " + cb.getSaldoActual());
    }

    /*
     Método consultarDatos: permitirá mostrar todos los datos de la
 cuenta.
     */
    public void consultarDatos(CuentaBancaria cb) {
        System.out.println("Numero de cuenta  : " + cb.getNumeroCuenta());

        System.out.println("Numero de DNI  : " + cb.getDniCliente());

        System.out.println("Saldo Actual  : " + cb.getSaldoActual());

    }

}
