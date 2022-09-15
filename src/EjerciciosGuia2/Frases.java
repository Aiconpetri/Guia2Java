
package EjerciciosGuia2;

import EjerciciosGuia2.Moldes.Cadena;
import Servicios.ServicioCadena;
import java.util.Scanner;


public class Frases {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase");
        String frase=read.next();
       Cadena c1= new Cadena(frase,frase.length());
       ServicioCadena sc= new ServicioCadena();
       c1.setFrase(c1.getFrase().toLowerCase());
       sc.mostrarVocales(c1);
       sc.invertirFrase(c1);
       sc.vecesRepetido(c1);
       sc.compararLongitud(c1);
       sc.unirFrases(c1);
       sc.reemplazar(c1);
       sc.contiene(c1);
    }
   
}
