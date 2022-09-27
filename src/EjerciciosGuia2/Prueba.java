
package EjerciciosGuia2;

import EjerciciosGuia2.Moldes.Pruebita;
import Servicios.ServicioPruebita;

public class Prueba {

   
    public static void main(String[] args) {
       Pruebita m1=new Pruebita();
      m1.setNum1((int) (Math.random() * 10));
        System.out.println(m1.getNum1());
      m1.setNum2((int) (Math.random() * 10));
       System.out.println(m1.getNum2());
      ServicioPruebita sm= new ServicioPruebita();
        System.out.println("Se muestra el numero de mayor valor "+sm.devolverMayor(m1));
        System.out.println("Se muestra el cuadrado del numero mayor elevado al menor "+sm.calcularPotencia(m1));
        System.out.println("Se muestra la raiz cuadrada del menor numero "+sm.calculaRaiz(m1));
    }
    
}
