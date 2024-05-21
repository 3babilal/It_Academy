package Sprint3.Tasca1.Nivel2.Address;

public class IrelandAddress implements Address{
    String address;
    private static final String Country = "Ireland ";

    public IrelandAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddress() {
        return Country+this.address;
    }

    @Override
    public String toString() {
        return "IrelandAddress{" +
                "address='" + address + '\'' +
                '}';
    }
}
