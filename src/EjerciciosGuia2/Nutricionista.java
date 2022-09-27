
package EjerciciosGuia2;

import EjerciciosGuia2.Moldes.Persona;
import Servicios.ServicioPersona;

public class Nutricionista {
    public static void main(String[] args) {
        int contS=0;
        int contI=0;
        int contD=0;
        int contM=0;
        ServicioPersona sp=new ServicioPersona();
        System.out.println("Ingrese los datos de la primer persona");
        Persona p1=sp.crearPersona();
        switch (sp.calcularIMC(p1)){
            case -1:
                contD++;
                break;
            case 0:
                contI++;
                break;
            case 1:
                contS++;
                break;
        }
        if (sp.mayorEdad(p1)==true){
            contM++;
        }
        System.out.println("Ingrese los datos de la segunda persona");
        Persona p2=sp.crearPersona();
        switch (sp.calcularIMC(p2)){
            case -1:
                contD++;
                break;
            case 0:
                contI++;
                break;
            case 1:
                contS++;
                break;
        }
        if (sp.mayorEdad(p2)==true){
            contM++;
        }
        System.out.println("Ingrese los datos de la tercer persona");
        Persona p3=sp.crearPersona();
        switch (sp.calcularIMC(p3)){
            case -1:
                contD++;
                break;
            case 0:
                contI++;
                break;
            case 1:
                contS++;
                break;
        }
        if (sp.mayorEdad(p3)==true){
            contM++;
        }
        System.out.println("Ingrese los datos de la cuarta persona");
        Persona p4=sp.crearPersona();
        switch (sp.calcularIMC(p4)){
            case -1:
                contD++;
                break;
            case 0:
                contI++;
                break;
            case 1:
                contS++;
                break;
        }
        if (sp.mayorEdad(p4)==true){
            contM++;
        }
        System.out.println("Se muestan los datos de la primer persona");
        System.out.println(p1);
        System.out.println("Se muestan los datos de la segunda persona");
        System.out.println(p2);
        System.out.println("Se muestan los datos de la tercera persona");
        System.out.println(p3);
        System.out.println("Se muestan los datos de la cuarta persona");
        System.out.println(p4);
        System.out.println("El porcentaje de personas que estan encima de su peso ideal es :"+(contS*100)/4+"%");
        System.out.println("El porcentaje de personas que estan en su peso ideal es :"+(contI*100)/4+"%");
        System.out.println("El porcentaje de personas que estan debajo de su peso ideal es :"+(contD*100)/4+"%");
        System.out.println("El porcentaje de personas mayores de edad es "+(contM*100)/4+"%");
        System.out.println("El porcentaje de personas menores de edad es "+((4-contM)*100)/4+"%");
    }  
}
