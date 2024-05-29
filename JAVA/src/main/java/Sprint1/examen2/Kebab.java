package Sprint1.examen2;

public class Kebab extends Item{
    public Kebab() {
        super("Kebab", 4.5);
    }

    @Override
    protected void gift() {

    }

    @Override
    public String toString() {
        return "Kebab{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
