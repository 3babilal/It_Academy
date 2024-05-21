package Sprint3.Tasca1.Nivel2.Phone;

public class IrelandPhone implements Phone{
    private String number;
    private static final String idNumber = "353";

    public IrelandPhone(String number) {
        this.number = number;
    }

    @Override
    public String getNumber() {
        return idNumber+this.number;
    }

    @Override
    public String toString() {
        return "IrelandPhone{" +
                "number='" + number + '\'' +
                '}';
    }
}
