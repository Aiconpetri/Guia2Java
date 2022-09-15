package Servicios;

import EjerciciosGuia2.Moldes.Matematica;

public class ServicioMatematica {

    public double devolverMayor(Matematica m1) {
        double num;
        if (m1.getNum1() < m1.getNum2()) {
            num = m1.getNum2();
        } else {
            num = m1.getNum1();
        }
        return num;
    }

    public int calcularPotencia(Matematica m1) {
        int n1=(int) Math.round(m1.getNum1());
        int n2=(int) Math.round(m1.getNum2());
        int num;
        if (n1 < n2) {
            num=(int) Math.pow(n2, n1);
        }else{
            num=(int) Math.pow(n1, n2);
        }
        return num;
    }
    public double calculaRaiz(Matematica m1){
        double n1=Math.abs(m1.getNum1());
        double n2=Math.abs(m1.getNum2());
        double num;
        if (n1<n2){
            num=Math.sqrt(n1);
        }else{
            num=Math.sqrt(n2);
        }
        return num;
    }
}
