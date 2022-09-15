
package EjerciciosGuia2;

import EjerciciosGuia2.Moldes.Matematica;
import Servicios.ServicioMatematica;


public class Cuentas {

    public static void main(String[] args) {
      Matematica m1=new Matematica();
      m1.setNum1(Math.random()*10);
        System.out.println(m1.getNum1());
      m1.setNum2(Math.random()*10);
       System.out.println(m1.getNum2());
      ServicioMatematica sm= new ServicioMatematica();
        System.out.println("Se muestra el numero de mayor valor "+sm.devolverMayor(m1));
        System.out.println("Se muestra el cuadrado del numero mayor elevado al menor "+sm.calcularPotencia(m1));
        System.out.println("Se muestra la raiz cuadrada del menor numero "+sm.calculaRaiz(m1));
    } 
}
