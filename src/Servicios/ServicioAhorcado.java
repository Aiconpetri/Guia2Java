package Servicios;

import EjerciciosGuia2.Moldes.Ahorcado;
import java.util.Scanner;

public class ServicioAhorcado {

    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {
        boolean band;
        String palabra;
        do{
            band=true;
        System.out.println("Ingrese la palabra a adivinar");
        palabra = read.next();
            for (int i = 0; i < palabra.length(); i++) {
                if(Character.isLetter(palabra.charAt(i))==false){
                    band=false;
                    System.out.println("Ha ingresado un caracter invalido en la posicion "+i);
                    break;
                }
            }
        }while(band==false);
        String vecP[] = new String[palabra.length()];
        String vecC[] = new String[palabra.length()];
        String vecI[] = new String[palabra.length()*2];
        for (int i = 0; i < vecI.length; i++) {
            vecI[i]=".";
        }
        for (int i = 0; i < vecP.length; i++) {
            vecP[i] = palabra.substring(i, i + 1);
            vecC[i] = "_ ";
        }
        System.out.println("Ingrese la cantidad de errores");
        int intentos = read.nextInt();
        int longitud = palabra.length();
        int adivinadas = 0;
        return new Ahorcado(vecP, intentos, vecC, vecI, longitud, adivinadas);
    }
    public void longitud(Ahorcado a1) {
        System.out.println("La longitud de la palabra es " + a1.getLongitud());
    }
    public boolean seIngreso(Ahorcado a1,String letra){
        boolean band=false;
        for (int i = 0; i < a1.getIngresos().length; i++) {
            if(letra.equalsIgnoreCase(a1.getIngresos()[i])){
                band=true;
            }
        }
        return band;
    }
    public Ahorcado ingresos(Ahorcado a1, String letra,int cont) {
        a1.getIngresos()[cont] = letra;
        System.out.println("Se muestran las letras ya intentadas");
        for (int i = 0; i < a1.getIngresos().length; i++) {
            System.out.print("[" + a1.getIngresos()[i] + "]");
        }
        System.out.println("");
        return a1;
    }
    public Ahorcado buscar(Ahorcado a1, String letra) {
        int cont = 0;
        for (int i = 0; i < a1.getLongitud(); i++) {
            if (letra.equalsIgnoreCase(a1.getPalabra()[i])) {
                cont++;
                a1.getCompletar()[i] = letra;
            }
        }
        if (cont == 0) {
            System.out.println("La letra ingresada no se encontro en la palabra");
            a1.setIntentos(a1.getIntentos()-1);
        } else if(cont>1) {
            System.out.println("La letra se encontro " + cont + " veces en la palabra");
        }else{
            System.out.println("La letra se encontro 1 vez");
        }
        a1.setAdivinadas(a1.getAdivinadas() + cont);
        return a1;
    }
    public void completado(Ahorcado a1){
        System.out.println("Se muestra el progreso");
        for (int i = 0; i < a1.getLongitud(); i++) {
            System.out.print(""+a1.getCompletar()[i]);
        }
        System.out.println("");
    }

    public Ahorcado encontradas(Ahorcado a1) {
        if(a1.getAdivinadas()==1){
            System.out.println("Se ha encontrado 1 letra");
        }else{
        System.out.println("Se han encontrado " + a1.getAdivinadas() + " letras");
        }
        if (a1.getLongitud()-a1.getAdivinadas()==1){
            System.out.println("Falta encontrar una letra");
        }else{
        System.out.println("Faltan por encontrar " + (a1.getLongitud() - a1.getAdivinadas()) + " letras");
        }
        return a1;
    }
    public void intentos(Ahorcado a1){
        System.out.println("Le quedan "+a1.getIntentos()+" intentos");
    }
    public boolean juego(Ahorcado a1,int cont,String letra){
        boolean band=false;
        if (seIngreso(a1,letra)==false){
            longitud(a1);
            ingresos(a1,letra,cont);
            buscar(a1,letra);
            completado(a1);
            encontradas(a1);
            intentos(a1);
        }else{
            System.out.println("Ya ingreso esa letra se desconto un intento");
            a1.setIntentos(a1.getIntentos()-1);
        }
        if (a1.getIntentos()==0){
            System.out.println("Se ha quedado sin intentos");
        }
        if(a1.getAdivinadas()==a1.getLongitud()){
            System.out.println("Ha descubierto la palabra");
        }
        if (a1.getIntentos()==0 || a1.getAdivinadas()==a1.getLongitud() ){
            band=true;
        }
        return band;
    }
}
