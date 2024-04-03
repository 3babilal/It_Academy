package Sprint1.Tasca1.Nivel1.Ejercicio1;

abstract class Instrument {

    private String name;
    private int price;
    static String location = "dentro";

    public Instrument(String name, int price) {
        super();
        this.name = name;
        this.price = price;
        System.out.println("Dentro del Constructor clase Instrument");
    }
    {
        System.out.println("Dentro del bloque Inicializacion Instrument");
    }
    static {
        location = " ---- Dentro del bloque static Instrument----";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name= name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public abstract void play();
    @Override
    public String toString() {
        return "Instrument [nom=" + name + ", preu=" + price + "]";
    }


}