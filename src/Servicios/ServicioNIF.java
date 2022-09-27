
package Servicios;

import EjerciciosGuia2.Moldes.NIF;
import java.util.Scanner;

public class ServicioNIF {
    Scanner read=new Scanner(System.in).useDelimiter("\n");
   
    public NIF crearNif(){
         String vec[]=new String[23];
    vec[0]="T";vec[1]="R";vec[2]="W";vec[3]="A";vec[4]="G";vec[5]="M";vec[6]="Y";vec[7]="F";vec[8]="P";vec[9]="D";vec[10]="X";vec[11]="B";vec[12]="N";vec[13]="J";vec[14]="Z";vec[15]="S";vec[16]="Q";vec[17]="V";vec[18]="H";vec[19]="L";vec[20]="C";vec[21]="K";vec[22]="E";
        System.out.println("Ingrese el DNI");
        long DNI=read.nextLong();
        System.out.println("Se asigna la letra");
        String letra=vec[(int)DNI%23];
        return new NIF( DNI, letra);
    }
    public void mostrar(NIF n1){
        System.out.println("Se muestra el NIF");
        System.out.println(n1.getDNI()+"-"+n1.getLetra());
    }
}
