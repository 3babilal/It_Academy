package Sprint1.Tasca7.Nivel1.Ejercicio1;

abstract class Treballador {
    private String name;
    private String lastname;
    private int priceHour;

    public Treballador(String name, String lastname, int priceHour) {
        this.name = name;
        this.lastname = lastname;
        this.priceHour = priceHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getPriceHour() {
        return priceHour;
    }

    public void setPriceHour(int priceHour) {
        this.priceHour = priceHour;
    }
    public abstract void calculateSalary(int hours);
    @Override
    public String toString() {
        return "Treballador{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", priceHour=" + priceHour +
                '}';
    }
}
