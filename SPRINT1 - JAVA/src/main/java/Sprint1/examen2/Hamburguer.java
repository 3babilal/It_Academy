package Sprint1.examen2;

public class Hamburguer extends Item{
    public Hamburguer() {
        super("Hamburguer", 8.9);
        gift();
    }
    @Override
    protected void gift() {
        System.out.println("Gorra");
    }

    @Override
    public String toString() {
        return "Hamburguer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
