
public class Raza {

    private Planeta planetaPrimordial;
    private String nombreRaza;

    public Raza() {
    }

    public Raza(Planeta planetaPrimordial, String nombreRaza) {
        this.planetaPrimordial = planetaPrimordial;
        this.nombreRaza = nombreRaza;
    }

    public Planeta getPlanetaPrimordial() {
        return planetaPrimordial;
    }

    public void setPlanetaPrimordial(Planeta planetaPrimordial) {
        this.planetaPrimordial = planetaPrimordial;
    }

    public String getNombreRaza() {
        return nombreRaza;
    }

    public void setNombreRaza(String nombreRaza) {
        this.nombreRaza = nombreRaza;
    }

    @Override
    public String toString() {
        return nombreRaza;
    }

    public boolean validarRaza(String raza) {
        return raza.toLowerCase().equals(this.nombreRaza);
    }

}
