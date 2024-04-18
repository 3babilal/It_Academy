package Sprint1.Tasca7.Nivel1.Ejercicio1;

public class TreballadorPresencial extends Treballador{

    private static int gasoline = 3;
    private int salary;

    public TreballadorPresencial(String name, String lastname, int priceHour) {
        super(name, lastname, priceHour);
    }

    @Override
    public void calculateSalary(int hours) {
        salary = hours * getPriceHour()+gasoline;
        System.out.println("Horas trabajadas : "+ hours + "\n Precio horas : "+ getPriceHour() + "\n Coste internet :" +
                gasoline + " \n Salario Total :" + salary);
    }
}
