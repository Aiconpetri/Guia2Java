package Servicios;

import EjerciciosGuia2.Moldes.Cuenta;
import java.util.Scanner;

public class servicioCuenta {

    private Scanner read = new Scanner(System.in).useDelimiter("\n");
 public Cuenta iniciarCuenta(){
    int numeroCuenta=0;
    long DNI=0;
    int Saldo=0;
    String interes="10%";
    return new Cuenta(Saldo,interes,numeroCuenta,DNI);
}
    public Cuenta crearCuenta(Cuenta c1) {
        System.out.println("Ingrese su numero de cuenta");
        c1.setNumCuenta(read.nextInt());
        System.out.println("Ingrese su DNI");
        c1.setDNI(read.nextLong());
        return c1;
    }
    public Cuenta ingresarSaldo(Cuenta c1){
        System.out.println("¿Cuanto dinero desea ingresar?");
        int nSaldo=read.nextInt();
         c1.setSaldo(nSaldo+c1.getSaldo());
         System.out.println("Ingresando");
      return c1;
    }
    public Cuenta extraerSaldo(Cuenta c1){
        System.out.println("¿Cuanto dinero desea extraer?");
        int nSaldo=read.nextInt();
        if (nSaldo>c1.getSaldo()){
            System.out.println("Su saldo disponible es solo de $"+c1.getSaldo());
            System.out.println("Extrayendo");
            c1.setSaldo(0);
        }else{
         c1.setSaldo(c1.getSaldo()-nSaldo);
        System.out.println("Extrayendo");
        }
      return c1;
    }
    public Cuenta extraerRapido(Cuenta c1){
        System.out.println("¿Cuanto dinero desea extraer?");
        int nSaldo=read.nextInt();
        if (nSaldo<=c1.getSaldo()*0.2){
            System.out.println("Extrayendo");
            c1.setSaldo(c1.getSaldo()-nSaldo);
        }else
            System.out.println("Esta intentando extraer mas del 20% de su saldo, volviendo al menu");
      return c1;
    }
    public void consultarSaldo(Cuenta c1){
        System.out.println("Su saldo es $"+c1.getSaldo());
    }
    public void consultarDatos(Cuenta c1){
        System.out.println(c1);
    }
}
