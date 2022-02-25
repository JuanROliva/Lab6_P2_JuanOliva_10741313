
import java.util.ArrayList;

public class Conquistador extends Alienigena {

    private ArrayList<Planeta> planetasConquistados = new ArrayList();

    public Conquistador() {
        super();
    }

    public Conquistador(String nombre, String raza, int edad, boolean amenaza) {
        super(nombre, raza, edad, amenaza);
    }

    public ArrayList<Planeta> getPlanetasConquistados() {
        return planetasConquistados;
    }

    public void setPlanetasConquistados(ArrayList<Planeta> planetasConquistados) {
        this.planetasConquistados = planetasConquistados;
    }

}
