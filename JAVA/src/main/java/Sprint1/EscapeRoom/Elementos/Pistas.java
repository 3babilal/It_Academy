package Sprint1.EscapeRoom.Elementos;

public class Pistas extends Elementos{
    private final double tax = 1.10;
    private double totalPrice;
    private double time;
    private String theme;

    public Pistas(int id, String name, double price, double time, String theme) {
        super(id, name, price);
       // this.totalPrice = tax();
        this.time = time;
        this.theme = theme;
    }

    public double getTax() {
        return tax;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    protected double tax() {
       return totalPrice = getPrice()*tax;
    }
}
