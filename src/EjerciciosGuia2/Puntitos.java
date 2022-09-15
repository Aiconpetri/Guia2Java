
package EjerciciosGuia2;

import EjerciciosGuia2.Moldes.Puntos;
import Servicios.ServicioPuntos;


public class Puntitos {

   
    public static void main(String[] args) {
        ServicioPuntos sp= new ServicioPuntos();
        System.out.println("Cree el primer punto");
        Puntos p1=sp.crearPunto();
        System.out.println("Cree el segundo punto");
        Puntos p2=sp.crearPunto();
        System.out.println("La distancia entre los dos puntos es "+sp.distanciaPuntos(p1, p2));
    } 
}
