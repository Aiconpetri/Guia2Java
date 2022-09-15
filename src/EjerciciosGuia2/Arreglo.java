package EjerciciosGuia2;

import java.util.Arrays;

public class Arreglo {

    public static void main(String[] args) {
        double vectorA[] = new double[50];
        double vectorB[] = new double[20];
        System.out.println("Se llena el vector A y se imprime");
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = Math.random() * 10;
            System.out.print("[" + vectorA[i] + "]");
        }
        System.out.println("");
        System.out.println("Se ordena el vector de A");
        Arrays.sort(vectorA);
        System.out.println("Se llena el vector B y se imprime");
        for (int i = 0; i < vectorB.length; i++) {
            if (i < 10) {
                vectorB[i] = vectorA[i];
            } else {
                vectorB[i] = 0.5;
            }
            System.out.print("[" + vectorB[i] + "]");
        }
        System.out.println("");
        System.out.println("Se muestra el vector A ordenado");
        for (int i = 0; i < vectorA.length; i++) {
            System.out.print("[" + vectorA[i] + "]");

        }
        System.out.println("");
    }
}
