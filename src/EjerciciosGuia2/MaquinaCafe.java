package EjerciciosGuia2;

import EjerciciosGuia2.Moldes.Cafetera;
import Servicios.ServicioCafe;
import java.util.Scanner;

public class MaquinaCafe {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        ServicioCafe sCa = new ServicioCafe();
        Cafetera cafe1 = sCa.crearCafe();
        String op;
        do {
            System.out.println("Menu");
            System.out.println("A-Llenar Cafetera");
            System.out.println("B-Servir Taza");
            System.out.println("C-Vaciar Cafetera");
            System.out.println("D-Agregar Cafe");
            System.out.println("E-Salir");
            op=read.next();
            switch (op){
                case "A":
                    sCa.Llenar(cafe1);
                    break;
                case "B":
                    sCa.Servir(cafe1);
                    break;
                case "C":
                    sCa.Vaciar(cafe1);
                    break;
                case "D":
                    sCa.Agregar(cafe1);
                    break;
                case "E":
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("No ingreso una opcion correcta");
            }
        } while (!op.equals("E"));
    
    }

}
