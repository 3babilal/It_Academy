package Sprint1.Tasca7.Nivel1.Ejercicio2;



public class TreballadorOnline extends Treballador {
    private static final int INTERNET_COST = 5;
    private int salary;
    public TreballadorOnline(String name, String lastname, int priceHour) {
        super(name, lastname, priceHour);
    }
    @Deprecated
    public void methodDeprecated(){
        System.out.println("Methodo obsoleto");
    }
    public void holidays() {
        System.out.println("Estas de Vacaciones");
    }
    @Override
    public void calculateSalary(int hours) {
        salary = hours*getPriceHour()+INTERNET_COST;
        System.out.println("Horas trabajadas : "+ hours + "\n Precio horas : "+ getPriceHour() + "\n Coste internet :" +
                INTERNET_COST + " \n Salario Total :" + salary);
    }

}
