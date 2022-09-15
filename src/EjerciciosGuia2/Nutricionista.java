
package EjerciciosGuia2;

import EjerciciosGuia2.Moldes.Persona;
import Servicios.ServicioPersona;


public class Nutricionista {
    public static void main(String[] args) {
        Persona p1= new Persona();
        ServicioPersona sp= new ServicioPersona();
        sp.hola();
        int cont=1;
        int contME=0;
        int contM=0;
        int contBP=0;
        int contAP=0;
        int contPI=0;
        while (cont<5){
          sp.crearPersona(p1);
        sp.calcularIMC(p1);
        sp.mayorDeEdad(p1);
        if (p1.getIMC()==-1){
            System.out.println(p1.getNombre()+" esta por debajo de su peso ideal.");
            contBP++;
        }else if (p1.getIMC()==0){
            System.out.println(p1.getNombre()+" esta en su peso ideal.");
            contPI++;
        }else{
            System.out.println(p1.getNombre()+" esta por encima de su peso ideal.");
            contAP++;
        }
        if (p1.getMayor()==true){
            System.out.println("Es mayor de edad.");
            contM++;
        }else{
            System.out.println("Es menor de edad.");
            contME++;
        }
        cont++;
        }
        System.out.println("El "+contBP*100/4+"% de personas esta por debajo de su peso ideal");
        System.out.println("El "+contPI*100/4+"% de personas esta en su peso ideal");
        System.out.println("El "+contAP*100/4+"% de personas esta por encima de su peso ideal");
        System.out.println("El "+contME*100/4+"% de personas es menor de edad");
        System.out.println("El "+contM*100/4+"% de personas es mayor de edad");
    }
}
