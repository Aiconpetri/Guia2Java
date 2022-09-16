/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia2.Moldes;

/**
 *
 * @author Nahuel
 */
public class Cafetera {
    private int cMax;
    private int cAct;

    public Cafetera() {
    }

    public Cafetera(int cMax, int cAct) {
        this.cMax = cMax;
        this.cAct = cAct;   
    }
    public void setcMax(int cMax) {
        this.cMax = cMax;
    }

    public void setcAct(int cAct) {
        this.cAct = cAct;
    }

    public int getcMax() {
        return cMax;
    }

    public int getcAct() {
        return cAct;
    }
}
