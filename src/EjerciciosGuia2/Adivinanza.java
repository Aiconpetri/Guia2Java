
package EjerciciosGuia2;

import EjerciciosGuia2.Moldes.Meses;
import Servicios.ServicioMeses;
import java.util.Scanner;
public class Adivinanza {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in).useDelimiter("\n");
  ServicioMeses sm= new ServicioMeses();
  Meses m1=sm.crearCosas();
  String mes;
        System.out.println("Ingrese un mes para ver si es el mes secreto");
        do{
            mes=read.next();
        }while (sm.comparar(m1, mes)==false);
    }
}
