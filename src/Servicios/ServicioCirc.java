
package Servicios;

import EjerciciosGuia2.Moldes.Circunferencia;
import java.util.Scanner;

public class ServicioCirc {
     private Scanner read = new Scanner(System.in).useDelimiter("\n");
    public Circunferencia crearCirc(){
        System.out.println("Ingrese el radio de la circunferencia");
        double radio=read.nextDouble();
        return new Circunferencia(radio);
    }
    
            
}
