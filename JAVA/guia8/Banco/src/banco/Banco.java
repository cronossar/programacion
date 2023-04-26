package banco;

import Entidades.CuentaBancaria;
import Servicios.ServiciosCuentaBancaria;
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opc;
        //  CuentaBancaria cb = new CuentaBancaria();
        ServiciosCuentaBancaria cs = new ServiciosCuentaBancaria();
        CuentaBancaria cb = cs.nuevoUsuario();
        do {
            cs.menu();
            opc = scan.nextInt();
            switch (opc) {
                case 1:
                    cs.consultarDatos(cb);
                    break;
                case 2:
                    cs.ingresar(cb);
                    break;
                case 3:
                    cs.retirar(cb);
                    break;
                case 4:
                    cs.extraccionRapida(cb);
                    break;
                case 5:
                    cs.consultarSaldo(cb);
                    break;
                case 6:
                    System.out.println("Gracias por su visita");
                default:
                    if (opc == 7 || opc == 8 || opc == 9 || opc == 0) {
                        System.out.println("opcion no validad");
                    }

            }

        } while (opc != 6);
    }
}
