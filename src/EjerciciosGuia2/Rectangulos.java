
package EjerciciosGuia2;

import EjerciciosGuia2.Moldes.Rectangulo;
import Servicios.ServicioRec;

public class Rectangulos {
    public static void main(String[] args) {
   ServicioRec sr= new ServicioRec();
   Rectangulo r1= sr.crearRectangulo();
        System.out.println("El perimetro del rectangulo es "+r1.Perimetro());
        System.out.println("La superficie del rectangulo es "+r1.Superficie());
        System.out.println("A continuacion se mostrara el rectangulo");
        for (int i = 0; i < r1.getAltura(); i++) {
            for (int j = 0; j <r1.getBase(); j++) {
                if (i==0 || i==r1.getAltura()-1 || j==0 || j==r1.getBase()-1){
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
