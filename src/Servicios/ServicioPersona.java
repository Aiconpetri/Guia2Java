package Servicios;

import EjerciciosGuia2.Moldes.Persona;
import java.util.Scanner;

public class ServicioPersona {

    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Persona hola() {
        String nombre = "";
        int edad = 0;
        String sexo = "";
        double peso = 0;
        double altura = 0;
        int IMC = 0;
        boolean Mayor = false;
        return new Persona(nombre, edad, sexo, peso, altura, IMC, Mayor);
    }

   public Persona crearPersona(Persona p1){
       System.out.println("Ingrese su nombre");
       p1.setNombre(read.next());
       System.out.println("Ingrese su edad");
       p1.setEdad(read.nextInt());
       System.out.println("Ingrese su sexo(H-hombre,M-mujer,O-otros");
       p1.setSexo(read.next());
       if (!p1.getSexo().equals("H")&& !p1.getSexo().equals("M") && !p1.getSexo().equals("O")){
            System.out.println("No ingreso un sexo valido.Ingrese nuevamente");
            p1.setSexo(read.next());
       }
       System.out.println("Ingrese su peso en kg");
       p1.setPeso(read.nextDouble());
       System.out.println("Ingrese su altura en metros");
       p1.setAltura(read.nextDouble());
       return p1; 
   }

    public Persona calcularIMC(Persona p1) {
        double calc = p1.getPeso() / (p1.getAltura() * p1.getAltura());
        if (calc < 20) {
            p1.setIMC(-1);
        } else if (calc >= 20 && calc <= 25) {
            p1.setIMC(0);
        } else {
            p1.setIMC(1);
        }
        return p1;
    }

    public Persona mayorDeEdad(Persona p1) {
        if (p1.getEdad() < 18) {
            p1.setMayor(false);
        } else {
            p1.setMayor(true);
        }
        return p1;
    }
}
