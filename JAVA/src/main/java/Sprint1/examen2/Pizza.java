package Sprint1.examen2;

public class Pizza extends Item{
    public Pizza() {
        super("Pizza", 7.9);
    }

    @Override
    protected void gift() {

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
