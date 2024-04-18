package Sprint1.Tasca7.Nivel1.Ejercicio1;

public class TreballadorOnline extends Treballador{
    private static final int INTERNET_COST = 5;
    private int salary;
    public TreballadorOnline(String name, String lastname, int priceHour) {
        super(name, lastname, priceHour);
    }
    @Override
    public void calculateSalary(int hours) {
        salary = hours*getPriceHour()+INTERNET_COST;
        System.out.println("Horas trabajadas : "+ hours + "\n Precio horas : "+ getPriceHour() + "\n Coste internet :" +
                INTERNET_COST + " \n Salario Total :" + salary);
    }

}
