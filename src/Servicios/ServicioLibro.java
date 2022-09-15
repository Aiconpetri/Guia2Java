package Servicios;

import EjerciciosGuia2.Moldes.Libro;
import java.util.Scanner;

public class ServicioLibro {

    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Libro crearLibro() {
        System.out.println("Ingrese el ISBN del libro");
        String ISBN = read.next();
        System.out.println("Ingrese el Titulo del libro");
        String Titulo = read.next();
        System.out.println("Ingrese el Autor del libro");
        String Autor = read.next();
        System.out.println("Ingrese la cantidad de paginas del libro");
        int Paginas = read.nextInt();
        return new Libro(ISBN, Titulo, Autor, Paginas);
    }
}
