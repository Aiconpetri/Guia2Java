/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import EjerciciosGuia2.Moldes.Pruebita;

/**
 *
 * @author Nahuel
 */
public class ServicioPruebita {
    public int devolverMayor(Pruebita m1) {
        int num;
        if (m1.getNum1() < m1.getNum2()) {
            num = m1.getNum2();
        } else {
            num = m1.getNum1();
        }
        return num;
    }

    public int calcularPotencia(Pruebita m1) {
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
    public double calculaRaiz(Pruebita m1){
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
