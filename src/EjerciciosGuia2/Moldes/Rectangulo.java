
package EjerciciosGuia2.Moldes;


public class Rectangulo {
 
   private int base;
   private int altura;

    public Rectangulo() {
    }
   
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getBase() {
        return base;
    }
    public int getAltura() {
        return altura;
    }
    public int Superficie(){
        int s=base*altura;
        return s;
    }
    public int Perimetro(){
        int p=(base+altura)*2;
        return p;
    }
}
