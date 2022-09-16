/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia2.Moldes;
public class Cuenta {
    private int numCuenta;
    private long DNI;
    private int Saldo;
    private String interes;

    public Cuenta() {
    }
public Cuenta(int Saldo, String interes, int numCuenta,long DNI){
    this.Saldo=Saldo;
    this.interes=interes;
    this.numCuenta = numCuenta;
        this.DNI = DNI;
}
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }
    

    public int getNumCuenta() {
        return numCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public int getSaldo() {
        return Saldo;
    }

    public String getInteres() {
        return interes;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numCuenta=" + numCuenta + ", DNI=" + DNI + ", Saldo=" + Saldo + ", interes=" + interes + '}';
    }

    
    
}
