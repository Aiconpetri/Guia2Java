
package EjerciciosGuia2.Moldes;
public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    public double area(){
      double a=Math.PI*radio*radio;
        return a;
    }
    public double perimetro(){
        double p=2*Math.PI*radio;
        return p;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
}
