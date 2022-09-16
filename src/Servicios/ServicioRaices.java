
package Servicios;

import EjerciciosGuia2.Moldes.Raices;
import java.util.Scanner;

public class ServicioRaices {
    public Raices crearRaices(){
        Scanner read=new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el primer coeficiente");
        int a=read.nextInt();
        System.out.println("Ingrese el segundo coeficiente");
        int b=read.nextInt();
        System.out.println("Ingrese el tercer coeficiente");
        int c=read.nextInt();
        return new Raices(a,b,c);
    }
    public double getDiscriminante(Raices r1){
        double dis=(Math.pow(r1.getB(), 2))-4*r1.getA()*r1.getC();
        return dis;
    }
    public boolean tieneRaices(Raices r1){
        boolean dos=(Math.pow(r1.getB(), 2))-4*r1.getA()*r1.getC()>=1;
        return dos;
    }
     public boolean tieneRaiz(Raices r1){
        boolean uno=(Math.pow(r1.getB(), 2))-4*r1.getA()*r1.getC()==0;
        return uno;
    }
     public void obtenerRaices(Raices r1,boolean dos){
         if (dos==true){
             System.out.println("La solucion x1 es "+(-r1.getB()+Math.sqrt((Math.pow(r1.getB(), 2))-(4*r1.getA()*r1.getC())))/(2*r1.getA()));
             System.out.println("La solucion x2 es "+(-r1.getB()-Math.sqrt((Math.pow(r1.getB(), 2))-(4*r1.getA()*r1.getC())))/(2*r1.getA()));
         }
     }
     public void obtenerRaiz(Raices r1,boolean dos){
         if (dos==false){
             System.out.println("La raiz es "+(-r1.getB())/(2*r1.getA()));
         }
     }
     public void calcular(Raices r1,boolean dos){
         if ((Math.pow(r1.getB(), 2))-4*r1.getA()*r1.getC()<0){
             System.out.println("La ecuacion no tiene solucion");
         }else{
         obtenerRaiz(r1, dos);
         obtenerRaices(r1,dos);
         }
     }
}
