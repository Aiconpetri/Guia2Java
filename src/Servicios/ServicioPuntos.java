
package Servicios;

import EjerciciosGuia2.Moldes.Puntos;
import java.util.Scanner;


public class ServicioPuntos {
    Scanner read=new Scanner(System.in).useDelimiter("\n");
    public Puntos crearPunto(){
        System.out.println("Ingrese la posicion del punto en x");
        int x=read.nextInt();
        System.out.println("Ingrese la posicion del punto en y");
        int y=read.nextInt();
        return new Puntos(x,y);
    }
    public double distanciaPuntos(Puntos p1,Puntos p2){
        double dist=Math.sqrt((Math.pow((p2.getX1()-p1.getX1()), 2))+(Math.pow((p2.getY1()-p1.getY1()), 2)));
        return dist;
    }
}
