
import java.util.ArrayList;

public class Explorador extends Alienigena {

    private ArrayList<Planeta> planetasExplorados = new ArrayList<Planeta>();
    private Planeta planetaFavotito;

    public Explorador() {
        super();
    }

    public Explorador(Planeta planetaFavotito, String nombre, String raza,
            int edad, boolean amenaza) throws Exception {
        super(nombre, raza, edad, amenaza);
        setPlanetaFavotito(planetaFavotito);
    }

    public ArrayList<Planeta> getPlanetasExplorados() {
        return planetasExplorados;
    }

    public void setPlanetasExplorados(ArrayList<Planeta> planetasExplorados) {
        this.planetasExplorados = planetasExplorados;
    }

    public Planeta getPlanetaFavotito() {
        return planetaFavotito;
    }

    public void setPlanetaFavotito(Planeta planetaFavotito) throws Exception {
        boolean condicion = validarPlanetaFavorito(planetaFavotito);
        if (!condicion) {
            throw new Exception("Este elemento no se encuentra entre los planetas explorados");
        }
        this.planetaFavotito = planetaFavotito;
    }

    public boolean validarPlanetaFavorito(Planeta p) {
        String nombrePlanetaVisitado = "";
        String nombrePlaneta;
        for (Planeta pE : planetasExplorados) {
            nombrePlanetaVisitado = pE.getNombrePlaneta();
            nombrePlaneta = p.getNombrePlaneta();
            if (nombrePlanetaVisitado.equals(nombrePlaneta)) {
                return true;
            }
        }
        return false;
    }
}
