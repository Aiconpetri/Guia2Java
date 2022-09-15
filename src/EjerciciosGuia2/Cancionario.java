package EjerciciosGuia2;

import EjerciciosGuia2.Moldes.Cancion;
import java.util.Scanner;

public class Cancionario {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        Cancion c1 = new Cancion("", "");
        System.out.println("Ingrese el nombre de la cancion");
        c1.setTitulo(read.next());
        System.out.println("Ingrese el autor de la cancion");
        c1.setAutor(read.next());
    }
}
