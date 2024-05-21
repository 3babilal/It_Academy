package Sprint3.Tasca1.Nivel2.Phone;

public class SpainPhone  implements Phone{
    private String number;
    private static final String idNumber = "34";

    public SpainPhone(String number) {
        this.number = number;
    }

    @Override
    public String getNumber() {
        return idNumber+this.number;
    }

    @Override
    public String toString() {
        return "SpainPhone{" +
                "number='" + number + '\'' +
                '}';
    }
}
