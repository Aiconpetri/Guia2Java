
package EjerciciosGuia2.Moldes;

import java.util.Date;


public class Personita {
   private String nombre;
   private Date nacimiento;
   private int edad;

    public Personita() {
    }

    public Personita(String nombre, Date nacimiento, int edad) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Personita{" + "nombre=" + nombre + ", nacimiento=" + nacimiento + ", edad=" + edad + '}';
    }
   
}
