package Sprint1.Tasca6.Nivel1.Ejercicio1;

public class Bulding {
    private String name;
    private int price;
    private int yearConstruction;

    public Bulding(String name, int price, int yearConstruction){
        this.name = name;
        this.price = price;
        this.yearConstruction = yearConstruction;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getYearConstruction() {
        return yearConstruction;
    }
}
