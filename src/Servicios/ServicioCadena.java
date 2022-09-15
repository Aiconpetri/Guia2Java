
package Servicios;

import EjerciciosGuia2.Moldes.Cadena;
import java.util.Scanner;


public class ServicioCadena {
    Scanner read=new Scanner(System.in).useDelimiter("\n");
    public void mostrarVocales(Cadena c1){
        int cont=0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getFrase().substring(i, i+1).equals("a")|| c1.getFrase().substring(i, i+1).equals("e")|| c1.getFrase().substring(i, i+1).equals("i") || c1.getFrase().substring(i, i+1).equals("o")|| c1.getFrase().substring(i, i+1).equals("u")){
                cont++;
            }
        }
        System.out.println("La cantidad de vocales encontradas es "+cont);
    }
    public void invertirFrase(Cadena c1){
        System.out.println("Se muestra la frase al reves");
        for (int i = c1.getLongitud(); i > 0; i--) {
            System.out.print(c1.getFrase().substring(i-1, i));
        }
        System.out.println("");
    }
    public void vecesRepetido(Cadena c1){
        System.out.println("Ingrese una letra a buscar");
        int cont=0;
        String letra=read.next();
        letra=letra.toLowerCase();
        for (int i = 0; i <c1.getLongitud(); i++) {
            if (letra.equals(c1.getFrase().substring(i, i+1))){
                cont++;
            }
            
        }
        System.out.println("La letra "+letra+" se repite "+cont+" veces");
    }
    public void compararLongitud(Cadena c1){
        System.out.println("Ingrese una frase para comparar su longitud con la frase del objeto");
        String hola=read.next();
        if(hola.length()==c1.getLongitud()){
            System.out.println("Las dos frases tienen la misma longitud");
        }else if (hola.length()<c1.getLongitud()){
            System.out.println("La frase ingresada es mas corta que la del objeto");
        }else{
            System.out.println("La frase ingresada es mas larga que la del objeto");
        }
    }
    public void unirFrases(Cadena c1){
        System.out.println("Ingrese una nueva frase para unirla a la del objeto");
        String hola=read.next();
        System.out.println(c1.getFrase()+" "+hola);
    }
    public void reemplazar(Cadena c1){
        System.out.println("Ingrese un caracter para reemplazar las A");
        String letra=read.next();
        for (int i = 0; i < c1.getLongitud(); i++) {
            if(c1.getFrase().substring(i, i+1).equals("a")){
                System.out.print(letra);
            }else{
                System.out.print(c1.getFrase().substring(i, i+1)); 
            }     
        }
        System.out.println("");
    }
    public void contiene(Cadena c1){
        System.out.println("Ingrese una letra para ver si esta contenida");
        String letra=read.next();
        letra=letra.toLowerCase();
        boolean com=false;
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getFrase().substring(i, i+1).equals(letra)){
                com=true;
            }
        }
        if (com==true){
            System.out.println("La letra "+letra+" esta contenida en la frase");
        }else{
            System.out.println("La letra "+ letra+" no esta contenida en la frase");
        }
    }
}
