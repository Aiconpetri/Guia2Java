/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia2;

import EjerciciosGuia2.Moldes.Cuenta;
import Servicios.servicioCuenta;
import java.util.Scanner;
public class Cajero {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int cont = 0;
        String op;
        System.out.println("Menu");
        System.out.println("A-Ingrese a su cuenta");
        servicioCuenta sCu = new servicioCuenta();
        Cuenta c1=sCu.iniciarCuenta();
        System.out.println("B-Salir");
        op = read.next();
        switch (op) {
            case "A":
                sCu.crearCuenta(c1);
                System.out.println("Bienvenido");
                break;
            case "B":
                cont = 1;
                break;
            default:
                System.out.println("No ingreso una opcion correcta");
                cont = 1;
                break;
        }
        if (cont==0){
            do {
            System.out.println("Menu");
            System.out.println("A-Ingresar dinero");
            System.out.println("B-Retirar dinero");
            System.out.println("C-Extraccion rapida");
            System.out.println("D-Consultar saldo");
            System.out.println("E-Consultar datos");
            System.out.println("F-Salir");
            op = read.next();
            switch (op) {
                case "A":
                    sCu.ingresarSaldo(c1);
                    break;
                case "B":
                    sCu.extraerSaldo(c1);
                    break;
                case "C":
                    sCu.extraerRapido(c1);
                    break;
                case "D":
                    sCu.consultarSaldo(c1);
                    break;
                case "E":
                    sCu.consultarDatos(c1);
                    break;
                case "F":
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }

        } while (!op.equals("F"));
        }else
            System.out.println("Saliendo");
    }
}
