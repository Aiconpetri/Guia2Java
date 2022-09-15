
package EjerciciosGuia2;

import EjerciciosGuia2.Moldes.Circunferencia;
import Servicios.ServicioCirc;


public class Circunferencias {

    public static void main(String[] args) {
        ServicioCirc sc= new ServicioCirc();
        Circunferencia circ1 = sc.crearCirc();
        System.out.println("El radio de la circunferencia es "+circ1.getRadio());
        System.out.println("El area de la circunferencia es "+circ1.area());
        System.out.println("El perimetro de la circunferencia es "+circ1.perimetro());
    }
}

