package Servicios;

import EjerciciosGuia2.Moldes.Cafetera;
import java.util.Scanner;

public class ServicioCafe {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Cafetera crearCafe() {
        int Max = 500;
        int Act = 0;
        return new Cafetera(Max, Act);
    }

    public Cafetera Llenar(Cafetera cafe1) {
        cafe1.setcAct(cafe1.getcMax());
        System.out.println("Llenando cafetera");
        return cafe1;
    }

    public Cafetera Servir(Cafetera cafe1) {
        System.out.println("Ingrese el tamaño de la taza");
        int taza = read.nextInt();
        if (taza <= cafe1.getcAct()) {
            cafe1.setcAct(cafe1.getcAct() - taza);
            System.out.println("Taza llena");
        } else {
            System.out.println("El cafe no alcanzo para llenar la taza, la taza quedo en " + cafe1.getcAct());
            cafe1.setcAct(0);
        }
        return cafe1;
    }

    public Cafetera Vaciar(Cafetera cafe1) {
        cafe1.setcAct(0);
        System.out.println("Vaciando cafetera");
        return cafe1;
    }

    public Cafetera Agregar(Cafetera cafe1) {
        System.out.println("¿Cuanto cafe desea ingresar?");
        int cafe = read.nextInt();
        if (cafe + cafe1.getcAct() > cafe1.getcMax()) {
            cafe1.setcAct(cafe1.getcMax());
            System.out.println("Solo se agregara cafe hasta llenar la cafetera");
        } else {
            cafe1.setcAct(cafe1.getcAct() + cafe);
            System.out.println("Se agrega cafe en la cafetera");
        }
        return cafe1;
    }
}
