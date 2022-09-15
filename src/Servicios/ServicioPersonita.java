package Servicios;

import EjerciciosGuia2.Moldes.Personita;
import java.util.Date;
import java.util.Scanner;

public class ServicioPersonita {

    public Personita crearPersona() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su nombre");
        String nombre = read.next();
        System.out.println("Ingrese su fecha de nacimiento primero año, luego mes y luego dia");
        Date fecha = new Date(read.nextInt() - 1900, read.nextInt() - 1, read.nextInt());
        return new Personita(nombre, fecha, 0);
    }

    public Personita calcularEdad(Personita p1) {
        Date hoy = new Date();
        p1.setEdad(hoy.getYear() - p1.getNacimiento().getYear());
        return p1;
    }

    public boolean menorQue(int comp, Personita p1) {
        boolean es;
        es = p1.getEdad() < comp;
        return es;
    }

    public void mostrarPersona(Personita p1) {
        System.out.println(p1);
    }
}
