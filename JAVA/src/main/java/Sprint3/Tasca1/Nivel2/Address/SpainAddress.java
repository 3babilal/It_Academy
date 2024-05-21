package Sprint3.Tasca1.Nivel2.Address;

public class SpainAddress implements Address{
    String address;
    private static final String Country = "Spain ";

    public SpainAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddress() {
        return Country+this.address;
    }

    @Override
    public String toString() {
        return "SpainAddress{" +
                "address='" + address + '\'' +
                '}';
    }
}
