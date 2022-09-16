
package EjerciciosGuia2;

import EjerciciosGuia2.Moldes.Raices;
import Servicios.ServicioRaices;


public class EcuacionesSegundoGrado {

    
    public static void main(String[] args) {
       ServicioRaices sr= new ServicioRaices();
       Raices r1=sr.crearRaices();
       sr.getDiscriminante(r1);
       sr.tieneRaices(r1);
       sr.tieneRaiz(r1);
       sr.calcular(r1, sr.tieneRaices(r1));
    }
}
