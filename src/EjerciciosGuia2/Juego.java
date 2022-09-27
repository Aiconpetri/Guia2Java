
package EjerciciosGuia2;
import Servicios.ServicioAhorcado;
import java.util.Scanner;
import EjerciciosGuia2.Moldes.Ahorcado;
public class Juego {

    public static void main(String[] args) {
        Scanner read= new Scanner(System.in).useDelimiter("\n");
      ServicioAhorcado sa=new ServicioAhorcado();
      Ahorcado a1=sa.crearJuego();
      int cont=-1;
      String letra;
      do{
          do{
          System.out.println("Ingrese una letra");
          letra=read.next();
          }while(letra.length()!=1 || !Character.isLetter(letra.charAt(0)) );
          letra=letra.toUpperCase();
          if (sa.seIngreso(a1, letra)==false){
          cont++;
          }
      }while(sa.juego(a1,cont,letra)==false);
    }
}
