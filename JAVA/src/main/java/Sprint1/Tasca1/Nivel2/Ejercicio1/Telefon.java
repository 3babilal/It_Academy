package Sprint1.Tasca1.Nivel2.Ejercicio1;

public class Telefon {
    private String brand;
    private String model;

    public Telefon(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String call(String phoneNumber){
        return "Estas trucant a " + phoneNumber;
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "marca='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
