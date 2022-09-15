package EjerciciosGuia2;

import EjerciciosGuia2.Moldes.Operacion;
import Servicios.ServicioOp;

public class Calculos {

    public static void main(String[] args) {
        ServicioOp sOp = new ServicioOp();
        Operacion calc1 = sOp.crearOperacion();
        System.out.println("La suma de los numeros es " + calc1.suma());
        System.out.println("La resta de los numeros es " + calc1.resta());
        if (calc1.mult() != 0) {
            System.out.println("La multiplicacion de los numeros es " + calc1.mult());
        } else {
            System.out.println("El resultado da 0 al haber ingresado un 0");
        }
        if (calc1.div() != 0) {
            System.out.println("La division de los numeros es " + calc1.div());
        } else {
            System.out.println("El resultado da 0 al haber ingresado un 0");
        }
    }
}
