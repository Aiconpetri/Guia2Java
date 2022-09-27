
package EjerciciosGuia2.Moldes;


public class Persona {
   private String Nombre;
   private int edad;
   private String sexo;
   private double peso;
   private double altura;

    public Persona() {
    }

    public Persona(String Nombre, int edad, String sexo, double peso, double altura) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
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

    public String getNombre() {
        return Nombre;
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

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }

  
}
