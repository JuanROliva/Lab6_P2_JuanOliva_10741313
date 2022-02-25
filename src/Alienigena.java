
public class Alienigena {

    private String nombre, raza;
    private int edad;
    private boolean amenaza;

    public Alienigena() {
    }

    public Alienigena(String nombre, String raza, int edad, boolean amenaza) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.amenaza = amenaza;
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

    @Override
    public String toString() {
        return "Alien" + nombre;
    }
}
