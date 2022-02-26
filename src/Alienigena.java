
public class Alienigena {

    private String nombre, raza;
    private int edad;
    private boolean amenaza;
    private Planeta planeta;

    public Alienigena() {
    }

    public Alienigena(String nombre, String raza, int edad, boolean amenaza, Planeta planeta) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.amenaza = amenaza;
        this.planeta = planeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isAmenaza() {
        return amenaza;
    }

    public void setAmenaza(boolean amenaza) {
        this.amenaza = amenaza;
    }

    public Planeta getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }

    @Override
    public String toString() {
        return "Alien" + nombre;
    }
}
