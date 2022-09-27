
package EjerciciosGuia2;

import EjerciciosGuia2.Moldes.NIF;
import Servicios.ServicioNIF;


public class Documento {

  
    public static void main(String[] args) {
     ServicioNIF sn=new ServicioNIF();
     NIF n1=sn.crearNif();
     sn.mostrar(n1);
    }
}
