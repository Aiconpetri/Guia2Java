package EjerciciosGuia2;

import java.util.Date;
import java.util.Scanner;

public class Fechas {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una fecha");
        System.out.println("Ingrese el dia");
        int dia = read.nextInt();
        System.out.println("Ingrese el mes");
        int mes = read.nextInt();
        System.out.println("Ingrese el año");
        int anio = read.nextInt();
        Date fecha=new Date(anio-1900, mes-1,dia);
        System.out.println("Se muestra la fecha ingresada");
        System.out.println(fecha);
        System.out.println("Se muestra la fecha actual");
        Date hoy= new Date();
        System.out.println(hoy);
        if (fecha.getYear()<hoy.getYear()){
            System.out.println("La diferencia de años entre la fecha ingresada y la fecha actual es "+(hoy.getYear()-fecha.getYear()));
        }else{
           System.out.println("La diferencia de años entre la fecha ingresada y la fecha actual es "+(fecha.getYear()-hoy.getYear())); 
        } 
    }
}
