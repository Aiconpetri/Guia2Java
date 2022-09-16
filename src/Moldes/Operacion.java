package EjerciciosGuia2.Moldes;

public class Operacion {

    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public int suma() {
        int s = numero1 + numero2;
        return s;
    }

    public int resta() {
        int r = numero1 - numero2;
        return r;
    }

    public int mult() {
        int m;
        if (numero1 == 0 || numero2 == 0) {
            m = 0;
            return m;
        } else {
            m = numero1 * numero2;
            return m;
        }
    }

    public double div() {
        double d;
        if (numero1 == 0 || numero2 == 0) {
            d = 0;
            return d;
        } else {
            double n1=numero1;
            double n2=numero2;
            d = n1 / n2;
            return d;
        }
    }
}
