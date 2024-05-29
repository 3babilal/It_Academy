package Sprint1.Tasca2.Nivel1.Ejercicio1;

public class Producte {
    private String name;
    private int price;
    public Producte(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Producte [nom=" + name + ", preu=" + price + "]";
    }


}
