package EjerciciosGuia2;

import EjerciciosGuia2.Moldes.Libro;
import Servicios.ServicioLibro;

public class Libreria {

    public static void main(String[] args) {
        ServicioLibro sl = new ServicioLibro();
        Libro libro1 = sl.crearLibro();
        System.out.println(libro1);
    }
}
