
import java.util.ArrayList;

public class Planeta {

    private String nombrePlaneta;
    private boolean aguaPresente;
    private int tamanoPlaneta, temperaturaEnCelcius;
    private ArrayList<Alienigena> habitantes = new ArrayList<Alienigena>();

    public Planeta() {
    }

    public Planeta(String nombrePlaneta, boolean aguaPresente,
            int tamanoPlaneta, int temperaturaEnCelcius) {
        this.nombrePlaneta = nombrePlaneta;
        this.aguaPresente = aguaPresente;
        this.tamanoPlaneta = tamanoPlaneta;
        this.temperaturaEnCelcius = temperaturaEnCelcius;
    }

    public String getNombrePlaneta() {
        return nombrePlaneta;
    }

    public void setNombrePlaneta(String nombrePlaneta) {
        this.nombrePlaneta = nombrePlaneta;
    }

    public boolean isAguaPresente() {
        return aguaPresente;
    }

    public void setAguaPresente(boolean aguaPresente) {
        this.aguaPresente = aguaPresente;
    }

    public int getTamanoPlaneta() {
        return tamanoPlaneta;
    }

    public void setTamanoPlaneta(int tamanoPlaneta) {
        this.tamanoPlaneta = tamanoPlaneta;
    }

    public int getTemperaturaEnCelcius() {
        return temperaturaEnCelcius;
    }

    public void setTemperaturaEnCelcius(int temperaturaEnCelcius) {
        this.temperaturaEnCelcius = temperaturaEnCelcius;
    }

    public ArrayList<Alienigena> getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(ArrayList<Alienigena> habitantes) {
        this.habitantes = habitantes;
    }

    @Override
    public String toString() {
        return nombrePlaneta;
    }

    public boolean validarNombre(String nombre) {
        return nombre.toLowerCase().equals(this.nombrePlaneta);
    }

}
