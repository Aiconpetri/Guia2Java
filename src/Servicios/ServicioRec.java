
package Servicios;

import EjerciciosGuia2.Moldes.Rectangulo;
import java.util.Scanner;


public class ServicioRec {
       private Scanner read= new Scanner(System.in).useDelimiter("\n");
     public Rectangulo crearRectangulo(){
        System.out.println("Ingrese la base del rectangulo");
        int Base=read.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        int Altura=read.nextInt();
        return new Rectangulo(Base,Altura);
     } 
}
