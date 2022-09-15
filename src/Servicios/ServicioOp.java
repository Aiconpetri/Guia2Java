package Servicios;

import EjerciciosGuia2.Moldes.Operacion;
import java.util.Scanner;

public class ServicioOp {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Operacion crearOperacion() {
        System.out.println("Ingrese el primer numero");
        int numero1 = read.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero2 = read.nextInt();
        return new Operacion(numero1, numero2);
    }
}
