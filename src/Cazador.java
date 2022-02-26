
public class Cazador extends Alienigena {

    private int cantHumanosAtrapados;

    public Cazador() {
        super();
    }

    public Cazador(int cantHumanosAtrapados, String nombre, String raza, 
            int edad, boolean amenaza, Planeta planeta) {
        super(nombre, raza, edad, amenaza, planeta);
        this.cantHumanosAtrapados = cantHumanosAtrapados;
    }

    public int getCantHumanosAtrapados() {
        return cantHumanosAtrapados;
    }

    public void setCantHumanosAtrapados(int cantHumanosAtrapados) {
        this.cantHumanosAtrapados = cantHumanosAtrapados;
    }

}
