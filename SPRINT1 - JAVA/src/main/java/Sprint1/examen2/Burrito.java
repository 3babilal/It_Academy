package Sprint1.examen2;

public class Burrito extends Item{

    public Burrito() {
        super("Burrito", 6.5);
        gift();
    }

    @Override
    protected void gift() {
        System.out.println("Pin");
    }

    @Override
    public String toString() {
        return "Burrito{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
