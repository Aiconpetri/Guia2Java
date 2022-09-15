
package EjerciciosGuia2;

import EjerciciosGuia2.Moldes.Personita;
import Servicios.ServicioPersonita;


public class DatosPersonita {

  
    public static void main(String[] args) {
    ServicioPersonita sp=new ServicioPersonita();
    Personita p1=sp.crearPersona();
    sp.calcularEdad(p1);
    int comp=20;
        System.out.println("¿La persona tiene menos de 20 años?: "+sp.menorQue(comp,p1));
        System.out.println("Se muestra la persona");
        sp.mostrarPersona(p1);
    }
    
}
