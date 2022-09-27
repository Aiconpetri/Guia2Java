
package EjerciciosGuia2.Moldes;
public class Ahorcado {
    private String palabra[];
    private int intentos;
    private String completar [];
    private String ingresos[];
    private int longitud;
    private int adivinadas;        
    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int intentos, String[] completar, String[] ingresos, int longitud, int adivinadas) {
        this.palabra = palabra;
        this.intentos = intentos;
        this.completar = completar;
        this.ingresos = ingresos;
        this.longitud = longitud;
        this.adivinadas = adivinadas;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public void setCompletar(String[] completar) {
        this.completar = completar;
    }

    public void setIngresos(String[] ingresos) {
        this.ingresos = ingresos;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void setAdivinadas(int restantes) {
        this.adivinadas = restantes;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public int getIntentos() {
        return intentos;
    }

    public String[] getCompletar() {
        return completar;
    }

    public String[] getIngresos() {
        return ingresos;
    }

    public int getLongitud() {
        return longitud;
    }

    public int getAdivinadas() {
        return adivinadas;
    }  
}
