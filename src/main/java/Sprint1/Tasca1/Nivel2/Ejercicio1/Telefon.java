package Sprint1.Tasca1.Nivel2.Ejercicio1;

public class Telefon {
    private String marca;
    private String model;

    public Telefon(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
