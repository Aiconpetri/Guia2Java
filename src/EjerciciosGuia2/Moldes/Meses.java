
package EjerciciosGuia2.Moldes;

public class Meses {
    private String vec[];
    private int num;
    public Meses() {
    }
    public Meses(String[] vec, int num) {
        this.vec = vec;
        this.num = num;
    }
    public void setVec(String[] vec) {
        this.vec = vec;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String[] getVec() {
        return vec;
    }

    public int getNum() {
        return num;
    }
}
