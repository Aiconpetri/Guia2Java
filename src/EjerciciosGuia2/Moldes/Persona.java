
package EjerciciosGuia2.Moldes;

public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
    private int IMC;
    private boolean Mayor;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura, int IMC,boolean Mayor) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.IMC= IMC;
        this.Mayor= Mayor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setIMC(int IMC) {
        this.IMC = IMC;
    }

    public void setMayor(boolean Mayor) {
        this.Mayor = Mayor;
    }
    

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getIMC() {
        return IMC;
    }

    public boolean getMayor() {
        return Mayor;
    }
    
}
