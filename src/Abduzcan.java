
public class Abduzcan extends Alienigena {

    private int animalesAbducidos;

    public Abduzcan() {
        super();
    }

    public Abduzcan(int animalesAbducidos, String nombre, String raza, int edad, boolean amenaza) {
        super(nombre, raza, edad, amenaza);
        this.animalesAbducidos = animalesAbducidos;
    }

    public int getAnimalesAbducidos() {
        return animalesAbducidos;
    }

    public void setAnimalesAbducidos(int animalesAbducidos) {
        this.animalesAbducidos = animalesAbducidos;
    }

}
