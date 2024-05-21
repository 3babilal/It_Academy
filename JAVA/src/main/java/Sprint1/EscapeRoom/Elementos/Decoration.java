package Sprint1.EscapeRoom.Elementos;

public class Decoration extends Elementos{
    private final double tax = 1.21;
    private String material;

    private  double totalPrice;

    public Decoration(int id, String name, double price, String material) {
        super(id, name, price);
        this.material = material;
        //this.totalPrice = tax();
    }


    public double getTax() {
        return tax;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public  double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    protected double tax() {
        return getPrice()*tax;
    }
}
