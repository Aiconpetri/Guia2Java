
package Servicios;

import EjerciciosGuia2.Moldes.Persona;
import java.util.Scanner;

public class ServicioPersona {
    Scanner read= new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona(){
        System.out.println("Ingrese su nombre");
        String nombre=read.next();
        System.out.println("Ingrese su edad");
        int edad=read.nextInt();
        System.out.println("Ingrese su sexo (H-Hombre,M-Mujer,O-Otro)");
        String letra=read.next();
        while(!letra.equalsIgnoreCase("O")&&!letra.equalsIgnoreCase("H")&&!letra.equalsIgnoreCase("M")){
            System.out.println("No ingreso una opcion valida, ingrese nuevamente");
            letra=read.next();
        }
        String sexo="";
        switch (letra){
            case "H":
            sexo="Hombre";
            break;
             case "O":
            sexo="Otro";
            break;
            case "M":
            sexo="Mujer";
            break;
        }
        System.out.println("Ingrese su peso en Kg");
        double peso=read.nextDouble();
        System.out.println("Ingrese su altura en metros");
        double altura=read.nextDouble();
        return new Persona(nombre,edad,sexo,peso,altura);
    }
    public int calcularIMC(Persona p){
        int IMC=0;
        if(p.getPeso()/(Math.pow(p.getAltura(), 2))<20){
            System.out.println(p.getNombre()+" esta por debajo de su peso ideal");
            IMC=-1;
        }else if (p.getPeso()/(Math.pow(p.getAltura(), 2))>=20 && p.getPeso()/(Math.pow(p.getAltura(), 2))<=25){
            System.out.println(p.getNombre()+" esta en su peso ideal");
        }else{
            System.out.println(p.getNombre()+" esta por encima de su peso ideal");
            IMC=1;
        }
        return IMC;
    }
    public boolean mayorEdad(Persona p){
        boolean band=p.getEdad()>=18;
        if (band==true){
            System.out.println(p.getNombre()+" es mayor de edad");
        }else{
            System.out.println(p.getNombre()+" es menor de edad");
        }
     return band;   
    }
}
