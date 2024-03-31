package Sprint1.Tasca1.Nivel1.Ejercicio1;

abstract class Instrument {

    private String nom;
    private int preu;
    static String ubicacion = "dentro";

    public Instrument(String nom, int preu) {
        super();
        this.nom = nom;
        this.preu = preu;
        System.out.println("Dentro del Constructor clase Instrument");
    }
    {
        System.out.println("Dentro del bloque Inicializacion Instrument");
    }
    static {
        ubicacion = " ---- Dentro del bloque static Instrument----";
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getPreu() {
        return preu;
    }
    public void setPreu(int preu) {
        this.preu = preu;
    }
    public abstract void tocar();
    @Override
    public String toString() {
        return "Instrument [nom=" + nom + ", preu=" + preu + "]";
    }


}